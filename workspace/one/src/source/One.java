package source;

public class One {

	/*
	 * One
	 * 
	 * Date
	 */
	public static String HexToDec(String input) {

		String number = input, endResult = "";
		int num, result = 0, flag = 0;
		int len = number.length();	

		for (int i = 0; i < len; i++) {

			char c = number.charAt(i);	//ͨ��ִ�з�����ȡ��ֵ����ȡ������Ҳ�����Ч�ʡ���Ϊnumber.charAt(i)�����ִ��Ҳ��Ҫʱ�䡣

			if (c >= 'a' && c <= 'f') {

				num = c - 87;// ����ASCII�룬������ת���ɷ����������ݣ�����'a'��ӦASCII�����97�����Ա��10�������ļ���

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
			result += num; // ���õ��Ľ���ۼ�
			endResult = Integer.toString(result);
		}
		if (flag == 1) {
			endResult = "Sorry!the number you put is wrong!";
		}
		return endResult;
	}

}
