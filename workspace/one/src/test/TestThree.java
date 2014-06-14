package test;

import org.junit.Test;

import source.TNode;
import source.Three;


public class TestThree {

	@Test
	public void test() {
		
		//this is the test data
	
		/*  
		 *                 A
		 *               B     D
		 *           G    H   C   F   
		 */

		
		Three tree = new Three();
		String[] array ={"A", "B", "D", "G", "H", "C", "F"};	
		TNode node = tree.makeBinaryTreeByArray(array, 0);
		//traverse the first layer
		tree.TreeLevel(node, 1);
		//traverse the second layer
		tree.TreeLevel(node, 2);
		//traverse the third layer
		tree.TreeLevel(node, 3);
		
        //using this method may be not very nessary. 
        //Assert.assertEquals("ABDGHCF",Three.TreeLevel(root, 3));
	}

}
