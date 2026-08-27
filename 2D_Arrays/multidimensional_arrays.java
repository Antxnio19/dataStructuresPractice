class multdimensional_arrays{




    public static void main(String[] args){
      //INITIALIZING ARRAYS WITH INPUT VALUES
    int [][] matrix = new int[10][10];

    java.util.Scanner input = new java.util.Scanner(System.in);
    //System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");
    /* 
    for(int row = 0; row < matrix.length; row++){
        for(int column = 0; column < matrix[row].length; column++){
            matrix[row][column] = input.nextInt();
        }
    }
    */

    for(int row = 0; row < matrix.length; row++){
        for(int column = 0; column < matrix[row].length; column++)
        matrix[row][column] = (int)(Math.random() * 100);
    }

    for(int row = 0; row < matrix.length; row++){
        for(int column = 0; column < matrix[row].length; column++)
        System.out.print(matrix[row][column] + " ");
        System.out.println();
    }
    System.out.println();

    int total = 0;
    for(int row = 0; row < matrix.length; row++){
        for(int column = 0; column < matrix[row].length; column++)
        total += matrix[row][column];
    }
    System.out.println("The total sum of array is: " + total);

    for(int column = 0; column < matrix[0].length; column++ ){
        int totalColumn = 0;
        for(int row = 0; row < matrix.length; row++){
            totalColumn += matrix[row][column]; //sum of numbers vertically columns
            System.out.println("Sum for column: " + column + " is " + totalColumn);
        }
    }

    }
}