package demo.login.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import demo.login.data.Comment;
import demo.login.payload.request.CommentRequest;
import demo.login.payload.response.MessageResponse;
import demo.login.repository.CommentRepository;

@RestController
public class CommentController {
    
    @Autowired
    CommentRepository commentRepository;

    @PostMapping("/comment")
    public ResponseEntity<MessageResponse> postComment(@RequestBody CommentRequest commentRequest) {
        Comment comment = new Comment(commentRequest.getEnrollmentNo(), commentRequest.getCommentContent(),
                commentRequest.getSubComment(), commentRequest.getCommentDate());
        commentRepository.save(comment);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    
    @DeleteMapping("/comment/{id}")
    public ResponseEntity<String> deleteComment(@PathVariable Long id) {
        try {
            commentRepository.deleteById(id);
            return ResponseEntity.accepted().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}
