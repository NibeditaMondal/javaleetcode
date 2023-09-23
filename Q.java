class Test { 
  int x; //instance variable
  double y;
  // Constructor with a parameter 
  // Constructor is an instantiation of an object. it means representation of an object.
  Test(int j) { 
    this.x = j; 
   //x=j;
   //x=x;
  } 
  Test()
  {
	//  y=0;
  }

  // Call the constructor
  public static void main(String args[])
  {
	Test t = new Test();
	Test r = new Test(5);
    System.out.println("Value of x = " + r.x);
	System.out.println("Value of y = " + t.y);
  } 
}
