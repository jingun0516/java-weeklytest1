package weeklytest2;

import lombok.Getter;

@Getter
public class Contact {
    private String name;
    private String phoneNumber;

    Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void display() {
        System.out.print("이름: " + getName() + ", 전화번호: " + getPhoneNumber());
    }
}
