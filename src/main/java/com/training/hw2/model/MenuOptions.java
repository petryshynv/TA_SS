package com.training.hw2.model;

public enum MenuOptions {

    z("Continue"), a("add car"), b("remove car"), c("show car"),
    d("sort car"), e("show car by model"), q("Quit");

    private String meaning;

    MenuOptions(String meaning) {
        this.meaning = meaning;
    }

    public String getMeaning() {
        return meaning;
    }
}

