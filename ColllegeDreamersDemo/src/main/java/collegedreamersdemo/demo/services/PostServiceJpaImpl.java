package collegedreamersdemo.demo.services;

import collegedreamersdemo.demo.models.Post;
import collegedreamersdemo.demo.repositories.PostRepository;
import collegedreamersdemo.demo.models.User;
import collegedreamersdemo.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class PostServiceJpaImpl implements PostService {

    @Autowired
    private PostRepository postRepo;

    @Override
    public List<Post> findAll() {
        return (List<Post>) this.postRepo.findAll();
    }

    @Override
    public List<Post> findLatest5() {
        return this.postRepo.findLatest5Posts();
    }

    @Override
    public Post findById(Long id) {
        return null;
    }

    @Override
    public Post create(Post post) {
        return null;
    }

    @Override
    public Post edit(Post post) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}

