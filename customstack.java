package org.example;

import java.util.Scanner;


public class customstack  {
        int[] arr;
        int top = -1;
       customstack(int size){


            //create an array
            this.arr = new int[size];
        }
        public void push(int ele){
            if(isFull(top ,arr)){
                System.out.println("stack is full cannot use it");
            }
            else{
                top++;
                arr[top]=ele;
            }
        }

        public int pop( ) throws Exception {
//            if(isEmpty(top,arr)){
//                System.out.println("stack is empty cannot pop it");
//            }
//            else{
//                int popEle=arr[top];
//                top--;
//                return popEle;
//            }
//            return 0;

            if(isEmpty(top,arr))  {
                throw new Exception("you cannot pop more boss");
            }
            return arr[top--];
        }

        boolean isFull(int top, int arr[]){
            if(top==arr.length-1){
                return true;
            }
            else{
                return false;
            }
        }

        boolean isEmpty(int top, int arr[]){
            if(top==-1){
                return true;
            }
            else{
                return false;
            }
        }

        int peek(){
            int topele=arr[top];
            return topele;
        }

        public static void main(String[] args) throws Exception {

            //define the size of the array


            Scanner sc=new Scanner(System.in);
            System.out.println("plz enter the size of the array");
            int size=sc.nextInt();
            customstack cs=new customstack(size);
            cs.push(5);
            cs.push(4);
            cs.push(3);
            cs.pop();
            cs.pop();

            int s=cs.peek();
            cs.pop();
            System.out.println(s);
        }


    }
