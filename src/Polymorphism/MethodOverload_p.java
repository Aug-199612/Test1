package Polymorphism;


public class MethodOverload_p {
	public void add(){
		System.out.println("addition ="+(10+20));
		
	}

	public void add1(int a){
		System.out.println("addition1 ="+(a+a));
		
	}
	public void add2(double b){
		System.out.println("addition2 ="+(b+b));
		
	}
	public void add3(double b){
		System.out.println("addition3 ="+(b+b));
		
	}
	public void add4(int n,int m){
		System.out.println("addition4 ="+(n+m));
		
	}
}
//1) Compile time polymorphism
//Which exist in compile time, it is also called as early binding OR static polymorphism
//In Compile time Polymorphism method declaration is going to get binded to its
//definition at compilation time, based on argument/input/parameter/signature is
//known as compile time Polymorphism.
//As binding takes during compilation time only, so it is also known as early binding.
//Method overloading is an example of compile time Polymorphism.
