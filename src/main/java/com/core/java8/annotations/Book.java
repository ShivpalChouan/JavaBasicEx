package com.core.java8.annotations;

import java.util.Arrays;

@Author(name = "Ram")
@Author(name = "Mohan")
@Author(name = "Gopal")
public class Book {

    public static void main(String[] args) {
        Author[] authors = Book.class.getAnnotationsByType(Author.class);
        
        Arrays.asList(authors).stream().forEach(a -> {
            System.out.println(a.name());
             });
          }

}
