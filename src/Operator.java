import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap vao chieu dai HCN");
        width =  scanner.nextFloat();
        System.out.println("Hay nhap vao chieu rong HCN");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("Dien tich hinh chu nhat la: " + area);
    }
}
