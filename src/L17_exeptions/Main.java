package L17_exeptions;

public class Main {
	public static void main(String[] args) {
		try {
			int i = 1/0;
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		} finally {
			throw new RuntimeException();
		}
	}
}
