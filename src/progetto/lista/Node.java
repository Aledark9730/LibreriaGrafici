package progetto.lista;

public class Node<T> {
    private T data;
    private String label;
    private Node<T> next = null;

    public Node(T data, String label, Node<T> next) {
        this.data = data;
        this.label = label;
        this.next = next;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString(){
        return "["+this.label+ ": " + this.data+"]";
    }
}
