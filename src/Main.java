import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Введи начальные данные");
        Scanner vvod = new Scanner(System.in);
        int countCross = vvod.nextInt(), countTunnels = vvod.nextInt();
        int[] otvet = new int[countCross];
        for (int i = 0; i < countTunnels; i++) {
            int x = vvod.nextInt();
            int y = vvod.nextInt();
            otvet[x - 1]++;
            otvet[y - 1]++;
        }

        for (int i = 0; i < otvet.length; i++) {
            System.out.print(otvet[i] + " ");
        }
    }
}