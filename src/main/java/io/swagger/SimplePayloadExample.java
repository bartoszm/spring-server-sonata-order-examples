package io.swagger;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.configuration.JacksonConfiguration;
import io.swagger.model.*;
import org.threeten.bp.OffsetDateTime;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class SimplePayloadExample {
    public static void main(String[] args) {
        ProductOrderCreate order = new ProductOrderCreate();
        order.setRelatedParty(someRelatedParty());
        order.setExternalId(UUID.randomUUID().toString());
        order.setOrderVersion("1.0.0");
        order.setBuyerRequestDate(OffsetDateTime.now());
        order.setRequestedCompletionDate(OffsetDateTime.now());
        order.addOrderItemItem(item("uni1", "UNISpec"));
        order.addOrderItemItem(item("uni2", "UNISpec"));
        order.addOrderItemItem(item("eline", "ELineSpec"));
        order.setDesiredResponse(DesiredOrderResponses.CONFIRMATION_ONLY);
        order.setOrderActivity(OrderActivity.INSTALL);
        serialize(std(), order);
    }

    private static ProductOrderItemCreate item(String name, String spec) {
        return new ProductOrderItemCreate()
                .action(ProductActionType.INSTALL)
                .id(UUID.randomUUID().toString())
                .productOffering(new ProductOfferingRef().id(UUID.randomUUID().toString()))
                .product(product(name, spec));
    }

    private static Product product(String id, String spec) {
        return new Product()
                .productSpecification(
                        new ProductSpecificationRef()
                                .id(id)
                                .describing(new Describing().type(spec).schemaLocation("uri:mef:v1:" + spec))
                );
    }

    private static List<RelatedParty> someRelatedParty() {
        RelatedParty party = new RelatedParty();
        party.setEmailAddress("bartosz.michalik@amartus.com");
        party.setName("Bartosz");
        party.setId("bartoszm");
        party.setRole(Arrays.asList("dev", "empl"));
        party.setNumber("0112");
        return Collections.singletonList(party);
    }

    private static Writer std() {
        return new OutputStreamWriter(System.out);
    }

    private static <T> void serialize(Writer writer, T msg) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        mapper.registerModule(new JacksonConfiguration().threeTenModule());
        try {
            mapper.writerWithDefaultPrettyPrinter()
                    .writeValue(writer,msg);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }


}
