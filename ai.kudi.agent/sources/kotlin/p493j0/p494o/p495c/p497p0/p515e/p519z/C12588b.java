package kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z;

import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12509c;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.EnumC12534j;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.EnumC12535k;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.EnumC12583x;
import kotlin.reflect.jvm.internal.impl.protobuf.C13588i;
/* compiled from: Flags.java */
/* renamed from: kotlin.j0.o.c.p0.e.z.b */
/* loaded from: classes3.dex */
public class C12588b {

    /* renamed from: A */
    public static final C12590b f28303A;

    /* renamed from: B */
    public static final C12590b f28304B;

    /* renamed from: C */
    public static final C12590b f28305C;

    /* renamed from: D */
    public static final C12590b f28306D;

    /* renamed from: E */
    public static final C12590b f28307E;

    /* renamed from: F */
    public static final C12590b f28308F;

    /* renamed from: G */
    public static final C12590b f28309G;

    /* renamed from: H */
    public static final C12590b f28310H;

    /* renamed from: I */
    public static final C12590b f28311I;

    /* renamed from: J */
    public static final C12590b f28312J;

    /* renamed from: K */
    public static final C12590b f28313K;

    /* renamed from: L */
    public static final C12590b f28314L;

    /* renamed from: M */
    public static final C12590b f28315M;

    /* renamed from: N */
    public static final C12590b f28316N;

    /* renamed from: a */
    public static final C12590b f28317a;

    /* renamed from: b */
    public static final C12590b f28318b;

    /* renamed from: c */
    public static final C12590b f28319c;

    /* renamed from: d */
    public static final AbstractC12592d<EnumC12583x> f28320d;

    /* renamed from: e */
    public static final AbstractC12592d<EnumC12535k> f28321e;

    /* renamed from: f */
    public static final AbstractC12592d<C12509c.EnumC12512c> f28322f;

    /* renamed from: g */
    public static final C12590b f28323g;

    /* renamed from: h */
    public static final C12590b f28324h;

    /* renamed from: i */
    public static final C12590b f28325i;

    /* renamed from: j */
    public static final C12590b f28326j;

    /* renamed from: k */
    public static final C12590b f28327k;

    /* renamed from: l */
    public static final C12590b f28328l;

    /* renamed from: m */
    public static final C12590b f28329m;

    /* renamed from: n */
    public static final C12590b f28330n;

    /* renamed from: o */
    public static final AbstractC12592d<EnumC12534j> f28331o;

    /* renamed from: p */
    public static final C12590b f28332p;

    /* renamed from: q */
    public static final C12590b f28333q;

    /* renamed from: r */
    public static final C12590b f28334r;

    /* renamed from: s */
    public static final C12590b f28335s;

    /* renamed from: t */
    public static final C12590b f28336t;

    /* renamed from: u */
    public static final C12590b f28337u;

    /* renamed from: v */
    public static final C12590b f28338v;

    /* renamed from: w */
    public static final C12590b f28339w;

    /* renamed from: x */
    public static final C12590b f28340x;

    /* renamed from: y */
    public static final C12590b f28341y;

    /* renamed from: z */
    public static final C12590b f28342z;

    /* compiled from: Flags.java */
    /* renamed from: kotlin.j0.o.c.p0.e.z.b$b */
    /* loaded from: classes3.dex */
    public static class C12590b extends AbstractC12592d<Boolean> {
        public C12590b(int i) {
            super(i, 1);
        }

        /* renamed from: f */
        private static /* synthetic */ void m7445f(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$BooleanFlagField", "get"));
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.C12588b.AbstractC12592d
        /* renamed from: g */
        public Boolean mo7435d(int i) {
            Boolean valueOf = Boolean.valueOf((i & (1 << this.f28344a)) != 0);
            if (valueOf != null) {
                return valueOf;
            }
            m7445f(0);
            throw null;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.C12588b.AbstractC12592d
        /* renamed from: h */
        public int mo7434e(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.f28344a;
            }
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Flags.java */
    /* renamed from: kotlin.j0.o.c.p0.e.z.b$c */
    /* loaded from: classes3.dex */
    public static class C12591c<E extends C13588i.InterfaceC13589a> extends AbstractC12592d<E> {

        /* renamed from: c */
        private final E[] f28343c;

        public C12591c(int i, E[] eArr) {
            super(i, m7441g(eArr));
            this.f28343c = eArr;
        }

        /* renamed from: f */
        private static /* synthetic */ void m7442f(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"));
        }

        /* renamed from: g */
        private static <E> int m7441g(E[] eArr) {
            if (eArr != null) {
                int length = eArr.length - 1;
                if (length == 0) {
                    return 1;
                }
                for (int i = 31; i >= 0; i--) {
                    if (((1 << i) & length) != 0) {
                        return i + 1;
                    }
                }
                throw new IllegalStateException("Empty enum: " + eArr.getClass());
            }
            m7442f(0);
            throw null;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.C12588b.AbstractC12592d
        /* renamed from: h */
        public E mo7435d(int i) {
            E[] eArr;
            int i2 = this.f28344a;
            int i3 = (i & (((1 << this.f28345b) - 1) << i2)) >> i2;
            for (E e : this.f28343c) {
                if (e.mo4405d() == i3) {
                    return e;
                }
            }
            return null;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.C12588b.AbstractC12592d
        /* renamed from: i */
        public int mo7434e(E e) {
            return e.mo4405d() << this.f28344a;
        }
    }

    /* compiled from: Flags.java */
    /* renamed from: kotlin.j0.o.c.p0.e.z.b$d */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC12592d<E> {

        /* renamed from: a */
        public final int f28344a;

        /* renamed from: b */
        public final int f28345b;

        /* JADX WARN: Incorrect types in method signature: <E::Lkotlin/reflect/jvm/internal/impl/protobuf/i$a;>(Lkotlin/j0/o/c/p0/e/z/b$d<*>;[TE;)Lkotlin/j0/o/c/p0/e/z/b$d<TE;>; */
        /* renamed from: a */
        public static AbstractC12592d m7438a(AbstractC12592d abstractC12592d, C13588i.InterfaceC13589a[] interfaceC13589aArr) {
            return new C12591c(abstractC12592d.f28344a + abstractC12592d.f28345b, interfaceC13589aArr);
        }

        /* renamed from: b */
        public static C12590b m7437b(AbstractC12592d<?> abstractC12592d) {
            return new C12590b(abstractC12592d.f28344a + abstractC12592d.f28345b);
        }

        /* renamed from: c */
        public static C12590b m7436c() {
            return new C12590b(0);
        }

        /* renamed from: d */
        public abstract E mo7435d(int i);

        /* renamed from: e */
        public abstract int mo7434e(E e);

        private AbstractC12592d(int i, int i2) {
            this.f28344a = i;
            this.f28345b = i2;
        }
    }

    static {
        C12590b m7436c = AbstractC12592d.m7436c();
        f28317a = m7436c;
        f28318b = AbstractC12592d.m7437b(m7436c);
        C12590b m7436c2 = AbstractC12592d.m7436c();
        f28319c = m7436c2;
        AbstractC12592d<EnumC12583x> m7438a = AbstractC12592d.m7438a(m7436c2, EnumC12583x.values());
        f28320d = m7438a;
        AbstractC12592d<EnumC12535k> m7438a2 = AbstractC12592d.m7438a(m7438a, EnumC12535k.values());
        f28321e = m7438a2;
        AbstractC12592d<C12509c.EnumC12512c> m7438a3 = AbstractC12592d.m7438a(m7438a2, C12509c.EnumC12512c.values());
        f28322f = m7438a3;
        C12590b m7437b = AbstractC12592d.m7437b(m7438a3);
        f28323g = m7437b;
        C12590b m7437b2 = AbstractC12592d.m7437b(m7437b);
        f28324h = m7437b2;
        C12590b m7437b3 = AbstractC12592d.m7437b(m7437b2);
        f28325i = m7437b3;
        C12590b m7437b4 = AbstractC12592d.m7437b(m7437b3);
        f28326j = m7437b4;
        C12590b m7437b5 = AbstractC12592d.m7437b(m7437b4);
        f28327k = m7437b5;
        f28328l = AbstractC12592d.m7437b(m7437b5);
        C12590b m7437b6 = AbstractC12592d.m7437b(f28320d);
        f28329m = m7437b6;
        f28330n = AbstractC12592d.m7437b(m7437b6);
        AbstractC12592d<EnumC12534j> m7438a4 = AbstractC12592d.m7438a(f28321e, EnumC12534j.values());
        f28331o = m7438a4;
        C12590b m7437b7 = AbstractC12592d.m7437b(m7438a4);
        f28332p = m7437b7;
        C12590b m7437b8 = AbstractC12592d.m7437b(m7437b7);
        f28333q = m7437b8;
        C12590b m7437b9 = AbstractC12592d.m7437b(m7437b8);
        f28334r = m7437b9;
        C12590b m7437b10 = AbstractC12592d.m7437b(m7437b9);
        f28335s = m7437b10;
        C12590b m7437b11 = AbstractC12592d.m7437b(m7437b10);
        f28336t = m7437b11;
        C12590b m7437b12 = AbstractC12592d.m7437b(m7437b11);
        f28337u = m7437b12;
        C12590b m7437b13 = AbstractC12592d.m7437b(m7437b12);
        f28338v = m7437b13;
        f28339w = AbstractC12592d.m7437b(m7437b13);
        C12590b m7437b14 = AbstractC12592d.m7437b(f28331o);
        f28340x = m7437b14;
        C12590b m7437b15 = AbstractC12592d.m7437b(m7437b14);
        f28341y = m7437b15;
        C12590b m7437b16 = AbstractC12592d.m7437b(m7437b15);
        f28342z = m7437b16;
        C12590b m7437b17 = AbstractC12592d.m7437b(m7437b16);
        f28303A = m7437b17;
        C12590b m7437b18 = AbstractC12592d.m7437b(m7437b17);
        f28304B = m7437b18;
        C12590b m7437b19 = AbstractC12592d.m7437b(m7437b18);
        f28305C = m7437b19;
        C12590b m7437b20 = AbstractC12592d.m7437b(m7437b19);
        f28306D = m7437b20;
        C12590b m7437b21 = AbstractC12592d.m7437b(m7437b20);
        f28307E = m7437b21;
        f28308F = AbstractC12592d.m7437b(m7437b21);
        C12590b m7437b22 = AbstractC12592d.m7437b(f28319c);
        f28309G = m7437b22;
        C12590b m7437b23 = AbstractC12592d.m7437b(m7437b22);
        f28310H = m7437b23;
        f28311I = AbstractC12592d.m7437b(m7437b23);
        C12590b m7437b24 = AbstractC12592d.m7437b(f28321e);
        f28312J = m7437b24;
        C12590b m7437b25 = AbstractC12592d.m7437b(m7437b24);
        f28313K = m7437b25;
        f28314L = AbstractC12592d.m7437b(m7437b25);
        C12590b m7436c3 = AbstractC12592d.m7436c();
        f28315M = m7436c3;
        AbstractC12592d.m7437b(m7436c3);
        f28316N = AbstractC12592d.m7436c();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void m7447a(int r5) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 1
            r2 = 0
            r3 = 2
            if (r5 == r1) goto L2b
            if (r5 == r3) goto L26
            r4 = 5
            if (r5 == r4) goto L2b
            r4 = 6
            if (r5 == r4) goto L21
            r4 = 8
            if (r5 == r4) goto L2b
            r4 = 9
            if (r5 == r4) goto L21
            r4 = 11
            if (r5 == r4) goto L2b
            java.lang.String r4 = "visibility"
            r0[r2] = r4
            goto L2f
        L21:
            java.lang.String r4 = "memberKind"
            r0[r2] = r4
            goto L2f
        L26:
            java.lang.String r4 = "kind"
            r0[r2] = r4
            goto L2f
        L2b:
            java.lang.String r4 = "modality"
            r0[r2] = r4
        L2f:
            java.lang.String r2 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags"
            r0[r1] = r2
            switch(r5) {
                case 3: goto L4a;
                case 4: goto L45;
                case 5: goto L45;
                case 6: goto L45;
                case 7: goto L40;
                case 8: goto L40;
                case 9: goto L40;
                case 10: goto L3b;
                case 11: goto L3b;
                default: goto L36;
            }
        L36:
            java.lang.String r5 = "getClassFlags"
            r0[r3] = r5
            goto L4e
        L3b:
            java.lang.String r5 = "getAccessorFlags"
            r0[r3] = r5
            goto L4e
        L40:
            java.lang.String r5 = "getPropertyFlags"
            r0[r3] = r5
            goto L4e
        L45:
            java.lang.String r5 = "getFunctionFlags"
            r0[r3] = r5
            goto L4e
        L4a:
            java.lang.String r5 = "getConstructorFlags"
            r0[r3] = r5
        L4e:
            java.lang.String r5 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r5 = java.lang.String.format(r5, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.C12588b.m7447a(int):void");
    }

    /* renamed from: b */
    public static int m7446b(boolean z, EnumC12583x enumC12583x, EnumC12535k enumC12535k, boolean z2, boolean z3, boolean z4) {
        if (enumC12583x == null) {
            m7447a(10);
            throw null;
        } else if (enumC12535k != null) {
            return f28319c.mo7434e(Boolean.valueOf(z)) | f28321e.mo7434e(enumC12535k) | f28320d.mo7434e(enumC12583x) | f28312J.mo7434e(Boolean.valueOf(z2)) | f28313K.mo7434e(Boolean.valueOf(z3)) | f28314L.mo7434e(Boolean.valueOf(z4));
        } else {
            m7447a(11);
            throw null;
        }
    }
}
