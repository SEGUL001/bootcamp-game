package com.bootcamp.game.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Game extends Item {

    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL)
    private Set<Mod> mods;

    public Set<Mod> getMods() {
        return mods;
    }

    public void setMods(Set<Mod> mods) {
        this.mods = mods;
    }
}
