package mypackage;

public class Helper {
    private String name;
    
    public Helper(String name) {
        this.name = name;
    }
    
    public String getString() {
        return name;
    }
    
    public void setString(String name) {
        this.name = name;
    }
    
    public void sayHello() {
        System.out.println("Hello " + name + "!");
    }
} 