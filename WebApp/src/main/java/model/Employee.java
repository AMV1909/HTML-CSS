package model;

public class Employee {
    private String Name;
    private String Document;
    private String User;
    private String Password;

    public Employee() {}

    public Employee(String Name, String Document, String User, String Password) {
        this.Name = Name;
        this.Document = Document;
        this.User = User;
        this.Password = Password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDocument() {
        return Document;
    }

    public void setDocument(String Document) {
        this.Document = Document;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
}
