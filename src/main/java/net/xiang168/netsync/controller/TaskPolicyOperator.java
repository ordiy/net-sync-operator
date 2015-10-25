package net.xiang168.netsync.controller;

import net.xiang168.netsync.bean.TaskPolicy;

/**
 * Created by Ordiy on 2015/10/25.
 */
public class TaskPolicyOperator {

    /**
     * 根据任务类型获取策略器
     * @param taskType
     * @return
     */
    public TaskPolicy getTaskPloicyByTaskType(TaskType taskType){
        TaskPolicy taskPolicy = new TaskPolicy();
        switch (taskType) {
            case SCHEDULER_TASK:
            case TIMER_TASK:
            case IMMEDIATE_TASK:
            default:
                System.out.println();
        }
        return taskPolicy;
    }

}
