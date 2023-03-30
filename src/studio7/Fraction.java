package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int n,int d) {
		numerator = n;
		denominator = d;
	}
	public int getDenominator() {
		return denominator;
	}
	public int getNumerator() {
		return numerator;
	}
	
	public Fraction getSum(Fraction f1) {
		int newNumerator1;
		int newNumerator2;
		int newDenominator1;
		if (denominator != f1.getDenominator()) {
			newDenominator1 = denominator*f1.getDenominator();
			newNumerator1 = numerator*f1.getDenominator();
			newNumerator2 = f1.getNumerator()*denominator;
		}
		else {
			newDenominator1 = denominator;
			newNumerator1 = numerator;
			newNumerator2 = f1.getNumerator();
		}
		int newNumerator = newNumerator1 + newNumerator2;
		return new Fraction(newNumerator,newDenominator1);
	}
	public Fraction multiply(Fraction f1) {
		int newNumerator = numerator*f1.getNumerator();
		int newDenominator = denominator*f1.getDenominator();
		return new Fraction(newNumerator,newDenominator);	
	}
}
