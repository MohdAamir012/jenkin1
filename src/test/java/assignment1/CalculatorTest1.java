package assignment1;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest1 {
	Calculator obj;
	@BeforeClass
	public void objectCreation() {
		obj= new Calculator();
	}

	@Test
	public void addingTest()
	{
		int ans=obj.add(5, 10);
		Assert.assertEquals(ans, 15);
	}
	
	@Test
	public void subtractTesting() {
		int ans=obj.sub(10,5);
		Assert.assertEquals(ans, 5);
	}
	
	@Test 
	public void multiplingFunTesting() {
		int ans=obj.multiply(10,5);
		Assert.assertEquals(ans, 50);
	}
	@Test
	public void divisionTesting() {
		int ans=obj.dividing(10,5);
		Assert.assertEquals(ans, 2);
	}
}
