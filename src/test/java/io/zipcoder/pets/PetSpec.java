package io.zipcoder.pets;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by alejandrolondono on 5/5/16.
 */
public class PetSpec {

    String name;

    @Before
    public void Sandbox(){
        name = "Duchess";
    }

    @Test
    public void PetTest(){
        Pet duch = new Pet(name);
        String actualName = duch.getName();
        String expectedName = "Duchess";
        assertEquals("the name passed should have been saved", expectedName, actualName);
    }
}
