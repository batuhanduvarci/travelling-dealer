public class Node {

    Node following = null;

    int data;

    public Node(int data) {
        this.data = data;
    }

    public void appendToEnd(int data) {
        Node end = new Node(data);
        Node n = this;

        while (n.following != null) {
            n = n.following;
        }
        n.following = end;
    }

    // TODO:: Implement to return the length of the SinglyLinkedList
    // For example:: --> 5 --> 6 --> 7 --> 3 --> .
    public void printNodes() {
        Node firstNode = this;
        StringBuilder output = new StringBuilder();

        while (firstNode.following != null){
            output.append("Node Map : --> ").append(firstNode.data);
            firstNode = firstNode.following;
            if (firstNode.following == null){
                output.append(" --> ").append(firstNode.data).append(" -->");
            }
        }
        System.out.println(output);
    }

    // TODO:: Implement to return the length of the SinglyLinkedList
    int length(Node h) {
        int length = 0;

        while (h.following != null){
            h = h.following;
            length++;
        }
        length++;

        return length;
    }

    // TODO:: Implement to return the sum of the Nodes
    int sumOfNodes() {
        int sum = 0;
        Node firstNode = this;

        while (firstNode.following != null){
            sum += firstNode.data;
            firstNode = firstNode.following;
            if (firstNode.following == null){
                sum += firstNode.data;
            }
        }
        return sum;
    }

    Node deleteNode(Node head, int data) {
        Node n = head;
        if (n.data == data) {
            return head.following;
        }
        // TODO:: Implement the proper loop in order to remove given data
        Node previousNode = null;

        while (n != null && n.data != data){
            previousNode = n;
            n = n.following;
        }

        if (n != null) {
            previousNode.following = n.following;
        }
        //
        return head;
    }
}