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
	 
	 
	/*通过递归的方式，读取每一层，如果要提高效率的话，应该在TNode里面添加属性level，
	 * 但是本题中的TNode里面已经给出了结构，所以这样处理
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
