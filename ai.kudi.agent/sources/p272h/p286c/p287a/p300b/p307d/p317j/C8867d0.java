package p272h.p286c.p287a.p300b.p307d.p317j;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.d0 */
/* loaded from: classes2.dex */
final class C8867d0 extends AbstractC9076r {

    /* renamed from: c */
    private final Object f20855c;

    /* renamed from: d */
    private int f20856d;

    /* renamed from: e */
    final /* synthetic */ C8897f0 f20857e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8867d0(C8897f0 c8897f0, int i) {
        this.f20857e = c8897f0;
        this.f20855c = C8897f0.m15728k(c8897f0, i);
        this.f20856d = i;
    }

    /* renamed from: a */
    private final void m15767a() {
        int m15713z;
        int i = this.f20856d;
        if (i == -1 || i >= this.f20857e.size() || !C9148vd.m15518a(this.f20855c, C8897f0.m15728k(this.f20857e, this.f20856d))) {
            m15713z = this.f20857e.m15713z(this.f20855c);
            this.f20856d = m15713z;
        }
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p317j.AbstractC9076r, java.util.Map.Entry
    public final Object getKey() {
        return this.f20855c;
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p317j.AbstractC9076r, java.util.Map.Entry
    public final Object getValue() {
        Map m15723p = this.f20857e.m15723p();
        if (m15723p != null) {
            return m15723p.get(this.f20855c);
        }
        m15767a();
        int i = this.f20856d;
        if (i == -1) {
            return null;
        }
        return C8897f0.m15725n(this.f20857e, i);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map m15723p = this.f20857e.m15723p();
        if (m15723p != null) {
            return m15723p.put(this.f20855c, obj);
        }
        m15767a();
        int i = this.f20856d;
        if (i == -1) {
            this.f20857e.put(this.f20855c, obj);
            return null;
        }
        Object m15725n = C8897f0.m15725n(this.f20857e, i);
        C8897f0.m15722q(this.f20857e, this.f20856d, obj);
        return m15725n;
    }
}
