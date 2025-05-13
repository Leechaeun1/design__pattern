package builder.builder2;

public class User {
    private String name;
    private String email;
    private String password;
    private String phone;
    private String address;
    private boolean sex;
    private int age;

    public User() {

    }

    private User(String name, int age, boolean sex, String address, String phone, String password, String email) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.phone = phone;
        this.password = password;
        this.email = email;
    }

    // Getter,Setter 생략
    @Override
    public String toString() {
        return
                "name:\'" + name + '\'' +
                "\nemail:\'" + email + '\'' +
                "\npassword:\'" + password + '\'' +
                "\nphone:\'" + phone + '\'' +
                "\naddress:\'" + address + '\'' +
                "\nsex:" + sex +
                "\nage:" + age
                ;
    }


    // 내부 클래스
    public static class Builder {
        private String name;
        private String email;
        private String password;
        private String phone;
        private String address;
        private boolean sex;
        private int age;

        public Builder() {
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder sex(boolean sex) {
            this.sex = sex;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(name, age, sex, address, phone, password, email);
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}
