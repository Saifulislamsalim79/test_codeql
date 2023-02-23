package com.google.firebase.perf.p177i;

import com.google.firebase.p170o.InterfaceC6560b;
import com.google.firebase.perf.p176h.C6609a;
import com.google.firebase.perf.p179k.C6671i;
import p272h.p286c.p287a.p288a.AbstractC8237c;
import p272h.p286c.p287a.p288a.C8236b;
import p272h.p286c.p287a.p288a.InterfaceC8240f;
import p272h.p286c.p287a.p288a.InterfaceC8241g;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FlgTransport.java */
/* renamed from: com.google.firebase.perf.i.h */
/* loaded from: classes2.dex */
public final class C6619h {

    /* renamed from: d */
    private static final C6609a f15941d = C6609a.m21475e();

    /* renamed from: a */
    private final String f15942a;

    /* renamed from: b */
    private final InterfaceC6560b<InterfaceC8241g> f15943b;

    /* renamed from: c */
    private InterfaceC8240f<C6671i> f15944c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6619h(InterfaceC6560b<InterfaceC8241g> interfaceC6560b, String str) {
        this.f15942a = str;
        this.f15943b = interfaceC6560b;
    }

    /* renamed from: a */
    private boolean m21460a() {
        if (this.f15944c == null) {
            InterfaceC8241g interfaceC8241g = this.f15943b.get();
            if (interfaceC8241g != null) {
                this.f15944c = interfaceC8241g.mo16231b(this.f15942a, C6671i.class, C8236b.m16444b("proto"), C6612a.f15927a);
            } else {
                f15941d.m21471i("Flg TransportFactory is not available at the moment");
            }
        }
        return this.f15944c != null;
    }

    /* renamed from: b */
    public void m21459b(C6671i c6671i) {
        if (!m21460a()) {
            f15941d.m21471i("Unable to dispatch event because Flg Transport is not available");
        } else {
            this.f15944c.mo16230a(AbstractC8237c.m16440d(c6671i));
        }
    }
}
