package application;

public class Modal {
	public String calculate(double num1, double num2, String operator) {
		
		switch (operator) {
		case "+":
			return String.valueOf(num1+num2);
		case "-":
			return String.valueOf(num1-+num2);
		case "*":
			return String.valueOf(num1*num2);
		case "/":
			if(num2 == 0)
				return "Infinity";
			return String.valueOf(num1/num2);
		default:
			return String.valueOf(0);
		}
	}
}
