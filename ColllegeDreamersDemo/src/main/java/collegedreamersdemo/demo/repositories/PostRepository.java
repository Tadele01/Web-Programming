package collegedreamersdemo.demo.repositories;


import collegedreamersdemo.demo.models.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
    @Query("SELECT p FROM Post p LEFT JOIN FETCH p.author ORDER BY p.date DESC")
    List<Post> findLatest5Posts();
}
