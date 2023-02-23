package p565l.p566g0.p568f;

import p565l.AbstractC14135d0;
import p565l.C14235v;
import p576m.InterfaceC14346e;
/* compiled from: RealResponseBody.java */
/* renamed from: l.g0.f.h */
/* loaded from: classes3.dex */
public final class C14175h extends AbstractC14135d0 {

    /* renamed from: d */
    private final String f31002d;

    /* renamed from: e */
    private final long f31003e;

    /* renamed from: f */
    private final InterfaceC14346e f31004f;

    public C14175h(String str, long j, InterfaceC14346e interfaceC14346e) {
        this.f31002d = str;
        this.f31003e = j;
        this.f31004f = interfaceC14346e;
    }

    @Override // p565l.AbstractC14135d0
    /* renamed from: F */
    public C14235v mo311F() {
        String str = this.f31002d;
        if (str != null) {
            return C14235v.m2474d(str);
        }
        return null;
    }

    @Override // p565l.AbstractC14135d0
    /* renamed from: O */
    public InterfaceC14346e mo310O() {
        return this.f31004f;
    }

    @Override // p565l.AbstractC14135d0
    /* renamed from: m */
    public long mo309m() {
        return this.f31003e;
    }
}
