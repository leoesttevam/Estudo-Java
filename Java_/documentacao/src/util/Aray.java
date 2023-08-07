package util;

import java.util.Arrays;

public class Aray {

	public static void main(String[] args) {
		
		double[] notasAluno = new double[3];
		
		notasAluno[0] = 7.9;
		notasAluno[1] = 8;
		notasAluno[2] = 6.7;
		
		for (double d : notasAluno) {
			System.out.println(d);
		}
		
		System.out.println();
		System.out.println(Arrays.toString(notasAluno));
		
		System.out.println();
		
		try {
			
			for(int i = 0; i <= notasAluno.length; i++) {
				System.out.println(notasAluno[i]);
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			e.getMessage();
		}
		
		System.out.println();
		
		double[] notasAlunoA = {6.9, 8.9, 5.5, 10};
		
		for (double v : notasAlunoA) {
			System.out.println(v);
		}
	}
}
