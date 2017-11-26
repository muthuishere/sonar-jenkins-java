package com.deemwar.sonar;


public class Calculator {
    public enum BiOperatorModes {
        normal, add, minus, multiply, divide
    }

    public enum MonoOperatorModes {
        square, squareRoot, oneDevidedBy, cos, sin, tan
    }

    private Double num1, num2;
    private BiOperatorModes mode = BiOperatorModes.normal;

    private Double calculateBiImpl() {
        if (mode == BiOperatorModes.normal) {
            return num2;
        }
        if (mode == BiOperatorModes.add) {
            return num1 + num2;
        }
        if (mode == BiOperatorModes.minus) {
            return num1 - num2;
        }
        if (mode == BiOperatorModes.multiply) {
            return num1 * num2;
        }
        if (mode == BiOperatorModes.divide) {
            return num1 / num2;
        }

        // never reach
        throw new Error();
    }

    public Double calculateBi(BiOperatorModes newMode, Double num) {
        if (mode == BiOperatorModes.normal) {
            num2 = 0.0;
            num1 = num;
            mode = newMode;
            return Double.NaN;
        } else {
            num2 = num;
            num1 = calculateBiImpl();
            mode = newMode;
            return num1;
        }
    }

	public String getEnglishValue(int i){
		
		if(i == 1)
			return "one";
		else if(i == 2)
			return "two";
		else if(i == 3)
			return "three";
		else if(i == 4)
			return "four";
		else if(i == 5)
			return "five";
		else if(i == 6)
			return "six";
		else if(i == 7)
			return "seven";
		else if(i == 8)
			return "eight";
		else if(i == 9)
			return "nine";
		else if(i == 0)
			return "zero";
		
		return "unknown";
		
	}
    public Double calculateEqual(Double num) {
        return calculateBi(BiOperatorModes.normal, num);
    }

    public Double reset() {
        num2 = 0.0;
        num1 = 0.0;
        mode = BiOperatorModes.normal;

        return Double.NaN;
    }

    public Double calculateMono(MonoOperatorModes newMode, Double num) {
        if (newMode == MonoOperatorModes.square) {
            return num * num;
        }
        if (newMode == MonoOperatorModes.squareRoot) {
            return Math.sqrt(num);
        }
        if (newMode == MonoOperatorModes.oneDevidedBy) {
            return 1 / num;
        }
        if (newMode == MonoOperatorModes.cos) {
            return Math.cos(num);
        }
        if (newMode == MonoOperatorModes.sin) {
            return Math.sin(num);
        }
        if (newMode == MonoOperatorModes.tan) {
            return Math.tan(num);
        }

        // never reach
        throw new Error();
    }

}