package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;
/* compiled from: TabLayoutMediator.java */
/* renamed from: com.google.android.material.tabs.c */
/* loaded from: classes2.dex */
public final class C4752c {

    /* renamed from: a */
    private final TabLayout f11959a;

    /* renamed from: b */
    private final ViewPager2 f11960b;

    /* renamed from: c */
    private final boolean f11961c;

    /* renamed from: d */
    private final boolean f11962d;

    /* renamed from: e */
    private final InterfaceC4754b f11963e;

    /* renamed from: f */
    private RecyclerView.AbstractC1623h<?> f11964f;

    /* renamed from: g */
    private boolean f11965g;

    /* renamed from: h */
    private C4755c f11966h;

    /* renamed from: i */
    private TabLayout.InterfaceC4740d f11967i;

    /* renamed from: j */
    private RecyclerView.AbstractC1626j f11968j;

    /* compiled from: TabLayoutMediator.java */
    /* renamed from: com.google.android.material.tabs.c$a */
    /* loaded from: classes2.dex */
    private class C4753a extends RecyclerView.AbstractC1626j {
        C4753a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1626j
        /* renamed from: a */
        public void mo26471a() {
            C4752c.this.m26472b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1626j
        /* renamed from: b */
        public void mo26470b(int i, int i2) {
            C4752c.this.m26472b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1626j
        /* renamed from: c */
        public void mo26469c(int i, int i2, Object obj) {
            C4752c.this.m26472b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1626j
        /* renamed from: d */
        public void mo16890d(int i, int i2) {
            C4752c.this.m26472b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1626j
        /* renamed from: e */
        public void mo26468e(int i, int i2, int i3) {
            C4752c.this.m26472b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1626j
        /* renamed from: f */
        public void mo26467f(int i, int i2) {
            C4752c.this.m26472b();
        }
    }

    /* compiled from: TabLayoutMediator.java */
    /* renamed from: com.google.android.material.tabs.c$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC4754b {
        /* renamed from: a */
        void m26466a(TabLayout.C4745g c4745g, int i);
    }

    /* compiled from: TabLayoutMediator.java */
    /* renamed from: com.google.android.material.tabs.c$c */
    /* loaded from: classes2.dex */
    private static class C4755c extends ViewPager2.AbstractC1924i {

        /* renamed from: a */
        private final WeakReference<TabLayout> f11970a;

        /* renamed from: b */
        private int f11971b;

        /* renamed from: c */
        private int f11972c;

        C4755c(TabLayout tabLayout) {
            this.f11970a = new WeakReference<>(tabLayout);
            m26462d();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1924i
        /* renamed from: a */
        public void mo26465a(int i) {
            this.f11971b = this.f11972c;
            this.f11972c = i;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1924i
        /* renamed from: b */
        public void mo26464b(int i, float f, int i2) {
            TabLayout tabLayout = this.f11970a.get();
            if (tabLayout != null) {
                boolean z = false;
                tabLayout.m26567J(i, f, this.f11972c != 2 || this.f11971b == 1, (this.f11972c == 2 && this.f11971b == 0) ? true : true);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1924i
        /* renamed from: c */
        public void mo26463c(int i) {
            TabLayout tabLayout = this.f11970a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i2 = this.f11972c;
            tabLayout.m26570G(tabLayout.m26538x(i), i2 == 0 || (i2 == 2 && this.f11971b == 0));
        }

        /* renamed from: d */
        void m26462d() {
            this.f11972c = 0;
            this.f11971b = 0;
        }
    }

    /* compiled from: TabLayoutMediator.java */
    /* renamed from: com.google.android.material.tabs.c$d */
    /* loaded from: classes2.dex */
    private static class C4756d implements TabLayout.InterfaceC4740d {

        /* renamed from: a */
        private final ViewPager2 f11973a;

        /* renamed from: b */
        private final boolean f11974b;

        C4756d(ViewPager2 viewPager2, boolean z) {
            this.f11973a = viewPager2;
            this.f11974b = z;
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC4739c
        public void onTabReselected(TabLayout.C4745g c4745g) {
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC4739c
        public void onTabSelected(TabLayout.C4745g c4745g) {
            this.f11973a.m34258j(c4745g.m26518h(), this.f11974b);
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC4739c
        public void onTabUnselected(TabLayout.C4745g c4745g) {
        }
    }

    public C4752c(TabLayout tabLayout, ViewPager2 viewPager2, InterfaceC4754b interfaceC4754b) {
        this(tabLayout, viewPager2, true, interfaceC4754b);
    }

    /* renamed from: a */
    public void m26473a() {
        if (!this.f11965g) {
            RecyclerView.AbstractC1623h<?> adapter = this.f11960b.getAdapter();
            this.f11964f = adapter;
            if (adapter != null) {
                this.f11965g = true;
                C4755c c4755c = new C4755c(this.f11959a);
                this.f11966h = c4755c;
                this.f11960b.m34261g(c4755c);
                C4756d c4756d = new C4756d(this.f11960b, this.f11962d);
                this.f11967i = c4756d;
                this.f11959a.m26558d(c4756d);
                if (this.f11961c) {
                    C4753a c4753a = new C4753a();
                    this.f11968j = c4753a;
                    this.f11964f.registerAdapterDataObserver(c4753a);
                }
                m26472b();
                this.f11959a.m26568I(this.f11960b.getCurrentItem(), 0.0f, true);
                return;
            }
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw new IllegalStateException("TabLayoutMediator is already attached");
    }

    /* renamed from: b */
    void m26472b() {
        this.f11959a.m26574C();
        RecyclerView.AbstractC1623h<?> abstractC1623h = this.f11964f;
        if (abstractC1623h != null) {
            int itemCount = abstractC1623h.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                TabLayout.C4745g m26536z = this.f11959a.m26536z();
                this.f11963e.m26466a(m26536z, i);
                this.f11959a.m26555g(m26536z, false);
            }
            if (itemCount > 0) {
                int min = Math.min(this.f11960b.getCurrentItem(), this.f11959a.getTabCount() - 1);
                if (min != this.f11959a.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.f11959a;
                    tabLayout.m26571F(tabLayout.m26538x(min));
                }
            }
        }
    }

    public C4752c(TabLayout tabLayout, ViewPager2 viewPager2, boolean z, InterfaceC4754b interfaceC4754b) {
        this(tabLayout, viewPager2, z, true, interfaceC4754b);
    }

    public C4752c(TabLayout tabLayout, ViewPager2 viewPager2, boolean z, boolean z2, InterfaceC4754b interfaceC4754b) {
        this.f11959a = tabLayout;
        this.f11960b = viewPager2;
        this.f11961c = z;
        this.f11962d = z2;
        this.f11963e = interfaceC4754b;
    }
}
