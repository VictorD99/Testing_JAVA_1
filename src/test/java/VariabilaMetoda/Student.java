package VariabilaMetoda;

import org.testng.annotations.Test;

public class Student {

    //clasa=sablon care defineste proprietatile si comportamentul unei entitati specifice

    //intr-un fisier Java putem avea mai multe clase diferentiate pe baza numelui ( nu este un practice bun
    // sa avem mai multe clase cu acelasi nume

    //intr-o clasa putem defini proprietatile si actiunile entitatii

    //variabila=proprietatea unei clase

    //variabilele pot fi de 2 feluri: globale si locale

    //variabilelele globale = sunt vizibile peste tot in proiect

    //variabilele locale = sunt vizibile doar in locul unde le-am declarat

    //ca sa definim o variabila globala: accesscontrol (public) tip variabila nume variabila

    //cand definim o variabila nu este obligatoriu sa ii dam o valoare

    //metoda = actiunea unei clase

    //exista 2 tipuri de metode:void si return

    // VOID executa actiunea si iti da posibilitatea sa vezi rezultatul(actiunea te deplasezi la curs,rezultatul esti prezent)
    // RETURN executa actiunea si o returneaza doar pt noi(stii ca in 15 iei salariul,adica se executa actiunea si mi se returneaza mie,ce decid mai departe depinde de mine)



    public String Nume;

    public String Prenume;

    public Integer Varsta;

    public String Adresa;

    public Double Inaltime;

    public Float Greutate;

    public Character Sex;

    public Boolean AreDiploma;


    // lectia 2
    // conventie in Java numele la metoda si variabila cu litera mica
    // la metoda se pune dupa nume set paranteze() si {}-reprezinta body-ul metodei si se pune codul
    // STRING primeste valoare cu " "
    // INTEGER primeste valoare fara " ",punem doar numarul
    // DOUBLE primeste valori cu zecimala, cu punct
    // FLOAT primeste valori cu zecimala,trebuie pus un f la final
    // CHARACTER suporta un singur caracter, primeste valoare cu ' '
    // println afiseaza informatia si sare la randul urmator


    @Test
    public void prezentareStudent(){
    Nume="Andrei";
    Prenume="Victor";
    Varsta=40;
    Adresa="Tei";
    Inaltime=1.73;
    Greutate=88.0f;
    Sex='M';
    AreDiploma=true;

    //System.out.println(Nume+" "+Prenume+" "+Varsta+" "+Adresa);
    //System.out.println(Inaltime);

        System.out.println("Numele studentului este: "+Nume);
        System.out.println("Prenumele studentului este: "+Prenume);
        System.out.println("Varsta studentului este: "+Varsta);
        System.out.println("Adresa studentului este: "+Adresa);
        System.out.println("Inaltimea studentului este: "+Inaltime);
        System.out.println("Greutatea studentului este: "+Greutate);
        System.out.println("Sexul studentului este: "+Sex);
        System.out.println("Are diploma studentul? "+AreDiploma);

        calculMedie();
    }

public void calculMedie(){
    Integer nota1=8;
    Integer nota2=9;
    Integer nota3=10;
    Integer medie=(nota1+nota2+nota3)/3;
    System.out.println("Media studentului este: "+medie);

}


}
