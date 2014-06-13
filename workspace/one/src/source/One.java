package source;

public class One {
	public static String HexToDec(String input) {

		String number = input;
		String endResult = "";
		int num;
		int result = 0;
		int flag = 0;
		int len = number.length();	

		for (int i = 0; i < len; i++) {
			//通过执行方法获取的值，抽取出来，也能提高效率。因为number.charAt(i)本身的执行也需要时间。
			char c = number.charAt(i);	

			if (c >= 'a' && c <= 'f') {
				// 根据ASCII码，将数字转换成方便计算的数据，比如'a'对应ASCII里面的97，所以变成10方便后面的计算。
				num = c - 87;

			} else if (c >= '0' && c <= '9') {

				num = c - 48;

			} else if (c >= 'A' && c <= 'F') {

				num = c - 55;

			} else {

				num = 0;
				flag = 1;

			}

			for (int j = len - i - 1; j > 0; j--) {
				num *= 16;	
			}
			// 将得到的结果累加。
			result += num; 
			//将结果转换成字符串，返回最后的值。
			endResult = String.valueOf(result);
		}
		if (flag == 1) {
			endResult = "Sorry!the number you put is wrong!";
		}
		return endResult;
	}

}
