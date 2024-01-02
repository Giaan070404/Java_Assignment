package vti.com;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB {
    private  List<CanBo> danhSach = new ArrayList<>();
    private  Scanner scanner = new Scanner(System.in);
    public  void themMoi() {
        while (true){
            System.out.println("Chọn loại cán bộ muốn thêm:");
            System.out.println("1.Công nhân");
            System.out.println("2.Kỹ sư");
            System.out.println("3.Nhân viên");
            System.out.println("4.exit");

            int chon = scanner.nextInt();
            scanner.nextLine();
            switch (chon){
                case 1:
                    themMoiCongNhan();
                    break;
                case 2:
                    themMoiKySu();
                    break;
                case 3:
                    themMoiNhanVien();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Chọn chưa đúng!");
                    break;
            }

        }

    }

    private  void themMoiCongNhan() {
        System.out.println("Nhập họ tên");
        String hoTen = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int tuoi = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập giới tính:");
        String gtinh = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String diaChi = scanner.nextLine();
        System.out.println("Nhập bậc số lương:");
        int bac = scanner.nextInt();

        CongNhan congNhan = new CongNhan(hoTen,tuoi,gtinh,diaChi,bac);
        danhSach.add(congNhan);
    }
    private  void themMoiKySu() {
        System.out.println("Nhập họ tên");
        String hoTen = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int tuoi = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập giới tính:");
        String gtinh = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String diaChi = scanner.nextLine();
        System.out.println("Nhập ngành đào tạo:");
        String nganhDaoTao = scanner.nextLine();

        KySu kySu = new KySu(hoTen, tuoi, gtinh, diaChi, nganhDaoTao);
        danhSach.add(kySu);
    }
    private  void themMoiNhanVien() {
        System.out.println("Nhập họ tên");
        String hoTen = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int tuoi = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập giới tính:");
        String gtinh = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String diaChi = scanner.nextLine();
        System.out.println("Nhập công việc: ");
        String congViec = scanner.nextLine();

        NhanVien nhanVien = new NhanVien(hoTen, tuoi, gtinh, diaChi, congViec);
        danhSach.add(nhanVien);
    }
    //    -----------------------------------------------------------------------------------------
    private  void timKiemCanBo() {
        System.out.print("Nhập tên cán bộ: ");
        scanner.nextLine();
        String tenCanBoCanTim = scanner.nextLine();

        for (CanBo canbo : danhSach) {
            if (canbo.getHoTen().equalsIgnoreCase(tenCanBoCanTim)) {
                System.out.println(canbo.toString());
            }
        }
    }

//    -----------------------------------------------------------------------------------------
        private  void hienThiDanhSach() {
        for (CanBo canBo : danhSach) {
            System.out.println(canBo.toString());
        }
    }
//    -----------------------------------------------------------------------------------------
    public  void xoa() {
        System.out.print("Nhập tên cán bộ: ");
        scanner.nextLine();
        String tenxoa = scanner.nextLine();
        boolean timkiem = false;
        for (CanBo canBo : danhSach) {
            if (canBo.getHoTen().equals(tenxoa)) {
                timkiem = true;
                danhSach.remove(canBo);
                System.out.println("Đã xóa" + tenxoa);
                return;
            }
        }
        if (timkiem == false){
            System.out.println("Không tìm thấy");
        }

    }

    public  void qlcb() {

        while (true){
            System.out.println("Chọn chức năng:");
            System.out.println("1.Thêm mới cán bộ");
            System.out.println("2.Hiển thị danh sách cán bộ");
            System.out.println("3.Tìm kiếm cán bộ");
            System.out.println("4.Xóa cán bộ");
            System.out.println("5.Thoát");
            int chon = scanner.nextInt();

            switch (chon){
                case 1:themMoi();
                break;
                case 2:
                    hienThiDanhSach();
                    break;
                case 3:
                    timKiemCanBo();
                    break;
                case 4:xoa();
                    break;
                case 5:
                    return;
            }
        }
    }
}
