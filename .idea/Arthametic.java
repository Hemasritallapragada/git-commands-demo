package com.demo;
public class Arthametic {
    public int add(int a ,int b){
        return a+b ;}
    public int sub(int a, int b){
        return a-b ;}
    public int mul(int a, int b){
        return a*b ;}
    public int even(int a){
        if (a%2 ==0 ){
            return 1;
        }
        else {
            return 0;
        }
    }


    public static void main(String[] args){
        Arthametic arm = new Arthametic();
        System.out.println("Adding "+ arm.add(2,3)) ;
        System.out.println("sutract"+arm.sub(3,5));
        System.out.println("multiply"+arm.mul(7,6));
        System.out.println("even"+arm.even(7));

    }

}
