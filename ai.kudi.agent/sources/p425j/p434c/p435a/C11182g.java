package p425j.p434c.p435a;

import p425j.p434c.p435a.p436u.C11228c;
import p425j.p434c.p435a.p439v.AbstractC11252a;
import p425j.p434c.p435a.p439v.AbstractC11255d;
import p425j.p434c.p435a.p439v.C11256e;
import p425j.p434c.p435a.p439v.p440f.AbstractC11257a;
import p425j.p434c.p435a.p441w.C11261b;
import p425j.p434c.p435a.p441w.InterfaceC11260a;
/* compiled from: MarkwonConfiguration.java */
/* renamed from: j.c.a.g */
/* loaded from: classes3.dex */
public class C11182g {

    /* renamed from: a */
    private final C11228c f25261a;

    /* renamed from: b */
    private final InterfaceC11260a f25262b;

    /* renamed from: c */
    private final InterfaceC11176c f25263c;

    /* renamed from: d */
    private final AbstractC11257a f25264d;

    /* renamed from: e */
    private final InterfaceC11189j f25265e;

    /* compiled from: MarkwonConfiguration.java */
    /* renamed from: j.c.a.g$b */
    /* loaded from: classes3.dex */
    public static class C11184b {

        /* renamed from: a */
        private C11228c f25266a;

        /* renamed from: b */
        private AbstractC11252a f25267b;

        /* renamed from: c */
        private InterfaceC11260a f25268c;

        /* renamed from: d */
        private InterfaceC11176c f25269d;

        /* renamed from: e */
        private AbstractC11257a f25270e;

        /* renamed from: f */
        private AbstractC11255d f25271f;

        /* renamed from: g */
        private InterfaceC11189j f25272g;

        /* renamed from: h */
        public C11182g m11430h(C11228c c11228c, InterfaceC11189j interfaceC11189j) {
            this.f25266a = c11228c;
            this.f25272g = interfaceC11189j;
            if (this.f25267b == null) {
                this.f25267b = AbstractC11252a.m11276a();
            }
            if (this.f25268c == null) {
                this.f25268c = new C11261b();
            }
            if (this.f25269d == null) {
                this.f25269d = new C11177d();
            }
            if (this.f25270e == null) {
                this.f25270e = AbstractC11257a.m11275a();
            }
            if (this.f25271f == null) {
                this.f25271f = new C11256e();
            }
            return new C11182g(this);
        }
    }

    /* renamed from: a */
    public AbstractC11257a m11442a() {
        return this.f25264d;
    }

    /* renamed from: b */
    public InterfaceC11176c m11441b() {
        return this.f25263c;
    }

    /* renamed from: c */
    public InterfaceC11189j m11440c() {
        return this.f25265e;
    }

    /* renamed from: d */
    public InterfaceC11260a m11439d() {
        return this.f25262b;
    }

    /* renamed from: e */
    public C11228c m11438e() {
        return this.f25261a;
    }

    private C11182g(C11184b c11184b) {
        this.f25261a = c11184b.f25266a;
        AbstractC11252a unused = c11184b.f25267b;
        this.f25262b = c11184b.f25268c;
        this.f25263c = c11184b.f25269d;
        this.f25264d = c11184b.f25270e;
        AbstractC11255d unused2 = c11184b.f25271f;
        this.f25265e = c11184b.f25272g;
    }
}
