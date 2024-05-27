//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Main<hasZero> {
    public void main() {
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] numbers = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9,};
        int sum = 0;
        int[] var3 = numbers;
        int product = numbers.length;

        int difference;
        int i;
        for(difference = 0; difference < product; ++difference) {
            i = var3[difference];
            sum += i;
        }

        System.out.println("Сума чисел: " + sum);
        boolean hasZero = false;
        int[] var10 = numbers;
        difference = numbers.length;

        int number;
        for(i = 0; i < difference; ++i) {
            number = var10[i];
            if (number == 0) {
                hasZero = true;
                break;
            }
        }

        if (!hasZero) {
            double result = (double)numbers[0];

            for(i = 1; i < numbers.length; ++i) {
                result /= (double)numbers[i];
            }

            System.out.println("Результат поділу: " + result);
        } else {
            System.out.println("Помилка: ділення на нуль!");
        }

        product = 1;
        int[] var12 = numbers;
        i = numbers.length;

        for(number = 0; number < i; ++number) {
            number = var12[number];
            product *= number;
        }

        System.out.println("Добуток чисел: " + product);
        difference = numbers[0];

        for(i = 1; i < numbers.length; ++i) {
            difference -= numbers[i];
            System.out.println("Різниця чисел: " + difference);
        }

    }
}
