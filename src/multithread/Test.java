package multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(100);
    }
}
