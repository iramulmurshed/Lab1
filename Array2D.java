/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2d;

/**
 *
 * @author iramu
 */
public class Array2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        char [][] a=new char[3][4];
        a[0][0]='1';
        a[0][1]='2';
        a[0][2]='3';
        a[0][3]='A';
        a[1][0]='1';
        a[1][1]='2';
        a[1][2]='B';
        a[1][3]='C';
        a[2][0]='1';
        a[2][1]='A';
        a[2][2]='B';
        a[2][3]='C';
        int n=3;
        for(int i=0;i<3;i++)
        {
            
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            n--;
            System.out.println();
        }
        n=3;
        for(int i=0;i<3;i++)
        {
            for(int j=n;j<4;j++)
            {
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            n--;
            System.out.println();
        }
    }
    
}
