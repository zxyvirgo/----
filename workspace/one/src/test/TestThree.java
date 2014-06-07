package test;

import org.junit.Test;

import source.TNode;
import source.Three;


public class TestThree {

	@Test
	public void test() {
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


	//	Assert.assertEquals("ABDGHCF",Three.TreeLevel(root, 3));
	}

}
