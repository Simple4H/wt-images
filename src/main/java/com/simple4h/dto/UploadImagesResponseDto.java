package com.simple4h.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Objects;


public class UploadImagesResponseDto implements Serializable {

    private Integer code = null;
    private String msg = null;
    private UploadImagesResponseResultDto result = null;


    /**
     * 响应码，0为成功，其他为失败
     **/
    public UploadImagesResponseDto code(Integer code) {
        this.code = code;
        return this;
    }


    @ApiModelProperty(example = "null", value = "响应码，0为成功，其他为失败")
    @JsonProperty("code")
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }


    /**
     * 响应信息
     **/
    public UploadImagesResponseDto msg(String msg) {
        this.msg = msg;
        return this;
    }


    @ApiModelProperty(example = "null", value = "响应信息")
    @JsonProperty("msg")
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    /**
     *
     **/
    public UploadImagesResponseDto result(UploadImagesResponseResultDto result) {
        this.result = result;
        return this;
    }


    @ApiModelProperty(example = "null", value = "")
    @JsonProperty("result")
    public UploadImagesResponseResultDto getResult() {
        return result;
    }

    public void setResult(UploadImagesResponseResultDto result) {
        this.result = result;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UploadImagesResponseDto uploadImagesResponse = (UploadImagesResponseDto) o;
        return Objects.equals(code, uploadImagesResponse.code) &&
                Objects.equals(msg, uploadImagesResponse.msg) &&
                Objects.equals(result, uploadImagesResponse.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, msg, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadImagesResponseDto {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

