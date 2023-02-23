package kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z;

import java.util.ArrayList;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p557z.C13712m;
import kotlin.p557z.C13715n;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13742z;
/* compiled from: BinaryVersion.kt */
/* renamed from: kotlin.j0.o.c.p0.e.z.a */
/* loaded from: classes3.dex */
public abstract class AbstractC12587a {

    /* renamed from: a */
    private final int[] f28298a;

    /* renamed from: b */
    private final int f28299b;

    /* renamed from: c */
    private final int f28300c;

    /* renamed from: d */
    private final int f28301d;

    /* renamed from: e */
    private final List<Integer> f28302e;

    public AbstractC12587a(int... iArr) {
        Integer m4050A;
        Integer m4050A2;
        Integer m4050A3;
        List<Integer> m3891e;
        List<Integer> m4068c;
        l.f(iArr, "numbers");
        this.f28298a = iArr;
        m4050A = C13715n.m4050A(iArr, 0);
        this.f28299b = m4050A == null ? -1 : m4050A.intValue();
        m4050A2 = C13715n.m4050A(this.f28298a, 1);
        this.f28300c = m4050A2 == null ? -1 : m4050A2.intValue();
        m4050A3 = C13715n.m4050A(this.f28298a, 2);
        this.f28301d = m4050A3 != null ? m4050A3.intValue() : -1;
        int[] iArr2 = this.f28298a;
        if (iArr2.length > 3) {
            m4068c = C13712m.m4068c(iArr2);
            m3891e = C13742z.m3825B0(m4068c.subList(3, this.f28298a.length));
        } else {
            m3891e = C13726r.m3891e();
        }
        this.f28302e = m3891e;
    }

    /* renamed from: a */
    public final int m7454a() {
        return this.f28299b;
    }

    /* renamed from: b */
    public final int m7453b() {
        return this.f28300c;
    }

    /* renamed from: c */
    public final boolean m7452c(int i, int i2, int i3) {
        int i4 = this.f28299b;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.f28300c;
        if (i5 > i2) {
            return true;
        }
        return i5 >= i2 && this.f28301d >= i3;
    }

    /* renamed from: d */
    public final boolean m7451d(AbstractC12587a abstractC12587a) {
        l.f(abstractC12587a, "version");
        return m7452c(abstractC12587a.f28299b, abstractC12587a.f28300c, abstractC12587a.f28301d);
    }

    /* renamed from: e */
    public final boolean m7450e(int i, int i2, int i3) {
        int i4 = this.f28299b;
        if (i4 < i) {
            return true;
        }
        if (i4 > i) {
            return false;
        }
        int i5 = this.f28300c;
        if (i5 < i2) {
            return true;
        }
        return i5 <= i2 && this.f28301d <= i3;
    }

    public boolean equals(Object obj) {
        if (obj != null && l.b(getClass(), obj.getClass())) {
            AbstractC12587a abstractC12587a = (AbstractC12587a) obj;
            if (this.f28299b == abstractC12587a.f28299b && this.f28300c == abstractC12587a.f28300c && this.f28301d == abstractC12587a.f28301d && l.b(this.f28302e, abstractC12587a.f28302e)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean m7449f(AbstractC12587a abstractC12587a) {
        l.f(abstractC12587a, "ourVersion");
        int i = this.f28299b;
        if (i == 0) {
            if (abstractC12587a.f28299b == 0 && this.f28300c == abstractC12587a.f28300c) {
                return true;
            }
        } else if (i == abstractC12587a.f28299b && this.f28300c <= abstractC12587a.f28300c) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final int[] m7448g() {
        return this.f28298a;
    }

    public int hashCode() {
        int i = this.f28299b;
        int i2 = i + (i * 31) + this.f28300c;
        int i3 = i2 + (i2 * 31) + this.f28301d;
        return i3 + (i3 * 31) + this.f28302e.hashCode();
    }

    public String toString() {
        String m3797a0;
        int[] m7448g = m7448g();
        ArrayList arrayList = new ArrayList();
        int length = m7448g.length;
        for (int i = 0; i < length; i++) {
            int i2 = m7448g[i];
            if (!(i2 != -1)) {
                break;
            }
            arrayList.add(Integer.valueOf(i2));
        }
        if (arrayList.isEmpty()) {
            return "unknown";
        }
        m3797a0 = C13742z.m3797a0(arrayList, ".", null, null, 0, null, null, 62, null);
        return m3797a0;
    }
}
