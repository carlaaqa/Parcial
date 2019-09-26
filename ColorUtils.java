package com.example.carla.parcial;

public class ColorUtils {
    public static String decimalTohex(int decimal) {
        String hex = Integer.toHexString(decimal);
        if (hex.length() == 1) {
            hex = "0" + hex;
        }
        return hex;
    }
}
