package io.zipcoder.pets;

/**
 * Created by alejandrolondono on 5/4/16.
 */
 public class Pet {
    protected String name;

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet(){}

    public Pet(String name){
        this.setName(name);
    }

    public String speak(){
        return "this is not a pet, it is just a tribute";
    }

    interface Speakable{ String speak();}

}
