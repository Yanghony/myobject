package com.kayak.myobject.service.impl;

import com.kayak.myobject.domain.NovelEntity;
import com.kayak.myobject.repository.NovelRepo;
import com.kayak.myobject.service.NovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yangyy
 * @version 1.0
 * @date 2021/8/12 10:04
 * @projectName:
 * @Description:
 */
@Service
public class NovelServiceImpl implements NovelService {

    @Autowired
    private NovelRepo novelRepo;

    @Override
    public List<NovelEntity> findAll() {
        return novelRepo.findAll();
    }

    @Override
    public List<NovelEntity> findByAuthorAndType(String author, String type) {
        return novelRepo.findByAuthorAndType(author, type);
    }

    @Override
    public long count() {
        return novelRepo.count();
    }

    @Override
    public void saveNovel(NovelEntity novelEntity) {
        novelRepo.save(novelEntity);
    }

    @Override
    public boolean exists(Long id) {
        return novelRepo.existsById(id);
    }

    @Override
    public void deleteById(Long id) {
        novelRepo.deleteById(id);
    }

    @Override
    public void deleteByNovelName(String novelName) {
        novelRepo.deleteByNovelName(novelName);
    }
}