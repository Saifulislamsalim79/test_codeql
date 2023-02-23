package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.v7 */
/* loaded from: classes2.dex */
final class C4035v7 {

    /* renamed from: a */
    private final AbstractC4019u7 f9796a;

    private C4035v7(AbstractC4019u7 abstractC4019u7) {
        C4004t8.m28904f(abstractC4019u7, "output");
        this.f9796a = abstractC4019u7;
        abstractC4019u7.f9731a = this;
    }

    /* renamed from: l */
    public static C4035v7 m28754l(AbstractC4019u7 abstractC4019u7) {
        C4035v7 c4035v7 = abstractC4019u7.f9731a;
        return c4035v7 != null ? c4035v7 : new C4035v7(abstractC4019u7);
    }

    /* renamed from: A */
    public final void m28776A(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f9796a.mo28856s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).floatValue();
                i3 += 4;
            }
            this.f9796a.mo28854u(i3);
            while (i2 < list.size()) {
                this.f9796a.mo28863l(Float.floatToRawIntBits(list.get(i2).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9796a.mo28864k(i, Float.floatToRawIntBits(list.get(i2).floatValue()));
            i2++;
        }
    }

    /* renamed from: B */
    public final void m28775B(int i, Object obj, InterfaceC4101z9 interfaceC4101z9) throws IOException {
        AbstractC4019u7 abstractC4019u7 = this.f9796a;
        abstractC4019u7.mo28856s(i, 3);
        interfaceC4101z9.mo28525i((InterfaceC3927o9) obj, abstractC4019u7.f9731a);
        abstractC4019u7.mo28856s(i, 4);
    }

    /* renamed from: C */
    public final void m28774C(int i, int i2) throws IOException {
        this.f9796a.mo28860o(i, i2);
    }

    /* renamed from: D */
    public final void m28773D(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f9796a.mo28856s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC4019u7.m28849z(list.get(i4).intValue());
            }
            this.f9796a.mo28854u(i3);
            while (i2 < list.size()) {
                this.f9796a.mo28859p(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9796a.mo28860o(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: E */
    public final void m28772E(int i, long j) throws IOException {
        this.f9796a.mo28853v(i, j);
    }

    /* renamed from: F */
    public final void m28771F(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f9796a.mo28856s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC4019u7.m28873b(list.get(i4).longValue());
            }
            this.f9796a.mo28854u(i3);
            while (i2 < list.size()) {
                this.f9796a.mo28852w(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9796a.mo28853v(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: G */
    public final void m28770G(int i, Object obj, InterfaceC4101z9 interfaceC4101z9) throws IOException {
        InterfaceC3927o9 interfaceC3927o9 = (InterfaceC3927o9) obj;
        C4003t7 c4003t7 = (C4003t7) this.f9796a;
        c4003t7.mo28854u((i << 3) | 2);
        AbstractC3704a7 abstractC3704a7 = (AbstractC3704a7) interfaceC3927o9;
        int mo29395g = abstractC3704a7.mo29395g();
        if (mo29395g == -1) {
            mo29395g = interfaceC4101z9.mo28530d(abstractC3704a7);
            abstractC3704a7.mo29394i(mo29395g);
        }
        c4003t7.mo28854u(mo29395g);
        interfaceC4101z9.mo28525i(interfaceC3927o9, c4003t7.f9731a);
    }

    /* renamed from: H */
    public final void m28769H(int i, int i2) throws IOException {
        this.f9796a.mo28864k(i, i2);
    }

    /* renamed from: I */
    public final void m28768I(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f9796a.mo28856s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += 4;
            }
            this.f9796a.mo28854u(i3);
            while (i2 < list.size()) {
                this.f9796a.mo28863l(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9796a.mo28864k(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: J */
    public final void m28767J(int i, long j) throws IOException {
        this.f9796a.mo28862m(i, j);
    }

    /* renamed from: K */
    public final void m28766K(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f9796a.mo28856s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += 8;
            }
            this.f9796a.mo28854u(i3);
            while (i2 < list.size()) {
                this.f9796a.mo28861n(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9796a.mo28862m(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void m28765a(int i, int i2) throws IOException {
        this.f9796a.mo28855t(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* renamed from: b */
    public final void m28764b(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f9796a.mo28856s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = list.get(i4).intValue();
                i3 += AbstractC4019u7.m28874a((intValue >> 31) ^ (intValue + intValue));
            }
            this.f9796a.mo28854u(i3);
            while (i2 < list.size()) {
                AbstractC4019u7 abstractC4019u7 = this.f9796a;
                int intValue2 = list.get(i2).intValue();
                abstractC4019u7.mo28854u((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            AbstractC4019u7 abstractC4019u72 = this.f9796a;
            int intValue3 = list.get(i2).intValue();
            abstractC4019u72.mo28855t(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    /* renamed from: c */
    public final void m28763c(int i, long j) throws IOException {
        this.f9796a.mo28853v(i, (j >> 63) ^ (j + j));
    }

    /* renamed from: d */
    public final void m28762d(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f9796a.mo28856s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = list.get(i4).longValue();
                i3 += AbstractC4019u7.m28873b((longValue >> 63) ^ (longValue + longValue));
            }
            this.f9796a.mo28854u(i3);
            while (i2 < list.size()) {
                AbstractC4019u7 abstractC4019u7 = this.f9796a;
                long longValue2 = list.get(i2).longValue();
                abstractC4019u7.mo28852w((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            AbstractC4019u7 abstractC4019u72 = this.f9796a;
            long longValue3 = list.get(i2).longValue();
            abstractC4019u72.mo28853v(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    @Deprecated
    /* renamed from: e */
    public final void m28761e(int i) throws IOException {
        this.f9796a.mo28856s(i, 3);
    }

    /* renamed from: f */
    public final void m28760f(int i, String str) throws IOException {
        this.f9796a.mo28857r(i, str);
    }

    /* renamed from: g */
    public final void m28759g(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof InterfaceC4068x8) {
            InterfaceC4068x8 interfaceC4068x8 = (InterfaceC4068x8) list;
            while (i2 < list.size()) {
                Object mo28658n = interfaceC4068x8.mo28658n(i2);
                if (mo28658n instanceof String) {
                    this.f9796a.mo28857r(i, (String) mo28658n);
                } else {
                    this.f9796a.mo28865j(i, (AbstractC3909n7) mo28658n);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9796a.mo28857r(i, list.get(i2));
            i2++;
        }
    }

    /* renamed from: h */
    public final void m28758h(int i, int i2) throws IOException {
        this.f9796a.mo28855t(i, i2);
    }

    /* renamed from: i */
    public final void m28757i(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f9796a.mo28856s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC4019u7.m28874a(list.get(i4).intValue());
            }
            this.f9796a.mo28854u(i3);
            while (i2 < list.size()) {
                this.f9796a.mo28854u(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9796a.mo28855t(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: j */
    public final void m28756j(int i, long j) throws IOException {
        this.f9796a.mo28853v(i, j);
    }

    /* renamed from: k */
    public final void m28755k(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f9796a.mo28856s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC4019u7.m28873b(list.get(i4).longValue());
            }
            this.f9796a.mo28854u(i3);
            while (i2 < list.size()) {
                this.f9796a.mo28852w(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9796a.mo28853v(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: m */
    public final void m28753m(int i, boolean z) throws IOException {
        this.f9796a.mo28866i(i, z);
    }

    /* renamed from: n */
    public final void m28752n(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f9796a.mo28856s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).booleanValue();
                i3++;
            }
            this.f9796a.mo28854u(i3);
            while (i2 < list.size()) {
                this.f9796a.mo28867h(list.get(i2).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9796a.mo28866i(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    /* renamed from: o */
    public final void m28751o(int i, AbstractC3909n7 abstractC3909n7) throws IOException {
        this.f9796a.mo28865j(i, abstractC3909n7);
    }

    /* renamed from: p */
    public final void m28750p(int i, List<AbstractC3909n7> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f9796a.mo28865j(i, list.get(i2));
        }
    }

    /* renamed from: q */
    public final void m28749q(int i, double d) throws IOException {
        this.f9796a.mo28862m(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: r */
    public final void m28748r(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f9796a.mo28856s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).doubleValue();
                i3 += 8;
            }
            this.f9796a.mo28854u(i3);
            while (i2 < list.size()) {
                this.f9796a.mo28861n(Double.doubleToRawLongBits(list.get(i2).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9796a.mo28862m(i, Double.doubleToRawLongBits(list.get(i2).doubleValue()));
            i2++;
        }
    }

    @Deprecated
    /* renamed from: s */
    public final void m28747s(int i) throws IOException {
        this.f9796a.mo28856s(i, 4);
    }

    /* renamed from: t */
    public final void m28746t(int i, int i2) throws IOException {
        this.f9796a.mo28860o(i, i2);
    }

    /* renamed from: u */
    public final void m28745u(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f9796a.mo28856s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC4019u7.m28849z(list.get(i4).intValue());
            }
            this.f9796a.mo28854u(i3);
            while (i2 < list.size()) {
                this.f9796a.mo28859p(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9796a.mo28860o(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: v */
    public final void m28744v(int i, int i2) throws IOException {
        this.f9796a.mo28864k(i, i2);
    }

    /* renamed from: w */
    public final void m28743w(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f9796a.mo28856s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += 4;
            }
            this.f9796a.mo28854u(i3);
            while (i2 < list.size()) {
                this.f9796a.mo28863l(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9796a.mo28864k(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: x */
    public final void m28742x(int i, long j) throws IOException {
        this.f9796a.mo28862m(i, j);
    }

    /* renamed from: y */
    public final void m28741y(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f9796a.mo28856s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += 8;
            }
            this.f9796a.mo28854u(i3);
            while (i2 < list.size()) {
                this.f9796a.mo28861n(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9796a.mo28862m(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: z */
    public final void m28740z(int i, float f) throws IOException {
        this.f9796a.mo28864k(i, Float.floatToRawIntBits(f));
    }
}
