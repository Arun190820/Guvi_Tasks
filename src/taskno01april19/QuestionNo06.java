package taskno01april19;

public class QuestionNo06 {

	public static void main(String[] args) {
		int i, j, k=5, a=k;
		
		for(i=0; i<k; i++)
		{
			a = k;
			for(j=0; j<k; j++)
			{
				System.out.print(a+" ");
				
				if(i>=1 && j==0)
					a=a-1; 
				if(i>=2 && j==1)
					a=a-1; 
				if(i>=3 && j==2)
					a=a-1; 
				if(i>=4 && j==3)
					a=a-1; 
				
	
			}
			System.out.print("\n");
		}
	}
}
