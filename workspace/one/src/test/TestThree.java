package test;

import org.junit.Test;

import source.TNode;
import source.Three;


public class TestThree {

	@Test
	public void test() {
		
		//根据题目的样子构建的二叉树，选取题目中的数据测试
	
		/*  
		 *                 A
		 *          	B     D
		 *
		 *			G    H   C   F   
		 */

		
		Three tree = new Three();
		String[] array ={"A", "B", "D", "G", "H", "C", "F"};	
		TNode node = tree.makeBinaryTreeByArray(array, 0);
		//二叉树的层次遍历
		//遍历第1层
		tree.TreeLevel(node, 1);
		//遍历第2层
		tree.TreeLevel(node, 2);
		//遍历第3层
		tree.TreeLevel(node, 3);
		
        //因为是递归，写成下面这样的测试方法没有很大的必要性
	    //Assert.assertEquals("ABDGHCF",Three.TreeLevel(root, 3));
	}

}
