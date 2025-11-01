package DesignPatterns.AbstractFactory;

// Step 1 : Create parent class
// Step 4 : Add Factory method , link Theme to Theme Component Factory
public abstract class Theme {
    private String name;
    private String primaryColor;
    private String authorName;

    // Step 4 : Add Factory method , link Theme to Theme Component Factory
    public abstract ThemeComponentFactory  createComponentFactory();
}
