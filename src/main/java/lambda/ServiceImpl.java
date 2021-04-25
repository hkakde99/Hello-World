package lambda;

public class ServiceImpl {

	static Service service1 = (int id, String name) -> {
		System.out.println("Record is added by service 1");
	};

	static Service service2 = (int id, String name) -> {
		System.out.println("Record is added by service 2");
	};

	public static void main(String[] args) {
		service1.addRecord(12, "AAA");
		
		service2.addRecord(87, "KKK");
		
		ServiceImpl2 obj = new ServiceImpl2();
		obj.service3.addRecord(65, "HHH");

	}

}

class ServiceImpl2 {
	Service service3 = (int id, String name) -> {
		System.out.println("Record is added by service 3");
	};
}
