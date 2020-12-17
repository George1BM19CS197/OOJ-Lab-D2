class Generics<T, U> {
	T ob1;
	U ob2;


	Generics(T x, U y) {
		ob1 = x;
		ob2 = y;
	}

	T getob1() {
		return ob1;
	}

	U getob2() {
		return ob2;
	}

	void display() {
		System.out.println("Ob1: " + getob1());
		System.out.println("Ob2: " + getob2());
	}

	U join() {
		if (ob1 instanceof Integer && ob2 instanceof Integer) {
			int i1 = (Integer)getob1();
			int i2 = (Integer)getob2();
			return (U) new Integer(i1 + i2);
		}
		else if (ob1 instanceof Double && ob2 instanceof Double) {
			double d1 = (Double)getob1();
			double d2 = (Double)getob2();
			return (U) new Double(d1 + d2);
		}
		else if (ob1 instanceof String && ob2 instanceof String) {
			String s1 = (String)getob1();
			String s2 = (String)getob2();
			return (U) new String(s1 + s2);
		}
		else {
			return (U) new String("ERROR! ob1 and ob2 Type Mismatch...");
		}
	}
}

class Lab7 {
	public static void main(String[] args) {

		Generics<Integer, Integer> iObj = new Generics<Integer, Integer>(5,4);
		iObj.display();
		System.out.println("Sum: " + iObj.join());
		System.out.println();

		Generics<Double, Double> dObj = new Generics<Double, Double>(3.05,4.02);
		dObj.display();
		System.out.println("Sum: " + dObj.join());
		System.out.println();

		Generics<String, String> sObj = new Generics<String, String>("Hello,", " How are you?");
		sObj.display();
		System.out.println("Concatanation: " + sObj.join());
		System.out.println();

	}
}