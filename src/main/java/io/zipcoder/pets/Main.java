package io.zipcoder.pets;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by alejandrolondono on 5/4/16.
 */
public class Main {
    Scanner scanner = new Scanner();

    ArrayList<Pet> pets;

    public void app(){
        System.out.println("How many pets do you have?");
        int petCount=Integer.parseInt(scanner.nextLine());
        System.out.println("what are there names");
        ArrayList<String> names=null;
        for(int i=0;i>petCount; i++){

            if(i > 0) System.out.println("What is the next name?");
            scanner.nextLine();
            names.add(scanner.nextLine());
        }
        this.createPets(names);
    }

    public Pet[] createPets(ArrayList<String> names){
        for(){
            pets.add(new Pet(name))
        }
    }
}
