package net.xiang168.netsync.bean;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenping on 2015/8/21  0:21.
 *
 */
public class FileBean {
    //文件名称
    private String name ;
    //最后修改时间
    private long lastModified;
    //父目节点
    private FileBean parent;
    //文件路径
    private String path;
    //子文件
    private List<FileBean> subFiles = new ArrayList<FileBean>();

    private boolean isDir ;
    private boolean isFile ;


    public FileBean(File file) {
        this.name = file.getName();
        this.path = file.getPath();
        this.setLastModified(file.lastModified());
        isDir =file.isDirectory();
        isFile = file.isFile();
    }

    public FileBean(String name, long lastModified, FileBean parent, List<FileBean> subFiles) {
        this.name = name;
        this.lastModified = lastModified;
        this.parent = parent;
        this.subFiles = subFiles;
    }

    /**
     * 添加子树
     * @param subFileBean
     */
    public void addSubFileTree(FileBean subFileBean) {
        subFileBean.setParent(this);
        this.subFiles.add(subFileBean);
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public boolean isDir() {
        return isDir;
    }

    public void setIsDir(boolean isDir) {
        this.isDir = isDir;
    }

    public boolean isFile() {
        return isFile;
    }

    public void setIsFile(boolean isFile) {
        this.isFile = isFile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getLastModified() {
        return lastModified;
    }

    public void setLastModified(long lastModified) {
        this.lastModified = lastModified;
    }

    public FileBean getParent() {
        return parent;
    }

    public void setParent(FileBean parent) {
        this.parent = parent;
    }

    public List<FileBean> getSubFiles() {
        return subFiles;
    }


    public void setSubFiles(List<FileBean> subFiles) {
        this.subFiles = subFiles;
    }
}
