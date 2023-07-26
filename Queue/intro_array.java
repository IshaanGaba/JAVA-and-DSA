package Queue;


public class intro_array {
    public static class Que{
        static int a[];
        static int size;
        int rear=-1;
        public Que(int n){
            a=new int[n];
            size=n;
           
        }
    
    public  boolean isempty(){
        return (rear==-1);
    }
    public void add1(int data){
        if(rear==size-1){
            return;
        }
        rear++;
        a[rear]=data;
    }
    public int remove1(){
        if(isempty()){
            return -1;
        }
        int front=a[0];
        for (int i = 0; i < a.length-1; i++) {
            a[i]=a[i+1];

        }
        rear--;
        return front;
    }
    public int peek1(){
        if(isempty()){
            return -1;
        }
        return a[0];
    }
}
    public static void main(String[] args) {
        Que q=new Que(3);
        q.add1(1);
        q.add1(2);
        q.add1(3);
        q.remove1();
        q.add1(4);
        while(!q.isempty()){
            System.out.println(q.peek1());
            q.remove1();
        }
        System.out.println(q.peek1());
    }
}
