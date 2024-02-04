package Lec_1;
import java.util.*;
public class LL_Client {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		LL ll = new LL();
		ll.Addfirst(20);
		ll.AddLast(50);
		ll.Addfirst(10);
		ll.removeatIndex(1);
	    System.out.println(ll.search(50));
		System.out.println(ll);
	}
}
