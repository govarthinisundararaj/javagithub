package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import runner.Square;

public class Testsquare {

	
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
