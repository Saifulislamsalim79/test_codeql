package p272h.p286c.p360e.p361a.p363b;

import android.graphics.PointF;
import p272h.p286c.p287a.p300b.p307d.p317j.C9119td;
import p272h.p286c.p287a.p300b.p307d.p317j.C9134ud;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.e.a.b.f */
/* loaded from: classes2.dex */
public class C9403f {

    /* renamed from: a */
    private final int f22036a;

    /* renamed from: b */
    private final PointF f22037b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9403f(int i, PointF pointF) {
        this.f22036a = i;
        this.f22037b = pointF;
    }

    public String toString() {
        C9119td m15528a = C9134ud.m15528a("FaceLandmark");
        m15528a.m15539b("type", this.f22036a);
        m15528a.m15538c("position", this.f22037b);
        return m15528a.toString();
    }
}
