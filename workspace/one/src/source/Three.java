package source;



public class Three {

	/**
	 * @param args
	 */

	 
	/*ͨ���ݹ�ķ�ʽ����ȡÿһ�㣬���Ҫ���Ч�ʵĻ���Ӧ����TNode�����������level��
	 * ���Ǳ����е�TNode�����Ѿ������˽ṹ������ֻ������������Ȼ��¼�㲻���㡣
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
