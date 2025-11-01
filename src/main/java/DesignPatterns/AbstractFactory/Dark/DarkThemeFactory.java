package DesignPatterns.AbstractFactory.Dark;

import DesignPatterns.AbstractFactory.Button;
import DesignPatterns.AbstractFactory.Menu;
import DesignPatterns.AbstractFactory.ThemeComponentFactory;

public class DarkThemeFactory implements ThemeComponentFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Menu createMenu() {
        return new DarkMenu();
    }
}
