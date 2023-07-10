package oops;

public class sclass {
    public static void main(String[] args) {
        Person p=new Person();
        p.setname("ishaan");
        p.getname();
    }
}
class Person{
    String name;
    void getname(){
        System.out.println(name);
    }
    void setname(String name){
        this.name=name;
    }
    
}
