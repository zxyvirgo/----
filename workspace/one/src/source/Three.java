package source;



public class Three {

	/**
	 * @param args
	 */

	 
	/*通过递归的方式，只会读取到指定的层。
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
