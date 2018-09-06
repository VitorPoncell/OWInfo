package com.poturno.vitor.owinfo.model;

import android.graphics.Bitmap;

import java.util.ArrayList;

public class Hero {
    private String id;
    private String name;
    private String description;
    private String health;
    private String armour;
    private String realName;
    private String age;
    private String height;
    private String affiliation;
    private String baseOfOperations;
    private String difficulty;
    private String url;
    private String role;
    private ArrayList<String> subRoles;
    private ArrayList<Ability> abilities;
    private Bitmap portraitIcon;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ArrayList<String> getSubRoles() {
        return subRoles;
    }

    public void setSubRoles(ArrayList<String> subRoles) {
        this.subRoles = subRoles;
    }

    public ArrayList<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(ArrayList<Ability> abilities) {
        this.abilities = abilities;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getArmour() {
        return armour;
    }

    public void setArmour(String armour) {
        this.armour = armour;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public String getBaseOfOperations() {
        return baseOfOperations;
    }

    public void setBaseOfOperations(String baseOfOperations) {
        this.baseOfOperations = baseOfOperations;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Bitmap getPortraitIcon() {
        return portraitIcon;
    }

    public void setPortraitIcon(Bitmap portraitIcon) {
        this.portraitIcon = portraitIcon;
    }
}
