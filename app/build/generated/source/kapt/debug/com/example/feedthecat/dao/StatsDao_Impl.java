package com.example.feedthecat.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.feedthecat.domain.model.DayStat;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class StatsDao_Impl implements StatsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DayStat> __insertionAdapterOfDayStat;

  public StatsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDayStat = new EntityInsertionAdapter<DayStat>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `daystat` (`day`,`satiety`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DayStat value) {
        stmt.bindLong(1, value.getDay());
        stmt.bindLong(2, value.getDaySatiety());
      }
    };
  }

  @Override
  public Object addDayStat(final DayStat dayStat, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfDayStat.insert(dayStat);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getDayStats(final Continuation<? super List<DayStat>> continuation) {
    final String _sql = "SELECT * FROM daystat";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<DayStat>>() {
      @Override
      public List<DayStat> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfDay = CursorUtil.getColumnIndexOrThrow(_cursor, "day");
          final int _cursorIndexOfDaySatiety = CursorUtil.getColumnIndexOrThrow(_cursor, "satiety");
          final List<DayStat> _result = new ArrayList<DayStat>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final DayStat _item;
            final long _tmpDay;
            _tmpDay = _cursor.getLong(_cursorIndexOfDay);
            final int _tmpDaySatiety;
            _tmpDaySatiety = _cursor.getInt(_cursorIndexOfDaySatiety);
            _item = new DayStat(_tmpDay,_tmpDaySatiety);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
