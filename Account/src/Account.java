public class Account {
    private int id = 0;
    private String username;
    private String password;
    private String phone;
    private String DateBirthday;

    public Account() {
    }

    public Account(int id, String username, String password, String phone, String dateBirthday) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phone = phone;
        DateBirthday = dateBirthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDateBirthday() {
        return DateBirthday;
    }

    public void setDateBirthday(String dateBirthday) {
        DateBirthday = dateBirthday;
    }
    public String toString(){
        return "id: " + this.id + " tài khoản: " + this.username + "mật khẩu: " +this.password + " SĐT: " + this.phone + " ngày sinh: " + this.DateBirthday;
    }
}
