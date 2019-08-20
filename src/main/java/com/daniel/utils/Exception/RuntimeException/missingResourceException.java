package com.daniel.utils.Exception.RuntimeException;

import java.util.ResourceBundle;

/*
 *  missingResourceException    资源缺失Exception
 *  查找不到需要读取的资源时保错
 * @param null	
 * @return 
 * @throws 
 * @date 2019/8/20 17:47
*/
public class missingResourceException {

    private static ResourceBundle cache = null;//一次读取配置信息放到缓存中
    static{
        try {
            cache = ResourceBundle.getBundle("elposInfo");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        missingResourceException missingResourceException =new missingResourceException();
    }
}
