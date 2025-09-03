package TestAuto;

public class Xulychuoi {
    public Xulychuoi(){

    }
    public static void main(String[] args) {

        String str1 = "java for tester";
        String str2 = "selenium";
        String str3 = "TestNG";

        System.out.println("cat chuoi:" + str1.substring(5));

        System.out.println("------------------------");
        String tachChuoi[] = str1.split(" ");;
        for (String item : tachChuoi){
            System.out.println(item);
        }

    }
}
