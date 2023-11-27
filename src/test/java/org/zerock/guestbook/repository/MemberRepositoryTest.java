package org.zerock.guestbook.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.zerock.guestbook.entity.MemoEntity;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemoRepositoryTests {
    @Autowired
    private MemoRepository memoRepository;

    @Test
    void testInsertDummies() {
        IntStream
                .rangeClosed(1, 100)
                .forEach(i -> {

                    MemoEntity memoEntity =
                            MemoEntity.builder()
                                    .memoText("Insert .... " + i)
                                    .build();

                    memoRepository.save(memoEntity);

                });
    }

    @Test
    void testSelect() {

        Long mno = 101L;
        Optional<MemoEntity> result = memoRepository.findById(mno);
        if (result.isPresent()) {
            MemoEntity memoEntity = result.get();
            System.out.println(memoEntity);
        } else {
            System.out.println("empty!");
        }
    }

    @Test
    void testUpdate() {
        MemoEntity memoEntity = MemoEntity.builder()
                .mno(100L)
                .memoText("Update .... 100")
                .build();
        memoRepository.save(memoEntity);
    }

    @Test
    void testDelete() {
        Long mno = 100L;
        memoRepository.deleteById(mno);

    }

    @Test
    void testList() {
        List<MemoEntity> list = memoRepository.findAll();
        for (MemoEntity memoEntity : list) {
            System.out.println(memoEntity);
        }
    }

    @Test
    void testPageDefault() {
        Pageable pageable
                = PageRequest.of(1, 10);
        Page<MemoEntity> result = memoRepository.findAll(pageable);
        result.getContent().forEach(
                memoEntity -> {
                    System.out.println(memoEntity);
                }
        );
//        System.out.println("total pages : " + result.getTotalPages());
//        System.out.println("total elements : " + result.getTotalElements());
//        System.out.println(result.getNumber());
//        System.out.println(result.getSize());

    }

    @Test
    void testSort() {
        Sort sort
                = Sort.by("mno").descending();

        Pageable pageable
                = PageRequest.of(0, 20, sort);
        Page<MemoEntity> result
                = memoRepository.findAll(pageable);

        result.getContent().forEach(
                memoEntity -> {
                    System.out.println(memoEntity);
                }
        );
    }

    @Test
    void testQueryMethod1() {
        List<MemoEntity> result
                = memoRepository.findByMnoBetweenOrderByMnoDesc(70L, 80L);
        result.forEach(memoEntity -> {
            System.out.println(memoEntity);
        });
    }

    @Test
    void testQuery1() {
        List<MemoEntity> result = memoRepository.getListDesc();
        result.forEach(memoEntity -> {
            System.out.println(memoEntity);
        });
    }

    @Test
    void testQuery2() {
        Optional<MemoEntity> result =
                memoRepository.findByMno(1L);
        if (result.isPresent()) {
            MemoEntity memoEntity = result.get();
            System.out.println(memoEntity);
        } else {
            System.out.println("Empty");
        }
    }

    @Test
    void testQuery3() {
        memoRepository.updateMemoText(100L, "UPDATE ..... ");
    }

}







