package com.fastcampus.javaoop;

import com.fastcampus.javaoop.logic.BubbleSort;

import javax.swing.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BubbleSort<String> sorter = new BubbleSort<>();
        System.out.println(sorter.sort(List.of(args)));
        System.out.println("hello javaoop");
    }

}
