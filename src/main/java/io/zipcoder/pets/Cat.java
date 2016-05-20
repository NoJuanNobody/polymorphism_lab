package io.zipcoder.pets;

/**
 * Created by alejandrolondono on 5/5/16.
 */
public class Cat extends Pet implements Pet.Speakable{

    public String speak(){ return "Meow";}
    public Cat(String petName){
        name = petName;
    }

}
