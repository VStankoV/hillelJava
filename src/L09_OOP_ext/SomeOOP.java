package L09_OOP_ext;

public class SomeOOP implements Comparable{     //ctrl+p - parameters of method
	@Override
	public int compareTo(Object o) {
		SomeOOP other = (SomeOOP) o;
		if(other.equals(this)){
			return 0;
		}
		return 0;

		//return other.age - this.age
		//
	}

}
