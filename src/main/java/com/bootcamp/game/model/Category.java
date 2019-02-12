package com.bootcamp.game.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Category extends BaseEntity {

    @NotNull
    private String webDescription;

    @NotNull
    private String mobileDescription;

    public String getWebDescription() {
        return webDescription;
    }

    public void setWebDescription(String webDescription) {
        this.webDescription = webDescription;
    }

    public String getMobileDescription() {
        return mobileDescription;
    }

    public void setMobileDescription(String mobileDescription) {
        this.mobileDescription = mobileDescription;
    }
}
