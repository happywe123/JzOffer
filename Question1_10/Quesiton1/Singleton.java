package ReadAgain.Offer.Question1_10.Quesiton1;

public class Singleton {

    // 私有的构造方法
    private Singleton(){}

    // 获取内部类的方法
    public static Singleton getInstance(){
        return Singletonholder.instance;
    }

    // 静态内部类
    private static class Singletonholder
    {
       private static Singleton instance = new Singleton();
    }


    public static void main(String[] args)
    {
        Singleton instance = new Singleton();
        Singleton instance2 = new Singleton();
        System.out.println(instance == instance2);
    }




}
