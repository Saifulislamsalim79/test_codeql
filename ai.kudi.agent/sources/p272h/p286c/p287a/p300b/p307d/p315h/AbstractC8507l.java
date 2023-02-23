package p272h.p286c.p287a.p300b.p307d.p315h;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: com.google.mlkit:common@@18.0.0 */
/* renamed from: h.c.a.b.d.h.l */
/* loaded from: classes2.dex */
public abstract class AbstractC8507l implements Map, Serializable {

    /* renamed from: c */
    private transient AbstractC8509m f20214c;

    /* renamed from: d */
    private transient AbstractC8509m f20215d;

    /* renamed from: e */
    private transient AbstractC8497g f20216e;

    /* renamed from: c */
    public static AbstractC8507l m16019c(Object obj, Object obj2) {
        C8493e.m16033a("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return C8523t.m16001i(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    /* renamed from: a */
    abstract AbstractC8497g mo16004a();

    @Override // java.util.Map
    /* renamed from: b */
    public final AbstractC8497g values() {
        AbstractC8497g abstractC8497g = this.f20216e;
        if (abstractC8497g == null) {
            AbstractC8497g mo16004a = mo16004a();
            this.f20216e = mo16004a;
            return mo16004a;
        }
        return abstractC8497g;
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
    abstract AbstractC8509m mo16003e();

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
    abstract AbstractC8509m mo16002g();

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    /* renamed from: h */
    public final AbstractC8509m entrySet() {
        AbstractC8509m abstractC8509m = this.f20214c;
        if (abstractC8509m == null) {
            AbstractC8509m mo16003e = mo16003e();
            this.f20214c = mo16003e;
            return mo16003e;
        }
        return abstractC8509m;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return C8525u.m15999a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        AbstractC8509m abstractC8509m = this.f20215d;
        if (abstractC8509m == null) {
            AbstractC8509m mo16002g = mo16002g();
            this.f20215d = mo16002g;
            return mo16002g;
        }
        return abstractC8509m;
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
        if (size >= 0) {
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
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append("size cannot be negative but was: ");
        sb2.append(size);
        throw new IllegalArgumentException(sb2.toString());
    }
}
