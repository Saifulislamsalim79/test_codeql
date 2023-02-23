package com.google.firebase.database.p131s.p136j0;

import com.google.firebase.database.C5611c;
import com.google.firebase.database.p131s.AbstractC5772i;
import com.google.firebase.database.p131s.C5830l;
/* compiled from: CancelEvent.java */
/* renamed from: com.google.firebase.database.s.j0.b */
/* loaded from: classes2.dex */
public class C5802b implements InterfaceC5805e {

    /* renamed from: a */
    private final C5830l f14246a;

    /* renamed from: b */
    private final AbstractC5772i f14247b;

    /* renamed from: c */
    private final C5611c f14248c;

    public C5802b(AbstractC5772i abstractC5772i, C5611c c5611c, C5830l c5830l) {
        this.f14247b = abstractC5772i;
        this.f14246a = c5830l;
        this.f14248c = c5611c;
    }

    @Override // com.google.firebase.database.p131s.p136j0.InterfaceC5805e
    /* renamed from: a */
    public void mo23673a() {
        this.f14247b.mo23810c(this.f14248c);
    }

    /* renamed from: b */
    public C5830l m23689b() {
        return this.f14246a;
    }

    @Override // com.google.firebase.database.p131s.p136j0.InterfaceC5805e
    public String toString() {
        return m23689b() + ":CANCEL";
    }
}
