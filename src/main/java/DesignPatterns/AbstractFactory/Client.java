package DesignPatterns.AbstractFactory;

import DesignPatterns.AbstractFactory.Dark.DarkTheme;
import DesignPatterns.AbstractFactory.Primary.PrimaryTheme;

public class Client {

    public static void main(String[] args) {
        Theme primaryTheme = new PrimaryTheme();
        ThemeComponentFactory componentFactory = primaryTheme.createComponentFactory();
        Button button = componentFactory.createButton();
        Menu menu = componentFactory.createMenu();

        Theme darkTheme = new DarkTheme();
        ThemeComponentFactory componentFactory1 = primaryTheme.createComponentFactory();
        Button button1 = componentFactory1.createButton();
        Menu menu1 = componentFactory1.createMenu();
    }
}
