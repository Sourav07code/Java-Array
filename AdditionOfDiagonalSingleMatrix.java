import java.util.*;
public class AdditionOfDiagonalSingleMatrix {  //Addition of Diagonal in a Single Matrix. 

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a[][]=new int[3][3];
		int sum=0;


		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==j) {
					sum+=a[i][j];
				}

			}


		}
		System.out.println(sum);




	}

}
