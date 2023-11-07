package br.com.infnet;

import Animals.Cat;
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
        Cat newCat = new Cat(
                "Mel",
                8,
                "calmo",
                FurType.SHORT,
                "Tricolor");
        System.out.println(newDog.getName());
    }
}
