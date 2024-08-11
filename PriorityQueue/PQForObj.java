import java.util.*;
public class PQForObj {

    public static class Student implements Comparable <Student>{
        String name;
        int rank;

        public Student(String name,int rank)
        {
            this.name=name;
            this.rank=rank;
        }

        @Override
        public int compareTo(Student s2)
        {
            return this.rank-s2.rank;
        } 

    }


    public static void main(String[] args) {
        PriorityQueue<Student> pq=new PriorityQueue<>();

        pq.add(new Student("a",4));
        pq.add(new Student("b",1));
        pq.add(new Student("c",12));
        pq.add(new Student("d",400));

        while(!pq.isEmpty())
        {
            System.out.println(pq.peek().name+"-->"+pq.peek().rank);
            pq.remove();
        }


    }
    
}
