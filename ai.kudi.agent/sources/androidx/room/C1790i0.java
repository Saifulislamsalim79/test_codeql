package androidx.room;

import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.room.AbstractC1802o0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import p201g.p262t.p263a.InterfaceC8093g;
import p201g.p262t.p263a.InterfaceC8100j;
import p201g.p262t.p263a.InterfaceC8101k;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: QueryInterceptorDatabase.java */
/* renamed from: androidx.room.i0 */
/* loaded from: classes2.dex */
public final class C1790i0 implements InterfaceC8093g {

    /* renamed from: c */
    private final InterfaceC8093g f5459c;

    /* renamed from: d */
    private final AbstractC1802o0.InterfaceC1808f f5460d;

    /* renamed from: e */
    private final Executor f5461e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1790i0(InterfaceC8093g interfaceC8093g, AbstractC1802o0.InterfaceC1808f interfaceC1808f, Executor executor) {
        this.f5459c = interfaceC8093g;
        this.f5460d = interfaceC1808f;
        this.f5461e = executor;
    }

    @Override // p201g.p262t.p263a.InterfaceC8093g
    /* renamed from: B0 */
    public Cursor mo16754B0(final InterfaceC8100j interfaceC8100j) {
        final C1796l0 c1796l0 = new C1796l0();
        interfaceC8100j.mo16755g(c1796l0);
        this.f5461e.execute(new Runnable() { // from class: androidx.room.l
            @Override // java.lang.Runnable
            public final void run() {
                C1790i0.this.m34504J(interfaceC8100j, c1796l0);
            }
        });
        return this.f5459c.mo16754B0(interfaceC8100j);
    }

    /* renamed from: F */
    public /* synthetic */ void m34506F(String str) {
        this.f5460d.m34476a(str, new ArrayList(0));
    }

    /* renamed from: I */
    public /* synthetic */ void m34505I(String str) {
        this.f5460d.m34476a(str, Collections.emptyList());
    }

    /* renamed from: J */
    public /* synthetic */ void m34504J(InterfaceC8100j interfaceC8100j, C1796l0 c1796l0) {
        this.f5460d.m34476a(interfaceC8100j.mo16756c(), c1796l0.m34498c());
    }

    @Override // p201g.p262t.p263a.InterfaceC8093g
    /* renamed from: L */
    public InterfaceC8101k mo16753L(String str) {
        return new C1798m0(this.f5459c.mo16753L(str), this.f5460d, str, this.f5461e);
    }

    /* renamed from: O */
    public /* synthetic */ void m34503O(InterfaceC8100j interfaceC8100j, C1796l0 c1796l0) {
        this.f5460d.m34476a(interfaceC8100j.mo16756c(), c1796l0.m34498c());
    }

    /* renamed from: P */
    public /* synthetic */ void m34502P() {
        this.f5460d.m34476a("TRANSACTION SUCCESSFUL", Collections.emptyList());
    }

    @Override // p201g.p262t.p263a.InterfaceC8093g
    /* renamed from: T */
    public Cursor mo16752T(final InterfaceC8100j interfaceC8100j, CancellationSignal cancellationSignal) {
        final C1796l0 c1796l0 = new C1796l0();
        interfaceC8100j.mo16755g(c1796l0);
        this.f5461e.execute(new Runnable() { // from class: androidx.room.i
            @Override // java.lang.Runnable
            public final void run() {
                C1790i0.this.m34503O(interfaceC8100j, c1796l0);
            }
        });
        return this.f5459c.mo16754B0(interfaceC8100j);
    }

    @Override // p201g.p262t.p263a.InterfaceC8093g
    public void beginTransaction() {
        this.f5461e.execute(new Runnable() { // from class: androidx.room.o
            @Override // java.lang.Runnable
            public final void run() {
                C1790i0.this.m34501c();
            }
        });
        this.f5459c.beginTransaction();
    }

    @Override // p201g.p262t.p263a.InterfaceC8093g
    public void beginTransactionNonExclusive() {
        this.f5461e.execute(new Runnable() { // from class: androidx.room.n
            @Override // java.lang.Runnable
            public final void run() {
                C1790i0.this.m34500g();
            }
        });
        this.f5459c.beginTransactionNonExclusive();
    }

    /* renamed from: c */
    public /* synthetic */ void m34501c() {
        this.f5460d.m34476a("BEGIN EXCLUSIVE TRANSACTION", Collections.emptyList());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f5459c.close();
    }

    @Override // p201g.p262t.p263a.InterfaceC8093g
    public void endTransaction() {
        this.f5461e.execute(new Runnable() { // from class: androidx.room.m
            @Override // java.lang.Runnable
            public final void run() {
                C1790i0.this.m34499m();
            }
        });
        this.f5459c.endTransaction();
    }

    @Override // p201g.p262t.p263a.InterfaceC8093g
    public void execSQL(final String str) throws SQLException {
        this.f5461e.execute(new Runnable() { // from class: androidx.room.k
            @Override // java.lang.Runnable
            public final void run() {
                C1790i0.this.m34506F(str);
            }
        });
        this.f5459c.execSQL(str);
    }

    /* renamed from: g */
    public /* synthetic */ void m34500g() {
        this.f5460d.m34476a("BEGIN DEFERRED TRANSACTION", Collections.emptyList());
    }

    @Override // p201g.p262t.p263a.InterfaceC8093g
    public List<Pair<String, String>> getAttachedDbs() {
        return this.f5459c.getAttachedDbs();
    }

    @Override // p201g.p262t.p263a.InterfaceC8093g
    public String getPath() {
        return this.f5459c.getPath();
    }

    @Override // p201g.p262t.p263a.InterfaceC8093g
    public boolean inTransaction() {
        return this.f5459c.inTransaction();
    }

    @Override // p201g.p262t.p263a.InterfaceC8093g
    public boolean isOpen() {
        return this.f5459c.isOpen();
    }

    @Override // p201g.p262t.p263a.InterfaceC8093g
    public boolean isWriteAheadLoggingEnabled() {
        return this.f5459c.isWriteAheadLoggingEnabled();
    }

    @Override // p201g.p262t.p263a.InterfaceC8093g
    /* renamed from: j0 */
    public Cursor mo16750j0(final String str) {
        this.f5461e.execute(new Runnable() { // from class: androidx.room.j
            @Override // java.lang.Runnable
            public final void run() {
                C1790i0.this.m34505I(str);
            }
        });
        return this.f5459c.mo16750j0(str);
    }

    /* renamed from: m */
    public /* synthetic */ void m34499m() {
        this.f5460d.m34476a("END TRANSACTION", Collections.emptyList());
    }

    @Override // p201g.p262t.p263a.InterfaceC8093g
    public void setTransactionSuccessful() {
        this.f5461e.execute(new Runnable() { // from class: androidx.room.p
            @Override // java.lang.Runnable
            public final void run() {
                C1790i0.this.m34502P();
            }
        });
        this.f5459c.setTransactionSuccessful();
    }
}
