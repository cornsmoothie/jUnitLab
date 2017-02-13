
package junitdayslab;


public class Date {
    int year;
    int month;
    int day;
    
    public Date(int a , int b , int c) {
        
        this.year = a;
        this.month=b;
        this.day=c;
    }
    
    public int daysTo(Date d1) {
        
        //System.out.println("made it");
        
        int daysTo = 0;
        
        daysTo = Math.abs(((this.year*365) + (this.month*30) + (this.day)) - ((d1.year *365) + (d1.month*30) + (d1.day)));
        
        
        return daysTo;
    }
}
