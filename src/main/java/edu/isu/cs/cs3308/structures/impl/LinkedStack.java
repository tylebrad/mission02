/**
 * Author: Bradley Tyler
 * Date: 1/23/2019
 * Project: Mission 02
 * Class: CS 3308
 * Professor: Isaac Griffith
 *
 * Description - Linked Stack Class
 */
package edu.isu.cs.cs3308.structures.impl;

import edu.isu.cs.cs3308.structures.Stack;

public class LinkedStack<E> implements Stack<E> {

    private int size = 0;

    /**
     * Node class nested within DLL
     * @param <E>
     */
    public static class Node<E>{
        private E data;
        private Node<E> next;
        private Node<E> prev;

        /**
         * Node Constructor
         * @param d Node Data
         * @param n Node's "Next" reference
         * @param p Node's "Previous" reference
         */
        public Node(E d, Node<E> n, Node<E> p){
            this.data = d;
            this.next = n;
            this.prev = p;
        }

        public E getData(){
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node<E> getNext(){
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node<E> getPrev(){
            return prev;
        }

        public void setPrev(Node<E> prev){
            this.prev = prev;
        }
    }
    /**
     * Adds the provided item to the top of the stack. Note that if the item is
     * null, nothing occurs.
     *
     * @param element Element added to the top of the stack, unless this item is
     * null.
     */
    @Override
    public void push(E element) {

    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    /**
     * @return True if this stack is empty, false otherwise.
     */
    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void transfer(Stack<E> to) {

    }

    @Override
    public void reverse() {

    }

    @Override
    public void merge(Stack<E> other) {

    }

    @Override
    public void printStack() {

    }
}
