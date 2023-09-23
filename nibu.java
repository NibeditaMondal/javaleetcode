class B 
{
public static void main (String args[])
   {
	   System.out.println(System.getProperty("os.name"));
	   System.exit(0);
	   System.out.println(System.getProperty("user.name"));
	   System.out.println(System.getProperty("java.vm.name"));
	   System.out.println(System.getProperty("java.vendor"));
	   System.out.print("hehe1");
	   System.out.print(System.getProperty("line.separator"));
	   System.out.println("hehe2");
	 System.out.println("psvm");
	System.out.println(Thread.currentThread().getName());
	}
}