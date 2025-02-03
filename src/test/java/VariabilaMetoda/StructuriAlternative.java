package VariabilaMetoda;

import org.testng.annotations.Test;

public class StructuriAlternative {


    //structurile alternative=if-then-else;switch-case
    @Test
    public void MetodaTest() {
//        metodaVerificareNumar(7);
//        metodaVerificareNumar(3);
//        metodaVerificareNumar(5);



        metodaNumarParPoz(0);

        metodaNumarParPoz(4);
        metodaNumarParPoz(3);
        metodaNumarParPoz(-1);
        metodaNumarParPoz(-8);

        zileSaptamana(3);


    }

    //verificam un numar >5
    public void metodaVerificareNumar(int Valoare) {
        if (Valoare > 5) {
            System.out.println("Numarul " + Valoare + " este mai mare decat 5");
        } else if (Valoare < 5) {
            System.out.println("Numarul " + Valoare + " este mai mic decat 5");
        } else {
            System.out.println("Numarul " + Valoare + " este egal cu 5");
        }
    }


    //"CTRL + D" - shortcut care copiaza metoda
    //"CTR + /" - comenteaza liniile selectate
    //"psvm" -public static void main
    //"CTR+ALT+L" - aranjeaza liniile de cod

    //verificam daca un numar este par pozitiv sau negativ
    public void metodaNumarParPoz(int Valoare) {
        if (Valoare > 0) {
            if (Valoare % 2 == 0) {
                System.out.println("Numarul " + Valoare + " este par pozitiv");
            } else {
                System.out.println("Numarul " + Valoare + " este impar pozitiv");
            }
        } else if (Valoare < 0) {
            if (Valoare % 2 == 0) {
                System.out.println("Numarul " + Valoare + " este par negativ");
            } else {
                System.out.println("Numarul " + Valoare + " este impar negativ");
            }
        } else if (Valoare == 0) {
            System.out.println("Numarul " + Valoare + " este 0");
        }
    }

    //if are conditii/switch are valoare, switch este mai rapid(sare direct in pas), switch mai bun pt meniuri si submeniuri
    //exemplu switch case
    public void zileSaptamana(Integer zi) {
        switch (zi) {
            case 1:
                System.out.println("Azi este luni");
                break;
            case 2:
                System.out.println("Azi este marti");
                break;
            case 3:
                System.out.println("Azi este miercuri");
                break;
            case 4:
                System.out.println("Azi este joi");
                break;
            default:
                System.out.println("Nu mai sunt zile");


        }
    }




}