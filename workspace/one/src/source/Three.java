package source;



public class Three {

	/**
	 * @param args
	 */
	//用数组构建二叉树
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
	
	// 通过递归的方式，读取到指定的层。
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
