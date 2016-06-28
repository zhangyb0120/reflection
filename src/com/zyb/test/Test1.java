package com.zyb.test;

import com.zyb.entity.MyObject;

import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Test1
{
    public static void main(String[] args)
        throws Exception
    {
        //1 获取Class对象
        
        // 如果你在编译期知道一个类的名字的话，那么你可以使用如下的方式获取一个类的 Class 对象。
        Class myObjectClass = MyObject.class;
        
        // 如果你在编译期不知道类的名字，但是你可以在运行期获得到类名的字符串,那么你则可以这么做来获取 Class 对象
        String className = "com.zyb.entity.MyObject";
        myObjectClass = Class.forName(className);
        
        // 2 获取类名
        System.out.println("全限定类名：" + myObjectClass.getName());
        System.out.println("简单类名：" + myObjectClass.getSimpleName());
        System.out.println("----------------------------------------------------");
        // 3 获取修饰符
        System.out.println("修饰符：" + myObjectClass.getModifiers());
        System.out.println("修饰符-isAbstract：" + Modifier.isAbstract(myObjectClass.getModifiers()));
        System.out.println("修饰符-isFinal：" + Modifier.isFinal(myObjectClass.getModifiers()));
        System.out.println("----------------------------------------------------");
        // 4 获取包信息
        System.out.println("包：" + myObjectClass.getPackage());
        System.out.println("----------------------------------------------------");
        // 5 获取父类
        System.out.println("父类：" + myObjectClass.getSuperclass());
        System.out.println("----------------------------------------------------");
        // 6 获取实现接口
        Class<?>[] interfaces = myObjectClass.getInterfaces();
        System.out.println("实现接口：" + Arrays.toString(interfaces));
        System.out.println("----------------------------------------------------");

    }
}
