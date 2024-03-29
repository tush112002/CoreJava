package lambda;

public class TestMyLambda {
	
	public static void main(String[] args) {
		MyLambda myl = new LambdaImpl();
		
		MyLambda mylLambda = () -> System.out.println("Lambda Called!");	
		
		mylLambda.doWork();
		myl.doWork();
		
	}

}
