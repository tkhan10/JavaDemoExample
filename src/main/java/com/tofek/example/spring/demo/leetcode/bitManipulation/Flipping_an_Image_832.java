package com.tofek.example.spring.demo.leetcode.bitManipulation;

public class Flipping_an_Image_832 {
    public static void main(String[] args) {
     int[][] image = new int[][]{{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(flippingAnImage(image));

    }

    private static int[][] flippingAnImage(int[][] image) {

        for(int[] row: image){
            int l =0; int r = row.length-1;
            while(l<=r){
                int temp = row[l];
                row[l++] = row[r]^1;
                row[r--] = temp^1;

            }

        }
        return image;


    }


}
