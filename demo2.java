class Demo2
{
	public static void main(String args[])
	{
		System.out.println("Method overloading");
		test1();
		test1("5");
		test1("5","6");
		test1(7,"8");
		test1("8",7);
		Demo2 obj=new Demo2();
		obj.test1(7.8f);
	}
	static void test1()
	{
		System.out.println("Method 1");
	}
	static void test1(String a)
	{
		System.out.println("Method 2   " +a);
	}
	static void test1(String b,String a)
	{
		System.out.println("Method 3   "+b+"  "+a);
	}
	static void test1(int b,String a)
	{
		System.out.println("Method 3   "+b+"  "+a);
	}
	static void test1(String b,int a)
	{
		System.out.println("Method 3   "+b+"  "+a);
	}
	/*static void test1(int a,String b)
	{
		System.out.println("Method 3   "+b+"  "+a);
	}*/
	public void test1(float a)
	{
		System.out.println("Method 4 "+a);
		
	}
}