import javax.swing.JFrame;

public class Main 
{
	public static int fact(int n)
	{
		if(n<=1)
			return 1;
		else
		{
			return n*fact(n-1);
		}
	}
	private static int gcd(int n,int d){
		if(d==0)
		{
			return n;
		}
		else
		{
			return gcd(d,n%d);
		}
	}
	public static int fib(int i)
	{
		if(i==1||i==2)
			{
				return 1;
			}
		
		else
		{
			return fib(i-1)+fib(i-2);
		}
	}
	public static void hanoi(int n,char from, char helper, char to)
	
	{
		if(n>0)
		{
			hanoi(n-1,from , to, helper);
			System.out.println("Move disk "+n+" from "+from+" to "+to);
			hanoi(n-1,helper, from, to);
		}
	}
	public static void dzb(int n)
	{
		if(n>0)
		{
			dzb(n/2);
			System.out.print(n%2);
		}
		
	}
	public static void main(String[] args) 
	{
		System.out.println(fact(33));
		System.out.println(gcd(24,32));
		System.out.println(fib(12));
		hanoi(3,'A','B','C');
		dzb(54);
		JFrame fr=new JFrame();
		Panel snow=new Panel();
		fr.getContentPane().add(snow);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setSize(400, 400);
		fr.setVisible(true);
		
	}

}
