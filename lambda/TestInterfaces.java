package lambda;

public class TestInterfaces {

	public static void main(String[] args) {
		
		Foo fooImpl = new FooImpl();
		
		Foo foo = new Foo() {
			public void bar() {
				System.out.println("Method Local Anonymous Inner Class Impl");
			}
		};
		
		Foo fooLambda = () -> System.out.println("Foo Lambda Impl");
		
		fooImpl.bar();
		foo.bar();
		fooLambda.bar();
		
	}
}
