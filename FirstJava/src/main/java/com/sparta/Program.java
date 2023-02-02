package com.sparta;

public class Program {


    public static String greeting(int timeOfDay) {
        String greeting;

        if(timeOfDay >= 0 && timeOfDay < 12) {
            greeting = "Good Morning";
        }
        else if(timeOfDay >= 12 && timeOfDay < 18){
            greeting = "Good afternoon!";
        }
        else if(timeOfDay >= 18 && timeOfDay <= 23){
            greeting = "Good evening";
        }
        else {
            return "Please enter a valid number";
        }

        return greeting;
    }

    public static void main(String[] args) {

        String result = greeting(26);
        System.out.println(result);

    }
}
