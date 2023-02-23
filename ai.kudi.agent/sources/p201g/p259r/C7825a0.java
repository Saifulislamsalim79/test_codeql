package p201g.p259r;

import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import p201g.p259r.AbstractC8061y;
/* compiled from: LoadStates.kt */
/* renamed from: g.r.a0 */
/* loaded from: classes2.dex */
public final class C7825a0 {

    /* renamed from: d */
    public static final C7826a f18693d = new C7826a(null);

    /* renamed from: e */
    private static final C7825a0 f18694e = new C7825a0(AbstractC8061y.C8064c.f19411b.m16800b(), AbstractC8061y.C8064c.f19411b.m16800b(), AbstractC8061y.C8064c.f19411b.m16800b());

    /* renamed from: a */
    private final AbstractC8061y f18695a;

    /* renamed from: b */
    private final AbstractC8061y f18696b;

    /* renamed from: c */
    private final AbstractC8061y f18697c;

    /* compiled from: LoadStates.kt */
    /* renamed from: g.r.a0$a */
    /* loaded from: classes2.dex */
    public static final class C7826a {
        private C7826a() {
        }

        public /* synthetic */ C7826a(g gVar) {
            this();
        }

        /* renamed from: a */
        public final C7825a0 m17214a() {
            return C7825a0.f18694e;
        }
    }

    /* compiled from: LoadStates.kt */
    /* renamed from: g.r.a0$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C7827b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18698a;

        static {
            int[] iArr = new int[EnumC7830b0.values().length];
            iArr[EnumC7830b0.APPEND.ordinal()] = 1;
            iArr[EnumC7830b0.PREPEND.ordinal()] = 2;
            iArr[EnumC7830b0.REFRESH.ordinal()] = 3;
            f18698a = iArr;
        }
    }

    public C7825a0(AbstractC8061y abstractC8061y, AbstractC8061y abstractC8061y2, AbstractC8061y abstractC8061y3) {
        l.f(abstractC8061y, "refresh");
        l.f(abstractC8061y2, "prepend");
        l.f(abstractC8061y3, "append");
        this.f18695a = abstractC8061y;
        this.f18696b = abstractC8061y2;
        this.f18697c = abstractC8061y3;
    }

    /* renamed from: c */
    public static /* synthetic */ C7825a0 m17220c(C7825a0 c7825a0, AbstractC8061y abstractC8061y, AbstractC8061y abstractC8061y2, AbstractC8061y abstractC8061y3, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC8061y = c7825a0.f18695a;
        }
        if ((i & 2) != 0) {
            abstractC8061y2 = c7825a0.f18696b;
        }
        if ((i & 4) != 0) {
            abstractC8061y3 = c7825a0.f18697c;
        }
        return c7825a0.m17221b(abstractC8061y, abstractC8061y2, abstractC8061y3);
    }

    /* renamed from: b */
    public final C7825a0 m17221b(AbstractC8061y abstractC8061y, AbstractC8061y abstractC8061y2, AbstractC8061y abstractC8061y3) {
        l.f(abstractC8061y, "refresh");
        l.f(abstractC8061y2, "prepend");
        l.f(abstractC8061y3, "append");
        return new C7825a0(abstractC8061y, abstractC8061y2, abstractC8061y3);
    }

    /* renamed from: d */
    public final AbstractC8061y m17219d(EnumC7830b0 enumC7830b0) {
        l.f(enumC7830b0, "loadType");
        int i = C7827b.f18698a[enumC7830b0.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return this.f18695a;
                }
                throw new NoWhenBranchMatchedException();
            }
            return this.f18696b;
        }
        return this.f18697c;
    }

    /* renamed from: e */
    public final AbstractC8061y m17218e() {
        return this.f18697c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7825a0) {
            C7825a0 c7825a0 = (C7825a0) obj;
            return l.b(this.f18695a, c7825a0.f18695a) && l.b(this.f18696b, c7825a0.f18696b) && l.b(this.f18697c, c7825a0.f18697c);
        }
        return false;
    }

    /* renamed from: f */
    public final AbstractC8061y m17217f() {
        return this.f18696b;
    }

    /* renamed from: g */
    public final AbstractC8061y m17216g() {
        return this.f18695a;
    }

    /* renamed from: h */
    public final C7825a0 m17215h(EnumC7830b0 enumC7830b0, AbstractC8061y abstractC8061y) {
        l.f(enumC7830b0, "loadType");
        l.f(abstractC8061y, "newState");
        int i = C7827b.f18698a[enumC7830b0.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return m17220c(this, abstractC8061y, null, null, 6, null);
                }
                throw new NoWhenBranchMatchedException();
            }
            return m17220c(this, null, abstractC8061y, null, 5, null);
        }
        return m17220c(this, null, null, abstractC8061y, 3, null);
    }

    public int hashCode() {
        return (((this.f18695a.hashCode() * 31) + this.f18696b.hashCode()) * 31) + this.f18697c.hashCode();
    }

    public String toString() {
        return "LoadStates(refresh=" + this.f18695a + ", prepend=" + this.f18696b + ", append=" + this.f18697c + ')';
    }
}
