package com.daniel.utils.Exception.IOException;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* EOFException  END OF FILE
 * 当输入过程意外到达文件或流的末尾是，抛出此异常
 * @param null	
 * @return 
 * @throws 
 * @date 2019/8/21 10:57
*/
public class EOFException {
    public static void main(String[] args) throws Exception {
        EOFuser eoFuser1 = new EOFuser("Daniel Zhang" , 23);
        EOFuser eoFuser2 = new EOFuser("Mint Chen" , 22);

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(eoFuser1);
        oos.writeObject(eoFuser2);
        oos.writeObject(null);// 是允许往流中放入null值的。即就算读到为null，也不能表示已经到达流的末尾

        byte[] data = bos.toByteArray();

        ByteArrayInputStream bis = new ByteArrayInputStream(data);
        ObjectInputStream ois = new ObjectInputStream(bis);

        System.out.println(ois.readObject());
        System.out.println(ois.readObject());
        System.out.println(ois.readObject());
        System.out.println(ois.readObject());

    }
}
