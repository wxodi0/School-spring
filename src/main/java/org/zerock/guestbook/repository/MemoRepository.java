package org.zerock.guestbook.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.zerock.guestbook.entity.MemoEntity;

import java.util.List;
import java.util.Optional;

public interface MemoRepository extends JpaRepository<MemoEntity, Long> { // <T, ID>

    @Query("SELECT m FROM MemoEntity m WHERE m.mno=:mno")
    Optional<MemoEntity> findByMno(@Param("mno") Long mno);


    @Query("SELECT m FROM MemoEntity m Order By m.mno DESC")
    List<MemoEntity> getListDesc();

    List<MemoEntity> findByMnoBetweenOrderByMnoDesc(Long start, Long end);

    @Transactional
    @Modifying
    @Query("UPDATE MemoEntity m " +
            "SET m.memoText=:memoText "+
            "WHERE m.mno=:mno")


    int updateMemoText(@Param("mno") Long mno,@Param("memoText") String memoText);//바인딩

}
