package p201g.p262t.p263a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.CancellationSignal;
import java.io.File;
/* compiled from: SupportSQLiteCompat.java */
/* renamed from: g.t.a.b */
/* loaded from: classes2.dex */
public final class C8088b {
    /* renamed from: a */
    public static boolean m16777a(File file) {
        return SQLiteDatabase.deleteDatabase(file);
    }

    /* renamed from: b */
    public static boolean m16776b(SQLiteDatabase sQLiteDatabase) {
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    /* renamed from: c */
    public static Cursor m16775c(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, CancellationSignal cancellationSignal, SQLiteDatabase.CursorFactory cursorFactory) {
        return sQLiteDatabase.rawQueryWithFactory(cursorFactory, str, strArr, str2, cancellationSignal);
    }

    /* renamed from: d */
    public static void m16774d(SQLiteOpenHelper sQLiteOpenHelper, boolean z) {
        sQLiteOpenHelper.setWriteAheadLoggingEnabled(z);
    }
}
