package io.zipcoder.pets;

/**
 * Created by alejandrolondono on 5/4/16.
 */
public class Pet {
    private String name, type="any";

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet(String name){
        this.name = name;
    }

    public String speak(){
        return "this is not a pet, it is just a tribute";
    }
}
