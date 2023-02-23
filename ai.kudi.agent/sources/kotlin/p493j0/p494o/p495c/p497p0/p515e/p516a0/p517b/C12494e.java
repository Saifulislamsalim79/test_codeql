package kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.p517b;

import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.AbstractC12587a;
/* compiled from: JvmMetadataVersion.kt */
/* renamed from: kotlin.j0.o.c.p0.e.a0.b.e */
/* loaded from: classes3.dex */
public final class C12494e extends AbstractC12587a {

    /* renamed from: g */
    public static final C12494e f27750g = new C12494e(1, 5, 1);

    /* renamed from: f */
    private final boolean f27751f;

    static {
        new C12494e(new int[0]);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C12494e(int[] r4, boolean r5) {
        /*
            r3 = this;
            java.lang.String r0 = "versionArray"
            kotlin.e0.d.l.f(r4, r0)
            int r0 = r4.length
            int[] r0 = new int[r0]
            int r1 = r4.length
            r2 = 0
            java.lang.System.arraycopy(r4, r2, r0, r2, r1)
            r3.<init>(r0)
            r3.f27751f = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.p517b.C12494e.<init>(int[], boolean):void");
    }

    /* renamed from: h */
    public boolean m8642h() {
        boolean z;
        if (m7454a() == 1 && m7453b() == 0) {
            return false;
        }
        if (this.f27751f) {
            z = m7449f(f27750g);
        } else {
            z = m7454a() == f27750g.m7454a() && m7453b() <= f27750g.m7453b() + 1;
        }
        return z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12494e(int... iArr) {
        this(iArr, false);
        l.f(iArr, "numbers");
    }
}
