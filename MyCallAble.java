package countDownLatchTest;

import java.util.Date;
import java.util.concurrent.Callable;

/**
 * @Author: WangYuhao
 * @Date:2021/5/12 22:06
 */
public class MyCallAble implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName() + "\t" + Thread.currentThread().getId() + "\t" + new Date() + " \tstarting...");

        int sum = 0;
        for (int i = 0; i <= 100000; i++) {
            sum += i;
        }
        Thread.sleep(5000);

        System.out.println(Thread.currentThread().getName() + "\t" + Thread.currentThread().getId() + "\t" + new Date() + " \tover...");
        return sum;
    }

}
