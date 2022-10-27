public class Exercise {
    public static void main(String[] args) throws Exception {
  
        int[][] mdArray = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15 ,16}};
       
        
        // PATTERN 1
    
        System.out.println("1. SUM OF PATTERN 1");
        
        int sum = 0;
       for (int row = 0; row < mdArray.length; row++) {
        for (int col = 0; col < mdArray.length; col++) {
            if (row == 0) {
                sum += mdArray[row][col];
            }
        }
       }

       System.out.println(sum);
           

        
        // PATTERN 2
        System.out.println("");
        System.out.println("2. SUM OF PATTERN 2");

     
    
        int column_sum = 0;
        for (int row = 0; row < 4; row++) {
         for (int columns = 0; columns < 4; columns++) {
            	if (columns == 0) {
            column_sum += mdArray[row][columns];
        }
      }
        }
         System.out.println(column_sum);
        
        
        
        // PATTERN 3
        System.out.println("");
        System.out.println("3. SUM OF PATTERN 3");

        int total = 0;

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                if (col == 0 || row == 0) {
                    total += mdArray [row][col];
                }
            }
        }
       
        System.out.println(total);

        // PATTERN 4
        System.out.println("");
        System.out.println("4. SUM OF PATTERN 4");

        int Ttotal = 0;

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                if (col == 0 && row == 0 || (col == 0 && row == 3)|| (col == 3 && row == 3) || (col == 3 && row == 0) )  {
                    Ttotal += mdArray [row][col];
                }
                
            }
        }
        
        System.out.println(Ttotal);
        // PATTERN 5
        System.out.println("");
        System.out.println("5. SUM OF PATTERN 5");

        int sum1 = 0;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                if (col == 1 && row == 1 || (col == 1 && row == 2)|| (col == 2 && row == 1) || (col == 2 && row == 2) )  {
                    sum1 += mdArray [row][col];
                }
                
            }
        }
        System.out.println(sum1);
        // PATTERN 6
        System.out.println("");
        System.out.println("6. SUM OF PATTERN 6");

        int add = 0;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                if (col == 0 && row == 0 || (col == 0 && row == 3)|| (col == 3 && row == 3) || (col == 3 && row == 0)|| (col == 1 && row == 1) || (col == 1 && row == 2)|| (col == 2 && row == 1) || (col == 2 && row == 2) )  {
                    add += mdArray [row][col];
                }
                
            }
        }

        System.out.println(add);
    }
}
