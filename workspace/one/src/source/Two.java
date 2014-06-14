package source;

import java.io.IOException;

public class Two {

	/**
	 * @param args
	 * 
	 * @throws IOException
	 * this is the new method
	 * @param offset
	 *       to record the length of the String which i found
	 * @param pos 
	 *       to record the begin position of the String
	 * @param max 
	 *       to record the number of change
 	 */
	public static String XfindTheLength(String input) {
		byte[] in = input.getBytes();
		int len = in.length;
		int maxlen = 0;
		int max = 0;
		int offset = 0;
		int pos = 0;
		int maxoffset = 0;

		for (int i = 0; i < len; i++) {

			if (in[i] >= 48 && in[i] <= 57) {	//filter the number except '0'-'9'

				if (offset == 0) {

					pos = i;		
				}

				if (in[i] >= max) { //judge if the String is increasing

					offset++;
					max = in[i];	
					
				} else {
					if (offset > maxlen) {	//if the String is long than the first record,replace it.

						maxlen = offset;
						maxoffset = pos;
					}

					max = 0;
					offset = 0;

				}

			}

		}
		if (offset > maxlen) {		//if the end of the String is number,we need to compare the last time.

			maxlen = offset;
			maxoffset = pos;
		}

		byte[] slice = new byte[maxlen]; // using byte is better than String
		for (int j = maxoffset, k = 0; k < maxlen; j++) {
			if (in[j] >= 48 && in[j] <= 57) {
				slice[k++] = in[j];
			}
		}

		return new String(slice); // 把byte转化成String类型
	}

	//前一次的写的方式已经注解掉，如果有需要，可以和新函数做性能上的运行比较
	
	/*public static String findTheLength(String input) {
		String result = "";
		String endresult = "";
		int first = 0, length = 0;
		int inputlength = input.length();
		for (int i = 0; i < inputlength; i++) {
			// 要求输入的数字是递增的
			char c = input.charAt(i);
			if (c >= '0' && c <= '9') { // 过滤掉字母
				// 如果是递增的，则记录下当前字符
				if (first <= c && i != inputlength - 1) {
					result += c;
				} else {
					// 结尾的字符串会漏掉，所以要添加进去
					if (i == inputlength - 1) {
						result += c;
					}
					int resultlength = result.length();
					if (resultlength > length) { // 如果新串的长度大于当前串，则记录下来
						length = resultlength;
						endresult = result;
					}
					result = "";
					result += c;
					first = 0;
				}
				first = (int) c;
			}// end if
		}// end for
		return endresult;

	}*/

}
