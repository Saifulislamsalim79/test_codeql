package com.google.firebase.database.p131s.p132g0;

import com.google.firebase.database.p131s.C5830l;
import com.google.firebase.database.p139u.C5921b;
/* compiled from: Operation.java */
/* renamed from: com.google.firebase.database.s.g0.d */
/* loaded from: classes2.dex */
public abstract class AbstractC5748d {

    /* renamed from: a */
    protected final EnumC5749a f14155a;

    /* renamed from: b */
    protected final C5750e f14156b;

    /* renamed from: c */
    protected final C5830l f14157c;

    /* compiled from: Operation.java */
    /* renamed from: com.google.firebase.database.s.g0.d$a */
    /* loaded from: classes2.dex */
    public enum EnumC5749a {
        Overwrite,
        Merge,
        AckUserWrite,
        ListenComplete
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC5748d(EnumC5749a enumC5749a, C5750e c5750e, C5830l c5830l) {
        this.f14155a = enumC5749a;
        this.f14156b = c5750e;
        this.f14157c = c5830l;
    }

    /* renamed from: a */
    public C5830l m23908a() {
        return this.f14157c;
    }

    /* renamed from: b */
    public C5750e m23907b() {
        return this.f14156b;
    }

    /* renamed from: c */
    public EnumC5749a m23906c() {
        return this.f14155a;
    }

    /* renamed from: d */
    public abstract AbstractC5748d mo23900d(C5921b c5921b);
}
