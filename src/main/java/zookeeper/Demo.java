package zookeeper;

import java.util.Iterator;
import java.util.List;

/**
 * Demo
 * zookeeper 操作demo
 * @author Lee
 * @date 2019/12/11
 */
public class Demo {

    public static void main(String[] args) {
        System.out.println(123);
        if (true) {
//            return ;
        }
        BaseZookeeper baseZookeeper = new BaseZookeeper();
        try {
            baseZookeeper.conncetZookeeper("127.0.0.1:1281");
//            List<String> children = baseZookeeper.getChildren("/");
//            Iterator list = children.iterator();
//            while (list.hasNext()) {
//                String temp = (String)list.next();
//                System.out.println("temp:" + temp);
//            }
//            baseZookeeper.closeConnection();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                baseZookeeper.closeConnection();
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }


        }


    }

}
