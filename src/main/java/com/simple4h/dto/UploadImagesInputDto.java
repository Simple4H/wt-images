package com.simple4h.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Objects;


public class UploadImagesInputDto implements Serializable {

    private UploadImagesInputFileDto file = null;


    /**
     *
     **/
    public UploadImagesInputDto file(UploadImagesInputFileDto file) {
        this.file = file;
        return this;
    }


    @ApiModelProperty(example = "null", value = "")
    @JsonProperty("file")
    public UploadImagesInputFileDto getFile() {
        return file;
    }

    public void setFile(UploadImagesInputFileDto file) {
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
        UploadImagesInputDto uploadImagesInput = (UploadImagesInputDto) o;
        return Objects.equals(file, uploadImagesInput.file);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadImagesInputDto {\n");

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

