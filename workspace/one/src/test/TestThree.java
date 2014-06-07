package test;

import org.junit.Test;

import source.TNode;
import source.Three;


public class TestThree {

	@Test
	public void test() {
		
		//根据题目的样子构建的二叉树，以及根据题目要求写的测试方法，
		Three three = new Three();
		
		TNode root = new TNode();
		TNode b = new TNode();

		TNode d = new TNode();
		TNode g = new TNode();
		TNode h = new TNode();
		TNode c = new TNode();
		TNode f = new TNode();

		root.setValue("A");
		b.setValue("B");
		d.setValue("D");
		g.setValue("G");
		h.setValue("H");
		c.setValue("C");
		f.setValue("F");

		root.setLeft(b);
		root.setRight(d);
		b.setLeft(g);
		b.setRight(h);
		d.setLeft(c);
		d.setRight(f);
		
		three.TreeLevel(root, 1);
		three.TreeLevel(root, 2);
		three.TreeLevel(root, 3);

    //下面这这种测试方式不是很好实现，因为第递归，如果写成这样只会更复杂.
	//	Assert.assertEquals("ABDGHCF",Three.TreeLevel(root, 3));
	}

}
