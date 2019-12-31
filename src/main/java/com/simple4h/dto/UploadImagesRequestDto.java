package com.simple4h.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Objects;


public class UploadImagesRequestDto implements Serializable {

    private UploadImagesInputDto file = null;


    /**
     *
     **/
    public UploadImagesRequestDto file(UploadImagesInputDto file) {
        this.file = file;
        return this;
    }


    @ApiModelProperty(example = "null", value = "")
    @JsonProperty("file")
    public UploadImagesInputDto getFile() {
        return file;
    }

    public void setFile(UploadImagesInputDto file) {
        this.file = file;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UploadImagesRequestDto uploadImagesRequest = (UploadImagesRequestDto) o;
        return Objects.equals(file, uploadImagesRequest.file);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadImagesRequestDto {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    file: ").append(toIndentedString(file)).append("\n");
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

