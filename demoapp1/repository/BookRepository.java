package com.dxc.demoapp1.repository;
import com.springboot.demo.model.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book ,Integer>{


}
