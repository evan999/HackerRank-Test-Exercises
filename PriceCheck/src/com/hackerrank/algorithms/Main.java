package com.hackerrank.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    // products = ['eggs', 'milk', 'cheese']
    // productPrices = [2.89, 3.29, 5.79]
    // productSold = ['eggs', 'eggs', 'cheese', 'milk']
    // soldPrice = [2.89, 2.99, 5.97, 3.29]

    // Second sale of eggs is wrong. productPrice does not match soldPrice for productSold.
    // Cheese = 5.79
    // Sold at 5.97
    // Selling error
    // 2 selling errors

    // Compare prices to prices entered when each item was sold
    // Determine number of errors in selling prices

    // Need to match productPrice up with product of that price
    // Then check if the productPrice matches soldPrice

    // Match up index of product with its productPrice -> index of productPrice will be equal to index of product (listed in order)
    // Match up index of productSold with soldPrice

    // Declare int sellingErrors
    // Loop through soldProducts
    //   Match up index of product with its productPrice -> index of productPrice will be equal to index of product (listed in order)
    //   Match up index of productSold with soldPrice
    //   Compare parsed productPrice string to soldPrice
    //   if parsed productPrice does not equal soldPrice
    //      add 1 to sellingErrors
    //   else continue
    // return sellingErrors

    public static int priceCheck(List<String> products, List<String> productPrices, List<String> productSold, List<Float> soldPrice) {
        int sellingErrors = 0;

        for (int index = 0; index < productSold.size(); index++) {
            String soldProduct = productSold.get(index);
            int productIndex = products.indexOf(soldProduct);
            float productPrice = Float.parseFloat(productPrices.get(productIndex));
            float priceSold = soldPrice.get(index);
            if (productPrice != priceSold) {
                sellingErrors++;
            }
        }

        return sellingErrors;
    }


    public static void main(String[] args) {
	// write your code here
        List<String> products = new ArrayList<String>(Arrays.asList("chocolate", "cheese", "tomato"));
        List<String> productPrices = new ArrayList<String>(Arrays.asList("15.00", "300.90", "23.44"));
        List<String> productSold = new ArrayList<String>(Arrays.asList("chocolate", "cheese", "tomato"));
        List<Float> soldPrice = new ArrayList<Float>(Arrays.asList(15f, 300.90f, 10.00f));
        System.out.println(priceCheck(products, productPrices, productSold, soldPrice));
    }
}
