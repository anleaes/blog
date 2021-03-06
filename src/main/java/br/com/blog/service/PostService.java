package br.com.blog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.blog.model.Post;
import br.com.blog.repository.PostRepository;

@Service
public class PostService {
	@Autowired
	private PostRepository repository;

	public List<Post> findAll() {
		return repository.findAll();
	}

	/*public Post findById(Long id) {
		return repository.findById(id);
	}*/

	public Post findPostById(Long id) {
		return repository.findPostById(id);
	}

	public Post save(Post post) {
		return repository.saveAndFlush(post);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}
}
