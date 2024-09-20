package weeklytest2;

import lombok.Getter;

@Getter
public class PersonalContact extends Contact {
    private String relationship;

    public PersonalContact(String name, String phoneNumber, String relationship) {
        super(name, phoneNumber);
        this.relationship = relationship;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(", 관계: " + getRelationship());
    }
}
