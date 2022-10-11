import java.util.Random;  

public class Hw5_2_10 {
    public static void main(String[] args) {
        
        int M = 5, N = 7;	
        int matrix[][]=new int[M][N];
        int new_matrix[][]=new int[M][N];
        int max_i[]=new int[M];
        int max_j[]=new int[N];
        int MatrixMaxEl= matrix[0][0];
        Random gener = new Random();
        
        for (int i=0;i<M;i++) {
        	max_i[i]=0;
        	for (int j=0;j<N;j++) {
        		matrix[i][j]= gener.nextInt(30)-15;
        		max_j[j] = 0;
        	}	
        }
         
        System.out.println("Початкова матриця:");
        for (int i=0;i<M;i++) {
        	for (int j=0;j<N;j++)
        		System.out.print("\t"+matrix[i][j]);
        	System.out.println("");
        }
         
        for (int i=0;i<M;i++) {
        	for (int j=0;j<N;j++) {
        		if (matrix[i][j]>MatrixMaxEl) {
        			MatrixMaxEl =matrix[i][j];	
        		}
        	}
        }
         
        for (int i=0;i<M;i++) {
        	for (int j=0;j<N;j++) {
        		if (MatrixMaxEl==matrix[i][j]) {
        				max_i[i] = 1;
        			max_j[j] = 1;
        		}
        	}
        }
         
        for (int i=0;i<M;i++) {
        	for (int j=0;j<N;j++) {
        		if (max_i[i]==1 | max_j[j]==1) {
        			new_matrix[i][j]=0;
        		}
        		else  {
        			new_matrix[i][j]=matrix[i][j]; 
        		}
        	}
        }
         
        System.out.println("\nМаксимальний елемент:" + MatrixMaxEl);
        /**
        System.out.println("\nРезультативна матриця:");
        for (int i=0;i<M;i++) {
        	for (int j=0;j<N;j++)
        		System.out.print("\t"+new_matrix[i][j]);
        	System.out.println("");
        }
        **/
         
        System.out.println("\nВидалимо рядки і стовці, де тільки нулі:");
        for (int i=0;i<M;i++) {
        	for (int j=0;j<N;j++) {
        		if (max_i[i]==1 | max_j[j]==1)
        			continue;
        		else 
        			System.out.print("\t"+new_matrix[i][j]);
        	}
        	if (max_i[i]==0) 
        		System.out.println("");
        }
    }
}
