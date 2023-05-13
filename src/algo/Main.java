package algo;

public class Main {

	private static int test_num = 1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1 t1 = new test1();
		t1.print();
	}
	static class test1{
		test2 t = new test2();
		
		void print() {
			t.print();
			System.out.println("Dfff" + test_num);
		}
	}
	
	static class test2{
		void print() {
			System.out.println("ddasfasdasasdv" + test_num);
			test_num = 2;
		}
	}
}
