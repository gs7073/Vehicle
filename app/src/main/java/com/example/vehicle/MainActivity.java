package com.example.vehicle;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

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

    abstract String start();

    abstract String accelerate();

    abstract String stop();
}

class Car extends Vehicle
{
    Car(String name)
    {
        super(name);
    }

    String start()
    {
        return "engine is on";
    }

    String accelerate()
    {
        return "car speeding up";
    }

    String stop()
    {
        return "car stopped";
    }
}

class Motorcycle extends Vehicle
{
    Motorcycle(String name)
    {
        super(name);
    }

    String start()
    {
        return "motorcycle roar";
    }

    String accelerate()
    {
        return "motorcycle zoom";
    }

    String stop()
    {
        return "motorcycle brakes";
    }
}

class Bicycle extends Vehicle
{
    Bicycle(String name)
    {
        super(name);
    }

    String start()
    {
        return "start pedaling";
    }

    String accelerate()
    {
        return "pedal faster";
    }

    String stop()
    {
        return "bike stopped";
    }
}

class ElectricCar extends Car
{
    ElectricCar(String name)
    {
        super(name);
    }

    @Override
    String accelerate()
    {
        return "silent electric boost";
    }
}

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       
    }
}
