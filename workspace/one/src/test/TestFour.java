package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

import source.Four;


public class TestFour {

	@Test
	public void test() throws NumberFormatException, IOException {
		//直接在控制台显示的方法做测试，感觉写其它方法有点复杂了。
		System.out.print("请输入一个自然数：");
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));	
		int input= Integer.parseInt(stdin.readLine());
		Four.Triangle(input);
	}

}
