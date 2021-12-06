package lesson8;

public class Matrix {
    int m;
    int n;
    int matrix[][];

    public Matrix(int m, int n) {
        this.m = m;
        this.n = n;
        this.matrix = new int[m][n];
    }
    public void sum (int[][] matrix) {
            for (int i = 0; i < this.matrix.length; i++) {
                for (int j = 0; j < this.matrix[i].length; j++) {
                    this.matrix[i][j] = this.matrix[i][j] + matrix[i][j];
                }
            }
        }

        public int[][] getMatrix() {
            return matrix;
        }


        }

