package p272h.p380h.p381a;

import p272h.p380h.p381a.C9452b;
/* compiled from: Request.java */
/* renamed from: h.h.a.e */
/* loaded from: classes2.dex */
public final class C9459e {

    /* renamed from: a */
    private final C9455c f22131a;

    /* renamed from: b */
    private final String f22132b;

    /* renamed from: c */
    private final C9452b f22133c;

    /* renamed from: d */
    private final Object f22134d;

    /* compiled from: Request.java */
    /* renamed from: h.h.a.e$b */
    /* loaded from: classes2.dex */
    public static class C9461b {

        /* renamed from: a */
        private C9455c f22135a;

        /* renamed from: b */
        private String f22136b = "GET";

        /* renamed from: c */
        private C9452b.C9454b f22137c = new C9452b.C9454b();

        /* renamed from: d */
        private AbstractC9462f f22138d;

        /* renamed from: e */
        private Object f22139e;

        /* renamed from: f */
        public C9459e m14665f() {
            if (this.f22135a != null) {
                return new C9459e(this);
            }
            throw new IllegalStateException("url == null");
        }

        /* renamed from: g */
        public C9461b m14664g(String str, String str2) {
            this.f22137c.m14694f(str, str2);
            return this;
        }

        /* renamed from: h */
        public C9461b m14663h(C9455c c9455c) {
            if (c9455c != null) {
                this.f22135a = c9455c;
                return this;
            }
            throw new IllegalArgumentException("url == null");
        }
    }

    /* renamed from: a */
    public C9452b m14672a() {
        return this.f22133c;
    }

    /* renamed from: b */
    public C9455c m14671b() {
        return this.f22131a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f22132b);
        sb.append(", url=");
        sb.append(this.f22131a);
        sb.append(", tag=");
        Object obj = this.f22134d;
        if (obj == this) {
            obj = null;
        }
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }

    private C9459e(C9461b c9461b) {
        this.f22131a = c9461b.f22135a;
        this.f22132b = c9461b.f22136b;
        this.f22133c = c9461b.f22137c.m14697c();
        AbstractC9462f unused = c9461b.f22138d;
        this.f22134d = c9461b.f22139e != null ? c9461b.f22139e : this;
    }
}
