package VariabilaMetoda;

//1.Integer (int) Exercises

//Calculate the Perimeter of a Rectangle:
//Initialize two integers length and width with any values. Calculate and print the perimeter of a rectangle using these variables.

import org.testng.annotations.Test;

public class DataTypesExercises {

    public Integer lungime;
    public Integer latime;

    public Integer minute;

    public Integer latura;

    public Double raza;
    public Double inaltime;
    public Double pi;

    public Double fahrenheit;


    @Test
    public void metodatest(){

        calculPerimetru(10,5);

        calculSecunde(10);

        calculAria(5);

        calculVolumCilindru(5.0,8.0, Math.PI);

        calculCelsius(0.0);

    }

    public void calculPerimetru(Integer param1, Integer param2){
        lungime = param1;
        latime = param2;
    Integer rezultat=2*lungime + 2*latime;
        System.out.println("Lungimea dreptunghiului este: "+lungime);
        System.out.println("Latimea dreptunghiului este: "+latime);
        System.out.println("Perimetrul dreptunghiului este egal cu: "+rezultat);

    }

//Convert Minutes into Seconds:
//Initialize an integer minutes with any value. Convert this into seconds and print the result.

    public void calculSecunde(Integer param3){
        minute = param3;
    Integer rezultat=minute*60;
        System.out.println("Numarul de minute este: "+minute);
        System.out.println("Numarul de secunde este: "+rezultat);

    }

//Calculate the Area of a Square
//Initialize an integer side representing the side of a square. Calculate and print the area of the square.

    public void calculAria(Integer param4){
        latura=param4;
    Integer rezultat=latura*latura;
        System.out.println("Latura patratului este: "+latura);
        System.out.println("Aria patratului este: "+rezultat);

    }

//2.Double (double) Exercises

//Calculate the Volume of a Cylinder
//Initialize two doubles radius and height for a cylinder. Calculate and print the volume of the cylinder (use Math.PI for π).

    public void calculVolumCilindru(Double param5, Double param6, Double param7){
        raza=param5;
        inaltime=param6;
        pi=param7;
    Double rezultat=Math.PI *(raza*raza)*inaltime;
        System.out.println("Raza are valoarea: "+raza);
        System.out.println("Inaltimea are valoarea: "+inaltime);
        System.out.println("PI are valoarea: "+pi);
        System.out.println("Volumul cilindrului este: "+rezultat);

    }

//Convert Fahrenheit to Celsius
//Initialize a double fahrenheit with any value. Convert this to Celsius and print the result.

    public void calculCelsius(Double param8){
        fahrenheit=param8;
        Double rezultat=(fahrenheit-32)/1.8;
        System.out.println("Temperatura in grade Fahrenheit este: "+fahrenheit);
        System.out.println("Temperatura in grade Celsius este: "+rezultat);

    }

//Calculate the Hypotenuse of a Right-Angled Triangle
//Given the lengths of the two shorter sides of a right-angled triangle, calculate the length of the hypotenuse. Remember, the hypotenuse of a right-angled triangle can be found using Pythagoras theorem, which states that the square of the hypotenuse is equal to the sum of the squares of the other two sides.





}
