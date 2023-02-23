package p201g.p262t.p263a;

import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;
/* compiled from: SupportSQLiteDatabase.java */
/* renamed from: g.t.a.g */
/* loaded from: classes2.dex */
public interface InterfaceC8093g extends Closeable {
    /* renamed from: B0 */
    Cursor mo16754B0(InterfaceC8100j interfaceC8100j);

    /* renamed from: L */
    InterfaceC8101k mo16753L(String str);

    /* renamed from: T */
    Cursor mo16752T(InterfaceC8100j interfaceC8100j, CancellationSignal cancellationSignal);

    void beginTransaction();

    void beginTransactionNonExclusive();

    void endTransaction();

    void execSQL(String str) throws SQLException;

    List<Pair<String, String>> getAttachedDbs();

    String getPath();

    boolean inTransaction();

    boolean isOpen();

    boolean isWriteAheadLoggingEnabled();

    /* renamed from: j0 */
    Cursor mo16750j0(String str);

    void setTransactionSuccessful();
}
