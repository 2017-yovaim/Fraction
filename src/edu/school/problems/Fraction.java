package edu.school.problems;

public class Fraction {
	
	private int numerator;
	private int denominator;

	
	public Fraction() {
		numerator = 0;
		denominator = 1;
	}
	
	public Fraction(int numeratorValue, int denominatorValue) {
		numerator = numeratorValue;
		if(denominatorValue != 0)
			denominator = denominatorValue;
	}
	
	public Fraction(int numeratorValue) {
		numerator = numeratorValue;
		denominator = 1;
	}
	
	public String toString() {
		String result = numerator + "/" + denominator;
		return result;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public void simplify() {
		if(numerator > denominator) {
			for(int i = denominator; i >= 2; i--) {
				if(denominator % i == 0 && numerator % i == 0) {
					numerator /= i;
					denominator /= i;
				}
			}
		}
		else if (denominator > numerator) {
			for(int i = numerator; i >= 2; i--) {
				if(denominator % i == 0 && numerator % i == 0) {
					numerator /= i;
					denominator /= i;
				}
			}
		}
		else {
			numerator = 1;
			denominator = 1;
		}
	}
	
	public Fraction add(Fraction f) {
		Fraction fCopy = new Fraction(f.getNumerator(), f.getDenominator());
		Fraction addResult = new Fraction(numerator, denominator);
		int fDenominatorCopy = f.getDenominator();
		int resultDenominatorCopy = addResult.getDenominator();
		fCopy.denominator *= resultDenominatorCopy;
		fCopy.numerator *= resultDenominatorCopy;
		addResult.denominator *= fDenominatorCopy;
		addResult.numerator *= fDenominatorCopy;
		addResult.numerator += fCopy.numerator;
		
		addResult.simplify();
		return(addResult);
	}
	
	public Fraction substract(Fraction f) {
		Fraction fCopy = new Fraction(f.getNumerator(), f.getDenominator());
		Fraction substractResult = new Fraction(numerator, denominator);
		int fDenominatorCopy = f.getDenominator();
		int resultDenominatorCopy = substractResult.getDenominator();
		fCopy.denominator *= resultDenominatorCopy;
		fCopy.numerator *= resultDenominatorCopy;
		substractResult.denominator *= fDenominatorCopy;
		substractResult.numerator *= fDenominatorCopy;
		substractResult.numerator -= fCopy.numerator;
		
		substractResult.simplify();
		return(substractResult);
	}
	
	public Fraction multiply(Fraction f) {
		Fraction fCopy = new Fraction(f.getNumerator(), f.denominator);
		Fraction multiplyResult = new Fraction(numerator, denominator);
		multiplyResult.numerator *= fCopy.getNumerator();
		multiplyResult.denominator *= fCopy.getDenominator();
		
		multiplyResult.simplify();
		return(multiplyResult);
	}
	
	public Fraction divide(Fraction f) {
		Fraction fCopy = new Fraction(f.getNumerator(), f.denominator);
		Fraction divideResult = new Fraction(numerator, denominator);
		divideResult.numerator *= fCopy.getDenominator();
		divideResult.denominator *= fCopy.getNumerator();
		
		divideResult.simplify();
		return(divideResult);
	}
	
	
 }




