package com.example.shoppinglistapp.model.entity;


import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category extends BaseEntity{

    @Enumerated(EnumType.STRING)
    private NameEnum name;
    @Column(name = "description")
    private String description;

    public Category() {
    }


    public NameEnum getName() {
        return name;
    }

    public void setName(NameEnum name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
