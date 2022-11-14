import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static MannagerAccount mannagerAccount = new MannagerAccount();
    public static void main(String[] args) {

        while (true){
            System.out.println("Quản lí account");
            System.out.println("1. thêm tài khoản");
            System.out.println("2. đổi mật khẩu");
            System.out.println("3. xóa tài khoản");
            System.out.println("4. tìm tài khoản");
            System.out.println("5. hiển thị");
            System.out.println("6. thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    Account account1 = mannagerAccount.createAcc();
                    mannagerAccount.addAccount(account1);
                    break;
                case 2:
                    System.out.println("nhập tên muốn đổi");
                    String username = scanner.nextLine();
                    mannagerAccount.edit(username);
                    break;
                case 3:
                    System.out.println("tên muốn xóa");
                    String name1 = scanner.nextLine();
                    mannagerAccount.deleteAcc(name1);
                    break;
                case 4:
                    System.out.println("tên tìm");
                    String name = scanner.nextLine();
                    mannagerAccount.findAccount(name);
                    break;
                case 5:
                    mannagerAccount.show();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }
    }
}