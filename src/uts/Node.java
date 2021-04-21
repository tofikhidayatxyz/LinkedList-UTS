package uts;

public class Node {
    public String data =  null;
    public Node next = null;
    public Node prev = null;

    public Node(String data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

}
