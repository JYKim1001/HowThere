package com.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.web.dto.Board;
import com.web.model.User;
import com.web.model.UserWishList;

@Repository
public interface UserWishListRepository extends JpaRepository<UserWishList, Long>{
	
	boolean existsByUserAndBoard(User user, Board board);
	List<UserWishList> findByUser(User user);
	
	void deleteByUser(User user);
	void deleteByBoardSeq(@Param("boardSeq") Long boardSeq);

}
