import java.util.Scanner;

public class Tim_gia_tri_trong_mang {
    public static void main(String[] args) {
        String[] students = {"Sang", "Trúc", "Huy", "Kiện", "Nhật"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên của học sinh:");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Vị trí của các sinh viên " + input_name + " is: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Không tìm thấy" + input_name + "trong danh sách.");
        }
    }
}
