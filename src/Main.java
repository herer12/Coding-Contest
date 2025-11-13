import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(Paths.get("input/level2_5.in"));
        int numberOfCurrency;
        int numberOfCoinValue;
        int numberOfMoneyToWithdraw;

        try ( FileWriter file = new FileWriter("output/output.txt")){
            numberOfCurrency = scanner.nextInt();
            scanner.nextLine();
            numberOfCoinValue = scanner.nextInt();
            scanner.nextLine();
            numberOfMoneyToWithdraw = scanner.nextInt();
            scanner.nextLine();

            int[] row = new int[numberOfCoinValue];
            int[] values = new int[numberOfMoneyToWithdraw];

            for (int i = 0; i < numberOfCurrency; i++) {
                String line = scanner.nextLine();
                String[] tokens = line.split(" ");
                for (int j = 0; j < tokens.length; j++) {
                    row[j] = Integer.parseInt(tokens[j]);
                }

                String line2 = scanner.nextLine();
                String[] tokens2 = line2.split(" ");
                for (int j = 0; j < tokens2.length; j++) {
                    values[j] = Integer.parseInt(tokens2[j]);
                }

                boolean flag = false;

                for (int value : values) {
                    for (int k : row) {
                        for (int item : row) {
                            if (k + item == value) {
                                file.write(k + " " + item + "\n");
                                flag = true;
                                break;
                            }
                        }
                        if (flag) {
                            flag = false;
                            break;
                        }
                    }
                }














            }












        }catch (IOException e){
            e.printStackTrace();
        }
    }

    static int findSmallestFreeCoinValue(int[] values){
        int lastValue = 0;
        for (int coinValue : values) {
            if (lastValue !=  coinValue-1) {
                return lastValue+1;
            }
            lastValue = coinValue;
        }
        lastValue = lastValue + 1;
        return lastValue;
    }
}