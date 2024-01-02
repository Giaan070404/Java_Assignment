package vti.com;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Student {
    private int id;
    private String name;
    private String hometown;
    private double diemHoc;

    public Student(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
        this.diemHoc = 0;
    }
    public void setDiemHoc(double diemHoc) {
        this.diemHoc = diemHoc;
    }
    public void congDiem( double diemCong) {
        this.diemHoc += diemCong;
    }
    public void thongTin() {
        System.out.println("Tên sinh viên: " + this.name);
        System.out.println("Địa chỉ: " + this.hometown);
        System.out.println("Điểm học: " + this.diemHoc + " - ");

        if (this.diemHoc < 4.0) {
            System.out.println("Yếu");
        } else if (this.diemHoc >= 4.0 && this.diemHoc < 6.0) {
            System.out.println("Trung bình");
        } else if (this.diemHoc >= 6.0 && this.diemHoc < 8.0) {
            System.out.println("Khá");
        } else {
            System.out.println("Giỏi");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ tên của bạn: ");
        String hoTen = scanner.nextLine();
        System.out.println("Nhập địa chỉ của bạn: ");
        String diaChi = scanner.nextLine();
        Student student = new Student(hoTen, diaChi);
        System.out.println("Họ tên của bạn là: " + hoTen);
        System.out.println("Địa chỉ của bạn là: " + diaChi);
        // set điểm và in thông tin
        student.setDiemHoc(7.5);
        student.thongTin();
        // cộng thêm điểm
        System.out.println("Điểm sau khi cộng: ");
        student.congDiem(1.5);
        student.thongTin();
    }
}

