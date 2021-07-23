package com.training.hw2.model;

public interface Alarm {

    default void turnAlarmOn() {
        System.out.println("AlarmOn");
    }

    default void turnAlarmOff() {
        System.out.println("AlarmOff");
    }
}
