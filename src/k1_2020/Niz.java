package k1_2020;

import java.util.ArrayList;

public class Niz {
    ArrayList<String> lista;

    public Niz() {
        lista = new ArrayList<>();
    }

    public synchronized void uvecaj() {
        lista.add("#");
        System.out.print("BRZA  ");
        for (String i : lista)
            System.out.print("#");
        System.out.println();
    }

    public synchronized void smanji() {
        lista.remove("#");
        System.out.print("SPORA  ");
        for (String i : lista)
            System.out.print("#");
        System.out.println();
    }

    public boolean vrati() {
        boolean stanje = false;
        if (lista.size() == 6)
            stanje = true;
        return stanje;
    }
}
