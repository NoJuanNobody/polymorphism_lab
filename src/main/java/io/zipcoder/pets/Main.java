package io.zipcoder.pets;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by alejandrolondono on 5/4/16.
 */
public class Main {
    Scanner scanner = new Scanner(System.in);
    Pet[] pets;


    public void app(){
        System.out.println("How many pets do you have?");
        int petCount=scanner.nextInt();
        pets = new Pet[petCount];
        scanner.nextLine();
        System.out.println("What are their names? FORMAT: name_one name_two...name_n");
        String names = scanner.nextLine();
        String[] namesArr = this.splitNames(names);
        System.out.println(Arrays.toString(namesArr));
        for(int i=0; i<petCount; i++){
            pets[i] = new Pet(namesArr[i]);
        }
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
