

public class DiagonalMatrix {
  
    
    public static int[][] generateDiagonalMatrix(int[] array){
        int[][] diagonalMatrix = new int[array.length][array.length];

        for(int i =0; i< array.length ; i++){
            for(int j=0 ; j< array.length; j++)
                if(i == j )
                    diagonalMatrix[i][j] = array[i]; 
        }

        return diagonalMatrix; 
    }

    public static boolean isIdentityMatrix(int[][] diagonalMatrix){

        for(int i =0; i< diagonalMatrix.length ; i++){
            for(int j=0 ; j< diagonalMatrix.length; j++){

                if(i == j && diagonalMatrix[i][j] != 1)
                    return false;

                else 
                assert diagonalMatrix[i][j] == 0: "not a diagonal matrix [" + i + "][" + j + "] = " +  diagonalMatrix[i][j];
            }
        }
        return true; 
    }



    public static void main(String[] args) {
        int [] a1 = {1,4,8,6,4};
        int [] a2 = {1,1,1,1,1,1};
        if (!isIdentityMatrix(generateDiagonalMatrix(a1)))
            System.out.println("a1 is not an identity matrix");
        if (isIdentityMatrix(generateDiagonalMatrix(a2)))
            System.out.println("a2 is an identity matrix");
    }
}
