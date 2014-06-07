package test;

import org.junit.Assert;
import org.junit.Test;

import source.Two;

/*本题可以添加一些额外的jar，使用一些性能测试框架，但因不是maven工程，感觉不是很方便，就用代码做一下简单测试
 */
public class TestTwo {

	@Test
	public void test() {
		
		//可以做性能测试来对比下面两个函数执行所花的时间
		
	/*	Assert.assertEquals("11111178899",Two.findTheLength("a111111A788990hjko005678899"));
		Assert.assertEquals("11111111158999",Two.findTheLength("a1111111115A899900006666A"));
		Assert.assertEquals("3456789",Two.findTheLength("ads3sl456789DF3456ld345AA"));*/
		Assert.assertEquals("11111178899",Two.XfindTheLength("a111111A788990hjko005678899"));
		Assert.assertEquals("11111111158999",Two.XfindTheLength("a1111111115A899900006666A"));
		Assert.assertEquals("3456789",Two.XfindTheLength("ads3sl456789DF3456ld345AA"));
		
		//这是不使用性能测试框架的时候，对应的测试代码，比较运行效率
	/*	Two o=new Two();
		   String s="";
		   
		   System.out.println(o.XfindTheLength("aac3sdsf5678aaaada12df3456aa"));
		 long start = System.currentTimeMillis();
		    for (int ii = 0 ; ii < 1000000 ; ii++)
		    {
		         s = o.XfindTheLength("aac3sdsf5678aaaada12df3456aa");
		    }
		    long elapsed = System.currentTimeMillis() - start;
		    System.out.println("elapsed time = " + elapsed + "ms");
		      System.out.println(o.findTheLength("aac3sdsf5678aaaada12df3456aa"));
		   start = System.currentTimeMillis();
		    for (int ii = 0 ; ii < 1000000 ; ii++)
		    {
		          s = o.findTheLength("aac3sdsf5678aaaada12df3456aa");
		    }
		      elapsed = System.currentTimeMillis() - start;
		    System.out.println("elapsed time = " + elapsed + "ms"); */
		
	}
}
