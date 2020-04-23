package com.company;

public class Words {

  public void valueOf(String str) {
    int n = 0;
    char symbol;
    for (int i = 0; i < str.length(); i++) {
      symbol = str.charAt(i);
      if ((symbol == ',') || (symbol == '.')
          || symbol == ';'
          || symbol == '!'
          || symbol == '?'
          || symbol == '-') {
        n++;
      }
    }
    System.out.println("Общее количество знаков препинания = " + n);
  }

  public void valueOfWords(String str) {

    int count = 0;
    String[] words = str.trim().split("\\s+");
    for (int i = 0; i < words.length; i++) {
      count++;
    }
    System.out.println("Число слов в строке = " + count);
  }

  public void printLastLetter(String str) {

    StringBuilder res = new StringBuilder();

    String[] words = str.trim().split("\\s+");
    for (int i = 0; i < words.length; i++) {

      if (words[i].toCharArray()[words[i].length() - 1] == '.'
          || words[i].toCharArray()[words[i].length() - 1] == ',' ||
          words[i].toCharArray()[words[i].length() - 1] == '!'
          || words[i].toCharArray()[words[i].length() - 1] == '?'
          || words[i].toCharArray()[words[i].length() - 1] == ';') {
        res.append(words[i].toCharArray()[words[i].length() - 2]);
      } else {
        res.append(words[i].toCharArray()[words[i].length() - 1]);
      }
    }
    System.out.println("Слово из последних букв - " + res);
  }

  public String speedTest1() {

    String s5 = "";
    String[] string = {"mama", "mila", "pamy", "a", "papa", "smotrel",
        "potomy", "4to", "emy", "yzhe",
        "nadoelo", "pistab", "cod", "Becb", "DeHb"};

    for (String value : string) {
      s5 = s5 + value + " ";
    }
    System.out.println(s5);
    return s5;
  }

  public StringBuilder speedTest2() {

    String[] string = {"mama", "mila", "pamy", "a", "papa", "smotrel",
        "potomy", "4to", "emy", "yzhe",
        "nadoelo", "pistab", "cod", "Becb", "DeHb"};

    StringBuilder res = new StringBuilder();
    for (String value : string) {
      res.append(value + " ");
    }
    System.out.println(res);

    return res;


  }
}
