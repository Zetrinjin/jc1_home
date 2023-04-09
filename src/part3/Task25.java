package part3;

public class Task25 {
    public static void main(String[] args) {

        int sec=24,min =3, hour =5;
        int total;
        total = sec + min*60 + hour * 3600;

        Time time1 = new Time(sec,min,hour);
        Time time2 =new Time(18203);
        Time time3 =new Time(24,3,5);

        time1.compare(time2);
        time1.compare(time3);
        
        System.out.println(time1.totalTime());
        time1.display();
        time2.display();
    }
}

class Time{

    private int sec;
    private int min;
    private int hour;

    public Time(int sec,int min,int hour){
        this.sec = sec;
        this.min = min;
        this.hour = hour;
    }

    public Time(int total){
        this.sec = total;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    public int getSec(){
        return sec;
    }

    public int getMin(){
        return min;
    }

    public int getHour(){
        return hour;
    }

    public int totalTime(){
        return sec + min * 60 + hour*3600;
    }

    public void compare(Time o){

        int compThis =totalTime();
        int compOther = o.totalTime();

        if(compThis>compOther){
            System.out.println("object1>object2");
        } else if (compThis<compOther) {
            System.out.println("object1<object2");
        }else {
            System.out.println("object1=object2");
        }
    }
    void display(){
        System.out.println("sec:" + sec + " min:" + min + " hour:" + hour);
    }
}