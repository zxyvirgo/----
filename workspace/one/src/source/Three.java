package source;



public class Three {

	/**
	 * @param args
	 */

	 
	/*通过递归的方式，读取每一层，如果要提高效率的话，应该在TNode里面添加属性level，
	 * 但是本题中的TNode里面已经给出了结构，所以只能这样处理，不然记录层不方便。
	 * 
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
