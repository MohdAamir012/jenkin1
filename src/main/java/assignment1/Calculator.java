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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator ob=new Calculator();
System.out.println(ob.add(5,10));
	}

}
