/*Inheritance with special clauses(keywords): -
1. sealed 2. non-sealed 3. final
Using these clauses needs special parameter.
For sealed class we need permits keywords.
What is this sealed keyword. Any class using sealed keyword means we are limiting the inheritance to some classes using permits keyword.
Syntax: -
sealed class A permits B, C 
{body}
class B extends A {body}
class C extends A {body}
Now this will give an error. Why?
Using special clauses the child class should hold some special clauses. So the actual answer is: -
sealed class A permits B, C 
{body}
sealed class B extends A permits D{body}
non-sealed class C extends A {body}
final class D extends B {body}
You can use non-sealed, sealed and final clause with the sealed parent class.
For final keyword used with class you cannot inherit it anymore.
*/
sealed class A permits B, C //, D --> Error? If permit clause is given it is mandatory to extend the parent class. So a subclass cannot be permitted from two sealed class.
{
	public void test(String msg)
	{
		System.out.println("Class A: -"+msg);
	}
}
//Sealed --> Sealed
sealed class B extends A permits D 
{
	public void test(String msg)
	{
		System.out.println("Class B: -"+msg);
	}
}
//Sealed --> Non-Sealed
non-sealed class C extends A {
	public void test(String msg)
	{
		System.out.println("Class C: -"+msg);
	}
}
//Final class cannot be inherited anymore. Sealed --> Final
final class D extends B
{
	public void test(String msg)
	{
		System.out.println("Class D: -"+msg);
	}
}
//Showing inheritance from non-sealed to sealed class.
//sealed class E extends C  [without permit clause will give an error.]
sealed class E extends C permits F
{
	public void test(String msg)
	{
		System.out.println("Class E: -"+msg);
	}
}
// Subclass present in permit clause must inherit the sealed class.
//class F extends E --> Error as no clause is mentioned before class.
final class F extends E
{
	public void test(String msg)
	{
		System.out.println("Class F: -"+msg);
	}
}
//non-sealed can be inherited with/without any clause and does not need permit clause.
//So It can be inherited from any event.
class G extends C
{
	public void test(String msg)
	{
		System.out.println("Class G: -"+msg);
	}
}
class Test
{
	public static void main(String args[])
	{
		// parent class  obj = new child class();
		A a = new B();
		a.test("Hi");
		
		A a1= new C();
		a1.test("Hi");
		
		B b = new D();
		b.test("Hi");
		
		C c = new E();
		c.test("Hi");
		
		C c1 = new G();
		c1.test("Hi");
		
		E e = new F();
		e.test("Hi");		
	}
}