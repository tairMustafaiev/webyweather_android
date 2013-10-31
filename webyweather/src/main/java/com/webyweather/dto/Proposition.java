
package com.webyweather.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Proposition {

    private String comments;

    private String created;

    @JsonProperty("default")
    private String isDefault;

    private String id;

    private String image;

    private String image_thumb;

    private String rate;

    private String title;

    private String type;

    private String updated;

    public String getComments() {
        return this.comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getCreated() {
        return this.created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String isDefault() {
        return isDefault;
    }

    public void setDefault(String aDefault) {
        isDefault = aDefault;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage_thumb() {
        return this.image_thumb;
    }

    public void setImage_thumb(String image_thumb) {
        this.image_thumb = image_thumb;
    }

    public String getRate() {
        return this.rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUpdated() {
        return this.updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }
}
