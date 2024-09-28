package com.example.trees.loader;

import com.example.trees.model.TreeEntity;
import com.example.trees.service.TreeService;
import com.example.trees.utils.LogLevel;
import com.example.trees.utils.MyLogger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import static com.example.trees.utils.MyLogger.log;

@Component
//@Slf4j
public class DataLoader implements CommandLineRunner {

    private final TreeService treeService;

    public DataLoader(TreeService treeService) {
        this.treeService = treeService;
    }

    @Override
    public void run(String... args) throws Exception {
        treeService.saveTree(new TreeEntity("Cedar", "Green", false));
        treeService.saveTree(new TreeEntity("Oak", "Green", false));
    }
}
