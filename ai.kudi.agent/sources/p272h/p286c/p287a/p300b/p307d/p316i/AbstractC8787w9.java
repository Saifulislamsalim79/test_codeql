package p272h.p286c.p287a.p300b.p307d.p316i;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: com.google.mlkit:vision-common@@17.0.0 */
/* renamed from: h.c.a.b.d.i.w9 */
/* loaded from: classes2.dex */
public abstract class AbstractC8787w9 implements Map, Serializable {

    /* renamed from: c */
    private transient AbstractC8798x9 f20734c;

    /* renamed from: d */
    private transient AbstractC8798x9 f20735d;

    /* renamed from: e */
    private transient AbstractC8721q9 f20736e;

    /* renamed from: c */
    public static AbstractC8787w9 m15856c(Object obj, Object obj2) {
        C8611g7.m15963a("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return C8579da.m15977i(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    /* renamed from: a */
    abstract AbstractC8721q9 mo15858a();

    @Override // java.util.Map
    /* renamed from: b */
    public final AbstractC8721q9 values() {
        AbstractC8721q9 abstractC8721q9 = this.f20736e;
        if (abstractC8721q9 == null) {
            AbstractC8721q9 mo15858a = mo15858a();
            this.f20736e = mo15858a;
            return mo15858a;
        }
        return abstractC8721q9;
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
    abstract AbstractC8798x9 mo15855e();

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
    abstract AbstractC8798x9 mo15854g();

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    /* renamed from: h */
    public final AbstractC8798x9 entrySet() {
        AbstractC8798x9 abstractC8798x9 = this.f20734c;
        if (abstractC8798x9 == null) {
            AbstractC8798x9 mo15855e = mo15855e();
            this.f20734c = mo15855e;
            return mo15855e;
        }
        return abstractC8798x9;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return C8591ea.m15972a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        AbstractC8798x9 abstractC8798x9 = this.f20735d;
        if (abstractC8798x9 == null) {
            AbstractC8798x9 mo15854g = mo15854g();
            this.f20735d = mo15854g;
            return mo15854g;
        }
        return abstractC8798x9;
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
