package p272h.p286c.p287a.p300b.p307d.p316i;

import android.os.SystemClock;
/* compiled from: com.google.mlkit:vision-common@@17.0.0 */
/* renamed from: h.c.a.b.d.i.n9 */
/* loaded from: classes2.dex */
public final class C8688n9 {
    /* renamed from: a */
    public static void m15937a(C8555b9 c8555b9, int i, int i2, long j, int i3, int i4, int i5, int i6) {
        c8555b9.m15989b(m15936b(i, i2, j, i3, i4, i5, i6), EnumC8587e6.INPUT_IMAGE_CONSTRUCTION);
    }

    /* renamed from: b */
    private static C8677m9 m15936b(int i, int i2, long j, int i3, int i4, int i5, int i6) {
        return new C8677m9(i, i2, i5, i3, i4, SystemClock.elapsedRealtime() - j, i6);
    }
}
