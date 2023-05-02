package com.evgeniykudashov.adservice.model.domain.aggregate.chat.valueobject;


import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(onConstructor = @__({@Deprecated}))

@Immutable
@Embeddable
public class PublicationDateTime {

    private LocalDateTime publicationDateTime;

    public PublicationDateTime(LocalDateTime publicationDateTime) {
        this.publicationDateTime = publicationDateTime;
    }
}
