package p272h.p286c.p287a.p288a.p289i;

import p272h.p286c.p287a.p288a.AbstractC8237c;
import p272h.p286c.p287a.p288a.C8236b;
import p272h.p286c.p287a.p288a.InterfaceC8239e;
import p272h.p286c.p287a.p288a.p289i.AbstractC8350o;
/* compiled from: AutoValue_SendRequest.java */
/* renamed from: h.c.a.a.i.d */
/* loaded from: classes2.dex */
final class C8330d extends AbstractC8350o {

    /* renamed from: a */
    private final AbstractC8352p f19965a;

    /* renamed from: b */
    private final String f19966b;

    /* renamed from: c */
    private final AbstractC8237c<?> f19967c;

    /* renamed from: d */
    private final InterfaceC8239e<?, byte[]> f19968d;

    /* renamed from: e */
    private final C8236b f19969e;

    /* compiled from: AutoValue_SendRequest.java */
    /* renamed from: h.c.a.a.i.d$b */
    /* loaded from: classes2.dex */
    static final class C8332b extends AbstractC8350o.AbstractC8351a {

        /* renamed from: a */
        private AbstractC8352p f19970a;

        /* renamed from: b */
        private String f19971b;

        /* renamed from: c */
        private AbstractC8237c<?> f19972c;

        /* renamed from: d */
        private InterfaceC8239e<?, byte[]> f19973d;

        /* renamed from: e */
        private C8236b f19974e;

        @Override // p272h.p286c.p287a.p288a.p289i.AbstractC8350o.AbstractC8351a
        /* renamed from: a */
        public AbstractC8350o mo16248a() {
            String str = "";
            if (this.f19970a == null) {
                str = " transportContext";
            }
            if (this.f19971b == null) {
                str = str + " transportName";
            }
            if (this.f19972c == null) {
                str = str + " event";
            }
            if (this.f19973d == null) {
                str = str + " transformer";
            }
            if (this.f19974e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C8330d(this.f19970a, this.f19971b, this.f19972c, this.f19973d, this.f19974e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p272h.p286c.p287a.p288a.p289i.AbstractC8350o.AbstractC8351a
        /* renamed from: b */
        AbstractC8350o.AbstractC8351a mo16247b(C8236b c8236b) {
            if (c8236b != null) {
                this.f19974e = c8236b;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        @Override // p272h.p286c.p287a.p288a.p289i.AbstractC8350o.AbstractC8351a
        /* renamed from: c */
        AbstractC8350o.AbstractC8351a mo16246c(AbstractC8237c<?> abstractC8237c) {
            if (abstractC8237c != null) {
                this.f19972c = abstractC8237c;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        @Override // p272h.p286c.p287a.p288a.p289i.AbstractC8350o.AbstractC8351a
        /* renamed from: d */
        AbstractC8350o.AbstractC8351a mo16245d(InterfaceC8239e<?, byte[]> interfaceC8239e) {
            if (interfaceC8239e != null) {
                this.f19973d = interfaceC8239e;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        @Override // p272h.p286c.p287a.p288a.p289i.AbstractC8350o.AbstractC8351a
        /* renamed from: e */
        public AbstractC8350o.AbstractC8351a mo16244e(AbstractC8352p abstractC8352p) {
            if (abstractC8352p != null) {
                this.f19970a = abstractC8352p;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        @Override // p272h.p286c.p287a.p288a.p289i.AbstractC8350o.AbstractC8351a
        /* renamed from: f */
        public AbstractC8350o.AbstractC8351a mo16243f(String str) {
            if (str != null) {
                this.f19971b = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    @Override // p272h.p286c.p287a.p288a.p289i.AbstractC8350o
    /* renamed from: b */
    public C8236b mo16254b() {
        return this.f19969e;
    }

    @Override // p272h.p286c.p287a.p288a.p289i.AbstractC8350o
    /* renamed from: c */
    AbstractC8237c<?> mo16253c() {
        return this.f19967c;
    }

    @Override // p272h.p286c.p287a.p288a.p289i.AbstractC8350o
    /* renamed from: e */
    InterfaceC8239e<?, byte[]> mo16251e() {
        return this.f19968d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8350o) {
            AbstractC8350o abstractC8350o = (AbstractC8350o) obj;
            return this.f19965a.equals(abstractC8350o.mo16250f()) && this.f19966b.equals(abstractC8350o.mo16249g()) && this.f19967c.equals(abstractC8350o.mo16253c()) && this.f19968d.equals(abstractC8350o.mo16251e()) && this.f19969e.equals(abstractC8350o.mo16254b());
        }
        return false;
    }

    @Override // p272h.p286c.p287a.p288a.p289i.AbstractC8350o
    /* renamed from: f */
    public AbstractC8352p mo16250f() {
        return this.f19965a;
    }

    @Override // p272h.p286c.p287a.p288a.p289i.AbstractC8350o
    /* renamed from: g */
    public String mo16249g() {
        return this.f19966b;
    }

    public int hashCode() {
        return ((((((((this.f19965a.hashCode() ^ 1000003) * 1000003) ^ this.f19966b.hashCode()) * 1000003) ^ this.f19967c.hashCode()) * 1000003) ^ this.f19968d.hashCode()) * 1000003) ^ this.f19969e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f19965a + ", transportName=" + this.f19966b + ", event=" + this.f19967c + ", transformer=" + this.f19968d + ", encoding=" + this.f19969e + "}";
    }

    private C8330d(AbstractC8352p abstractC8352p, String str, AbstractC8237c<?> abstractC8237c, InterfaceC8239e<?, byte[]> interfaceC8239e, C8236b c8236b) {
        this.f19965a = abstractC8352p;
        this.f19966b = str;
        this.f19967c = abstractC8237c;
        this.f19968d = interfaceC8239e;
        this.f19969e = c8236b;
    }
}
