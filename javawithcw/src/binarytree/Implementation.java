package binarytree;

class BinaryTreeNode {
    int data;
    BinaryTreeNode leftNode;
    BinaryTreeNode rightNode;

    public BinaryTreeNode(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BinaryTreeNode{" + "data=" + data + ", leftNode=" + leftNode + ", rightNode=" + rightNode + '}';
    }
}

public class Implementation {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insertNode(53);
        binaryTree.insertNode(30);
        binaryTree.insertNode(72);
        binaryTree.insertNode(14);
        binaryTree.insertNode(39);
        binaryTree.insertNode(84);
        binaryTree.insertNode(61);
        binaryTree.insertNode(9);
        binaryTree.insertNode(23);
        binaryTree.insertNode(34);
        binaryTree.insertNode(47);
        binaryTree.insertNode(79);

        binaryTree.display(binaryTree.rootNode);
        System.out.println("binaryTree.height(binaryTree.rootNode) = " + binaryTree.height(binaryTree.rootNode));

    }

    public static class BinaryTree {
        BinaryTreeNode rootNode;

        void insertNode(int data) {
            BinaryTreeNode temp = new BinaryTreeNode(data);
            if (rootNode == null) {
                rootNode = temp;
            } else {
                BinaryTreeNode currentNode = rootNode;
                BinaryTreeNode parentNode;
                while (true) {
                    if (data < currentNode.data) {
                        parentNode = currentNode;
                        currentNode = currentNode.leftNode;
                        if (currentNode == null) {
                            parentNode.leftNode = temp;
                            return;
                        }
                    } else {
                        parentNode = currentNode;
                        currentNode = currentNode.rightNode;
                        if (currentNode == null) {
                            parentNode.rightNode = temp;
                            return;
                        }
                    }
                }
            }
        }

        void display(BinaryTreeNode rootNode) {
            if (rootNode == null) {
                return;
            }
            System.out.println(rootNode.data);
            display(rootNode.leftNode);
            display(rootNode.rightNode);

        }
        public int height(BinaryTreeNode rootNode){
            if(rootNode==null){
                return 0;
            }
            return 1+height(rootNode.leftNode)+height(rootNode.rightNode);
        }
    }
}
