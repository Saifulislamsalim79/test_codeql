package p272h.p286c.p287a.p288a.p289i.p290a0.p291j;

import android.database.sqlite.SQLiteDatabase;
import p272h.p286c.p287a.p288a.p289i.p290a0.p291j.C8300s0;
/* compiled from: lambda */
/* renamed from: h.c.a.a.i.a0.j.z */
/* loaded from: classes2.dex */
public final /* synthetic */ class C8309z implements C8300s0.InterfaceC8301a {

    /* renamed from: a */
    public static final /* synthetic */ C8309z f19926a = new C8309z();

    private /* synthetic */ C8309z() {
    }

    @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.C8300s0.InterfaceC8301a
    /* renamed from: a */
    public final void mo16313a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
