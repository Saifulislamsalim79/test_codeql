package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;
/* compiled from: PageTransformerAdapter.java */
/* renamed from: androidx.viewpager2.widget.d */
/* loaded from: classes2.dex */
final class C1939d extends ViewPager2.AbstractC1924i {

    /* renamed from: a */
    private final LinearLayoutManager f5846a;

    /* renamed from: b */
    private ViewPager2.InterfaceC1929k f5847b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1939d(LinearLayoutManager linearLayoutManager) {
        this.f5846a = linearLayoutManager;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1924i
    /* renamed from: a */
    public void mo26465a(int i) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1924i
    /* renamed from: b */
    public void mo26464b(int i, float f, int i2) {
        if (this.f5847b == null) {
            return;
        }
        float f2 = -f;
        for (int i3 = 0; i3 < this.f5846a.m35142T(); i3++) {
            View m35145S = this.f5846a.m35145S(i3);
            if (m35145S != null) {
                this.f5847b.m34224a(m35145S, (this.f5846a.m35110n0(m35145S) - i) + f2);
            } else {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i3), Integer.valueOf(this.f5846a.m35142T())));
            }
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1924i
    /* renamed from: c */
    public void mo26463c(int i) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public ViewPager2.InterfaceC1929k m34209d() {
        return this.f5847b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m34208e(ViewPager2.InterfaceC1929k interfaceC1929k) {
        this.f5847b = interfaceC1929k;
    }
}
