package demo.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.login.data.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    
}
