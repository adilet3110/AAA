package com.company;

public class Main {

    public static void main(String[] args) {
        String name1 = "Adilet";
        String name2 = "Marat";
        String name3 = "Kanat";
        int age = 46;
        int temperature = 15;




        if ((age < 45 && age > 20) && (temperature > -20 && temperature < 30)) {
            System.out.printf("Go to walk " +name1);
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            System.out.printf("Go to walk " +name2 );
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            System.out.printf("Go to walk " + name3);
        }


    }
}
