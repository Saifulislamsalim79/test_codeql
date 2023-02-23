package p272h.p286c.p287a.p300b.p307d.p317j;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.r0 */
/* loaded from: classes2.dex */
public abstract class AbstractC9077r0 implements Map, Serializable {

    /* renamed from: c */
    private transient AbstractC9091s0 f21456c;

    /* renamed from: d */
    private transient AbstractC9091s0 f21457d;

    /* renamed from: e */
    private transient AbstractC8972k0 f21458e;

    /* renamed from: c */
    public static AbstractC9077r0 m15558c(Object obj, Object obj2) {
        C9135v.m15526b("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return C8958j1.m15695i(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    /* renamed from: a */
    abstract AbstractC8972k0 mo15560a();

    @Override // java.util.Map
    /* renamed from: b */
    public final AbstractC8972k0 values() {
        AbstractC8972k0 abstractC8972k0 = this.f21458e;
        if (abstractC8972k0 == null) {
            AbstractC8972k0 mo15560a = mo15560a();
            this.f21458e = mo15560a;
            return mo15560a;
        }
        return abstractC8972k0;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    /* renamed from: e */
    abstract AbstractC9091s0 mo15557e();

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* renamed from: g */
    abstract AbstractC9091s0 mo15556g();

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    /* renamed from: h */
    public final AbstractC9091s0 entrySet() {
        AbstractC9091s0 abstractC9091s0 = this.f21456c;
        if (abstractC9091s0 == null) {
            AbstractC9091s0 mo15557e = mo15557e();
            this.f21456c = mo15557e;
            return mo15557e;
        }
        return abstractC9091s0;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return C8988l1.m15668a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        AbstractC9091s0 abstractC9091s0 = this.f21457d;
        if (abstractC9091s0 == null) {
            AbstractC9091s0 mo15556g = mo15556g();
            this.f21457d = mo15556g;
            return mo15556g;
        }
        return abstractC9091s0;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        C9135v.m15527a(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, (long) IjkMediaMeta.AV_CH_STEREO_RIGHT));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
