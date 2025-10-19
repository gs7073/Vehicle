package com.example.vehicle.Q2;

abstract class Vehicle
{
    String name;

    Vehicle(String name)
    {
        this.name = name;
    }

    String getName()
    {
        return name;
    }

    public abstract String start();

    public abstract String accelerate();

    public abstract String stop();
}
