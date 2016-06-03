package L28_static_Singleton;

public class MyMain {
	static int i1;
	int i2;

	public MyMain(){
		i1++;
		i2++;
	}

	@Override
	public String toString() {
		return "i1 = " + i1 + ", i2 = " + i2;
	}

	public static void main(String[] args) {

		MyMain a = new MyMain();
		MyMain b = new MyMain();

		System.out.println(a);
		System.out.println(b);

	}
}
