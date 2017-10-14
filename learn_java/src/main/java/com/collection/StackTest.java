package com.collection;

import java.util.Stack;

/**
 * Created by Wuxiang on 2017/10/15.
 * Stack 栈
 * peek()方法：返回栈顶元素，但不删除
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (String s : "My dog has fleas".split(" ")) {
            stack.push(s);
        }
        System.out.println("栈顶元素：" + stack.peek());
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}
