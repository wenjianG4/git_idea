package wj;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wenjian
 * @ClassNmae E2Demo
 * @Date 2022/3/5
 * @Version 1.0
 * @Description TODO
 **/
public class E2Demo {
    public static void main(String[] args) {
        String a1 = args[0];
        String a2 = args[1];

        System.out.println("第一个参数是："+a1);
        System.out.println("第二个参数是："+a2);

        System.out.println("两个参数拼接是："+a1 +" & "+a2);
        List list = new ArrayList<>();
        list.add(a1);
        list.add(a2);
        System.out.println(list);
    }
}
