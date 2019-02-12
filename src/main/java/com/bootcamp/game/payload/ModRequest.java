package com.bootcamp.game.payload;

import javax.validation.constraints.NotNull;

public class ModRequest {
    @NotNull
    private String name;
    @NotNull
    private Long category;
    @NotNull
    private Long game;

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

    public Long getGame() {
        return game;
    }

    public void setGame(Long game) {
        this.game = game;
    }
}
