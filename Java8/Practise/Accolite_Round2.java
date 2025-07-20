package Java8.Practise;

import java.util.ArrayList;

public class Accolite_Round2 {
    public static void main(String[] args) {
        // String and permutations - possible words of same length
        String str = "abcd";
        //abcd bacd bcad abdc adbc dabc
        String newStr = "";
        StringBuilder sb = new StringBuilder(str);
        ArrayList<String> stringList = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length()-1;j++){
                char tmp = sb.charAt(j);
                sb.setCharAt(j, sb.charAt(j+1));
                sb.setCharAt(j+1,tmp);
                stringList.add(sb.toString());
            }
        }
        System.out.println(stringList);


//        int [] arr = {2,6,4,1,3,4,5,1,8,17};
//        // Find the index of elem sum of All left side and sum of all right side
//        for(int i=0;i<arr.length;i++){
//            int currIndex = i;
//            int leftSum=0;
//            int rightSum=0;
//            //left sum
//            for(int j=0;j<i;j++){
//                leftSum+=arr[j];
//            }
//            //right sum
//            for(int j=i+1;j<arr.length;j++){
//                rightSum+=arr[j];
//            }
//            if(rightSum==leftSum){
//                System.out.println(currIndex);
//                break;
//            }
//        }
    }

}
