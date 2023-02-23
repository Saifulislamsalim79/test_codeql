package p201g.p259r;

import java.util.List;
import kotlin.e0.d.l;
import kotlin.p557z.AbstractC13689d;
/* compiled from: ItemSnapshotList.kt */
/* renamed from: g.r.w */
/* loaded from: classes2.dex */
public final class C8052w<T> extends AbstractC13689d<T> {

    /* renamed from: d */
    private final int f19389d;

    /* renamed from: e */
    private final int f19390e;

    /* renamed from: f */
    private final List<T> f19391f;

    /* JADX WARN: Multi-variable type inference failed */
    public C8052w(int i, int i2, List<? extends T> list) {
        l.f(list, "items");
        this.f19389d = i;
        this.f19390e = i2;
        this.f19391f = list;
    }

    @Override // kotlin.p557z.AbstractC13669a
    /* renamed from: e */
    public int mo4055e() {
        return this.f19389d + this.f19391f.size() + this.f19390e;
    }

    @Override // kotlin.p557z.AbstractC13689d, java.util.List
    public T get(int i) {
        boolean z = true;
        if (i >= 0 && i < this.f19389d) {
            return null;
        }
        int i2 = this.f19389d;
        if (i < this.f19391f.size() + i2 && i2 <= i) {
            return this.f19391f.get(i - this.f19389d);
        }
        if ((i >= size() || this.f19389d + this.f19391f.size() > i) ? false : false) {
            return null;
        }
        throw new IndexOutOfBoundsException("Illegal attempt to access index " + i + " in ItemSnapshotList of size " + size());
    }
}
