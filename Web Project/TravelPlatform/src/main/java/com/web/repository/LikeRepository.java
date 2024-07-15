package com.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.web.dto.Board;
import com.web.model.LikeEntity;
import com.web.model.User;

public interface LikeRepository extends JpaRepository<LikeEntity, Long> {

	// 좋아요 누른 유저, 게시글
	boolean existsByUserAndBoard(User user, Board board);

	void deleteByUser(User user);
	
	// 게시글 추천 알고리즘
	List<LikeEntity> findByBoard(Board board);

	List<LikeEntity> findByUser(User user);

	List<LikeEntity> findByBoardIn(List<Board> boards);
	
	
    void deleteByBoardSeq(@Param("boardSeq") Long boardSeq);

}
