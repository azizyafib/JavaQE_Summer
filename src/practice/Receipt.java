package practice;

import java.time.LocalDate;
import java.time.LocalTime;

public class Receipt {
	

	

	
		public static void main(String[] args) {

		
			LocalDate todayDate = LocalDate.now();
			LocalTime time = LocalTime.of(18, 45);

			 String storeName = "BAZAR FOOD";
			 String storeAddress = "100 Main ave Bayonne,NJ,07002";
			 String storeContactNumber = "974-234-4567";
			 String costumerReceipt = "17457";
			 int regesterNumber = 12;
			 String cashierName = "jassie";

			 String itemName1 = "Organic egges dozen";
			 int quantityNumber1 = 2;
			 double price1= 7.99;
			double total1 = quantityNumber1 * price1;

			 String itemName2 = "Milk galon";
			 int quantityNumber2 = 5;
			 double price2 = 3.69;
			double total2 = quantityNumber2 * price2;

			 String itemName3 = "Cosher hot dog";
			 int quantityNumber3 = 4;
			 int price3 = 11;
			int total3 = quantityNumber3 * price3;

			 String itemName4 = "Alaska wild salamon";
			 int quantityNumber4 = 7;
			 int price4 = 25;
			int total4 = quantityNumber4 * price4;

			 String itemName5 = "organic apple";
			 int quantityNumber5 = 1;
			 int price5 = 5;
			int total5 = quantityNumber5 * price5;

			 String itemName6 = "watermelon";
			 int quantityNumber6 = 7;
			 double price6 = 7.99;
			double total6 = quantityNumber6 * price6;

			 String itemName7 = "notella cookies";
			 int quantityNumber7 = 9;
			 int price7 = 8;
			int total7 = quantityNumber7 * price7;

			 String itemName8 = "ships";
			 int quantityNumber8 = 1;
			 double price8 = 3.99;
			double total8 = quantityNumber8 * price8;

			 String itemName9 = "whole wheat Bread";
			 int quantityNumber9 = 5;
			 double price9 = 4.49;
			double total9 = quantityNumber6 * price6;

			int quantityTotal = quantityNumber1 + quantityNumber2 + quantityNumber3 + quantityNumber4 + quantityNumber5
					+ quantityNumber6 + quantityNumber7 + quantityNumber8 + quantityNumber9;
			double subtotal = total1 + total2 + total3 + total4 + total5 + total6 + total7 + total8 + total9;
			// tax calculation
			double taxRate = 8.75;
			double tax = subtotal * taxRate / 100;
			double total = tax + subtotal;
			System.out.println();
			System.out.println("\t\t\t\t" + storeName + "                      ");
			System.out.println("\t\t\t" + storeAddress + "                     ");
			System.out.println("\t\t\t\t" + storeContactNumber + "                ");
			System.out.println();
			System.out.println("Receipt: " + costumerReceipt);
			System.out.println("Regester: " + regesterNumber);
			System.out.println("Cashier : " + cashierName);
			System.out.println();
			System.out.println("   Item                        QTY             Item price              Total");
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("  " + itemName1 + "\t\t" + quantityNumber1 + "\t\t$" + price1 + "\t\t\t$" + total1 + "");
			System.out.println("  " + itemName2 + "\t\t\t" + quantityNumber2 + "\t\t$" + price2 + "\t\t\t$" + total2 + "");
			System.out.println("  " + itemName3 + "\t\t" + quantityNumber3 + "\t\t$" + price3 + "\t\t\t$" + total3 + "");
			System.out.println("  " + itemName4 + "\t\t" + quantityNumber4 + "\t\t$" + price4 + "\t\t\t$" + total4 + "");
			System.out.println("  " + itemName5 + "\t\t\t" + quantityNumber5 + "\t\t$" + price5 + "\t\t\t$" + total5 + "");
			System.out.println("  " + itemName6 + "\t\t\t" + quantityNumber6 + "\t\t$" + price6 + "\t\t\t$" + total6 + "");
			System.out.println("  " + itemName7 + "\t\t" + quantityNumber7 + "\t\t$" + price7 + " \t\t\t$" + total7 + "");
			System.out.println("  " + itemName8 + "\t\t\t\t" + quantityNumber8 + "\t\t$" + price8 + "\t\t\t$" + total8 + "");
			System.out.println("  " + itemName9 + "\t\t" + quantityNumber9 + "\t\t$" + price9 + "\t\t\t$" + total9 + "");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("\t\t\t\t\t\t\t\tSUBTOTAL:$" + String.format("%.2f", subtotal));
			System.out.println("\t\t\t\t\t\t\t\tSALE TAX:$" + String.format("%.2f", tax));// tax
			System.out.println("\t\t\t\t\t\t\t\tTOTAL :  $" + String.format("%.2f", total));
			System.out.println("\t\t\t\t\t\t\t\tTotal Items : " + quantityTotal);
			System.out.println("\n");
			System.out.println("\t\t\t   date " + todayDate + " " + time);
			System.out.println();
			System.out.println(
					" \t\t   Thank you for shopping with Food bazar\n\t\t\tYour Bussiness is Appreciated  ");

		
	}

}
