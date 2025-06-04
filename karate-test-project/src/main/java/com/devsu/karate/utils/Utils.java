package com.devsu.karate.utils;

public class Utils {

  public static String getRandomString(int length) {
    StringBuilder sb = new StringBuilder(length);
    String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    for (int i = 0; i < length; i++) {
      int index = (int) (Math.random() * characters.length());
      sb.append(characters.charAt(index));
    }
    return sb.toString();
  }
}
