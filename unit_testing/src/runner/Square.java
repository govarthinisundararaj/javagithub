package runner;

public class Square 
{
	/*int a;
	public Square(int i) 
	{
		this.a=i;
		//System.out.println("cons");
	}
*/
	public int Squ_fun(int x)
	{
	return x*x;
	}
	public int add_fun(int a,int b)
	{
		return (a+b);
	}
//Main program
	public static void main(String[] args) 
	{
		int a=5,b=5;

		Square obj=new Square();
		System.out.println("square="+ obj.Squ_fun(a));
		System.out.println("sum="+ obj.add_fun(a,b));

	}
	
//edited
}

