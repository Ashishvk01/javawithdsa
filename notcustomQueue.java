package org.example;
import java.util.LinkedList;
import  java.util.Queue;
public class notcustomQueue {
    public static void main(String[] args) {
      Queue <Integer> que=new LinkedList<>();
      que.add(2);
      que.add(4);
      System.out.println(que.remove());
    }
  }
