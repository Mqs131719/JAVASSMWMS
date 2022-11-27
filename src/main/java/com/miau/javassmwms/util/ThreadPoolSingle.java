package com.miau.javassmwms.util;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 小盛胜
 * 2022/11/13
 */
public class ThreadPoolSingle {
    public ThreadPoolExecutor executor;
    private ThreadPoolSingle(){
        executor=new ThreadPoolExecutor(8,20,10, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
    }

    private static class ThreadInner{
        private static  final ThreadPoolSingle threadPoolSingle=new ThreadPoolSingle();
    }

    public static ThreadPoolSingle getInstance(){
        return ThreadInner.threadPoolSingle;
    }
}
