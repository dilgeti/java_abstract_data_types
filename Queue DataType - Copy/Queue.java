public class Queue {
    private String[] values;
    private int head;
    private int tail;

    public Queue(int len){
        head = -1;
        tail = -1;
        values = new String[len];
    }

    public void onQueue(String value){ //push method
        if(tail == -1 && head == -1){
            tail +=1;
            head +=1;
        }
        else if(tail == this.size() && values[head-1] == null) tail = 0;
        else tail+=1;
        values[tail] = value;
    }
    public String deQueue(){ //pop method
        String result = "";
        result = values[head];
        values[head] = null;
        head +=1;
        return result;
    }
    public String peek(){
        return tail >= 1 ? values[tail-1] : values[head]; // if tail is greater then or equal to 1 return element at tails-1 else return head
    }
    public int size(){
        int result = 0; 
        if(head == 0) result = tail+1;
        else result = tail; 
        if(head > tail) result = (values.length - head) + tail+1; // when [SIX,TWO,THREE,FOUR,FIVE] 
        return tail == -1 && head == -1 ? 0 : result; //if both head/tail are -1 return 0
    }
    public boolean isEmpty(){
        return head == -1 && tail == -1 ? true : false; // if both cond. are true return true, else false
    }

    public String toString(){
        String result = "[";
        for(String element : values){
            result += element + ",";
        }
        return result.substring(0, result.length()-1) + "]\n" +"Tail: "+tail+"\nHead: "+head;
    }

}
