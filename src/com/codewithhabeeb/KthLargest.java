package com.codewithhabeeb;

import java.util.PriorityQueue;

public class KthLargest {
//When you want to find the largest/smallest elements efficiently, always try to find them using Heaps. This one can be done using quick sort too with n as best case and n^2 as worst
    static int findKthLargest( int[] nums, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(); //minHeap root will have the kth largest element
        for(int i: nums){
            minHeap.add(i); //this solution is of the complexity O(n log n)
            if(minHeap.size() > k){
                minHeap.remove();
            }
        }
        return minHeap.remove();
    }

    public static void main(String[] args){
        int[] arr = { 5, 10, 15, 20 };
        System.out.println(findKthLargest(arr, 2));
    }
}
