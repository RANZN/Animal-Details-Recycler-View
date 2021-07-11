package com.ranzan.animaldetailsrecyclerview;

public class Animal {
    private String name;
    private String type;
    private String sound;
    private int imageId;

    public Animal(String name, String type, String sound, int imageId) {
        this.name = name;
        this.type = type;
        this.sound = sound;
        this.imageId = imageId;
    }


    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getSound() {
        return sound;
    }

    public int getImageId() {
        return imageId;
    }
}
