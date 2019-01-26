package com.example.sweater.repos;

import com.example.sweater.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by User on 26.01.2019.
 */
public interface MessageRepo extends CrudRepository<Message, Integer> {

    List<Message> findByTag(String tag);

}
