package leetcode;

public class solution {
	
public static int tribonacci(int n) {
	
	if (n<3) return n==0?0:1;
	
	int[] F= new int[n+1];
	int ans =0;
	F[0]=0;
	F[1]=F[2]=1;
	
	for (int i =3; i< n+1; i++) {
		F[i] = F[i-1]+F[i-2]+F[i-3];

	}
	
	return F[n];
       
  }

public static void main(String[] args) {
	
	int a= 25;
	System.out.println(tribonacci(a));
}

}
