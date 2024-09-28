class MyCalendarTwo {
private:
map<int, int> m;
int sum=0;
public:
    MyCalendarTwo() {
        
    }
    
    bool book(int start, int end) {
        m[start]++;
        m[end]--;
        sum=0;
        for(auto iter: m) 
        {
            sum+=iter.second;
        if(sum>=3) 
        {
            m[start]--;
            m[end]++;
            return false;
        }
        }
            return true;
        }

};

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo* obj = new MyCalendarTwo();
 * bool param_1 = obj->book(start,end);
 */