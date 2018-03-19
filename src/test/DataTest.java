package test;

import progetto.DataTable;

public class DataTest {
    public static void main(String[] args){


        DataTable<Integer> dt = new DataTable<>("TABELLA");

        dt.insert(3,"tre");
        dt.insert(10,"dieci");

        System.out.println(dt);


    /*
        Dati d = new Dati(); //overload di costruttore

        //TABELLA DATI
        d.addDati( Array dati(numeri) , array stringhe ); //overload di questo metodo
        d.addDati( Classe <implement printable> );


        //TABELLA DATI 2
        ListaDati<Integer, String> l = new ListaDati<>();


        d.setTitle(String titolo);
        d.addEtichetteAssi( String etichettay, String etichettax);


        //grafici
        d.graficoTorta();
        d.istogramma();
        d.linee();
        d.punti();
    */
    }

}
