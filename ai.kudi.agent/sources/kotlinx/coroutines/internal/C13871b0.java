package kotlinx.coroutines.internal;

import kotlin.p549l0.C13275r;
/* compiled from: SystemProps.common.kt */
/* renamed from: kotlinx.coroutines.internal.b0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C13871b0 {
    /* renamed from: a */
    public static final int m3556a(String str, int i, int i2, int i3) {
        return (int) C13915z.m3418c(str, i, i2, i3);
    }

    /* renamed from: b */
    public static final long m3555b(String str, long j, long j2, long j3) {
        Long m5453m;
        String m3417d = C13915z.m3417d(str);
        if (m3417d == null) {
            return j;
        }
        m5453m = C13275r.m5453m(m3417d);
        if (m5453m == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + m3417d + '\'').toString());
        }
        long longValue = m5453m.longValue();
        boolean z = false;
        if (j2 <= longValue && longValue <= j3) {
            z = true;
        }
        if (z) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
    }

    /* renamed from: c */
    public static final boolean m3554c(String str, boolean z) {
        String m3417d = C13915z.m3417d(str);
        return m3417d == null ? z : Boolean.parseBoolean(m3417d);
    }

    /* renamed from: d */
    public static /* synthetic */ int m3553d(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return C13915z.m3419b(str, i, i2, i3);
    }

    /* renamed from: e */
    public static /* synthetic */ long m3552e(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return C13915z.m3418c(str, j, j4, j3);
    }
}
