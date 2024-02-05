package Week1_Test;

public class prob2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 25;
int k = 4;
int ans = 0;
while(k-->0) {
	for(int i=2;i<=n;i++) {
		if(n%i==0) {
			ans = i;
			break;
		}
	}
	n = ans+n;
}
System.out.println(n);
	}

}
