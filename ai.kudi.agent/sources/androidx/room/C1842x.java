package androidx.room;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.SQLException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.room.C1842x;
import androidx.room.p063z0.C1856e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p201g.p210b.p211a.p214c.InterfaceC7511a;
import p201g.p262t.p263a.C8089c;
import p201g.p262t.p263a.C8091e;
import p201g.p262t.p263a.C8092f;
import p201g.p262t.p263a.InterfaceC8093g;
import p201g.p262t.p263a.InterfaceC8094h;
import p201g.p262t.p263a.InterfaceC8100j;
import p201g.p262t.p263a.InterfaceC8101k;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutoClosingRoomOpenHelper.java */
/* renamed from: androidx.room.x */
/* loaded from: classes2.dex */
public final class C1842x implements InterfaceC8094h, InterfaceC1759a0 {

    /* renamed from: c */
    private final InterfaceC8094h f5589c;

    /* renamed from: d */
    private final C1843a f5590d;

    /* renamed from: e */
    private final C1838w f5591e;

    /* compiled from: AutoClosingRoomOpenHelper.java */
    /* renamed from: androidx.room.x$a */
    /* loaded from: classes2.dex */
    static final class C1843a implements InterfaceC8093g {

        /* renamed from: c */
        private final C1838w f5592c;

        C1843a(C1838w c1838w) {
            this.f5592c = c1838w;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: g */
        public static /* synthetic */ Boolean m34437g(InterfaceC8093g interfaceC8093g) {
            if (Build.VERSION.SDK_INT >= 16) {
                return Boolean.valueOf(interfaceC8093g.isWriteAheadLoggingEnabled());
            }
            return Boolean.FALSE;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: m */
        public static /* synthetic */ Object m34436m(InterfaceC8093g interfaceC8093g) {
            return null;
        }

        @Override // p201g.p262t.p263a.InterfaceC8093g
        /* renamed from: B0 */
        public Cursor mo16754B0(InterfaceC8100j interfaceC8100j) {
            try {
                return new C1845c(this.f5592c.m34445e().mo16754B0(interfaceC8100j), this.f5592c);
            } catch (Throwable th) {
                this.f5592c.m34448b();
                throw th;
            }
        }

        /* renamed from: F */
        void m34439F() {
            this.f5592c.m34447c(C1764d.f5398a);
        }

        @Override // p201g.p262t.p263a.InterfaceC8093g
        /* renamed from: L */
        public InterfaceC8101k mo16753L(String str) {
            return new C1844b(str, this.f5592c);
        }

        @Override // p201g.p262t.p263a.InterfaceC8093g
        /* renamed from: T */
        public Cursor mo16752T(InterfaceC8100j interfaceC8100j, CancellationSignal cancellationSignal) {
            try {
                return new C1845c(this.f5592c.m34445e().mo16752T(interfaceC8100j, cancellationSignal), this.f5592c);
            } catch (Throwable th) {
                this.f5592c.m34448b();
                throw th;
            }
        }

        @Override // p201g.p262t.p263a.InterfaceC8093g
        public void beginTransaction() {
            try {
                this.f5592c.m34445e().beginTransaction();
            } catch (Throwable th) {
                this.f5592c.m34448b();
                throw th;
            }
        }

        @Override // p201g.p262t.p263a.InterfaceC8093g
        public void beginTransactionNonExclusive() {
            try {
                this.f5592c.m34445e().beginTransactionNonExclusive();
            } catch (Throwable th) {
                this.f5592c.m34448b();
                throw th;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f5592c.m34449a();
        }

        @Override // p201g.p262t.p263a.InterfaceC8093g
        public void endTransaction() {
            if (this.f5592c.m34446d() != null) {
                try {
                    this.f5592c.m34446d().endTransaction();
                    return;
                } finally {
                    this.f5592c.m34448b();
                }
            }
            throw new IllegalStateException("End transaction called but delegateDb is null");
        }

        @Override // p201g.p262t.p263a.InterfaceC8093g
        public void execSQL(final String str) throws SQLException {
            this.f5592c.m34447c(new InterfaceC7511a() { // from class: androidx.room.e
                @Override // p201g.p210b.p211a.p214c.InterfaceC7511a
                /* renamed from: a */
                public final Object mo18527a(Object obj) {
                    return ((InterfaceC8093g) obj).execSQL(str);
                }
            });
        }

        @Override // p201g.p262t.p263a.InterfaceC8093g
        public List<Pair<String, String>> getAttachedDbs() {
            return (List) this.f5592c.m34447c(C1774g.f5408a);
        }

        @Override // p201g.p262t.p263a.InterfaceC8093g
        public String getPath() {
            return (String) this.f5592c.m34447c(C1836v.f5570a);
        }

        @Override // p201g.p262t.p263a.InterfaceC8093g
        public boolean inTransaction() {
            if (this.f5592c.m34446d() == null) {
                return false;
            }
            return ((Boolean) this.f5592c.m34447c(C1833u.f5561a)).booleanValue();
        }

        @Override // p201g.p262t.p263a.InterfaceC8093g
        public boolean isOpen() {
            InterfaceC8093g m34446d = this.f5592c.m34446d();
            if (m34446d == null) {
                return false;
            }
            return m34446d.isOpen();
        }

        @Override // p201g.p262t.p263a.InterfaceC8093g
        public boolean isWriteAheadLoggingEnabled() {
            return ((Boolean) this.f5592c.m34447c(C1762c.f5397a)).booleanValue();
        }

        @Override // p201g.p262t.p263a.InterfaceC8093g
        /* renamed from: j0 */
        public Cursor mo16750j0(String str) {
            try {
                return new C1845c(this.f5592c.m34445e().mo16750j0(str), this.f5592c);
            } catch (Throwable th) {
                this.f5592c.m34448b();
                throw th;
            }
        }

        @Override // p201g.p262t.p263a.InterfaceC8093g
        public void setTransactionSuccessful() {
            InterfaceC8093g m34446d = this.f5592c.m34446d();
            if (m34446d != null) {
                m34446d.setTransactionSuccessful();
                return;
            }
            throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AutoClosingRoomOpenHelper.java */
    /* renamed from: androidx.room.x$b */
    /* loaded from: classes2.dex */
    public static class C1844b implements InterfaceC8101k {

        /* renamed from: c */
        private final String f5593c;

        /* renamed from: d */
        private final ArrayList<Object> f5594d = new ArrayList<>();

        /* renamed from: e */
        private final C1838w f5595e;

        C1844b(String str, C1838w c1838w) {
            this.f5593c = str;
            this.f5595e = c1838w;
        }

        /* renamed from: F */
        private void m34435F(int i, Object obj) {
            int i2 = i - 1;
            if (i2 >= this.f5594d.size()) {
                for (int size = this.f5594d.size(); size <= i2; size++) {
                    this.f5594d.add(null);
                }
            }
            this.f5594d.set(i2, obj);
        }

        /* renamed from: c */
        private void m34434c(InterfaceC8101k interfaceC8101k) {
            int i = 0;
            while (i < this.f5594d.size()) {
                int i2 = i + 1;
                Object obj = this.f5594d.get(i);
                if (obj == null) {
                    interfaceC8101k.bindNull(i2);
                } else if (obj instanceof Long) {
                    interfaceC8101k.bindLong(i2, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    interfaceC8101k.bindDouble(i2, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    interfaceC8101k.bindString(i2, (String) obj);
                } else if (obj instanceof byte[]) {
                    interfaceC8101k.bindBlob(i2, (byte[]) obj);
                }
                i = i2;
            }
        }

        /* renamed from: g */
        private <T> T m34433g(final InterfaceC7511a<InterfaceC8101k, T> interfaceC7511a) {
            return (T) this.f5595e.m34447c(new InterfaceC7511a() { // from class: androidx.room.f
                @Override // p201g.p210b.p211a.p214c.InterfaceC7511a
                /* renamed from: a */
                public final Object mo18527a(Object obj) {
                    return C1842x.C1844b.this.m34432m(interfaceC7511a, (InterfaceC8093g) obj);
                }
            });
        }

        @Override // p201g.p262t.p263a.InterfaceC8099i
        public void bindBlob(int i, byte[] bArr) {
            m34435F(i, bArr);
        }

        @Override // p201g.p262t.p263a.InterfaceC8099i
        public void bindDouble(int i, double d) {
            m34435F(i, Double.valueOf(d));
        }

        @Override // p201g.p262t.p263a.InterfaceC8099i
        public void bindLong(int i, long j) {
            m34435F(i, Long.valueOf(j));
        }

        @Override // p201g.p262t.p263a.InterfaceC8099i
        public void bindNull(int i) {
            m34435F(i, null);
        }

        @Override // p201g.p262t.p263a.InterfaceC8099i
        public void bindString(int i, String str) {
            m34435F(i, str);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // p201g.p262t.p263a.InterfaceC8101k
        public long executeInsert() {
            return ((Long) m34433g(C1781h.f5436a)).longValue();
        }

        @Override // p201g.p262t.p263a.InterfaceC8101k
        public int executeUpdateDelete() {
            return ((Integer) m34433g(C1758a.f5395a)).intValue();
        }

        /* renamed from: m */
        public /* synthetic */ Object m34432m(InterfaceC7511a interfaceC7511a, InterfaceC8093g interfaceC8093g) {
            InterfaceC8101k mo16753L = interfaceC8093g.mo16753L(this.f5593c);
            m34434c(mo16753L);
            return interfaceC7511a.mo18527a(mo16753L);
        }
    }

    /* compiled from: AutoClosingRoomOpenHelper.java */
    /* renamed from: androidx.room.x$c */
    /* loaded from: classes2.dex */
    private static final class C1845c implements Cursor {

        /* renamed from: c */
        private final Cursor f5596c;

        /* renamed from: d */
        private final C1838w f5597d;

        C1845c(Cursor cursor, C1838w c1838w) {
            this.f5596c = cursor;
            this.f5597d = c1838w;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f5596c.close();
            this.f5597d.m34448b();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
            this.f5596c.copyStringToBuffer(i, charArrayBuffer);
        }

        @Override // android.database.Cursor
        @Deprecated
        public void deactivate() {
            this.f5596c.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i) {
            return this.f5596c.getBlob(i);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.f5596c.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.f5596c.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) throws IllegalArgumentException {
            return this.f5596c.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i) {
            return this.f5596c.getColumnName(i);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.f5596c.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.f5596c.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i) {
            return this.f5596c.getDouble(i);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.f5596c.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i) {
            return this.f5596c.getFloat(i);
        }

        @Override // android.database.Cursor
        public int getInt(int i) {
            return this.f5596c.getInt(i);
        }

        @Override // android.database.Cursor
        public long getLong(int i) {
            return this.f5596c.getLong(i);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return C8089c.m16773a(this.f5596c);
        }

        @Override // android.database.Cursor
        public List<Uri> getNotificationUris() {
            return C8092f.m16769a(this.f5596c);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.f5596c.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i) {
            return this.f5596c.getShort(i);
        }

        @Override // android.database.Cursor
        public String getString(int i) {
            return this.f5596c.getString(i);
        }

        @Override // android.database.Cursor
        public int getType(int i) {
            return this.f5596c.getType(i);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.f5596c.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.f5596c.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.f5596c.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.f5596c.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.f5596c.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.f5596c.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i) {
            return this.f5596c.isNull(i);
        }

        @Override // android.database.Cursor
        public boolean move(int i) {
            return this.f5596c.move(i);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.f5596c.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.f5596c.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.f5596c.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i) {
            return this.f5596c.moveToPosition(i);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.f5596c.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.f5596c.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f5596c.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        @Deprecated
        public boolean requery() {
            return this.f5596c.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.f5596c.respond(bundle);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle bundle) {
            C8091e.m16770a(this.f5596c, bundle);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f5596c.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public void setNotificationUris(ContentResolver contentResolver, List<Uri> list) {
            C8092f.m16768b(this.f5596c, contentResolver, list);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f5596c.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f5596c.unregisterDataSetObserver(dataSetObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1842x(InterfaceC8094h interfaceC8094h, C1838w c1838w) {
        this.f5589c = interfaceC8094h;
        this.f5591e = c1838w;
        c1838w.m34444f(interfaceC8094h);
        this.f5590d = new C1843a(this.f5591e);
    }

    @Override // androidx.room.InterfaceC1759a0
    /* renamed from: c */
    public InterfaceC8094h mo34441c() {
        return this.f5589c;
    }

    @Override // p201g.p262t.p263a.InterfaceC8094h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f5590d.close();
        } catch (IOException e) {
            C1856e.m34416a(e);
            throw null;
        }
    }

    @Override // p201g.p262t.p263a.InterfaceC8094h
    /* renamed from: e0 */
    public InterfaceC8093g mo16748e0() {
        this.f5590d.m34439F();
        return this.f5590d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C1838w m34440g() {
        return this.f5591e;
    }

    @Override // p201g.p262t.p263a.InterfaceC8094h
    public String getDatabaseName() {
        return this.f5589c.getDatabaseName();
    }

    @Override // p201g.p262t.p263a.InterfaceC8094h
    /* renamed from: h0 */
    public InterfaceC8093g mo16747h0() {
        this.f5590d.m34439F();
        return this.f5590d;
    }

    @Override // p201g.p262t.p263a.InterfaceC8094h
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f5589c.setWriteAheadLoggingEnabled(z);
    }
}
