package p272h.p286c.p287a.p300b.p307d.p317j;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.z0 */
/* loaded from: classes2.dex */
abstract class AbstractC9191z0 extends AbstractMap {

    /* renamed from: c */
    private transient Set f21574c;

    /* renamed from: d */
    private transient Collection f21575d;

    /* renamed from: a */
    abstract Set mo15476a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f21574c;
        if (set == null) {
            Set mo15476a = mo15476a();
            this.f21574c = mo15476a;
            return mo15476a;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f21575d;
        if (collection == null) {
            C9177y0 c9177y0 = new C9177y0(this);
            this.f21575d = c9177y0;
            return c9177y0;
        }
        return collection;
    }
}
