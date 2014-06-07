package source;

import java.io.IOException;

public class Two {

	/**
	 * @param args
	 * 
	 * @throws IOException
	 */
	/*这是更新以后的方法，因为之前写的效率太低，其实没有必要将数据copy到新的空间，
	 * 只需要记录它的位置就可以了
	 */
	public static String XfindTheLength(String input) {
		byte[] in = input.getBytes();
		int len = in.length;
		//pos用来记录不断增加的串的长度，offset用来记录查找的串的起始位置
		int maxlen = 0, max = 0, pos = 0, offset = 0, maxoffset = 0;

		for (int i = 0; i < len; i++) {

			if (in[i] >= 48 && in[i] <= 57) {	//过滤非'0'-'9'的数字

				if (pos == 0) {

					offset = i;		//记录下第一个偏移位置，作为起始点
				}

				if (in[i] >= max) { //判断

					pos++;
					max = in[i];	//满足增长的串长，pos就不断增加，max记录前一个字符，用来比较
					
				} else {
					if (pos > maxlen) {	//如果新找到的串长大于前一次，那么就记录新串的长度和起始位置

						maxlen = pos;
						maxoffset = offset;
					}

					max = 0;
					pos = 0;

				}

			}

		}
		if (pos > maxlen) {		//如果末尾是递增数字，最后可能不会进入判断里面的else语句，所以还要比较一次

			maxlen = pos;
			maxoffset = offset;
		}

		byte[] slice = new byte[maxlen]; // byte存储的是字节，对于已经知道长度的串，这样使用更快
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
