package p272h.p286c.p287a.p300b.p307d.p317j;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.z */
/* loaded from: classes2.dex */
final class C9190z extends AbstractSet {

    /* renamed from: c */
    final /* synthetic */ C8897f0 f21573c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9190z(C8897f0 c8897f0) {
        this.f21573c = c8897f0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f21573c.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int m15713z;
        Map m15723p = this.f21573c.m15723p();
        if (m15723p != null) {
            return m15723p.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            m15713z = this.f21573c.m15713z(entry.getKey());
            if (m15713z != -1 && C9148vd.m15518a(C8897f0.m15725n(this.f21573c, m15713z), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C8897f0 c8897f0 = this.f21573c;
        Map m15723p = c8897f0.m15723p();
        if (m15723p != null) {
            return m15723p.entrySet().iterator();
        }
        return new C9162x(c8897f0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int m15714y;
        int[] m15737D;
        Object[] m15736a;
        Object[] m15735b;
        Map m15723p = this.f21573c.m15723p();
        if (m15723p != null) {
            return m15723p.entrySet().remove(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            C8897f0 c8897f0 = this.f21573c;
            if (c8897f0.m15718u()) {
                return false;
            }
            m15714y = c8897f0.m15714y();
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object m15724o = C8897f0.m15724o(this.f21573c);
            m15737D = this.f21573c.m15737D();
            m15736a = this.f21573c.m15736a();
            m15735b = this.f21573c.m15735b();
            int m15711b = C8912g0.m15711b(key, value, m15714y, m15724o, m15737D, m15736a, m15735b);
            if (m15711b == -1) {
                return false;
            }
            this.f21573c.m15719t(m15711b, m15714y);
            C8897f0.m15733e(this.f21573c);
            this.f21573c.m15721r();
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f21573c.size();
    }
}
