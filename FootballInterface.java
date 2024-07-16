package TreeClass;

public interface FootballInterface <T extends Comparable<T>>{
    // tree is empty, 
    boolean isEmpty();
    // to add Nodes into the tree, 
    void add(T element);
    // to count all the Nodes,
    int countNodes(); 
    // find the team in the leading position (maximum position, 1st), 
    T findMax();
    // and the team coming last (minimum position, last) and 
    T findMin();
    // to printout a representation of the tree.  
    void printTree();
}
