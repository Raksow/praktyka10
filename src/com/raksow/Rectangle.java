package com.raksow;

public class Rectangle implements Figura
{
    int bok_a;
    int bok_b;

    public Rectangle(int bok_a, int bok_b)
    {
        this.bok_a = bok_a;
        this.bok_b = bok_b;
    }

    @Override
    public void obliczPole()
    {
        System.out.println(bok_a * bok_b);
    }

    @Override
    public void obliczObwod()
    {
        System.out.println((bok_a * 2) + (bok_b *2));
    }
}
