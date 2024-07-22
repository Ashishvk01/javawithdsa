package org.example;
import java.util.Scanner;
public class customQueue {
    int front = 0;// mistake
    int rear = -1;
    int[] arr;
  customQueue(int size) {

      this.arr = new int[size];
  }

    void add(int ele){
        if(isFull()){
            System.out.println("queue is full so cannot enter");
        }
        else {// mistake
            rear++;// mistake
            arr[rear] = ele;
        }
    }
    int remove(){
        if(isEmpty()){
            System.out.println("you cannot remove the element queue is empty");
        }
        int elerem=arr[front];
        for(int i=1;i<rear;i++){
            arr[i-1]=arr[i];
        }
        rear--;
        return elerem;

    }
    boolean isFull(){
        if(rear==arr.length-1){ //mistake
            return true;
        }
        return false;
    }
    boolean isEmpty(){
        if(rear==-1){
            return true;
        }
        return false;
    }

    int peek(){
        int ele1=arr[rear];
        return ele1;
    }

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("plz enter the size of the array");
        int a=sc.nextInt();
        customQueue queue=new customQueue(a);
        queue.add(3);
        queue.add(4);
        queue.add(3);
        queue.add(4);
        queue.add(3);
        queue.add(4);
        System.out.println(queue.remove());
    }

}
