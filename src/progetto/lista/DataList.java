package progetto.lista;

public class DataList<T>  {

    private Node<T> head;
    private int size;

    public DataList(){
        this.head = null;
        this.size = 0;
    }

    public int size(){
        return size;
    }

    public void insert(T data, String label){
        try{
            insertAt(0,data, label);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void insertAt(int position, T data, String label) throws ListException{
        if(position<0) throw new ListException();
        if(position==0){
            head = new Node<>(data,label,head);
        }else{
            Node<T> n = head;
            while(position-->1){
                n= n.getNext();
            }
            n.setNext(new Node<T>(data,label, n.getNext()));
        }
        size++;
    }

    public void removeHead() throws ListException{
        this.removeAt(0);
    }

    public void removeAt(int position) throws ListException{
        if(position < 0 || position>=size()) throw  new ListException();

        if(position==0)
            head = head.getNext();
        else{
            Node<T> n = head;
            while(position-->1){
                n = n.getNext();
            }
            n.setNext(n.getNext().getNext());
        }
        size--;
    }

    public int find(T data) throws ListException{
        Node<T> n = head;
        int i=0;
        while( !n.getData().equals(data)){
            n=n.getNext();
            if(++i > size()) throw new ListException();
        }
        return i;
    }

    public Node<T> getHead() throws ListException{
        return getAt(0);
    }

    public Node<T> getAt(int position) throws ListException{
        if(position < 0 || position>=size()) throw  new ListException();

        if(position==0)
            return head;
        else{
            Node<T> n = head;
            while(position-->1){
                n = n.getNext();
            }
            return n.getNext();
        }
    }
}
