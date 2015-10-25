package net.xiang168.netsync.service.utile;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * Created by Ordiy on 2015/10/25.
 */
public class SystemUtil {


    /**
     * 传入HH:ss:mm 返回对应的日期
     * @param str
     * @return
     */
    public static Date getTimeMilles(String str){
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
           date = format2.parse(format1.format(new Date())+ " " + str);
        } catch (Exception e) {

        }
        return date;
    }
}
