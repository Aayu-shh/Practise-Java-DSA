package InterviewQuestionDump.Wissen;

public class StringPractise {
    public static void main(String[] args) {
        String str = "AayaAa";
        isPallindrome(str,0,str.length()-1);
        isPallindromeLoop(str);
    }

    private static void isPallindrome(String str,int i,int n) {
        if(i<=str.length()/2 && str.charAt(i)!=str.charAt(n)){
            System.out.println("Not pallindrome");
            return;
        }  else if (i>str.length()/2) {
            System.out.println("Pallindrome");
            return;
        }
        isPallindrome(str,i+1,n-1);
    }

    private static void isPallindromeLoop(String str){
        boolean flag=true;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
                flag=false;
            }
        }
        if (flag) System.out.println("Pallindrome");
        else System.out.println("Not a pallindrome");


    }
}


