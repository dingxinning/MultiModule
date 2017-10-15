package com.collection;

import java.util.Stack;

/**
 * Created by Wuxiang on 2017/10/15.
 * Stack 栈
 * peek()方法：返回栈顶元素，但不删除
 *
 * LinkedList 添加了可以使其用作 栈、队列、双端队列的方法
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (String s : "My dog has fleas".split(" ")) {
            stack.push(s);
        }
        stack.push("addItem");
        System.out.println("栈顶元素：" + stack.peek());
        stack.pop();
        System.out.println("栈顶元素：" + stack.peek());

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}
