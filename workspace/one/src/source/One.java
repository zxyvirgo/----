package source;

public class One {
	/*
	 * @param  c  
	 *      to improve the efficiency, we use nummber.charAt(i) only once
	 * @param num
	 *      we need to change the number ,so that we can calculate them easily.
	 *      such as 'a' equals to 97 in ASCII,but we want it's changed to 10,so
	 *      we minus 87
	 * @param result
	 *      used to record the accumulation number.
	 */
	public static String HexToDec(String input) {

		String number = input;
		String endResult = "";
		int num;
		int result = 0;
		int flag = 0;
		int len = number.length();	

		for (int i = 0; i < len; i++) {
			char c = number.charAt(i);	
			if (c >= 'a' && c <= 'f') {
				num = c - 87;
			} 
			else if (c >= '0' && c <= '9') {
				num = c - 48;
			} 
			else if (c >= 'A' && c <= 'F') {
				num = c - 55;
			} 
			else {
            	num = 0;
				flag = 1;
			}

			for (int j = len - i - 1; j > 0; j--) {
				num *= 16;	
			}
			
			result += num; 
			endResult = String.valueOf(result);
		}		
		if (flag == 1) {
			endResult = "Sorry!the number you put is wrong!";
		}
		return endResult;
	}

}
