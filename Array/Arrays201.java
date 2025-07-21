package Array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Arrays201 {
    public static void main(String[] args) {
        List<Integer> myArr = Arrays.asList(1, 2, 3, 4, 5);
        int num = 6;
        System.out.println(leftRotateArr(myArr,num));
        System.out.println(leftRotateArrNormal(myArr,num));
    }

    //Only works till Array.size()
    private static List<Integer> leftRotateArr(List<Integer> myArr, int num) {
        List <Integer> og =   myArr.stream().skip(num).collect(Collectors.toList());
        og.addAll(myArr.stream().limit(num).toList());
        return og;
    }

    private static List<Integer> leftRotateArrNormal(List<Integer> myArr, int num) {
        for(int i = 0;i<num;i++){
            //Each i Iteration => First Element goes to the end
            for(int j=0;j<myArr.size()-1;j++){
                int tmp = myArr.get(j);
                myArr.set(j, myArr.get(j+1));
                myArr.set(j+1,tmp);
            }
        }
        return myArr;
    }
}
