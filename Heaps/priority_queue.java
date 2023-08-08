package Heaps;

import java.util.PriorityQueue;

public class priority_queue {
    static class Student implements Comparable<Student>{
        int indx;
        int rank;
        public Student(int indx,int rank){
            this.indx=indx;
            this.rank=rank;
        }

        @Override
        public int compareTo(Student s1){
            return this.rank-s1.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        PriorityQueue<Student> pq1=new PriorityQueue<>();
        pq.add(5);
        pq.add(2);
        pq.add(3);
        pq.add(1);
        while (!pq.isEmpty()) {
            System.out.println(pq.peek()+" ");
            pq.remove();
        }
        System.out.println();
        pq1.add(new Student(1, 5));
        pq1.add(new Student(2, 1));
        pq1.add(new Student(3, 25));
        pq1.add(new Student(4, 3));
        while (!pq1.isEmpty()) {
            System.out.println(pq1.peek().indx+" ");
            pq1.remove();
        }
    }
}
