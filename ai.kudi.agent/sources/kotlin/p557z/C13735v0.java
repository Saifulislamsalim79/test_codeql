package kotlin.p557z;

import java.util.List;
import kotlin.e0.d.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReversedViews.kt */
/* renamed from: kotlin.z.v0 */
/* loaded from: classes3.dex */
public final class C13735v0<T> extends AbstractC13697f<T> {

    /* renamed from: c */
    private final List<T> f30177c;

    public C13735v0(List<T> list) {
        l.f(list, "delegate");
        this.f30177c = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, T t) {
        int m3833F;
        List<T> list = this.f30177c;
        m3833F = C13738x.m3833F(this, i);
        list.add(m3833F, t);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f30177c.clear();
    }

    @Override // kotlin.p557z.AbstractC13697f
    /* renamed from: e */
    public int mo3853e() {
        return this.f30177c.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i) {
        int m3834E;
        List<T> list = this.f30177c;
        m3834E = C13738x.m3834E(this, i);
        return list.get(m3834E);
    }

    @Override // kotlin.p557z.AbstractC13697f
    /* renamed from: h */
    public T mo3852h(int i) {
        int m3834E;
        List<T> list = this.f30177c;
        m3834E = C13738x.m3834E(this, i);
        return list.remove(m3834E);
    }

    @Override // java.util.AbstractList, java.util.List
    public T set(int i, T t) {
        int m3834E;
        List<T> list = this.f30177c;
        m3834E = C13738x.m3834E(this, i);
        return list.set(m3834E, t);
    }
}
