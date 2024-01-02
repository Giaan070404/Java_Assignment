import com.sun.glass.ui.ClipboardAssistance;
import javafx.beans.value.ObservableStringValue;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static javafx.beans.binding.Bindings.isEmpty;

public class Main {

    public static void main(String[] args) {
//        Question 1:
        float acc1;
        float acc2;
        acc1 = 5240.5f;
        acc2 = 10970.055f;
        int acc1Salary = (int) acc1;
        System.out.println("Account 1 salary: " + acc1Salary);
        int account2 = (int) acc2;
        System.out.println("Account 2 salary: " + account2);
        System.out.println(" ");
//         =============================================
//        Question 2;
        int r = ThreadLocalRandom.current().nextInt(0, 100000);
        System.out.println(r);
        while (r < 100000) {
            r = r * 10;
        }
        System.out.println(r);
        System.out.println(" ");
//         ==============================================
//        Question 3;
        int numberQuestion2 = 202010;
        // Cách 1: Convert số có 5 chữ số ra String, sau đó lấy 2 số cuối
        String numberStr = String.valueOf(numberQuestion2);
        String lastNumber = numberStr.substring(Math.max(0, numberStr.length() - 2));
        System.out.println("Cách 1: " + lastNumber);
        // Cách 2: Chia lấy dư số đó cho 100
        int lastNumber2 = numberQuestion2 % 100;
        System.out.println("Cách 2: " + lastNumber2);
        System.out.println(" ");
//         ==============================================
//        Question 4;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập vào số nguyên b: ");
        int b = scanner.nextInt();
        System.out.println("Thương của " + a + " và " + b + " là: " + divide(a, b));
        System.out.println(" ");
//         ======================================================
//        Exercise 2;
        Account account = new Account();
        account.id = 1;
        System.out.println("UserName: " + account.userName);
        System.out.println("FullName: " + account.fullName);
        System.out.println("Email: " + account.email);
        System.out.println(LocalDate.now());
        System.out.println(" ");
//         ======================================================
//        Exercise 3 - Q1;
        Integer k = 5000;
        Float p = Float.valueOf(k);
        System.out.println("Lương kiểu Integer: " + k);
        System.out.println("Lương kiểu Float: " + p);
        System.out.println(" ");
//         ======================================================
//        Question 2;
        String x = "1234567";
        int i = Integer.parseInt(x);
        System.out.println("So int: " + i);
        System.out.println(" ");
//         ======================================================
//        Question 3;
        Integer Object = new Integer(1234567);
        int intValue = Object; // Auto-unboxing
        System.out.println(intValue);
        System.out.println(" ");
//         ======================================================
//        Exercise 4 - Q1;
        String x = "I'm a Developer";
        String[] arr = x.split(" ");
        int size = arr.length;
        System.out.println(size);
        for (int i = 0; i < size; i++) {
            System.out.println(i + " " + arr[i]);
    }
//         ======================================================
//        Question 2;
        String s1 = "I am a ";
        String s2 = "Developer";
        String s3 = s1.concat(s2);
        System.out.println(s3);
        System.out.println(" ");
//         =======================================================
//        Question 3:
        Scanner check = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String userName = scanner.nextLine();
        capitalizeFirstLetter(userName);
        scanner.close();
//         =======================================================
//        Question 4:
        Scanner check = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String hoTen = check.nextLine();
        String[] arr = hoTen.split(" ");
        for (int g = 0; g < arr.length; g++) {
            for (int h = 0; h < arr[g].length(); h++){
                char kyTu = arr[g].charAt(h);
                System.out.println("Ký tự thứ " + (h + 1) + " của từ thứ " + (g + 1) + " là: " + kyTu);
            }
        }
//         ==================================================
//        Question 5;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println(" Nhap ho cua ban: ");
        String ho = scanner1.nextLine();
        System.out.println("Nhap ten cua ban: ");
        String ten = scanner1.nextLine();
        String[] arr = ho.split(" ");
        String[] arr1 = ten.split(" ");
        System.out.println("Ho ten day du: " + ho + " " + ten);
//         ==================================================
//        Question 6:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ và tên đầy đủ của bạn: ");
        String hoTen = scanner.nextLine();
        String[] parts = hoTen.split(" ");
        if (parts.length >= 3) {
            String ho = parts[0];
            String tenDem = parts[1];
            String ten = parts[2];
            System.out.println("Họ là: " + ho);
            System.out.println("Tên đệm là: " + tenDem);
            System.out.println("Tên là: " + ten);
        } else {
            System.out.println("Vui lòng nhập họ tên đầy đủ!");
        }
        scanner.close();
//         ====================================================
//            Question 7;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ và tên đầy đủ: ");
        String fullName = scanner.nextLine();
        fullName = fullName.trim().replaceAll("\\s+", " ");
        String[] nameParts = fullName.split(" ");
        StringBuilder normalizedFullName = new StringBuilder();
        for (String part : nameParts) {
            if (!part.isEmpty()) {
                String capitalizedPart = part.substring(0, 1).toUpperCase() + part.substring(1).toLowerCase();
                normalizedFullName.append(capitalizedPart).append(" ");
            }
        }
        System.out.println("Chuỗi sau khi chuẩn hóa: " + normalizedFullName.toString().trim());
//         ====================================================
//            Question 8;
        Group gr1 = new Group(1, "Java");
        Group gr2 = new Group(2, "Java Group");
        Group gr3 = new Group(3, "Another Java");
        Group gr4 = new Group(4, "Python");
        Group gr5 = new Group(5, "HTML");

        Group[] groups = {gr1, gr2, gr3, gr4, gr5};
        Pattern pattern = Pattern.compile("Java");

        for (Group group : groups) {
            Matcher matcher = pattern.matcher(group.toString());
            if (matcher.find()) {
                System.out.println(group);
            }
        }
//        =====================================================
//        Question 9;
        Group gr1 = new Group(1, "Java");
        Group gr2 = new Group(2, "Java Group");
        Group gr3 = new Group(3, "Another");
        Group gr4 = new Group(4, "Python");
        Group gr5 = new Group(5, "HTML");
        Group[] groups = {gr1, gr2, gr3, gr4, gr5};
        String chuoi = "\\bJava\\w*\\b";
        Pattern pattern = Pattern.compile(chuoi);
        int count = 0;
        for (Group group : groups) {
            Matcher matcher = pattern.matcher(group.toString());
            while (matcher.find()) {
                System.out.println("group: " + matcher.group());
                count++;
            }
        }
        System.out.println("Co tat ca " + count + " group ");
//         ------------------------------------------
//        Question 10;
        String str1 = "abcdef";
        String str2 = "fedcba";
        if (areStringsReversed(str1, str2)) {
            System.out.println("OK");
        } else {
            System.out.println("KO");
        }
//         ================================================
//        Question 11;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String a = scanner.nextLine();
        char kyTu = 'a';
        int count = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == kyTu) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự " + kyTu + " trong chuỗi " + a + " = " + count);
//         =================================================
//        Question 12;
        String input ="abcdef";
        byte[] daoNguocChuoi = input.getBytes();
        byte[] result = new byte[daoNguocChuoi.length];
        for (int i = 0; i < daoNguocChuoi.length; i++)
            result [i] = daoNguocChuoi[daoNguocChuoi.length - i - 1];
        System.out.println(new String(result));
//         ==================================================
//        Question 13;
//        Cách 1:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String Test = scanner.nextLine();
        boolean allLetters = true;
        for (int i = 0; i < Test.length(); i++)
            if ('0' <= Test.charAt(i) &&  Test.charAt(i) <= '9' ) {
                allLetters = false;
                break;
            }
        if (allLetters) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
//         ======================================
//         Cách 2:
        if (isEmpty(cs)) {
            return false;
        }
        final int sz = cs.length();
        for (int i = 0; i < sz; i ++) {
            if (!Character.isDigit(cs.chartAr(i))) {
                return false;
            }
        }
        return false;
//         =================================================
//        Exercise 5 - Q1
        Department dep1 = new Department(1,"Sale", 10);
        Department dep2 = new Department(2,"Maketting", 15);
        Department dep3 = new Department(3,"Sale", 5);
        String reverse = new StringBuffer().reverse().toString();
        System.out.println("Thong tin phong ban 1: " + dep1);
//         ---------------------------------------
//        Question 2;
        Department dep1 = new Department(1,"Sale", 10);
        Department dep2 = new Department(2,"Maketting", 15);
        Department dep3 = new Department(3,"Sale", 5);
        Department[] phongBanArray = new Department[]{dep1, dep2, dep3};
        System.out.println("Thông tin tất cả các phòng ban:");
        for (Department phongBan : phongBanArray) {
            System.out.println(phongBan);
        }
//         ----------------------------------------
//        Question 3;
        Department dep1 = new Department(1, "Sale", "DaNang", 10);
        Department dep2 = new Department(2, "Marketing", "DakLak", 15);
        Department dep3 = new Department(3, "Sale", "QuangNam", 5);

        Department[] phongBanArray = new Department[]{dep1, dep2, dep3};

        System.out.println("Địa chỉ của phòng ban thứ 1: " + phongBanArray[0].address);
//         ----------------------------------------
//        Question 4:
        Department dep1 = new Department(1, "Sale", "DaNang", 10);
        Department dep2 = new Department(2, "Marketing", "DakLak", 15);
        Department dep3 = new Department(3, "Sale", "QuangNam", 5);
        for (int i = 0; i < dep1.length(); i++) {
            if (Character.isLetter(dep1.charAt(i))) {
                break;
            }
        }
            if (dep1.name.equals("Phong A")) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
//            -------------------------------------
//        Question 5:
        Department dep1 = new Department(1, "Sale", "DaNang", 10);
        Department dep2 = new Department(2, "Marketing", "DakLak", 15);
        Department dep3 = new Department(3, "Sale", "QuangNam", 5);

        System.out.println(dep1.equals(dep2));
        System.out.println(dep1.equals(dep3));
        System.out.println(dep1 == dep3);
//         ------------------------------------------
//        Question 6:
        String[] group = new String[] {
                        "Sale",
                        "Boss of director",
                        "Waiting room",
                        "Accounting",
                        "Marketing"
                                  };
        for (int i = 0; i < group.length - 1; i++) {
            for (int j = i + 1; j < group.length; j++) {
                if (group[i].compareTo(group[j]) > 0) {
                    String temp = group[i];
                    group[i] = group[j];
                    group[j] = temp;
                }
            }
        }
        System.out.println("Chuoi sau khi sap xep: ");
        for (int i = 0; i < group.length; i++){
            System.out.println(group[i]);
        }
//         -------------------------------------------
//        Question 7:
        String[] group = new String[] {
                        "Sale",
                        "Boss of director",
                        "Waiting room",
                        "Accounting",
                        "Marketing" };
        Arrays.sort(group);
        System.out.println("Danh sách phòng ban sau khi sắp xếp theo tên:");
        for (String phongBan : group) {
            System.out.println(phongBan);
        }
        // ======================================================
        // ======================================================
        // ======================================================
    private static String chuanHoaChuoi(String input){
        String trimmedString = input.trim();
        String normalizedString = trimmedString.replaceAll("\\s+", " ");
        String[] words = normalizedString.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(word.substring(0, 1).toUpperCase()).append(word.substring(1)).append(" ");
            }
        }
        return result.toString().trim();
    }
//    // ---------------------------------------------
        // E1 - Q4
    public static int divide(int a, int b) {
        return b != 0 ? a / b : 0;
    }
    // ------------------------------------------------
    // Exercise 5 - Question 10
// Hàm kiểm tra xem hai chuỗi có là đảo ngược của nhau hay không
        private static boolean areStringsReversed(String str1, String str2) {
            // Nếu độ dài của hai chuỗi không bằng nhau, chúng không thể là đảo ngược
            if (str1.length() != str2.length()) {
                return false;
            }
            // So sánh ký tự của hai chuỗi từ đầu đến cuối và ngược lại
            for (int i = 0, j = str2.length() - 1; i < str1.length(); i++, j--) {
                if (str1.charAt(i) != str2.charAt(j)) {
                    return false; // Nếu có ký tự khác nhau, hai chuỗi không là đảo ngược
                }
            }
            return true;
    }
}
