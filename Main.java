// Lab 5 - Binary Search Tree (BST)
// Your Name: Manbir S Kheira

class Main {
  public static void main(String[] args) {

    // Step 1 - Create a BST tree object called lab5Tree
    BST lab5Tree = new BST();

    // Step 2 - Insert the following values: 13, 22, 36, 5, 48, 17, 39, 2, 26, 40, 29, 34, 10
    int[] valuesToInsert = {13, 22, 36, 5, 48, 17, 39, 2, 26, 40, 29, 34, 10};
    for (int value : valuesToInsert) {
      lab5Tree.insert(value);
    }

    // Step 3 - Delete the value 17
    lab5Tree.delete(17);

    // Step 4 - Traverse and output the values using inorder (sorted)
    System.out.println("Inorder Traversal (Sorted):");
    lab5Tree.inorder();

    // Step 5 - Traverse and output the values using postorder
    System.out.println("\nPostorder Traversal:");
    lab5Tree.postorder();

    // Step 6 - Traverse and output the values using preorder
    System.out.println("\nPreorder Traversal:");
    lab5Tree.preorder();

    // Step 7 - Display the result of a search for the value 36
    System.out.println("\nSearch Results:");
    System.out.println("Searching for 36: " + (lab5Tree.search(36) ? "Found" : "Not Found"));

    // Step 8 - Display the result of a search for the value 37
    System.out.println("Searching for 37: " + (lab5Tree.search(37) ? "Found" : "Not Found"));

    // Step 9 - Using the path() method, display the path from the root to 2
    System.out.println("\nPaths:");
    System.out.println("Path from root to 2: " + lab5Tree.path(2));

    // Step 10 - Display the path from the root to 34
    System.out.println("Path from root to 34: " + lab5Tree.path(34));
  }
}
