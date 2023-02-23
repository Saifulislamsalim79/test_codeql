package kotlin.p491i0;

import kotlin.e0.d.g;
/* compiled from: Ranges.kt */
/* renamed from: kotlin.i0.e */
/* loaded from: classes3.dex */
public final class C11837e extends C11834c implements InterfaceC11833b<Integer> {

    /* renamed from: x */
    public static final C11838a f26522x = new C11838a(null);

    /* renamed from: w */
    private static final C11837e f26521w = new C11837e(1, 0);

    /* compiled from: Ranges.kt */
    /* renamed from: kotlin.i0.e$a */
    /* loaded from: classes3.dex */
    public static final class C11838a {
        private C11838a() {
        }

        /* renamed from: a */
        public final C11837e m10281a() {
            return C11837e.f26521w;
        }

        public /* synthetic */ C11838a(g gVar) {
            this();
        }
    }

    public C11837e(int i, int i2) {
        super(i, i2, 1);
    }

    /* renamed from: F */
    public boolean m10286F(int i) {
        return m10292l() <= i && i <= m10291m();
    }

    @Override // kotlin.p491i0.InterfaceC11833b
    /* renamed from: I */
    public Integer mo10282k() {
        return Integer.valueOf(m10291m());
    }

    @Override // kotlin.p491i0.InterfaceC11833b
    /* renamed from: J */
    public Integer mo10283h() {
        return Integer.valueOf(m10292l());
    }

    @Override // kotlin.p491i0.C11834c
    public boolean equals(Object obj) {
        if (obj instanceof C11837e) {
            if (!isEmpty() || !((C11837e) obj).isEmpty()) {
                C11837e c11837e = (C11837e) obj;
                if (m10292l() != c11837e.m10292l() || m10291m() != c11837e.m10291m()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.p491i0.C11834c
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m10292l() * 31) + m10291m();
    }

    @Override // kotlin.p491i0.C11834c, kotlin.p491i0.InterfaceC11833b
    public boolean isEmpty() {
        return m10292l() > m10291m();
    }

    @Override // kotlin.p491i0.C11834c
    public String toString() {
        return m10292l() + ".." + m10291m();
    }
}
