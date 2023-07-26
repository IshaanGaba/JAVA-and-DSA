package Queue;

public class circular_queue {
    public static class Que{
        static int a[];
        static int size;
        static int rear,front;
        public Que(int n){
            a=new int[n];
            size=n;
            rear=front=-1;
        }  

        public boolean isempty(){
            return (rear==-1 && front==-1);

        } 
        public boolean isfull(){//important
            return front==(rear+1)%size;
        }
        public void add1(int data){
            if(isfull()){
                return;
            }
            rear=(rear+1)%size;
            if(front==-1){
                front=0;
            }
            a[rear]=data;
        } 
        public int remove1(){
            if(isempty()){
                return -1;
            }
            int f=a[front];
            if(front==rear){//last element
                front=rear=-1;
                return f;
            }
            front=(front+1)%size;
            return f;
        }
        public int peek1(){
            if(isempty()){
                return -1;
            }
            return a[front];
        } 
    }
    public static void main(String[] args) {
        Que q=new Que(3);
        q.add1(1);
        q.add1(2);
        q.add1(3);
        q.add1(4);
        q.remove1();
        q.add1(4);
        while(!q.isempty()){
            System.out.println(q.peek1());
            q.remove1();
        }
    }

}
