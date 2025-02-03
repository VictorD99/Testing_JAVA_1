package VariabilaMetoda;

import org.testng.annotations.Test;

import java.util.Scanner;

public class Masina {

    public String marca;

    public String model;

    public Integer anFabricatie;

@Test
public void metodaTest(){
    dateMasina("Audi","Q3",2023);
    dateMasina("BMW","X5",2022);

    calculMedie(5.0,10.0);
    calculMedie(7.0,3.0);

    //citireNote();

}



    public void dateMasina(String param1, String param2, Integer param3){
        marca=param1;
        model=param2;
        anFabricatie=param3;

        System.out.println("Marca masinii este "+marca);
        System.out.println("Modelul masinii este "+model);
        System.out.println("Anul de fabricatie este: "+anFabricatie);




    }


    //Calculam media la 2 numere

    public void calculMedie(Double nota1, Double nota2){
    Double rezultat=(nota1+nota2)/2;
        System.out.println("Media celor 2 note este: "+rezultat);

    }

    //"Scanner" - citeste valori din terminal
    //cat timp satisfaci o conditie(linia 58)executi ce este in paranteze,cand nu mai este valabila conditia executi dupa paranteze

    /*public void citireNote() {
        Scanner scanner = new Scanner(System.in);
        int nota = scanner.nextInt();
        while (nota < 0 || nota > 10) {
            System.out.println("Nota " + nota + "trebuie sa fie intre 1 si 10.Te rog introdu o valoare valida");
            nota = scanner.nextInt();

        }
        System.out.println("Nota " + nota + " este intre 1 si 10");

    }*/


}
