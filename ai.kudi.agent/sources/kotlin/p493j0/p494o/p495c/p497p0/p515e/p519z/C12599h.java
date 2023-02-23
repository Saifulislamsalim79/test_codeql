package kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z;

import java.util.ArrayList;
import java.util.List;
import kotlin.EnumC11701a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12509c;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12513d;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12531i;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12542n;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12562r;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12575v;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o;
/* compiled from: VersionRequirement.kt */
/* renamed from: kotlin.j0.o.c.p0.e.z.h */
/* loaded from: classes3.dex */
public final class C12599h {

    /* renamed from: f */
    public static final C12600a f28350f = new C12600a(null);

    /* renamed from: a */
    private final C12602b f28351a;

    /* renamed from: b */
    private final C12575v.EnumC12579d f28352b;

    /* renamed from: c */
    private final EnumC11701a f28353c;

    /* renamed from: d */
    private final Integer f28354d;

    /* renamed from: e */
    private final String f28355e;

    /* compiled from: VersionRequirement.kt */
    /* renamed from: kotlin.j0.o.c.p0.e.z.h$a */
    /* loaded from: classes3.dex */
    public static final class C12600a {

        /* compiled from: VersionRequirement.kt */
        /* renamed from: kotlin.j0.o.c.p0.e.z.h$a$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C12601a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f28356a;

            static {
                int[] iArr = new int[C12575v.EnumC12578c.values().length];
                iArr[C12575v.EnumC12578c.WARNING.ordinal()] = 1;
                iArr[C12575v.EnumC12578c.ERROR.ordinal()] = 2;
                iArr[C12575v.EnumC12578c.HIDDEN.ordinal()] = 3;
                f28356a = iArr;
            }
        }

        private C12600a() {
        }

        public /* synthetic */ C12600a(g gVar) {
            this();
        }

        /* renamed from: a */
        public final List<C12599h> m7409a(InterfaceC13601o interfaceC13601o, InterfaceC12593c interfaceC12593c, C12604i c12604i) {
            List<Integer> m7695d0;
            l.f(interfaceC13601o, "proto");
            l.f(interfaceC12593c, "nameResolver");
            l.f(c12604i, "table");
            if (interfaceC13601o instanceof C12509c) {
                m7695d0 = ((C12509c) interfaceC13601o).m8465O0();
            } else if (interfaceC13601o instanceof C12513d) {
                m7695d0 = ((C12513d) interfaceC13601o).m8352N();
            } else if (interfaceC13601o instanceof C12531i) {
                m7695d0 = ((C12531i) interfaceC13601o).m8150j0();
            } else if (interfaceC13601o instanceof C12542n) {
                m7695d0 = ((C12542n) interfaceC13601o).m7970g0();
            } else if (!(interfaceC13601o instanceof C12562r)) {
                throw new IllegalStateException(l.m("Unexpected declaration: ", interfaceC13601o.getClass()));
            } else {
                m7695d0 = ((C12562r) interfaceC13601o).m7695d0();
            }
            l.e(m7695d0, "ids");
            ArrayList arrayList = new ArrayList();
            for (Integer num : m7695d0) {
                C12600a c12600a = C12599h.f28350f;
                l.e(num, "id");
                C12599h m7408b = c12600a.m7408b(num.intValue(), interfaceC12593c, c12604i);
                if (m7408b != null) {
                    arrayList.add(m7408b);
                }
            }
            return arrayList;
        }

        /* renamed from: b */
        public final C12599h m7408b(int i, InterfaceC12593c interfaceC12593c, C12604i c12604i) {
            EnumC11701a enumC11701a;
            l.f(interfaceC12593c, "nameResolver");
            l.f(c12604i, "table");
            C12575v m7404b = c12604i.m7404b(i);
            if (m7404b == null) {
                return null;
            }
            C12602b m7406a = C12602b.f28357d.m7406a(m7404b.m7515K() ? Integer.valueOf(m7404b.m7521E()) : null, m7404b.m7514L() ? Integer.valueOf(m7404b.m7520F()) : null);
            C12575v.EnumC12578c m7523C = m7404b.m7523C();
            l.d(m7523C);
            int i2 = C12601a.f28356a[m7523C.ordinal()];
            if (i2 == 1) {
                enumC11701a = EnumC11701a.WARNING;
            } else if (i2 == 2) {
                enumC11701a = EnumC11701a.ERROR;
            } else if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            } else {
                enumC11701a = EnumC11701a.HIDDEN;
            }
            EnumC11701a enumC11701a2 = enumC11701a;
            Integer valueOf = m7404b.m7518H() ? Integer.valueOf(m7404b.m7524B()) : null;
            String string = m7404b.m7516J() ? interfaceC12593c.getString(m7404b.m7522D()) : null;
            C12575v.EnumC12579d m7519G = m7404b.m7519G();
            l.e(m7519G, "info.versionKind");
            return new C12599h(m7406a, m7519G, enumC11701a2, valueOf, string);
        }
    }

    /* compiled from: VersionRequirement.kt */
    /* renamed from: kotlin.j0.o.c.p0.e.z.h$b */
    /* loaded from: classes3.dex */
    public static final class C12602b {

        /* renamed from: d */
        public static final C12603a f28357d = new C12603a(null);

        /* renamed from: e */
        public static final C12602b f28358e = new C12602b(256, 256, 256);

        /* renamed from: a */
        private final int f28359a;

        /* renamed from: b */
        private final int f28360b;

        /* renamed from: c */
        private final int f28361c;

        /* compiled from: VersionRequirement.kt */
        /* renamed from: kotlin.j0.o.c.p0.e.z.h$b$a */
        /* loaded from: classes3.dex */
        public static final class C12603a {
            private C12603a() {
            }

            public /* synthetic */ C12603a(g gVar) {
                this();
            }

            /* renamed from: a */
            public final C12602b m7406a(Integer num, Integer num2) {
                if (num2 != null) {
                    return new C12602b(num2.intValue() & 255, (num2.intValue() >> 8) & 255, (num2.intValue() >> 16) & 255);
                }
                if (num != null) {
                    return new C12602b(num.intValue() & 7, (num.intValue() >> 3) & 15, (num.intValue() >> 7) & 127);
                }
                return C12602b.f28358e;
            }
        }

        public C12602b(int i, int i2, int i3) {
            this.f28359a = i;
            this.f28360b = i2;
            this.f28361c = i3;
        }

        /* renamed from: a */
        public final String m7407a() {
            StringBuilder sb;
            int i;
            if (this.f28361c == 0) {
                sb = new StringBuilder();
                sb.append(this.f28359a);
                sb.append('.');
                i = this.f28360b;
            } else {
                sb = new StringBuilder();
                sb.append(this.f28359a);
                sb.append('.');
                sb.append(this.f28360b);
                sb.append('.');
                i = this.f28361c;
            }
            sb.append(i);
            return sb.toString();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C12602b) {
                C12602b c12602b = (C12602b) obj;
                return this.f28359a == c12602b.f28359a && this.f28360b == c12602b.f28360b && this.f28361c == c12602b.f28361c;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f28359a * 31) + this.f28360b) * 31) + this.f28361c;
        }

        public String toString() {
            return m7407a();
        }

        public /* synthetic */ C12602b(int i, int i2, int i3, int i4, g gVar) {
            this(i, i2, (i4 & 4) != 0 ? 0 : i3);
        }
    }

    public C12599h(C12602b c12602b, C12575v.EnumC12579d enumC12579d, EnumC11701a enumC11701a, Integer num, String str) {
        l.f(c12602b, "version");
        l.f(enumC12579d, "kind");
        l.f(enumC11701a, "level");
        this.f28351a = c12602b;
        this.f28352b = enumC12579d;
        this.f28353c = enumC11701a;
        this.f28354d = num;
        this.f28355e = str;
    }

    /* renamed from: a */
    public final C12575v.EnumC12579d m7411a() {
        return this.f28352b;
    }

    /* renamed from: b */
    public final C12602b m7410b() {
        return this.f28351a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("since ");
        sb.append(this.f28351a);
        sb.append(' ');
        sb.append(this.f28353c);
        Integer num = this.f28354d;
        sb.append(num != null ? l.m(" error ", num) : "");
        String str = this.f28355e;
        sb.append(str != null ? l.m(": ", str) : "");
        return sb.toString();
    }
}
