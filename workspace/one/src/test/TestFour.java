package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

import source.Four;


public class TestFour {

	@Test
	public void test() throws NumberFormatException, IOException {
		System.out.print("������һ����Ȼ����");
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));	
		int input= Integer.parseInt(stdin.readLine());
		Four.Triangle(input);
	}

}
