package com.google.firebase.database.p131s.p136j0;

import com.google.firebase.database.C5608b;
import com.google.firebase.database.p131s.AbstractC5772i;
import com.google.firebase.database.p131s.C5830l;
import com.google.firebase.database.p131s.p136j0.InterfaceC5805e;
/* compiled from: DataEvent.java */
/* renamed from: com.google.firebase.database.s.j0.d */
/* loaded from: classes2.dex */
public class C5804d implements InterfaceC5805e {

    /* renamed from: a */
    private final InterfaceC5805e.EnumC5806a f14253a;

    /* renamed from: b */
    private final AbstractC5772i f14254b;

    /* renamed from: c */
    private final C5608b f14255c;

    public C5804d(InterfaceC5805e.EnumC5806a enumC5806a, AbstractC5772i abstractC5772i, C5608b c5608b, String str) {
        this.f14253a = enumC5806a;
        this.f14254b = abstractC5772i;
        this.f14255c = c5608b;
    }

    @Override // com.google.firebase.database.p131s.p136j0.InterfaceC5805e
    /* renamed from: a */
    public void mo23673a() {
        this.f14254b.mo23809d(this);
    }

    /* renamed from: b */
    public C5830l m23675b() {
        C5830l m24304e = this.f14255c.m24341e().m24304e();
        return this.f14253a == InterfaceC5805e.EnumC5806a.VALUE ? m24304e : m24304e.m23586b0();
    }

    /* renamed from: c */
    public C5608b m23674c() {
        return this.f14255c;
    }

    @Override // com.google.firebase.database.p131s.p136j0.InterfaceC5805e
    public String toString() {
        if (this.f14253a == InterfaceC5805e.EnumC5806a.VALUE) {
            return m23675b() + ": " + this.f14253a + ": " + this.f14255c.m24338h(true);
        }
        return m23675b() + ": " + this.f14253a + ": { " + this.f14255c.m24342d() + ": " + this.f14255c.m24338h(true) + " }";
    }
}
