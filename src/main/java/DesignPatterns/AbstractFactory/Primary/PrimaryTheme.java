package DesignPatterns.AbstractFactory.Primary;

import DesignPatterns.AbstractFactory.Theme;
import DesignPatterns.AbstractFactory.ThemeComponentFactory;

// Step 2 : Create child class
public class PrimaryTheme extends Theme {

    @Override
    public ThemeComponentFactory createComponentFactory() {
        return null;
    }
}
