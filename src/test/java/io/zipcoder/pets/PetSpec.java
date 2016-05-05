package io.zipcoder.pets;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by alejandrolondono on 5/5/16.
 */
public class PetSpec {

    String name;
    Pet duch = new Pet(name);

    @Before
    public void Sandbox(){
        name = "Duchess";
        duch = new Pet(name);
    }

    @Test
    public void PetTest(){

        String actualName = duch.getName();
        String expectedName = "Duchess";
        assertEquals("the name passed should have been saved", expectedName, actualName);
    }
    @Test
    public void SetNameTest(){
        String previousName = duch.getName();
        duch.setName("Scooby Doo");
        String newName = duch.getName();
        boolean condition = previousName == newName;
        assertFalse("the name should not be the same ", condition);
    }

    @Test
    public void SpeakTest(){
        String actualSpeek = duch.speak();
        String expectedSpeech = "this is not a pet, it is just a tribute";
    }
}
