package com.training.hw2.model;

public enum MenuOptions {
    //    TODO rename constans
    z("Continue"), a("add car"), b("remove car"), c("show car"),
    d("sort car"), q("Quit");

    private String meaning;

    MenuOptions(String meaning) {
        this.meaning = meaning;
    }

    public String getMeaning() {
        return meaning;
    }
}

