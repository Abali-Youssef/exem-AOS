package com.example.commonapi.commands;

public abstract class BaseCommand<T> {
    @TargetAggregateIdentifier
    @Getter public T id;

    public BaseCommand(T id) {
        this.id = id;
    }

}