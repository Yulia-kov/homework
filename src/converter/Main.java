package converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите шкалу конвертации (Del/Fr/Kl/Ran)");
        BaseConverter scale1 = BaseConverter.convert(scanner.nextLine());
    }
}
