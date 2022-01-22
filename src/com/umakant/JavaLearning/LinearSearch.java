package com.umakant.JavaLearning;

public class LinearSearch {

    public int linearSearch(int n, int[] intArray)
    {
        //        int[] arr={4,6,8,3,5,9,2,10};
//        int a=9;
        for(int i=0;i<=intArray.length-1;i++){
            if(intArray[i]==n){
                return i;
            }
        }
        return -1;
    }


    public int search(Integer n, Integer[] list) {

        int index = -1;
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(n)) {
                index = i;
                break;
            }
        }
        return index;
    }
}
