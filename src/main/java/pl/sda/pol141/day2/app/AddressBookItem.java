package pl.sda.pol141.day2.app;

import java.time.LocalDate;
import java.util.Objects;

public class AddressBookItem {
    private String email;
    private String phone;
    private LocalDate birth;

    public AddressBookItem(String email, String phone, LocalDate birth) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AddressBookItem that)) return false;
        return email.equals(that.email) && phone.equals(that.phone) && birth.equals(that.birth);
    }
    // hashcode generowany musi być na podstawie tych samych pól, które są uwzględniane w metodzie equals
    @Override
    public int hashCode() {
        //System.out.println("Address book item hashcode calling!");
        return Objects.hash(email, phone, birth);
    }
}
