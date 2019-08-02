package com.juan.AppDron;

import java.util.Scanner;

public class AppDron {



    public static void main(String[] args){
        FlyingObject drone = new Drone();
        String fileLocation;
        Scanner reader = new Scanner(System.in);
        System.out.println("Command file location: ");
        fileLocation = reader.next();

        DocReader documentReader = new DocReader(fileLocation);




    }
}
