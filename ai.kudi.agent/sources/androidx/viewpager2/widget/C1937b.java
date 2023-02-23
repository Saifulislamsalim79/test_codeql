package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
/* compiled from: CompositeOnPageChangeCallback.java */
/* renamed from: androidx.viewpager2.widget.b */
/* loaded from: classes2.dex */
final class C1937b extends ViewPager2.AbstractC1924i {

    /* renamed from: a */
    private final List<ViewPager2.AbstractC1924i> f5844a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1937b(int i) {
        this.f5844a = new ArrayList(i);
    }

    /* renamed from: f */
    private void m34211f(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1924i
    /* renamed from: a */
    public void mo26465a(int i) {
        try {
            for (ViewPager2.AbstractC1924i abstractC1924i : this.f5844a) {
                abstractC1924i.mo26465a(i);
            }
        } catch (ConcurrentModificationException e) {
            m34211f(e);
            throw null;
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1924i
    /* renamed from: b */
    public void mo26464b(int i, float f, int i2) {
        try {
            for (ViewPager2.AbstractC1924i abstractC1924i : this.f5844a) {
                abstractC1924i.mo26464b(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            m34211f(e);
            throw null;
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1924i
    /* renamed from: c */
    public void mo26463c(int i) {
        try {
            for (ViewPager2.AbstractC1924i abstractC1924i : this.f5844a) {
                abstractC1924i.mo26463c(i);
            }
        } catch (ConcurrentModificationException e) {
            m34211f(e);
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m34213d(ViewPager2.AbstractC1924i abstractC1924i) {
        this.f5844a.add(abstractC1924i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m34212e(ViewPager2.AbstractC1924i abstractC1924i) {
        this.f5844a.remove(abstractC1924i);
    }
}
