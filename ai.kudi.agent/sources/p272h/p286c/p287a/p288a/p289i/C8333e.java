package p272h.p286c.p287a.p288a.p289i;

import java.util.Arrays;
import p272h.p286c.p287a.p288a.EnumC8238d;
import p272h.p286c.p287a.p288a.p289i.AbstractC8352p;
/* compiled from: AutoValue_TransportContext.java */
/* renamed from: h.c.a.a.i.e */
/* loaded from: classes2.dex */
final class C8333e extends AbstractC8352p {

    /* renamed from: a */
    private final String f19975a;

    /* renamed from: b */
    private final byte[] f19976b;

    /* renamed from: c */
    private final EnumC8238d f19977c;

    /* compiled from: AutoValue_TransportContext.java */
    /* renamed from: h.c.a.a.i.e$b */
    /* loaded from: classes2.dex */
    static final class C8335b extends AbstractC8352p.AbstractC8353a {

        /* renamed from: a */
        private String f19978a;

        /* renamed from: b */
        private byte[] f19979b;

        /* renamed from: c */
        private EnumC8238d f19980c;

        @Override // p272h.p286c.p287a.p288a.p289i.AbstractC8352p.AbstractC8353a
        /* renamed from: a */
        public AbstractC8352p mo16236a() {
            String str = "";
            if (this.f19978a == null) {
                str = " backendName";
            }
            if (this.f19980c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new C8333e(this.f19978a, this.f19979b, this.f19980c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p272h.p286c.p287a.p288a.p289i.AbstractC8352p.AbstractC8353a
        /* renamed from: b */
        public AbstractC8352p.AbstractC8353a mo16235b(String str) {
            if (str != null) {
                this.f19978a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        @Override // p272h.p286c.p287a.p288a.p289i.AbstractC8352p.AbstractC8353a
        /* renamed from: c */
        public AbstractC8352p.AbstractC8353a mo16234c(byte[] bArr) {
            this.f19979b = bArr;
            return this;
        }

        @Override // p272h.p286c.p287a.p288a.p289i.AbstractC8352p.AbstractC8353a
        /* renamed from: d */
        public AbstractC8352p.AbstractC8353a mo16233d(EnumC8238d enumC8238d) {
            if (enumC8238d != null) {
                this.f19980c = enumC8238d;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    @Override // p272h.p286c.p287a.p288a.p289i.AbstractC8352p
    /* renamed from: b */
    public String mo16241b() {
        return this.f19975a;
    }

    @Override // p272h.p286c.p287a.p288a.p289i.AbstractC8352p
    /* renamed from: c */
    public byte[] mo16240c() {
        return this.f19976b;
    }

    @Override // p272h.p286c.p287a.p288a.p289i.AbstractC8352p
    /* renamed from: d */
    public EnumC8238d mo16239d() {
        return this.f19977c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8352p) {
            AbstractC8352p abstractC8352p = (AbstractC8352p) obj;
            if (this.f19975a.equals(abstractC8352p.mo16241b())) {
                if (Arrays.equals(this.f19976b, abstractC8352p instanceof C8333e ? ((C8333e) abstractC8352p).f19976b : abstractC8352p.mo16240c()) && this.f19977c.equals(abstractC8352p.mo16239d())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f19975a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f19976b)) * 1000003) ^ this.f19977c.hashCode();
    }

    private C8333e(String str, byte[] bArr, EnumC8238d enumC8238d) {
        this.f19975a = str;
        this.f19976b = bArr;
        this.f19977c = enumC8238d;
    }
}
