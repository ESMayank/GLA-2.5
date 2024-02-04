package Lec_1;
public class LL{
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
private Node head;//pehle node ko point krega
private int size;
//Add-First
public void Addfirst(int data) {
	size++;
	Node nn = new Node(data);
	if(head==null) {
		//ab head node ko point krega
		head=nn;
		return;
	}
	nn.next=head;
	head=nn;
}
//Add-Last
public void AddLast(int data) {
	size++;
	Node nn = new Node(data);
	if(head==null) {
		Addfirst(data);
		return;
	}
	Node curr = head;//pehle bnde ka btado
	while(curr.next!=null) {
		curr=curr.next;
	}
	curr.next=nn;
}
//print
public String toString() {
	if(head==null) {
		return "[]";
	}
	Node curr = head;
	String str = "[";
	while(curr!=null) {
		str+=curr.data+"->";
		curr=curr.next;
	}
	str+="Null]";
	return str;
}
//Delete-First
public void deleteFirst() {
	if(head==null) {
		System.out.println("List is empty");
		return;
	}
	size--;
	head=head.next;
}
//Delete-last
public void deleteLast() {
	if(head==null) {
		System.out.println("List is empty");
		return;
	}
	size--;
	if(head.next==null) {
		deleteFirst();
		return;
	}
	Node secondLast = head;
	Node last = head.next;
	while(last.next!=null) {
		secondLast=secondLast.next;
		last = last.next;
	}
	secondLast.next=null;
}
//search
public int search(int n) {
	if(head==null) {
		return -1;
	}
	int flag = 0;
	Node curr = head;
	while(curr!=null) {
		if(curr.data==n) {
			return flag;
		}
		flag++;
		curr=curr.next;
	}
	return -1;
}
//GetNode
public Node getNode(int k) throws Exception{
	if(k<0 || k>size) {
		throw new Exception("Bhai smbhal kr");
	}
	Node curr = head;
	for (int i = 0; i < k; i++) {
		curr=curr.next;
	}
	return curr;
}
//AddataIndex
public void addIndex(int n,int k) throws Exception{
	if(k==0) {
		Addfirst(n);
		size++;
		return;
	}
	else if(k==size) {
		AddLast(n);
		size++;
		return;
	}
	Node temp = getNode(k-1);
	Node nn = new Node(n);
	nn.next=temp.next;
	temp.next=nn;
	size++;
}
//RemoveAtIndex
public void removeatIndex(int k) throws Exception {
	if(k==0) {
		deleteFirst();
		size--;
		return;
	}
	else if(k==size-1) {
		deleteLast();
		size--;
		return;
	}
	else {
		Node k1 = getNode(k-1);
		k1.next=k1.next.next;
		//k1.next.next=null;
	}
	
}
}
