package VariabilaMetoda;

import org.testng.annotations.Test;

public class StructuriAlternative {


    //structurile alternative=if-then-else;switch-case
    @Test
    public void MetodaTest() {
//        metodaVerificareNumar(7);
//        metodaVerificareNumar(3);
//        metodaVerificareNumar(5);

        //"CTRL + D" - shortcut care copiaza metoda
        //"CTR + /" - comenteaza liniile selectate

        metodaNumarParPoz(0);

        metodaNumarParPoz(4);
        metodaNumarParPoz(3);
        metodaNumarParPoz(-1);
        metodaNumarParPoz(-8);


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

}