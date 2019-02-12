package com.bootcamp.game.model;


import javax.persistence.*;

@Entity
@Table(name="mods")
public class Mod extends Item {

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Item item;

    public Item getGame() {
        return item;
    }

    public void setGame(Item item) {
        this.item = item;
    }
}
