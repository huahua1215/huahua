package com.hau.o.box;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Box3 box3 = new Box3();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter object\'s length:");
        int length = Integer.parseInt(scan.next());
        System.out.println("Please enter object\'s width::");
        int width = Integer.parseInt(scan.next());
        System.out.println("Please enter object\'s height:");
        int height = Integer.parseInt(scan.next());
        System.out.println("length:"+ length+",width:"+width+",height:"+height);
        if(box3.validate(length,width,height)){
            System.out.println(box3.getName());
        }
    }
}
