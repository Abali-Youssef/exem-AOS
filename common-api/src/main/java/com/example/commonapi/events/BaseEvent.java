package com.example.commonapi.events;

public abstract class BaseEvent<T> {
    @TargetAggregateIdentifier
    @Getter public T id;

    public BaseEvent(T id) {
        this.id = id;
    }

}