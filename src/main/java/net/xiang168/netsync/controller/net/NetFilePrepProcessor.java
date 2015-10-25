package net.xiang168.netsync.controller.net;

import jcifs.smb.NtlmPasswordAuthentication;
import jcifs.smb.SmbFile;
import net.xiang168.netsync.bean.FileBean;

import java.net.MalformedURLException;
import java.util.List;

/**
 * Created by chenping on 2015/8/21  0:21
 */
public class NetFilePrepProcessor {

    public List<FileBean> buildNetFileTreeProcess(String remoteUri ,NtlmPasswordAuthentication auth){
        try {
            SmbFile smbFile = new SmbFile(remoteUri,auth);

            //todo:
            SmbFile[] smbFileList = smbFile.listFiles();
            for (SmbFile file : smbFileList) {
                System.out.println("======");
            }



        } catch (MalformedURLException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        //todo: 调用
        return null;
    }


    /**
     * 构建文件树
     * @param file
     * @param supserTree
     */
    private void recuriseNet(SmbFile[] smbFileList ,FileBean supserTree){

    }

    /**
     * 文件拷贝方法
     */
    public void compareFileVersion(){

    }

    /**
     * 执行文件拷贝
     */



}
