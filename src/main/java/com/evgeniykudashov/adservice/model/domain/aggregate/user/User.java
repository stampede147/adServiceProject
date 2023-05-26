package com.evgeniykudashov.adservice.model.domain.aggregate.user;


import com.evgeniykudashov.adservice.model.domain.aggregate.user.valueobject.AccessDetails;
import com.evgeniykudashov.adservice.model.domain.aggregate.user.valueobject.PersonalDetails;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@NoArgsConstructor(onConstructor = @__({@Deprecated}))
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

@Entity
@Table(name = "users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    @EqualsAndHashCode.Include
    @Getter
    private long id;

    @Getter
    private PersonalDetails personalDetails;

    @Getter
    private AccessDetails accessDetails;

    public User(PersonalDetails personalDetails, AccessDetails accessDetails) {
        this.personalDetails = personalDetails;
        this.accessDetails = accessDetails;
    }

    public void updatePersonalDetails(PersonalDetails personalDetails) {
        this.personalDetails = personalDetails;
    }

    public void updateAccessDetails(AccessDetails accessDetails) {
        this.accessDetails = accessDetails;
    }
}
