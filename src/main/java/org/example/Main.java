package org.example;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       /* //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
}*/


        //citireNote();
        //printareValoriWhile();
        //printareValoriDoWhile();
        printareValoriFor();


    }
    //"Scanner" - citeste valori din terminal
    //cat timp satisfaci o conditie(linia 58)executi ce este in paranteze,cand nu mai este valabila conditia executi dupa paranteze

    public static void citireNote() {
        System.out.println("Introduceti nota: ");
        Scanner scanner = new Scanner(System.in);
        int nota = scanner.nextInt();
        while (nota < 0 || nota > 10) {
            System.out.println("Nota " + nota + " trebuie sa fie intre 1 si 10.Te rog introdu o valoare valida");
            nota = scanner.nextInt();

        }
        System.out.println("Nota " + nota + " este intre 1 si 10");
    }

    // WHILE
    // "while" - conditia este la inceput,cat timp conditia este adevarata executa
    // "do while" - executa cel putin o data si verifica la final conditia

    public static void printareValoriWhile() {
        int valoare = 6;
        while (valoare <= 5) {
            System.out.println("Valoarea este " + valoare);
            valoare++;
        }
        System.out.println("Valoarea dupa parcurgerea de 'while' este " + valoare);

    }

    // DO WHILE

    public static void printareValoriDoWhile() {
        int valoare = 6;
        do {
            System.out.println("Valoarea este egala cu " + valoare);
            valoare++;
        } while (valoare <= 5);
        System.out.println("Valoarea dupa parcurgerea de 'do while' este " + valoare);
    }

    // FOR (initializare,conditie,schimbare/implementare)-3 blocuri mici
    // folosit in general cand vrei sa incrementezi gradual, WHILE/ DO WHILE il folosesti daca ai o conditie anume

    public static void printareValoriFor() {
        //int valoare = 1;
        for (int valoare = 1; valoare <= 5; valoare++) {
            System.out.println("Valoarea este " + valoare);
        }
    }

}

