package com.example.feedthecat.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/example/feedthecat/data/IStatsRepository;", "", "addDayStat", "", "dayStat", "Lcom/example/feedthecat/domain/model/DayStat;", "(Lcom/example/feedthecat/domain/model/DayStat;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDayStats", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface IStatsRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getDayStats(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.feedthecat.domain.model.DayStat>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addDayStat(@org.jetbrains.annotations.NotNull()
    com.example.feedthecat.domain.model.DayStat dayStat, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}