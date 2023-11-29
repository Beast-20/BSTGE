public class Program {
   public static void main(String[] args) {
    BST<Integer> bst = new BST<>();

      bst.insert(56);
      bst.insert(30);
      bst.insert(70);
      bst.insert(22);
      bst.insert(40);
      bst.insert(11);
      bst.insert(3);
      bst.insert(16);
      bst.insert(60);
      bst.insert(95);
      bst.insert(65);
      bst.insert(63);
      bst.insert(67);

      System.out.println("Inorder traversal:- ");
      bst.inorderTraversal(bst.root);

      System.out.println("\nPreorder Traversal:- ");
      bst.preorderTraversal(bst.root);

      System.out.println("\nPostorder Traversal:- ");
      bst.postorderTraversal(bst.root);

      boolean flag = bst.search(bst.root, 63);

      if(flag==true){
        System.out.println("\n63 found in BST");
      }
      else{
        System.out.println("63 not found in BST");
      }

   } 
}
