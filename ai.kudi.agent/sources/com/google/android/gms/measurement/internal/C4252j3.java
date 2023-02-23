package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.j3 */
/* loaded from: classes2.dex */
public final class C4252j3 extends f4 {

    /* renamed from: c */
    private final C4241i3 f10392c;

    /* renamed from: d */
    private boolean f10393d;

    C4252j3(b5 b5Var) {
        super(b5Var);
        Context f = ((v5) this).a.f();
        ((v5) this).a.z();
        this.f10392c = new C4241i3(this, f, "google_app_measurement_local.db");
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0129  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean m28108x(int r17, byte[] r18) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4252j3.m28108x(int, byte[]):boolean");
    }

    /* renamed from: n */
    protected final boolean m28118n() {
        return false;
    }

    /* renamed from: o */
    final SQLiteDatabase m28117o() throws SQLiteException {
        if (this.f10393d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f10392c.getWritableDatabase();
        if (writableDatabase == null) {
            this.f10393d = true;
            return null;
        }
        return writableDatabase;
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0205 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x01e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0252 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0252 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0252 A[SYNTHETIC] */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractC2916a> m28116p(int r23) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4252j3.m28116p(int):java.util.List");
    }

    /* renamed from: q */
    public final void m28115q() {
        int delete;
        h();
        try {
            SQLiteDatabase m28117o = m28117o();
            if (m28117o == null || (delete = m28117o.delete("messages", null, null)) <= 0) {
                return;
            }
            ((v5) this).a.b().v().m28013b("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e) {
            ((v5) this).a.b().r().m28013b("Error resetting local analytics data. error", e);
        }
    }

    /* renamed from: r */
    public final boolean m28114r() {
        return m28108x(3, new byte[0]);
    }

    /* renamed from: s */
    final boolean m28113s() {
        Context f = ((v5) this).a.f();
        ((v5) this).a.z();
        return f.getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* renamed from: t */
    public final boolean m28112t() {
        int i;
        h();
        if (!this.f10393d && m28113s()) {
            int i2 = 5;
            while (i < 5) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase m28117o = m28117o();
                    if (m28117o == null) {
                        this.f10393d = true;
                        return false;
                    }
                    m28117o.beginTransaction();
                    m28117o.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    m28117o.setTransactionSuccessful();
                    m28117o.endTransaction();
                    m28117o.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i2);
                    i2 += 20;
                    i = 0 == 0 ? i + 1 : 0;
                    sQLiteDatabase.close();
                } catch (SQLiteFullException e) {
                    ((v5) this).a.b().r().m28013b("Error deleting app launch break from local database", e);
                    this.f10393d = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                } catch (SQLiteException e2) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    }
                    ((v5) this).a.b().r().m28013b("Error deleting app launch break from local database", e2);
                    this.f10393d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            ((v5) this).a.b().w().m28014a("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    /* renamed from: u */
    public final boolean m28111u(C4169c c4169c) {
        byte[] c0 = ((v5) this).a.N().c0(c4169c);
        if (c0.length > 131072) {
            ((v5) this).a.b().t().m28014a("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return m28108x(2, c0);
    }

    /* renamed from: v */
    public final boolean m28110v(C4379u c4379u) {
        Parcel obtain = Parcel.obtain();
        C4391v.m27921a(c4379u, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            ((v5) this).a.b().t().m28014a("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return m28108x(0, marshall);
    }

    /* renamed from: w */
    public final boolean m28109w(C4203ea c4203ea) {
        Parcel obtain = Parcel.obtain();
        C4214fa.m28268a(c4203ea, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            ((v5) this).a.b().t().m28014a("User property too long for local database. Sending directly to service");
            return false;
        }
        return m28108x(1, marshall);
    }
}
