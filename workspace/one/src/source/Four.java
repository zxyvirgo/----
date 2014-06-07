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
			//输出input个空格，但是逐层减少
			for(int j=0; j<input-n+1; j++){
				System.out.print("  ");
			}
			
			for(int k=1; k<=n+1; k++){
				int up=1;			//记录分母
				int down=1;			//记录分子
				//根据杨辉三角的公式，用计算机的形式表示出公式
				for(int m=n; m>n-k+1; m--){
					up*=m;
				}
				
				for(int i=1; i<k; i++){
					down*=i;	
				}
				int num = up/down;
			
			//	System.out.print(num+" ");
				//添加了格式，这样输出的就不是斜三角形了.
				System.out.printf("%4d",num);   

			}
			
			System.out.println();
		}
		
	}
	
}


