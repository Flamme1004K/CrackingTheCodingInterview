package study.crackingthecodinginterview;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

class MyStack {
    private static class StackNode<T> {
        private T data;
        private StackNode next;
        public StackNode(T data) {
            this.data = data;
        }
    }

    private StackNode top;

    public Object pop() {
        if (top == null) throw new EmptyStackException();
        Object item = top.data;
        top = top.next;
        return item;
    }

    public void push(Object item) {
        StackNode t = new StackNode(item);
        t.next = top;
        top = t;
    }

    public Object peek() {
        if (top == null) throw new EmptyStackException();
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}

class MyQueue {
    private static class QueueNode<T> {
        private T data;
        private QueueNode next;
        public QueueNode(T data) {
            this.data = data;
        }
    }
    private QueueNode first;
    private QueueNode last;

    public void add(Object item) {
        QueueNode t = new QueueNode(item);
        if(last != null) {
            last.next = t; // 마지막 노드가 있으면 마지막 뒤에다가 붙여준다.
        }
        last = t; // 그리고 t는 마지막 노드가 된다.
        if (first == null) {
            first = last;
        }
    }

    public Object remove() {
        if(first == null) throw  new NoSuchElementException();
        Object data = first.data;
        first = first.next;
        if (first == null) {
            last = null;
        }
        return data;
    }

    public Object peek() {
        if (first == null) throw new NoSuchElementException();
        return first.data;
    }

    public boolean isEmpty() {
        return first == null;
    }

}

public class Week4 {
}
