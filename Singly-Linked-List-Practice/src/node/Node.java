package node;

public class Node {
    int data;
    Node nextnode;

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node nextnode) {
        this.data = data;
        this.nextnode = nextnode;
    }

    @Override
    public String toString() {
        return "Node{" + "data=" + data + ", nextnode=" + nextnode + '}';
    }
}

//ctrl shift alt s for jdk
//format code ctrl shift alt