import java.util.Arrays;
import java.util.Scanner;

public class Cudoviste {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int r,c;
		int [] result = new int [5];
		Arrays.fill(result, 0);
		
		while(true){
			System.out.print("R = ");
			r = scan.nextInt();
			System.out.print("C = ");
			c = scan.nextInt();
			if(r>= 2){
				if(c<=50){
					break;
				}else{
					System.out.println("C debe ser menor o igual que 50.");
				}
			}else{
				System.out.println("R debe ser mayor o igual que 2.");
			}
		}
		
		//Fill the parking spaces
		char[][] parking = new char[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				parking[i][j] = scan.next().charAt(0);
			}
		}
		scan.close();
		
		//Show parking spaces
		System.out.println("Estado actual del parking: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(parking[i][j]);
			}
			System.out.println();
		}
		
		for (int i = 0; i < r - 1; i++) {
			for (int j = 0; j < c - 1; j++) {
				if(parking[i][j] != '#' && parking[i][j + 1] != '#' && parking[i + 1][j] != '#' && parking[i + 1][j + 1] != '#'  ){
					result[(parking[i][j] != 'X' ? 1 : 0) + (parking[i][j+1] != 'X' ? 1 : 0) + (parking[i+1][j] != 'X' ? 1 : 0) + (parking[i+1][j+1] != 'X' ? 1 : 0)]++;  
				}
			}
		}
		
		for (int i = 5; i == 0; i--) System.out.println(result[i]);
		
	}

}
