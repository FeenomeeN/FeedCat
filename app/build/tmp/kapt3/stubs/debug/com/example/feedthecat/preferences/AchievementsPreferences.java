package com.example.feedthecat.preferences;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u000fR$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR$\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/feedthecat/preferences/AchievementsPreferences;", "", "preferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "value", "", "isFiveHundredAchieved", "()Z", "setFiveHundredAchieved", "(Z)V", "isHundredAchieved", "setHundredAchieved", "isThousandAchieved", "setThousandAchieved", "", "lastSatiety", "getLastSatiety", "()I", "setLastSatiety", "(I)V", "updateAchievements", "", "Companion", "app_debug"})
public final class AchievementsPreferences {
    private final android.content.SharedPreferences preferences = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.feedthecat.preferences.AchievementsPreferences.Companion Companion = null;
    private static final java.lang.String HUNDRED_PREF_KEY = "HUNDRED_PREF_KEY";
    private static final java.lang.String FIVE_HUNDRED_PREF_KEY = "FIVE_HUNDRED_PREF_KEY";
    private static final java.lang.String THOUSAND_PREF_KEY = "THOUSAND_PREF_KEY";
    private static final java.lang.String LAST_SATIETY_PREF_KEY = "LAST_SATIETY_PREF_KEY";
    
    public AchievementsPreferences(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences preferences) {
        super();
    }
    
    public final int getLastSatiety() {
        return 0;
    }
    
    public final void setLastSatiety(int value) {
    }
    
    public final boolean isHundredAchieved() {
        return false;
    }
    
    public final void setHundredAchieved(boolean value) {
    }
    
    public final boolean isFiveHundredAchieved() {
        return false;
    }
    
    public final void setFiveHundredAchieved(boolean value) {
    }
    
    public final boolean isThousandAchieved() {
        return false;
    }
    
    public final void setThousandAchieved(boolean value) {
    }
    
    public final void updateAchievements(int value) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/feedthecat/preferences/AchievementsPreferences$Companion;", "", "()V", "FIVE_HUNDRED_PREF_KEY", "", "HUNDRED_PREF_KEY", "LAST_SATIETY_PREF_KEY", "THOUSAND_PREF_KEY", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}