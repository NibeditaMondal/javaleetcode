class D extends Object
{
	public static void main (String args[])
   {
	 System.out.println("psvm");
	System.out.println(Thread.currentThread().getName());	
   } 
     static 
	{
	System.out.println("Static Block2");	
	System.out.println(Thread.currentThread().getName());	
   } 
    static 
	{
	System.out.println("Static Block1");	
	System.out.println(Thread.currentThread().getName());	
   }   
   /*static 
	{
	System.out.println("Static Block");	
	System.out.println(Thread.currentThread().getName());	
  
	System.out.println("Static Block");	
	System.out.println(Thread.currentThread().getName());	
   }   
   */
}
 class C
{
	
	public static void main(String ...args)
	{
	System.out.println("hey me Nibu");
	}
}