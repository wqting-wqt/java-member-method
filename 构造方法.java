package 方法;
class car01 {
    String carNum;
    public car01(String num){
        carNum=num;
    }//形参
    void searchNum(){
        //charAt()索引范围是0到length()-1
        char endNum=carNum.charAt(carNum.length()-1);
        int num=Integer.parseInt(String.valueOf(endNum));
        if (num%2==0)
            System.out.println("double");
        else
            System.out.println("single");
    }
}
public class 构造方法 {
    public static void main(String[] args){
        //写法01
        car01 myCar=new car01("粤A08L34");//实参
        myCar.searchNum();
        //写法02
        myCar.carNum="粤A08L36";
        myCar.searchNum();
    }
}
