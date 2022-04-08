package mypack;

import java.util.Scanner;

public class StackMain {

	public static void main(String[] args) 
	{
		int n,ch,e;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter Stack value here:\n");
		n=sc.nextInt();
		Stack obj=new Stack(n);
		
		do
		{
			System.out.println("\n1.push\n2.pop\n3.print\n4.peak\n0.Exit\n");
			
			ch=sc.nextInt();
			switch(ch)
			{
			case 1://push
				if(obj.isFull()==false)
				{
					System.out.println("Enter Stack Element");
					e=sc.nextInt();
					obj.push(e);
				}
				else
				{
					System.out.println("STack is Full");
				}
				break;
				
			case 2://pop
				if(obj.isEmpty()==false)
				{
					System.out.println("Pop");
					obj.pop();
				}
					else
						System.out.println("Stack is empty");
				break;
				
			case 3:
				//if(obj.isEmpty()==false)
				{
					System.out.println("Stack has\n");
					obj.print();
				}
				//else
				//	System.out.println("Stack is empty");
				break;
				
			case 4:
				if(obj.isEmpty()==false)
				{
				System.out.println("Peak is"+obj.atPeak());
				}
				else
					System.out.println("Stack is empty");
				break;
				
			
				
			case 0:
				{
					System.out.println("*******Exit******");
				}
				break;
				
				default:
					System.out.println("Enter valid choice");
			}
			
		}
	    			while(ch!=0);
		           sc.close();
	}
}

				
				
			
				
				
		