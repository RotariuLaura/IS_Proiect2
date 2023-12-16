package org.lauchcode.codingevents1.data;

import org.lauchcode.codingevents1.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {
}
