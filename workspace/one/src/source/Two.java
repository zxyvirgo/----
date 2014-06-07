package source;

import java.io.IOException;

public class Two {

	/**
	 * @param args
	 * 
	 * @throws IOException
	 */

	public static String XfindTheLength(String input) {
		byte[] in = input.getBytes();
		int len = in.length;
		int maxlen = 0, max = 0, pos = 0, offset = 0, maxoffset = 0;

		for (int i = 0; i < len; i++) {

			if (in[i] >= 48 && in[i] <= 57) {

				if (pos == 0) {

					offset = i;
				}

				if (in[i] >= max) {

					pos++;
					max = in[i];
				} else {
					if (pos > maxlen) {

						maxlen = pos;
						maxoffset = offset;
					}

					max = 0;
					pos = 0;

				}

			}

		}
		if (pos > maxlen) {

			maxlen = pos;
			maxoffset = offset;
		}

		byte[] slice = new byte[maxlen]; // byte存储的是字节，但是char里面会自动判断是否是汉字
		for (int j = maxoffset, k = 0; k < maxlen; j++) {
			if (in[j] >= 48 && in[j] <= 57) {
				slice[k++] = in[j];
			}
		}
		// System.arraycopy(in,maxoffset,slice,0,maxlen-1);
		return new String(slice); // 把byte转化成String
	}

	public static String findTheLength(String input) {
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

	}

}
