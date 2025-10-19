package com.example.vehicle.Q2;

class Car extends Vehicle
{
    Car(String name)
    {
        super(name);
    }

    @Override
    public String start()
    {
        return "engine is on";
    }

    @Override
    public String accelerate()
    {
        return "car is speeding up";
    }

    @Override
    public String stop()
    {
        return "car stopped";
    }
}
