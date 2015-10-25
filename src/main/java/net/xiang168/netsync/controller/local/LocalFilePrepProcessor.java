package net.xiang168.netsync.controller.local;

import com.sun.istack.internal.NotNull;
import net.xiang168.netsync.bean.FileBean;

import java.io.File;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by chenping on 2015/8/21  0:21.
 *
 */
public class LocalFilePrepProcessor {

    public List<FileBean> buildLocalFileTree(String localDir){
        File localSuperFile = Paths.get(localDir).toFile();
        FileBean superFileTre = new FileBean(localSuperFile);
        if (localSuperFile.exists()) {
            this.recurseLocalDir(superFileTre ,localSuperFile);
        }
        System.out.println(superFileTre.getSubFiles().get(0));

        return superFileTre.getSubFiles();
    }

    @NotNull
    private void recurseLocalDir(FileBean superFileTre, File localSuperFile) {
        FileBean subFileBean;
        if (localSuperFile.exists() ) {
            for (File file : localSuperFile.listFiles()) {
                subFileBean = new FileBean(file);
                System.out.println(file.getAbsolutePath().toString());
                if (file.isDirectory()) {
                    recurseLocalDir(subFileBean, file);
                }
                superFileTre.addSubFileTree(subFileBean);
            }
        }
    }

    public static void main(String[] args) {
        String localDir = "F:\\迅雷下载\\img-1" ;
        LocalFilePrepProcessor pro = new LocalFilePrepProcessor();
        pro.buildLocalFileTree(localDir);
    }


}
