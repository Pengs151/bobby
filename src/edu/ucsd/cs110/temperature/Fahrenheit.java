package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float bob = (this.getValue() - 32);
        bob = ((bob *5) /9);

        return new Celsius(bob);
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit(value);
    }

    public String toString()
    {
        // TODO: Complete this method
        return this.getValue() + " F";
    }
}