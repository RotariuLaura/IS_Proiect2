package org.lauchcode.codingevents1.data;

import org.lauchcode.codingevents1.models.EventCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventCategoryRepository extends CrudRepository<EventCategory, Integer> {

}
