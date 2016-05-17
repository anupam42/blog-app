package com.github.union.blog.repository;

import com.github.union.blog.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by union on 16.05.16.
 */

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {

    @Query(value = "SELECT c FROM Comment c WHERE c.id = ?1")
    Comment findOneCommentById(Integer id);

    @Query(value = "SELECT c FROM Comment c WHERE c.postId = ?1")
    List<Comment> findAllCommentsFromPostById(Integer id);

    @Modifying
    @Query(value = "UPDATE Comment c SET c.review = ?1 WHERE c.id = ?2")
    void updateReviewById(String review, Integer id);
}
