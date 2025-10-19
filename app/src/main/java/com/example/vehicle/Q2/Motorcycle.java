package com.example.vehicle.Q2;

class Motorcycle extends Vehicle
{
    Motorcycle(String name)
    {
        super(name);
    }

    @Override
    public String start()
    {
        return "motorcycle roar";
    }

    @Override
    public String accelerate()
    {
        return "accelerating motorcycle";
    }

    @Override
    public String stop()
    {
        return "motorcycle brakes";
    }
}