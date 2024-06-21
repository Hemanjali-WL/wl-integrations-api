package org.wellnessliving.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseBase<T> {
    private boolean valid;
    private List<String> messages;
    private T data;
    @Builder.Default
    private ZonedDateTime completed = ZonedDateTime.now();
}
