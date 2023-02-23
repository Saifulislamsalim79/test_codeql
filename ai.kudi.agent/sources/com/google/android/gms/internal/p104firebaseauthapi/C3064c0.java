package com.google.android.gms.internal.p104firebaseauthapi;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.c0 */
/* loaded from: classes2.dex */
public final class C3064c0<T> implements InterfaceC3307l0<T> {

    /* renamed from: p */
    private static final int[] f8275p = new int[0];

    /* renamed from: q */
    private static final Unsafe f8276q = C3254j1.m30922l();

    /* renamed from: a */
    private final int[] f8277a;

    /* renamed from: b */
    private final Object[] f8278b;

    /* renamed from: c */
    private final int f8279c;

    /* renamed from: d */
    private final int f8280d;

    /* renamed from: e */
    private final InterfaceC3644y f8281e;

    /* renamed from: f */
    private final boolean f8282f;

    /* renamed from: g */
    private final boolean f8283g;

    /* renamed from: h */
    private final boolean f8284h;

    /* renamed from: i */
    private final int[] f8285i;

    /* renamed from: j */
    private final int f8286j;

    /* renamed from: k */
    private final int f8287k;

    /* renamed from: l */
    private final AbstractC3332m f8288l;

    /* renamed from: m */
    private final AbstractC3645y0<?, ?> f8289m;

    /* renamed from: n */
    private final AbstractC3643xo<?> f8290n;

    /* renamed from: o */
    private final C3514t f8291o;

    /* JADX WARN: Multi-variable type inference failed */
    private C3064c0(int[] iArr, int[] iArr2, Object[] objArr, int i, int i2, InterfaceC3644y interfaceC3644y, boolean z, boolean z2, int[] iArr3, int i3, int i4, C3118e0 c3118e0, AbstractC3332m abstractC3332m, AbstractC3645y0<?, ?> abstractC3645y0, AbstractC3643xo<?> abstractC3643xo, C3514t c3514t) {
        this.f8277a = iArr;
        this.f8278b = iArr2;
        this.f8279c = objArr;
        this.f8280d = i;
        this.f8283g = i2 instanceof AbstractC3251ip;
        this.f8284h = interfaceC3644y;
        boolean z3 = false;
        if (abstractC3645y0 != 0 && abstractC3645y0.mo29917e(i2)) {
            z3 = true;
        }
        this.f8282f = z3;
        this.f8285i = z2;
        this.f8286j = iArr3;
        this.f8287k = i3;
        this.f8288l = c3118e0;
        this.f8289m = abstractC3332m;
        this.f8290n = abstractC3645y0;
        this.f8281e = i2;
        this.f8291o = abstractC3643xo;
    }

    /* renamed from: A */
    private final boolean m31349A(T t, int i) {
        int m31326X = m31326X(i);
        long j = m31326X & 1048575;
        if (j != 1048575) {
            return (C3254j1.m30926h(t, j) & (1 << (m31326X >>> 20))) != 0;
        }
        int m31323m = m31323m(i);
        long j2 = m31323m & 1048575;
        switch (m31324l(m31323m)) {
            case 0:
                return C3254j1.m30928f(t, j2) != 0.0d;
            case 1:
                return C3254j1.m30927g(t, j2) != 0.0f;
            case 2:
                return C3254j1.m30925i(t, j2) != 0;
            case 3:
                return C3254j1.m30925i(t, j2) != 0;
            case 4:
                return C3254j1.m30926h(t, j2) != 0;
            case 5:
                return C3254j1.m30925i(t, j2) != 0;
            case 6:
                return C3254j1.m30926h(t, j2) != 0;
            case 7:
                return C3254j1.m30937B(t, j2);
            case 8:
                Object m30923k = C3254j1.m30923k(t, j2);
                if (m30923k instanceof String) {
                    return !((String) m30923k).isEmpty();
                } else if (m30923k instanceof AbstractC3223ho) {
                    return !AbstractC3223ho.f8571d.equals(m30923k);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return C3254j1.m30923k(t, j2) != null;
            case 10:
                return !AbstractC3223ho.f8571d.equals(C3254j1.m30923k(t, j2));
            case 11:
                return C3254j1.m30926h(t, j2) != 0;
            case 12:
                return C3254j1.m30926h(t, j2) != 0;
            case 13:
                return C3254j1.m30926h(t, j2) != 0;
            case 14:
                return C3254j1.m30925i(t, j2) != 0;
            case 15:
                return C3254j1.m30926h(t, j2) != 0;
            case 16:
                return C3254j1.m30925i(t, j2) != 0;
            case 17:
                return C3254j1.m30923k(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: B */
    private final boolean m31348B(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m31349A(t, i);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: C */
    private static boolean m31347C(Object obj, int i, InterfaceC3307l0 interfaceC3307l0) {
        return interfaceC3307l0.mo30810g(C3254j1.m30923k(obj, i & 1048575));
    }

    /* renamed from: D */
    private final boolean m31346D(T t, int i, int i2) {
        return C3254j1.m30926h(t, (long) (m31326X(i2) & 1048575)) == i;
    }

    /* renamed from: E */
    private static <T> boolean m31345E(T t, long j) {
        return ((Boolean) C3254j1.m30923k(t, j)).booleanValue();
    }

    /* renamed from: F */
    private final void m31344F(T t, C3513so c3513so) throws IOException {
        int i;
        if (!this.f8282f) {
            int length = this.f8277a.length;
            Unsafe unsafe = f8276q;
            int i2 = 1048575;
            int i3 = 0;
            int i4 = 0;
            int i5 = 1048575;
            while (i3 < length) {
                int m31323m = m31323m(i3);
                int i6 = this.f8277a[i3];
                int m31324l = m31324l(m31323m);
                if (m31324l <= 17) {
                    int i7 = this.f8277a[i3 + 2];
                    int i8 = i7 & i2;
                    if (i8 != i5) {
                        i4 = unsafe.getInt(t, i8);
                        i5 = i8;
                    }
                    i = 1 << (i7 >>> 20);
                } else {
                    i = 0;
                }
                long j = m31323m & i2;
                switch (m31324l) {
                    case 0:
                        if ((i4 & i) != 0) {
                            c3513so.m30236q(i6, C3254j1.m30928f(t, j));
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 1:
                        if ((i4 & i) != 0) {
                            c3513so.m30227z(i6, C3254j1.m30927g(t, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 2:
                        if ((i4 & i) != 0) {
                            c3513so.m30259E(i6, unsafe.getLong(t, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 3:
                        if ((i4 & i) != 0) {
                            c3513so.m30243j(i6, unsafe.getLong(t, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 4:
                        if ((i4 & i) != 0) {
                            c3513so.m30261C(i6, unsafe.getInt(t, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 5:
                        if ((i4 & i) != 0) {
                            c3513so.m30229x(i6, unsafe.getLong(t, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 6:
                        if ((i4 & i) != 0) {
                            c3513so.m30231v(i6, unsafe.getInt(t, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 7:
                        if ((i4 & i) != 0) {
                            c3513so.m30240m(i6, C3254j1.m30937B(t, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 8:
                        if ((i4 & i) != 0) {
                            m31342H(i6, unsafe.getObject(t, j), c3513so);
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 9:
                        if ((i4 & i) != 0) {
                            c3513so.m30257G(i6, unsafe.getObject(t, j), m31320p(i3));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 10:
                        if ((i4 & i) != 0) {
                            c3513so.m30238o(i6, (AbstractC3223ho) unsafe.getObject(t, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 11:
                        if ((i4 & i) != 0) {
                            c3513so.m30245h(i6, unsafe.getInt(t, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 12:
                        if ((i4 & i) != 0) {
                            c3513so.m30233t(i6, unsafe.getInt(t, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 13:
                        if ((i4 & i) != 0) {
                            c3513so.m30256H(i6, unsafe.getInt(t, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 14:
                        if ((i4 & i) != 0) {
                            c3513so.m30254J(i6, unsafe.getLong(t, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 15:
                        if ((i4 & i) != 0) {
                            c3513so.m30252a(i6, unsafe.getInt(t, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 16:
                        if ((i4 & i) != 0) {
                            c3513so.m30250c(i6, unsafe.getLong(t, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 17:
                        if ((i4 & i) != 0) {
                            c3513so.m30262B(i6, unsafe.getObject(t, j), m31320p(i3));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 18:
                        C3359n0.m30605l(this.f8277a[i3], (List) unsafe.getObject(t, j), c3513so, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 19:
                        C3359n0.m30601p(this.f8277a[i3], (List) unsafe.getObject(t, j), c3513so, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 20:
                        C3359n0.m30598s(this.f8277a[i3], (List) unsafe.getObject(t, j), c3513so, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 21:
                        C3359n0.m30643B(this.f8277a[i3], (List) unsafe.getObject(t, j), c3513so, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 22:
                        C3359n0.m30599r(this.f8277a[i3], (List) unsafe.getObject(t, j), c3513so, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 23:
                        C3359n0.m30602o(this.f8277a[i3], (List) unsafe.getObject(t, j), c3513so, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 24:
                        C3359n0.m30603n(this.f8277a[i3], (List) unsafe.getObject(t, j), c3513so, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 25:
                        C3359n0.m30607j(this.f8277a[i3], (List) unsafe.getObject(t, j), c3513so, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 26:
                        C3359n0.m30592y(this.f8277a[i3], (List) unsafe.getObject(t, j), c3513so);
                        break;
                    case 27:
                        C3359n0.m30597t(this.f8277a[i3], (List) unsafe.getObject(t, j), c3513so, m31320p(i3));
                        break;
                    case 28:
                        C3359n0.m30606k(this.f8277a[i3], (List) unsafe.getObject(t, j), c3513so);
                        break;
                    case 29:
                        C3359n0.m30591z(this.f8277a[i3], (List) unsafe.getObject(t, j), c3513so, false);
                        break;
                    case 30:
                        C3359n0.m30604m(this.f8277a[i3], (List) unsafe.getObject(t, j), c3513so, false);
                        break;
                    case 31:
                        C3359n0.m30596u(this.f8277a[i3], (List) unsafe.getObject(t, j), c3513so, false);
                        break;
                    case 32:
                        C3359n0.m30595v(this.f8277a[i3], (List) unsafe.getObject(t, j), c3513so, false);
                        break;
                    case 33:
                        C3359n0.m30594w(this.f8277a[i3], (List) unsafe.getObject(t, j), c3513so, false);
                        break;
                    case 34:
                        C3359n0.m30593x(this.f8277a[i3], (List) unsafe.getObject(t, j), c3513so, false);
                        break;
                    case 35:
                        C3359n0.m30605l(this.f8277a[i3], (List) unsafe.getObject(t, j), c3513so, true);
                        break;
                    case 36:
                        C3359n0.m30601p(this.f8277a[i3], (List) unsafe.getObject(t, j), c3513so, true);
                        break;
                    case 37:
                        C3359n0.m30598s(this.f8277a[i3], (List) unsafe.getObject(t, j), c3513so, true);
                        break;
                    case 38:
                        C3359n0.m30643B(this.f8277a[i3], (List) unsafe.getObject(t, j), c3513so, true);
                        break;
                    case 39:
                        C3359n0.m30599r(this.f8277a[i3], (List) unsafe.getObject(t, j), c3513so, true);
                        break;
                    case 40:
                        C3359n0.m30602o(this.f8277a[i3], (List) unsafe.getObject(t, j), c3513so, true);
                        break;
                    case 41:
                        C3359n0.m30603n(this.f8277a[i3], (List) unsafe.getObject(t, j), c3513so, true);
                        break;
                    case 42:
                        C3359n0.m30607j(this.f8277a[i3], (List) unsafe.getObject(t, j), c3513so, true);
                        break;
                    case 43:
                        C3359n0.m30591z(this.f8277a[i3], (List) unsafe.getObject(t, j), c3513so, true);
                        break;
                    case 44:
                        C3359n0.m30604m(this.f8277a[i3], (List) unsafe.getObject(t, j), c3513so, true);
                        break;
                    case 45:
                        C3359n0.m30596u(this.f8277a[i3], (List) unsafe.getObject(t, j), c3513so, true);
                        break;
                    case 46:
                        C3359n0.m30595v(this.f8277a[i3], (List) unsafe.getObject(t, j), c3513so, true);
                        break;
                    case 47:
                        C3359n0.m30594w(this.f8277a[i3], (List) unsafe.getObject(t, j), c3513so, true);
                        break;
                    case 48:
                        C3359n0.m30593x(this.f8277a[i3], (List) unsafe.getObject(t, j), c3513so, true);
                        break;
                    case 49:
                        C3359n0.m30600q(this.f8277a[i3], (List) unsafe.getObject(t, j), c3513so, m31320p(i3));
                        break;
                    case 50:
                        m31343G(c3513so, i6, unsafe.getObject(t, j), i3);
                        break;
                    case 51:
                        if (m31346D(t, i6, i3)) {
                            c3513so.m30236q(i6, m31337M(t, j));
                            break;
                        }
                        break;
                    case 52:
                        if (m31346D(t, i6, i3)) {
                            c3513so.m30227z(i6, m31336N(t, j));
                            break;
                        }
                        break;
                    case 53:
                        if (m31346D(t, i6, i3)) {
                            c3513so.m30259E(i6, m31322n(t, j));
                            break;
                        }
                        break;
                    case 54:
                        if (m31346D(t, i6, i3)) {
                            c3513so.m30243j(i6, m31322n(t, j));
                            break;
                        }
                        break;
                    case 55:
                        if (m31346D(t, i6, i3)) {
                            c3513so.m30261C(i6, m31333Q(t, j));
                            break;
                        }
                        break;
                    case 56:
                        if (m31346D(t, i6, i3)) {
                            c3513so.m30229x(i6, m31322n(t, j));
                            break;
                        }
                        break;
                    case 57:
                        if (m31346D(t, i6, i3)) {
                            c3513so.m30231v(i6, m31333Q(t, j));
                            break;
                        }
                        break;
                    case 58:
                        if (m31346D(t, i6, i3)) {
                            c3513so.m30240m(i6, m31345E(t, j));
                            break;
                        }
                        break;
                    case 59:
                        if (m31346D(t, i6, i3)) {
                            m31342H(i6, unsafe.getObject(t, j), c3513so);
                            break;
                        }
                        break;
                    case 60:
                        if (m31346D(t, i6, i3)) {
                            c3513so.m30257G(i6, unsafe.getObject(t, j), m31320p(i3));
                            break;
                        }
                        break;
                    case 61:
                        if (m31346D(t, i6, i3)) {
                            c3513so.m30238o(i6, (AbstractC3223ho) unsafe.getObject(t, j));
                            break;
                        }
                        break;
                    case 62:
                        if (m31346D(t, i6, i3)) {
                            c3513so.m30245h(i6, m31333Q(t, j));
                            break;
                        }
                        break;
                    case 63:
                        if (m31346D(t, i6, i3)) {
                            c3513so.m30233t(i6, m31333Q(t, j));
                            break;
                        }
                        break;
                    case 64:
                        if (m31346D(t, i6, i3)) {
                            c3513so.m30256H(i6, m31333Q(t, j));
                            break;
                        }
                        break;
                    case 65:
                        if (m31346D(t, i6, i3)) {
                            c3513so.m30254J(i6, m31322n(t, j));
                            break;
                        }
                        break;
                    case 66:
                        if (m31346D(t, i6, i3)) {
                            c3513so.m30252a(i6, m31333Q(t, j));
                            break;
                        }
                        break;
                    case 67:
                        if (m31346D(t, i6, i3)) {
                            c3513so.m30250c(i6, m31322n(t, j));
                            break;
                        }
                        break;
                    case 68:
                        if (m31346D(t, i6, i3)) {
                            c3513so.m30262B(i6, unsafe.getObject(t, j), m31320p(i3));
                            break;
                        }
                        break;
                }
                i3 += 3;
                i2 = 1048575;
            }
            AbstractC3645y0<?, ?> abstractC3645y0 = this.f8289m;
            abstractC3645y0.mo29978r(abstractC3645y0.mo29992d(t), c3513so);
            return;
        }
        this.f8290n.mo29921a(t);
        throw null;
    }

    /* renamed from: G */
    private final <K, V> void m31343G(C3513so c3513so, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        C3462r c3462r = (C3462r) m31318r(i2);
        throw null;
    }

    /* renamed from: H */
    private static final void m31342H(int i, Object obj, C3513so c3513so) throws IOException {
        if (obj instanceof String) {
            c3513so.m30247f(i, (String) obj);
        } else {
            c3513so.m30238o(i, (AbstractC3223ho) obj);
        }
    }

    /* renamed from: J */
    static C3011a1 m31340J(Object obj) {
        AbstractC3251ip abstractC3251ip = (AbstractC3251ip) obj;
        C3011a1 c3011a1 = abstractC3251ip.zzc;
        if (c3011a1 == C3011a1.m31462c()) {
            C3011a1 m31460e = C3011a1.m31460e();
            abstractC3251ip.zzc = m31460e;
            return m31460e;
        }
        return c3011a1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public static <T> C3064c0<T> m31339K(Class<T> cls, InterfaceC3566v interfaceC3566v, C3118e0 c3118e0, AbstractC3332m abstractC3332m, AbstractC3645y0<?, ?> abstractC3645y0, AbstractC3643xo<?> abstractC3643xo, C3514t c3514t) {
        if (interfaceC3566v instanceof C3253j0) {
            return m31338L((C3253j0) interfaceC3566v, c3118e0, abstractC3332m, abstractC3645y0, abstractC3643xo, c3514t);
        }
        C3593w0 c3593w0 = (C3593w0) interfaceC3566v;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0385  */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <T> com.google.android.gms.internal.p104firebaseauthapi.C3064c0<T> m31338L(com.google.android.gms.internal.p104firebaseauthapi.C3253j0 r34, com.google.android.gms.internal.p104firebaseauthapi.C3118e0 r35, com.google.android.gms.internal.p104firebaseauthapi.AbstractC3332m r36, com.google.android.gms.internal.p104firebaseauthapi.AbstractC3645y0<?, ?> r37, com.google.android.gms.internal.p104firebaseauthapi.AbstractC3643xo<?> r38, com.google.android.gms.internal.p104firebaseauthapi.C3514t r39) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p104firebaseauthapi.C3064c0.m31338L(com.google.android.gms.internal.firebase-auth-api.j0, com.google.android.gms.internal.firebase-auth-api.e0, com.google.android.gms.internal.firebase-auth-api.m, com.google.android.gms.internal.firebase-auth-api.y0, com.google.android.gms.internal.firebase-auth-api.xo, com.google.android.gms.internal.firebase-auth-api.t):com.google.android.gms.internal.firebase-auth-api.c0");
    }

    /* renamed from: M */
    private static <T> double m31337M(T t, long j) {
        return ((Double) C3254j1.m30923k(t, j)).doubleValue();
    }

    /* renamed from: N */
    private static <T> float m31336N(T t, long j) {
        return ((Float) C3254j1.m30923k(t, j)).floatValue();
    }

    /* renamed from: O */
    private final int m31335O(T t) {
        int i;
        int m30324f;
        int m30324f2;
        int m30324f3;
        int m30323g;
        int m30324f4;
        int m30330G;
        int m30324f5;
        int m30324f6;
        int mo31014f;
        int m30324f7;
        int m30628Q;
        int m30325e;
        int m30324f8;
        int i2;
        Unsafe unsafe = f8276q;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        for (int i6 = 0; i6 < this.f8277a.length; i6 += 3) {
            int m31323m = m31323m(i6);
            int i7 = this.f8277a[i6];
            int m31324l = m31324l(m31323m);
            if (m31324l <= 17) {
                int i8 = this.f8277a[i6 + 2];
                int i9 = i8 & 1048575;
                i = 1 << (i8 >>> 20);
                if (i9 != i5) {
                    i4 = unsafe.getInt(t, i9);
                    i5 = i9;
                }
            } else {
                i = 0;
            }
            long j = m31323m & 1048575;
            switch (m31324l) {
                case 0:
                    if ((i4 & i) != 0) {
                        m30324f = AbstractC3487ro.m30324f(i7 << 3);
                        m30628Q = m30324f + 8;
                        break;
                    } else {
                        continue;
                    }
                case 1:
                    if ((i4 & i) != 0) {
                        m30324f2 = AbstractC3487ro.m30324f(i7 << 3);
                        m30628Q = m30324f2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if ((i4 & i) != 0) {
                        long j2 = unsafe.getLong(t, j);
                        m30324f3 = AbstractC3487ro.m30324f(i7 << 3);
                        m30323g = AbstractC3487ro.m30323g(j2);
                        m30628Q = m30324f3 + m30323g;
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if ((i4 & i) != 0) {
                        long j3 = unsafe.getLong(t, j);
                        m30324f3 = AbstractC3487ro.m30324f(i7 << 3);
                        m30323g = AbstractC3487ro.m30323g(j3);
                        m30628Q = m30324f3 + m30323g;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if ((i4 & i) != 0) {
                        int i10 = unsafe.getInt(t, j);
                        m30324f4 = AbstractC3487ro.m30324f(i7 << 3);
                        m30330G = AbstractC3487ro.m30330G(i10);
                        i2 = m30324f4 + m30330G;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 5:
                    if ((i4 & i) != 0) {
                        m30324f = AbstractC3487ro.m30324f(i7 << 3);
                        m30628Q = m30324f + 8;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if ((i4 & i) != 0) {
                        m30324f2 = AbstractC3487ro.m30324f(i7 << 3);
                        m30628Q = m30324f2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if ((i4 & i) != 0) {
                        m30324f5 = AbstractC3487ro.m30324f(i7 << 3);
                        m30628Q = m30324f5 + 1;
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if ((i4 & i) != 0) {
                        Object object = unsafe.getObject(t, j);
                        if (object instanceof AbstractC3223ho) {
                            m30324f6 = AbstractC3487ro.m30324f(i7 << 3);
                            mo31014f = ((AbstractC3223ho) object).mo31014f();
                            m30324f7 = AbstractC3487ro.m30324f(mo31014f);
                            i2 = m30324f6 + m30324f7 + mo31014f;
                            i3 += i2;
                        } else {
                            m30324f4 = AbstractC3487ro.m30324f(i7 << 3);
                            m30330G = AbstractC3487ro.m30326d((String) object);
                            i2 = m30324f4 + m30330G;
                            i3 += i2;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if ((i4 & i) != 0) {
                        m30628Q = C3359n0.m30628Q(i7, unsafe.getObject(t, j), m31320p(i6));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if ((i4 & i) != 0) {
                        m30324f6 = AbstractC3487ro.m30324f(i7 << 3);
                        mo31014f = ((AbstractC3223ho) unsafe.getObject(t, j)).mo31014f();
                        m30324f7 = AbstractC3487ro.m30324f(mo31014f);
                        i2 = m30324f6 + m30324f7 + mo31014f;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 11:
                    if ((i4 & i) != 0) {
                        int i11 = unsafe.getInt(t, j);
                        m30324f4 = AbstractC3487ro.m30324f(i7 << 3);
                        m30330G = AbstractC3487ro.m30324f(i11);
                        i2 = m30324f4 + m30330G;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 12:
                    if ((i4 & i) != 0) {
                        int i12 = unsafe.getInt(t, j);
                        m30324f4 = AbstractC3487ro.m30324f(i7 << 3);
                        m30330G = AbstractC3487ro.m30330G(i12);
                        i2 = m30324f4 + m30330G;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 13:
                    if ((i4 & i) != 0) {
                        m30324f2 = AbstractC3487ro.m30324f(i7 << 3);
                        m30628Q = m30324f2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if ((i4 & i) != 0) {
                        m30324f = AbstractC3487ro.m30324f(i7 << 3);
                        m30628Q = m30324f + 8;
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if ((i4 & i) != 0) {
                        int i13 = unsafe.getInt(t, j);
                        m30324f4 = AbstractC3487ro.m30324f(i7 << 3);
                        m30330G = AbstractC3487ro.m30324f((i13 >> 31) ^ (i13 + i13));
                        i2 = m30324f4 + m30330G;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 16:
                    if ((i4 & i) != 0) {
                        long j4 = unsafe.getLong(t, j);
                        m30324f4 = AbstractC3487ro.m30324f(i7 << 3);
                        m30330G = AbstractC3487ro.m30323g((j4 >> 63) ^ (j4 + j4));
                        i2 = m30324f4 + m30330G;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 17:
                    if ((i4 & i) != 0) {
                        m30628Q = AbstractC3487ro.m30331F(i7, (InterfaceC3644y) unsafe.getObject(t, j), m31320p(i6));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    m30628Q = C3359n0.m30635J(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 19:
                    m30628Q = C3359n0.m30637H(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 20:
                    m30628Q = C3359n0.m30630O(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 21:
                    m30628Q = C3359n0.m30619Z(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 22:
                    m30628Q = C3359n0.m30632M(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 23:
                    m30628Q = C3359n0.m30635J(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 24:
                    m30628Q = C3359n0.m30637H(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 25:
                    m30628Q = C3359n0.m30644A(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 26:
                    m30628Q = C3359n0.m30622W(i7, (List) unsafe.getObject(t, j));
                    break;
                case 27:
                    m30628Q = C3359n0.m30627R(i7, (List) unsafe.getObject(t, j), m31320p(i6));
                    break;
                case 28:
                    m30628Q = C3359n0.m30640E(i7, (List) unsafe.getObject(t, j));
                    break;
                case 29:
                    m30628Q = C3359n0.m30621X(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 30:
                    m30628Q = C3359n0.m30639F(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 31:
                    m30628Q = C3359n0.m30637H(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 32:
                    m30628Q = C3359n0.m30635J(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 33:
                    m30628Q = C3359n0.m30626S(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 34:
                    m30628Q = C3359n0.m30624U(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 35:
                    m30330G = C3359n0.m30634K((List) unsafe.getObject(t, j));
                    if (m30330G > 0) {
                        m30325e = AbstractC3487ro.m30325e(i7);
                        m30324f8 = AbstractC3487ro.m30324f(m30330G);
                        m30324f4 = m30325e + m30324f8;
                        i2 = m30324f4 + m30330G;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 36:
                    m30330G = C3359n0.m30636I((List) unsafe.getObject(t, j));
                    if (m30330G > 0) {
                        m30325e = AbstractC3487ro.m30325e(i7);
                        m30324f8 = AbstractC3487ro.m30324f(m30330G);
                        m30324f4 = m30325e + m30324f8;
                        i2 = m30324f4 + m30330G;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 37:
                    m30330G = C3359n0.m30629P((List) unsafe.getObject(t, j));
                    if (m30330G > 0) {
                        m30325e = AbstractC3487ro.m30325e(i7);
                        m30324f8 = AbstractC3487ro.m30324f(m30330G);
                        m30324f4 = m30325e + m30324f8;
                        i2 = m30324f4 + m30330G;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 38:
                    m30330G = C3359n0.m30617a0((List) unsafe.getObject(t, j));
                    if (m30330G > 0) {
                        m30325e = AbstractC3487ro.m30325e(i7);
                        m30324f8 = AbstractC3487ro.m30324f(m30330G);
                        m30324f4 = m30325e + m30324f8;
                        i2 = m30324f4 + m30330G;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 39:
                    m30330G = C3359n0.m30631N((List) unsafe.getObject(t, j));
                    if (m30330G > 0) {
                        m30325e = AbstractC3487ro.m30325e(i7);
                        m30324f8 = AbstractC3487ro.m30324f(m30330G);
                        m30324f4 = m30325e + m30324f8;
                        i2 = m30324f4 + m30330G;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 40:
                    m30330G = C3359n0.m30634K((List) unsafe.getObject(t, j));
                    if (m30330G > 0) {
                        m30325e = AbstractC3487ro.m30325e(i7);
                        m30324f8 = AbstractC3487ro.m30324f(m30330G);
                        m30324f4 = m30325e + m30324f8;
                        i2 = m30324f4 + m30330G;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 41:
                    m30330G = C3359n0.m30636I((List) unsafe.getObject(t, j));
                    if (m30330G > 0) {
                        m30325e = AbstractC3487ro.m30325e(i7);
                        m30324f8 = AbstractC3487ro.m30324f(m30330G);
                        m30324f4 = m30325e + m30324f8;
                        i2 = m30324f4 + m30330G;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 42:
                    m30330G = C3359n0.m30641D((List) unsafe.getObject(t, j));
                    if (m30330G > 0) {
                        m30325e = AbstractC3487ro.m30325e(i7);
                        m30324f8 = AbstractC3487ro.m30324f(m30330G);
                        m30324f4 = m30325e + m30324f8;
                        i2 = m30324f4 + m30330G;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 43:
                    m30330G = C3359n0.m30620Y((List) unsafe.getObject(t, j));
                    if (m30330G > 0) {
                        m30325e = AbstractC3487ro.m30325e(i7);
                        m30324f8 = AbstractC3487ro.m30324f(m30330G);
                        m30324f4 = m30325e + m30324f8;
                        i2 = m30324f4 + m30330G;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 44:
                    m30330G = C3359n0.m30638G((List) unsafe.getObject(t, j));
                    if (m30330G > 0) {
                        m30325e = AbstractC3487ro.m30325e(i7);
                        m30324f8 = AbstractC3487ro.m30324f(m30330G);
                        m30324f4 = m30325e + m30324f8;
                        i2 = m30324f4 + m30330G;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 45:
                    m30330G = C3359n0.m30636I((List) unsafe.getObject(t, j));
                    if (m30330G > 0) {
                        m30325e = AbstractC3487ro.m30325e(i7);
                        m30324f8 = AbstractC3487ro.m30324f(m30330G);
                        m30324f4 = m30325e + m30324f8;
                        i2 = m30324f4 + m30330G;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 46:
                    m30330G = C3359n0.m30634K((List) unsafe.getObject(t, j));
                    if (m30330G > 0) {
                        m30325e = AbstractC3487ro.m30325e(i7);
                        m30324f8 = AbstractC3487ro.m30324f(m30330G);
                        m30324f4 = m30325e + m30324f8;
                        i2 = m30324f4 + m30330G;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 47:
                    m30330G = C3359n0.m30625T((List) unsafe.getObject(t, j));
                    if (m30330G > 0) {
                        m30325e = AbstractC3487ro.m30325e(i7);
                        m30324f8 = AbstractC3487ro.m30324f(m30330G);
                        m30324f4 = m30325e + m30324f8;
                        i2 = m30324f4 + m30330G;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 48:
                    m30330G = C3359n0.m30623V((List) unsafe.getObject(t, j));
                    if (m30330G > 0) {
                        m30325e = AbstractC3487ro.m30325e(i7);
                        m30324f8 = AbstractC3487ro.m30324f(m30330G);
                        m30324f4 = m30325e + m30324f8;
                        i2 = m30324f4 + m30330G;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 49:
                    m30628Q = C3359n0.m30633L(i7, (List) unsafe.getObject(t, j), m31320p(i6));
                    break;
                case 50:
                    C3514t.m30226a(i7, unsafe.getObject(t, j), m31318r(i6));
                    continue;
                case 51:
                    if (m31346D(t, i7, i6)) {
                        m30324f = AbstractC3487ro.m30324f(i7 << 3);
                        m30628Q = m30324f + 8;
                        break;
                    } else {
                        continue;
                    }
                case 52:
                    if (m31346D(t, i7, i6)) {
                        m30324f2 = AbstractC3487ro.m30324f(i7 << 3);
                        m30628Q = m30324f2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 53:
                    if (m31346D(t, i7, i6)) {
                        long m31322n = m31322n(t, j);
                        m30324f3 = AbstractC3487ro.m30324f(i7 << 3);
                        m30323g = AbstractC3487ro.m30323g(m31322n);
                        m30628Q = m30324f3 + m30323g;
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (m31346D(t, i7, i6)) {
                        long m31322n2 = m31322n(t, j);
                        m30324f3 = AbstractC3487ro.m30324f(i7 << 3);
                        m30323g = AbstractC3487ro.m30323g(m31322n2);
                        m30628Q = m30324f3 + m30323g;
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    if (m31346D(t, i7, i6)) {
                        int m31333Q = m31333Q(t, j);
                        m30324f4 = AbstractC3487ro.m30324f(i7 << 3);
                        m30330G = AbstractC3487ro.m30330G(m31333Q);
                        i2 = m30324f4 + m30330G;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 56:
                    if (m31346D(t, i7, i6)) {
                        m30324f = AbstractC3487ro.m30324f(i7 << 3);
                        m30628Q = m30324f + 8;
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (m31346D(t, i7, i6)) {
                        m30324f2 = AbstractC3487ro.m30324f(i7 << 3);
                        m30628Q = m30324f2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (m31346D(t, i7, i6)) {
                        m30324f5 = AbstractC3487ro.m30324f(i7 << 3);
                        m30628Q = m30324f5 + 1;
                        break;
                    } else {
                        continue;
                    }
                case 59:
                    if (m31346D(t, i7, i6)) {
                        Object object2 = unsafe.getObject(t, j);
                        if (object2 instanceof AbstractC3223ho) {
                            m30324f6 = AbstractC3487ro.m30324f(i7 << 3);
                            mo31014f = ((AbstractC3223ho) object2).mo31014f();
                            m30324f7 = AbstractC3487ro.m30324f(mo31014f);
                            i2 = m30324f6 + m30324f7 + mo31014f;
                            i3 += i2;
                        } else {
                            m30324f4 = AbstractC3487ro.m30324f(i7 << 3);
                            m30330G = AbstractC3487ro.m30326d((String) object2);
                            i2 = m30324f4 + m30330G;
                            i3 += i2;
                        }
                    } else {
                        continue;
                    }
                case 60:
                    if (m31346D(t, i7, i6)) {
                        m30628Q = C3359n0.m30628Q(i7, unsafe.getObject(t, j), m31320p(i6));
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    if (m31346D(t, i7, i6)) {
                        m30324f6 = AbstractC3487ro.m30324f(i7 << 3);
                        mo31014f = ((AbstractC3223ho) unsafe.getObject(t, j)).mo31014f();
                        m30324f7 = AbstractC3487ro.m30324f(mo31014f);
                        i2 = m30324f6 + m30324f7 + mo31014f;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 62:
                    if (m31346D(t, i7, i6)) {
                        int m31333Q2 = m31333Q(t, j);
                        m30324f4 = AbstractC3487ro.m30324f(i7 << 3);
                        m30330G = AbstractC3487ro.m30324f(m31333Q2);
                        i2 = m30324f4 + m30330G;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 63:
                    if (m31346D(t, i7, i6)) {
                        int m31333Q3 = m31333Q(t, j);
                        m30324f4 = AbstractC3487ro.m30324f(i7 << 3);
                        m30330G = AbstractC3487ro.m30330G(m31333Q3);
                        i2 = m30324f4 + m30330G;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 64:
                    if (m31346D(t, i7, i6)) {
                        m30324f2 = AbstractC3487ro.m30324f(i7 << 3);
                        m30628Q = m30324f2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    if (m31346D(t, i7, i6)) {
                        m30324f = AbstractC3487ro.m30324f(i7 << 3);
                        m30628Q = m30324f + 8;
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (m31346D(t, i7, i6)) {
                        int m31333Q4 = m31333Q(t, j);
                        m30324f4 = AbstractC3487ro.m30324f(i7 << 3);
                        m30330G = AbstractC3487ro.m30324f((m31333Q4 >> 31) ^ (m31333Q4 + m31333Q4));
                        i2 = m30324f4 + m30330G;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 67:
                    if (m31346D(t, i7, i6)) {
                        long m31322n3 = m31322n(t, j);
                        m30324f4 = AbstractC3487ro.m30324f(i7 << 3);
                        m30330G = AbstractC3487ro.m30323g((m31322n3 >> 63) ^ (m31322n3 + m31322n3));
                        i2 = m30324f4 + m30330G;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 68:
                    if (m31346D(t, i7, i6)) {
                        m30628Q = AbstractC3487ro.m30331F(i7, (InterfaceC3644y) unsafe.getObject(t, j), m31320p(i6));
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            i3 += m30628Q;
        }
        AbstractC3645y0<?, ?> abstractC3645y0 = this.f8289m;
        int mo29995a = i3 + abstractC3645y0.mo29995a(abstractC3645y0.mo29992d(t));
        if (this.f8282f) {
            this.f8290n.mo29921a(t);
            throw null;
        }
        return mo29995a;
    }

    /* renamed from: P */
    private final int m31334P(T t) {
        int m30324f;
        int m30324f2;
        int m30324f3;
        int m30323g;
        int m30324f4;
        int m30330G;
        int m30324f5;
        int m30324f6;
        int mo31014f;
        int m30324f7;
        int m30628Q;
        int m30325e;
        int m30324f8;
        int i;
        Unsafe unsafe = f8276q;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f8277a.length; i3 += 3) {
            int m31323m = m31323m(i3);
            int m31324l = m31324l(m31323m);
            int i4 = this.f8277a[i3];
            long j = m31323m & 1048575;
            if (m31324l >= EnumC3089cp.DOUBLE_LIST_PACKED.zza() && m31324l <= EnumC3089cp.SINT64_LIST_PACKED.zza()) {
                int i5 = this.f8277a[i3 + 2];
            }
            switch (m31324l) {
                case 0:
                    if (m31349A(t, i3)) {
                        m30324f = AbstractC3487ro.m30324f(i4 << 3);
                        m30628Q = m30324f + 8;
                        i2 += m30628Q;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m31349A(t, i3)) {
                        m30324f2 = AbstractC3487ro.m30324f(i4 << 3);
                        m30628Q = m30324f2 + 4;
                        i2 += m30628Q;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m31349A(t, i3)) {
                        long m30925i = C3254j1.m30925i(t, j);
                        m30324f3 = AbstractC3487ro.m30324f(i4 << 3);
                        m30323g = AbstractC3487ro.m30323g(m30925i);
                        i2 += m30324f3 + m30323g;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m31349A(t, i3)) {
                        long m30925i2 = C3254j1.m30925i(t, j);
                        m30324f3 = AbstractC3487ro.m30324f(i4 << 3);
                        m30323g = AbstractC3487ro.m30323g(m30925i2);
                        i2 += m30324f3 + m30323g;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m31349A(t, i3)) {
                        int m30926h = C3254j1.m30926h(t, j);
                        m30324f4 = AbstractC3487ro.m30324f(i4 << 3);
                        m30330G = AbstractC3487ro.m30330G(m30926h);
                        i = m30324f4 + m30330G;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m31349A(t, i3)) {
                        m30324f = AbstractC3487ro.m30324f(i4 << 3);
                        m30628Q = m30324f + 8;
                        i2 += m30628Q;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m31349A(t, i3)) {
                        m30324f2 = AbstractC3487ro.m30324f(i4 << 3);
                        m30628Q = m30324f2 + 4;
                        i2 += m30628Q;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m31349A(t, i3)) {
                        m30324f5 = AbstractC3487ro.m30324f(i4 << 3);
                        m30628Q = m30324f5 + 1;
                        i2 += m30628Q;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!m31349A(t, i3)) {
                        break;
                    } else {
                        Object m30923k = C3254j1.m30923k(t, j);
                        if (m30923k instanceof AbstractC3223ho) {
                            m30324f6 = AbstractC3487ro.m30324f(i4 << 3);
                            mo31014f = ((AbstractC3223ho) m30923k).mo31014f();
                            m30324f7 = AbstractC3487ro.m30324f(mo31014f);
                            i = m30324f6 + m30324f7 + mo31014f;
                            i2 += i;
                            break;
                        } else {
                            m30324f4 = AbstractC3487ro.m30324f(i4 << 3);
                            m30330G = AbstractC3487ro.m30326d((String) m30923k);
                            i = m30324f4 + m30330G;
                            i2 += i;
                        }
                    }
                case 9:
                    if (m31349A(t, i3)) {
                        m30628Q = C3359n0.m30628Q(i4, C3254j1.m30923k(t, j), m31320p(i3));
                        i2 += m30628Q;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (m31349A(t, i3)) {
                        m30324f6 = AbstractC3487ro.m30324f(i4 << 3);
                        mo31014f = ((AbstractC3223ho) C3254j1.m30923k(t, j)).mo31014f();
                        m30324f7 = AbstractC3487ro.m30324f(mo31014f);
                        i = m30324f6 + m30324f7 + mo31014f;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m31349A(t, i3)) {
                        int m30926h2 = C3254j1.m30926h(t, j);
                        m30324f4 = AbstractC3487ro.m30324f(i4 << 3);
                        m30330G = AbstractC3487ro.m30324f(m30926h2);
                        i = m30324f4 + m30330G;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m31349A(t, i3)) {
                        int m30926h3 = C3254j1.m30926h(t, j);
                        m30324f4 = AbstractC3487ro.m30324f(i4 << 3);
                        m30330G = AbstractC3487ro.m30330G(m30926h3);
                        i = m30324f4 + m30330G;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m31349A(t, i3)) {
                        m30324f2 = AbstractC3487ro.m30324f(i4 << 3);
                        m30628Q = m30324f2 + 4;
                        i2 += m30628Q;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m31349A(t, i3)) {
                        m30324f = AbstractC3487ro.m30324f(i4 << 3);
                        m30628Q = m30324f + 8;
                        i2 += m30628Q;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m31349A(t, i3)) {
                        int m30926h4 = C3254j1.m30926h(t, j);
                        m30324f4 = AbstractC3487ro.m30324f(i4 << 3);
                        m30330G = AbstractC3487ro.m30324f((m30926h4 >> 31) ^ (m30926h4 + m30926h4));
                        i = m30324f4 + m30330G;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m31349A(t, i3)) {
                        long m30925i3 = C3254j1.m30925i(t, j);
                        m30324f4 = AbstractC3487ro.m30324f(i4 << 3);
                        m30330G = AbstractC3487ro.m30323g((m30925i3 >> 63) ^ (m30925i3 + m30925i3));
                        i = m30324f4 + m30330G;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (m31349A(t, i3)) {
                        m30628Q = AbstractC3487ro.m30331F(i4, (InterfaceC3644y) C3254j1.m30923k(t, j), m31320p(i3));
                        i2 += m30628Q;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    m30628Q = C3359n0.m30635J(i4, (List) C3254j1.m30923k(t, j), false);
                    i2 += m30628Q;
                    break;
                case 19:
                    m30628Q = C3359n0.m30637H(i4, (List) C3254j1.m30923k(t, j), false);
                    i2 += m30628Q;
                    break;
                case 20:
                    m30628Q = C3359n0.m30630O(i4, (List) C3254j1.m30923k(t, j), false);
                    i2 += m30628Q;
                    break;
                case 21:
                    m30628Q = C3359n0.m30619Z(i4, (List) C3254j1.m30923k(t, j), false);
                    i2 += m30628Q;
                    break;
                case 22:
                    m30628Q = C3359n0.m30632M(i4, (List) C3254j1.m30923k(t, j), false);
                    i2 += m30628Q;
                    break;
                case 23:
                    m30628Q = C3359n0.m30635J(i4, (List) C3254j1.m30923k(t, j), false);
                    i2 += m30628Q;
                    break;
                case 24:
                    m30628Q = C3359n0.m30637H(i4, (List) C3254j1.m30923k(t, j), false);
                    i2 += m30628Q;
                    break;
                case 25:
                    m30628Q = C3359n0.m30644A(i4, (List) C3254j1.m30923k(t, j), false);
                    i2 += m30628Q;
                    break;
                case 26:
                    m30628Q = C3359n0.m30622W(i4, (List) C3254j1.m30923k(t, j));
                    i2 += m30628Q;
                    break;
                case 27:
                    m30628Q = C3359n0.m30627R(i4, (List) C3254j1.m30923k(t, j), m31320p(i3));
                    i2 += m30628Q;
                    break;
                case 28:
                    m30628Q = C3359n0.m30640E(i4, (List) C3254j1.m30923k(t, j));
                    i2 += m30628Q;
                    break;
                case 29:
                    m30628Q = C3359n0.m30621X(i4, (List) C3254j1.m30923k(t, j), false);
                    i2 += m30628Q;
                    break;
                case 30:
                    m30628Q = C3359n0.m30639F(i4, (List) C3254j1.m30923k(t, j), false);
                    i2 += m30628Q;
                    break;
                case 31:
                    m30628Q = C3359n0.m30637H(i4, (List) C3254j1.m30923k(t, j), false);
                    i2 += m30628Q;
                    break;
                case 32:
                    m30628Q = C3359n0.m30635J(i4, (List) C3254j1.m30923k(t, j), false);
                    i2 += m30628Q;
                    break;
                case 33:
                    m30628Q = C3359n0.m30626S(i4, (List) C3254j1.m30923k(t, j), false);
                    i2 += m30628Q;
                    break;
                case 34:
                    m30628Q = C3359n0.m30624U(i4, (List) C3254j1.m30923k(t, j), false);
                    i2 += m30628Q;
                    break;
                case 35:
                    m30330G = C3359n0.m30634K((List) unsafe.getObject(t, j));
                    if (m30330G > 0) {
                        m30325e = AbstractC3487ro.m30325e(i4);
                        m30324f8 = AbstractC3487ro.m30324f(m30330G);
                        m30324f4 = m30325e + m30324f8;
                        i = m30324f4 + m30330G;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    m30330G = C3359n0.m30636I((List) unsafe.getObject(t, j));
                    if (m30330G > 0) {
                        m30325e = AbstractC3487ro.m30325e(i4);
                        m30324f8 = AbstractC3487ro.m30324f(m30330G);
                        m30324f4 = m30325e + m30324f8;
                        i = m30324f4 + m30330G;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    m30330G = C3359n0.m30629P((List) unsafe.getObject(t, j));
                    if (m30330G > 0) {
                        m30325e = AbstractC3487ro.m30325e(i4);
                        m30324f8 = AbstractC3487ro.m30324f(m30330G);
                        m30324f4 = m30325e + m30324f8;
                        i = m30324f4 + m30330G;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    m30330G = C3359n0.m30617a0((List) unsafe.getObject(t, j));
                    if (m30330G > 0) {
                        m30325e = AbstractC3487ro.m30325e(i4);
                        m30324f8 = AbstractC3487ro.m30324f(m30330G);
                        m30324f4 = m30325e + m30324f8;
                        i = m30324f4 + m30330G;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    m30330G = C3359n0.m30631N((List) unsafe.getObject(t, j));
                    if (m30330G > 0) {
                        m30325e = AbstractC3487ro.m30325e(i4);
                        m30324f8 = AbstractC3487ro.m30324f(m30330G);
                        m30324f4 = m30325e + m30324f8;
                        i = m30324f4 + m30330G;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    m30330G = C3359n0.m30634K((List) unsafe.getObject(t, j));
                    if (m30330G > 0) {
                        m30325e = AbstractC3487ro.m30325e(i4);
                        m30324f8 = AbstractC3487ro.m30324f(m30330G);
                        m30324f4 = m30325e + m30324f8;
                        i = m30324f4 + m30330G;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    m30330G = C3359n0.m30636I((List) unsafe.getObject(t, j));
                    if (m30330G > 0) {
                        m30325e = AbstractC3487ro.m30325e(i4);
                        m30324f8 = AbstractC3487ro.m30324f(m30330G);
                        m30324f4 = m30325e + m30324f8;
                        i = m30324f4 + m30330G;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    m30330G = C3359n0.m30641D((List) unsafe.getObject(t, j));
                    if (m30330G > 0) {
                        m30325e = AbstractC3487ro.m30325e(i4);
                        m30324f8 = AbstractC3487ro.m30324f(m30330G);
                        m30324f4 = m30325e + m30324f8;
                        i = m30324f4 + m30330G;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    m30330G = C3359n0.m30620Y((List) unsafe.getObject(t, j));
                    if (m30330G > 0) {
                        m30325e = AbstractC3487ro.m30325e(i4);
                        m30324f8 = AbstractC3487ro.m30324f(m30330G);
                        m30324f4 = m30325e + m30324f8;
                        i = m30324f4 + m30330G;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    m30330G = C3359n0.m30638G((List) unsafe.getObject(t, j));
                    if (m30330G > 0) {
                        m30325e = AbstractC3487ro.m30325e(i4);
                        m30324f8 = AbstractC3487ro.m30324f(m30330G);
                        m30324f4 = m30325e + m30324f8;
                        i = m30324f4 + m30330G;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    m30330G = C3359n0.m30636I((List) unsafe.getObject(t, j));
                    if (m30330G > 0) {
                        m30325e = AbstractC3487ro.m30325e(i4);
                        m30324f8 = AbstractC3487ro.m30324f(m30330G);
                        m30324f4 = m30325e + m30324f8;
                        i = m30324f4 + m30330G;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    m30330G = C3359n0.m30634K((List) unsafe.getObject(t, j));
                    if (m30330G > 0) {
                        m30325e = AbstractC3487ro.m30325e(i4);
                        m30324f8 = AbstractC3487ro.m30324f(m30330G);
                        m30324f4 = m30325e + m30324f8;
                        i = m30324f4 + m30330G;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    m30330G = C3359n0.m30625T((List) unsafe.getObject(t, j));
                    if (m30330G > 0) {
                        m30325e = AbstractC3487ro.m30325e(i4);
                        m30324f8 = AbstractC3487ro.m30324f(m30330G);
                        m30324f4 = m30325e + m30324f8;
                        i = m30324f4 + m30330G;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    m30330G = C3359n0.m30623V((List) unsafe.getObject(t, j));
                    if (m30330G > 0) {
                        m30325e = AbstractC3487ro.m30325e(i4);
                        m30324f8 = AbstractC3487ro.m30324f(m30330G);
                        m30324f4 = m30325e + m30324f8;
                        i = m30324f4 + m30330G;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    m30628Q = C3359n0.m30633L(i4, (List) C3254j1.m30923k(t, j), m31320p(i3));
                    i2 += m30628Q;
                    break;
                case 50:
                    C3514t.m30226a(i4, C3254j1.m30923k(t, j), m31318r(i3));
                    break;
                case 51:
                    if (m31346D(t, i4, i3)) {
                        m30324f = AbstractC3487ro.m30324f(i4 << 3);
                        m30628Q = m30324f + 8;
                        i2 += m30628Q;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m31346D(t, i4, i3)) {
                        m30324f2 = AbstractC3487ro.m30324f(i4 << 3);
                        m30628Q = m30324f2 + 4;
                        i2 += m30628Q;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m31346D(t, i4, i3)) {
                        long m31322n = m31322n(t, j);
                        m30324f3 = AbstractC3487ro.m30324f(i4 << 3);
                        m30323g = AbstractC3487ro.m30323g(m31322n);
                        i2 += m30324f3 + m30323g;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m31346D(t, i4, i3)) {
                        long m31322n2 = m31322n(t, j);
                        m30324f3 = AbstractC3487ro.m30324f(i4 << 3);
                        m30323g = AbstractC3487ro.m30323g(m31322n2);
                        i2 += m30324f3 + m30323g;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m31346D(t, i4, i3)) {
                        int m31333Q = m31333Q(t, j);
                        m30324f4 = AbstractC3487ro.m30324f(i4 << 3);
                        m30330G = AbstractC3487ro.m30330G(m31333Q);
                        i = m30324f4 + m30330G;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m31346D(t, i4, i3)) {
                        m30324f = AbstractC3487ro.m30324f(i4 << 3);
                        m30628Q = m30324f + 8;
                        i2 += m30628Q;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m31346D(t, i4, i3)) {
                        m30324f2 = AbstractC3487ro.m30324f(i4 << 3);
                        m30628Q = m30324f2 + 4;
                        i2 += m30628Q;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m31346D(t, i4, i3)) {
                        m30324f5 = AbstractC3487ro.m30324f(i4 << 3);
                        m30628Q = m30324f5 + 1;
                        i2 += m30628Q;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!m31346D(t, i4, i3)) {
                        break;
                    } else {
                        Object m30923k2 = C3254j1.m30923k(t, j);
                        if (m30923k2 instanceof AbstractC3223ho) {
                            m30324f6 = AbstractC3487ro.m30324f(i4 << 3);
                            mo31014f = ((AbstractC3223ho) m30923k2).mo31014f();
                            m30324f7 = AbstractC3487ro.m30324f(mo31014f);
                            i = m30324f6 + m30324f7 + mo31014f;
                            i2 += i;
                            break;
                        } else {
                            m30324f4 = AbstractC3487ro.m30324f(i4 << 3);
                            m30330G = AbstractC3487ro.m30326d((String) m30923k2);
                            i = m30324f4 + m30330G;
                            i2 += i;
                        }
                    }
                case 60:
                    if (m31346D(t, i4, i3)) {
                        m30628Q = C3359n0.m30628Q(i4, C3254j1.m30923k(t, j), m31320p(i3));
                        i2 += m30628Q;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m31346D(t, i4, i3)) {
                        m30324f6 = AbstractC3487ro.m30324f(i4 << 3);
                        mo31014f = ((AbstractC3223ho) C3254j1.m30923k(t, j)).mo31014f();
                        m30324f7 = AbstractC3487ro.m30324f(mo31014f);
                        i = m30324f6 + m30324f7 + mo31014f;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m31346D(t, i4, i3)) {
                        int m31333Q2 = m31333Q(t, j);
                        m30324f4 = AbstractC3487ro.m30324f(i4 << 3);
                        m30330G = AbstractC3487ro.m30324f(m31333Q2);
                        i = m30324f4 + m30330G;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m31346D(t, i4, i3)) {
                        int m31333Q3 = m31333Q(t, j);
                        m30324f4 = AbstractC3487ro.m30324f(i4 << 3);
                        m30330G = AbstractC3487ro.m30330G(m31333Q3);
                        i = m30324f4 + m30330G;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m31346D(t, i4, i3)) {
                        m30324f2 = AbstractC3487ro.m30324f(i4 << 3);
                        m30628Q = m30324f2 + 4;
                        i2 += m30628Q;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m31346D(t, i4, i3)) {
                        m30324f = AbstractC3487ro.m30324f(i4 << 3);
                        m30628Q = m30324f + 8;
                        i2 += m30628Q;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m31346D(t, i4, i3)) {
                        int m31333Q4 = m31333Q(t, j);
                        m30324f4 = AbstractC3487ro.m30324f(i4 << 3);
                        m30330G = AbstractC3487ro.m30324f((m31333Q4 >> 31) ^ (m31333Q4 + m31333Q4));
                        i = m30324f4 + m30330G;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m31346D(t, i4, i3)) {
                        long m31322n3 = m31322n(t, j);
                        m30324f4 = AbstractC3487ro.m30324f(i4 << 3);
                        m30330G = AbstractC3487ro.m30323g((m31322n3 >> 63) ^ (m31322n3 + m31322n3));
                        i = m30324f4 + m30330G;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m31346D(t, i4, i3)) {
                        m30628Q = AbstractC3487ro.m30331F(i4, (InterfaceC3644y) C3254j1.m30923k(t, j), m31320p(i3));
                        i2 += m30628Q;
                        break;
                    } else {
                        break;
                    }
            }
        }
        AbstractC3645y0<?, ?> abstractC3645y0 = this.f8289m;
        return i2 + abstractC3645y0.mo29995a(abstractC3645y0.mo29992d(t));
    }

    /* renamed from: Q */
    private static <T> int m31333Q(T t, long j) {
        return ((Integer) C3254j1.m30923k(t, j)).intValue();
    }

    /* renamed from: R */
    private final <K, V> int m31332R(T t, byte[] bArr, int i, int i2, int i3, long j, C3642xn c3642xn) throws IOException {
        Unsafe unsafe = f8276q;
        Object m31318r = m31318r(i3);
        Object object = unsafe.getObject(t, j);
        if (C3514t.m30225b(object)) {
            C3488s<K, V> m30302b = C3488s.m30303a().m30302b();
            C3514t.m30224c(m30302b, object);
            unsafe.putObject(t, j, m30302b);
        }
        C3462r c3462r = (C3462r) m31318r;
        throw null;
    }

    /* renamed from: S */
    private final int m31331S(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C3642xn c3642xn) throws IOException {
        Unsafe unsafe = f8276q;
        long j2 = this.f8277a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Double.valueOf(Double.longBitsToDouble(C3668yn.m29922n(bArr, i))));
                    unsafe.putInt(t, j2, i4);
                    return i + 8;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Float.valueOf(Float.intBitsToFloat(C3668yn.m29934b(bArr, i))));
                    unsafe.putInt(t, j2, i4);
                    return i + 4;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int m29923m = C3668yn.m29923m(bArr, i, c3642xn);
                    unsafe.putObject(t, j, Long.valueOf(c3642xn.f9111b));
                    unsafe.putInt(t, j2, i4);
                    return m29923m;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int m29926j = C3668yn.m29926j(bArr, i, c3642xn);
                    unsafe.putObject(t, j, Integer.valueOf(c3642xn.f9110a));
                    unsafe.putInt(t, j2, i4);
                    return m29926j;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Long.valueOf(C3668yn.m29922n(bArr, i)));
                    unsafe.putInt(t, j2, i4);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Integer.valueOf(C3668yn.m29934b(bArr, i)));
                    unsafe.putInt(t, j2, i4);
                    return i + 4;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int m29923m2 = C3668yn.m29923m(bArr, i, c3642xn);
                    unsafe.putObject(t, j, Boolean.valueOf(c3642xn.f9111b != 0));
                    unsafe.putInt(t, j2, i4);
                    return m29923m2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int m29926j2 = C3668yn.m29926j(bArr, i, c3642xn);
                    int i9 = c3642xn.f9110a;
                    if (i9 == 0) {
                        unsafe.putObject(t, j, "");
                    } else if ((i6 & 536870912) != 0 && !C3386o1.m30522f(bArr, m29926j2, m29926j2 + i9)) {
                        throw zzaae.m29870d();
                    } else {
                        unsafe.putObject(t, j, new String(bArr, m29926j2, i9, C3117e.f8412a));
                        m29926j2 += i9;
                    }
                    unsafe.putInt(t, j2, i4);
                    return m29926j2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    int m29932d = C3668yn.m29932d(m31320p(i8), bArr, i, i2, c3642xn);
                    Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object == null) {
                        unsafe.putObject(t, j, c3642xn.f9112c);
                    } else {
                        unsafe.putObject(t, j, C3117e.m31219g(object, c3642xn.f9112c));
                    }
                    unsafe.putInt(t, j2, i4);
                    return m29932d;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int m29935a = C3668yn.m29935a(bArr, i, c3642xn);
                    unsafe.putObject(t, j, c3642xn.f9112c);
                    unsafe.putInt(t, j2, i4);
                    return m29935a;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int m29926j3 = C3668yn.m29926j(bArr, i, c3642xn);
                    int i10 = c3642xn.f9110a;
                    InterfaceC3063c m31321o = m31321o(i8);
                    if (m31321o != null && !m31321o.zza()) {
                        m31340J(t).m31457h(i3, Long.valueOf(i10));
                    } else {
                        unsafe.putObject(t, j, Integer.valueOf(i10));
                        unsafe.putInt(t, j2, i4);
                    }
                    return m29926j3;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int m29926j4 = C3668yn.m29926j(bArr, i, c3642xn);
                    unsafe.putObject(t, j, Integer.valueOf(AbstractC3304ko.m30819k(c3642xn.f9110a)));
                    unsafe.putInt(t, j2, i4);
                    return m29926j4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int m29923m3 = C3668yn.m29923m(bArr, i, c3642xn);
                    unsafe.putObject(t, j, Long.valueOf(AbstractC3304ko.m30818l(c3642xn.f9111b)));
                    unsafe.putInt(t, j2, i4);
                    return m29923m3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    int m29933c = C3668yn.m29933c(m31320p(i8), bArr, i, i2, (i3 & (-8)) | 4, c3642xn);
                    Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j, c3642xn.f9112c);
                    } else {
                        unsafe.putObject(t, j, C3117e.m31219g(object2, c3642xn.f9112c));
                    }
                    unsafe.putInt(t, j2, i4);
                    return m29933c;
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
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int m31330T(T r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.p104firebaseauthapi.C3642xn r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p104firebaseauthapi.C3064c0.m31330T(java.lang.Object, byte[], int, int, com.google.android.gms.internal.firebase-auth-api.xn):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0154  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x021c -> B:120:0x021d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0151 -> B:67:0x0152). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x01ce -> B:100:0x01cf). Please submit an issue!!! */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int m31329U(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.p104firebaseauthapi.C3642xn r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p104firebaseauthapi.C3064c0.m31329U(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.firebase-auth-api.xn):int");
    }

    /* renamed from: V */
    private final int m31328V(int i) {
        if (i < this.f8279c || i > this.f8280d) {
            return -1;
        }
        return m31325k(i, 0);
    }

    /* renamed from: W */
    private final int m31327W(int i, int i2) {
        if (i < this.f8279c || i > this.f8280d) {
            return -1;
        }
        return m31325k(i, i2);
    }

    /* renamed from: X */
    private final int m31326X(int i) {
        return this.f8277a[i + 2];
    }

    /* renamed from: k */
    private final int m31325k(int i, int i2) {
        int length = (this.f8277a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f8277a[i4];
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

    /* renamed from: l */
    private static int m31324l(int i) {
        return (i >>> 20) & 255;
    }

    /* renamed from: m */
    private final int m31323m(int i) {
        return this.f8277a[i + 1];
    }

    /* renamed from: n */
    private static <T> long m31322n(T t, long j) {
        return ((Long) C3254j1.m30923k(t, j)).longValue();
    }

    /* renamed from: o */
    private final InterfaceC3063c m31321o(int i) {
        int i2 = i / 3;
        return (InterfaceC3063c) this.f8278b[i2 + i2 + 1];
    }

    /* renamed from: p */
    private final InterfaceC3307l0 m31320p(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        InterfaceC3307l0 interfaceC3307l0 = (InterfaceC3307l0) this.f8278b[i3];
        if (interfaceC3307l0 != null) {
            return interfaceC3307l0;
        }
        InterfaceC3307l0<T> m31086b = C3199h0.m31087a().m31086b((Class) this.f8278b[i3 + 1]);
        this.f8278b[i3] = m31086b;
        return m31086b;
    }

    /* renamed from: q */
    private final <UT, UB> UB m31319q(Object obj, int i, UB ub, AbstractC3645y0<UT, UB> abstractC3645y0) {
        int i2 = this.f8277a[i];
        Object m30923k = C3254j1.m30923k(obj, m31323m(i) & 1048575);
        if (m30923k == null || m31321o(i) == null) {
            return ub;
        }
        C3488s c3488s = (C3488s) m30923k;
        C3462r c3462r = (C3462r) m31318r(i);
        throw null;
    }

    /* renamed from: r */
    private final Object m31318r(int i) {
        int i2 = i / 3;
        return this.f8278b[i2 + i2];
    }

    /* renamed from: s */
    private static Field m31317s(Class<?> cls, String str) {
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

    /* renamed from: t */
    private final void m31316t(T t, T t2, int i) {
        long m31323m = m31323m(i) & 1048575;
        if (m31349A(t2, i)) {
            Object m30923k = C3254j1.m30923k(t, m31323m);
            Object m30923k2 = C3254j1.m30923k(t2, m31323m);
            if (m30923k != null && m30923k2 != null) {
                C3254j1.m30910x(t, m31323m, C3117e.m31219g(m30923k, m30923k2));
                m31313w(t, i);
            } else if (m30923k2 != null) {
                C3254j1.m30910x(t, m31323m, m30923k2);
                m31313w(t, i);
            }
        }
    }

    /* renamed from: u */
    private final void m31315u(T t, T t2, int i) {
        int m31323m = m31323m(i);
        int i2 = this.f8277a[i];
        long j = m31323m & 1048575;
        if (m31346D(t2, i2, i)) {
            Object m30923k = m31346D(t, i2, i) ? C3254j1.m30923k(t, j) : null;
            Object m30923k2 = C3254j1.m30923k(t2, j);
            if (m30923k != null && m30923k2 != null) {
                C3254j1.m30910x(t, j, C3117e.m31219g(m30923k, m30923k2));
                m31312x(t, i2, i);
            } else if (m30923k2 != null) {
                C3254j1.m30910x(t, j, m30923k2);
                m31312x(t, i2, i);
            }
        }
    }

    /* renamed from: v */
    private final void m31314v(Object obj, int i, InterfaceC3280k0 interfaceC3280k0) throws IOException {
        if (m31310z(i)) {
            C3254j1.m30910x(obj, i & 1048575, interfaceC3280k0.mo30730r());
        } else if (this.f8283g) {
            C3254j1.m30910x(obj, i & 1048575, interfaceC3280k0.mo30726v());
        } else {
            C3254j1.m30910x(obj, i & 1048575, interfaceC3280k0.mo30741g());
        }
    }

    /* renamed from: w */
    private final void m31313w(T t, int i) {
        int m31326X = m31326X(i);
        long j = 1048575 & m31326X;
        if (j == 1048575) {
            return;
        }
        C3254j1.m30912v(t, j, (1 << (m31326X >>> 20)) | C3254j1.m30926h(t, j));
    }

    /* renamed from: x */
    private final void m31312x(T t, int i, int i2) {
        C3254j1.m30912v(t, m31326X(i2) & 1048575, i);
    }

    /* renamed from: y */
    private final boolean m31311y(T t, T t2, int i) {
        return m31349A(t, i) == m31349A(t2, i);
    }

    /* renamed from: z */
    private static boolean m31310z(int i) {
        return (i & 536870912) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0432, code lost:
        if (r6 == 1048575) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0434, code lost:
        r26.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x043a, code lost:
        r2 = r9.f8286j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x043e, code lost:
        if (r2 >= r9.f8287k) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0440, code lost:
        r9.m31319q(r12, r9.f8285i[r2], r3, r9.f8289m);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x044c, code lost:
        if (r7 != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0450, code lost:
        if (r0 != r32) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0457, code lost:
        throw com.google.android.gms.internal.p104firebaseauthapi.zzaae.m29867g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x045a, code lost:
        if (r0 > r32) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x045c, code lost:
        if (r1 != r7) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x045e, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0464, code lost:
        throw com.google.android.gms.internal.p104firebaseauthapi.zzaae.m29867g();
     */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m31341I(T r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.p104firebaseauthapi.C3642xn r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p104firebaseauthapi.C3064c0.m31341I(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.firebase-auth-api.xn):int");
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3307l0
    /* renamed from: a */
    public final T mo30816a() {
        return (T) ((AbstractC3251ip) this.f8281e).mo29964j(4, null, null);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3307l0
    /* renamed from: b */
    public final int mo30815b(T t) {
        int i;
        int m31223c;
        int length = this.f8277a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int m31323m = m31323m(i3);
            int i4 = this.f8277a[i3];
            long j = 1048575 & m31323m;
            int i5 = 37;
            switch (m31324l(m31323m)) {
                case 0:
                    i = i2 * 53;
                    m31223c = C3117e.m31223c(Double.doubleToLongBits(C3254j1.m30928f(t, j)));
                    i2 = i + m31223c;
                    break;
                case 1:
                    i = i2 * 53;
                    m31223c = Float.floatToIntBits(C3254j1.m30927g(t, j));
                    i2 = i + m31223c;
                    break;
                case 2:
                    i = i2 * 53;
                    m31223c = C3117e.m31223c(C3254j1.m30925i(t, j));
                    i2 = i + m31223c;
                    break;
                case 3:
                    i = i2 * 53;
                    m31223c = C3117e.m31223c(C3254j1.m30925i(t, j));
                    i2 = i + m31223c;
                    break;
                case 4:
                    i = i2 * 53;
                    m31223c = C3254j1.m30926h(t, j);
                    i2 = i + m31223c;
                    break;
                case 5:
                    i = i2 * 53;
                    m31223c = C3117e.m31223c(C3254j1.m30925i(t, j));
                    i2 = i + m31223c;
                    break;
                case 6:
                    i = i2 * 53;
                    m31223c = C3254j1.m30926h(t, j);
                    i2 = i + m31223c;
                    break;
                case 7:
                    i = i2 * 53;
                    m31223c = C3117e.m31225a(C3254j1.m30937B(t, j));
                    i2 = i + m31223c;
                    break;
                case 8:
                    i = i2 * 53;
                    m31223c = ((String) C3254j1.m30923k(t, j)).hashCode();
                    i2 = i + m31223c;
                    break;
                case 9:
                    Object m30923k = C3254j1.m30923k(t, j);
                    if (m30923k != null) {
                        i5 = m30923k.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    m31223c = C3254j1.m30923k(t, j).hashCode();
                    i2 = i + m31223c;
                    break;
                case 11:
                    i = i2 * 53;
                    m31223c = C3254j1.m30926h(t, j);
                    i2 = i + m31223c;
                    break;
                case 12:
                    i = i2 * 53;
                    m31223c = C3254j1.m30926h(t, j);
                    i2 = i + m31223c;
                    break;
                case 13:
                    i = i2 * 53;
                    m31223c = C3254j1.m30926h(t, j);
                    i2 = i + m31223c;
                    break;
                case 14:
                    i = i2 * 53;
                    m31223c = C3117e.m31223c(C3254j1.m30925i(t, j));
                    i2 = i + m31223c;
                    break;
                case 15:
                    i = i2 * 53;
                    m31223c = C3254j1.m30926h(t, j);
                    i2 = i + m31223c;
                    break;
                case 16:
                    i = i2 * 53;
                    m31223c = C3117e.m31223c(C3254j1.m30925i(t, j));
                    i2 = i + m31223c;
                    break;
                case 17:
                    Object m30923k2 = C3254j1.m30923k(t, j);
                    if (m30923k2 != null) {
                        i5 = m30923k2.hashCode();
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
                    m31223c = C3254j1.m30923k(t, j).hashCode();
                    i2 = i + m31223c;
                    break;
                case 50:
                    i = i2 * 53;
                    m31223c = C3254j1.m30923k(t, j).hashCode();
                    i2 = i + m31223c;
                    break;
                case 51:
                    if (m31346D(t, i4, i3)) {
                        i = i2 * 53;
                        m31223c = C3117e.m31223c(Double.doubleToLongBits(m31337M(t, j)));
                        i2 = i + m31223c;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m31346D(t, i4, i3)) {
                        i = i2 * 53;
                        m31223c = Float.floatToIntBits(m31336N(t, j));
                        i2 = i + m31223c;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m31346D(t, i4, i3)) {
                        i = i2 * 53;
                        m31223c = C3117e.m31223c(m31322n(t, j));
                        i2 = i + m31223c;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m31346D(t, i4, i3)) {
                        i = i2 * 53;
                        m31223c = C3117e.m31223c(m31322n(t, j));
                        i2 = i + m31223c;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m31346D(t, i4, i3)) {
                        i = i2 * 53;
                        m31223c = m31333Q(t, j);
                        i2 = i + m31223c;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m31346D(t, i4, i3)) {
                        i = i2 * 53;
                        m31223c = C3117e.m31223c(m31322n(t, j));
                        i2 = i + m31223c;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m31346D(t, i4, i3)) {
                        i = i2 * 53;
                        m31223c = m31333Q(t, j);
                        i2 = i + m31223c;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m31346D(t, i4, i3)) {
                        i = i2 * 53;
                        m31223c = C3117e.m31225a(m31345E(t, j));
                        i2 = i + m31223c;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m31346D(t, i4, i3)) {
                        i = i2 * 53;
                        m31223c = ((String) C3254j1.m30923k(t, j)).hashCode();
                        i2 = i + m31223c;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m31346D(t, i4, i3)) {
                        i = i2 * 53;
                        m31223c = C3254j1.m30923k(t, j).hashCode();
                        i2 = i + m31223c;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m31346D(t, i4, i3)) {
                        i = i2 * 53;
                        m31223c = C3254j1.m30923k(t, j).hashCode();
                        i2 = i + m31223c;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m31346D(t, i4, i3)) {
                        i = i2 * 53;
                        m31223c = m31333Q(t, j);
                        i2 = i + m31223c;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m31346D(t, i4, i3)) {
                        i = i2 * 53;
                        m31223c = m31333Q(t, j);
                        i2 = i + m31223c;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m31346D(t, i4, i3)) {
                        i = i2 * 53;
                        m31223c = m31333Q(t, j);
                        i2 = i + m31223c;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m31346D(t, i4, i3)) {
                        i = i2 * 53;
                        m31223c = C3117e.m31223c(m31322n(t, j));
                        i2 = i + m31223c;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m31346D(t, i4, i3)) {
                        i = i2 * 53;
                        m31223c = m31333Q(t, j);
                        i2 = i + m31223c;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m31346D(t, i4, i3)) {
                        i = i2 * 53;
                        m31223c = C3117e.m31223c(m31322n(t, j));
                        i2 = i + m31223c;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m31346D(t, i4, i3)) {
                        i = i2 * 53;
                        m31223c = C3254j1.m30923k(t, j).hashCode();
                        i2 = i + m31223c;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.f8289m.mo29992d(t).hashCode();
        if (this.f8282f) {
            this.f8290n.mo29921a(t);
            throw null;
        }
        return hashCode;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3307l0
    /* renamed from: c */
    public final void mo30814c(T t) {
        int i;
        int i2 = this.f8286j;
        while (true) {
            i = this.f8287k;
            if (i2 >= i) {
                break;
            }
            long m31323m = m31323m(this.f8285i[i2]) & 1048575;
            Object m30923k = C3254j1.m30923k(t, m31323m);
            if (m30923k != null) {
                ((C3488s) m30923k).m30301c();
                C3254j1.m30910x(t, m31323m, m30923k);
            }
            i2++;
        }
        int length = this.f8285i.length;
        while (i < length) {
            this.f8288l.mo30720b(t, this.f8285i[i]);
            i++;
        }
        this.f8289m.mo29983m(t);
        if (this.f8282f) {
            this.f8290n.mo29918d(t);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3307l0
    /* renamed from: d */
    public final int mo30813d(T t) {
        return this.f8284h ? m31334P(t) : m31335O(t);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3307l0
    /* renamed from: e */
    public final void mo30812e(T t, T t2) {
        if (t2 == null) {
            throw null;
        }
        for (int i = 0; i < this.f8277a.length; i += 3) {
            int m31323m = m31323m(i);
            long j = 1048575 & m31323m;
            int i2 = this.f8277a[i];
            switch (m31324l(m31323m)) {
                case 0:
                    if (m31349A(t2, i)) {
                        C3254j1.m30914t(t, j, C3254j1.m30928f(t2, j));
                        m31313w(t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m31349A(t2, i)) {
                        C3254j1.m30913u(t, j, C3254j1.m30927g(t2, j));
                        m31313w(t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m31349A(t2, i)) {
                        C3254j1.m30911w(t, j, C3254j1.m30925i(t2, j));
                        m31313w(t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m31349A(t2, i)) {
                        C3254j1.m30911w(t, j, C3254j1.m30925i(t2, j));
                        m31313w(t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m31349A(t2, i)) {
                        C3254j1.m30912v(t, j, C3254j1.m30926h(t2, j));
                        m31313w(t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m31349A(t2, i)) {
                        C3254j1.m30911w(t, j, C3254j1.m30925i(t2, j));
                        m31313w(t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m31349A(t2, i)) {
                        C3254j1.m30912v(t, j, C3254j1.m30926h(t2, j));
                        m31313w(t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m31349A(t2, i)) {
                        C3254j1.m30916r(t, j, C3254j1.m30937B(t2, j));
                        m31313w(t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m31349A(t2, i)) {
                        C3254j1.m30910x(t, j, C3254j1.m30923k(t2, j));
                        m31313w(t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    m31316t(t, t2, i);
                    break;
                case 10:
                    if (m31349A(t2, i)) {
                        C3254j1.m30910x(t, j, C3254j1.m30923k(t2, j));
                        m31313w(t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m31349A(t2, i)) {
                        C3254j1.m30912v(t, j, C3254j1.m30926h(t2, j));
                        m31313w(t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m31349A(t2, i)) {
                        C3254j1.m30912v(t, j, C3254j1.m30926h(t2, j));
                        m31313w(t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m31349A(t2, i)) {
                        C3254j1.m30912v(t, j, C3254j1.m30926h(t2, j));
                        m31313w(t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m31349A(t2, i)) {
                        C3254j1.m30911w(t, j, C3254j1.m30925i(t2, j));
                        m31313w(t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m31349A(t2, i)) {
                        C3254j1.m30912v(t, j, C3254j1.m30926h(t2, j));
                        m31313w(t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m31349A(t2, i)) {
                        C3254j1.m30911w(t, j, C3254j1.m30925i(t2, j));
                        m31313w(t, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    m31316t(t, t2, i);
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
                    this.f8288l.mo30719c(t, t2, j);
                    break;
                case 50:
                    C3359n0.m30608i(this.f8291o, t, t2, j);
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
                    if (m31346D(t2, i2, i)) {
                        C3254j1.m30910x(t, j, C3254j1.m30923k(t2, j));
                        m31312x(t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    m31315u(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m31346D(t2, i2, i)) {
                        C3254j1.m30910x(t, j, C3254j1.m30923k(t2, j));
                        m31312x(t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    m31315u(t, t2, i);
                    break;
            }
        }
        C3359n0.m30611f(this.f8289m, t, t2);
        if (this.f8282f) {
            C3359n0.m30612e(this.f8290n, t, t2);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3307l0
    /* renamed from: f */
    public final void mo30811f(T t, C3513so c3513so) throws IOException {
        if (!this.f8284h) {
            m31344F(t, c3513so);
        } else if (!this.f8282f) {
            int length = this.f8277a.length;
            for (int i = 0; i < length; i += 3) {
                int m31323m = m31323m(i);
                int i2 = this.f8277a[i];
                switch (m31324l(m31323m)) {
                    case 0:
                        if (m31349A(t, i)) {
                            c3513so.m30236q(i2, C3254j1.m30928f(t, m31323m & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (m31349A(t, i)) {
                            c3513so.m30227z(i2, C3254j1.m30927g(t, m31323m & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (m31349A(t, i)) {
                            c3513so.m30259E(i2, C3254j1.m30925i(t, m31323m & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (m31349A(t, i)) {
                            c3513so.m30243j(i2, C3254j1.m30925i(t, m31323m & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (m31349A(t, i)) {
                            c3513so.m30261C(i2, C3254j1.m30926h(t, m31323m & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (m31349A(t, i)) {
                            c3513so.m30229x(i2, C3254j1.m30925i(t, m31323m & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (m31349A(t, i)) {
                            c3513so.m30231v(i2, C3254j1.m30926h(t, m31323m & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (m31349A(t, i)) {
                            c3513so.m30240m(i2, C3254j1.m30937B(t, m31323m & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (m31349A(t, i)) {
                            m31342H(i2, C3254j1.m30923k(t, m31323m & 1048575), c3513so);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (m31349A(t, i)) {
                            c3513so.m30257G(i2, C3254j1.m30923k(t, m31323m & 1048575), m31320p(i));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (m31349A(t, i)) {
                            c3513so.m30238o(i2, (AbstractC3223ho) C3254j1.m30923k(t, m31323m & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (m31349A(t, i)) {
                            c3513so.m30245h(i2, C3254j1.m30926h(t, m31323m & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (m31349A(t, i)) {
                            c3513so.m30233t(i2, C3254j1.m30926h(t, m31323m & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (m31349A(t, i)) {
                            c3513so.m30256H(i2, C3254j1.m30926h(t, m31323m & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (m31349A(t, i)) {
                            c3513so.m30254J(i2, C3254j1.m30925i(t, m31323m & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (m31349A(t, i)) {
                            c3513so.m30252a(i2, C3254j1.m30926h(t, m31323m & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (m31349A(t, i)) {
                            c3513so.m30250c(i2, C3254j1.m30925i(t, m31323m & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (m31349A(t, i)) {
                            c3513so.m30262B(i2, C3254j1.m30923k(t, m31323m & 1048575), m31320p(i));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        C3359n0.m30605l(this.f8277a[i], (List) C3254j1.m30923k(t, m31323m & 1048575), c3513so, false);
                        break;
                    case 19:
                        C3359n0.m30601p(this.f8277a[i], (List) C3254j1.m30923k(t, m31323m & 1048575), c3513so, false);
                        break;
                    case 20:
                        C3359n0.m30598s(this.f8277a[i], (List) C3254j1.m30923k(t, m31323m & 1048575), c3513so, false);
                        break;
                    case 21:
                        C3359n0.m30643B(this.f8277a[i], (List) C3254j1.m30923k(t, m31323m & 1048575), c3513so, false);
                        break;
                    case 22:
                        C3359n0.m30599r(this.f8277a[i], (List) C3254j1.m30923k(t, m31323m & 1048575), c3513so, false);
                        break;
                    case 23:
                        C3359n0.m30602o(this.f8277a[i], (List) C3254j1.m30923k(t, m31323m & 1048575), c3513so, false);
                        break;
                    case 24:
                        C3359n0.m30603n(this.f8277a[i], (List) C3254j1.m30923k(t, m31323m & 1048575), c3513so, false);
                        break;
                    case 25:
                        C3359n0.m30607j(this.f8277a[i], (List) C3254j1.m30923k(t, m31323m & 1048575), c3513so, false);
                        break;
                    case 26:
                        C3359n0.m30592y(this.f8277a[i], (List) C3254j1.m30923k(t, m31323m & 1048575), c3513so);
                        break;
                    case 27:
                        C3359n0.m30597t(this.f8277a[i], (List) C3254j1.m30923k(t, m31323m & 1048575), c3513so, m31320p(i));
                        break;
                    case 28:
                        C3359n0.m30606k(this.f8277a[i], (List) C3254j1.m30923k(t, m31323m & 1048575), c3513so);
                        break;
                    case 29:
                        C3359n0.m30591z(this.f8277a[i], (List) C3254j1.m30923k(t, m31323m & 1048575), c3513so, false);
                        break;
                    case 30:
                        C3359n0.m30604m(this.f8277a[i], (List) C3254j1.m30923k(t, m31323m & 1048575), c3513so, false);
                        break;
                    case 31:
                        C3359n0.m30596u(this.f8277a[i], (List) C3254j1.m30923k(t, m31323m & 1048575), c3513so, false);
                        break;
                    case 32:
                        C3359n0.m30595v(this.f8277a[i], (List) C3254j1.m30923k(t, m31323m & 1048575), c3513so, false);
                        break;
                    case 33:
                        C3359n0.m30594w(this.f8277a[i], (List) C3254j1.m30923k(t, m31323m & 1048575), c3513so, false);
                        break;
                    case 34:
                        C3359n0.m30593x(this.f8277a[i], (List) C3254j1.m30923k(t, m31323m & 1048575), c3513so, false);
                        break;
                    case 35:
                        C3359n0.m30605l(this.f8277a[i], (List) C3254j1.m30923k(t, m31323m & 1048575), c3513so, true);
                        break;
                    case 36:
                        C3359n0.m30601p(this.f8277a[i], (List) C3254j1.m30923k(t, m31323m & 1048575), c3513so, true);
                        break;
                    case 37:
                        C3359n0.m30598s(this.f8277a[i], (List) C3254j1.m30923k(t, m31323m & 1048575), c3513so, true);
                        break;
                    case 38:
                        C3359n0.m30643B(this.f8277a[i], (List) C3254j1.m30923k(t, m31323m & 1048575), c3513so, true);
                        break;
                    case 39:
                        C3359n0.m30599r(this.f8277a[i], (List) C3254j1.m30923k(t, m31323m & 1048575), c3513so, true);
                        break;
                    case 40:
                        C3359n0.m30602o(this.f8277a[i], (List) C3254j1.m30923k(t, m31323m & 1048575), c3513so, true);
                        break;
                    case 41:
                        C3359n0.m30603n(this.f8277a[i], (List) C3254j1.m30923k(t, m31323m & 1048575), c3513so, true);
                        break;
                    case 42:
                        C3359n0.m30607j(this.f8277a[i], (List) C3254j1.m30923k(t, m31323m & 1048575), c3513so, true);
                        break;
                    case 43:
                        C3359n0.m30591z(this.f8277a[i], (List) C3254j1.m30923k(t, m31323m & 1048575), c3513so, true);
                        break;
                    case 44:
                        C3359n0.m30604m(this.f8277a[i], (List) C3254j1.m30923k(t, m31323m & 1048575), c3513so, true);
                        break;
                    case 45:
                        C3359n0.m30596u(this.f8277a[i], (List) C3254j1.m30923k(t, m31323m & 1048575), c3513so, true);
                        break;
                    case 46:
                        C3359n0.m30595v(this.f8277a[i], (List) C3254j1.m30923k(t, m31323m & 1048575), c3513so, true);
                        break;
                    case 47:
                        C3359n0.m30594w(this.f8277a[i], (List) C3254j1.m30923k(t, m31323m & 1048575), c3513so, true);
                        break;
                    case 48:
                        C3359n0.m30593x(this.f8277a[i], (List) C3254j1.m30923k(t, m31323m & 1048575), c3513so, true);
                        break;
                    case 49:
                        C3359n0.m30600q(this.f8277a[i], (List) C3254j1.m30923k(t, m31323m & 1048575), c3513so, m31320p(i));
                        break;
                    case 50:
                        m31343G(c3513so, i2, C3254j1.m30923k(t, m31323m & 1048575), i);
                        break;
                    case 51:
                        if (m31346D(t, i2, i)) {
                            c3513so.m30236q(i2, m31337M(t, m31323m & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (m31346D(t, i2, i)) {
                            c3513so.m30227z(i2, m31336N(t, m31323m & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (m31346D(t, i2, i)) {
                            c3513so.m30259E(i2, m31322n(t, m31323m & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (m31346D(t, i2, i)) {
                            c3513so.m30243j(i2, m31322n(t, m31323m & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (m31346D(t, i2, i)) {
                            c3513so.m30261C(i2, m31333Q(t, m31323m & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (m31346D(t, i2, i)) {
                            c3513so.m30229x(i2, m31322n(t, m31323m & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (m31346D(t, i2, i)) {
                            c3513so.m30231v(i2, m31333Q(t, m31323m & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (m31346D(t, i2, i)) {
                            c3513so.m30240m(i2, m31345E(t, m31323m & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (m31346D(t, i2, i)) {
                            m31342H(i2, C3254j1.m30923k(t, m31323m & 1048575), c3513so);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (m31346D(t, i2, i)) {
                            c3513so.m30257G(i2, C3254j1.m30923k(t, m31323m & 1048575), m31320p(i));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (m31346D(t, i2, i)) {
                            c3513so.m30238o(i2, (AbstractC3223ho) C3254j1.m30923k(t, m31323m & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (m31346D(t, i2, i)) {
                            c3513so.m30245h(i2, m31333Q(t, m31323m & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (m31346D(t, i2, i)) {
                            c3513so.m30233t(i2, m31333Q(t, m31323m & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (m31346D(t, i2, i)) {
                            c3513so.m30256H(i2, m31333Q(t, m31323m & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (m31346D(t, i2, i)) {
                            c3513so.m30254J(i2, m31322n(t, m31323m & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (m31346D(t, i2, i)) {
                            c3513so.m30252a(i2, m31333Q(t, m31323m & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (m31346D(t, i2, i)) {
                            c3513so.m30250c(i2, m31322n(t, m31323m & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (m31346D(t, i2, i)) {
                            c3513so.m30262B(i2, C3254j1.m30923k(t, m31323m & 1048575), m31320p(i));
                            break;
                        } else {
                            break;
                        }
                }
            }
            AbstractC3645y0<?, ?> abstractC3645y0 = this.f8289m;
            abstractC3645y0.mo29978r(abstractC3645y0.mo29992d(t), c3513so);
        } else {
            this.f8290n.mo29921a(t);
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3307l0
    /* renamed from: g */
    public final boolean mo30810g(T t) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f8286j) {
            int i6 = this.f8285i[i5];
            int i7 = this.f8277a[i6];
            int m31323m = m31323m(i6);
            int i8 = this.f8277a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f8276q.getInt(t, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & m31323m) != 0 && !m31348B(t, i6, i, i2, i10)) {
                return false;
            }
            int m31324l = m31324l(m31323m);
            if (m31324l != 9 && m31324l != 17) {
                if (m31324l != 27) {
                    if (m31324l == 60 || m31324l == 68) {
                        if (m31346D(t, i7, i6) && !m31347C(t, m31323m, m31320p(i6))) {
                            return false;
                        }
                    } else if (m31324l != 49) {
                        if (m31324l == 50 && !((C3488s) C3254j1.m30923k(t, m31323m & 1048575)).isEmpty()) {
                            C3462r c3462r = (C3462r) m31318r(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) C3254j1.m30923k(t, m31323m & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    InterfaceC3307l0 m31320p = m31320p(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!m31320p.mo30810g(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (m31348B(t, i6, i, i2, i10) && !m31347C(t, m31323m, m31320p(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (this.f8282f) {
            this.f8290n.mo29921a(t);
            throw null;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3307l0
    /* renamed from: h */
    public final void mo30809h(T t, InterfaceC3280k0 interfaceC3280k0, C3617wo c3617wo) throws IOException {
        if (c3617wo == null) {
            throw null;
        }
        AbstractC3645y0 abstractC3645y0 = this.f8289m;
        AbstractC3643xo<?> abstractC3643xo = this.f8290n;
        Object obj = null;
        while (true) {
            try {
                int mo30745c = interfaceC3280k0.mo30745c();
                int m31328V = m31328V(mo30745c);
                if (m31328V >= 0) {
                    int m31323m = m31323m(m31328V);
                    try {
                        switch (m31324l(m31323m)) {
                            case 0:
                                C3254j1.m30914t(t, m31323m & 1048575, interfaceC3280k0.zza());
                                m31313w(t, m31328V);
                                break;
                            case 1:
                                C3254j1.m30913u(t, m31323m & 1048575, interfaceC3280k0.zzb());
                                m31313w(t, m31328V);
                                break;
                            case 2:
                                C3254j1.m30911w(t, m31323m & 1048575, interfaceC3280k0.mo30736l());
                                m31313w(t, m31328V);
                                break;
                            case 3:
                                C3254j1.m30911w(t, m31323m & 1048575, interfaceC3280k0.mo30737k());
                                m31313w(t, m31328V);
                                break;
                            case 4:
                                C3254j1.m30912v(t, m31323m & 1048575, interfaceC3280k0.mo30742f());
                                m31313w(t, m31328V);
                                break;
                            case 5:
                                C3254j1.m30911w(t, m31323m & 1048575, interfaceC3280k0.mo30733o());
                                m31313w(t, m31328V);
                                break;
                            case 6:
                                C3254j1.m30912v(t, m31323m & 1048575, interfaceC3280k0.mo30738j());
                                m31313w(t, m31328V);
                                break;
                            case 7:
                                C3254j1.m30916r(t, m31323m & 1048575, interfaceC3280k0.mo30725w());
                                m31313w(t, m31328V);
                                break;
                            case 8:
                                m31314v(t, m31323m, interfaceC3280k0);
                                m31313w(t, m31328V);
                                break;
                            case 9:
                                if (m31349A(t, m31328V)) {
                                    long j = m31323m & 1048575;
                                    C3254j1.m30910x(t, j, C3117e.m31219g(C3254j1.m30923k(t, j), interfaceC3280k0.mo30722z(m31320p(m31328V), c3617wo)));
                                    break;
                                } else {
                                    C3254j1.m30910x(t, m31323m & 1048575, interfaceC3280k0.mo30722z(m31320p(m31328V), c3617wo));
                                    m31313w(t, m31328V);
                                    break;
                                }
                            case 10:
                                C3254j1.m30910x(t, m31323m & 1048575, interfaceC3280k0.mo30741g());
                                m31313w(t, m31328V);
                                break;
                            case 11:
                                C3254j1.m30912v(t, m31323m & 1048575, interfaceC3280k0.mo30734n());
                                m31313w(t, m31328V);
                                break;
                            case 12:
                                int mo30747a = interfaceC3280k0.mo30747a();
                                InterfaceC3063c m31321o = m31321o(m31328V);
                                if (m31321o != null && !m31321o.zza()) {
                                    obj = C3359n0.m30613d(mo30745c, mo30747a, obj, abstractC3645y0);
                                    break;
                                }
                                C3254j1.m30912v(t, m31323m & 1048575, mo30747a);
                                m31313w(t, m31328V);
                                break;
                            case 13:
                                C3254j1.m30912v(t, m31323m & 1048575, interfaceC3280k0.mo30746b());
                                m31313w(t, m31328V);
                                break;
                            case 14:
                                C3254j1.m30911w(t, m31323m & 1048575, interfaceC3280k0.mo30735m());
                                m31313w(t, m31328V);
                                break;
                            case 15:
                                C3254j1.m30912v(t, m31323m & 1048575, interfaceC3280k0.mo30740h());
                                m31313w(t, m31328V);
                                break;
                            case 16:
                                C3254j1.m30911w(t, m31323m & 1048575, interfaceC3280k0.mo30739i());
                                m31313w(t, m31328V);
                                break;
                            case 17:
                                if (m31349A(t, m31328V)) {
                                    long j2 = m31323m & 1048575;
                                    C3254j1.m30910x(t, j2, C3117e.m31219g(C3254j1.m30923k(t, j2), interfaceC3280k0.mo30761E(m31320p(m31328V), c3617wo)));
                                    break;
                                } else {
                                    C3254j1.m30910x(t, m31323m & 1048575, interfaceC3280k0.mo30761E(m31320p(m31328V), c3617wo));
                                    m31313w(t, m31328V);
                                    break;
                                }
                            case 18:
                                interfaceC3280k0.mo30764B(this.f8288l.mo30721a(t, m31323m & 1048575));
                                break;
                            case 19:
                                interfaceC3280k0.mo30750P(this.f8288l.mo30721a(t, m31323m & 1048575));
                                break;
                            case 20:
                                interfaceC3280k0.mo30723y(this.f8288l.mo30721a(t, m31323m & 1048575));
                                break;
                            case 21:
                                interfaceC3280k0.mo30765A(this.f8288l.mo30721a(t, m31323m & 1048575));
                                break;
                            case 22:
                                interfaceC3280k0.mo30762D(this.f8288l.mo30721a(t, m31323m & 1048575));
                                break;
                            case 23:
                                interfaceC3280k0.mo30755K(this.f8288l.mo30721a(t, m31323m & 1048575));
                                break;
                            case 24:
                                interfaceC3280k0.mo30757I(this.f8288l.mo30721a(t, m31323m & 1048575));
                                break;
                            case 25:
                                interfaceC3280k0.mo30752N(this.f8288l.mo30721a(t, m31323m & 1048575));
                                break;
                            case 26:
                                if (m31310z(m31323m)) {
                                    ((C3331lo) interfaceC3280k0).m30743e(this.f8288l.mo30721a(t, m31323m & 1048575), true);
                                    break;
                                } else {
                                    ((C3331lo) interfaceC3280k0).m30743e(this.f8288l.mo30721a(t, m31323m & 1048575), false);
                                    break;
                                }
                            case 27:
                                interfaceC3280k0.mo30751O(this.f8288l.mo30721a(t, m31323m & 1048575), m31320p(m31328V), c3617wo);
                                break;
                            case 28:
                                interfaceC3280k0.mo30763C(this.f8288l.mo30721a(t, m31323m & 1048575));
                                break;
                            case 29:
                                interfaceC3280k0.mo30753M(this.f8288l.mo30721a(t, m31323m & 1048575));
                                break;
                            case 30:
                                List<Integer> mo30721a = this.f8288l.mo30721a(t, m31323m & 1048575);
                                interfaceC3280k0.mo30724x(mo30721a);
                                obj = C3359n0.m30614c(mo30745c, mo30721a, m31321o(m31328V), obj, abstractC3645y0);
                                break;
                            case 31:
                                interfaceC3280k0.mo30759G(this.f8288l.mo30721a(t, m31323m & 1048575));
                                break;
                            case 32:
                                interfaceC3280k0.mo30760F(this.f8288l.mo30721a(t, m31323m & 1048575));
                                break;
                            case 33:
                                interfaceC3280k0.mo30754L(this.f8288l.mo30721a(t, m31323m & 1048575));
                                break;
                            case 34:
                                interfaceC3280k0.mo30756J(this.f8288l.mo30721a(t, m31323m & 1048575));
                                break;
                            case 35:
                                interfaceC3280k0.mo30764B(this.f8288l.mo30721a(t, m31323m & 1048575));
                                break;
                            case 36:
                                interfaceC3280k0.mo30750P(this.f8288l.mo30721a(t, m31323m & 1048575));
                                break;
                            case 37:
                                interfaceC3280k0.mo30723y(this.f8288l.mo30721a(t, m31323m & 1048575));
                                break;
                            case 38:
                                interfaceC3280k0.mo30765A(this.f8288l.mo30721a(t, m31323m & 1048575));
                                break;
                            case 39:
                                interfaceC3280k0.mo30762D(this.f8288l.mo30721a(t, m31323m & 1048575));
                                break;
                            case 40:
                                interfaceC3280k0.mo30755K(this.f8288l.mo30721a(t, m31323m & 1048575));
                                break;
                            case 41:
                                interfaceC3280k0.mo30757I(this.f8288l.mo30721a(t, m31323m & 1048575));
                                break;
                            case 42:
                                interfaceC3280k0.mo30752N(this.f8288l.mo30721a(t, m31323m & 1048575));
                                break;
                            case 43:
                                interfaceC3280k0.mo30753M(this.f8288l.mo30721a(t, m31323m & 1048575));
                                break;
                            case 44:
                                List<Integer> mo30721a2 = this.f8288l.mo30721a(t, m31323m & 1048575);
                                interfaceC3280k0.mo30724x(mo30721a2);
                                obj = C3359n0.m30614c(mo30745c, mo30721a2, m31321o(m31328V), obj, abstractC3645y0);
                                break;
                            case 45:
                                interfaceC3280k0.mo30759G(this.f8288l.mo30721a(t, m31323m & 1048575));
                                break;
                            case 46:
                                interfaceC3280k0.mo30760F(this.f8288l.mo30721a(t, m31323m & 1048575));
                                break;
                            case 47:
                                interfaceC3280k0.mo30754L(this.f8288l.mo30721a(t, m31323m & 1048575));
                                break;
                            case 48:
                                interfaceC3280k0.mo30756J(this.f8288l.mo30721a(t, m31323m & 1048575));
                                break;
                            case 49:
                                interfaceC3280k0.mo30758H(this.f8288l.mo30721a(t, m31323m & 1048575), m31320p(m31328V), c3617wo);
                                break;
                            case 50:
                                Object m31318r = m31318r(m31328V);
                                long m31323m2 = m31323m(m31328V) & 1048575;
                                Object m30923k = C3254j1.m30923k(t, m31323m2);
                                if (m30923k != null) {
                                    if (C3514t.m30225b(m30923k)) {
                                        Object m30302b = C3488s.m30303a().m30302b();
                                        C3514t.m30224c(m30302b, m30923k);
                                        C3254j1.m30910x(t, m31323m2, m30302b);
                                        m30923k = m30302b;
                                    }
                                } else {
                                    m30923k = C3488s.m30303a().m30302b();
                                    C3254j1.m30910x(t, m31323m2, m30923k);
                                }
                                C3488s c3488s = (C3488s) m30923k;
                                C3462r c3462r = (C3462r) m31318r;
                                throw null;
                                break;
                            case 51:
                                C3254j1.m30910x(t, m31323m & 1048575, Double.valueOf(interfaceC3280k0.zza()));
                                m31312x(t, mo30745c, m31328V);
                                break;
                            case 52:
                                C3254j1.m30910x(t, m31323m & 1048575, Float.valueOf(interfaceC3280k0.zzb()));
                                m31312x(t, mo30745c, m31328V);
                                break;
                            case 53:
                                C3254j1.m30910x(t, m31323m & 1048575, Long.valueOf(interfaceC3280k0.mo30736l()));
                                m31312x(t, mo30745c, m31328V);
                                break;
                            case 54:
                                C3254j1.m30910x(t, m31323m & 1048575, Long.valueOf(interfaceC3280k0.mo30737k()));
                                m31312x(t, mo30745c, m31328V);
                                break;
                            case 55:
                                C3254j1.m30910x(t, m31323m & 1048575, Integer.valueOf(interfaceC3280k0.mo30742f()));
                                m31312x(t, mo30745c, m31328V);
                                break;
                            case 56:
                                C3254j1.m30910x(t, m31323m & 1048575, Long.valueOf(interfaceC3280k0.mo30733o()));
                                m31312x(t, mo30745c, m31328V);
                                break;
                            case 57:
                                C3254j1.m30910x(t, m31323m & 1048575, Integer.valueOf(interfaceC3280k0.mo30738j()));
                                m31312x(t, mo30745c, m31328V);
                                break;
                            case 58:
                                C3254j1.m30910x(t, m31323m & 1048575, Boolean.valueOf(interfaceC3280k0.mo30725w()));
                                m31312x(t, mo30745c, m31328V);
                                break;
                            case 59:
                                m31314v(t, m31323m, interfaceC3280k0);
                                m31312x(t, mo30745c, m31328V);
                                break;
                            case 60:
                                if (m31346D(t, mo30745c, m31328V)) {
                                    long j3 = m31323m & 1048575;
                                    C3254j1.m30910x(t, j3, C3117e.m31219g(C3254j1.m30923k(t, j3), interfaceC3280k0.mo30722z(m31320p(m31328V), c3617wo)));
                                } else {
                                    C3254j1.m30910x(t, m31323m & 1048575, interfaceC3280k0.mo30722z(m31320p(m31328V), c3617wo));
                                    m31313w(t, m31328V);
                                }
                                m31312x(t, mo30745c, m31328V);
                                break;
                            case 61:
                                C3254j1.m30910x(t, m31323m & 1048575, interfaceC3280k0.mo30741g());
                                m31312x(t, mo30745c, m31328V);
                                break;
                            case 62:
                                C3254j1.m30910x(t, m31323m & 1048575, Integer.valueOf(interfaceC3280k0.mo30734n()));
                                m31312x(t, mo30745c, m31328V);
                                break;
                            case 63:
                                int mo30747a2 = interfaceC3280k0.mo30747a();
                                InterfaceC3063c m31321o2 = m31321o(m31328V);
                                if (m31321o2 != null && !m31321o2.zza()) {
                                    obj = C3359n0.m30613d(mo30745c, mo30747a2, obj, abstractC3645y0);
                                    break;
                                }
                                C3254j1.m30910x(t, m31323m & 1048575, Integer.valueOf(mo30747a2));
                                m31312x(t, mo30745c, m31328V);
                                break;
                            case 64:
                                C3254j1.m30910x(t, m31323m & 1048575, Integer.valueOf(interfaceC3280k0.mo30746b()));
                                m31312x(t, mo30745c, m31328V);
                                break;
                            case 65:
                                C3254j1.m30910x(t, m31323m & 1048575, Long.valueOf(interfaceC3280k0.mo30735m()));
                                m31312x(t, mo30745c, m31328V);
                                break;
                            case 66:
                                C3254j1.m30910x(t, m31323m & 1048575, Integer.valueOf(interfaceC3280k0.mo30740h()));
                                m31312x(t, mo30745c, m31328V);
                                break;
                            case 67:
                                C3254j1.m30910x(t, m31323m & 1048575, Long.valueOf(interfaceC3280k0.mo30739i()));
                                m31312x(t, mo30745c, m31328V);
                                break;
                            case 68:
                                C3254j1.m30910x(t, m31323m & 1048575, interfaceC3280k0.mo30761E(m31320p(m31328V), c3617wo));
                                m31312x(t, mo30745c, m31328V);
                                break;
                            default:
                                if (obj == null) {
                                    obj = abstractC3645y0.mo29990f();
                                }
                                if (!abstractC3645y0.m29980p(obj, interfaceC3280k0)) {
                                    for (int i = this.f8286j; i < this.f8287k; i++) {
                                        m31319q(t, this.f8285i[i], obj, abstractC3645y0);
                                    }
                                    if (obj != null) {
                                        abstractC3645y0.mo29982n(t, obj);
                                        return;
                                    }
                                    return;
                                }
                                break;
                        }
                    } catch (zzaad unused) {
                        abstractC3645y0.mo29979q(interfaceC3280k0);
                        if (obj == null) {
                            obj = abstractC3645y0.mo29993c(t);
                        }
                        if (!abstractC3645y0.m29980p(obj, interfaceC3280k0)) {
                            for (int i2 = this.f8286j; i2 < this.f8287k; i2++) {
                                m31319q(t, this.f8285i[i2], obj, abstractC3645y0);
                            }
                            if (obj != null) {
                                abstractC3645y0.mo29982n(t, obj);
                                return;
                            }
                            return;
                        }
                    }
                } else if (mo30745c == Integer.MAX_VALUE) {
                    for (int i3 = this.f8286j; i3 < this.f8287k; i3++) {
                        m31319q(t, this.f8285i[i3], obj, abstractC3645y0);
                    }
                    if (obj != null) {
                        abstractC3645y0.mo29982n(t, obj);
                        return;
                    }
                    return;
                } else {
                    if ((!this.f8282f ? null : abstractC3643xo.mo29919c(c3617wo, this.f8281e, mo30745c)) != null) {
                        abstractC3643xo.mo29920b(t);
                        throw null;
                    }
                    abstractC3645y0.mo29979q(interfaceC3280k0);
                    if (obj == null) {
                        obj = abstractC3645y0.mo29993c(t);
                    }
                    if (!abstractC3645y0.m29980p(obj, interfaceC3280k0)) {
                        for (int i4 = this.f8286j; i4 < this.f8287k; i4++) {
                            m31319q(t, this.f8285i[i4], obj, abstractC3645y0);
                        }
                        if (obj != null) {
                            abstractC3645y0.mo29982n(t, obj);
                            return;
                        }
                        return;
                    }
                }
            } catch (Throwable th) {
                for (int i5 = this.f8286j; i5 < this.f8287k; i5++) {
                    m31319q(t, this.f8285i[i5], obj, abstractC3645y0);
                }
                if (obj != null) {
                    abstractC3645y0.mo29982n(t, obj);
                }
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3307l0
    /* renamed from: i */
    public final void mo30808i(T t, byte[] bArr, int i, int i2, C3642xn c3642xn) throws IOException {
        if (this.f8284h) {
            m31330T(t, bArr, i, i2, c3642xn);
        } else {
            m31341I(t, bArr, i, i2, 0, c3642xn);
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3307l0
    /* renamed from: j */
    public final boolean mo30807j(T t, T t2) {
        boolean m30609h;
        int length = this.f8277a.length;
        for (int i = 0; i < length; i += 3) {
            int m31323m = m31323m(i);
            long j = m31323m & 1048575;
            switch (m31324l(m31323m)) {
                case 0:
                    if (m31311y(t, t2, i) && Double.doubleToLongBits(C3254j1.m30928f(t, j)) == Double.doubleToLongBits(C3254j1.m30928f(t2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (m31311y(t, t2, i) && Float.floatToIntBits(C3254j1.m30927g(t, j)) == Float.floatToIntBits(C3254j1.m30927g(t2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (m31311y(t, t2, i) && C3254j1.m30925i(t, j) == C3254j1.m30925i(t2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (m31311y(t, t2, i) && C3254j1.m30925i(t, j) == C3254j1.m30925i(t2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (m31311y(t, t2, i) && C3254j1.m30926h(t, j) == C3254j1.m30926h(t2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (m31311y(t, t2, i) && C3254j1.m30925i(t, j) == C3254j1.m30925i(t2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (m31311y(t, t2, i) && C3254j1.m30926h(t, j) == C3254j1.m30926h(t2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (m31311y(t, t2, i) && C3254j1.m30937B(t, j) == C3254j1.m30937B(t2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (m31311y(t, t2, i) && C3359n0.m30609h(C3254j1.m30923k(t, j), C3254j1.m30923k(t2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (m31311y(t, t2, i) && C3359n0.m30609h(C3254j1.m30923k(t, j), C3254j1.m30923k(t2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (m31311y(t, t2, i) && C3359n0.m30609h(C3254j1.m30923k(t, j), C3254j1.m30923k(t2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (m31311y(t, t2, i) && C3254j1.m30926h(t, j) == C3254j1.m30926h(t2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (m31311y(t, t2, i) && C3254j1.m30926h(t, j) == C3254j1.m30926h(t2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (m31311y(t, t2, i) && C3254j1.m30926h(t, j) == C3254j1.m30926h(t2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (m31311y(t, t2, i) && C3254j1.m30925i(t, j) == C3254j1.m30925i(t2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (m31311y(t, t2, i) && C3254j1.m30926h(t, j) == C3254j1.m30926h(t2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (m31311y(t, t2, i) && C3254j1.m30925i(t, j) == C3254j1.m30925i(t2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (m31311y(t, t2, i) && C3359n0.m30609h(C3254j1.m30923k(t, j), C3254j1.m30923k(t2, j))) {
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
                    m30609h = C3359n0.m30609h(C3254j1.m30923k(t, j), C3254j1.m30923k(t2, j));
                    break;
                case 50:
                    m30609h = C3359n0.m30609h(C3254j1.m30923k(t, j), C3254j1.m30923k(t2, j));
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
                    long m31326X = m31326X(i) & 1048575;
                    if (C3254j1.m30926h(t, m31326X) == C3254j1.m30926h(t2, m31326X) && C3359n0.m30609h(C3254j1.m30923k(t, j), C3254j1.m30923k(t2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!m30609h) {
                return false;
            }
        }
        if (this.f8289m.mo29992d(t).equals(this.f8289m.mo29992d(t2))) {
            if (this.f8282f) {
                this.f8290n.mo29921a(t);
                throw null;
            }
            return true;
        }
        return false;
    }
}
