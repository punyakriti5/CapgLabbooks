package capg.lab9;

import java.util.function.BiFunction;

public class Ex1PowerX {

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Double> fun = (x, y) -> Math.pow(x, y);
		double res = fun.apply(2, 4);
		System.out.println(res);

	}

}