package com.training.hw2.model;

public class Car implements Vehicle, Alarm {
    private String model;
    private String brand;
    private int year;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public int speedUp() {
        return 0;
    }

    @Override
    public int slowDown() {
        return 0;
    }

    @Override
    public String toString() {
        return "Showed car: " + this.getModel();
    }
}
