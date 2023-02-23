package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
/* compiled from: LazyFieldLite.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.k */
/* loaded from: classes3.dex */
public class C13595k {

    /* renamed from: a */
    private AbstractC13570d f29980a;

    /* renamed from: b */
    private C13575f f29981b;

    /* renamed from: c */
    private volatile boolean f29982c;

    /* renamed from: d */
    protected volatile InterfaceC13601o f29983d;

    /* renamed from: a */
    protected void m4401a(InterfaceC13601o interfaceC13601o) {
        if (this.f29983d != null) {
            return;
        }
        synchronized (this) {
            if (this.f29983d != null) {
                return;
            }
            try {
                if (this.f29980a != null) {
                    this.f29983d = interfaceC13601o.mo4382g().mo4375d(this.f29980a, this.f29981b);
                } else {
                    this.f29983d = interfaceC13601o;
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public int m4400b() {
        if (this.f29982c) {
            return this.f29983d.mo4384d();
        }
        return this.f29980a.size();
    }

    /* renamed from: c */
    public InterfaceC13601o m4399c(InterfaceC13601o interfaceC13601o) {
        m4401a(interfaceC13601o);
        return this.f29983d;
    }

    /* renamed from: d */
    public InterfaceC13601o m4398d(InterfaceC13601o interfaceC13601o) {
        InterfaceC13601o interfaceC13601o2 = this.f29983d;
        this.f29983d = interfaceC13601o;
        this.f29980a = null;
        this.f29982c = true;
        return interfaceC13601o2;
    }
}
