public class Main {
    public static void main(String[] args) {
        // Example
        Node node = new Node(4);
        node.appendToEnd(5);
        node.appendToEnd(6);
        node.appendToEnd(7);

        node.printNodes();
        System.out.println("Node Lenght = " + node.length(node));
        System.out.println("Sum of Nodes = " + node.sumOfNodes());
        node.deleteNode(node, 5);
        // End of Example
    }
}
