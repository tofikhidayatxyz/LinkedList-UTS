import uts.Node;
import uts.LinkService;

public class Main {

    /**
     * @args Nama : Tofik Hidayat
     * @args NIM : 20200040056
     */

    public static void main(String[] args) {

        LinkService service = new LinkService();

        // add new node
        service.addNode("Node 1");
        service.addNode("Node 2");
        service.addNode("Node 3");
        service.addNode("Node 4");
        service.addNode("Node 5");
        service.addNode("Node 6");
        service.addNode("Node 7");

        // each
        Node optNode = service.nodes.getFirst();

        for (int i = 0; i < 30; i++) {
            System.out.println(optNode.data);
            optNode = optNode.next;
        }
    }
}
