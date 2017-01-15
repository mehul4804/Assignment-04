public class Constructor_chaining
{
	public static void main(String[] args) 
	{
	new Child();
	}
}

	class Parent
	{
		protected String name;

		public Parent()
		{
		this("");
		System.out.println("no arugument based constructor of Parent class");
	}
	public Parent(String name)
		{
		this.name = name;
		System.out.println("one arugument based constructor of Parent class");
	}
	}
	class Child extends Parent
	{
		public Child()
		{
		System.out.println("no arugument based constructor of Child class");
		}
		public Child(String name)
		{
			super(name);
		System.out.println("one arugument based constructor of Child class");
	}
	}


























	