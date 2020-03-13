package oop.inheritance;

import oop.inheritance.parsers.CppParser;
import oop.inheritance.parsers.JavaParser;
import oop.inheritance.parsers.PythonParser;
import oop.inheritance.parsers.RubyParser;

public class Main {

    private static final String[] inputFiles = {
            "Ejemplo1.java",
            "Ejemplo2.cpp",
            "Ejemplo3.java",
            "Ejemplo4.py",
            "Ejemplo5.rb",
            "Ejemplo6.cpp",
            "Ejemplo7.c"};

    /*
    expected output:
    ------------------------------
    Java parser for: Ejemplo1.java
    C/C++ parser for: Ejemplo2.cpp
    Java parser for: Ejemplo3.java
    Python parser for: Ejemplo4.py
    Ruby parser for: Ejemplo5.rb
    C/C++ parser for: Ejemplo6.cpp
    C/C++ parser for: Ejemplo7.c


    ------------------------------


     */
    public static void main(String[] args) {
        CppParser cppParser = new CppParser();
        JavaParser javaParser = new JavaParser();
        PythonParser pythonParser = new PythonParser();
        RubyParser rubyParser = new RubyParser();

        for (String file : inputFiles) {
            String ext = file.substring(file.lastIndexOf('.') + 1);

            switch (ext) {
                case "java":
                    javaParser.parseJavaFile(file);
                    break;
                case "cpp":
                case "c":
                    cppParser.parseCppFile(file);
                    break;
                case "rb":
                    rubyParser.parseRubyFile(file);
                    break;
                case "py":
                    pythonParser.parsePyhtonFile(file);
                    break;
            }
        }
    }

    /*
    EXPECTED MAIN

    public static void main(String[] args) {
        Map<String, Parser> parsers = new HashMap<>();

        parsers.put("java", new JavaParser());
        parsers.put("cpp", new CppParser());
        parsers.put("c", new CppParser());
        parsers.put("rb", new RubyParser());
        parsers.put("py", new PythonParser());

        for (String file : inputFiles) {
            String ext = file.substring(file.lastIndexOf('.') +1);

            Parser parser = parsers.get(ext);

            parser.parse(file);
        }
    }
     */
}
