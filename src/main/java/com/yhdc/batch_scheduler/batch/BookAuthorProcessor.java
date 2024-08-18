package com.yhdc.batch_scheduler.batch;

import com.yhdc.batch_scheduler.entity.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;


@Slf4j
public class BookAuthorProcessor implements ItemProcessor<Book, Book> {

    @Override
    public Book process(Book item) throws Exception {
        log.info("Processing title for {}", item);
        log.info("Book title is {}", item.getAuthor());
        item.setAuthor("By" + item.getAuthor().toUpperCase());
        return item;
    }

}
