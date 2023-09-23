class N
{
	static int n;//static is per class one copy.(single copy shared by many objects).
	//instance --> per object independent one copy.
	int i;
	N()
	{
		n=10;
		i=15;		
	}
	public static void main(String args[])
	{
		//n=10;
	N o=new N();
		o.test3(5);
		o.test3(n);//actual argument
		o.test3();
		o.test3(n);//actual argument
		
	}
	public void test3(int i)//int i is the formal argument
	{
		//this.i=i;
	System.out.println(i);	
	}
	public void test3()
	{
		//this.i=i;
	System.out.println(i);	
	}
}