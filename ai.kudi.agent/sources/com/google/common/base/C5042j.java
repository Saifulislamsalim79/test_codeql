package com.google.common.base;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: MoreObjects.java */
/* renamed from: com.google.common.base.j */
/* loaded from: classes2.dex */
public final class C5042j {

    /* compiled from: MoreObjects.java */
    /* renamed from: com.google.common.base.j$b */
    /* loaded from: classes2.dex */
    public static final class C5044b {

        /* renamed from: e */
        private static boolean f12690e;

        /* renamed from: a */
        private final String f12691a;

        /* renamed from: b */
        private final C5045a f12692b;

        /* renamed from: c */
        private C5045a f12693c;

        /* renamed from: d */
        private boolean f12694d;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: MoreObjects.java */
        /* renamed from: com.google.common.base.j$b$a */
        /* loaded from: classes2.dex */
        public static final class C5045a {

            /* renamed from: a */
            String f12695a;

            /* renamed from: b */
            Object f12696b;

            /* renamed from: c */
            C5045a f12697c;

            private C5045a() {
            }
        }

        /* renamed from: f */
        private C5045a m25806f() {
            C5045a c5045a = new C5045a();
            this.f12693c.f12697c = c5045a;
            this.f12693c = c5045a;
            return c5045a;
        }

        /* renamed from: g */
        private C5044b m25805g(Object obj) {
            m25806f().f12696b = obj;
            return this;
        }

        /* renamed from: h */
        private C5044b m25804h(String str, Object obj) {
            C5045a m25806f = m25806f();
            m25806f.f12696b = obj;
            C5051n.m25780n(str);
            m25806f.f12695a = str;
            return this;
        }

        /* renamed from: j */
        private static void m25802j() {
            if (f12690e) {
                return;
            }
            synchronized (C5044b.class) {
                if (f12690e) {
                    return;
                }
                f12690e = true;
                try {
                    C5040h.m25821b();
                } catch (Throwable th) {
                    Logger.getLogger(C5044b.class.getName()).log(Level.WARNING, "Java 7 compatibility warning: See https://github.com/google/guava/issues/5269", (Throwable) new Exception("Guava will drop support for Java 7 in 2021. Please let us know if this will cause you problems: https://github.com/google/guava/issues/5269", th));
                }
            }
        }

        /* renamed from: a */
        public C5044b m25811a(String str, double d) {
            m25804h(str, String.valueOf(d));
            return this;
        }

        /* renamed from: b */
        public C5044b m25810b(String str, int i) {
            m25804h(str, String.valueOf(i));
            return this;
        }

        /* renamed from: c */
        public C5044b m25809c(String str, long j) {
            m25804h(str, String.valueOf(j));
            return this;
        }

        /* renamed from: d */
        public C5044b m25808d(String str, Object obj) {
            m25804h(str, obj);
            return this;
        }

        /* renamed from: e */
        public C5044b m25807e(String str, boolean z) {
            m25804h(str, String.valueOf(z));
            return this;
        }

        /* renamed from: i */
        public C5044b m25803i(Object obj) {
            m25805g(obj);
            return this;
        }

        /* renamed from: k */
        public C5044b m25801k() {
            this.f12694d = true;
            return this;
        }

        public String toString() {
            boolean z = this.f12694d;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f12691a);
            sb.append('{');
            String str = "";
            for (C5045a c5045a = this.f12692b.f12697c; c5045a != null; c5045a = c5045a.f12697c) {
                Object obj = c5045a.f12696b;
                if (!z || obj != null) {
                    sb.append(str);
                    String str2 = c5045a.f12695a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj != null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb.append(obj);
                    }
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }

        private C5044b(String str) {
            C5045a c5045a = new C5045a();
            this.f12692b = c5045a;
            this.f12693c = c5045a;
            this.f12694d = false;
            m25802j();
            C5051n.m25780n(str);
            this.f12691a = str;
        }
    }

    /* renamed from: a */
    public static <T> T m25814a(T t, T t2) {
        if (t != null) {
            return t;
        }
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    /* renamed from: b */
    public static C5044b m25813b(Class<?> cls) {
        return new C5044b(cls.getSimpleName());
    }

    /* renamed from: c */
    public static C5044b m25812c(Object obj) {
        return new C5044b(obj.getClass().getSimpleName());
    }
}
