package uts;

import java.util.LinkedList;


public class LinkService {
    public LinkedList<Node> nodes = new LinkedList<>();

    public void addNode(String name) {
        Boolean isAvailableToPrev = this.nodes.size() > 0;
        Node firsNode = this.nodes.size() > 0 ? this.nodes.get(0) : null;

        Node previousNode = isAvailableToPrev ? this.nodes.get(this.nodes.size() - 1) : null;

        this.nodes.add(new Node(name));
        Node currentNode = this.nodes.getLast();

        Node lastNode = isAvailableToPrev ? this.nodes.get(this.nodes.size() - 2) : null;
        if(firsNode != null) {
            firsNode.setPrev(currentNode);
            currentNode.setNext(firsNode);
        }
        if(lastNode != null) {
            lastNode.setNext(currentNode);
        }
        currentNode.setPrev(previousNode);
    }


}
