package p565l.p566g0.p567e;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import p565l.C14116a0;
import p565l.C14131c0;
import p565l.C14133d;
import p565l.C14229s;
import p565l.p566g0.AbstractC14146a;
import p565l.p566g0.p568f.C14170d;
import p565l.p566g0.p568f.C14172e;
/* compiled from: CacheStrategy.java */
/* renamed from: l.g0.e.c */
/* loaded from: classes3.dex */
public final class C14155c {

    /* renamed from: a */
    public final C14116a0 f30929a;

    /* renamed from: b */
    public final C14131c0 f30930b;

    /* compiled from: CacheStrategy.java */
    /* renamed from: l.g0.e.c$a */
    /* loaded from: classes3.dex */
    public static class C14156a {

        /* renamed from: a */
        final long f30931a;

        /* renamed from: b */
        final C14116a0 f30932b;

        /* renamed from: c */
        final C14131c0 f30933c;

        /* renamed from: d */
        private Date f30934d;

        /* renamed from: e */
        private String f30935e;

        /* renamed from: f */
        private Date f30936f;

        /* renamed from: g */
        private String f30937g;

        /* renamed from: h */
        private Date f30938h;

        /* renamed from: i */
        private long f30939i;

        /* renamed from: j */
        private long f30940j;

        /* renamed from: k */
        private String f30941k;

        /* renamed from: l */
        private int f30942l;

        public C14156a(long j, C14116a0 c14116a0, C14131c0 c14131c0) {
            this.f30942l = -1;
            this.f30931a = j;
            this.f30932b = c14116a0;
            this.f30933c = c14131c0;
            if (c14131c0 != null) {
                this.f30939i = c14131c0.m2871o0();
                this.f30940j = c14131c0.m2874i0();
                C14229s m2883P = c14131c0.m2883P();
                int m2545h = m2883P.m2545h();
                for (int i = 0; i < m2545h; i++) {
                    String m2548e = m2883P.m2548e(i);
                    String m2544i = m2883P.m2544i(i);
                    if ("Date".equalsIgnoreCase(m2548e)) {
                        this.f30934d = C14170d.m2731b(m2544i);
                        this.f30935e = m2544i;
                    } else if ("Expires".equalsIgnoreCase(m2548e)) {
                        this.f30938h = C14170d.m2731b(m2544i);
                    } else if ("Last-Modified".equalsIgnoreCase(m2548e)) {
                        this.f30936f = C14170d.m2731b(m2544i);
                        this.f30937g = m2544i;
                    } else if ("ETag".equalsIgnoreCase(m2548e)) {
                        this.f30941k = m2544i;
                    } else if ("Age".equalsIgnoreCase(m2548e)) {
                        this.f30942l = C14172e.m2724f(m2544i, -1);
                    }
                }
            }
        }

        /* renamed from: a */
        private long m2773a() {
            Date date = this.f30934d;
            long max = date != null ? Math.max(0L, this.f30940j - date.getTime()) : 0L;
            int i = this.f30942l;
            if (i != -1) {
                max = Math.max(max, TimeUnit.SECONDS.toMillis(i));
            }
            long j = this.f30940j;
            return max + (j - this.f30939i) + (this.f30931a - j);
        }

        /* renamed from: b */
        private long m2772b() {
            long j;
            long j2;
            C14133d m2876g = this.f30933c.m2876g();
            if (m2876g.m2850d() != -1) {
                return TimeUnit.SECONDS.toMillis(m2876g.m2850d());
            }
            if (this.f30938h != null) {
                Date date = this.f30934d;
                if (date != null) {
                    j2 = date.getTime();
                } else {
                    j2 = this.f30940j;
                }
                long time = this.f30938h.getTime() - j2;
                if (time > 0) {
                    return time;
                }
                return 0L;
            } else if (this.f30936f == null || this.f30933c.m2873k0().m2913i().m2535A() != null) {
                return 0L;
            } else {
                Date date2 = this.f30934d;
                if (date2 != null) {
                    j = date2.getTime();
                } else {
                    j = this.f30939i;
                }
                long time2 = j - this.f30936f.getTime();
                if (time2 > 0) {
                    return time2 / 10;
                }
                return 0L;
            }
        }

        /* renamed from: d */
        private C14155c m2770d() {
            if (this.f30933c == null) {
                return new C14155c(this.f30932b, null);
            }
            if (this.f30932b.m2916f() && this.f30933c.m2886I() == null) {
                return new C14155c(this.f30932b, null);
            }
            if (!C14155c.m2774a(this.f30933c, this.f30932b)) {
                return new C14155c(this.f30932b, null);
            }
            C14133d m2920b = this.f30932b.m2920b();
            if (!m2920b.m2846h() && !m2769e(this.f30932b)) {
                C14133d m2876g = this.f30933c.m2876g();
                long m2773a = m2773a();
                long m2772b = m2772b();
                if (m2920b.m2850d() != -1) {
                    m2772b = Math.min(m2772b, TimeUnit.SECONDS.toMillis(m2920b.m2850d()));
                }
                long j = 0;
                long millis = m2920b.m2848f() != -1 ? TimeUnit.SECONDS.toMillis(m2920b.m2848f()) : 0L;
                if (!m2876g.m2847g() && m2920b.m2849e() != -1) {
                    j = TimeUnit.SECONDS.toMillis(m2920b.m2849e());
                }
                if (!m2876g.m2846h()) {
                    long j2 = millis + m2773a;
                    if (j2 < j + m2772b) {
                        C14131c0.C14132a m2879b0 = this.f30933c.m2879b0();
                        if (j2 >= m2772b) {
                            m2879b0.m2870a("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (m2773a > 86400000 && m2768f()) {
                            m2879b0.m2870a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new C14155c(null, m2879b0.m2868c());
                    }
                }
                String str = this.f30941k;
                String str2 = "If-Modified-Since";
                if (str != null) {
                    str2 = "If-None-Match";
                } else if (this.f30936f != null) {
                    str = this.f30937g;
                } else if (this.f30934d != null) {
                    str = this.f30935e;
                } else {
                    return new C14155c(this.f30932b, null);
                }
                C14229s.C14230a m2547f = this.f30932b.m2917e().m2547f();
                AbstractC14146a.f30903a.mo2434b(m2547f, str2, str);
                C14116a0.C14117a m2914h = this.f30932b.m2914h();
                m2914h.m2908e(m2547f.m2539d());
                return new C14155c(m2914h.m2911b(), this.f30933c);
            }
            return new C14155c(this.f30932b, null);
        }

        /* renamed from: e */
        private static boolean m2769e(C14116a0 c14116a0) {
            return (c14116a0.m2919c("If-Modified-Since") == null && c14116a0.m2919c("If-None-Match") == null) ? false : true;
        }

        /* renamed from: f */
        private boolean m2768f() {
            return this.f30933c.m2876g().m2850d() == -1 && this.f30938h == null;
        }

        /* renamed from: c */
        public C14155c m2771c() {
            C14155c m2770d = m2770d();
            return (m2770d.f30929a == null || !this.f30932b.m2920b().m2844j()) ? m2770d : new C14155c(null, null);
        }
    }

    C14155c(C14116a0 c14116a0, C14131c0 c14131c0) {
        this.f30929a = c14116a0;
        this.f30930b = c14131c0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
        if (r3.m2876g().m2852b() == false) goto L22;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m2774a(p565l.C14131c0 r3, p565l.C14116a0 r4) {
        /*
            int r0 = r3.m2887F()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L5a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L5a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L5a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L5a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L5a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L5a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L31
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L5a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L5a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L5a
            switch(r0) {
                case 300: goto L5a;
                case 301: goto L5a;
                case 302: goto L31;
                default: goto L30;
            }
        L30:
            goto L59
        L31:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.m2885J(r0)
            if (r0 != 0) goto L5a
            l.d r0 = r3.m2876g()
            int r0 = r0.m2850d()
            r1 = -1
            if (r0 != r1) goto L5a
            l.d r0 = r3.m2876g()
            boolean r0 = r0.m2851c()
            if (r0 != 0) goto L5a
            l.d r0 = r3.m2876g()
            boolean r0 = r0.m2852b()
            if (r0 == 0) goto L59
            goto L5a
        L59:
            return r2
        L5a:
            l.d r3 = r3.m2876g()
            boolean r3 = r3.m2845i()
            if (r3 != 0) goto L6f
            l.d r3 = r4.m2920b()
            boolean r3 = r3.m2845i()
            if (r3 != 0) goto L6f
            r2 = 1
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p565l.p566g0.p567e.C14155c.m2774a(l.c0, l.a0):boolean");
    }
}
