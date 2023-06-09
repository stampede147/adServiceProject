package com.evgeniykudashov.adservice.dto.response;


import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Collection;

@Data
@FieldDefaults(level = AccessLevel.PUBLIC)
public class PageDto<T> {

    Collection<T> content;
    int totalPages;
    long totalElements;
    int size;
    int number;
}
