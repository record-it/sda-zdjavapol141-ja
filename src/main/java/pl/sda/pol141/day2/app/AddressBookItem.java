package pl.sda.pol141.day2.app;

import java.time.LocalDate;

public class AddressBookItem {
    private String email;
    private String phone;
    private LocalDate birth;

    private AddressBookItem(String email, String phone, LocalDate birth) {
        this.email = email;
        this.phone = phone;
        this.birth = birth;
    }

    public static AddressBookItem of(String email, String phone, LocalDate birth){
        if (email == null || phone == null || birth == null){
            throw new IllegalArgumentException("Któraś z wartości jest null!");
        }
        return new AddressBookItem(email, phone, birth);
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public LocalDate getBirth() {
        return birth;
    }

    @Override
    public String toString() {
        return "AddressBookItem{" +
                "email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", birth=" + birth +
                '}';
    }
}
