package br.com.infnet;

import Animals.Dog;
import enums.FurType;

public class App
{
    public static void main( String[] args )
    {
        Dog newDog = new Dog(
                "Biscoito",
                8,
                "calmo",
                FurType.MEDIUM,
                "branco");
        System.out.println(newDog.getName());
    }
}
