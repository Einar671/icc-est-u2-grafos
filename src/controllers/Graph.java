package controllers;
import java.util.HashSet;
import java.util.Set;

import models.Node;


public class Graph {
    Set<Node> nodes;

    public Graph(){
        nodes= new HashSet<>();
    }

    public Node addNode(int value){
        Node nuevoNodo = new Node(value);
        nodes.add(nuevoNodo);
        return nuevoNodo;
    }

    public void addEdge(Node src,Node dest){
        src.addNeighbor(dest);
        dest.addNeighbor(src);

    }

    public void addEdgeUni(Node src,Node dest){
        src.addNeighbor(dest);
    }

public void printGraph() {
    for (Node n : nodes) {
        System.out.print("Vertex " + n.getValue() + ":");
        for (Node neighbor : n.getNeighbors()) {
            System.out.print(" -> " + neighbor.getValue());
        }
        System.out.println(); 
    }
}

    public void geDFS(Node starNode){}

    private void getDFSUtil(Node node, boolean[] visited){}

    public void getBFS(Node startNode){}

    public int[][] getAdjacencyMatrix(){
        return null;
    }

    public void printAdjacencyMatrix(){}

}
