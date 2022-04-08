package mypack;

 class Stack {
	int s[],size,e,tos;
	
	Stack(int size)
	{
		this.size=size;
		tos= -1;
		s=new int[size];
	}
	
		public void push(int e)
	{
		tos++;//tos increment 
		s[tos]=e;//tos increment then added element "e" goes in array  "s"
	}
	
		public boolean isFull()
	{
			if(tos==size-1)
				return(true);
			else
				return(false);
	}
		public int pop()
			{
			int t=s[tos];//in array tos were presene this value copy to "t"and tos decrement next element
				tos--;
				return(t);//above poped value which stored in "T" is now return
				
			}
		public boolean isEmpty()
		{
			if(tos==-1)//now check if tos value at-1 means initial position that time no any element in stack ..its empty stack
				return(true);
			else
				return(false);
		}
		
		public int atPeak()//is only show top element of stack...so tos position=top of stack
		{
			return(s[tos]);
		}
		public void print()
		{
			for(int i=tos; i>=0; i--)
				
			System.out.println(s[i]);
			
		}
	
}
