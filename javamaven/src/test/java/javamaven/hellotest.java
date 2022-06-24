package javamaven;

import org.testng.Assert;
//import javamaven.hello;
//import java.util.*;

public class hellotest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expected="Hello";
		  hello test=new hello();
		  Assert.assertEquals(test.main(null),expected);
	}
}
