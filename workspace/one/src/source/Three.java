package source;



public class Three {

	/**
	 * @param args
	 */
	// 构建一个题目中的树，后续可以添加自动的构建方法
	 public static TNode makeBinaryTreeByArray(String[] array,int index){
	        if(index<array.length){
	            String value=array[index];
	         //   if(value!=0){
	                TNode t=new TNode();
	                t.value = value;
	             //   array[index]=0;
	                t.left=makeBinaryTreeByArray(array,index*2);
	                t.right=makeBinaryTreeByArray(array,index*2+1);
	                return t;
	           // }
	        }
	        return null;
	    }
	 
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
