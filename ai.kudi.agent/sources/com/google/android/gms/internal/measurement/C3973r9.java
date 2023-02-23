package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.r9 */
/* loaded from: classes2.dex */
public final class C3973r9<T> implements InterfaceC4101z9<T> {

    /* renamed from: o */
    private static final int[] f9651o = new int[0];

    /* renamed from: p */
    private static final Unsafe f9652p = C4070xa.m28636l();

    /* renamed from: a */
    private final int[] f9653a;

    /* renamed from: b */
    private final Object[] f9654b;

    /* renamed from: c */
    private final int f9655c;

    /* renamed from: d */
    private final int f9656d;

    /* renamed from: e */
    private final InterfaceC3927o9 f9657e;

    /* renamed from: f */
    private final boolean f9658f;

    /* renamed from: g */
    private final boolean f9659g;

    /* renamed from: h */
    private final int[] f9660h;

    /* renamed from: i */
    private final int f9661i;

    /* renamed from: j */
    private final int f9662j;

    /* renamed from: k */
    private final AbstractC3723b9 f9663k;

    /* renamed from: l */
    private final AbstractC3912na<?, ?> f9664l;

    /* renamed from: m */
    private final AbstractC3705a8<?> f9665m;

    /* renamed from: n */
    private final C3832i9 f9666n;

    /* JADX WARN: Multi-variable type inference failed */
    private C3973r9(int[] iArr, int[] iArr2, Object[] objArr, int i, int i2, InterfaceC3927o9 interfaceC3927o9, boolean z, boolean z2, int[] iArr3, int i3, int i4, C4005t9 c4005t9, AbstractC3723b9 abstractC3723b9, AbstractC3912na<?, ?> abstractC3912na, AbstractC3705a8<?> abstractC3705a8, C3832i9 c3832i9) {
        this.f9653a = iArr;
        this.f9654b = iArr2;
        this.f9655c = objArr;
        this.f9656d = i;
        this.f9659g = interfaceC3927o9;
        boolean z3 = false;
        if (abstractC3912na != 0 && abstractC3912na.mo29795c((InterfaceC3927o9) i2)) {
            z3 = true;
        }
        this.f9658f = z3;
        this.f9660h = z2;
        this.f9661i = iArr3;
        this.f9662j = i3;
        this.f9663k = c4005t9;
        this.f9664l = abstractC3723b9;
        this.f9665m = abstractC3912na;
        this.f9657e = i2;
        this.f9666n = abstractC3705a8;
    }

    /* renamed from: A */
    private final void m29026A(T t, C4035v7 c4035v7) throws IOException {
        int i;
        if (!this.f9658f) {
            int length = this.f9653a.length;
            Unsafe unsafe = f9652p;
            int i2 = 1048575;
            int i3 = 0;
            int i4 = 0;
            int i5 = 1048575;
            while (i3 < length) {
                int m29005k = m29005k(i3);
                int i6 = this.f9653a[i3];
                int m29006j = m29006j(m29005k);
                if (m29006j <= 17) {
                    int i7 = this.f9653a[i3 + 2];
                    int i8 = i7 & i2;
                    if (i8 != i5) {
                        i4 = unsafe.getInt(t, i8);
                        i5 = i8;
                    }
                    i = 1 << (i7 >>> 20);
                } else {
                    i = 0;
                }
                long j = m29005k & i2;
                switch (m29006j) {
                    case 0:
                        if ((i4 & i) != 0) {
                            c4035v7.m28749q(i6, C4070xa.m28642f(t, j));
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 1:
                        if ((i4 & i) != 0) {
                            c4035v7.m28740z(i6, C4070xa.m28641g(t, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 2:
                        if ((i4 & i) != 0) {
                            c4035v7.m28772E(i6, unsafe.getLong(t, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 3:
                        if ((i4 & i) != 0) {
                            c4035v7.m28756j(i6, unsafe.getLong(t, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 4:
                        if ((i4 & i) != 0) {
                            c4035v7.m28774C(i6, unsafe.getInt(t, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 5:
                        if ((i4 & i) != 0) {
                            c4035v7.m28742x(i6, unsafe.getLong(t, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 6:
                        if ((i4 & i) != 0) {
                            c4035v7.m28744v(i6, unsafe.getInt(t, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 7:
                        if ((i4 & i) != 0) {
                            c4035v7.m28753m(i6, C4070xa.m28651B(t, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 8:
                        if ((i4 & i) != 0) {
                            m29024C(i6, unsafe.getObject(t, j), c4035v7);
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 9:
                        if ((i4 & i) != 0) {
                            c4035v7.m28770G(i6, unsafe.getObject(t, j), m29002n(i3));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 10:
                        if ((i4 & i) != 0) {
                            c4035v7.m28751o(i6, (AbstractC3909n7) unsafe.getObject(t, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 11:
                        if ((i4 & i) != 0) {
                            c4035v7.m28758h(i6, unsafe.getInt(t, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 12:
                        if ((i4 & i) != 0) {
                            c4035v7.m28746t(i6, unsafe.getInt(t, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 13:
                        if ((i4 & i) != 0) {
                            c4035v7.m28769H(i6, unsafe.getInt(t, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 14:
                        if ((i4 & i) != 0) {
                            c4035v7.m28767J(i6, unsafe.getLong(t, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 15:
                        if ((i4 & i) != 0) {
                            c4035v7.m28765a(i6, unsafe.getInt(t, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 16:
                        if ((i4 & i) != 0) {
                            c4035v7.m28763c(i6, unsafe.getLong(t, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 17:
                        if ((i4 & i) != 0) {
                            c4035v7.m28775B(i6, unsafe.getObject(t, j), m29002n(i3));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 18:
                        C3724ba.m29753l(this.f9653a[i3], (List) unsafe.getObject(t, j), c4035v7, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 19:
                        C3724ba.m29749p(this.f9653a[i3], (List) unsafe.getObject(t, j), c4035v7, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 20:
                        C3724ba.m29746s(this.f9653a[i3], (List) unsafe.getObject(t, j), c4035v7, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 21:
                        C3724ba.m29791B(this.f9653a[i3], (List) unsafe.getObject(t, j), c4035v7, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 22:
                        C3724ba.m29747r(this.f9653a[i3], (List) unsafe.getObject(t, j), c4035v7, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 23:
                        C3724ba.m29750o(this.f9653a[i3], (List) unsafe.getObject(t, j), c4035v7, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 24:
                        C3724ba.m29751n(this.f9653a[i3], (List) unsafe.getObject(t, j), c4035v7, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 25:
                        C3724ba.m29755j(this.f9653a[i3], (List) unsafe.getObject(t, j), c4035v7, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 26:
                        C3724ba.m29740y(this.f9653a[i3], (List) unsafe.getObject(t, j), c4035v7);
                        break;
                    case 27:
                        C3724ba.m29745t(this.f9653a[i3], (List) unsafe.getObject(t, j), c4035v7, m29002n(i3));
                        break;
                    case 28:
                        C3724ba.m29754k(this.f9653a[i3], (List) unsafe.getObject(t, j), c4035v7);
                        break;
                    case 29:
                        C3724ba.m29739z(this.f9653a[i3], (List) unsafe.getObject(t, j), c4035v7, false);
                        break;
                    case 30:
                        C3724ba.m29752m(this.f9653a[i3], (List) unsafe.getObject(t, j), c4035v7, false);
                        break;
                    case 31:
                        C3724ba.m29744u(this.f9653a[i3], (List) unsafe.getObject(t, j), c4035v7, false);
                        break;
                    case 32:
                        C3724ba.m29743v(this.f9653a[i3], (List) unsafe.getObject(t, j), c4035v7, false);
                        break;
                    case 33:
                        C3724ba.m29742w(this.f9653a[i3], (List) unsafe.getObject(t, j), c4035v7, false);
                        break;
                    case 34:
                        C3724ba.m29741x(this.f9653a[i3], (List) unsafe.getObject(t, j), c4035v7, false);
                        break;
                    case 35:
                        C3724ba.m29753l(this.f9653a[i3], (List) unsafe.getObject(t, j), c4035v7, true);
                        break;
                    case 36:
                        C3724ba.m29749p(this.f9653a[i3], (List) unsafe.getObject(t, j), c4035v7, true);
                        break;
                    case 37:
                        C3724ba.m29746s(this.f9653a[i3], (List) unsafe.getObject(t, j), c4035v7, true);
                        break;
                    case 38:
                        C3724ba.m29791B(this.f9653a[i3], (List) unsafe.getObject(t, j), c4035v7, true);
                        break;
                    case 39:
                        C3724ba.m29747r(this.f9653a[i3], (List) unsafe.getObject(t, j), c4035v7, true);
                        break;
                    case 40:
                        C3724ba.m29750o(this.f9653a[i3], (List) unsafe.getObject(t, j), c4035v7, true);
                        break;
                    case 41:
                        C3724ba.m29751n(this.f9653a[i3], (List) unsafe.getObject(t, j), c4035v7, true);
                        break;
                    case 42:
                        C3724ba.m29755j(this.f9653a[i3], (List) unsafe.getObject(t, j), c4035v7, true);
                        break;
                    case 43:
                        C3724ba.m29739z(this.f9653a[i3], (List) unsafe.getObject(t, j), c4035v7, true);
                        break;
                    case 44:
                        C3724ba.m29752m(this.f9653a[i3], (List) unsafe.getObject(t, j), c4035v7, true);
                        break;
                    case 45:
                        C3724ba.m29744u(this.f9653a[i3], (List) unsafe.getObject(t, j), c4035v7, true);
                        break;
                    case 46:
                        C3724ba.m29743v(this.f9653a[i3], (List) unsafe.getObject(t, j), c4035v7, true);
                        break;
                    case 47:
                        C3724ba.m29742w(this.f9653a[i3], (List) unsafe.getObject(t, j), c4035v7, true);
                        break;
                    case 48:
                        C3724ba.m29741x(this.f9653a[i3], (List) unsafe.getObject(t, j), c4035v7, true);
                        break;
                    case 49:
                        C3724ba.m29748q(this.f9653a[i3], (List) unsafe.getObject(t, j), c4035v7, m29002n(i3));
                        break;
                    case 50:
                        m29025B(c4035v7, i6, unsafe.getObject(t, j), i3);
                        break;
                    case 51:
                        if (m28991y(t, i6, i3)) {
                            c4035v7.m28749q(i6, m29019H(t, j));
                            break;
                        }
                        break;
                    case 52:
                        if (m28991y(t, i6, i3)) {
                            c4035v7.m28740z(i6, m29018I(t, j));
                            break;
                        }
                        break;
                    case 53:
                        if (m28991y(t, i6, i3)) {
                            c4035v7.m28772E(i6, m29004l(t, j));
                            break;
                        }
                        break;
                    case 54:
                        if (m28991y(t, i6, i3)) {
                            c4035v7.m28756j(i6, m29004l(t, j));
                            break;
                        }
                        break;
                    case 55:
                        if (m28991y(t, i6, i3)) {
                            c4035v7.m28774C(i6, m29015L(t, j));
                            break;
                        }
                        break;
                    case 56:
                        if (m28991y(t, i6, i3)) {
                            c4035v7.m28742x(i6, m29004l(t, j));
                            break;
                        }
                        break;
                    case 57:
                        if (m28991y(t, i6, i3)) {
                            c4035v7.m28744v(i6, m29015L(t, j));
                            break;
                        }
                        break;
                    case 58:
                        if (m28991y(t, i6, i3)) {
                            c4035v7.m28753m(i6, m28990z(t, j));
                            break;
                        }
                        break;
                    case 59:
                        if (m28991y(t, i6, i3)) {
                            m29024C(i6, unsafe.getObject(t, j), c4035v7);
                            break;
                        }
                        break;
                    case 60:
                        if (m28991y(t, i6, i3)) {
                            c4035v7.m28770G(i6, unsafe.getObject(t, j), m29002n(i3));
                            break;
                        }
                        break;
                    case 61:
                        if (m28991y(t, i6, i3)) {
                            c4035v7.m28751o(i6, (AbstractC3909n7) unsafe.getObject(t, j));
                            break;
                        }
                        break;
                    case 62:
                        if (m28991y(t, i6, i3)) {
                            c4035v7.m28758h(i6, m29015L(t, j));
                            break;
                        }
                        break;
                    case 63:
                        if (m28991y(t, i6, i3)) {
                            c4035v7.m28746t(i6, m29015L(t, j));
                            break;
                        }
                        break;
                    case 64:
                        if (m28991y(t, i6, i3)) {
                            c4035v7.m28769H(i6, m29015L(t, j));
                            break;
                        }
                        break;
                    case 65:
                        if (m28991y(t, i6, i3)) {
                            c4035v7.m28767J(i6, m29004l(t, j));
                            break;
                        }
                        break;
                    case 66:
                        if (m28991y(t, i6, i3)) {
                            c4035v7.m28765a(i6, m29015L(t, j));
                            break;
                        }
                        break;
                    case 67:
                        if (m28991y(t, i6, i3)) {
                            c4035v7.m28763c(i6, m29004l(t, j));
                            break;
                        }
                        break;
                    case 68:
                        if (m28991y(t, i6, i3)) {
                            c4035v7.m28775B(i6, unsafe.getObject(t, j), m29002n(i3));
                            break;
                        }
                        break;
                }
                i3 += 3;
                i2 = 1048575;
            }
            AbstractC3912na<?, ?> abstractC3912na = this.f9664l;
            abstractC3912na.mo29093i(abstractC3912na.mo29099c(t), c4035v7);
            return;
        }
        this.f9665m.mo29797a(t);
        throw null;
    }

    /* renamed from: B */
    private final <K, V> void m29025B(C4035v7 c4035v7, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        C3800g9 c3800g9 = (C3800g9) m29001o(i2);
        throw null;
    }

    /* renamed from: C */
    private static final void m29024C(int i, Object obj, C4035v7 c4035v7) throws IOException {
        if (obj instanceof String) {
            c4035v7.m28760f(i, (String) obj);
        } else {
            c4035v7.m28751o(i, (AbstractC3909n7) obj);
        }
    }

    /* renamed from: E */
    static C3928oa m29022E(Object obj) {
        AbstractC3894m8 abstractC3894m8 = (AbstractC3894m8) obj;
        C3928oa c3928oa = abstractC3894m8.zzc;
        if (c3928oa == C3928oa.m29243c()) {
            C3928oa m29241e = C3928oa.m29241e();
            abstractC3894m8.zzc = m29241e;
            return m29241e;
        }
        return c3928oa;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static <T> C3973r9<T> m29021F(Class<T> cls, InterfaceC3864k9 interfaceC3864k9, C4005t9 c4005t9, AbstractC3723b9 abstractC3723b9, AbstractC3912na<?, ?> abstractC3912na, AbstractC3705a8<?> abstractC3705a8, C3832i9 c3832i9) {
        if (interfaceC3864k9 instanceof C4085y9) {
            return m29020G((C4085y9) interfaceC3864k9, c4005t9, abstractC3723b9, abstractC3912na, abstractC3705a8, c3832i9);
        }
        C3865ka c3865ka = (C3865ka) interfaceC3864k9;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0385  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <T> com.google.android.gms.internal.measurement.C3973r9<T> m29020G(com.google.android.gms.internal.measurement.C4085y9 r34, com.google.android.gms.internal.measurement.C4005t9 r35, com.google.android.gms.internal.measurement.AbstractC3723b9 r36, com.google.android.gms.internal.measurement.AbstractC3912na<?, ?> r37, com.google.android.gms.internal.measurement.AbstractC3705a8<?> r38, com.google.android.gms.internal.measurement.C3832i9 r39) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3973r9.m29020G(com.google.android.gms.internal.measurement.y9, com.google.android.gms.internal.measurement.t9, com.google.android.gms.internal.measurement.b9, com.google.android.gms.internal.measurement.na, com.google.android.gms.internal.measurement.a8, com.google.android.gms.internal.measurement.i9):com.google.android.gms.internal.measurement.r9");
    }

    /* renamed from: H */
    private static <T> double m29019H(T t, long j) {
        return ((Double) C4070xa.m28637k(t, j)).doubleValue();
    }

    /* renamed from: I */
    private static <T> float m29018I(T t, long j) {
        return ((Float) C4070xa.m28637k(t, j)).floatValue();
    }

    /* renamed from: J */
    private final int m29017J(T t) {
        int i;
        int m28874a;
        int m28874a2;
        int m28874a3;
        int m28873b;
        int m28874a4;
        int m28849z;
        int m28874a5;
        int m28874a6;
        int mo29340f;
        int m28874a7;
        int m29776Q;
        int m28875D;
        int m28874a8;
        int i2;
        Unsafe unsafe = f9652p;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        for (int i6 = 0; i6 < this.f9653a.length; i6 += 3) {
            int m29005k = m29005k(i6);
            int i7 = this.f9653a[i6];
            int m29006j = m29006j(m29005k);
            if (m29006j <= 17) {
                int i8 = this.f9653a[i6 + 2];
                int i9 = i8 & 1048575;
                i = 1 << (i8 >>> 20);
                if (i9 != i5) {
                    i4 = unsafe.getInt(t, i9);
                    i5 = i9;
                }
            } else {
                i = 0;
            }
            long j = m29005k & 1048575;
            switch (m29006j) {
                case 0:
                    if ((i4 & i) != 0) {
                        m28874a = AbstractC4019u7.m28874a(i7 << 3);
                        m29776Q = m28874a + 8;
                        break;
                    } else {
                        continue;
                    }
                case 1:
                    if ((i4 & i) != 0) {
                        m28874a2 = AbstractC4019u7.m28874a(i7 << 3);
                        m29776Q = m28874a2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if ((i4 & i) != 0) {
                        long j2 = unsafe.getLong(t, j);
                        m28874a3 = AbstractC4019u7.m28874a(i7 << 3);
                        m28873b = AbstractC4019u7.m28873b(j2);
                        m29776Q = m28874a3 + m28873b;
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if ((i4 & i) != 0) {
                        long j3 = unsafe.getLong(t, j);
                        m28874a3 = AbstractC4019u7.m28874a(i7 << 3);
                        m28873b = AbstractC4019u7.m28873b(j3);
                        m29776Q = m28874a3 + m28873b;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if ((i4 & i) != 0) {
                        int i10 = unsafe.getInt(t, j);
                        m28874a4 = AbstractC4019u7.m28874a(i7 << 3);
                        m28849z = AbstractC4019u7.m28849z(i10);
                        i2 = m28874a4 + m28849z;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 5:
                    if ((i4 & i) != 0) {
                        m28874a = AbstractC4019u7.m28874a(i7 << 3);
                        m29776Q = m28874a + 8;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if ((i4 & i) != 0) {
                        m28874a2 = AbstractC4019u7.m28874a(i7 << 3);
                        m29776Q = m28874a2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if ((i4 & i) != 0) {
                        m28874a5 = AbstractC4019u7.m28874a(i7 << 3);
                        m29776Q = m28874a5 + 1;
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if ((i4 & i) != 0) {
                        Object object = unsafe.getObject(t, j);
                        if (object instanceof AbstractC3909n7) {
                            m28874a6 = AbstractC4019u7.m28874a(i7 << 3);
                            mo29340f = ((AbstractC3909n7) object).mo29340f();
                            m28874a7 = AbstractC4019u7.m28874a(mo29340f);
                            i2 = m28874a6 + m28874a7 + mo29340f;
                            i3 += i2;
                        } else {
                            m28874a4 = AbstractC4019u7.m28874a(i7 << 3);
                            m28849z = AbstractC4019u7.m28876C((String) object);
                            i2 = m28874a4 + m28849z;
                            i3 += i2;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if ((i4 & i) != 0) {
                        m29776Q = C3724ba.m29776Q(i7, unsafe.getObject(t, j), m29002n(i6));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if ((i4 & i) != 0) {
                        m28874a6 = AbstractC4019u7.m28874a(i7 << 3);
                        mo29340f = ((AbstractC3909n7) unsafe.getObject(t, j)).mo29340f();
                        m28874a7 = AbstractC4019u7.m28874a(mo29340f);
                        i2 = m28874a6 + m28874a7 + mo29340f;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 11:
                    if ((i4 & i) != 0) {
                        int i11 = unsafe.getInt(t, j);
                        m28874a4 = AbstractC4019u7.m28874a(i7 << 3);
                        m28849z = AbstractC4019u7.m28874a(i11);
                        i2 = m28874a4 + m28849z;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 12:
                    if ((i4 & i) != 0) {
                        int i12 = unsafe.getInt(t, j);
                        m28874a4 = AbstractC4019u7.m28874a(i7 << 3);
                        m28849z = AbstractC4019u7.m28849z(i12);
                        i2 = m28874a4 + m28849z;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 13:
                    if ((i4 & i) != 0) {
                        m28874a2 = AbstractC4019u7.m28874a(i7 << 3);
                        m29776Q = m28874a2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if ((i4 & i) != 0) {
                        m28874a = AbstractC4019u7.m28874a(i7 << 3);
                        m29776Q = m28874a + 8;
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if ((i4 & i) != 0) {
                        int i13 = unsafe.getInt(t, j);
                        m28874a4 = AbstractC4019u7.m28874a(i7 << 3);
                        m28849z = AbstractC4019u7.m28874a((i13 >> 31) ^ (i13 + i13));
                        i2 = m28874a4 + m28849z;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 16:
                    if ((i4 & i) != 0) {
                        long j4 = unsafe.getLong(t, j);
                        m28874a4 = AbstractC4019u7.m28874a(i7 << 3);
                        m28849z = AbstractC4019u7.m28873b((j4 >> 63) ^ (j4 + j4));
                        i2 = m28874a4 + m28849z;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 17:
                    if ((i4 & i) != 0) {
                        m29776Q = AbstractC4019u7.m28850y(i7, (InterfaceC3927o9) unsafe.getObject(t, j), m29002n(i6));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    m29776Q = C3724ba.m29783J(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 19:
                    m29776Q = C3724ba.m29785H(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 20:
                    m29776Q = C3724ba.m29778O(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 21:
                    m29776Q = C3724ba.m29767Z(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 22:
                    m29776Q = C3724ba.m29780M(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 23:
                    m29776Q = C3724ba.m29783J(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 24:
                    m29776Q = C3724ba.m29785H(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 25:
                    m29776Q = C3724ba.m29792A(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 26:
                    m29776Q = C3724ba.m29770W(i7, (List) unsafe.getObject(t, j));
                    break;
                case 27:
                    m29776Q = C3724ba.m29775R(i7, (List) unsafe.getObject(t, j), m29002n(i6));
                    break;
                case 28:
                    m29776Q = C3724ba.m29788E(i7, (List) unsafe.getObject(t, j));
                    break;
                case 29:
                    m29776Q = C3724ba.m29769X(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 30:
                    m29776Q = C3724ba.m29787F(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 31:
                    m29776Q = C3724ba.m29785H(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 32:
                    m29776Q = C3724ba.m29783J(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 33:
                    m29776Q = C3724ba.m29774S(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 34:
                    m29776Q = C3724ba.m29772U(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 35:
                    m28849z = C3724ba.m29782K((List) unsafe.getObject(t, j));
                    if (m28849z > 0) {
                        m28875D = AbstractC4019u7.m28875D(i7);
                        m28874a8 = AbstractC4019u7.m28874a(m28849z);
                        m28874a4 = m28875D + m28874a8;
                        i2 = m28874a4 + m28849z;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 36:
                    m28849z = C3724ba.m29784I((List) unsafe.getObject(t, j));
                    if (m28849z > 0) {
                        m28875D = AbstractC4019u7.m28875D(i7);
                        m28874a8 = AbstractC4019u7.m28874a(m28849z);
                        m28874a4 = m28875D + m28874a8;
                        i2 = m28874a4 + m28849z;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 37:
                    m28849z = C3724ba.m29777P((List) unsafe.getObject(t, j));
                    if (m28849z > 0) {
                        m28875D = AbstractC4019u7.m28875D(i7);
                        m28874a8 = AbstractC4019u7.m28874a(m28849z);
                        m28874a4 = m28875D + m28874a8;
                        i2 = m28874a4 + m28849z;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 38:
                    m28849z = C3724ba.m29765a0((List) unsafe.getObject(t, j));
                    if (m28849z > 0) {
                        m28875D = AbstractC4019u7.m28875D(i7);
                        m28874a8 = AbstractC4019u7.m28874a(m28849z);
                        m28874a4 = m28875D + m28874a8;
                        i2 = m28874a4 + m28849z;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 39:
                    m28849z = C3724ba.m29779N((List) unsafe.getObject(t, j));
                    if (m28849z > 0) {
                        m28875D = AbstractC4019u7.m28875D(i7);
                        m28874a8 = AbstractC4019u7.m28874a(m28849z);
                        m28874a4 = m28875D + m28874a8;
                        i2 = m28874a4 + m28849z;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 40:
                    m28849z = C3724ba.m29782K((List) unsafe.getObject(t, j));
                    if (m28849z > 0) {
                        m28875D = AbstractC4019u7.m28875D(i7);
                        m28874a8 = AbstractC4019u7.m28874a(m28849z);
                        m28874a4 = m28875D + m28874a8;
                        i2 = m28874a4 + m28849z;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 41:
                    m28849z = C3724ba.m29784I((List) unsafe.getObject(t, j));
                    if (m28849z > 0) {
                        m28875D = AbstractC4019u7.m28875D(i7);
                        m28874a8 = AbstractC4019u7.m28874a(m28849z);
                        m28874a4 = m28875D + m28874a8;
                        i2 = m28874a4 + m28849z;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 42:
                    m28849z = C3724ba.m29789D((List) unsafe.getObject(t, j));
                    if (m28849z > 0) {
                        m28875D = AbstractC4019u7.m28875D(i7);
                        m28874a8 = AbstractC4019u7.m28874a(m28849z);
                        m28874a4 = m28875D + m28874a8;
                        i2 = m28874a4 + m28849z;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 43:
                    m28849z = C3724ba.m29768Y((List) unsafe.getObject(t, j));
                    if (m28849z > 0) {
                        m28875D = AbstractC4019u7.m28875D(i7);
                        m28874a8 = AbstractC4019u7.m28874a(m28849z);
                        m28874a4 = m28875D + m28874a8;
                        i2 = m28874a4 + m28849z;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 44:
                    m28849z = C3724ba.m29786G((List) unsafe.getObject(t, j));
                    if (m28849z > 0) {
                        m28875D = AbstractC4019u7.m28875D(i7);
                        m28874a8 = AbstractC4019u7.m28874a(m28849z);
                        m28874a4 = m28875D + m28874a8;
                        i2 = m28874a4 + m28849z;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 45:
                    m28849z = C3724ba.m29784I((List) unsafe.getObject(t, j));
                    if (m28849z > 0) {
                        m28875D = AbstractC4019u7.m28875D(i7);
                        m28874a8 = AbstractC4019u7.m28874a(m28849z);
                        m28874a4 = m28875D + m28874a8;
                        i2 = m28874a4 + m28849z;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 46:
                    m28849z = C3724ba.m29782K((List) unsafe.getObject(t, j));
                    if (m28849z > 0) {
                        m28875D = AbstractC4019u7.m28875D(i7);
                        m28874a8 = AbstractC4019u7.m28874a(m28849z);
                        m28874a4 = m28875D + m28874a8;
                        i2 = m28874a4 + m28849z;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 47:
                    m28849z = C3724ba.m29773T((List) unsafe.getObject(t, j));
                    if (m28849z > 0) {
                        m28875D = AbstractC4019u7.m28875D(i7);
                        m28874a8 = AbstractC4019u7.m28874a(m28849z);
                        m28874a4 = m28875D + m28874a8;
                        i2 = m28874a4 + m28849z;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 48:
                    m28849z = C3724ba.m29771V((List) unsafe.getObject(t, j));
                    if (m28849z > 0) {
                        m28875D = AbstractC4019u7.m28875D(i7);
                        m28874a8 = AbstractC4019u7.m28874a(m28849z);
                        m28874a4 = m28875D + m28874a8;
                        i2 = m28874a4 + m28849z;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 49:
                    m29776Q = C3724ba.m29781L(i7, (List) unsafe.getObject(t, j), m29002n(i6));
                    break;
                case 50:
                    C3832i9.m29518a(i7, unsafe.getObject(t, j), m29001o(i6));
                    continue;
                case 51:
                    if (m28991y(t, i7, i6)) {
                        m28874a = AbstractC4019u7.m28874a(i7 << 3);
                        m29776Q = m28874a + 8;
                        break;
                    } else {
                        continue;
                    }
                case 52:
                    if (m28991y(t, i7, i6)) {
                        m28874a2 = AbstractC4019u7.m28874a(i7 << 3);
                        m29776Q = m28874a2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 53:
                    if (m28991y(t, i7, i6)) {
                        long m29004l = m29004l(t, j);
                        m28874a3 = AbstractC4019u7.m28874a(i7 << 3);
                        m28873b = AbstractC4019u7.m28873b(m29004l);
                        m29776Q = m28874a3 + m28873b;
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (m28991y(t, i7, i6)) {
                        long m29004l2 = m29004l(t, j);
                        m28874a3 = AbstractC4019u7.m28874a(i7 << 3);
                        m28873b = AbstractC4019u7.m28873b(m29004l2);
                        m29776Q = m28874a3 + m28873b;
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    if (m28991y(t, i7, i6)) {
                        int m29015L = m29015L(t, j);
                        m28874a4 = AbstractC4019u7.m28874a(i7 << 3);
                        m28849z = AbstractC4019u7.m28849z(m29015L);
                        i2 = m28874a4 + m28849z;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 56:
                    if (m28991y(t, i7, i6)) {
                        m28874a = AbstractC4019u7.m28874a(i7 << 3);
                        m29776Q = m28874a + 8;
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (m28991y(t, i7, i6)) {
                        m28874a2 = AbstractC4019u7.m28874a(i7 << 3);
                        m29776Q = m28874a2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (m28991y(t, i7, i6)) {
                        m28874a5 = AbstractC4019u7.m28874a(i7 << 3);
                        m29776Q = m28874a5 + 1;
                        break;
                    } else {
                        continue;
                    }
                case 59:
                    if (m28991y(t, i7, i6)) {
                        Object object2 = unsafe.getObject(t, j);
                        if (object2 instanceof AbstractC3909n7) {
                            m28874a6 = AbstractC4019u7.m28874a(i7 << 3);
                            mo29340f = ((AbstractC3909n7) object2).mo29340f();
                            m28874a7 = AbstractC4019u7.m28874a(mo29340f);
                            i2 = m28874a6 + m28874a7 + mo29340f;
                            i3 += i2;
                        } else {
                            m28874a4 = AbstractC4019u7.m28874a(i7 << 3);
                            m28849z = AbstractC4019u7.m28876C((String) object2);
                            i2 = m28874a4 + m28849z;
                            i3 += i2;
                        }
                    } else {
                        continue;
                    }
                case 60:
                    if (m28991y(t, i7, i6)) {
                        m29776Q = C3724ba.m29776Q(i7, unsafe.getObject(t, j), m29002n(i6));
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    if (m28991y(t, i7, i6)) {
                        m28874a6 = AbstractC4019u7.m28874a(i7 << 3);
                        mo29340f = ((AbstractC3909n7) unsafe.getObject(t, j)).mo29340f();
                        m28874a7 = AbstractC4019u7.m28874a(mo29340f);
                        i2 = m28874a6 + m28874a7 + mo29340f;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 62:
                    if (m28991y(t, i7, i6)) {
                        int m29015L2 = m29015L(t, j);
                        m28874a4 = AbstractC4019u7.m28874a(i7 << 3);
                        m28849z = AbstractC4019u7.m28874a(m29015L2);
                        i2 = m28874a4 + m28849z;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 63:
                    if (m28991y(t, i7, i6)) {
                        int m29015L3 = m29015L(t, j);
                        m28874a4 = AbstractC4019u7.m28874a(i7 << 3);
                        m28849z = AbstractC4019u7.m28849z(m29015L3);
                        i2 = m28874a4 + m28849z;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 64:
                    if (m28991y(t, i7, i6)) {
                        m28874a2 = AbstractC4019u7.m28874a(i7 << 3);
                        m29776Q = m28874a2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    if (m28991y(t, i7, i6)) {
                        m28874a = AbstractC4019u7.m28874a(i7 << 3);
                        m29776Q = m28874a + 8;
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (m28991y(t, i7, i6)) {
                        int m29015L4 = m29015L(t, j);
                        m28874a4 = AbstractC4019u7.m28874a(i7 << 3);
                        m28849z = AbstractC4019u7.m28874a((m29015L4 >> 31) ^ (m29015L4 + m29015L4));
                        i2 = m28874a4 + m28849z;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 67:
                    if (m28991y(t, i7, i6)) {
                        long m29004l3 = m29004l(t, j);
                        m28874a4 = AbstractC4019u7.m28874a(i7 << 3);
                        m28849z = AbstractC4019u7.m28873b((m29004l3 >> 63) ^ (m29004l3 + m29004l3));
                        i2 = m28874a4 + m28849z;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 68:
                    if (m28991y(t, i7, i6)) {
                        m29776Q = AbstractC4019u7.m28850y(i7, (InterfaceC3927o9) unsafe.getObject(t, j), m29002n(i6));
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            i3 += m29776Q;
        }
        AbstractC3912na<?, ?> abstractC3912na = this.f9664l;
        int mo29101a = i3 + abstractC3912na.mo29101a(abstractC3912na.mo29099c(t));
        if (this.f9658f) {
            this.f9665m.mo29797a(t);
            throw null;
        }
        return mo29101a;
    }

    /* renamed from: K */
    private final int m29016K(T t) {
        int m28874a;
        int m28874a2;
        int m28874a3;
        int m28873b;
        int m28874a4;
        int m28849z;
        int m28874a5;
        int m28874a6;
        int mo29340f;
        int m28874a7;
        int m29776Q;
        int m28875D;
        int m28874a8;
        int i;
        Unsafe unsafe = f9652p;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f9653a.length; i3 += 3) {
            int m29005k = m29005k(i3);
            int m29006j = m29006j(m29005k);
            int i4 = this.f9653a[i3];
            long j = m29005k & 1048575;
            if (m29006j >= EnumC3783f8.DOUBLE_LIST_PACKED.zza() && m29006j <= EnumC3783f8.SINT64_LIST_PACKED.zza()) {
                int i5 = this.f9653a[i3 + 2];
            }
            switch (m29006j) {
                case 0:
                    if (m28994v(t, i3)) {
                        m28874a = AbstractC4019u7.m28874a(i4 << 3);
                        m29776Q = m28874a + 8;
                        i2 += m29776Q;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m28994v(t, i3)) {
                        m28874a2 = AbstractC4019u7.m28874a(i4 << 3);
                        m29776Q = m28874a2 + 4;
                        i2 += m29776Q;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m28994v(t, i3)) {
                        long m28639i = C4070xa.m28639i(t, j);
                        m28874a3 = AbstractC4019u7.m28874a(i4 << 3);
                        m28873b = AbstractC4019u7.m28873b(m28639i);
                        i2 += m28874a3 + m28873b;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m28994v(t, i3)) {
                        long m28639i2 = C4070xa.m28639i(t, j);
                        m28874a3 = AbstractC4019u7.m28874a(i4 << 3);
                        m28873b = AbstractC4019u7.m28873b(m28639i2);
                        i2 += m28874a3 + m28873b;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m28994v(t, i3)) {
                        int m28640h = C4070xa.m28640h(t, j);
                        m28874a4 = AbstractC4019u7.m28874a(i4 << 3);
                        m28849z = AbstractC4019u7.m28849z(m28640h);
                        i = m28874a4 + m28849z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m28994v(t, i3)) {
                        m28874a = AbstractC4019u7.m28874a(i4 << 3);
                        m29776Q = m28874a + 8;
                        i2 += m29776Q;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m28994v(t, i3)) {
                        m28874a2 = AbstractC4019u7.m28874a(i4 << 3);
                        m29776Q = m28874a2 + 4;
                        i2 += m29776Q;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m28994v(t, i3)) {
                        m28874a5 = AbstractC4019u7.m28874a(i4 << 3);
                        m29776Q = m28874a5 + 1;
                        i2 += m29776Q;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!m28994v(t, i3)) {
                        break;
                    } else {
                        Object m28637k = C4070xa.m28637k(t, j);
                        if (m28637k instanceof AbstractC3909n7) {
                            m28874a6 = AbstractC4019u7.m28874a(i4 << 3);
                            mo29340f = ((AbstractC3909n7) m28637k).mo29340f();
                            m28874a7 = AbstractC4019u7.m28874a(mo29340f);
                            i = m28874a6 + m28874a7 + mo29340f;
                            i2 += i;
                            break;
                        } else {
                            m28874a4 = AbstractC4019u7.m28874a(i4 << 3);
                            m28849z = AbstractC4019u7.m28876C((String) m28637k);
                            i = m28874a4 + m28849z;
                            i2 += i;
                        }
                    }
                case 9:
                    if (m28994v(t, i3)) {
                        m29776Q = C3724ba.m29776Q(i4, C4070xa.m28637k(t, j), m29002n(i3));
                        i2 += m29776Q;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (m28994v(t, i3)) {
                        m28874a6 = AbstractC4019u7.m28874a(i4 << 3);
                        mo29340f = ((AbstractC3909n7) C4070xa.m28637k(t, j)).mo29340f();
                        m28874a7 = AbstractC4019u7.m28874a(mo29340f);
                        i = m28874a6 + m28874a7 + mo29340f;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m28994v(t, i3)) {
                        int m28640h2 = C4070xa.m28640h(t, j);
                        m28874a4 = AbstractC4019u7.m28874a(i4 << 3);
                        m28849z = AbstractC4019u7.m28874a(m28640h2);
                        i = m28874a4 + m28849z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m28994v(t, i3)) {
                        int m28640h3 = C4070xa.m28640h(t, j);
                        m28874a4 = AbstractC4019u7.m28874a(i4 << 3);
                        m28849z = AbstractC4019u7.m28849z(m28640h3);
                        i = m28874a4 + m28849z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m28994v(t, i3)) {
                        m28874a2 = AbstractC4019u7.m28874a(i4 << 3);
                        m29776Q = m28874a2 + 4;
                        i2 += m29776Q;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m28994v(t, i3)) {
                        m28874a = AbstractC4019u7.m28874a(i4 << 3);
                        m29776Q = m28874a + 8;
                        i2 += m29776Q;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m28994v(t, i3)) {
                        int m28640h4 = C4070xa.m28640h(t, j);
                        m28874a4 = AbstractC4019u7.m28874a(i4 << 3);
                        m28849z = AbstractC4019u7.m28874a((m28640h4 >> 31) ^ (m28640h4 + m28640h4));
                        i = m28874a4 + m28849z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m28994v(t, i3)) {
                        long m28639i3 = C4070xa.m28639i(t, j);
                        m28874a4 = AbstractC4019u7.m28874a(i4 << 3);
                        m28849z = AbstractC4019u7.m28873b((m28639i3 >> 63) ^ (m28639i3 + m28639i3));
                        i = m28874a4 + m28849z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (m28994v(t, i3)) {
                        m29776Q = AbstractC4019u7.m28850y(i4, (InterfaceC3927o9) C4070xa.m28637k(t, j), m29002n(i3));
                        i2 += m29776Q;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    m29776Q = C3724ba.m29783J(i4, (List) C4070xa.m28637k(t, j), false);
                    i2 += m29776Q;
                    break;
                case 19:
                    m29776Q = C3724ba.m29785H(i4, (List) C4070xa.m28637k(t, j), false);
                    i2 += m29776Q;
                    break;
                case 20:
                    m29776Q = C3724ba.m29778O(i4, (List) C4070xa.m28637k(t, j), false);
                    i2 += m29776Q;
                    break;
                case 21:
                    m29776Q = C3724ba.m29767Z(i4, (List) C4070xa.m28637k(t, j), false);
                    i2 += m29776Q;
                    break;
                case 22:
                    m29776Q = C3724ba.m29780M(i4, (List) C4070xa.m28637k(t, j), false);
                    i2 += m29776Q;
                    break;
                case 23:
                    m29776Q = C3724ba.m29783J(i4, (List) C4070xa.m28637k(t, j), false);
                    i2 += m29776Q;
                    break;
                case 24:
                    m29776Q = C3724ba.m29785H(i4, (List) C4070xa.m28637k(t, j), false);
                    i2 += m29776Q;
                    break;
                case 25:
                    m29776Q = C3724ba.m29792A(i4, (List) C4070xa.m28637k(t, j), false);
                    i2 += m29776Q;
                    break;
                case 26:
                    m29776Q = C3724ba.m29770W(i4, (List) C4070xa.m28637k(t, j));
                    i2 += m29776Q;
                    break;
                case 27:
                    m29776Q = C3724ba.m29775R(i4, (List) C4070xa.m28637k(t, j), m29002n(i3));
                    i2 += m29776Q;
                    break;
                case 28:
                    m29776Q = C3724ba.m29788E(i4, (List) C4070xa.m28637k(t, j));
                    i2 += m29776Q;
                    break;
                case 29:
                    m29776Q = C3724ba.m29769X(i4, (List) C4070xa.m28637k(t, j), false);
                    i2 += m29776Q;
                    break;
                case 30:
                    m29776Q = C3724ba.m29787F(i4, (List) C4070xa.m28637k(t, j), false);
                    i2 += m29776Q;
                    break;
                case 31:
                    m29776Q = C3724ba.m29785H(i4, (List) C4070xa.m28637k(t, j), false);
                    i2 += m29776Q;
                    break;
                case 32:
                    m29776Q = C3724ba.m29783J(i4, (List) C4070xa.m28637k(t, j), false);
                    i2 += m29776Q;
                    break;
                case 33:
                    m29776Q = C3724ba.m29774S(i4, (List) C4070xa.m28637k(t, j), false);
                    i2 += m29776Q;
                    break;
                case 34:
                    m29776Q = C3724ba.m29772U(i4, (List) C4070xa.m28637k(t, j), false);
                    i2 += m29776Q;
                    break;
                case 35:
                    m28849z = C3724ba.m29782K((List) unsafe.getObject(t, j));
                    if (m28849z > 0) {
                        m28875D = AbstractC4019u7.m28875D(i4);
                        m28874a8 = AbstractC4019u7.m28874a(m28849z);
                        m28874a4 = m28875D + m28874a8;
                        i = m28874a4 + m28849z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    m28849z = C3724ba.m29784I((List) unsafe.getObject(t, j));
                    if (m28849z > 0) {
                        m28875D = AbstractC4019u7.m28875D(i4);
                        m28874a8 = AbstractC4019u7.m28874a(m28849z);
                        m28874a4 = m28875D + m28874a8;
                        i = m28874a4 + m28849z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    m28849z = C3724ba.m29777P((List) unsafe.getObject(t, j));
                    if (m28849z > 0) {
                        m28875D = AbstractC4019u7.m28875D(i4);
                        m28874a8 = AbstractC4019u7.m28874a(m28849z);
                        m28874a4 = m28875D + m28874a8;
                        i = m28874a4 + m28849z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    m28849z = C3724ba.m29765a0((List) unsafe.getObject(t, j));
                    if (m28849z > 0) {
                        m28875D = AbstractC4019u7.m28875D(i4);
                        m28874a8 = AbstractC4019u7.m28874a(m28849z);
                        m28874a4 = m28875D + m28874a8;
                        i = m28874a4 + m28849z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    m28849z = C3724ba.m29779N((List) unsafe.getObject(t, j));
                    if (m28849z > 0) {
                        m28875D = AbstractC4019u7.m28875D(i4);
                        m28874a8 = AbstractC4019u7.m28874a(m28849z);
                        m28874a4 = m28875D + m28874a8;
                        i = m28874a4 + m28849z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    m28849z = C3724ba.m29782K((List) unsafe.getObject(t, j));
                    if (m28849z > 0) {
                        m28875D = AbstractC4019u7.m28875D(i4);
                        m28874a8 = AbstractC4019u7.m28874a(m28849z);
                        m28874a4 = m28875D + m28874a8;
                        i = m28874a4 + m28849z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    m28849z = C3724ba.m29784I((List) unsafe.getObject(t, j));
                    if (m28849z > 0) {
                        m28875D = AbstractC4019u7.m28875D(i4);
                        m28874a8 = AbstractC4019u7.m28874a(m28849z);
                        m28874a4 = m28875D + m28874a8;
                        i = m28874a4 + m28849z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    m28849z = C3724ba.m29789D((List) unsafe.getObject(t, j));
                    if (m28849z > 0) {
                        m28875D = AbstractC4019u7.m28875D(i4);
                        m28874a8 = AbstractC4019u7.m28874a(m28849z);
                        m28874a4 = m28875D + m28874a8;
                        i = m28874a4 + m28849z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    m28849z = C3724ba.m29768Y((List) unsafe.getObject(t, j));
                    if (m28849z > 0) {
                        m28875D = AbstractC4019u7.m28875D(i4);
                        m28874a8 = AbstractC4019u7.m28874a(m28849z);
                        m28874a4 = m28875D + m28874a8;
                        i = m28874a4 + m28849z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    m28849z = C3724ba.m29786G((List) unsafe.getObject(t, j));
                    if (m28849z > 0) {
                        m28875D = AbstractC4019u7.m28875D(i4);
                        m28874a8 = AbstractC4019u7.m28874a(m28849z);
                        m28874a4 = m28875D + m28874a8;
                        i = m28874a4 + m28849z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    m28849z = C3724ba.m29784I((List) unsafe.getObject(t, j));
                    if (m28849z > 0) {
                        m28875D = AbstractC4019u7.m28875D(i4);
                        m28874a8 = AbstractC4019u7.m28874a(m28849z);
                        m28874a4 = m28875D + m28874a8;
                        i = m28874a4 + m28849z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    m28849z = C3724ba.m29782K((List) unsafe.getObject(t, j));
                    if (m28849z > 0) {
                        m28875D = AbstractC4019u7.m28875D(i4);
                        m28874a8 = AbstractC4019u7.m28874a(m28849z);
                        m28874a4 = m28875D + m28874a8;
                        i = m28874a4 + m28849z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    m28849z = C3724ba.m29773T((List) unsafe.getObject(t, j));
                    if (m28849z > 0) {
                        m28875D = AbstractC4019u7.m28875D(i4);
                        m28874a8 = AbstractC4019u7.m28874a(m28849z);
                        m28874a4 = m28875D + m28874a8;
                        i = m28874a4 + m28849z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    m28849z = C3724ba.m29771V((List) unsafe.getObject(t, j));
                    if (m28849z > 0) {
                        m28875D = AbstractC4019u7.m28875D(i4);
                        m28874a8 = AbstractC4019u7.m28874a(m28849z);
                        m28874a4 = m28875D + m28874a8;
                        i = m28874a4 + m28849z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    m29776Q = C3724ba.m29781L(i4, (List) C4070xa.m28637k(t, j), m29002n(i3));
                    i2 += m29776Q;
                    break;
                case 50:
                    C3832i9.m29518a(i4, C4070xa.m28637k(t, j), m29001o(i3));
                    break;
                case 51:
                    if (m28991y(t, i4, i3)) {
                        m28874a = AbstractC4019u7.m28874a(i4 << 3);
                        m29776Q = m28874a + 8;
                        i2 += m29776Q;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m28991y(t, i4, i3)) {
                        m28874a2 = AbstractC4019u7.m28874a(i4 << 3);
                        m29776Q = m28874a2 + 4;
                        i2 += m29776Q;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m28991y(t, i4, i3)) {
                        long m29004l = m29004l(t, j);
                        m28874a3 = AbstractC4019u7.m28874a(i4 << 3);
                        m28873b = AbstractC4019u7.m28873b(m29004l);
                        i2 += m28874a3 + m28873b;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m28991y(t, i4, i3)) {
                        long m29004l2 = m29004l(t, j);
                        m28874a3 = AbstractC4019u7.m28874a(i4 << 3);
                        m28873b = AbstractC4019u7.m28873b(m29004l2);
                        i2 += m28874a3 + m28873b;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m28991y(t, i4, i3)) {
                        int m29015L = m29015L(t, j);
                        m28874a4 = AbstractC4019u7.m28874a(i4 << 3);
                        m28849z = AbstractC4019u7.m28849z(m29015L);
                        i = m28874a4 + m28849z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m28991y(t, i4, i3)) {
                        m28874a = AbstractC4019u7.m28874a(i4 << 3);
                        m29776Q = m28874a + 8;
                        i2 += m29776Q;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m28991y(t, i4, i3)) {
                        m28874a2 = AbstractC4019u7.m28874a(i4 << 3);
                        m29776Q = m28874a2 + 4;
                        i2 += m29776Q;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m28991y(t, i4, i3)) {
                        m28874a5 = AbstractC4019u7.m28874a(i4 << 3);
                        m29776Q = m28874a5 + 1;
                        i2 += m29776Q;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!m28991y(t, i4, i3)) {
                        break;
                    } else {
                        Object m28637k2 = C4070xa.m28637k(t, j);
                        if (m28637k2 instanceof AbstractC3909n7) {
                            m28874a6 = AbstractC4019u7.m28874a(i4 << 3);
                            mo29340f = ((AbstractC3909n7) m28637k2).mo29340f();
                            m28874a7 = AbstractC4019u7.m28874a(mo29340f);
                            i = m28874a6 + m28874a7 + mo29340f;
                            i2 += i;
                            break;
                        } else {
                            m28874a4 = AbstractC4019u7.m28874a(i4 << 3);
                            m28849z = AbstractC4019u7.m28876C((String) m28637k2);
                            i = m28874a4 + m28849z;
                            i2 += i;
                        }
                    }
                case 60:
                    if (m28991y(t, i4, i3)) {
                        m29776Q = C3724ba.m29776Q(i4, C4070xa.m28637k(t, j), m29002n(i3));
                        i2 += m29776Q;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m28991y(t, i4, i3)) {
                        m28874a6 = AbstractC4019u7.m28874a(i4 << 3);
                        mo29340f = ((AbstractC3909n7) C4070xa.m28637k(t, j)).mo29340f();
                        m28874a7 = AbstractC4019u7.m28874a(mo29340f);
                        i = m28874a6 + m28874a7 + mo29340f;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m28991y(t, i4, i3)) {
                        int m29015L2 = m29015L(t, j);
                        m28874a4 = AbstractC4019u7.m28874a(i4 << 3);
                        m28849z = AbstractC4019u7.m28874a(m29015L2);
                        i = m28874a4 + m28849z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m28991y(t, i4, i3)) {
                        int m29015L3 = m29015L(t, j);
                        m28874a4 = AbstractC4019u7.m28874a(i4 << 3);
                        m28849z = AbstractC4019u7.m28849z(m29015L3);
                        i = m28874a4 + m28849z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m28991y(t, i4, i3)) {
                        m28874a2 = AbstractC4019u7.m28874a(i4 << 3);
                        m29776Q = m28874a2 + 4;
                        i2 += m29776Q;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m28991y(t, i4, i3)) {
                        m28874a = AbstractC4019u7.m28874a(i4 << 3);
                        m29776Q = m28874a + 8;
                        i2 += m29776Q;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m28991y(t, i4, i3)) {
                        int m29015L4 = m29015L(t, j);
                        m28874a4 = AbstractC4019u7.m28874a(i4 << 3);
                        m28849z = AbstractC4019u7.m28874a((m29015L4 >> 31) ^ (m29015L4 + m29015L4));
                        i = m28874a4 + m28849z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m28991y(t, i4, i3)) {
                        long m29004l3 = m29004l(t, j);
                        m28874a4 = AbstractC4019u7.m28874a(i4 << 3);
                        m28849z = AbstractC4019u7.m28873b((m29004l3 >> 63) ^ (m29004l3 + m29004l3));
                        i = m28874a4 + m28849z;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m28991y(t, i4, i3)) {
                        m29776Q = AbstractC4019u7.m28850y(i4, (InterfaceC3927o9) C4070xa.m28637k(t, j), m29002n(i3));
                        i2 += m29776Q;
                        break;
                    } else {
                        break;
                    }
            }
        }
        AbstractC3912na<?, ?> abstractC3912na = this.f9664l;
        return i2 + abstractC3912na.mo29101a(abstractC3912na.mo29099c(t));
    }

    /* renamed from: L */
    private static <T> int m29015L(T t, long j) {
        return ((Integer) C4070xa.m28637k(t, j)).intValue();
    }

    /* renamed from: M */
    private final <K, V> int m29014M(T t, byte[] bArr, int i, int i2, int i3, long j, C3753d7 c3753d7) throws IOException {
        Unsafe unsafe = f9652p;
        Object m29001o = m29001o(i3);
        Object object = unsafe.getObject(t, j);
        if (!((C3816h9) object).m29550g()) {
            C3816h9<K, V> m29553b = C3816h9.m29554a().m29553b();
            C3832i9.m29517b(m29553b, object);
            unsafe.putObject(t, j, m29553b);
        }
        C3800g9 c3800g9 = (C3800g9) m29001o;
        throw null;
    }

    /* renamed from: N */
    private final int m29013N(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C3753d7 c3753d7) throws IOException {
        Unsafe unsafe = f9652p;
        long j2 = this.f9653a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Double.valueOf(Double.longBitsToDouble(C3768e7.m29640n(bArr, i))));
                    unsafe.putInt(t, j2, i4);
                    return i + 8;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Float.valueOf(Float.intBitsToFloat(C3768e7.m29652b(bArr, i))));
                    unsafe.putInt(t, j2, i4);
                    return i + 4;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int m29641m = C3768e7.m29641m(bArr, i, c3753d7);
                    unsafe.putObject(t, j, Long.valueOf(c3753d7.f9241b));
                    unsafe.putInt(t, j2, i4);
                    return m29641m;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int m29644j = C3768e7.m29644j(bArr, i, c3753d7);
                    unsafe.putObject(t, j, Integer.valueOf(c3753d7.f9240a));
                    unsafe.putInt(t, j2, i4);
                    return m29644j;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Long.valueOf(C3768e7.m29640n(bArr, i)));
                    unsafe.putInt(t, j2, i4);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Integer.valueOf(C3768e7.m29652b(bArr, i)));
                    unsafe.putInt(t, j2, i4);
                    return i + 4;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int m29641m2 = C3768e7.m29641m(bArr, i, c3753d7);
                    unsafe.putObject(t, j, Boolean.valueOf(c3753d7.f9241b != 0));
                    unsafe.putInt(t, j2, i4);
                    return m29641m2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int m29644j2 = C3768e7.m29644j(bArr, i, c3753d7);
                    int i9 = c3753d7.f9240a;
                    if (i9 == 0) {
                        unsafe.putObject(t, j, "");
                    } else if ((i6 & 536870912) != 0 && !C3741cb.m29703f(bArr, m29644j2, m29644j2 + i9)) {
                        throw zzkh.m28517c();
                    } else {
                        unsafe.putObject(t, j, new String(bArr, m29644j2, i9, C4004t8.f9713a));
                        m29644j2 += i9;
                    }
                    unsafe.putInt(t, j2, i4);
                    return m29644j2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    int m29650d = C3768e7.m29650d(m29002n(i8), bArr, i, i2, c3753d7);
                    Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object == null) {
                        unsafe.putObject(t, j, c3753d7.f9242c);
                    } else {
                        unsafe.putObject(t, j, C4004t8.m28903g(object, c3753d7.f9242c));
                    }
                    unsafe.putInt(t, j2, i4);
                    return m29650d;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int m29653a = C3768e7.m29653a(bArr, i, c3753d7);
                    unsafe.putObject(t, j, c3753d7.f9242c);
                    unsafe.putInt(t, j2, i4);
                    return m29653a;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int m29644j3 = C3768e7.m29644j(bArr, i, c3753d7);
                    int i10 = c3753d7.f9240a;
                    InterfaceC3941p8 m29003m = m29003m(i8);
                    if (m29003m != null && !m29003m.mo28670g(i10)) {
                        m29022E(t).m29238h(i3, Long.valueOf(i10));
                    } else {
                        unsafe.putObject(t, j, Integer.valueOf(i10));
                        unsafe.putInt(t, j2, i4);
                    }
                    return m29644j3;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int m29644j4 = C3768e7.m29644j(bArr, i, c3753d7);
                    unsafe.putObject(t, j, Integer.valueOf(C3971r7.m29030a(c3753d7.f9240a)));
                    unsafe.putInt(t, j2, i4);
                    return m29644j4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int m29641m3 = C3768e7.m29641m(bArr, i, c3753d7);
                    unsafe.putObject(t, j, Long.valueOf(C3971r7.m29029b(c3753d7.f9241b)));
                    unsafe.putInt(t, j2, i4);
                    return m29641m3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    int m29651c = C3768e7.m29651c(m29002n(i8), bArr, i, i2, (i3 & (-8)) | 4, c3753d7);
                    Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j, c3753d7.f9242c);
                    } else {
                        unsafe.putObject(t, j, C4004t8.m28903g(object2, c3753d7.f9242c));
                    }
                    unsafe.putInt(t, j2, i4);
                    return m29651c;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x02a8, code lost:
        if (r0 != r15) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02aa, code lost:
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r19;
        r1 = r20;
        r6 = r24;
        r7 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02be, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0312, code lost:
        if (r0 != r15) goto L152;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int m29012O(T r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.measurement.C3753d7 r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3973r9.m29012O(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.d7):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0154  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x021c -> B:120:0x021d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0151 -> B:67:0x0152). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x01ce -> B:100:0x01cf). Please submit an issue!!! */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int m29011P(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.measurement.C3753d7 r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3973r9.m29011P(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.d7):int");
    }

    /* renamed from: Q */
    private final int m29010Q(int i) {
        if (i < this.f9655c || i > this.f9656d) {
            return -1;
        }
        return m29007T(i, 0);
    }

    /* renamed from: R */
    private final int m29009R(int i, int i2) {
        if (i < this.f9655c || i > this.f9656d) {
            return -1;
        }
        return m29007T(i, i2);
    }

    /* renamed from: S */
    private final int m29008S(int i) {
        return this.f9653a[i + 2];
    }

    /* renamed from: T */
    private final int m29007T(int i, int i2) {
        int length = (this.f9653a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f9653a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: j */
    private static int m29006j(int i) {
        return (i >>> 20) & 255;
    }

    /* renamed from: k */
    private final int m29005k(int i) {
        return this.f9653a[i + 1];
    }

    /* renamed from: l */
    private static <T> long m29004l(T t, long j) {
        return ((Long) C4070xa.m28637k(t, j)).longValue();
    }

    /* renamed from: m */
    private final InterfaceC3941p8 m29003m(int i) {
        int i2 = i / 3;
        return (InterfaceC3941p8) this.f9654b[i2 + i2 + 1];
    }

    /* renamed from: n */
    private final InterfaceC4101z9 m29002n(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        InterfaceC4101z9 interfaceC4101z9 = (InterfaceC4101z9) this.f9654b[i3];
        if (interfaceC4101z9 != null) {
            return interfaceC4101z9;
        }
        InterfaceC4101z9<T> m28690b = C4053w9.m28691a().m28690b((Class) this.f9654b[i3 + 1]);
        this.f9654b[i3] = m28690b;
        return m28690b;
    }

    /* renamed from: o */
    private final Object m29001o(int i) {
        int i2 = i / 3;
        return this.f9654b[i2 + i2];
    }

    /* renamed from: p */
    private static Field m29000p(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: q */
    private final void m28999q(T t, T t2, int i) {
        long m29005k = m29005k(i) & 1048575;
        if (m28994v(t2, i)) {
            Object m28637k = C4070xa.m28637k(t, m29005k);
            Object m28637k2 = C4070xa.m28637k(t2, m29005k);
            if (m28637k != null && m28637k2 != null) {
                C4070xa.m28624x(t, m29005k, C4004t8.m28903g(m28637k, m28637k2));
                m28997s(t, i);
            } else if (m28637k2 != null) {
                C4070xa.m28624x(t, m29005k, m28637k2);
                m28997s(t, i);
            }
        }
    }

    /* renamed from: r */
    private final void m28998r(T t, T t2, int i) {
        int m29005k = m29005k(i);
        int i2 = this.f9653a[i];
        long j = m29005k & 1048575;
        if (m28991y(t2, i2, i)) {
            Object m28637k = m28991y(t, i2, i) ? C4070xa.m28637k(t, j) : null;
            Object m28637k2 = C4070xa.m28637k(t2, j);
            if (m28637k != null && m28637k2 != null) {
                C4070xa.m28624x(t, j, C4004t8.m28903g(m28637k, m28637k2));
                m28996t(t, i2, i);
            } else if (m28637k2 != null) {
                C4070xa.m28624x(t, j, m28637k2);
                m28996t(t, i2, i);
            }
        }
    }

    /* renamed from: s */
    private final void m28997s(T t, int i) {
        int m29008S = m29008S(i);
        long j = 1048575 & m29008S;
        if (j == 1048575) {
            return;
        }
        C4070xa.m28626v(t, j, (1 << (m29008S >>> 20)) | C4070xa.m28640h(t, j));
    }

    /* renamed from: t */
    private final void m28996t(T t, int i, int i2) {
        C4070xa.m28626v(t, m29008S(i2) & 1048575, i);
    }

    /* renamed from: u */
    private final boolean m28995u(T t, T t2, int i) {
        return m28994v(t, i) == m28994v(t2, i);
    }

    /* renamed from: v */
    private final boolean m28994v(T t, int i) {
        int m29008S = m29008S(i);
        long j = m29008S & 1048575;
        if (j != 1048575) {
            return (C4070xa.m28640h(t, j) & (1 << (m29008S >>> 20))) != 0;
        }
        int m29005k = m29005k(i);
        long j2 = m29005k & 1048575;
        switch (m29006j(m29005k)) {
            case 0:
                return Double.doubleToRawLongBits(C4070xa.m28642f(t, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(C4070xa.m28641g(t, j2)) != 0;
            case 2:
                return C4070xa.m28639i(t, j2) != 0;
            case 3:
                return C4070xa.m28639i(t, j2) != 0;
            case 4:
                return C4070xa.m28640h(t, j2) != 0;
            case 5:
                return C4070xa.m28639i(t, j2) != 0;
            case 6:
                return C4070xa.m28640h(t, j2) != 0;
            case 7:
                return C4070xa.m28651B(t, j2);
            case 8:
                Object m28637k = C4070xa.m28637k(t, j2);
                if (m28637k instanceof String) {
                    return !((String) m28637k).isEmpty();
                } else if (m28637k instanceof AbstractC3909n7) {
                    return !AbstractC3909n7.f9575d.equals(m28637k);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return C4070xa.m28637k(t, j2) != null;
            case 10:
                return !AbstractC3909n7.f9575d.equals(C4070xa.m28637k(t, j2));
            case 11:
                return C4070xa.m28640h(t, j2) != 0;
            case 12:
                return C4070xa.m28640h(t, j2) != 0;
            case 13:
                return C4070xa.m28640h(t, j2) != 0;
            case 14:
                return C4070xa.m28639i(t, j2) != 0;
            case 15:
                return C4070xa.m28640h(t, j2) != 0;
            case 16:
                return C4070xa.m28639i(t, j2) != 0;
            case 17:
                return C4070xa.m28637k(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: w */
    private final boolean m28993w(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m28994v(t, i);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: x */
    private static boolean m28992x(Object obj, int i, InterfaceC4101z9 interfaceC4101z9) {
        return interfaceC4101z9.mo28528f(C4070xa.m28637k(obj, i & 1048575));
    }

    /* renamed from: y */
    private final boolean m28991y(T t, int i, int i2) {
        return C4070xa.m28640h(t, (long) (m29008S(i2) & 1048575)) == i;
    }

    /* renamed from: z */
    private static <T> boolean m28990z(T t, long j) {
        return ((Boolean) C4070xa.m28637k(t, j)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0414, code lost:
        if (r6 == 1048575) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0416, code lost:
        r26.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x041c, code lost:
        r3 = r9.f9661i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0420, code lost:
        if (r3 >= r9.f9662j) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0422, code lost:
        r4 = r9.f9660h[r3];
        r5 = r9.f9653a[r4];
        r5 = com.google.android.gms.internal.measurement.C4070xa.m28637k(r12, r9.m29005k(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0434, code lost:
        if (r5 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x043b, code lost:
        if (r9.m29003m(r4) != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x043d, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0440, code lost:
        r5 = (com.google.android.gms.internal.measurement.C3816h9) r5;
        r0 = (com.google.android.gms.internal.measurement.C3800g9) r9.m29001o(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0448, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0449, code lost:
        if (r7 != 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x044d, code lost:
        if (r0 != r32) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0454, code lost:
        throw com.google.android.gms.internal.measurement.zzkh.m28515e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0457, code lost:
        if (r0 > r32) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0459, code lost:
        if (r1 != r7) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x045b, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0461, code lost:
        throw com.google.android.gms.internal.measurement.zzkh.m28515e();
     */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m29023D(T r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.measurement.C3753d7 r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1162
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3973r9.m29023D(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.d7):int");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4101z9
    /* renamed from: a */
    public final T mo28533a() {
        return (T) ((AbstractC3894m8) this.f9657e).mo28554v(4, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4101z9
    /* renamed from: b */
    public final int mo28532b(T t) {
        int i;
        int m28907c;
        int length = this.f9653a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int m29005k = m29005k(i3);
            int i4 = this.f9653a[i3];
            long j = 1048575 & m29005k;
            int i5 = 37;
            switch (m29006j(m29005k)) {
                case 0:
                    i = i2 * 53;
                    m28907c = C4004t8.m28907c(Double.doubleToLongBits(C4070xa.m28642f(t, j)));
                    i2 = i + m28907c;
                    break;
                case 1:
                    i = i2 * 53;
                    m28907c = Float.floatToIntBits(C4070xa.m28641g(t, j));
                    i2 = i + m28907c;
                    break;
                case 2:
                    i = i2 * 53;
                    m28907c = C4004t8.m28907c(C4070xa.m28639i(t, j));
                    i2 = i + m28907c;
                    break;
                case 3:
                    i = i2 * 53;
                    m28907c = C4004t8.m28907c(C4070xa.m28639i(t, j));
                    i2 = i + m28907c;
                    break;
                case 4:
                    i = i2 * 53;
                    m28907c = C4070xa.m28640h(t, j);
                    i2 = i + m28907c;
                    break;
                case 5:
                    i = i2 * 53;
                    m28907c = C4004t8.m28907c(C4070xa.m28639i(t, j));
                    i2 = i + m28907c;
                    break;
                case 6:
                    i = i2 * 53;
                    m28907c = C4070xa.m28640h(t, j);
                    i2 = i + m28907c;
                    break;
                case 7:
                    i = i2 * 53;
                    m28907c = C4004t8.m28909a(C4070xa.m28651B(t, j));
                    i2 = i + m28907c;
                    break;
                case 8:
                    i = i2 * 53;
                    m28907c = ((String) C4070xa.m28637k(t, j)).hashCode();
                    i2 = i + m28907c;
                    break;
                case 9:
                    Object m28637k = C4070xa.m28637k(t, j);
                    if (m28637k != null) {
                        i5 = m28637k.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    m28907c = C4070xa.m28637k(t, j).hashCode();
                    i2 = i + m28907c;
                    break;
                case 11:
                    i = i2 * 53;
                    m28907c = C4070xa.m28640h(t, j);
                    i2 = i + m28907c;
                    break;
                case 12:
                    i = i2 * 53;
                    m28907c = C4070xa.m28640h(t, j);
                    i2 = i + m28907c;
                    break;
                case 13:
                    i = i2 * 53;
                    m28907c = C4070xa.m28640h(t, j);
                    i2 = i + m28907c;
                    break;
                case 14:
                    i = i2 * 53;
                    m28907c = C4004t8.m28907c(C4070xa.m28639i(t, j));
                    i2 = i + m28907c;
                    break;
                case 15:
                    i = i2 * 53;
                    m28907c = C4070xa.m28640h(t, j);
                    i2 = i + m28907c;
                    break;
                case 16:
                    i = i2 * 53;
                    m28907c = C4004t8.m28907c(C4070xa.m28639i(t, j));
                    i2 = i + m28907c;
                    break;
                case 17:
                    Object m28637k2 = C4070xa.m28637k(t, j);
                    if (m28637k2 != null) {
                        i5 = m28637k2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    m28907c = C4070xa.m28637k(t, j).hashCode();
                    i2 = i + m28907c;
                    break;
                case 50:
                    i = i2 * 53;
                    m28907c = C4070xa.m28637k(t, j).hashCode();
                    i2 = i + m28907c;
                    break;
                case 51:
                    if (m28991y(t, i4, i3)) {
                        i = i2 * 53;
                        m28907c = C4004t8.m28907c(Double.doubleToLongBits(m29019H(t, j)));
                        i2 = i + m28907c;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m28991y(t, i4, i3)) {
                        i = i2 * 53;
                        m28907c = Float.floatToIntBits(m29018I(t, j));
                        i2 = i + m28907c;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m28991y(t, i4, i3)) {
                        i = i2 * 53;
                        m28907c = C4004t8.m28907c(m29004l(t, j));
                        i2 = i + m28907c;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m28991y(t, i4, i3)) {
                        i = i2 * 53;
                        m28907c = C4004t8.m28907c(m29004l(t, j));
                        i2 = i + m28907c;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m28991y(t, i4, i3)) {
                        i = i2 * 53;
                        m28907c = m29015L(t, j);
                        i2 = i + m28907c;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m28991y(t, i4, i3)) {
                        i = i2 * 53;
                        m28907c = C4004t8.m28907c(m29004l(t, j));
                        i2 = i + m28907c;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m28991y(t, i4, i3)) {
                        i = i2 * 53;
                        m28907c = m29015L(t, j);
                        i2 = i + m28907c;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m28991y(t, i4, i3)) {
                        i = i2 * 53;
                        m28907c = C4004t8.m28909a(m28990z(t, j));
                        i2 = i + m28907c;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m28991y(t, i4, i3)) {
                        i = i2 * 53;
                        m28907c = ((String) C4070xa.m28637k(t, j)).hashCode();
                        i2 = i + m28907c;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m28991y(t, i4, i3)) {
                        i = i2 * 53;
                        m28907c = C4070xa.m28637k(t, j).hashCode();
                        i2 = i + m28907c;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m28991y(t, i4, i3)) {
                        i = i2 * 53;
                        m28907c = C4070xa.m28637k(t, j).hashCode();
                        i2 = i + m28907c;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m28991y(t, i4, i3)) {
                        i = i2 * 53;
                        m28907c = m29015L(t, j);
                        i2 = i + m28907c;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m28991y(t, i4, i3)) {
                        i = i2 * 53;
                        m28907c = m29015L(t, j);
                        i2 = i + m28907c;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m28991y(t, i4, i3)) {
                        i = i2 * 53;
                        m28907c = m29015L(t, j);
                        i2 = i + m28907c;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m28991y(t, i4, i3)) {
                        i = i2 * 53;
                        m28907c = C4004t8.m28907c(m29004l(t, j));
                        i2 = i + m28907c;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m28991y(t, i4, i3)) {
                        i = i2 * 53;
                        m28907c = m29015L(t, j);
                        i2 = i + m28907c;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m28991y(t, i4, i3)) {
                        i = i2 * 53;
                        m28907c = C4004t8.m28907c(m29004l(t, j));
                        i2 = i + m28907c;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m28991y(t, i4, i3)) {
                        i = i2 * 53;
                        m28907c = C4070xa.m28637k(t, j).hashCode();
                        i2 = i + m28907c;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.f9664l.mo29099c(t).hashCode();
        if (this.f9658f) {
            this.f9665m.mo29797a(t);
            throw null;
        }
        return hashCode;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4101z9
    /* renamed from: c */
    public final void mo28531c(T t) {
        int i;
        int i2 = this.f9661i;
        while (true) {
            i = this.f9662j;
            if (i2 >= i) {
                break;
            }
            long m29005k = m29005k(this.f9660h[i2]) & 1048575;
            Object m28637k = C4070xa.m28637k(t, m29005k);
            if (m28637k != null) {
                ((C3816h9) m28637k).m29552c();
                C4070xa.m28624x(t, m29005k, m28637k);
            }
            i2++;
        }
        int length = this.f9660h.length;
        while (i < length) {
            this.f9663k.mo28535a(t, this.f9660h[i]);
            i++;
        }
        this.f9664l.mo29095g(t);
        if (this.f9658f) {
            this.f9665m.mo29796b(t);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4101z9
    /* renamed from: d */
    public final int mo28530d(T t) {
        return this.f9659g ? m29016K(t) : m29017J(t);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4101z9
    /* renamed from: e */
    public final void mo28529e(T t, T t2) {
        if (t2 == null) {
            throw null;
        }
        for (int i = 0; i < this.f9653a.length; i += 3) {
            int m29005k = m29005k(i);
            long j = 1048575 & m29005k;
            int i2 = this.f9653a[i];
            switch (m29006j(m29005k)) {
                case 0:
                    if (m28994v(t2, i)) {
                        C4070xa.m28628t(t, j, C4070xa.m28642f(t2, j));
                        m28997s(t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m28994v(t2, i)) {
                        C4070xa.m28627u(t, j, C4070xa.m28641g(t2, j));
                        m28997s(t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m28994v(t2, i)) {
                        C4070xa.m28625w(t, j, C4070xa.m28639i(t2, j));
                        m28997s(t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m28994v(t2, i)) {
                        C4070xa.m28625w(t, j, C4070xa.m28639i(t2, j));
                        m28997s(t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m28994v(t2, i)) {
                        C4070xa.m28626v(t, j, C4070xa.m28640h(t2, j));
                        m28997s(t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m28994v(t2, i)) {
                        C4070xa.m28625w(t, j, C4070xa.m28639i(t2, j));
                        m28997s(t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m28994v(t2, i)) {
                        C4070xa.m28626v(t, j, C4070xa.m28640h(t2, j));
                        m28997s(t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m28994v(t2, i)) {
                        C4070xa.m28630r(t, j, C4070xa.m28651B(t2, j));
                        m28997s(t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m28994v(t2, i)) {
                        C4070xa.m28624x(t, j, C4070xa.m28637k(t2, j));
                        m28997s(t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    m28999q(t, t2, i);
                    break;
                case 10:
                    if (m28994v(t2, i)) {
                        C4070xa.m28624x(t, j, C4070xa.m28637k(t2, j));
                        m28997s(t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m28994v(t2, i)) {
                        C4070xa.m28626v(t, j, C4070xa.m28640h(t2, j));
                        m28997s(t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m28994v(t2, i)) {
                        C4070xa.m28626v(t, j, C4070xa.m28640h(t2, j));
                        m28997s(t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m28994v(t2, i)) {
                        C4070xa.m28626v(t, j, C4070xa.m28640h(t2, j));
                        m28997s(t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m28994v(t2, i)) {
                        C4070xa.m28625w(t, j, C4070xa.m28639i(t2, j));
                        m28997s(t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m28994v(t2, i)) {
                        C4070xa.m28626v(t, j, C4070xa.m28640h(t2, j));
                        m28997s(t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m28994v(t2, i)) {
                        C4070xa.m28625w(t, j, C4070xa.m28639i(t2, j));
                        m28997s(t, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    m28999q(t, t2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f9663k.mo28534b(t, t2, j);
                    break;
                case 50:
                    C3724ba.m29756i(this.f9666n, t, t2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (m28991y(t2, i2, i)) {
                        C4070xa.m28624x(t, j, C4070xa.m28637k(t2, j));
                        m28996t(t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    m28998r(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m28991y(t2, i2, i)) {
                        C4070xa.m28624x(t, j, C4070xa.m28637k(t2, j));
                        m28996t(t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    m28998r(t, t2, i);
                    break;
            }
        }
        C3724ba.m29759f(this.f9664l, t, t2);
        if (this.f9658f) {
            C3724ba.m29760e(this.f9665m, t, t2);
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.InterfaceC4101z9
    /* renamed from: f */
    public final boolean mo28528f(T t) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f9661i) {
            int i6 = this.f9660h[i5];
            int i7 = this.f9653a[i6];
            int m29005k = m29005k(i6);
            int i8 = this.f9653a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f9652p.getInt(t, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & m29005k) != 0 && !m28993w(t, i6, i, i2, i10)) {
                return false;
            }
            int m29006j = m29006j(m29005k);
            if (m29006j != 9 && m29006j != 17) {
                if (m29006j != 27) {
                    if (m29006j == 60 || m29006j == 68) {
                        if (m28991y(t, i7, i6) && !m28992x(t, m29005k, m29002n(i6))) {
                            return false;
                        }
                    } else if (m29006j != 49) {
                        if (m29006j == 50 && !((C3816h9) C4070xa.m28637k(t, m29005k & 1048575)).isEmpty()) {
                            C3800g9 c3800g9 = (C3800g9) m29001o(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) C4070xa.m28637k(t, m29005k & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    InterfaceC4101z9 m29002n = m29002n(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!m29002n.mo28528f(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (m28993w(t, i6, i, i2, i10) && !m28992x(t, m29005k, m29002n(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (this.f9658f) {
            this.f9665m.mo29797a(t);
            throw null;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4101z9
    /* renamed from: g */
    public final void mo28527g(T t, byte[] bArr, int i, int i2, C3753d7 c3753d7) throws IOException {
        if (this.f9659g) {
            m29012O(t, bArr, i, i2, c3753d7);
        } else {
            m29023D(t, bArr, i, i2, 0, c3753d7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4101z9
    /* renamed from: h */
    public final boolean mo28526h(T t, T t2) {
        boolean m29757h;
        int length = this.f9653a.length;
        for (int i = 0; i < length; i += 3) {
            int m29005k = m29005k(i);
            long j = m29005k & 1048575;
            switch (m29006j(m29005k)) {
                case 0:
                    if (m28995u(t, t2, i) && Double.doubleToLongBits(C4070xa.m28642f(t, j)) == Double.doubleToLongBits(C4070xa.m28642f(t2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (m28995u(t, t2, i) && Float.floatToIntBits(C4070xa.m28641g(t, j)) == Float.floatToIntBits(C4070xa.m28641g(t2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (m28995u(t, t2, i) && C4070xa.m28639i(t, j) == C4070xa.m28639i(t2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (m28995u(t, t2, i) && C4070xa.m28639i(t, j) == C4070xa.m28639i(t2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (m28995u(t, t2, i) && C4070xa.m28640h(t, j) == C4070xa.m28640h(t2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (m28995u(t, t2, i) && C4070xa.m28639i(t, j) == C4070xa.m28639i(t2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (m28995u(t, t2, i) && C4070xa.m28640h(t, j) == C4070xa.m28640h(t2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (m28995u(t, t2, i) && C4070xa.m28651B(t, j) == C4070xa.m28651B(t2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (m28995u(t, t2, i) && C3724ba.m29757h(C4070xa.m28637k(t, j), C4070xa.m28637k(t2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (m28995u(t, t2, i) && C3724ba.m29757h(C4070xa.m28637k(t, j), C4070xa.m28637k(t2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (m28995u(t, t2, i) && C3724ba.m29757h(C4070xa.m28637k(t, j), C4070xa.m28637k(t2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (m28995u(t, t2, i) && C4070xa.m28640h(t, j) == C4070xa.m28640h(t2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (m28995u(t, t2, i) && C4070xa.m28640h(t, j) == C4070xa.m28640h(t2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (m28995u(t, t2, i) && C4070xa.m28640h(t, j) == C4070xa.m28640h(t2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (m28995u(t, t2, i) && C4070xa.m28639i(t, j) == C4070xa.m28639i(t2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (m28995u(t, t2, i) && C4070xa.m28640h(t, j) == C4070xa.m28640h(t2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (m28995u(t, t2, i) && C4070xa.m28639i(t, j) == C4070xa.m28639i(t2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (m28995u(t, t2, i) && C3724ba.m29757h(C4070xa.m28637k(t, j), C4070xa.m28637k(t2, j))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    m29757h = C3724ba.m29757h(C4070xa.m28637k(t, j), C4070xa.m28637k(t2, j));
                    break;
                case 50:
                    m29757h = C3724ba.m29757h(C4070xa.m28637k(t, j), C4070xa.m28637k(t2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long m29008S = m29008S(i) & 1048575;
                    if (C4070xa.m28640h(t, m29008S) == C4070xa.m28640h(t2, m29008S) && C3724ba.m29757h(C4070xa.m28637k(t, j), C4070xa.m28637k(t2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!m29757h) {
                return false;
            }
        }
        if (this.f9664l.mo29099c(t).equals(this.f9664l.mo29099c(t2))) {
            if (this.f9658f) {
                this.f9665m.mo29797a(t);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4101z9
    /* renamed from: i */
    public final void mo28525i(T t, C4035v7 c4035v7) throws IOException {
        if (!this.f9659g) {
            m29026A(t, c4035v7);
        } else if (!this.f9658f) {
            int length = this.f9653a.length;
            for (int i = 0; i < length; i += 3) {
                int m29005k = m29005k(i);
                int i2 = this.f9653a[i];
                switch (m29006j(m29005k)) {
                    case 0:
                        if (m28994v(t, i)) {
                            c4035v7.m28749q(i2, C4070xa.m28642f(t, m29005k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (m28994v(t, i)) {
                            c4035v7.m28740z(i2, C4070xa.m28641g(t, m29005k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (m28994v(t, i)) {
                            c4035v7.m28772E(i2, C4070xa.m28639i(t, m29005k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (m28994v(t, i)) {
                            c4035v7.m28756j(i2, C4070xa.m28639i(t, m29005k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (m28994v(t, i)) {
                            c4035v7.m28774C(i2, C4070xa.m28640h(t, m29005k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (m28994v(t, i)) {
                            c4035v7.m28742x(i2, C4070xa.m28639i(t, m29005k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (m28994v(t, i)) {
                            c4035v7.m28744v(i2, C4070xa.m28640h(t, m29005k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (m28994v(t, i)) {
                            c4035v7.m28753m(i2, C4070xa.m28651B(t, m29005k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (m28994v(t, i)) {
                            m29024C(i2, C4070xa.m28637k(t, m29005k & 1048575), c4035v7);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (m28994v(t, i)) {
                            c4035v7.m28770G(i2, C4070xa.m28637k(t, m29005k & 1048575), m29002n(i));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (m28994v(t, i)) {
                            c4035v7.m28751o(i2, (AbstractC3909n7) C4070xa.m28637k(t, m29005k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (m28994v(t, i)) {
                            c4035v7.m28758h(i2, C4070xa.m28640h(t, m29005k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (m28994v(t, i)) {
                            c4035v7.m28746t(i2, C4070xa.m28640h(t, m29005k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (m28994v(t, i)) {
                            c4035v7.m28769H(i2, C4070xa.m28640h(t, m29005k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (m28994v(t, i)) {
                            c4035v7.m28767J(i2, C4070xa.m28639i(t, m29005k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (m28994v(t, i)) {
                            c4035v7.m28765a(i2, C4070xa.m28640h(t, m29005k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (m28994v(t, i)) {
                            c4035v7.m28763c(i2, C4070xa.m28639i(t, m29005k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (m28994v(t, i)) {
                            c4035v7.m28775B(i2, C4070xa.m28637k(t, m29005k & 1048575), m29002n(i));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        C3724ba.m29753l(this.f9653a[i], (List) C4070xa.m28637k(t, m29005k & 1048575), c4035v7, false);
                        break;
                    case 19:
                        C3724ba.m29749p(this.f9653a[i], (List) C4070xa.m28637k(t, m29005k & 1048575), c4035v7, false);
                        break;
                    case 20:
                        C3724ba.m29746s(this.f9653a[i], (List) C4070xa.m28637k(t, m29005k & 1048575), c4035v7, false);
                        break;
                    case 21:
                        C3724ba.m29791B(this.f9653a[i], (List) C4070xa.m28637k(t, m29005k & 1048575), c4035v7, false);
                        break;
                    case 22:
                        C3724ba.m29747r(this.f9653a[i], (List) C4070xa.m28637k(t, m29005k & 1048575), c4035v7, false);
                        break;
                    case 23:
                        C3724ba.m29750o(this.f9653a[i], (List) C4070xa.m28637k(t, m29005k & 1048575), c4035v7, false);
                        break;
                    case 24:
                        C3724ba.m29751n(this.f9653a[i], (List) C4070xa.m28637k(t, m29005k & 1048575), c4035v7, false);
                        break;
                    case 25:
                        C3724ba.m29755j(this.f9653a[i], (List) C4070xa.m28637k(t, m29005k & 1048575), c4035v7, false);
                        break;
                    case 26:
                        C3724ba.m29740y(this.f9653a[i], (List) C4070xa.m28637k(t, m29005k & 1048575), c4035v7);
                        break;
                    case 27:
                        C3724ba.m29745t(this.f9653a[i], (List) C4070xa.m28637k(t, m29005k & 1048575), c4035v7, m29002n(i));
                        break;
                    case 28:
                        C3724ba.m29754k(this.f9653a[i], (List) C4070xa.m28637k(t, m29005k & 1048575), c4035v7);
                        break;
                    case 29:
                        C3724ba.m29739z(this.f9653a[i], (List) C4070xa.m28637k(t, m29005k & 1048575), c4035v7, false);
                        break;
                    case 30:
                        C3724ba.m29752m(this.f9653a[i], (List) C4070xa.m28637k(t, m29005k & 1048575), c4035v7, false);
                        break;
                    case 31:
                        C3724ba.m29744u(this.f9653a[i], (List) C4070xa.m28637k(t, m29005k & 1048575), c4035v7, false);
                        break;
                    case 32:
                        C3724ba.m29743v(this.f9653a[i], (List) C4070xa.m28637k(t, m29005k & 1048575), c4035v7, false);
                        break;
                    case 33:
                        C3724ba.m29742w(this.f9653a[i], (List) C4070xa.m28637k(t, m29005k & 1048575), c4035v7, false);
                        break;
                    case 34:
                        C3724ba.m29741x(this.f9653a[i], (List) C4070xa.m28637k(t, m29005k & 1048575), c4035v7, false);
                        break;
                    case 35:
                        C3724ba.m29753l(this.f9653a[i], (List) C4070xa.m28637k(t, m29005k & 1048575), c4035v7, true);
                        break;
                    case 36:
                        C3724ba.m29749p(this.f9653a[i], (List) C4070xa.m28637k(t, m29005k & 1048575), c4035v7, true);
                        break;
                    case 37:
                        C3724ba.m29746s(this.f9653a[i], (List) C4070xa.m28637k(t, m29005k & 1048575), c4035v7, true);
                        break;
                    case 38:
                        C3724ba.m29791B(this.f9653a[i], (List) C4070xa.m28637k(t, m29005k & 1048575), c4035v7, true);
                        break;
                    case 39:
                        C3724ba.m29747r(this.f9653a[i], (List) C4070xa.m28637k(t, m29005k & 1048575), c4035v7, true);
                        break;
                    case 40:
                        C3724ba.m29750o(this.f9653a[i], (List) C4070xa.m28637k(t, m29005k & 1048575), c4035v7, true);
                        break;
                    case 41:
                        C3724ba.m29751n(this.f9653a[i], (List) C4070xa.m28637k(t, m29005k & 1048575), c4035v7, true);
                        break;
                    case 42:
                        C3724ba.m29755j(this.f9653a[i], (List) C4070xa.m28637k(t, m29005k & 1048575), c4035v7, true);
                        break;
                    case 43:
                        C3724ba.m29739z(this.f9653a[i], (List) C4070xa.m28637k(t, m29005k & 1048575), c4035v7, true);
                        break;
                    case 44:
                        C3724ba.m29752m(this.f9653a[i], (List) C4070xa.m28637k(t, m29005k & 1048575), c4035v7, true);
                        break;
                    case 45:
                        C3724ba.m29744u(this.f9653a[i], (List) C4070xa.m28637k(t, m29005k & 1048575), c4035v7, true);
                        break;
                    case 46:
                        C3724ba.m29743v(this.f9653a[i], (List) C4070xa.m28637k(t, m29005k & 1048575), c4035v7, true);
                        break;
                    case 47:
                        C3724ba.m29742w(this.f9653a[i], (List) C4070xa.m28637k(t, m29005k & 1048575), c4035v7, true);
                        break;
                    case 48:
                        C3724ba.m29741x(this.f9653a[i], (List) C4070xa.m28637k(t, m29005k & 1048575), c4035v7, true);
                        break;
                    case 49:
                        C3724ba.m29748q(this.f9653a[i], (List) C4070xa.m28637k(t, m29005k & 1048575), c4035v7, m29002n(i));
                        break;
                    case 50:
                        m29025B(c4035v7, i2, C4070xa.m28637k(t, m29005k & 1048575), i);
                        break;
                    case 51:
                        if (m28991y(t, i2, i)) {
                            c4035v7.m28749q(i2, m29019H(t, m29005k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (m28991y(t, i2, i)) {
                            c4035v7.m28740z(i2, m29018I(t, m29005k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (m28991y(t, i2, i)) {
                            c4035v7.m28772E(i2, m29004l(t, m29005k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (m28991y(t, i2, i)) {
                            c4035v7.m28756j(i2, m29004l(t, m29005k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (m28991y(t, i2, i)) {
                            c4035v7.m28774C(i2, m29015L(t, m29005k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (m28991y(t, i2, i)) {
                            c4035v7.m28742x(i2, m29004l(t, m29005k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (m28991y(t, i2, i)) {
                            c4035v7.m28744v(i2, m29015L(t, m29005k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (m28991y(t, i2, i)) {
                            c4035v7.m28753m(i2, m28990z(t, m29005k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (m28991y(t, i2, i)) {
                            m29024C(i2, C4070xa.m28637k(t, m29005k & 1048575), c4035v7);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (m28991y(t, i2, i)) {
                            c4035v7.m28770G(i2, C4070xa.m28637k(t, m29005k & 1048575), m29002n(i));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (m28991y(t, i2, i)) {
                            c4035v7.m28751o(i2, (AbstractC3909n7) C4070xa.m28637k(t, m29005k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (m28991y(t, i2, i)) {
                            c4035v7.m28758h(i2, m29015L(t, m29005k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (m28991y(t, i2, i)) {
                            c4035v7.m28746t(i2, m29015L(t, m29005k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (m28991y(t, i2, i)) {
                            c4035v7.m28769H(i2, m29015L(t, m29005k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (m28991y(t, i2, i)) {
                            c4035v7.m28767J(i2, m29004l(t, m29005k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (m28991y(t, i2, i)) {
                            c4035v7.m28765a(i2, m29015L(t, m29005k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (m28991y(t, i2, i)) {
                            c4035v7.m28763c(i2, m29004l(t, m29005k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (m28991y(t, i2, i)) {
                            c4035v7.m28775B(i2, C4070xa.m28637k(t, m29005k & 1048575), m29002n(i));
                            break;
                        } else {
                            break;
                        }
                }
            }
            AbstractC3912na<?, ?> abstractC3912na = this.f9664l;
            abstractC3912na.mo29093i(abstractC3912na.mo29099c(t), c4035v7);
        } else {
            this.f9665m.mo29797a(t);
            throw null;
        }
    }
}
