package source;

import java.io.IOException;

public class Two {

	/**
	 * @param args
	 * 
	 * @throws IOException
	 */
	/*���Ǹ����Ժ�ķ�������Ϊ֮ǰд��Ч��̫�ͣ���ʵû�б�Ҫ������copy���µĿռ䣬
	 * ֻ��Ҫ��¼����λ�þͿ�����
	 */
	public static String XfindTheLength(String input) {
		byte[] in = input.getBytes();
		int len = in.length;
		//pos������¼�������ӵĴ��ĳ��ȣ�offset������¼���ҵĴ�����ʼλ��
		int maxlen = 0, max = 0, pos = 0, offset = 0, maxoffset = 0;

		for (int i = 0; i < len; i++) {

			if (in[i] >= 48 && in[i] <= 57) {	//���˷�'0'-'9'������

				if (pos == 0) {

					offset = i;		//��¼�µ�һ��ƫ��λ�ã���Ϊ��ʼ��
				}

				if (in[i] >= max) { //�ж�

					pos++;
					max = in[i];	//���������Ĵ�����pos�Ͳ������ӣ�max��¼ǰһ���ַ��������Ƚ�
					
				} else {
					if (pos > maxlen) {	//������ҵ��Ĵ�������ǰһ�Σ���ô�ͼ�¼�´��ĳ��Ⱥ���ʼλ��

						maxlen = pos;
						maxoffset = offset;
					}

					max = 0;
					pos = 0;

				}

			}

		}
		if (pos > maxlen) {		//���ĩβ�ǵ������֣������ܲ�������ж������else��䣬���Ի�Ҫ�Ƚ�һ��

			maxlen = pos;
			maxoffset = offset;
		}

		byte[] slice = new byte[maxlen]; // byte�洢�����ֽڣ������Ѿ�֪�����ȵĴ�������ʹ�ø���
		for (int j = maxoffset, k = 0; k < maxlen; j++) {
			if (in[j] >= 48 && in[j] <= 57) {
				slice[k++] = in[j];
			}
		}

		return new String(slice); // ��byteת����String����
	}

	//ǰһ�ε�д�ķ�ʽ�Ѿ�ע������������Ҫ�����Ժ��º����������ϵ����бȽ�
	
	/*public static String findTheLength(String input) {
		String result = "";
		String endresult = "";
		int first = 0, length = 0;
		int inputlength = input.length();
		for (int i = 0; i < inputlength; i++) {
			// Ҫ������������ǵ�����
			char c = input.charAt(i);
			if (c >= '0' && c <= '9') { // ���˵���ĸ
				// ����ǵ����ģ����¼�µ�ǰ�ַ�
				if (first <= c && i != inputlength - 1) {
					result += c;
				} else {
					// ��β���ַ�����©��������Ҫ��ӽ�ȥ
					if (i == inputlength - 1) {
						result += c;
					}
					int resultlength = result.length();
					if (resultlength > length) { // ����´��ĳ��ȴ��ڵ�ǰ�������¼����
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
