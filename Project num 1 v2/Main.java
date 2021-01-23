public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s){
        int answer = 0;//answer set at zero for counting vowels in a string
        //your code here
        int i;//index position
        int l=s.length();// length of the string
        char ch;//character variable

        //if the character a, e, i, o, or u is the String s the answer counter will increase by one
        for(i=0;i<l;i++){
            ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                answer++;//increases answer by one
        }
        System.out.println("Number of vowels:" + answer );

        return answer;
    }
    //Code you problem number two here
    static int problemTwo(String s){
        int answer = 0;//answer set at 0 for counting number of times "bob" occurs is a string
        int fromIndex = 0;//fromIndex set at 0 and holds the index position from where to search the substring
        String strFind = "bob";//strFind is for finding the substring "bob"

        /*
        The while loop finds the substring "bob", assigns the index of next occurrence to fromIndex and checks
        if the returned value is greater than -1.
        The indexOf method returns -1 if "bob" is not found in the string, and if it is it returns the index of the
        substring.
        When "bob" occurs in the string the answer increases by one as well as the fromIndex so when the substring
        is found, the next time the substring is searched after that index. Otherwise there will be an infinite loop.
         */
        while ((fromIndex = s.indexOf(strFind, fromIndex)) != -1 ) {

            System.out.println();
            answer++;
            fromIndex++;
        }
        System.out.println("Number of times bob occurs is:" + answer);

        return answer;
    }
    //Code your solution to problem number 3 here
    static String problemThree(String s){
        //your code here
        String currentString = "";//current string you're looking at
        String answer = "";//the string you'll return from the method
        int longestLength = 0;//the length of the longest string recorded
        char one;//a character in the string
        char two;//a character in the string

        //for each character in the string s
        for(int i = 0; i < s.length(); ++i) {

            //if i is 1 before the end of the string
            if (i == s.length() - 1) {
                one = s.charAt(i);// assign last character to one
                two = s.charAt(i - 1);//assign the character before that to two

                /*if two is before one in alphabetical order & the current length of the answer
                is greater than the greatest length recorded
                 */
                if (two <= one && currentString.length() >= longestLength) {
                    //replace the answer that you have with this new substring
                    answer = currentString + s.substring(i, i + 1);
                }
                //exit loop
                break;
            }

            //assign 1 character to one and two
            one = s.charAt(i);
            two = s.charAt(i + 1);

            //add the new letters to the current answer
            currentString = currentString + s.substring(i, i + 1);

            //if one is before two in alphabetical order
            if (one <= two) {
                //if the current answer length is greater than the greatest length recorded
                if (currentString.length() > longestLength) {
                    //update the greatest length
                    longestLength = currentString.length();
                    //update the answer
                    answer = currentString;
                }

            //one was not before two in alphabetical order
            } else if (currentString.length() > longestLength) {// but the current answer length is still greater than the greatest length recorded


                //update the greatest length
                longestLength = currentString.length();
                //update the answer
                answer = currentString;
                //blank out current answer
                currentString = "";
            } else {//one was not before two in alphabetical order, and the length was less than the greatest length recorded
                //just blank out current answer
                currentString = "";
            }
        }

        return answer;


    }
    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
        String s;
    }
}
