package net.xiang168.netsync.controller;

/**
 * Created by Ordiy on 2015/10/25.
 */
public enum TaskType {
    SCHEDULER_TASK(""),
    TIMER_TASK(""),
    IMMEDIATE_TASK("");
    private String desc ;
    TaskType(String info) {
        this.desc = info;
    }

}
