package com.chengbinbbs;

import com.chengbinbbs.distribute.queue.DistributedBlockingQueue;
import org.apache.zookeeper.KeeperException;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 测试
 *
 * @author zhangcb
 * @created 2017-05-27 16:34.
 */
public class DistributedBolckingQueueTest {

    private final Logger logger = LoggerFactory.getLogger(DistributedBolckingQueueTest.class);


    @Test
    public void test() throws InterruptedException, KeeperException {
        //用多线程模拟分布式服务
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    DistributedBlockingQueue queue=new DistributedBlockingQueue("120.27.xxx.xx:2181", "test");
                    try {
                        queue.put(Thread.currentThread().getName().getBytes());
                    } catch (KeeperException e) {
                        e.printStackTrace();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }

        DistributedBlockingQueue queue=new DistributedBlockingQueue("120.27.141.45:2181", "test");
        while(true){
            System.out.println(new String(queue.tack()));
        }
    }


}
