package test;


import org.junit.Assert;
import org.junit.Test;
import source.One;

/*junit的比较常规的测试
*/
public class TestOne {

	@Test
	public void test() {
		Assert.assertEquals("Sorry!the number you put is wrong!", One.HexToDec("thjds"));
		Assert.assertEquals("161",  One.HexToDec("a1"));
		Assert.assertEquals("4666",  One.HexToDec("123a"));
		Assert.assertEquals("935276",  One.HexToDec("e456c"));
		Assert.assertEquals("662477",  One.HexToDec("a1bcd"));
	}

}
