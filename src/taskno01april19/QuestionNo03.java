package taskno01april19;

public class QuestionNo03 {
	public static void main(String[] args) {
		int a =876;
		int b=0, count=1, c=0, d=0 ;
		b =a;
		if(b>9)
		{
			b = b/10;
			while(b!=0)
			{
				b =b/10;
				count*=10;
			}
		}
		else
			System.out.println("Enter the valid number to reverse");
		
		while(a!=0)
		{
			c = a%10;
			d += (c *count);
			count/=10;
			a = a/10;
		}
		System.out.println(d);
		
	}

}
