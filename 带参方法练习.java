package 方法;

/*
    设计一个方法用于打印较大值

     思路：
        1.定义一个方法，用于打印两个数字中较大值，例如 getMax（）
        2.方法中定义两个变量，用于保存数字
        3.使用分支语句，分情况讨论两个数字的大小
        4.在main（）方法中调用定义好的方法（使用常量）
        5.在main（）方法中调用定义好的方法（使用变量）
 */
public class 带参方法练习 {
    public static void main(String[] args) {
        //在main（）方法中调用定义好的方法（使用常量）
        getMax(10,20);
        //在main（）方法中调用定义好的方法（使用变量）
        //getMax(10.0,20.0);
        int a=10;
        int b=20;
        getMax(a,b);
    }
    public static void getMax(int a,int b){
        //方法中定义两个变量，用于保存数字
        // int a = 10;
        //int b = 20;
        //使用分支语句，分情况讨论两个数字的大小
        if(a>b){
            System.out.println(a);
        }
        else
        {
            System.out.println(b);
        }
    }
}
