package org.example.Calculator;

public class Calculator {
    public static float sum (float numberOne, float numberTwo){
        return numberOne + numberTwo ;
    }
    public static float subtrac (float numberOne, float numberTwo){
        return numberOne-numberTwo;
    }
    public static float multiply (float numberOne, float numberTwo){
        return numberOne*numberTwo;
    }
    public static float divide (float numberOne, float numberTwo){
        if (numberTwo == 0) {
            System.out.println("Error: No puedes dividir por cero.");
            return 0;}
        return numberOne/numberTwo;
    }
}
