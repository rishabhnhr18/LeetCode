import java.util.*;
class MyCircularDeque {
        LinkedList<Integer> dll;
        int size=0;
    public MyCircularDeque(int k) {
        this.size=k;
        dll=new LinkedList<>();
    }
    
    public boolean insertFront(int value) {
        if(this.dll.size()<size)
        {
        this.dll.addFirst(value);
        return true;
        }
        else return false;
    }
    
    public boolean insertLast(int value) {
        if(this.dll.size()<size)
        {
        this.dll.addLast(value);
        return true;
        }
        else return false;
    }
    
    public boolean deleteFront() {
        if(!(this.dll.isEmpty()))
        {
        this.dll.removeFirst();
        return true;
        }
        else return false;
    }
    
    public boolean deleteLast() {
        if(this.dll.size()>0)
        {
        this.dll.removeLast();
         return true;
        }
        else return false;
    }
    
    public int getFront() {
        if(!this.dll.isEmpty()) return dll.getFirst();
        else return -1;
    }
    
    public int getRear() {
        
        if(!this.dll.isEmpty()) return dll.getLast();
        else return -1;
    }   
    public boolean isEmpty() {
        return dll.size()==0;
    }
    
    public boolean isFull() {
        return dll.size()>=this.size;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */