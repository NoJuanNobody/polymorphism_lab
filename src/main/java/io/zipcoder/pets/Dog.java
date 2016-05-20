package io.zipcoder.pets;

/**
 * Created by alejandrolondono on 5/5/16.
 */
public class Dog extends Pet implements Pet.Speakable {

    public String speak(){
        return "woof woof";
    }

   public Dog(String petName){
        name = petName;
   }


}
