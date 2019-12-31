package com.simple4h.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Objects;


public class UploadImagesResponseResultDto implements Serializable {

    private String url = null;


    /**
     * url
     **/
    public UploadImagesResponseResultDto url(String url) {
        this.url = url;
        return this;
    }


    @ApiModelProperty(example = "null", value = "url")
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UploadImagesResponseResultDto uploadImagesResponseResult = (UploadImagesResponseResultDto) o;
        return Objects.equals(url, uploadImagesResponseResult.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadImagesResponseResultDto {\n");

        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

