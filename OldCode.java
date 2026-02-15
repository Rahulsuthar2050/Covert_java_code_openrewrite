package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;
// Imagine this uses an old version of a library like Guava or JUnit 4
import org.junit.Assert; 
import org.junit.Test;

public class OldCode {

    @Test
    public void testOldSyntax() {
        // 1. Old way to create an unmodifiable list
        List<String> list = Collections.unmodifiableList(Arrays.asList("apple", "banana", "cherry"));
        
        // 2. Old way to filter a list
        List<String> filtered = list.stream()
            .filter(s -> s.startsWith("a"))
            .collect(Collectors.toList());

        // 3. Old JUnit 4 assertion
        Assert.assertEquals(1, filtered.size());
    }

    public void databaseLogic() {
        // 4. Old JDBC or manual resource closing (Pre-Try-with-resources style)
        // OpenRewrite can often wrap these in try-with-resources automatically
    }
}