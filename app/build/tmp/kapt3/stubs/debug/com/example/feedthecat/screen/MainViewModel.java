package com.example.feedthecat.screen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 $2\u00020\u0001:\u0002#$B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u0006\u0010!\u001a\u00020\u001eJ\u0006\u0010\"\u001a\u00020\u001eR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00180\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006%"}, d2 = {"Lcom/example/feedthecat/screen/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "statsRepository", "Lcom/example/feedthecat/data/IStatsRepository;", "achievementsPreferences", "Lcom/example/feedthecat/preferences/AchievementsPreferences;", "(Lcom/example/feedthecat/data/IStatsRepository;Lcom/example/feedthecat/preferences/AchievementsPreferences;)V", "_command", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/example/feedthecat/screen/MainViewModel$Command;", "_currentDay", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/feedthecat/domain/model/DayStat;", "_satiety", "", "command", "Lkotlinx/coroutines/flow/Flow;", "getCommand", "()Lkotlinx/coroutines/flow/Flow;", "satiety", "Lkotlinx/coroutines/flow/StateFlow;", "getSatiety", "()Lkotlinx/coroutines/flow/StateFlow;", "stats", "", "todayInMillis", "", "getTodayInMillis", "()J", "animateCatIfNeeded", "", "satietyValue", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feed", "saveTodayStat", "Command", "Companion", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.feedthecat.data.IStatsRepository statsRepository = null;
    private final com.example.feedthecat.preferences.AchievementsPreferences achievementsPreferences = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.feedthecat.screen.MainViewModel.Companion Companion = null;
    public static final int ANIMATION_DELTA = 15;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> _satiety = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> satiety = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.example.feedthecat.screen.MainViewModel.Command> _command = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.example.feedthecat.screen.MainViewModel.Command> command = null;
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.example.feedthecat.domain.model.DayStat>> stats = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.feedthecat.domain.model.DayStat> _currentDay = null;
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.feedthecat.data.IStatsRepository statsRepository, @org.jetbrains.annotations.NotNull()
    com.example.feedthecat.preferences.AchievementsPreferences achievementsPreferences) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getSatiety() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.example.feedthecat.screen.MainViewModel.Command> getCommand() {
        return null;
    }
    
    private final long getTodayInMillis() {
        return 0L;
    }
    
    public final void feed() {
    }
    
    public final void saveTodayStat() {
    }
    
    private final java.lang.Object animateCatIfNeeded(int satietyValue, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/example/feedthecat/screen/MainViewModel$Command;", "", "(Ljava/lang/String;I)V", "ANIMATE_CAT", "app_debug"})
    public static enum Command {
        /*public static final*/ ANIMATE_CAT /* = new ANIMATE_CAT() */;
        
        Command() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/feedthecat/screen/MainViewModel$Companion;", "", "()V", "ANIMATION_DELTA", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}