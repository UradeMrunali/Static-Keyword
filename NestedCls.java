class Demo
{
 static class MyDemo
{
		void myfun()
{
			System.out.println("this is in mydemo cls");
}
}
	
	void fun()
	{
		System.out.println("this is in demo");
	}
}

public class NestedCls {
	public static void main(String[] args) {
		
	
	Demo d= new Demo();
	
	Demo.MyDemo d1= new Demo.MyDemo();
	
	 d.fun();
	 d1.myfun();
    
    
    
	}
}


