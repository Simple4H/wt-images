package com.simple4h.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Objects;

/**
 * 通用应答结构
 **/

@ApiModel(description = "通用应答结构")

public class CommonResponseDto implements Serializable {

    private Integer code = null;
    private String msg = null;


    /**
     * 响应码，0为成功，其他为失败
     **/
    public CommonResponseDto code(Integer code) {
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
    public CommonResponseDto msg(String msg) {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommonResponseDto commonResponse = (CommonResponseDto) o;
        return Objects.equals(code, commonResponse.code) &&
                Objects.equals(msg, commonResponse.msg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, msg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommonResponseDto {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
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

