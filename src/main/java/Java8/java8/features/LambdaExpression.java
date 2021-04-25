package Java8.java8.features;

public class LambdaExpression {
	
	
	FunctionalInt result = (int a, int b)->System.out.println("SUM :"+a+b);
	
	public void m1() {
		result.sum(19,29);
	}
	
public static void main(String[] args) {
	LambdaExpression obj = new LambdaExpression();
	obj.m1();
}


}