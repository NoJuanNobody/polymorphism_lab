package io.zipcoder.pets;

/**
 * Created by alejandrolondono on 5/5/16.
 */
public class Chinchilla extends Pet implements Pet.Speakable {

    public String speak(){ return "I AM A CHINCHILLAAAAAA";}

    public Chinchilla(String petName){
        name = petName;
    }

}
