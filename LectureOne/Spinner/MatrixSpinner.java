package Lesson1_2.HomeTask.LectureOne.Spinner;

/**
 * @author bpanchenko
 * */
public class MatrixSpinner {
    private final int[][] mat;
    private final int rows;
    private final int cols;

    /**
     *
     * @param rows count of rows in matrix
     * @param cols count of columns in matrix
     */
    public MatrixSpinner(int rows, int cols) {
        if (cols<0||rows<0)
            throw new IllegalArgumentException("Rows and cols must be positive, but actually is "+rows+", "+cols);
        this.cols = cols;
        this.rows = rows;

        mat = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = j+i*cols;
            }
        }
    }

    /**
     *
     * @param spinner object from which we copy
     */
    public MatrixSpinner(MatrixSpinner spinner){
        rows = spinner.rows;
        cols = spinner.cols;
        mat = new int [rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = spinner.mat[i][j];
            }
        }

    }

    public MatrixSpinner(){
        this(5,5);
    }


    public void output(){
        for(int[] row:mat){
            for(int i:row){
                System.out.printf("%3d ",i);
            }
            System.out.println();
        }
    }

    /**
     * @return matrix, rotated by 90 deg
     */
    public MatrixSpinner rotateMatrixBy90(){
        MatrixSpinner matrixSpinner = new MatrixSpinner(cols,rows);

        int i = 0;
        for (int[] row: this.mat){
            int j = matrixSpinner.rows-1;
            for (int elem:row){
                matrixSpinner.mat[j][i] = elem;

                j--;
            }
           i++;
        }
        return matrixSpinner;
    }

    /**
     * @return matrix, rotated by 180 deg
     */
    public MatrixSpinner rotateMatrixBy180(){
        /*MatrixSpinner matrixSpinner = new MatrixSpinner(this);
        for (int i = 0; i < 2; i++) {
            matrixSpinner = matrixSpinner.rotateMatrixBy90();
        }
        return matrixSpinner;*/

        MatrixSpinner matrixSpinner = new MatrixSpinner(rows,cols);

        int i = rows-1;
        for (int[] row: this.mat){
            int j = matrixSpinner.cols-1;
            for (int elem:row){
                matrixSpinner.mat[i][j] = elem;

                j--;
            }
            i--;
        }
        return matrixSpinner;
    }

    /**
     * @return matrix, rotated by 270 deg
     */
    public MatrixSpinner rotateMatrixBy270(){
        /*MatrixSpinner matrixSpinner = new MatrixSpinner(this);
        for (int i = 0; i < 3; i++) {
            matrixSpinner = matrixSpinner.rotateMatrixBy90();
        }
        return matrixSpinner;*/

        MatrixSpinner matrixSpinner = new MatrixSpinner(cols,rows);


        int i = matrixSpinner.cols-1;
        for (int[] row: this.mat){
            int j = 0;
            for (int elem:row){
                matrixSpinner.mat[j][i] = elem;

                j++;
            }
            i--;
        }
        return matrixSpinner;
    }

    private void fillMatrix(){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = j+i*cols;
            }
        }
    }
}
