import controllers.Graph;
import models.Node;

public class App {
    public static void main(String[] args) throws Exception {
        Graph grafo = new Graph();

        Node n0 = grafo.addNode(0);
        Node n5 = grafo.addNode(5);
        Node n1 = grafo.addNode(1);
        Node n3 = grafo.addNode(3);
        Node n2 = grafo.addNode(2);
        Node n4 = grafo.addNode(4);
        Node n7 = grafo.addNode(7);
        Node n9 = grafo.addNode(9);
        Node n8 = grafo.addNode(8);

        grafo.addEdge(n0, n1);
        grafo.addEdge(n0, n5);
        grafo.addEdge(n0, n3);
        
        grafo.addEdge(n3, n2);
        grafo.addEdge(n3, n0);
        grafo.addEdge(n3, n4);
        grafo.addEdge(n3, n9);
        grafo.addEdge(n3, n7);
        
        grafo.addEdge(n1, n0);
        grafo.addEdge(n1, n2);
        grafo.addEdge(n1, n4);
        grafo.addEdge(n1, n8);
        
        grafo.addEdge(n2, n3);
        grafo.addEdge(n2, n1);
        
        grafo.addEdge(n4, n3);
        grafo.addEdge(n4, n1);
        
        grafo.addEdge(n7, n8);
        grafo.addEdge(n7, n3);

        grafo.printGraph();
    

    }
}
