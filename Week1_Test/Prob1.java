package Week1_Test;

public class Prob1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int xo=3;
int []xoe = {xo,xo-1,xo+1,xo+4};
int n = 4;
int []xoo = {xo,xo+1,xo-1,xo-4};
if(xo%2==0) System.out.println(xoe[n%4]);
else System.out.println(xoo[n%4]);

	}

}
