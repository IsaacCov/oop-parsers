package oop.inheritance.parsers;

public class JavaParser implements Parser {

    public void parse(String path) {
        System.out.println("Java parser for: " + path);
    }
}
