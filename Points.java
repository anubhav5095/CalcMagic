import java.util.*;
//Points class for subject Points
public class Points
{
	void midpoint(int x1, int y1, int x2, int y2)
	{
		int xm=(x1+x2)/2;
		int ym=(y1+y2)/2;
		System.out.println("Midpoint of : ("+x1+","+y1+") and ("+x2+","+y2+") = ("+xm+","+ym+")");
	}

	void distance(int x1, int y1, int x2, int y2)
	{

		double dis= Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		System.out.println("Distance between the points :("+x1+","+y1+") and ("+x2+","+y2+") ="+dis);
	}

	//method for Extra Credits
	void standardDeviation()
	{
		LinkedList list= new LinkedList();
		Scanner sc=new Scanner(System.in);
		//linkedlist for storing points
		System.out.println("Enter the number of points to be added to linkedlist");
		int n=sc.nextInt();
		for (int i=0;i<n ;i++ ) 
		{
			System.out.println("Enter the point");
			int x=sc.nextInt();
			int y=sc.nextInt();
			list.add(x,y);
		}
		list.calculateMean();
	}
	

	//class LinkedList to add the points in linked list 
	class LinkedList 
	{ 
		Node head;  // head of list 
	  
	    /* Linked list Node*/
		class Node 
		{ 
			int x,y; 
			Node next; 
			Node(int x, int y) 
			{ 
				this.x = x; 
				this.y = y; 
				next = null; 
			} 
		}

		//method add to push points to the tail of the linkedlist
		void add(int xp, int yp) 
		 { 
			/* 1 & 2: Allocate the Node & Put in the data*/
			Node new_node = new Node(xp,yp); 
  
			/* 3. Make next of new Node as head */
			new_node.next = head; 
 
			/* 4. Move the head to point to new Node */
			head = new_node; 
		}

		void calculateMean()
		{
			Node temp= head;
			int sumx=0,sumy=0,count=0;		//variable for storing sum of x and y coordinates
			while(temp!=null)
			{
				count++;
				sumx+=temp.x;
				sumy+=temp.y;
				temp = temp.next;
			}
			double avgx=(double)sumx/count;
			double avgy= (double)sumy/count;
			System.out.println("Mean of x-coordinates :"+avgx);
			System.out.println("Mean of y-coordinates :"+avgy);

		}
	}
}
	
