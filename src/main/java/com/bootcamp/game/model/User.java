package com.bootcamp.game.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User extends BaseNamedEntity {

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "UserItem",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "item_id", referencedColumnName = "id"))
    private Set<Item> items;

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }
}
