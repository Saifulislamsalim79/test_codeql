package kotlin.p493j0.p494o.p495c.p497p0.p498b.p499p;

import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.C12059k;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
/* compiled from: FunctionClassKind.kt */
/* renamed from: kotlin.j0.o.c.p0.b.p.c */
/* loaded from: classes3.dex */
public enum EnumC12069c {
    Function(C12059k.f26808k, "Function", false, false),
    SuspendFunction(C12059k.f26801d, "SuspendFunction", true, false),
    KFunction(C12059k.f26806i, "KFunction", false, true),
    KSuspendFunction(C12059k.f26806i, "KSuspendFunction", true, true);
    

    /* renamed from: e */
    public static final C12070a f26909e = new C12070a(null);

    /* renamed from: c */
    private final C12609c f26915c;

    /* renamed from: d */
    private final String f26916d;

    /* compiled from: FunctionClassKind.kt */
    /* renamed from: kotlin.j0.o.c.p0.b.p.c$a */
    /* loaded from: classes3.dex */
    public static final class C12070a {

        /* compiled from: FunctionClassKind.kt */
        /* renamed from: kotlin.j0.o.c.p0.b.p.c$a$a */
        /* loaded from: classes3.dex */
        public static final class C12071a {

            /* renamed from: a */
            private final EnumC12069c f26917a;

            /* renamed from: b */
            private final int f26918b;

            public C12071a(EnumC12069c enumC12069c, int i) {
                l.f(enumC12069c, "kind");
                this.f26917a = enumC12069c;
                this.f26918b = i;
            }

            /* renamed from: a */
            public final EnumC12069c m9791a() {
                return this.f26917a;
            }

            /* renamed from: b */
            public final int m9790b() {
                return this.f26918b;
            }

            /* renamed from: c */
            public final EnumC12069c m9789c() {
                return this.f26917a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C12071a) {
                    C12071a c12071a = (C12071a) obj;
                    return this.f26917a == c12071a.f26917a && this.f26918b == c12071a.f26918b;
                }
                return false;
            }

            public int hashCode() {
                return (this.f26917a.hashCode() * 31) + this.f26918b;
            }

            public String toString() {
                return "KindWithArity(kind=" + this.f26917a + ", arity=" + this.f26918b + ')';
            }
        }

        private C12070a() {
        }

        public /* synthetic */ C12070a(g gVar) {
            this();
        }

        /* renamed from: d */
        private final Integer m9792d(String str) {
            if (str.length() == 0) {
                return null;
            }
            int length = str.length();
            int i = 0;
            int i2 = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                i++;
                int i3 = charAt - '0';
                if (!(i3 >= 0 && i3 <= 9)) {
                    return null;
                }
                i2 = (i2 * 10) + i3;
            }
            return Integer.valueOf(i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0032 A[LOOP:0: B:3:0x0011->B:13:0x0032, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0030 A[SYNTHETIC] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.p493j0.p494o.p495c.p497p0.p498b.p499p.EnumC12069c m9795a(kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c r9, java.lang.String r10) {
            /*
                r8 = this;
                java.lang.String r0 = "packageFqName"
                kotlin.e0.d.l.f(r9, r0)
                java.lang.String r0 = "className"
                kotlin.e0.d.l.f(r10, r0)
                kotlin.j0.o.c.p0.b.p.c[] r0 = kotlin.p493j0.p494o.p495c.p497p0.p498b.p499p.EnumC12069c.values()
                int r1 = r0.length
                r2 = 0
                r3 = 0
            L11:
                r4 = 0
                if (r3 >= r1) goto L35
                r5 = r0[r3]
                kotlin.j0.o.c.p0.f.c r6 = r5.m9797e()
                boolean r6 = kotlin.e0.d.l.b(r6, r9)
                if (r6 == 0) goto L2d
                java.lang.String r6 = r5.m9798b()
                r7 = 2
                boolean r4 = kotlin.p549l0.C13265j.m5507E(r10, r6, r2, r7, r4)
                if (r4 == 0) goto L2d
                r4 = 1
                goto L2e
            L2d:
                r4 = 0
            L2e:
                if (r4 == 0) goto L32
                r4 = r5
                goto L35
            L32:
                int r3 = r3 + 1
                goto L11
            L35:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p498b.p499p.EnumC12069c.C12070a.m9795a(kotlin.j0.o.c.p0.f.c, java.lang.String):kotlin.j0.o.c.p0.b.p.c");
        }

        /* renamed from: b */
        public final EnumC12069c m9794b(String str, C12609c c12609c) {
            l.f(str, "className");
            l.f(c12609c, "packageFqName");
            C12071a m9793c = m9793c(str, c12609c);
            if (m9793c == null) {
                return null;
            }
            return m9793c.m9789c();
        }

        /* renamed from: c */
        public final C12071a m9793c(String str, C12609c c12609c) {
            l.f(str, "className");
            l.f(c12609c, "packageFqName");
            EnumC12069c m9795a = m9795a(c12609c, str);
            if (m9795a == null) {
                return null;
            }
            String substring = str.substring(m9795a.m9798b().length());
            l.e(substring, "(this as java.lang.String).substring(startIndex)");
            Integer m9792d = m9792d(substring);
            if (m9792d == null) {
                return null;
            }
            return new C12071a(m9795a, m9792d.intValue());
        }
    }

    EnumC12069c(C12609c c12609c, String str, boolean z, boolean z2) {
        this.f26915c = c12609c;
        this.f26916d = str;
    }

    /* renamed from: b */
    public final String m9798b() {
        return this.f26916d;
    }

    /* renamed from: e */
    public final C12609c m9797e() {
        return this.f26915c;
    }

    /* renamed from: g */
    public final C12614f m9796g(int i) {
        C12614f m7349i = C12614f.m7349i(l.m(this.f26916d, Integer.valueOf(i)));
        l.e(m7349i, "identifier(\"$classNamePrefix$arity\")");
        return m7349i;
    }
}
