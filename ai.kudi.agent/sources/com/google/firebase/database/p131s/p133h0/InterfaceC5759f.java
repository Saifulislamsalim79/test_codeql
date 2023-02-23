package com.google.firebase.database.p131s.p133h0;

import com.google.firebase.database.p131s.C5737e;
import com.google.firebase.database.p131s.C5830l;
import com.google.firebase.database.p131s.C5895z;
import com.google.firebase.database.p139u.C5921b;
import com.google.firebase.database.p139u.InterfaceC5945n;
import java.util.List;
import java.util.Set;
/* compiled from: PersistenceStorageEngine.java */
/* renamed from: com.google.firebase.database.s.h0.f */
/* loaded from: classes2.dex */
public interface InterfaceC5759f {
    /* renamed from: a */
    void mo23873a(long j);

    /* renamed from: b */
    void mo23872b(C5830l c5830l, InterfaceC5945n interfaceC5945n, long j);

    void beginTransaction();

    /* renamed from: c */
    void mo23871c(C5830l c5830l, C5737e c5737e, long j);

    /* renamed from: d */
    List<C5895z> mo23870d();

    /* renamed from: e */
    void mo23869e(long j);

    void endTransaction();

    /* renamed from: f */
    Set<C5921b> mo23868f(long j);

    /* renamed from: g */
    void mo23867g(C5830l c5830l, C5737e c5737e);

    /* renamed from: h */
    InterfaceC5945n mo23866h(C5830l c5830l);

    /* renamed from: i */
    Set<C5921b> mo23865i(Set<Long> set);

    /* renamed from: j */
    void mo23864j(long j);

    /* renamed from: k */
    void mo23863k(C5830l c5830l, InterfaceC5945n interfaceC5945n);

    /* renamed from: l */
    void mo23862l(long j, Set<C5921b> set);

    /* renamed from: m */
    void mo23861m(C5764h c5764h);

    /* renamed from: n */
    void mo23860n(C5830l c5830l, InterfaceC5945n interfaceC5945n);

    /* renamed from: o */
    long mo23859o();

    /* renamed from: p */
    List<C5764h> mo23858p();

    /* renamed from: q */
    void mo23857q(long j, Set<C5921b> set, Set<C5921b> set2);

    /* renamed from: r */
    void mo23856r(C5830l c5830l, C5760g c5760g);

    void setTransactionSuccessful();
}
