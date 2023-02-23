package p565l;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p565l.C14229s;
import p565l.p566g0.C14148c;
import p565l.p566g0.p568f.C14173f;
/* compiled from: Request.java */
/* renamed from: l.a0 */
/* loaded from: classes3.dex */
public final class C14116a0 {

    /* renamed from: a */
    final C14231t f30778a;

    /* renamed from: b */
    final String f30779b;

    /* renamed from: c */
    final C14229s f30780c;

    /* renamed from: d */
    final AbstractC14120b0 f30781d;

    /* renamed from: e */
    final Map<Class<?>, Object> f30782e;

    /* renamed from: f */
    private volatile C14133d f30783f;

    C14116a0(C14117a c14117a) {
        this.f30778a = c14117a.f30784a;
        this.f30779b = c14117a.f30785b;
        this.f30780c = c14117a.f30786c.m2539d();
        this.f30781d = c14117a.f30787d;
        this.f30782e = C14148c.m2786v(c14117a.f30788e);
    }

    /* renamed from: a */
    public AbstractC14120b0 m2921a() {
        return this.f30781d;
    }

    /* renamed from: b */
    public C14133d m2920b() {
        C14133d c14133d = this.f30783f;
        if (c14133d != null) {
            return c14133d;
        }
        C14133d m2843k = C14133d.m2843k(this.f30780c);
        this.f30783f = m2843k;
        return m2843k;
    }

    /* renamed from: c */
    public String m2919c(String str) {
        return this.f30780c.m2550c(str);
    }

    /* renamed from: d */
    public List<String> m2918d(String str) {
        return this.f30780c.m2543j(str);
    }

    /* renamed from: e */
    public C14229s m2917e() {
        return this.f30780c;
    }

    /* renamed from: f */
    public boolean m2916f() {
        return this.f30778a.m2515n();
    }

    /* renamed from: g */
    public String m2915g() {
        return this.f30779b;
    }

    /* renamed from: h */
    public C14117a m2914h() {
        return new C14117a(this);
    }

    /* renamed from: i */
    public C14231t m2913i() {
        return this.f30778a;
    }

    public String toString() {
        return "Request{method=" + this.f30779b + ", url=" + this.f30778a + ", tags=" + this.f30782e + '}';
    }

    /* compiled from: Request.java */
    /* renamed from: l.a0$a */
    /* loaded from: classes3.dex */
    public static class C14117a {

        /* renamed from: a */
        C14231t f30784a;

        /* renamed from: b */
        String f30785b;

        /* renamed from: c */
        C14229s.C14230a f30786c;

        /* renamed from: d */
        AbstractC14120b0 f30787d;

        /* renamed from: e */
        Map<Class<?>, Object> f30788e;

        public C14117a() {
            this.f30788e = Collections.emptyMap();
            this.f30785b = "GET";
            this.f30786c = new C14229s.C14230a();
        }

        /* renamed from: a */
        public C14117a m2912a(String str, String str2) {
            this.f30786c.m2542a(str, str2);
            return this;
        }

        /* renamed from: b */
        public C14116a0 m2911b() {
            if (this.f30784a != null) {
                return new C14116a0(this);
            }
            throw new IllegalStateException("url == null");
        }

        /* renamed from: c */
        public C14117a m2910c(C14133d c14133d) {
            String c14133d2 = c14133d.toString();
            if (c14133d2.isEmpty()) {
                m2906g("Cache-Control");
                return this;
            }
            m2909d("Cache-Control", c14133d2);
            return this;
        }

        /* renamed from: d */
        public C14117a m2909d(String str, String str2) {
            this.f30786c.m2536g(str, str2);
            return this;
        }

        /* renamed from: e */
        public C14117a m2908e(C14229s c14229s) {
            this.f30786c = c14229s.m2547f();
            return this;
        }

        /* renamed from: f */
        public C14117a m2907f(String str, AbstractC14120b0 abstractC14120b0) {
            if (str != null) {
                if (str.length() != 0) {
                    if (abstractC14120b0 != null && !C14173f.m2713b(str)) {
                        throw new IllegalArgumentException("method " + str + " must not have a request body.");
                    } else if (abstractC14120b0 == null && C14173f.m2710e(str)) {
                        throw new IllegalArgumentException("method " + str + " must have a request body.");
                    } else {
                        this.f30785b = str;
                        this.f30787d = abstractC14120b0;
                        return this;
                    }
                }
                throw new IllegalArgumentException("method.length() == 0");
            }
            throw new NullPointerException("method == null");
        }

        /* renamed from: g */
        public C14117a m2906g(String str) {
            this.f30786c.m2537f(str);
            return this;
        }

        /* renamed from: h */
        public C14117a m2905h(String str) {
            if (str != null) {
                if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                    str = "http:" + str.substring(3);
                } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                    str = "https:" + str.substring(4);
                }
                m2904i(C14231t.m2517l(str));
                return this;
            }
            throw new NullPointerException("url == null");
        }

        /* renamed from: i */
        public C14117a m2904i(C14231t c14231t) {
            if (c14231t != null) {
                this.f30784a = c14231t;
                return this;
            }
            throw new NullPointerException("url == null");
        }

        C14117a(C14116a0 c14116a0) {
            Map<Class<?>, Object> linkedHashMap;
            this.f30788e = Collections.emptyMap();
            this.f30784a = c14116a0.f30778a;
            this.f30785b = c14116a0.f30779b;
            this.f30787d = c14116a0.f30781d;
            if (c14116a0.f30782e.isEmpty()) {
                linkedHashMap = Collections.emptyMap();
            } else {
                linkedHashMap = new LinkedHashMap<>(c14116a0.f30782e);
            }
            this.f30788e = linkedHashMap;
            this.f30786c = c14116a0.f30780c.m2547f();
        }
    }
}
