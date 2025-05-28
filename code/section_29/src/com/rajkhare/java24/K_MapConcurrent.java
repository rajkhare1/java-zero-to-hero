package com.rajkhare.java24;

import java.util.List;
import java.util.stream.Gatherers;

public class K_MapConcurrent {

    public static void main(String[] args) {
        List<String> articles = List.of(
                "Java is a high-level, class-based, object-oriented programming language.",
                "Spring Boot makes it easy to create stand-alone, production-grade applications.",
                "Microservices architecture enables better scalability and maintainability.",
                "Text processing is a common use case for functional programming.",
                "Streams in Java provide a modern way to process collections efficiently."
        );

        // Count words concurrently using mapConcurrent
        List<Integer> wordCounts = articles.parallelStream()
                .gather(
                        Gatherers.mapConcurrent(10, article -> article.split("\\s+").length)
                )
                .toList();

        for (int i=0; i<articles.size(); i++) {
            System.out.printf("Article %d word count: %d%n", i+1, wordCounts.get(i));
        }

        /*
   Output:
 Article 1 word count: 8
Article 2 word count: 10
Article 3 word count: 7
Article 4 word count: 10
Article 5 word count: 11
*/

    }

}
