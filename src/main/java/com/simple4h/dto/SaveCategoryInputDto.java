package com.simple4h.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Objects;


public class SaveCategoryInputDto implements Serializable {

    private Integer id = null;
    private String name = null;
    private String keywords = null;
    private String description = null;
    private Integer pid = null;
    private String iconUrl = null;
    private String picUrl = null;
    private Integer level = null;
    private Integer sortOrder = null;


    /**
     * id，更新时候需要传入
     **/
    public SaveCategoryInputDto id(Integer id) {
        this.id = id;
        return this;
    }


    @ApiModelProperty(example = "null", value = "id，更新时候需要传入")
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    /**
     * 分类名称
     **/
    public SaveCategoryInputDto name(String name) {
        this.name = name;
        return this;
    }


    @ApiModelProperty(example = "null", value = "分类名称")
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     * 分类关键字，逗号隔开
     **/
    public SaveCategoryInputDto keywords(String keywords) {
        this.keywords = keywords;
        return this;
    }


    @ApiModelProperty(example = "null", value = "分类关键字，逗号隔开")
    @JsonProperty("keywords")
    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }


    /**
     * 分类广告语介绍
     **/
    public SaveCategoryInputDto description(String description) {
        this.description = description;
        return this;
    }


    @ApiModelProperty(example = "null", value = "分类广告语介绍")
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * 上级id，可以为空
     **/
    public SaveCategoryInputDto pid(Integer pid) {
        this.pid = pid;
        return this;
    }


    @ApiModelProperty(example = "null", value = "上级id，可以为空")
    @JsonProperty("pid")
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }


    /**
     * 分类图标
     **/
    public SaveCategoryInputDto iconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }


    @ApiModelProperty(example = "null", value = "分类图标")
    @JsonProperty("icon_url")
    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }


    /**
     * 分类图片
     **/
    public SaveCategoryInputDto picUrl(String picUrl) {
        this.picUrl = picUrl;
        return this;
    }


    @ApiModelProperty(example = "null", value = "分类图片")
    @JsonProperty("pic_url")
    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }


    /**
     * 层级
     **/
    public SaveCategoryInputDto level(Integer level) {
        this.level = level;
        return this;
    }


    @ApiModelProperty(example = "null", value = "层级")
    @JsonProperty("level")
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }


    /**
     * 排序，越大越靠前。0-100
     **/
    public SaveCategoryInputDto sortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }


    @ApiModelProperty(example = "null", value = "排序，越大越靠前。0-100")
    @JsonProperty("sort_order")
    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SaveCategoryInputDto saveCategoryInput = (SaveCategoryInputDto) o;
        return Objects.equals(id, saveCategoryInput.id) &&
                Objects.equals(name, saveCategoryInput.name) &&
                Objects.equals(keywords, saveCategoryInput.keywords) &&
                Objects.equals(description, saveCategoryInput.description) &&
                Objects.equals(pid, saveCategoryInput.pid) &&
                Objects.equals(iconUrl, saveCategoryInput.iconUrl) &&
                Objects.equals(picUrl, saveCategoryInput.picUrl) &&
                Objects.equals(level, saveCategoryInput.level) &&
                Objects.equals(sortOrder, saveCategoryInput.sortOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, keywords, description, pid, iconUrl, picUrl, level, sortOrder);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SaveCategoryInputDto {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
        sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
        sb.append("    picUrl: ").append(toIndentedString(picUrl)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
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

