
import java.util.*;
public class COmparator {
    static class Student{
        int age;
        String name;
        public Student(int age,String name){
            this.age=age;
            this.name=name;
        }
        public String toString(){
            return ""+age+" "+name;
        }
    }
    public static void main(String[] args) {
        // sort according to the last digit
        Comparator<Integer> com=new Comparator<Integer>() {
            public int compare(Integer a,Integer b){
                if(a%10>b%10){
                    return 1;//swap--1 means swap
                }else{
                    return -1;
                }
            }
        };
        //sort acc to student age
        Comparator<Student> compS=new Comparator<COmparator.Student>() {
            public int compare(Student s1,Student s2){
                if(s1.age>s2.age){
                    return 1;
                }
                return -1;
            }
        };
        //or
        Comparator<Student> comS=(i,j)->i.age>j.age?1:-1;

        List<Integer> a=new ArrayList<>();
        a.add(52);
        a.add(29);
        a.add(71);
        a.add(88);
        System.out.println(a);
        Collections.sort(a,com);
        System.out.println(a);
        List<Student> s=new ArrayList<>();
        s.add(new Student(88, "shads"));
        s.add(new Student(52, "sds"));
        s.add(new Student(29, "sashads"));
        s.add(new Student(79, "shadasdds"));
        Collections.sort(s,comS);
        //Collections.sort(s,(i,j)->i.age>j.age?1:-1);
        for(Student q:s){
            System.out.println(q);
        }
        
    }
}
