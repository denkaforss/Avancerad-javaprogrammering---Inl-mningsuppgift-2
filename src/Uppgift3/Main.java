package Uppgift3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        String regex = "(\\w*[aeiouy]){2,}";
        Predicate<String> regexFilter = Pattern.compile(regex).asPredicate();

        Stream.of("Height", "Weight", "Length", "Skincolor", "Haircolor", "Eyecolor", "Jump")
                .filter(regexFilter)
                .forEach(System.out::println);



    }
}
