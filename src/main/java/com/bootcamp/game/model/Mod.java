package com.bootcamp.game.model;


import javax.persistence.*;

@Entity
@Table(name="mods")
public class Mod extends Item {

    @ManyToOne
    @JoinColumn
    private Game game;

}
