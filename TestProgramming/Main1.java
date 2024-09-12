// Định nghĩa lớp Car
class Car {
    // Thuộc tính
    private String name;
    private int speed;

    // Phương thức khởi tạo (Constructor)
    public Car(String name) {
        this.name = name;
        this.speed = 0; // Khởi tạo tốc độ ban đầu là 0
    }

    // Phương thức để khởi động xe
    public void start() {
        System.out.println(name + " is starting.");
    }

    // Phương thức để tăng tốc độ xe
    public void accelerate(int increase) {
        speed += increase;
        System.out.println(name + " is now going at " + speed + " km/h.");
    }

    // Phương thức để hiển thị thông tin về xe
    public void showInfo() {
        System.out.println("Car name: " + name);
        System.out.println("Current speed: " + speed + " km/h.");
    }
}

// Lớp Main chứa hàm main để chạy chương trình
public class Main1 {
    public static void main(String[] args) {
        // Tạo một đối tượng Car
        Car myCar = new Car("Toyota");
        

        // Gọi các phương thức của đối tượng Car
        myCar.start();         // Khởi động xe
        myCar.accelerate(50);  // Tăng tốc xe
        myCar.accelerate(20);  // Tăng thêm tốc độ
        myCar.showInfo();      // Hiển thị thông tin về xe
    }
}
