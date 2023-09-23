class E
{
	//int i; // instance variable
	//Constructor Overloading
	E(int i) //parameterized construtor
	{
		this.i=0;
//this.local variable from parameter = instance variable
	}
	E()
	{}
	//method overloading
	static void test1()//method signature=method name+ parameter
	{
		int i=5;
		int j;
		j=4;
		j=5; //variable overwriting
		System.out.println(i+" "+j);
		var k=6;
		//var l;
		//k=6;
		System.out.println(k+" "+((Object)k).getClass().getSimpleName());

	}
	static void test1(int i)//formal parameter always in method
	{
		i=i+10;
	    System.out.println(i);	
	}
	public static void main (String args[])
	{
		test1();
		test1(5);//actual parameter //widening concept or auto casting for smaller data types
		E test; //blank construtor
		test=new E();
		test=new E(10); // variable overwriting
		test.nibedita();
	}
	 void nibedita()
	{
		System.out.println("Nibee");
	}
}
