interface Queue{
    int n = 10000+7;
    void insert(int i);
    int delete();
    void display();
}

public class Que implements Queue{

    int arr[] = new int[n];
    int front = 0 , back = -1;
    public void insert(int i){
        if(back>= n) System.out.println("Queue Overflow!");
        arr[++back] = i;
    }
    public int delete(){
        if(front>back){
            System.out.println("Queue Underflow!");
            return -9999;
        }
        return arr[front++];
    }
    public void  display(){
        if(front>back) System.out.println("Queue is Empty!");
        else{
            for(int i = front; i<=back; ++i) System.out.print(arr[i] + " ");
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Que gq = new Que();
        gq.insert(12);
        gq.insert(13);
        gq.insert(14);
        gq.insert(15);
        gq.delete();
        gq.delete();
        System.out.print("Element(s) are : ");
        gq.display();
    }


}