package io.swagger.api;

import io.swagger.model.CancelProductOrder;
import io.swagger.model.CancelProductOrderCreate;
import io.swagger.model.ErrorRepresentation;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-25T18:12:48.389Z")

@Controller
public class CancelProductOrderApiController implements CancelProductOrderApi {

    private static final Logger log = LoggerFactory.getLogger(CancelProductOrderApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CancelProductOrderApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<CancelProductOrder> cancelProductOrderCreate(@ApiParam(value = "" ,required=true )  @Valid @RequestBody CancelProductOrderCreate cancelProductOrder) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json;charset=utf-8")) {
            try {
                return new ResponseEntity<CancelProductOrder>(objectMapper.readValue("{  \"requestedCancellationDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"cancellationReason\" : \"cancellationReason\",  \"@type\" : \"@type\",  \"productOrder\" : {    \"@referredType\" : \"@referredType\",    \"externalId\" : \"externalId\",    \"id\" : \"id\",    \"href\" : \"href\",    \"state\" : { },    \"version\" : \"version\"  },  \"id\" : \"id\",  \"href\" : \"href\",  \"state\" : { },  \"@schemaLocation\" : \"@schemaLocation\",  \"cancellationDeniedReason\" : \"cancellationDeniedReason\"}", CancelProductOrder.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json;charset=utf-8", e);
                return new ResponseEntity<CancelProductOrder>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CancelProductOrder>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<CancelProductOrder>> cancelProductOrderFind(@ApiParam(value = "") @Valid @RequestParam(value = "productOrderId", required = false) String productOrderId,@ApiParam(value = "") @Valid @RequestParam(value = "productOrderExternalId", required = false) String productOrderExternalId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json;charset=utf-8")) {
            try {
                return new ResponseEntity<List<CancelProductOrder>>(objectMapper.readValue("[ {  \"requestedCancellationDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"cancellationReason\" : \"cancellationReason\",  \"@type\" : \"@type\",  \"productOrder\" : {    \"@referredType\" : \"@referredType\",    \"externalId\" : \"externalId\",    \"id\" : \"id\",    \"href\" : \"href\",    \"state\" : { },    \"version\" : \"version\"  },  \"id\" : \"id\",  \"href\" : \"href\",  \"state\" : { },  \"@schemaLocation\" : \"@schemaLocation\",  \"cancellationDeniedReason\" : \"cancellationDeniedReason\"}, {  \"requestedCancellationDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"cancellationReason\" : \"cancellationReason\",  \"@type\" : \"@type\",  \"productOrder\" : {    \"@referredType\" : \"@referredType\",    \"externalId\" : \"externalId\",    \"id\" : \"id\",    \"href\" : \"href\",    \"state\" : { },    \"version\" : \"version\"  },  \"id\" : \"id\",  \"href\" : \"href\",  \"state\" : { },  \"@schemaLocation\" : \"@schemaLocation\",  \"cancellationDeniedReason\" : \"cancellationDeniedReason\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json;charset=utf-8", e);
                return new ResponseEntity<List<CancelProductOrder>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<CancelProductOrder>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CancelProductOrder> cancelProductOrderGet(@ApiParam(value = "",required=true) @PathVariable("CancelProductOrderId") String cancelProductOrderId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json;charset=utf-8")) {
            try {
                return new ResponseEntity<CancelProductOrder>(objectMapper.readValue("{  \"requestedCancellationDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"cancellationReason\" : \"cancellationReason\",  \"@type\" : \"@type\",  \"productOrder\" : {    \"@referredType\" : \"@referredType\",    \"externalId\" : \"externalId\",    \"id\" : \"id\",    \"href\" : \"href\",    \"state\" : { },    \"version\" : \"version\"  },  \"id\" : \"id\",  \"href\" : \"href\",  \"state\" : { },  \"@schemaLocation\" : \"@schemaLocation\",  \"cancellationDeniedReason\" : \"cancellationDeniedReason\"}", CancelProductOrder.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json;charset=utf-8", e);
                return new ResponseEntity<CancelProductOrder>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CancelProductOrder>(HttpStatus.NOT_IMPLEMENTED);
    }

}
