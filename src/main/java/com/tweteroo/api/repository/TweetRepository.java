package com.tweteroo.api.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.*;
import com.tweteroo.api.model.Tweet;

public interface TweetRepository extends JpaRepository<Tweet, Long>{
    Page<Tweet> findByIdDesc(Pageable pageable);
    List<Tweet> findByUsername(String username);
}
