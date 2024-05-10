package com.univali.how_v.record.response;

public record ErrorObject(
        String field,
        String message,
        Object parameter
) {
}
