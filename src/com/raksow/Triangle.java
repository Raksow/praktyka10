package com.raksow;

public class Triangle implements Figura
{
    int bok_a;
    int bok_b;
    int bok_c;
    double wysokosc;

    public Triangle(int bok_a, int bok_b, int bok_c, double wysokosc)
    {
        this.bok_a = bok_a;
        this.bok_b = bok_b;
        this.bok_c = bok_c;
        this.wysokosc = wysokosc;
    }

    @Override
    public void obliczPole()
    {
        System.out.println(bok_a * wysokosc / 2);
    }

    @Override
    public void obliczObwod()
    {
        System.out.println(bok_a + bok_b + bok_c);
    }
}
