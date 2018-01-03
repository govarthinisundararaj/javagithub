package runner;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class Test_square {

	
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	public void squ_fun()
	{
		Square a=new Square();
		Assert.assertEquals(25, a.Squ_fun(5));
	}

}
