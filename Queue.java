package Learnen.Queue;

import java.util.NoSuchElementException;

public class Queue {
    int head, tail, size, maxSize;
    int[] queue;

    Queue(int maxSize){
        head = size = 0;
        tail = 0;
        this.maxSize = maxSize;
        queue = new int[maxSize];
    }

    boolean isEmpty(){
        return size == 0;
    }

    boolean isFull(){
        return size == maxSize;
    }

    void push(int imt){
        try {
            if(isFull()) throw new Exception("Очередь занята");
            tail = tail % maxSize;
            queue[tail++] = imt;
            size++;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    int peek(){
        try{
            if(isEmpty()) throw new NoSuchElementException("Структура пуста");
            return queue[head];
        }catch(NoSuchElementException e){
            System.out.println(e.getMessage());
        }
        return Integer.MIN_VALUE;
    }

    int pop(){
        try{
            if(isEmpty()) throw new NoSuchElementException("Структура пуста");
            head = head % maxSize;
            size--;
            return queue[head++];
        }catch(NoSuchElementException e){
            System.out.println(e.getMessage());
        }
        return Integer.MIN_VALUE;
    }

    int size(){
        return size;
    }
}


