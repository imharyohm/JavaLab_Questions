import java.util.Scanner;

class date {
    int day,month,year;
    date(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }



     boolean isLeapYear() {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }

    int daySinceJan1(){
        if(isLeapYear()){
         day=(month-1)*30+day+1;
         return day;
        }
        else
        return (month-1)*30+day;
   }
}

public class datedemo{
    public static void main(String[] args) {
        date d = new date(20, 3, 2022);
        System.out.println("No. of days:"+d.daySinceJan1());
    }
}