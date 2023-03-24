package com.heapsteep.controller;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.heapsteep.model.Book;

//@Component //This also works
@Configuration
public class BookController {
	
	@Bean
	public Function<String, String> reverse() {
		return (input) -> new StringBuilder(input).reverse().toString();
	}

	@Bean
	public Supplier<Book> getBook() {
		return () -> new Book(101, "Core Java");
	}

	@Bean
	public Consumer<String> printMessage() {
		return (input) -> System.out.println(input);
	}
}
