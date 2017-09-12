package Lesson1_2.HomeTask.LectureOne.Spinner;

/**
 * @author bpanchenko
 * */
public class MatrixSpinnerRunner {

    public static void main(String[] args) {
        MatrixSpinner matrix = new MatrixSpinner(3,4);
        matrix.output();
        System.out.println();
        matrix.rotateMatrixBy90().output();
        System.out.println();
        matrix.rotateMatrixBy180().output();
        System.out.println();
        matrix.rotateMatrixBy270().output();
    }
}
