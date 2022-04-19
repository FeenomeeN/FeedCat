package com.example.feedthecat.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/example/feedthecat/data/StatsRepository;", "Lcom/example/feedthecat/data/IStatsRepository;", "database", "Lcom/example/feedthecat/db/AppDatabase;", "(Lcom/example/feedthecat/db/AppDatabase;)V", "addDayStat", "", "dayStat", "Lcom/example/feedthecat/domain/model/DayStat;", "(Lcom/example/feedthecat/domain/model/DayStat;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDayStats", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class StatsRepository implements com.example.feedthecat.data.IStatsRepository {
    private final com.example.feedthecat.db.AppDatabase database = null;
    
    public StatsRepository(@org.jetbrains.annotations.NotNull()
    com.example.feedthecat.db.AppDatabase database) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getDayStats(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.feedthecat.domain.model.DayStat>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object addDayStat(@org.jetbrains.annotations.NotNull()
    com.example.feedthecat.domain.model.DayStat dayStat, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}