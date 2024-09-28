package com.example.trees.service;

import com.example.trees.model.TreeEntity;
import com.example.trees.repository.TreeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static com.example.trees.utils.MyLogger.log;

@Service
//@Slf4j
public class TreeService {
    private final TreeRepository treeRepository;

    public TreeService(TreeRepository treeRepository) {
        this.treeRepository = treeRepository;
    }

    public TreeEntity saveTree(TreeEntity treeEntity) {
        log("Saving the tree.");
        return treeRepository.save(treeEntity);
    }

}
