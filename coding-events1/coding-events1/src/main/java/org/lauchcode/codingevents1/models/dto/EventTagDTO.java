package org.lauchcode.codingevents1.models.dto;

import jakarta.validation.constraints.NotNull;
import org.lauchcode.codingevents1.models.Event;
import org.lauchcode.codingevents1.models.Tag;

public class EventTagDTO {
    @NotNull
    private Event event;
    @NotNull
    private Tag tag;
    public EventTagDTO(){}

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }
}
