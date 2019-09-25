package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Free form text to clarify or explain the order.
 */
@ApiModel(description = "Free form text to clarify or explain the order.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-25T18:12:48.389Z")

public class Note   {
  @JsonProperty("text")
  private String text = null;

  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("author")
  private String author = null;

  public Note text(String text) {
    this.text = text;
    return this;
  }

  /**
   * The text of the note
   * @return text
  **/
  @ApiModelProperty(required = true, value = "The text of the note")
  @NotNull


  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Note date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * The date of the note. Format is YYYY-MM-DDThh:mmTZD (e.g. 1997-07-16T19:20+01:00).
   * @return date
  **/
  @ApiModelProperty(required = true, value = "The date of the note. Format is YYYY-MM-DDThh:mmTZD (e.g. 1997-07-16T19:20+01:00).")
  @NotNull

  @Valid

  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public Note author(String author) {
    this.author = author;
    return this;
  }

  /**
   * The author of the note
   * @return author
  **/
  @ApiModelProperty(required = true, value = "The author of the note")
  @NotNull


  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Note note = (Note) o;
    return Objects.equals(this.text, note.text) &&
        Objects.equals(this.date, note.date) &&
        Objects.equals(this.author, note.author);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, date, author);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Note {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

