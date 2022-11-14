import java.util.Scanner;

public class MannagerAccount {
    Account[] account = new Account[0];

    public void show() {
        for (int i = 0; i < account.length; i++) {
            System.out.println(account[i].toString());
        }
    }

    public void addAccount(Account account1) {
        Account[] newArr = new Account[account.length + 1];
        for (int i = 0; i < account.length; i++) {
            newArr[i] = account[i];
        }
        newArr[newArr.length - 1] = account1;
        account = newArr;
    }

    public Account createAcc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("tạo tài khoản");
        System.out.println("id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("username");
        String username = scanner.nextLine();
        System.out.println("password");
        String password = String.valueOf(scanner.nextLine());
        System.out.println("phone");
        String phone = String.valueOf(scanner.nextLine());
        System.out.println("Birthday");
        String DateBirthday = String.valueOf(scanner.nextLine());
        Account account1 = new Account(id, username, password, phone, DateBirthday);
        return account1;
    }

    public int findAcc(String username) {
        for (int i = 0; i < account.length; i++) {
            if (username.equals(account[i].getUsername())) {
                return i;
            }
        }
        return -1;
    }

    public void edit(String username) {
        Scanner scanner = new Scanner(System.in);
        int index = findAcc(username);
        if (index != -1) {
            System.out.println("đổi mật khẩu");
            String password = String.valueOf(scanner.nextLine());
            account[index].setPassword(password);
        }
    }

    public void deleteAcc(String username) {
        System.out.println("nhập username muốn xóa");
        Scanner scanner = new Scanner(System.in);
        int index = findAcc(username);
        if (index != -1){
            Account[] newArr = new Account[account.length - 1];
            for (int i = 0; i < newArr.length; i++) {
                if(i < index){
                    newArr[i] = account[i];
                }else {
                    newArr[i] = account[i + 1];
                }
            }
            account = newArr;
        }
    }
    public void findAccount(String username){
        System.out.println("nhập username muốn tìm");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < account.length; i++) {
            if (username.equals(account[i].getUsername())) {
                System.out.println(account[i].toString());
            }
        }
    }

}
