package br.com.infnet;

import static org.junit.jupiter.api.Assertions.*;

import Animals.Cat;
import Animals.Dog;
import enums.FurType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class AppTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(AppTest.class);
    @Test
    @DisplayName("Create Class Animals")
    public void createAnimals(){
        LOGGER.info("Teste class animals");
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

        //Criadas corretamente
        assertNotNull(newDog);
        assertNotNull(newCat);

        assertEquals("Biscoito", newDog.getName());
        assertEquals(FurType.SHORT, newCat.getFur());
    }
    @Test@DisplayName("Create Class Client")@Disabled("Not create")
    public void createClient(){

    }
}
