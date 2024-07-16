package TreeClass;

//classe com os metodos da arvore binaria 

public class FootballBinaryTree<T extends Comparable<T>> implements FootballInterface<T>{

    private Node<T> root;

    //constructor to initialize empty Tree
    public FootballBinaryTree(Node<T> root) {
        this.root = null;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    //Add Method
    @Override
    public void add(T element) {
        root = addRecursive(root,element);
    }

    //recursive mode to add a node in the tree
    private Node<T> addRecursive(Node<T> current, T element){
        if(current == null){
            return new Node<> (element);
        }
        
        // compara o time de futebol com o time atual gravado no node
        // se ele for menor, eu chamo o metodo recursivo e mando ele pra esquerda do nó
        if(element.compareTo(current.data) < 0){
            current.left = addRecursive(current.left, element);
        }else if(element.compareTo(current.data) > 0){ 
            current.right = addRecursive(current.right, element);
        }

        return current;
    }

    @Override
    public int countNodes() {
       return countNodesRecursive(root);
    }

    //recursive count nodes
    private int countNodesRecursive(Node<T> current){
        if(current == null){
            return 0;
        }

        return 1 + countNodesRecursive(current.left) + countNodesRecursive(current.right);
    }
    
    @Override
    public T findMax() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findMax'");
    }

    @Override
    public T findMin() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findMin'");
    }

    @Override
    public void printTree() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printTree'");
    }

}
