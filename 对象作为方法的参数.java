package 方法;
class student02 {
    private String account;
    private String password;
    public student02(String account, String password){//形参
        this.account=account;
        this.password=password;
    }

    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        password="acds";
        System.out.println("password: "+password);
    }
}
class loginService02 {
    private student02 t;
    public String isLogin(student02 t){
        if (t.getAccount()=="admin" && t.getPassword()=="456789"){
            return "登陆成功";
        }
        return "用户名或密码错误";
    }
}
public class 对象作为方法的参数 {
    public static void main(String[] args){
        /*
        Student t1=new Student("admin","456789");//实参
        LoginService ls=new LoginService();
        String result= ls.isLogin(t1);
        System.out.println(result);

         */
        //当方法的类型为基本数据类型时，如果改变形参变量的内容。实参内容不会随着发生改变
        student02 t2=new student02("admin","acds");
        String pwd="123560";
        t2.setPassword(pwd);
        System.out.println("password: "+pwd);
        System.out.println("pwd: "+pwd);
    }
}
