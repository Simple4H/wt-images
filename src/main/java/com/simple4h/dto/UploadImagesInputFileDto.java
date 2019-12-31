package com.simple4h.dto;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;
import java.util.Objects;

/**
 * 文件
 **/

@ApiModel(description = "文件")

public class UploadImagesInputFileDto implements Serializable {


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UploadImagesInputFileDto uploadImagesInputFile = (UploadImagesInputFileDto) o;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadImagesInputFileDto {\n");

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

