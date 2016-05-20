package io.zipcoder.pets;

import java.util.Scanner;

/**
 * Created by alejandrolondono on 5/4/16.
 */
public class Main {
    Scanner scanner = new Scanner(System.in);
    Pet[] pets;


    public Pet[] app(){
        System.out.println("How many pets do you have?");
        int petCount=scanner.nextInt();
        int i = 0;
        while(i<petCount){
            System.out.println("What is the name of pet"+" "+(i+1));
            String petName = scanner.nextLine();
            scanner.nextLine();
            System.out.println("what is the type of your pet");
            String petType = scanner.nextLine();
            scanner.nextLine();
            switch(petType){

                case "Chinchilla":
                    pets[i] = new Chinchilla(petName);
                    break;
                case "Dog":
                    Dog currentPet = new Dog(petName);
                    break;
                case "Cat":
                    pets[i]= new Cat(petName);
                    break;
                default:
                    pets[i]= new Pet(petName);
                    break;
            }

            i++;
        }

        System.out.println(pets);
        return pets;
    }

    public String[] splitNames(String names){
        String[] namesArr = names.split(" ");
        return namesArr;
    }



    public static void main(String[] args) {
        Main main = new Main();

        main.app();

    }
}
