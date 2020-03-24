package Tddjunitdemo.Tddjunitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Remove2charstest {
/*TODO list
 * 1.ABCD=>BCD
 * 2.AACD=>CD
 * 3.BACD=>BCD
 * 4.BBAA=>BBAA
 * 5.AABAA=>BAA
 * 
 */
	Remove2chars r;
	@BeforeEach
	void setUp()
	{
		r=new Remove2chars();
	}
	@Test
	void test1chars()
	{
	String actual=r.remove("ABCD");
	assertEquals("BCD",actual);
	}
	@Test
	void test2chars()
	{
	String actual=r.remove("AACD");
	assertEquals("CD",actual);
	}
	@Test
	void testsecondchar()
	{
	String actual=r.remove("BACD");
	assertEquals("BCD",actual);
	}
	@Test
	void test0chars()
	{
	String actual=r.remove("BBCD");
	assertEquals("BBCD",actual);
	}
	@Test
	void testtwochars()
	{
	String actual=r.remove("AABAA");
	assertEquals("AABAA",actual);
	}

}
