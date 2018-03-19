package test;

import java.util.List;

public class TabellaDati<T,String> {

    private String titolo;
    List<T> dati;
    List<String> etichette;

    /*costruttori*/

    public TabellaDati(){ }

    public TabellaDati(List<T> listaDati, List<String> listaEtichette) {
        this.setDati(listaDati);
        this.setEtichette(listaEtichette);
    }

    public TabellaDati(List<T> listaDati, List<String> listaEtichette, String titolo) {
        this.setDati(listaDati);
        this.setEtichette(listaEtichette);
        this.setTitolo(titolo);
    }

    public TabellaDati(List<T> listaDati) {
        this.setDati(listaDati);
    }

    public TabellaDati(List<T> listaDati, String titolo) {
        this.setDati(listaDati);
        this.setTitolo(titolo);
    }

    /*getter e setter*/

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    private void setDati(List<T> dati) {
        this.dati = dati;
    }

    private void setEtichette(List<String> etichette) {
        this.etichette = etichette;
    }

    public String getTitolo() {
        return titolo;
    }

    public List<T> getDati() {
        return dati;
    }

    public List<String> getEtichette() {
        return etichette;
    }

    /*metodi*/


}
