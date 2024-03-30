package 方法;
/*
       带参数方法调用

        定义格式：
             public static void 方法名（参数）{·······}

        调用格式：
              方法名（参数）
 */
public class 带参方法调用 {
    public static void main(String[] args) {
        //常量值的调用
        //控制台也会输出true或false
        isEvenNumber(15);
        //变量的调用
        int number = 10;
        isEvenNumber(number);
    }
    //定义一个方法，该方法接收一个参数，判断该数据是否是偶数·
    public static void isEvenNumber(int number){
        if (number%2==0){
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }
}
