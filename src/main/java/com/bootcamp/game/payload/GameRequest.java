package com.bootcamp.game.payload;

import javax.validation.constraints.NotNull;

public class GameRequest {
    @NotNull
    private String name;
    @NotNull
    private Long category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCategory() {
        return category;
    }

    public void setCategory(Long category) {
        this.category = category;
    }
}
