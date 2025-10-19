package com.example.vehicle.Q2;

class Bicycle extends Vehicle
{
    Bicycle(String name)
    {
        super(name);
    }

    @Override
    public String start()
    {
        return "start pedaling";
    }

    @Override
    public String accelerate()
    {
        return "pedal faster";
    }

    @Override
    public String stop()
    {
        return "bike stopped";
    }
}