package edu.school.problems;

public class TestFraction {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(9, 27);
		Fraction f2 = new Fraction(2, 3);
		System.out.print("Sukratena " + f1 + " = ");
		f1.simplify();
		System.out.print(f1);
		System.out.println("");
		System.out.println(f1 + " + " + f2 + " = " + f1.add(f2));
		System.out.println(f1 + " - " + f2 + " = " + f1.substract(f2));
		System.out.println(f1 + " * " + f2 + " = " + f1.multiply(f2));
		System.out.println(f1 + " / " + f2 + " = " + f1.divide(f2));
		

	}

}
