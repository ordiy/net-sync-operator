package net.xiang168.netsync.controller.msg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.logging.Logger;

/**
 * Created by ChenPingxin on 2015/8/21  0:26.
 *
 *使用socket
 */

public class MsgConnectOperator {

    public void connectProcessor()throws Exception{
        ServerSocket serverSocket = new ServerSocket(8089);
        Socket socket = null;

        try {
            while (true){
                socket = serverSocket.accept();
                //log
                //获取输入内容
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                while (true){
                    String str = in.readLine();
                    //log accept msg
                    if("end".equals(str)){
                        break;
                    }
                    socket.sendUrgentData(0xFF);
                }
            }
        }catch (SocketException sockE){
            //log
        }catch (IOException ioe){
            //log
        }finally {
            socket.close();
        }
    }




}
