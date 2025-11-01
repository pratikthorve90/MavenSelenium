package DesignPatterns.AbstractFactory;

// Step 3 : Create component Factory
public interface ThemeComponentFactory {
    Button createButton();
    Menu createMenu();
}
