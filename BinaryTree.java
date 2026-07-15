public class BinaryTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null; 
        }
        
    }

    static class BinaryTreee {
        static int idx = -1;
        public static Node buildTree(int [] nodes){
            idx++;
            if(nodes[idx] == -1) return null;

            Node newNode = new Node(nodes[idx]);
            newNode.left = new Node(nodes[idx]);
            newNode.right = new Node(nodes[idx]);
            return newNode;
        }
    }

    
    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTreee bt = new BinaryTreee();
        Node root = bt.buildTree(nodes);System.out.println(root.data);
    }
}

// static class Node {
    //     int data;
    //     Node left;
    //     Node right;
    
    //     Node(int data) {
        //         this.data = data;
        //         this.left = null;
        //         this.right = null;
        //     }
        // }
        
        // static class BinaryTreee {
            //     static int idx = -1;
            
            //     public static Node buildTree(int nodes[]) {
                //         idx++;
                //         if (nodes[idx] == -1) {
                    //             return null;
                    //         }
                    //         Node newNode = new Node(nodes[idx]);
                    //         newNode.left = buildTree(nodes);
                    //         newNode.right = buildTree(nodes);
                    
                    //         return newNode;
                    //     }
                    // }
                    // BinaryTreee bt = new BinaryTreee();
                    // Node root = bt.buildTree(nodes);
                    // System.out.println(root.data);