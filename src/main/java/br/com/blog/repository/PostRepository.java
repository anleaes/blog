package br.com.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.blog.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
