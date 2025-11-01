package DesignPatterns.AbstractFactory.Dark;

import DesignPatterns.AbstractFactory.Theme;
import DesignPatterns.AbstractFactory.ThemeComponentFactory;

// Step 2 : Create child class
public class DarkTheme extends Theme {


    @Override
    public ThemeComponentFactory createComponentFactory() {
        return null;
    }
}
