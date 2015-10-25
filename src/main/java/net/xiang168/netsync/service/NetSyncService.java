package net.xiang168.netsync.service;

import net.xiang168.netsync.bean.TaskPolicy;
import net.xiang168.netsync.controller.TaskPolicyOperator;
import net.xiang168.netsync.controller.TaskType;
import net.xiang168.netsync.controller.schedules.TaskSchedulesOperator;
import net.xiang168.netsync.service.utile.SystemUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDateTime;

/**
 * Created by Ordiy on 2015/10/22.
 */
public class NetSyncService {
    private Logger logger = LogManager.getLogger();

    public void processNetSync(){
        //获得任务的策略
        TaskPolicyOperator taskPolicy1 = new TaskPolicyOperator();
        TaskPolicy taskPolicy = taskPolicy1.getTaskPloicyByTaskType(TaskType.SCHEDULER_TASK);

        //todo:根据策略执行任务

    }

    /**
     * 定时同步方法
     */
    public void setScheduledTask(){
        TaskSchedulesOperator operator = new TaskSchedulesOperator();
        int initDelay = 24 * 60 * 60 * 1000;
        long runCycle = SystemUtil.getTimeMilles("08:00:00").getTime() - System.currentTimeMillis();
       // runCycle = (runCycle - initDelay >=0 ) ?  runCycle : 0;

        logger.info("set scheduled task ..");
        operator.executedFixedDelay(new Runnable() {
            public void run() {
                System.out.println("test..." + LocalDateTime.now());
            }
        }
        ,initDelay, runCycle);

        //注册定时检查更新任务   40min/检查一次更新
        long intervalTime =  40 * 60 * 1000;
        operator.executedFixedDelay(new Runnable() {
            public void run() {
                logger.info("execute checker ");
            }
        } , 0 ,intervalTime);
    }


}
