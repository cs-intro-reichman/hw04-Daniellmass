public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        String test = "Hello     world";
        char char2 = 'l';
        System.out.println(camelCase(test)); 
        
    }

    public static String capVowelsLowRest (String string) {
        String capVowelRest = "";
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U')  {
                if ( ch > 'A' && ch <= 'Z') {
                    capVowelRest += (char) (string.charAt(i) + 32); 
                }
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'e' || ch == 'u') {
                    capVowelRest += (char) (ch - 32);
                }      
            }
             capVowelRest += (char) (ch);    
        }
        return capVowelRest;     
    }

    public static String camelCase (String string) {
        String ans = "";
        int temp = 0;
        for( int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if((char) ch < 91 && (char) ch != 32) {
                ans += (char) (ch + 32);
            }
            
            else if (ch == 32 && string.charAt(i + 1) > 90){
                ch = string.charAt(i+1);
                ans += (char) (ch - 32);
                i++;
            }
            else if (ch == 32 && string.charAt(i + 1) <= 90) {
                temp = string.charAt(i + 1);
                ans += (char) temp;
                i++;
            } 
            else if ((char) ch != 32 ) {
                ans += ch;
            }
            else if (ch == ' ') {
            } 
        
    }
        return ans;
    }

    public static int[] allIndexOf (String string, char chr) {
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if ( string.charAt(i) == chr) {
                counter++;
            }
        }
        int [] newArr = new int [counter];
        int index = 0;
        for(int j = 0; j < string.length(); j++) {
            if (string.charAt(j) == chr) {
            newArr[index] = j;
            index++;
            }
        }
        return newArr;
        }      
}
