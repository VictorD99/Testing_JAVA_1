package Multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Multimi {

    //multimi: array, list, map  / dc vrem sa reprezentam o multime in programare toate elementele din multime trebuie sa fie de acelasi fel

    @Test
    public void metodaTest() {

//        colegiCurs();
//        colegiCursLista();
//        categoriiObiecte();
        tariOrase();

    }

    //exemplu array / parantezel [] reprezinta ca vrei sa definesti o multime folosind array
    //multimea[pozitia]=valoarea  / pe multime o intereseaza pozitia, cunosc pozitia accesez valoarea(valabil pt array, list, map) /
    //"length" este doar pt array

    public void colegiCurs() {
        String[] colegi = new String[6];
        colegi[0] = "Ana";
        colegi[1] = "Maria";
        colegi[2] = "Andrei";
        colegi[3] = "Erica";
        colegi[4] = "Mihai";
        colegi[5] = "Alex";

        for (int index = 0; index < colegi.length; index++) {
            System.out.println("Numele colegului este: " + colegi[index]);
        }

    }

    //exemplu lista // lista aloca dinamic in functie de cate elemente adaugi
    //"size" este doar pt lista

    public void colegiCursLista() {
        List<String> colegi = new ArrayList<>();
        colegi.add("Ana");
        colegi.add("Maria");
        colegi.add("Andrei");
        colegi.add("Erica");
        colegi.add("Mihai");
        colegi.add("Alex");

        int index = 0;
        while (index < colegi.size()) {
            System.out.println("Numele colegului este: " + colegi.get(index));
            index++;
        }
    }

    //exemplu map / incearca sa mapeze valoarea la o anumita categorie // cheie(categoria) = valoare(obiectul din categorie)
    public void categoriiObiecte() {
        HashMap<String, String> obiecte = new HashMap<>();
        obiecte.put("obiect", "laptop");
        obiecte.put("fruct", "mar");
        obiecte.put("floare", "trandafir");
        for (String key : obiecte.keySet()) {            //pt fiecare cheie din lista de chei -
            System.out.println("Cheia este: " + key);
            System.out.println("Valoarea este: " + obiecte.get(key));
        }
    }

    //exemplu map cu mai multe valori
    public void tariOrase() {
        HashMap<String, List<String>> clasificare = new HashMap<>();

        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Cluj");
        oraseRomania.add("Iasi");
        oraseRomania.add("Bucuresti");

        List<String> oraseItalia = new ArrayList<>();
        oraseItalia.add("Milano");
        oraseItalia.add("Roma");
        oraseItalia.add("Venetia");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Madrid");
        oraseSpania.add("Barcelona");
        oraseSpania.add("Valencia");

        clasificare.put("Romania", oraseRomania);
        clasificare.put("Italia", oraseItalia);
        clasificare.put("Spania", oraseSpania);

        for (String key : clasificare.keySet()) {
            System.out.println("Tara este: " + key);
            System.out.println("Orasele sunt: " + clasificare.get(key));
        }


    }

}




