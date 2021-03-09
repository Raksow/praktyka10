package com.raksow;

public class Square implements Figura
{
    int bok;

    public Square(int bok)
    {
        this.bok = bok;
    }

    @Override
    public void obliczPole()
    {
        System.out.println(bok * bok);
    }

    @Override
    public void obliczObwod()
    {
        System.out.println(bok * 4);
    }
}
