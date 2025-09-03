package bai1_variable;

public class ham {

    public static String getHeaderPage(){
        System.out.println("Dùng se lay header");
        String header = "day la header";
        return header ;
    }

    public static void Welcome(String name) {
        System.out.println("Xin chao "+ name);
    }

    public static int sum(int a , int b){
        return a + b;
    }
    public static void main(String[] args) {
        String values = getHeaderPage();
        System.out.println(values);
        Welcome("Chi");
        int cong = sum(1,2);
        System.out.println(cong);

    }

}
