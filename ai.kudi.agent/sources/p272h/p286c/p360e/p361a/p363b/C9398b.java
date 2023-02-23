package p272h.p286c.p360e.p361a.p363b;

import java.util.List;
import p272h.p286c.p287a.p300b.p307d.p317j.C9119td;
import p272h.p286c.p287a.p300b.p307d.p317j.C9134ud;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.e.a.b.b */
/* loaded from: classes2.dex */
public class C9398b {

    /* renamed from: a */
    private final int f22020a;

    /* renamed from: b */
    private final List f22021b;

    public C9398b(int i, List list) {
        this.f22020a = i;
        this.f22021b = list;
    }

    public String toString() {
        C9119td m15528a = C9134ud.m15528a("FaceContour");
        m15528a.m15539b("type", this.f22020a);
        m15528a.m15538c("points", this.f22021b.toArray());
        return m15528a.toString();
    }
}
