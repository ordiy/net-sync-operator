package net.xiang168.netsync.controller;

import net.xiang168.netsync.bean.FileBean;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenping on 2015/8/21  0:21.
 *
 */
public class NetSyncController {

    protected List<FileBean> remoteFiles = new ArrayList<FileBean>();
    protected List<FileBean> localFiles = new ArrayList<FileBean>();

    /**
     * 将远程服务器同步到本地磁盘接口
     * todo:
     * @param localDir 存储的本地路径
     * @param remoteUri 远程路径
     */
    public void syncProcess(String localDir ,String remoteUri){

    }

    public List<FileBean> getFilesFormRemote(){
        return null;

    }

}
