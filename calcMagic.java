/**
*Driver class for the project.
*/
import java.util.*;
public class calcMagic
{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//opening menu displaying
		System.out.println("Welcome to CalcMagic! Please choose a subject!");
		System.out.println("1. Algebra");
		System.out.println("2. Points");
		System.out.println("3. Trigonometry");
		System.out.println("4. Calculus");
		System.out.println("5. Discrete");
		int subject=sc.nextInt();		//choice for subject
		switch(subject)					//menu driven caases as per choices
		{	
			case 1 :	//case for Algebra subject
				{
					//object for Algebra class to use methods and operation
					Algebra al= new Algebra();
					System.out.println("You Chose Algebra! Choose one of the following operations");
					System.out.println("1. Sum");
					System.out.println("2. Difference");
					System.out.println("3. Product");
					System.out.println("4. Quotient");
					System.out.println("5. Remainder");
					System.out.println("6. Power and Exponent");
					int choice=sc.nextInt();		//choice of operations
					switch(choice)
					{
						case 1: 
							{
								System.out.println("Enter two numbers");
								int n1=sc.nextInt();
								int n2 = sc.nextInt();
								System.out.println(n1+"+"+n2+"="+al.sum(n1,n2));
								break;
							}
						case 2: 
							{
								System.out.println("Enter two numbers");
								int n1=sc.nextInt();
								int n2 = sc.nextInt();
								System.out.println(n1+"-"+n2+"="+al.difference(n1,n2));
								break;
							}
						case 3: 
							{
								System.out.println("Enter two numbers");
								int n1=sc.nextInt();
								int n2 = sc.nextInt();
								System.out.println(n1+"*"+n2+"="+al.product(n1,n2));
								break;
							}
						case 4: 
							{
								System.out.println("Enter two numbers");
								int n1=sc.nextInt();
								int n2 = sc.nextInt();
								System.out.println(n1+"/"+n2+"="+al.quotient(n1,n2));
								break;
							}
						case 5: 
							{
								System.out.println("Enter two numbers");
								int n1=sc.nextInt();
								int n2 = sc.nextInt();
								System.out.println(n1+"%"+n2+"="+al.remainder(n1,n2));
								break;
							}
						case 6: 
							{
								System.out.println("Enter two numbers");
								int n1=sc.nextInt();
								int n2 = sc.nextInt();
								System.out.println(n1+"^"+n2+"="+al.power(n1,n2));
								break;
							}
						default:
							System.out.println("Wrong choice");
							break;
							
					}
					break;
				}


				//Case for points subject
			case 2 :	
				{
					Points p= new Points();
					System.out.println("You Chose Points! Choose one of the following operations");
					System.out.println("1. Midpoint of two points");
					System.out.println("2. Distance Between two points");
					System.out.println("3. Standard deviation of points");
					int choice=sc.nextInt();		//choice of operations
					switch(choice)
					{
						//cases for operation of points
						case 1: 
							{
								System.out.println("Enter two points");
								int xi=sc.nextInt();
								int yi = sc.nextInt();
								int xf=sc.nextInt();
								int yf=sc.nextInt();
								p.midpoint(xi,yi,xf,yf);
								break;
							}
						case 2: 
							{
								System.out.println("Enter two points");
								int xi=sc.nextInt();
								int yi = sc.nextInt();
								int xf=sc.nextInt();
								int yf=sc.nextInt();
								p.distance(xi,yi,xf,yf);
								break;
							}
						case 3: 
							{
								p.standardDeviation();
								break;
							}
						default:
							System.out.println("Wrong choice");
							break;
					}
					break;
				}

				//Case for trigonometry subject
			case 3 :	
				{
					Trigonometry t= new Trigonometry();			//Trigonometry object
					System.out.println("You Chose Trigonometry! Choose one of the following operations");
					System.out.println("1. Cosine (cos)");
					System.out.println("2. Sine (sin)");
					System.out.println("3. Tangent (tan)");
					System.out.println("4. Secant (sec)");
					System.out.println("1. Cosecant (csc)");
					System.out.println("1. Cotangent (cot)");
					int choice=sc.nextInt();		//choice of operations
					switch(choice)
					{
						case 1: 
							{
								System.out.println("Enter a number");
								int num=sc.nextInt();
								t.cosine(num);
								break;
							}
						case 2: 
							{
								System.out.println("Enter a number");
								int num=sc.nextInt();
								t.sine(num);
								break;
							}
						case 3: 
							{
								System.out.println("Enter a number");
								int num=sc.nextInt();
								t.tangent(num);
								break;
							}
						case 4: 
							{
								System.out.println("Enter a number");
								int num=sc.nextInt();
								t.sec(num);
								break;
							}
						case 5: 
							{
								System.out.println("Enter a number");
								int num=sc.nextInt();
								t.cosec(num);
								break;
							}
						case 6: 
							{
								System.out.println("Enter a number");
								int num=sc.nextInt();
								t.cot(num);
								break;
							}
						default:
							System.out.println("Wrong choice");
							break;

					}
					break;
				}

			//case for Calculus subject
			case 4 :	
				{
					Calculus c= new Calculus();			//Trigonometry object
					System.out.println("You Chose Calculus! Choose one of the following operations");
					System.out.println("1. Arithematic Sum");
					int choice=sc.nextInt();		//choice of operations
					switch(choice)
					{
						case 1:
							{
								System.out.println(" Enter the value of n");
								int n=sc.nextInt();
								c.sumAr(n);
								break;
							}
						default:
							System.out.println("Wrong choice");
							break;
					}
					break;
				}

			//case for Discrete subject
			case 5 :	
				{
					Discrete dc= new Discrete();			//Discrete object
					System.out.println("You Chose Discrete! Choose one of the following operations");
					System.out.println("1. Fibonacci Sequence");
					System.out.println("2. Factorial");
					int choice=sc.nextInt();		//choice of operations
					switch(choice)
					{
						case 1 :
							{
								System.out.println(" Enter the value of n");
								int n=sc.nextInt();
								System.out.print("Fibonacci sequence of "+n+" : ");
								dc.fibonacci(n);
								break;
							}
						case 2:
							{
								System.out.println(" Enter the value of n");
								int n=sc.nextInt();
								System.out.println("Factorial or "+n+"! = "+dc.factorial(n));
								break;
							}
						default:
							System.out.println("Wrong choice");
							break;
					}
					break;
				}
			default:
					System.out.println("Wrong choice");
					break;
		}

	}
}
