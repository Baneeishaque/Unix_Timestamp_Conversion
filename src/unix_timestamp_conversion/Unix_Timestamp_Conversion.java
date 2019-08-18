/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unix_timestamp_conversion;

import java.util.Date;

/**
 *
 * @author dk
 */
public class Unix_Timestamp_Conversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long timeStamp = 1492358400;
        Date time=new Date((long)timeStamp*1000);
        System.out.println(time);
    }
    
}
