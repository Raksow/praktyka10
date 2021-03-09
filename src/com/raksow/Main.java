package com.raksow;

public class Main
{
    public static void main(String[] args)
    {
        Square kwadrat = new Square(10);

        Triangle trojkat = new Triangle(3, 4, 5, 2.4);

        Rectangle prostokat = new Rectangle(3, 8);

        kwadrat.obliczObwod();
        kwadrat.obliczPole();

        System.out.println();

        trojkat.obliczObwod();
        trojkat.obliczPole();

        System.out.println();

        prostokat.obliczObwod();
        prostokat.obliczPole();
    }
}
