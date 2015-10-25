package net.xiang168.netsync.controller.schedules;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * Created by Ordiy on 2015/9/18.
 */
public class TaskSchedulesOperator {
    private ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

    public ScheduledFuture<?> executedFixedDelay(Runnable r , long initialDelay , long delay){
        return executorService.scheduleWithFixedDelay( r, initialDelay, delay, TimeUnit.MILLISECONDS);
    }

}
