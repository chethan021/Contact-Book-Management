package com.jsp.Studies;

public class StringSreach {
public static void main(String[] args) {
	String name="Chethan";
	int index=search(name,'X');
	System.out.println("At Index: "+index);
}

private static int search(String name,char ler) {
	for(int i=0;i<name.length();i++) {
		if(name.charAt(i)==ler)
			return i;
	}
	return -1;
}
}
