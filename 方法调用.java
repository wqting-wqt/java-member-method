package 方法;
/*
   方法：
        是将具有独立功能的代码块组织成一个整体，使其具有特殊功能的代码块

     定义格式：
           public static void 方法名（）{
              //方法体
                }
     调用格式：
             方法名（）；
 */
public class 方法调用 {
    public static void main(String[] args) {
        //定义变量
        int number = 15;
        number =0;
        //判断的是下面的0
        //判断该数据是否是偶数
        if (number%2==0){
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }

    }
}
