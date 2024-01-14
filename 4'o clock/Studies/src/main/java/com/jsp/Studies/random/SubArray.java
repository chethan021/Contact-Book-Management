package com.jsp.Studies.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
class SubArray {
    List<Integer> res =new ArrayList<Integer>();
    int[][] matrix;
    int m;int  n;
    public void borderFrom(int r, int c){
        for(int i=c;i<=c+n-1;i++){
            res.add(matrix[r][i]);
        }
        for(int i=r+1;i<=r+m-2;i++){
            res.add(matrix[i][c+n-1]);
        }
        if(m>1){
            for(int i=c+n-1;i>=c;i--){
                res.add(matrix[r+m-1][i]);
            }
        }
        if(n>1){
            for(int i=r+m-2;i>=r+1;i--){
                res.add(matrix[i][c]);
            }
        }
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        this.matrix=matrix;
        m=matrix.length;
        /*{1,2,3
         * 4,5,6
         * 7,8,9}
         */
        n=matrix[0].length;
        int p=0;
        while(n>0 && m>0){
            borderFrom2(p,p);
            p++;
            m-=2;
            n-=2;
        }
        return res;
    }


	public static void main(String[] args) {
		SubArray solution = new SubArray();
 int[][]matrix = {{1,2,3},{4,5,6},{7,8,9}};
 List<Integer> list = solution.spiralOrder(matrix);//[5,4,7,8,9,6,3,2,1]
System.out.println(list);
 
		}
    public void borderFrom2(int r, int c){
        for(int i=c;i<=c+n-1;i++){
            res.add(matrix[r][i]);
        }
        for(int i=r+1;i<=r+m-2;i++){
            res.add(matrix[i][c+n-1]);
        }
        if(m>1){
            for(int i=c+n-1;i>=c;i--){
                res.add(matrix[r+m-1][i]);
            }
        }
        if(n>1){
            for(int i=r+m-2;i>=r+1;i--){
                res.add(matrix[i][c]);
            }
        }
    }
	}

