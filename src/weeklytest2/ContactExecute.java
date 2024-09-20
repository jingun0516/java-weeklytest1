package weeklytest2;

import java.util.Scanner;

public class ContactExecute {
    public static void displayMenu() {
        System.out.println("1. 비즈니스 연락처 추가");
        System.out.println("2. 개인 연락처 추가");
        System.out.println("3. 연락처 출력");
        System.out.println("4. 연락처 검색");
        System.out.println("5. 종료");
        System.out.print("메뉴를 선택해주세요: ");
    }

    public static BusinessContact createBusinessContact(Scanner sc) {
        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();

        System.out.print("전화번호를 입력하세요: ");
        String phoneNumber = sc.nextLine();

        System.out.print("회사명을 입력하세요: ");
        String company = sc.nextLine();

        return new BusinessContact(name, phoneNumber, company);
    }

    public static PersonalContact createPersonalContact(Scanner sc) {
        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();
        System.out.print("전화번호를 입력하세요: ");
        String phoneNumber = sc.nextLine();
        System.out.print("관계를 입력하세요: ");
        String relationship = sc.nextLine();

        return new PersonalContact(name, phoneNumber, relationship);
    }

    public static String inputName(Scanner sc) {
        System.out.print("검색할 이름을 입력하세요: ");
        String name = sc.nextLine();
        return name;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AddressBook addressBook = new AddressBook();

        while(true) {
            displayMenu();
            int choice = sc.nextInt();
            sc.nextLine();              // 버퍼 비우기

            switch(choice) {
                case 1 -> addressBook.addContact(createBusinessContact(sc));
                case 2 -> addressBook.addContact(createPersonalContact(sc));
                case 3 -> addressBook.displayContacts();
                case 4 -> addressBook.searchContact(inputName(sc));
                case 5 -> { return; }
                default -> System.out.println("올바른 번호를 입력하세요.");
            }

        }
    }



}
