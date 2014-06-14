package source;
import java.io.IOException;


public class Four {

	/**
	 * @param input 
	 *         the input is to record the number of spaces,and it is reduce by layer
	 * @param up
	 *         the up is to record the numerator
	 * @param down 
	 *         the down is to record the denominator
	 *         we can calculate the equation of Pascal's Triangle 
	 * @throws NumberFormatException 
	 * @throws IOException 
	 * 
	 * at last we need to use the specification format
	 */
	public static void Triangle(int input){
		for(int n=0; n<input+1;n++){
			for(int j=0; j<input-n+1; j++){
				System.out.print("  ");
			}
			
			for(int k=1; k<=n+1; k++){
				int up=1;			
				int down=1;			
				for(int m=n; m>n-k+1; m--){
					up*=m;
				}
				
				for(int i=1; i<k; i++){
					down*=i;	
				}
				int num = up/down;
				
				System.out.printf("%4d",num);   

			}
			
			System.out.println();
		}
		
	}
	
}


