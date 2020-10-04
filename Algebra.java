/**
*Algebra Class for the project
*/
import java.util.*;
public class Algebra
{
	int sum(int a, int b)
	{
		return a+b;
	}

	int difference(int a, int b)
	{
		return a-b;
	}

	int product(int a, int b)
	{
		return a*b;
	}

	int quotient(int a, int b)
	{
		return a/b;
	}

	int remainder(int a, int b)
	{
		return a%b;
	}

	int power(int a, int b)
	{
		
	    if (b != 0)
	        return (a * power(a, b - 1));
	    else
	        return 1;
	}
}
	
