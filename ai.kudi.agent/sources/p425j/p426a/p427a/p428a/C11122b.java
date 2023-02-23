package p425j.p426a.p427a.p428a;

import java.util.Map;
/* compiled from: SectionAdapter.java */
/* renamed from: j.a.a.a.b */
/* loaded from: classes2.dex */
public class C11122b {

    /* renamed from: a */
    private final transient C11126d f25151a;

    /* renamed from: b */
    private final transient AbstractC11119a f25152b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11122b(C11126d c11126d, AbstractC11119a abstractC11119a) {
        this.f25151a = c11126d;
        this.f25152b = abstractC11119a;
    }

    /* renamed from: a */
    public int m11645a() {
        if (this.f25152b.hasHeader()) {
            return m11643c();
        }
        throw new IllegalStateException("Section doesn't have a header");
    }

    /* renamed from: b */
    public int m11644b(int i) {
        return m11643c() + (this.f25152b.hasHeader() ? 1 : 0) + i;
    }

    /* renamed from: c */
    public int m11643c() {
        int i = 0;
        for (Map.Entry<String, AbstractC11119a> entry : this.f25151a.m11607q().entrySet()) {
            AbstractC11119a value = entry.getValue();
            if (value.isVisible()) {
                if (value == this.f25152b) {
                    return i;
                }
                i += value.getSectionItemsTotal();
            }
        }
        throw new IllegalArgumentException("Section is not in the adapter.");
    }

    /* renamed from: d */
    public void m11642d() {
        this.f25151a.notifyItemRangeInserted(m11644b(0), this.f25152b.getContentItemsTotal());
    }

    /* renamed from: e */
    public void m11641e() {
        this.f25151a.notifyItemChanged(m11645a());
    }

    /* renamed from: f */
    public void m11640f(int i, int i2) {
        this.f25151a.notifyItemRangeRemoved(m11644b(i), i2);
    }
}
