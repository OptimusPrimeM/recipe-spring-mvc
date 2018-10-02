package com.optimusprime.recipespringmvc.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long id;

    private String description;
    private byte prepTime;
    private byte cookTime;
    private byte servings;
    private String source;
    private String urls;
    private String directions;

    /*
    todo add
    private Difficulty difficulty;
    */

    @Lob
    private Byte[] images;

    @OneToOne(cascade = CascadeType.ALL)
    private Notes notes;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
    private Set<Ingredient> ingredientSet;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(byte prepTime) {
        this.prepTime = prepTime;
    }

    public byte getCookTime() {
        return cookTime;
    }

    public void setCookTime(byte cookTime) {
        this.cookTime = cookTime;
    }

    public byte getServings() {
        return servings;
    }

    public void setServings(byte servings) {
        this.servings = servings;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getUrls() {
        return urls;
    }

    public void setUrls(String urls) {
        this.urls = urls;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public Byte[] getImages() {
        return images;
    }

    public void setImages(Byte[] images) {
        this.images = images;
    }

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }
}
