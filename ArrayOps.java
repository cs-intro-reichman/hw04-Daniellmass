public class ArrayOps {
    public static void main(String[] args) {
        int [] array = {1,3,-4,5}; 
        int [] array3 = {1,2,3,-4,5};
        System.out.println(containsTheSameElements(array, array3));
       
        
        
        
    }  
    public static int findMissingInt (int [] array) {
        int a1 = 0;
        int sumOfArr = 0;
        // Sum of the elements if the array contains the missing int
        int complSum = ((array.length + 1) * ( (2 * a1) + (array.length + 1 - 1) * 1)) / 2;
        for (int i = 0; i < array.length; i++) {
            sumOfArr += array[i];
        }
        int missNum = complSum - sumOfArr;
        return missNum;   
    }

    public static int secondMaxValue(int [] array) {
        int temp = 0;
        //Sorting the array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] > array [i]) {
                    temp = array[i];
                    array[i] = array [j];
                    array[j] = temp;      
                }
            }
        }
        int secMax = array[array.length - 2];
        return secMax;
     }
            

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
       for (int i = 0; i < array1.length; i++) {
         int num1 = array1[i];
         boolean flag = false;
         for (int j = 0; j < array2.length; j++) {
            if (array2[j] == num1) {
              flag = true;
              break;
            }
         }
         if (flag == false) {
            return false;
         }
       }
       for (int i = 0; i < array2.length; i++) {
         int num2 = array2[i];
         boolean flag = false;
         for (int j = 0; j < array1.length; j++) {
           if (array1[j] == num2) {
               flag = true;
               break;
           }
         }
         if (flag == false) {
           return false;
         }
       } 
       return true;    
    }
     

    public static boolean isSorted(int [] array) {
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] <= array[i+1]) {
                if(array [i+1] > array[i + 2] ) {
                    return false;
                }
            }
            else {
                if (array [i+1] < array [i+2]) {
                        return false;
                }
            }
        }    
        return true;
     }
    

}
