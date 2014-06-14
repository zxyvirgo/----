package source;



/**
 * @author asus
 *
 */
public class Three {

	/**
	 * @param args
	 * make a BinaryTree
	 */
	public TNode makeBinaryTreeByArray(String[] array,int index){

        if(index<array.length){
            	String value=array[index];
                TNode t=new TNode();
                t.value = value;
                t.left=makeBinaryTreeByArray(array,index*2+1);
                t.right=makeBinaryTreeByArray(array,index*2+2);
                return t;
        }
        return null;
    }
	
	/**
	 * @param tree
	 * @param n
	 * read it by layer
	 */
	public void TreeLevel(TNode tree, int n) {

        if(tree == null)
            return ;
        else{
            if(n == 1)
              System.out.print(tree.value + "    ");
            else{
        	TreeLevel(tree.left,n-1);
        	TreeLevel(tree.right,n-1);
            }
        }

	}
	

}
