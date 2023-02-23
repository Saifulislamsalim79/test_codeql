package com.google.android.gms.internal.p104firebaseauthapi;

import java.io.IOException;
import java.util.List;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.so */
/* loaded from: classes2.dex */
final class C3513so {

    /* renamed from: a */
    private final AbstractC3487ro f8964a;

    private C3513so(AbstractC3487ro abstractC3487ro) {
        C3117e.m31220f(abstractC3487ro, "output");
        this.f8964a = abstractC3487ro;
        abstractC3487ro.f8926a = this;
    }

    /* renamed from: l */
    public static C3513so m30241l(AbstractC3487ro abstractC3487ro) {
        C3513so c3513so = abstractC3487ro.f8926a;
        return c3513so != null ? c3513so : new C3513so(abstractC3487ro);
    }

    /* renamed from: A */
    public final void m30263A(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f8964a.mo30304z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).floatValue();
                i3 += 4;
            }
            this.f8964a.mo30335B(i3);
            while (i2 < list.size()) {
                this.f8964a.mo30311s(Float.floatToRawIntBits(list.get(i2).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f8964a.mo30312r(i, Float.floatToRawIntBits(list.get(i2).floatValue()));
            i2++;
        }
    }

    /* renamed from: B */
    public final void m30262B(int i, Object obj, InterfaceC3307l0 interfaceC3307l0) throws IOException {
        AbstractC3487ro abstractC3487ro = this.f8964a;
        abstractC3487ro.mo30304z(i, 3);
        interfaceC3307l0.mo30811f((InterfaceC3644y) obj, abstractC3487ro.f8926a);
        abstractC3487ro.mo30304z(i, 4);
    }

    /* renamed from: C */
    public final void m30261C(int i, int i2) throws IOException {
        this.f8964a.mo30308v(i, i2);
    }

    /* renamed from: D */
    public final void m30260D(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f8964a.mo30304z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC3487ro.m30330G(list.get(i4).intValue());
            }
            this.f8964a.mo30335B(i3);
            while (i2 < list.size()) {
                this.f8964a.mo30307w(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f8964a.mo30308v(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: E */
    public final void m30259E(int i, long j) throws IOException {
        this.f8964a.mo30334C(i, j);
    }

    /* renamed from: F */
    public final void m30258F(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f8964a.mo30304z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC3487ro.m30323g(list.get(i4).longValue());
            }
            this.f8964a.mo30335B(i3);
            while (i2 < list.size()) {
                this.f8964a.mo30333D(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f8964a.mo30334C(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: G */
    public final void m30257G(int i, Object obj, InterfaceC3307l0 interfaceC3307l0) throws IOException {
        this.f8964a.mo30306x(i, (InterfaceC3644y) obj, interfaceC3307l0);
    }

    /* renamed from: H */
    public final void m30256H(int i, int i2) throws IOException {
        this.f8964a.mo30312r(i, i2);
    }

    /* renamed from: I */
    public final void m30255I(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f8964a.mo30304z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += 4;
            }
            this.f8964a.mo30335B(i3);
            while (i2 < list.size()) {
                this.f8964a.mo30311s(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f8964a.mo30312r(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: J */
    public final void m30254J(int i, long j) throws IOException {
        this.f8964a.mo30310t(i, j);
    }

    /* renamed from: K */
    public final void m30253K(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f8964a.mo30304z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += 8;
            }
            this.f8964a.mo30335B(i3);
            while (i2 < list.size()) {
                this.f8964a.mo30309u(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f8964a.mo30310t(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void m30252a(int i, int i2) throws IOException {
        this.f8964a.mo30336A(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* renamed from: b */
    public final void m30251b(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f8964a.mo30304z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = list.get(i4).intValue();
                i3 += AbstractC3487ro.m30324f((intValue >> 31) ^ (intValue + intValue));
            }
            this.f8964a.mo30335B(i3);
            while (i2 < list.size()) {
                AbstractC3487ro abstractC3487ro = this.f8964a;
                int intValue2 = list.get(i2).intValue();
                abstractC3487ro.mo30335B((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            AbstractC3487ro abstractC3487ro2 = this.f8964a;
            int intValue3 = list.get(i2).intValue();
            abstractC3487ro2.mo30336A(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    /* renamed from: c */
    public final void m30250c(int i, long j) throws IOException {
        this.f8964a.mo30334C(i, (j >> 63) ^ (j + j));
    }

    /* renamed from: d */
    public final void m30249d(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f8964a.mo30304z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = list.get(i4).longValue();
                i3 += AbstractC3487ro.m30323g((longValue >> 63) ^ (longValue + longValue));
            }
            this.f8964a.mo30335B(i3);
            while (i2 < list.size()) {
                AbstractC3487ro abstractC3487ro = this.f8964a;
                long longValue2 = list.get(i2).longValue();
                abstractC3487ro.mo30333D((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            AbstractC3487ro abstractC3487ro2 = this.f8964a;
            long longValue3 = list.get(i2).longValue();
            abstractC3487ro2.mo30334C(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    /* renamed from: e */
    public final void m30248e(int i) throws IOException {
        this.f8964a.mo30304z(i, 3);
    }

    /* renamed from: f */
    public final void m30247f(int i, String str) throws IOException {
        this.f8964a.mo30305y(i, str);
    }

    /* renamed from: g */
    public final void m30246g(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof InterfaceC3225i) {
            InterfaceC3225i interfaceC3225i = (InterfaceC3225i) list;
            while (i2 < list.size()) {
                Object mo31005n = interfaceC3225i.mo31005n(i2);
                if (mo31005n instanceof String) {
                    this.f8964a.mo30305y(i, (String) mo31005n);
                } else {
                    this.f8964a.mo30314p(i, (AbstractC3223ho) mo31005n);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f8964a.mo30305y(i, list.get(i2));
            i2++;
        }
    }

    /* renamed from: h */
    public final void m30245h(int i, int i2) throws IOException {
        this.f8964a.mo30336A(i, i2);
    }

    /* renamed from: i */
    public final void m30244i(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f8964a.mo30304z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC3487ro.m30324f(list.get(i4).intValue());
            }
            this.f8964a.mo30335B(i3);
            while (i2 < list.size()) {
                this.f8964a.mo30335B(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f8964a.mo30336A(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: j */
    public final void m30243j(int i, long j) throws IOException {
        this.f8964a.mo30334C(i, j);
    }

    /* renamed from: k */
    public final void m30242k(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f8964a.mo30304z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC3487ro.m30323g(list.get(i4).longValue());
            }
            this.f8964a.mo30335B(i3);
            while (i2 < list.size()) {
                this.f8964a.mo30333D(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f8964a.mo30334C(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: m */
    public final void m30240m(int i, boolean z) throws IOException {
        this.f8964a.mo30315o(i, z);
    }

    /* renamed from: n */
    public final void m30239n(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f8964a.mo30304z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).booleanValue();
                i3++;
            }
            this.f8964a.mo30335B(i3);
            while (i2 < list.size()) {
                this.f8964a.mo30316n(list.get(i2).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f8964a.mo30315o(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    /* renamed from: o */
    public final void m30238o(int i, AbstractC3223ho abstractC3223ho) throws IOException {
        this.f8964a.mo30314p(i, abstractC3223ho);
    }

    /* renamed from: p */
    public final void m30237p(int i, List<AbstractC3223ho> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f8964a.mo30314p(i, list.get(i2));
        }
    }

    /* renamed from: q */
    public final void m30236q(int i, double d) throws IOException {
        this.f8964a.mo30310t(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: r */
    public final void m30235r(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f8964a.mo30304z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).doubleValue();
                i3 += 8;
            }
            this.f8964a.mo30335B(i3);
            while (i2 < list.size()) {
                this.f8964a.mo30309u(Double.doubleToRawLongBits(list.get(i2).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f8964a.mo30310t(i, Double.doubleToRawLongBits(list.get(i2).doubleValue()));
            i2++;
        }
    }

    /* renamed from: s */
    public final void m30234s(int i) throws IOException {
        this.f8964a.mo30304z(i, 4);
    }

    /* renamed from: t */
    public final void m30233t(int i, int i2) throws IOException {
        this.f8964a.mo30308v(i, i2);
    }

    /* renamed from: u */
    public final void m30232u(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f8964a.mo30304z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC3487ro.m30330G(list.get(i4).intValue());
            }
            this.f8964a.mo30335B(i3);
            while (i2 < list.size()) {
                this.f8964a.mo30307w(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f8964a.mo30308v(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: v */
    public final void m30231v(int i, int i2) throws IOException {
        this.f8964a.mo30312r(i, i2);
    }

    /* renamed from: w */
    public final void m30230w(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f8964a.mo30304z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += 4;
            }
            this.f8964a.mo30335B(i3);
            while (i2 < list.size()) {
                this.f8964a.mo30311s(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f8964a.mo30312r(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: x */
    public final void m30229x(int i, long j) throws IOException {
        this.f8964a.mo30310t(i, j);
    }

    /* renamed from: y */
    public final void m30228y(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f8964a.mo30304z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += 8;
            }
            this.f8964a.mo30335B(i3);
            while (i2 < list.size()) {
                this.f8964a.mo30309u(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f8964a.mo30310t(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: z */
    public final void m30227z(int i, float f) throws IOException {
        this.f8964a.mo30312r(i, Float.floatToRawIntBits(f));
    }
}
