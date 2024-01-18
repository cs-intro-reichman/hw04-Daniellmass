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
        String test = " tWo    wordS";
        char char2 = 'l';
        System.out.println(camelCase(test)); 
        
    }

    public static String capVowelsLowRest (String string) {
        String capVowelRest = "";
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
             if (isVowel(ch)) { 
                if (ch >= 'a' && ch <= 'z') {
                    capVowelRest += (char) (ch - 'a' + 'A');
                } 
                else {
                 capVowelRest += ch;
                }
             } else { 
                if (ch >= 'A' && ch <= 'Z') {
                    capVowelRest += (char) (ch + 'a' - 'A');
                } else {
                    capVowelRest += ch;
                }
            }
        }
        return capVowelRest;     
    }
    
    // Helper method to check if a character is a vowel
    private static boolean isVowel(char ch) {
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
               ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }   
    


    public static String camelCase (String string) {
        String ans = "";
        for( int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if( ch <= 'Z' && ch != ' ') {
                ans += (char) (ch + 32);
            }
            else if (ch == ' ' && string.charAt(i + 1) > 90 && ans.length() != 0) {
                ch = string.charAt(i+1);
                ans += (char) (ch - 32);
                i++;
            }
            else if (ch == ' ' && (char) string.charAt(i + 1) <= 'Z' && string.charAt(i+1) != ' ') {
                ch = string.charAt(i + 1);
                ans += (char) ch;
                i++;
            } 
            else if (ch != ' ') {
                ans += ch;
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
