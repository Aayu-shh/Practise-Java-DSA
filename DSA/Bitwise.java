package DSA;

import java.util.Arrays;

public class Bitwise {
    public static void main(String[] args) {

        System.out.println("Number of zeros in 2: "+numOfBinaryZeros(2));
        System.out.println("Number of zeros in 8: "+numOfBinaryZeros(8));
        System.out.println("Number of zeros in 31: "+numOfBinaryZeros(31));

        //Using Method Integer.toBinaryString(num)
        System.out.println("Number of zeros in 2: "+numOfBinaryZeros1(2));
        System.out.println("Number of zeros in 8: "+numOfBinaryZeros1(8));
        System.out.println("Number of zeros in 31: "+numOfBinaryZeros1(31));
        System.out.println("Number of zeros in 7: "+numOfBinaryZeros1(7));
    }

    // Q. Find number of Zeros in Binary Representation
    // To print all zeros including LEADING zeros
    static int numOfBinaryZeros(int num){
        if(num==0)
            return 32;  //Assuming 32 Bit Representation -> All 32 Zeros

        int count = 0;
        for(int i=0;i<32;i++){
            if((num&1)==0)
                count++;
            //right shift to next bit (place value 1 in Binary Representation)
            num=num>>1;
        }
        return count;
    }

    //Using Method Integer.toBinaryString(num)
    static int numOfBinaryZeros1(int num) {
        int count =0;
        String binaryString = Integer.toBinaryString(num);
//        count = (int) binaryString.chars().mapToObj(c->(char)c).filter(character ->character.equals('0')).count();
        count = (int) Arrays.stream(binaryString.split("")).filter(schar->schar.equals("0")).count();
        return count;
    }
}

