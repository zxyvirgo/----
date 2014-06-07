package test;

import org.junit.Assert;
import org.junit.Test;

import source.Two;


public class TestTwo {

	@Test
	public void test() {
		
		Assert.assertEquals("11111178899",Two.findTheLength("a111111A788990hjko005678899"));
		Assert.assertEquals("11111111158999",Two.findTheLength("a1111111115A899900006666A"));
		Assert.assertEquals("3456789",Two.findTheLength("ads3sl456789DF3456ld345AA"));
		Assert.assertEquals("11111178899",Two.XfindTheLength("a111111A788990hjko005678899"));
		Assert.assertEquals("11111111158999",Two.XfindTheLength("a1111111115A899900006666A"));
		Assert.assertEquals("3456789",Two.XfindTheLength("ads3sl456789DF3456ld345AA"));
	}
}
