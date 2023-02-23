package com.google.protobuf;
/* compiled from: LazyFieldLite.java */
/* renamed from: com.google.protobuf.e0 */
/* loaded from: classes2.dex */
public class C7023e0 {

    /* renamed from: a */
    private AbstractC7039i f16789a;

    /* renamed from: b */
    private C7089p f16790b;

    /* renamed from: c */
    protected volatile InterfaceC7100r0 f16791c;

    /* renamed from: d */
    private volatile AbstractC7039i f16792d;

    static {
        C7089p.m19769b();
    }

    /* renamed from: a */
    protected void m20167a(InterfaceC7100r0 interfaceC7100r0) {
        if (this.f16791c != null) {
            return;
        }
        synchronized (this) {
            if (this.f16791c != null) {
                return;
            }
            try {
                if (this.f16789a != null) {
                    this.f16791c = interfaceC7100r0.mo19377g().parseFrom(this.f16789a, this.f16790b);
                    this.f16792d = this.f16789a;
                } else {
                    this.f16791c = interfaceC7100r0;
                    this.f16792d = AbstractC7039i.f16815d;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.f16791c = interfaceC7100r0;
                this.f16792d = AbstractC7039i.f16815d;
            }
        }
    }

    /* renamed from: b */
    public int m20166b() {
        if (this.f16792d != null) {
            return this.f16792d.size();
        }
        AbstractC7039i abstractC7039i = this.f16789a;
        if (abstractC7039i != null) {
            return abstractC7039i.size();
        }
        if (this.f16791c != null) {
            return this.f16791c.mo19378d();
        }
        return 0;
    }

    /* renamed from: c */
    public InterfaceC7100r0 m20165c(InterfaceC7100r0 interfaceC7100r0) {
        m20167a(interfaceC7100r0);
        return this.f16791c;
    }

    /* renamed from: d */
    public InterfaceC7100r0 m20164d(InterfaceC7100r0 interfaceC7100r0) {
        InterfaceC7100r0 interfaceC7100r02 = this.f16791c;
        this.f16789a = null;
        this.f16792d = null;
        this.f16791c = interfaceC7100r0;
        return interfaceC7100r02;
    }

    /* renamed from: e */
    public AbstractC7039i m20163e() {
        if (this.f16792d != null) {
            return this.f16792d;
        }
        AbstractC7039i abstractC7039i = this.f16789a;
        if (abstractC7039i != null) {
            return abstractC7039i;
        }
        synchronized (this) {
            if (this.f16792d != null) {
                return this.f16792d;
            }
            if (this.f16791c == null) {
                this.f16792d = AbstractC7039i.f16815d;
            } else {
                this.f16792d = this.f16791c.mo19708n();
            }
            return this.f16792d;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7023e0) {
            C7023e0 c7023e0 = (C7023e0) obj;
            InterfaceC7100r0 interfaceC7100r0 = this.f16791c;
            InterfaceC7100r0 interfaceC7100r02 = c7023e0.f16791c;
            if (interfaceC7100r0 == null && interfaceC7100r02 == null) {
                return m20163e().equals(c7023e0.m20163e());
            }
            if (interfaceC7100r0 == null || interfaceC7100r02 == null) {
                if (interfaceC7100r0 != null) {
                    return interfaceC7100r0.equals(c7023e0.m20165c(interfaceC7100r0.mo19354a()));
                }
                return m20165c(interfaceC7100r02.mo19354a()).equals(interfaceC7100r02);
            }
            return interfaceC7100r0.equals(interfaceC7100r02);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }
}
