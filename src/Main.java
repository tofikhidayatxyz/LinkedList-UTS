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
        service.addNode("Node 8");

        // loop to 30

        Node optNode = service.nodes.getFirst();

        for (int i = 0; i < 30; i++) {
            System.out.println(optNode.data);
            optNode = optNode.prev;
        }

        // each
        for (Node itm : service.nodes) {
            System.out.println("Data Node : " + itm.data);
            System.out.println("Prev Node : " + (itm.prev != null ? itm.prev.data : null));
            System.out.println("Next Node : " + (itm.next != null ? itm.next.data : null));
            System.out.println("==============================");
        }
    }
}
