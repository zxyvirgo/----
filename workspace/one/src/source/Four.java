package source;
import java.io.IOException;


public class Four {

	/**
	 * @param args
	 * @throws NumberFormatException 
	 * @throws IOException 
	 */
	public static void Triangle(int input){
		for(int n=0; n<input+1;n++){
			//���input���ո񣬵���������
			for(int j=0; j<input-n+1; j++){
				System.out.print("  ");
			}
			
			for(int k=1; k<=n+1; k++){
				int up=1;			//��¼��ĸ
				int down=1;			//��¼����
				//����������ǵĹ�ʽ���ü��������ʽ��ʾ����ʽ
				for(int m=n; m>n-k+1; m--){
					up*=m;
				}
				
				for(int i=1; i<k; i++){
					down*=i;	
				}
				int num = up/down;
			
			//	System.out.print(num+" ");
				//����˸�ʽ����������ľͲ���б��������.
				System.out.printf("%4d",num);   

			}
			
			System.out.println();
		}
		
	}
	
}


