package progetto;

import progetto.lista.DataList;
import progetto.lista.ListException;

public class DataTable<T> {

    private String title;
    private DataList<T> dati;

    /*costruttori*/
    public DataTable() {
        this.dati = new DataList<>();
        this.title = null;
    }

    public DataTable(String title) {
        this.dati = new DataList<>();
        this.setTitle(title);
    }

    public DataTable(DataList<T> l, String title) {
        this.setTitle(title);
        this.setDataList(l);
    }

    /*getter e setter*/

    public void setTitle(String titolo) {
        this.title = titolo;
    }

    private void setDataList(DataList<T> l ){
        this.dati = l;
    }

    @Override
    public String toString(){
        StringBuilder ris = new StringBuilder();
        ris.append(this.title);
        try {
            ris.append(":\n[");
            for (int i = 0; i < dati.size(); i++) {
                 ris.append(dati.getAt(i).toString());
                if(i!=dati.size()-1) ris.append(", ");
            }
            ris.append("]");
        }catch (ListException e){
            e.printStackTrace();
        }

        return new String(ris);
    }

    /*metodi*/
    public void insert(T data, String label){
        dati.insert(data,label);
    }




}
