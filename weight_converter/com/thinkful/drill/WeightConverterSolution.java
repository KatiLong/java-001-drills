package com.thinkful.drill;

import java.util.Scanner;

public class WeightConverterSolution {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter weight in pounds: ");
    Double weightInPounds = scanner.nextDouble();

    //0.453592 kg = 1 lbs or 2.2046226218 lbs = 1 kg
    System.out.println(weightInPounds / 2.2046226218);
  }

}