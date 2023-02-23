package com.google.common.base;
/* compiled from: CharMatcher.java */
/* renamed from: com.google.common.base.c */
/* loaded from: classes2.dex */
public abstract class AbstractC5028c {

    /* compiled from: CharMatcher.java */
    /* renamed from: com.google.common.base.c$a */
    /* loaded from: classes2.dex */
    static abstract class AbstractC5029a extends AbstractC5028c {
        AbstractC5029a() {
        }
    }

    /* compiled from: CharMatcher.java */
    /* renamed from: com.google.common.base.c$b */
    /* loaded from: classes2.dex */
    private static final class C5030b extends AbstractC5029a {

        /* renamed from: a */
        private final char f12681a;

        C5030b(char c) {
            this.f12681a = c;
        }

        public String toString() {
            String m25830d = AbstractC5028c.m25830d(this.f12681a);
            StringBuilder sb = new StringBuilder(String.valueOf(m25830d).length() + 18);
            sb.append("CharMatcher.is('");
            sb.append(m25830d);
            sb.append("')");
            return sb.toString();
        }
    }

    /* compiled from: CharMatcher.java */
    /* renamed from: com.google.common.base.c$c */
    /* loaded from: classes2.dex */
    static abstract class AbstractC5031c extends AbstractC5029a {

        /* renamed from: a */
        private final String f12682a;

        AbstractC5031c(String str) {
            C5051n.m25780n(str);
            this.f12682a = str;
        }

        public final String toString() {
            return this.f12682a;
        }
    }

    /* compiled from: CharMatcher.java */
    /* renamed from: com.google.common.base.c$d */
    /* loaded from: classes2.dex */
    private static final class C5032d extends AbstractC5031c {

        /* renamed from: b */
        static final C5032d f12683b = new C5032d();

        private C5032d() {
            super("CharMatcher.none()");
        }
    }

    /* compiled from: CharMatcher.java */
    /* renamed from: com.google.common.base.c$e */
    /* loaded from: classes2.dex */
    static final class C5033e extends AbstractC5031c {

        /* renamed from: b */
        static final C5033e f12684b;

        static {
            Integer.numberOfLeadingZeros(31);
            f12684b = new C5033e();
        }

        C5033e() {
            super("CharMatcher.whitespace()");
        }
    }

    protected AbstractC5028c() {
    }

    /* renamed from: b */
    public static AbstractC5028c m25832b(char c) {
        return new C5030b(c);
    }

    /* renamed from: c */
    public static AbstractC5028c m25831c() {
        return C5032d.f12683b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static String m25830d(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    /* renamed from: e */
    public static AbstractC5028c m25829e() {
        return C5033e.f12684b;
    }
}
