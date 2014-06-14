package test;


import org.junit.Assert;
import org.junit.Test;
import source.One;

public class TestOne {

	@Test
	public void test() {
		
		//when user's input number is not hexadecimal
		Assert.assertEquals("Sorry!the number you put is wrong!", One.HexToDec("thjds"));
				
		Assert.assertEquals("161",  One.HexToDec("a1"));
		Assert.assertEquals("4666",  One.HexToDec("123a"));
		Assert.assertEquals("935276",  One.HexToDec("e456c"));
		Assert.assertEquals("662477",  One.HexToDec("a1bcd"));
	}

}
