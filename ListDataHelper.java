package com.example.carla.parcial;

import java.util.ArrayList;

public class ListDataHelper {
    public static ArrayList<ListViewItem> provideItems(){
        ArrayList<ListViewItem> list = new ArrayList<>();
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp, android.R.color.holo_blue_bright, "HOLO BLUE BRIGHT"));
        list.add(new ListViewItem(R.drawable.ic_brightness_2_black_24dp,android.R.color.holo_blue_light, "HOLO BLUE LIGHT"));
        list.add(new ListViewItem(R.drawable.ic_brightness_3_black_24dp,android.R.color.holo_green_light, "HOLO GREEN LIGHT"));
        list.add(new ListViewItem(R.drawable.ic_brightness_4_black_24dp,android.R.color.holo_orange_light, "HOLO ORANGE LIGHT"));
        list.add(new ListViewItem(R.drawable.ic_brightness_5_black_24dp, android.R.color.holo_red_light,"HOLO RED LIGHT"));
        list.add(new ListViewItem(R.drawable.ic_brightness_6_black_24dp,android.R.color.holo_purple, "HOLO PURPLE"));
        list.add(new ListViewItem(R.drawable.ic_brightness_7_black_24dp, android.R.color.holo_blue_dark,"HOLO BLUE DARK"));
        list.add(new ListViewItem(R.drawable.ic_brightness_8_black_24dp, android.R.color.holo_green_dark,"HOLO GREEN DARK"));
        list.add(new ListViewItem(R.drawable.ic_brightness_9_black_24dp,android.R.color.holo_red_dark,"HOLO RED DARK"));
        list.add(new ListViewItem(R.drawable.ic_brightness_10_black_24dp,android.R.color.holo_orange_dark,"HOLO ORANGE DARK"));

        return list;
    }
}


