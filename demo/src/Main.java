import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book[] listBook = new Book[10];
        input(listBook);
        findName(listBook);
    }

    public static void input(Book[] listBook) {
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập vào thông tin: ");
            String name = sc.nextLine();
            String category = sc.nextLine();
            String author = sc.nextLine();
            double price = sc.nextDouble();
            int amount = sc.nextInt();
            Book book = new Book(name, price, amount, category, author);
            listBook[i] = book;
        }
    }

    public static void output(Book[] listBook) {
        for (int i = 0; i < 3; i++) {
            System.out.println(listBook[i]);
        }
    }

    public static double totalPrice(Book[] listBook) {
        double sum = 0;
        for (int i = 0; i < listBook.length; i++) {
            sum += listBook[i].price * listBook[i].amount;
        }
        return sum;
    }

    public static void findName(Book[] listBook) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên sách muốn tìm");
        String name = scanner.nextLine();

        for (int i = 0; i < 3; i++) {
            if (listBook[i].name.equals(name)) {
                System.out.println(listBook[i]);
            }
        }
    }
}
