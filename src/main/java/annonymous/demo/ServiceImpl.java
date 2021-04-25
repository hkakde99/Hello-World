package annonymous.demo;

public class ServiceImpl {
	
	Service s1 = new Service() {
		@Override
		public void modifyRecord() {
			System.out.println("Implementation 1");
		}

		@Override
		public void deleteRecord() {
			System.out.println("Implementation 1");
		}
	};

	Service s2 = new Service() {
		@Override
		public void modifyRecord() {
			System.out.println("Implementation 2");
		}

		@Override
		public void deleteRecord() {
			System.out.println("Implementation 2");
		}
	};

	Service s3 = new Service() {
		@Override
		public void modifyRecord() {
			System.out.println("Implementation 3");
		}

		@Override
		public void deleteRecord() {
			System.out.println("Implementation 3");
		}

	};
}













