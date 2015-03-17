package com.github.upelsin.rxJavaSchedulers;

import rx.Scheduler;

import java.util.Queue;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;

import com.github.upelsin.rxJavaSchedulers.PriorityExecutorScheduler.PriorityExecutorAction;


/**
 * Created by Alexey Dmitriev <mr.alex.dmitriev@gmail.com> on 04.02.2015.
 */
public class PrioritySchedulers {

    private static Queue<PriorityExecutorAction> QUEUE = new PriorityBlockingQueue<PriorityExecutorAction>();

    private static ScheduledExecutorService EXECUTOR = Executors.newSingleThreadScheduledExecutor();

    public static Scheduler priority(int priority) {
        return new PriorityExecutorScheduler(EXECUTOR, QUEUE, priority);
    }
}
