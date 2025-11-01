package DesignPatterns.AbstractFactory.Primary;

import DesignPatterns.AbstractFactory.Button;
import DesignPatterns.AbstractFactory.Menu;
import DesignPatterns.AbstractFactory.ThemeComponentFactory;

public class PrimaryThemeFactory implements ThemeComponentFactory {
    @Override
    public Button createButton() {
        return new PrimaryButton();
    }

    @Override
    public Menu createMenu() {
        return new PrimaryMenu();
    }
}
