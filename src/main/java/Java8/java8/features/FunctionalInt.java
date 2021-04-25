package Java8.java8.features;

@FunctionalInterface
public interface FunctionalInt {
	
     void sum(int a, int b);
     
     default void m1() {
    	 
     }
     static void m2() {
    	 
     }
     static void m3() {
    	 
     }
     
}
@FunctionalInterface
interface B extends FunctionalInt{
	
}
