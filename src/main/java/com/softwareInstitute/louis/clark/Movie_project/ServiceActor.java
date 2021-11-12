package com.softwareInstitute.louis.clark.Movie_project;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ServiceActor {

    @Autowired
    private ActorRepository actorRepositoryServiceInstance;

// !!!!!!!!!!!!!!!!!! part of this method is not what was in the example
    public List<Actor> listAll() {
        return (List<Actor>) actorRepositoryServiceInstance.findAll();
    }

    public void save(Actor actor) {
        actorRepositoryServiceInstance.save(actor);
    }

    public Actor get(Integer id) {
        return actorRepositoryServiceInstance.findById(id).get();
    }

    public void delete(Integer id) {
        actorRepositoryServiceInstance.deleteById(id);
    }


}
