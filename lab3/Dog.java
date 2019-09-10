package lab3;

public class Dog extends Animal implements Comparable<Dog> {
	
	public Dog(String n, int l) {
		super(n, l);
	}
	
	public String toString() {
		return (super.name + " " + super.legs);
	}

	public int compareTo(Dog d) {
		int ret = 0;
		if(this.legs == d.legs) {
			ret = this.name.compareTo(d.name);
		} else {
			ret = this.legs - d.legs;
		}
		
		return ret;
	}

}
