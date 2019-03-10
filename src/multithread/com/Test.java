package multithread.com;

import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
        Calendar cal1 = Calendar.getInstance();

        cal1.add(Calendar.SECOND, 60);

        int second3later = (int) (cal1.getTimeInMillis() / 1000);
        System.out.println(second3later);
    }
}
