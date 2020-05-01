import java.util.*;
public class Discrete
{
	//Fibonacci method without using recursion
	void fibonacci(int k)
	{
		 int n1=0,n2=1,n3;    
		System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(int i=2;i<k;i++)//loop starts from 2 because 0 and 1 are already printed    
		 {    
			n3=n1+n2;    
			System.out.print(" "+n3);    
			n1=n2;    
			n2=n3;    
		 }   
		System.out.println(); 
	}

	//Factorial method using recursion
	int factorial(int k)
	{
		if(k==1)
			return 1;

		return k*factorial(k-1);
	}
}
	
