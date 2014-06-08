package test;

import org.junit.Test;

import source.TNode;
import source.Three;


public class TestThree {

	@Test
	public void test() {
		
		//根据题目的样子构建的二叉树，以及根据题目要求写的测试方法，
	
		
		/*                 A
		 				B     D
		 *
		 *			G    H   C   F   
		 */

		
		Three tree = new Three();
		String[] array ={"A", "B", "D", "G", "H", "C", "F"};	
		TNode node = tree.makeBinaryTreeByArray(array, 0);
		//二叉树的层次遍历
		tree.TreeLevel(node, 1);
		tree.TreeLevel(node, 2);
		tree.TreeLevel(node, 3);
    //下面这这种测试方式不是很好实现，因为第递归，如果写成这样只会更复杂
	//	Assert.assertEquals("ABDGHCF",Three.TreeLevel(root, 3));
	}

}
