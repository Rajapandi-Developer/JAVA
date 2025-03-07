package Leetcode.Arrays;

class Solution{
	public void  solve(int n[],int m[]){
		int k=0;
		int l=0;
		for(int i=0;i<n.length;i++){
			if(n[i]!=0){
				k++;
				System.out.print(n[i]+" ");
			}
		}
		System.out.println();
		System.out.println(k);
		for(int i=0;i<m.length;i++){
			if(m[i]!=0){
				l++;
				System.out.print(m[i]+" ");
			}
		}
		System.out.println();
		System.out.println(l+" ");
	// 	last(k,l,n,m);
	// }
	// public void last(int k,int l,int n[],int m[]){
	// 	int n1[]=new int[k];
	// 	int m1[]=new int[l];
	// 	for(int i=0;i<n1.length;i++){
	// 		n1[i]=n[i];
	// 	}
	// 	for(int i=0;i<m1.length;i++){
	// 		m1[i]=m[i];
	// 	}
	// 	int n2[]=new int[k+l];
	// 	for(int i=0;i<n1.length;i++){
	// 		n2[i]=n1[i];
	// 		System.out.print(n2[i]);
	// 	}
	// 	for(int i=0;i<m1.length;i++){
	// 		n2[k]=m1[i];
	// 		k++;
	// 		System.out.print(n2[k]);
	// 	}
	}
}
public class Merge {
	public static void main(String[] args) {
		int n[]={1,2,3,5,0,0};
		int m[]={2,5,6,0};
		Solution sol=new Solution();
		sol.solve(n, m);
	}
	
}