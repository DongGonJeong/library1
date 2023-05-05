package dev.dk.library1.service;

import dev.dk.library1.Mapper.LibraryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryService {

    @Autowired
    LibraryMapper libraryMapper;

    public String getViewText() {

        return libraryMapper.getText();
    }
}
