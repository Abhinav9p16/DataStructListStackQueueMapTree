package com.cg.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {
    @Test
    public void given3nosStackBeAddedQueue() {
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(56);
        myQueue.enqueue(30);
        myQueue.enqueue(70);
        myQueue.printQueue();
        myQueue.dequeue();
        myQueue.printQueue();
        Assert.assertEquals(30,myQueue.dequeue());

    }


}
