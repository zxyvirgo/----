package test;


import org.junit.Assert;
import org.junit.Test;
import source.One;

public class TestOne {

	@Test
	public void test() {
		
		//対用户输入非16进制数进行测试
		Assert.assertEquals("Sorry!the number you put is wrong!", One.HexToDec("thjds"));
		//验证数据转换的正确性
		Assert.assertEquals("161",  One.HexToDec("a1"));
		Assert.assertEquals("4666",  One.HexToDec("123a"));
		Assert.assertEquals("935276",  One.HexToDec("e456c"));
		Assert.assertEquals("662477",  One.HexToDec("a1bcd"));
	}

}
