package com.bootcamp.game.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Game extends Item {

    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL)
    private Set<Mod> mods;

}
