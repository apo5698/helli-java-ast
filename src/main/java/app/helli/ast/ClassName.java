package app.helli.ast;

import com.github.javaparser.StaticJavaParser;

import java.io.File;
import java.io.FileNotFoundException;

public class ClassName {
    public static void main(String[] args) throws FileNotFoundException {
        StaticJavaParser
                .parse(new File(args[0]))
                .getType(0)
                .getFullyQualifiedName()
                .ifPresent(System.out::println);
    }
}
