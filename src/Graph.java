import java.util.HashSet;
import java.util.Set;

import org.w3c.dom.Node;

public class Graph {
    Set<Node> nodes;

    public Graph(){
        nodes= new HashSet<>();
    }

    public Node addNode(int value){
        return null;
    }

    public void addEdge(Node src,Node dest){

    }

    public void printGraph(){}

    public void geDFS(Node starNode){}

    private void getDFSUtil(Node node, boolean[] visited){}

    public void getBFS(Node startNode){}

}
