package com.google.mlkit.vision.common.internal;

import android.os.SystemClock;
import com.google.android.gms.common.internal.C2886k;
import com.google.android.gms.common.internal.s;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import p272h.p286c.p360e.p361a.p362a.C9395a;
/* compiled from: com.google.mlkit:vision-common@@17.0.0 */
/* renamed from: com.google.mlkit.vision.common.internal.a */
/* loaded from: classes2.dex */
public class C6967a {

    /* renamed from: c */
    private static final C2886k f16689c = new C2886k("StreamingFormatChecker", "");

    /* renamed from: a */
    private final LinkedList f16690a = new LinkedList();

    /* renamed from: b */
    private long f16691b = -1;

    /* renamed from: a */
    public void m20422a(C9395a c9395a) {
        if (c9395a.m14855e() != -1) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f16690a.add(Long.valueOf(elapsedRealtime));
        if (this.f16690a.size() > 5) {
            this.f16690a.removeFirst();
        }
        if (this.f16690a.size() == 5) {
            Long l = (Long) this.f16690a.peekFirst();
            s.j(l);
            if (elapsedRealtime - l.longValue() < 5000) {
                long j = this.f16691b;
                if (j == -1 || elapsedRealtime - j >= TimeUnit.SECONDS.toMillis(5L)) {
                    this.f16691b = elapsedRealtime;
                    f16689c.m31710f("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
                }
            }
        }
    }
}
