package oop.inheritance.parsers;

public class CppParser implements Parser {

    public void parse(String path) {
        System.out.println("C/C++ parser for: " + path);
    }

}
