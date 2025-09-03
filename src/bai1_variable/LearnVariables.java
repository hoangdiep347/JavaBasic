package bai1_variable;
public class LearnVariables {
    public void sayHello() {
        int number = 100;
        int a = 10;
        int b;
        b = a + number;
        System.out.println(b);

    }

    public class Counter1 {
        int count = 0; // sẽ lấy bộ nhớ khi instance được tạo ra

        Counter1() {
            count++;
            System.out.println(count);
        }
    }

    public static void main(String[] args) {
        String name = "cao thành phát";
        System.out.println("Họ tên: " + name);
// comment trong code
        // Ctrl + Alt +L format code
        int age = 0;
        System.out.println("Tuổi: " + age);

        String address = "Can Tho"; // khai bao bien dia chi
        System.out.println("Địa chỉ: " + address);

        //Counter1 c1 = new Counter1();
        //Counter1 c2 = new Counter1();
       // Counter1 c3 = new Counter1();
    }
}





