package assignment1;

public class Calculator {

	  public static int add(int a,int b)
	  {
		  return a+b;
	  }
	  
	  public static int sub(int a,int b)
	  {
		  return a-b;
	  }
	  
	  public static int multiply(int a,int b)
	  {
		  return a*b;
	  }
	  
	  public static int dividing(int a,int b)
	  {
		  return a/b;
	  }
	  public int switchFunction(int n,int a,int b)
	  {
		Calculator ob=new Calculator();
		int ans=0;
		switch(n)
		{
			case 1: ans=ob.add(a,b);
			break;
			case 2: ans=ob.sub(a,b);
			break;
			case 3: ans=ob.multiply(a,b);
			break;
			case 4: ans=ob.dividing(a,b);
		}
		return ans;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator ob=new Calculator();
System.out.println(ob.switchFunction(1,10,5));
	}

}
