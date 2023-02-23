package com.google.protobuf;

import com.google.protobuf.C7064k0;
import com.google.protobuf.C7118t1;
import com.google.protobuf.InterfaceC7131u1;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CodedOutputStreamWriter.java */
/* renamed from: com.google.protobuf.l */
/* loaded from: classes2.dex */
public final class C7074l implements InterfaceC7131u1 {

    /* renamed from: a */
    private final CodedOutputStream f16896a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CodedOutputStreamWriter.java */
    /* renamed from: com.google.protobuf.l$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C7075a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16897a;

        static {
            int[] iArr = new int[C7118t1.EnumC7120b.values().length];
            f16897a = iArr;
            try {
                iArr[C7118t1.EnumC7120b.f16950B.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16897a[C7118t1.EnumC7120b.f16949A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16897a[C7118t1.EnumC7120b.f16966y.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16897a[C7118t1.EnumC7120b.f16957I.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16897a[C7118t1.EnumC7120b.f16959K.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16897a[C7118t1.EnumC7120b.f16955G.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16897a[C7118t1.EnumC7120b.f16967z.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16897a[C7118t1.EnumC7120b.f16964w.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16897a[C7118t1.EnumC7120b.f16958J.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16897a[C7118t1.EnumC7120b.f16960L.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f16897a[C7118t1.EnumC7120b.f16965x.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f16897a[C7118t1.EnumC7120b.f16951C.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private C7074l(CodedOutputStream codedOutputStream) {
        C6997a0.m20234b(codedOutputStream, "output");
        CodedOutputStream codedOutputStream2 = codedOutputStream;
        this.f16896a = codedOutputStream2;
        codedOutputStream2.f16743a = this;
    }

    /* renamed from: P */
    public static C7074l m19841P(CodedOutputStream codedOutputStream) {
        C7074l c7074l = codedOutputStream.f16743a;
        return c7074l != null ? c7074l : new C7074l(codedOutputStream);
    }

    /* renamed from: Q */
    private <V> void m19840Q(int i, boolean z, V v, C7064k0.C7065a<Boolean, V> c7065a) throws IOException {
        this.f16896a.mo20279X0(i, 2);
        this.f16896a.mo20277Z0(C7064k0.m19870b(c7065a, Boolean.valueOf(z), v));
        C7064k0.m19867e(this.f16896a, c7065a, Boolean.valueOf(z), v);
    }

    /* renamed from: R */
    private <V> void m19839R(int i, C7064k0.C7065a<Integer, V> c7065a, Map<Integer, V> map) throws IOException {
        int size = map.size();
        int[] iArr = new int[size];
        int i2 = 0;
        for (Integer num : map.keySet()) {
            iArr[i2] = num.intValue();
            i2++;
        }
        Arrays.sort(iArr);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            V v = map.get(Integer.valueOf(i4));
            this.f16896a.mo20279X0(i, 2);
            this.f16896a.mo20277Z0(C7064k0.m19870b(c7065a, Integer.valueOf(i4), v));
            C7064k0.m19867e(this.f16896a, c7065a, Integer.valueOf(i4), v);
        }
    }

    /* renamed from: S */
    private <V> void m19838S(int i, C7064k0.C7065a<Long, V> c7065a, Map<Long, V> map) throws IOException {
        int size = map.size();
        long[] jArr = new long[size];
        int i2 = 0;
        for (Long l : map.keySet()) {
            jArr[i2] = l.longValue();
            i2++;
        }
        Arrays.sort(jArr);
        for (int i3 = 0; i3 < size; i3++) {
            long j = jArr[i3];
            V v = map.get(Long.valueOf(j));
            this.f16896a.mo20279X0(i, 2);
            this.f16896a.mo20277Z0(C7064k0.m19870b(c7065a, Long.valueOf(j), v));
            C7064k0.m19867e(this.f16896a, c7065a, Long.valueOf(j), v);
        }
    }

    /* renamed from: T */
    private <K, V> void m19837T(int i, C7064k0.C7065a<K, V> c7065a, Map<K, V> map) throws IOException {
        switch (C7075a.f16897a[c7065a.f16876a.ordinal()]) {
            case 1:
                V v = map.get(Boolean.FALSE);
                if (v != null) {
                    m19840Q(i, false, v, c7065a);
                }
                V v2 = map.get(Boolean.TRUE);
                if (v2 != null) {
                    m19840Q(i, true, v2, c7065a);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                m19839R(i, c7065a, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                m19838S(i, c7065a, map);
                return;
            case 12:
                m19836U(i, c7065a, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + c7065a.f16876a);
        }
    }

    /* renamed from: U */
    private <V> void m19836U(int i, C7064k0.C7065a<String, V> c7065a, Map<String, V> map) throws IOException {
        int size = map.size();
        String[] strArr = new String[size];
        int i2 = 0;
        for (String str : map.keySet()) {
            strArr[i2] = str;
            i2++;
        }
        Arrays.sort(strArr);
        for (int i3 = 0; i3 < size; i3++) {
            String str2 = strArr[i3];
            V v = map.get(str2);
            this.f16896a.mo20279X0(i, 2);
            this.f16896a.mo20277Z0(C7064k0.m19870b(c7065a, str2, v));
            C7064k0.m19867e(this.f16896a, c7065a, str2, v);
        }
    }

    /* renamed from: V */
    private void m19835V(int i, Object obj) throws IOException {
        if (obj instanceof String) {
            this.f16896a.mo20281V0(i, (String) obj);
        } else {
            this.f16896a.mo20264p0(i, (AbstractC7039i) obj);
        }
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: A */
    public void mo19467A(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16896a.mo20279X0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m20315o(list.get(i4).intValue());
            }
            this.f16896a.mo20277Z0(i3);
            while (i2 < list.size()) {
                this.f16896a.mo20261w0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16896a.mo20262v0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: B */
    public void mo19466B(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16896a.mo20279X0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m20330f(list.get(i4).booleanValue());
            }
            this.f16896a.mo20277Z0(i3);
            while (i2 < list.size()) {
                this.f16896a.m20318m0(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16896a.mo20270l0(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: C */
    public <K, V> void mo19465C(int i, C7064k0.C7065a<K, V> c7065a, Map<K, V> map) throws IOException {
        if (this.f16896a.m20329f0()) {
            m19837T(i, c7065a, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f16896a.mo20279X0(i, 2);
            this.f16896a.mo20277Z0(C7064k0.m19870b(c7065a, entry.getKey(), entry.getValue()));
            C7064k0.m19867e(this.f16896a, c7065a, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: D */
    public void mo19464D(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16896a.mo20279X0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m20339Y(list.get(i4).intValue());
            }
            this.f16896a.mo20277Z0(i3);
            while (i2 < list.size()) {
                this.f16896a.mo20277Z0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16896a.mo20278Y0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: E */
    public void mo19463E(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16896a.mo20279X0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m20346T(list.get(i4).longValue());
            }
            this.f16896a.mo20277Z0(i3);
            while (i2 < list.size()) {
                this.f16896a.m20343U0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16896a.m20345T0(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: F */
    public void mo19462F(int i, long j) throws IOException {
        this.f16896a.m20345T0(i, j);
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: G */
    public void mo19461G(int i, float f) throws IOException {
        this.f16896a.m20299z0(i, f);
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: H */
    public void mo19460H(int i) throws IOException {
        this.f16896a.mo20279X0(i, 4);
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: I */
    public void mo19459I(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16896a.mo20279X0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m20350R(list.get(i4).intValue());
            }
            this.f16896a.mo20277Z0(i3);
            while (i2 < list.size()) {
                this.f16896a.m20347S0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16896a.m20349R0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: J */
    public void mo19458J(int i, int i2) throws IOException {
        this.f16896a.m20307t0(i, i2);
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: K */
    public void mo19457K(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16896a.mo20279X0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m20300z(list.get(i4).longValue());
            }
            this.f16896a.mo20277Z0(i3);
            while (i2 < list.size()) {
                this.f16896a.m20363I0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16896a.m20365H0(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: L */
    public void mo19456L(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16896a.mo20279X0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m20319m(list.get(i4).intValue());
            }
            this.f16896a.mo20277Z0(i3);
            while (i2 < list.size()) {
                this.f16896a.m20305u0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16896a.m20307t0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: M */
    public void mo19455M(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16896a.mo20279X0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m20321k(list.get(i4).doubleValue());
            }
            this.f16896a.mo20277Z0(i3);
            while (i2 < list.size()) {
                this.f16896a.m20309s0(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16896a.m20311r0(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: N */
    public void mo19454N(int i, int i2) throws IOException {
        this.f16896a.m20349R0(i, i2);
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: O */
    public void mo19453O(int i, List<AbstractC7039i> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f16896a.mo20264p0(i, list.get(i2));
        }
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: a */
    public void mo19452a(int i, List<?> list, InterfaceC7038h1 interfaceC7038h1) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo19443j(i, list.get(i2), interfaceC7038h1);
        }
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: b */
    public void mo19451b(int i, List<?> list, InterfaceC7038h1 interfaceC7038h1) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo19434s(i, list.get(i2), interfaceC7038h1);
        }
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: c */
    public void mo19450c(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16896a.mo20279X0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m20310s(list.get(i4).floatValue());
            }
            this.f16896a.mo20277Z0(i3);
            while (i2 < list.size()) {
                this.f16896a.m20377A0(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16896a.m20299z0(i, list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: d */
    public void mo19449d(int i, int i2) throws IOException {
        this.f16896a.mo20278Y0(i, i2);
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: e */
    public final void mo19448e(int i, Object obj) throws IOException {
        if (obj instanceof AbstractC7039i) {
            this.f16896a.mo20282M0(i, (AbstractC7039i) obj);
        } else {
            this.f16896a.mo20283L0(i, (InterfaceC7100r0) obj);
        }
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: f */
    public void mo19447f(int i, int i2) throws IOException {
        this.f16896a.mo20262v0(i, i2);
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: g */
    public void mo19446g(int i, double d) throws IOException {
        this.f16896a.m20311r0(i, d);
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: h */
    public void mo19445h(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16896a.mo20279X0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m20354P(list.get(i4).longValue());
            }
            this.f16896a.mo20277Z0(i3);
            while (i2 < list.size()) {
                this.f16896a.m20351Q0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16896a.m20353P0(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: i */
    public void mo19444i(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16896a.mo20279X0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m20337a0(list.get(i4).longValue());
            }
            this.f16896a.mo20277Z0(i3);
            while (i2 < list.size()) {
                this.f16896a.mo20275b1(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16896a.mo20276a1(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: j */
    public void mo19443j(int i, Object obj, InterfaceC7038h1 interfaceC7038h1) throws IOException {
        this.f16896a.mo20285J0(i, (InterfaceC7100r0) obj, interfaceC7038h1);
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: k */
    public void mo19442k(int i, long j) throws IOException {
        this.f16896a.mo20260x0(i, j);
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: l */
    public InterfaceC7131u1.EnumC7132a mo19441l() {
        return InterfaceC7131u1.EnumC7132a.ASCENDING;
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: m */
    public void mo19440m(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof InterfaceC7031g0) {
            InterfaceC7031g0 interfaceC7031g0 = (InterfaceC7031g0) list;
            while (i2 < list.size()) {
                m19835V(i, interfaceC7031g0.mo19730U(i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16896a.mo20281V0(i, list.get(i2));
            i2++;
        }
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: n */
    public void mo19439n(int i, String str) throws IOException {
        this.f16896a.mo20281V0(i, str);
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: o */
    public void mo19438o(int i, long j) throws IOException {
        this.f16896a.mo20276a1(i, j);
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: p */
    public void mo19437p(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16896a.mo20279X0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m20302x(list.get(i4).intValue());
            }
            this.f16896a.mo20277Z0(i3);
            while (i2 < list.size()) {
                this.f16896a.mo20286G0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16896a.mo20287F0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: q */
    public void mo19436q(int i, long j) throws IOException {
        this.f16896a.m20365H0(i, j);
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: r */
    public void mo19435r(int i, boolean z) throws IOException {
        this.f16896a.mo20270l0(i, z);
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: s */
    public void mo19434s(int i, Object obj, InterfaceC7038h1 interfaceC7038h1) throws IOException {
        this.f16896a.m20373C0(i, (InterfaceC7100r0) obj, interfaceC7038h1);
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: t */
    public void mo19433t(int i, int i2) throws IOException {
        this.f16896a.m20357N0(i, i2);
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: u */
    public void mo19432u(int i) throws IOException {
        this.f16896a.mo20279X0(i, 3);
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: v */
    public void mo19431v(int i, AbstractC7039i abstractC7039i) throws IOException {
        this.f16896a.mo20264p0(i, abstractC7039i);
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: w */
    public void mo19430w(int i, int i2) throws IOException {
        this.f16896a.mo20287F0(i, i2);
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: x */
    public void mo19429x(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16896a.mo20279X0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m20313q(list.get(i4).longValue());
            }
            this.f16896a.mo20277Z0(i3);
            while (i2 < list.size()) {
                this.f16896a.mo20259y0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16896a.mo20260x0(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: y */
    public void mo19428y(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16896a.mo20279X0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m20358N(list.get(i4).intValue());
            }
            this.f16896a.mo20277Z0(i3);
            while (i2 < list.size()) {
                this.f16896a.m20355O0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16896a.m20357N0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.InterfaceC7131u1
    /* renamed from: z */
    public void mo19427z(int i, long j) throws IOException {
        this.f16896a.m20353P0(i, j);
    }
}
