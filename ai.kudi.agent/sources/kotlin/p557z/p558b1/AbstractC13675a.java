package kotlin.p557z.p558b1;

import java.util.Map;
import java.util.Map.Entry;
import kotlin.e0.d.l;
import kotlin.p557z.AbstractC13699g;
/* compiled from: MapBuilder.kt */
/* renamed from: kotlin.z.b1.a */
/* loaded from: classes3.dex */
public abstract class AbstractC13675a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends AbstractC13699g<E> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return m4217h((Map.Entry) obj);
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m4217h(E e) {
        l.f(e, "element");
        return mo4162k(e);
    }

    /* renamed from: k */
    public abstract boolean mo4162k(Map.Entry<? extends K, ? extends V> entry);

    /* renamed from: l */
    public abstract /* bridge */ boolean mo4161l(Map.Entry entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return mo4161l((Map.Entry) obj);
        }
        return false;
    }
}
