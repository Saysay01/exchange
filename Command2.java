package exchange;

import java.io.*;	

import java.util.Scanner;


public class Command2 {
	public static void main(String[] args) {
        try {
            String output, currency;
            double amount, change, sum=0;
            FileReader read = new FileReader("D:/Java/ExchangeList.txt"); // where to read
            FileWriter write = new FileWriter("D:/Java/ThaiBath.txt"); // where to write
            Exchange exc = new Exchange();
            Scanner sc = new Scanner(read);

            while (sc.hasNext()) { // .hasNextLine() would cause error
                amount = sc.nextDouble();
                currency = sc.next();
                change = currency.equals("USD") ? exc.exchangeUSD(amount) : currency.equals("EURO") ? exc.exchangeEURO(amount) : currency.equals("YEN") ? exc.exchangeYEN(amount) : exc.exchangePOUND(amount);
                output = String.format("%.2f %s = %.2f Baht\n", amount, currency, change);
                write.write(output);
                sum += change;
            }
            output = String.format(">>> Summation = %.2f Baht", sum);
            write.write(output);
            sc.close();
            read.close();
            write.close();

        } catch (IOException e) {
            System.err.println("LOL");
            e.printStackTrace();
        }
        // catch (NoSuchElementException e){
        //     System.err.println("LOL");
        //     e.printStackTrace();
        // }
    }

}



