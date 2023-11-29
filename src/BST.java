public class BST <T extends Comparable<T>>{
    Node<T> root;

    public BST(){
       this.root = null;
    }

    public void insert(T data){
        root = insertbyrec(root,data);
    }

    public Node<T> insertbyrec(Node<T> root, T data){
        if(root == null){
            root = new Node<>(data);
            return root;
        }
        if(data.compareTo(root.data) < 0){
            root.left = insertbyrec(root.left, data);
        }
        else if(data.compareTo(root.data) > 0){
            root.right = insertbyrec(root.right, data); // Fix this line
        }
        return root;
    }

    public void inorderTraversal(Node<T> root){
        if(root!=null){
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }

    public void preorderTraversal(Node<T> root){
        if (root!=null){
            System.out.print(root.data+ " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    public void postorderTraversal(Node<T> root){
        if (root!=null){
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.data+ " ");
        }
    }
    public boolean search(Node<T> root, T data){
        if(root==null){
            return false;
        }
        if(root.data.equals(data)){
            return true;
        }
        if(root.data.compareTo(data) < 0){
            return search(root.right, data);
        }
        else{
            return search(root.left, data);
        }
    }
    


}
