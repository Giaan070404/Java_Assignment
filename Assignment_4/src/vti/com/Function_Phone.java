package vti.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcion_Phone {
    private List<CanBo> phoneN = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    private Vietnamese vietnamese = new Vietnamese();

    public void chucNang() {
        while (true){
            System.out.println("Chọn chức năng:");
            System.out.println("1.Insert");
            System.out.println("2.ViewList");
            System.out.println("3.Remove");
            System.out.println("4.Update");
            System.out.println("5.exit");

            int chon = scanner.nextInt();
            scanner.nextLine();
            switch (chon){
                case 1:
                    insertContact();
                    break;
                case 2:
                    viewList();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    updateContact();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Chọn chưa đúng!");
                    break;
            }
        }
    }

    private void viewList() {
        for (Phone.Contact contact : vietnamese.contacts){
            System.out.println(contact.toString());
        }
    }

    public void insertContact() {
        System.out.println("Nhập name: ");
        String name = scanner.nextLine();
        System.out.println("Nhập phoneNumber:n");
        String phoneNumber = scanner.nextLine();

        vietnamese.insertContact(name,phoneNumber);
    }

    public void removeContact() {
        System.out.println("Nhập tên: ");
        String nameRemove = scanner.nextLine();
        vietnamese.removeContact(nameRemove);
    }

    public void updateContact(){
        System.out.print("Nhập tên contact cần cập nhật: ");
        String nameTim = scanner.nextLine();
        System.out.print("Nhập tên thay đổi: ");
        String nameUpdate = scanner.nextLine();
        vietnamese.updateContact(nameTim,nameUpdate);

    }



}
