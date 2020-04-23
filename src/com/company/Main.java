package com.company;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();

      Words exersice18 = new Words();
      Words exersice19 = new Words();
      Words exersice20 = new Words();
      Words exersice21 = new Words();

      exersice18.valueOf(str);
      exersice19.valueOfWords(str);
      exersice20.printLastLetter(str);
      exersice21.speedTest1();
      exersice21.speedTest2();

  }
}

