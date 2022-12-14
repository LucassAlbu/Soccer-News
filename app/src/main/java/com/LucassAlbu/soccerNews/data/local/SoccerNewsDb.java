package com.LucassAlbu.soccerNews.data.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.LucassAlbu.soccerNews.domain.News;

@Database(entities = {News.class}, version = 1)
public abstract class SoccerNewsDb extends RoomDatabase {
    public abstract NewsDao newsDao();
}
