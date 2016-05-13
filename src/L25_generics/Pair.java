package L25_generics;

//public class Pair <P,R,S,T> {
public class Pair <T> {
	private T first;
	private T second;

//	private S some;


	public Pair(T first, T second) {
		this.first = first;
		this.second = second;
	}

	public T getFirst() {
		return first;
	}

	public T getSecond() {
		return second;
	}
}
