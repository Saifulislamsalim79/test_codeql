package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;
import p201g.p227h.p238l.C7676a;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.p239h0.C7716c;
import p201g.p227h.p238l.p239h0.C7720d;
/* compiled from: RecyclerViewAccessibilityDelegate.java */
/* renamed from: androidx.recyclerview.widget.w */
/* loaded from: classes2.dex */
public class C1749w extends C7676a {

    /* renamed from: d */
    final RecyclerView f5378d;

    /* renamed from: e */
    private final C1750a f5379e;

    /* compiled from: RecyclerViewAccessibilityDelegate.java */
    /* renamed from: androidx.recyclerview.widget.w$a */
    /* loaded from: classes2.dex */
    public static class C1750a extends C7676a {

        /* renamed from: d */
        final C1749w f5380d;

        /* renamed from: e */
        private Map<View, C7676a> f5381e = new WeakHashMap();

        public C1750a(C1749w c1749w) {
            this.f5380d = c1749w;
        }

        @Override // p201g.p227h.p238l.C7676a
        /* renamed from: a */
        public boolean mo17864a(View view, AccessibilityEvent accessibilityEvent) {
            C7676a c7676a = this.f5381e.get(view);
            if (c7676a != null) {
                return c7676a.mo17864a(view, accessibilityEvent);
            }
            return super.mo17864a(view, accessibilityEvent);
        }

        @Override // p201g.p227h.p238l.C7676a
        /* renamed from: b */
        public C7720d mo17398b(View view) {
            C7676a c7676a = this.f5381e.get(view);
            if (c7676a != null) {
                return c7676a.mo17398b(view);
            }
            return super.mo17398b(view);
        }

        @Override // p201g.p227h.p238l.C7676a
        /* renamed from: f */
        public void mo17397f(View view, AccessibilityEvent accessibilityEvent) {
            C7676a c7676a = this.f5381e.get(view);
            if (c7676a != null) {
                c7676a.mo17397f(view, accessibilityEvent);
            } else {
                super.mo17397f(view, accessibilityEvent);
            }
        }

        @Override // p201g.p227h.p238l.C7676a
        /* renamed from: g */
        public void mo17396g(View view, C7716c c7716c) {
            if (!this.f5380d.m34592o() && this.f5380d.f5378d.getLayoutManager() != null) {
                this.f5380d.f5378d.getLayoutManager().m35137V0(view, c7716c);
                C7676a c7676a = this.f5381e.get(view);
                if (c7676a != null) {
                    c7676a.mo17396g(view, c7716c);
                    return;
                } else {
                    super.mo17396g(view, c7716c);
                    return;
                }
            }
            super.mo17396g(view, c7716c);
        }

        @Override // p201g.p227h.p238l.C7676a
        /* renamed from: h */
        public void mo17860h(View view, AccessibilityEvent accessibilityEvent) {
            C7676a c7676a = this.f5381e.get(view);
            if (c7676a != null) {
                c7676a.mo17860h(view, accessibilityEvent);
            } else {
                super.mo17860h(view, accessibilityEvent);
            }
        }

        @Override // p201g.p227h.p238l.C7676a
        /* renamed from: i */
        public boolean mo17859i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C7676a c7676a = this.f5381e.get(viewGroup);
            if (c7676a != null) {
                return c7676a.mo17859i(viewGroup, view, accessibilityEvent);
            }
            return super.mo17859i(viewGroup, view, accessibilityEvent);
        }

        @Override // p201g.p227h.p238l.C7676a
        /* renamed from: j */
        public boolean mo17858j(View view, int i, Bundle bundle) {
            if (!this.f5380d.m34592o() && this.f5380d.f5378d.getLayoutManager() != null) {
                C7676a c7676a = this.f5381e.get(view);
                if (c7676a != null) {
                    if (c7676a.mo17858j(view, i, bundle)) {
                        return true;
                    }
                } else if (super.mo17858j(view, i, bundle)) {
                    return true;
                }
                return this.f5380d.f5378d.getLayoutManager().m35104p1(view, i, bundle);
            }
            return super.mo17858j(view, i, bundle);
        }

        @Override // p201g.p227h.p238l.C7676a
        /* renamed from: l */
        public void mo17856l(View view, int i) {
            C7676a c7676a = this.f5381e.get(view);
            if (c7676a != null) {
                c7676a.mo17856l(view, i);
            } else {
                super.mo17856l(view, i);
            }
        }

        @Override // p201g.p227h.p238l.C7676a
        /* renamed from: m */
        public void mo17855m(View view, AccessibilityEvent accessibilityEvent) {
            C7676a c7676a = this.f5381e.get(view);
            if (c7676a != null) {
                c7676a.mo17855m(view, accessibilityEvent);
            } else {
                super.mo17855m(view, accessibilityEvent);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: n */
        public C7676a m34591n(View view) {
            return this.f5381e.remove(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o */
        public void m34590o(View view) {
            C7676a m17507l = C7759x.m17507l(view);
            if (m17507l == null || m17507l == this) {
                return;
            }
            this.f5381e.put(view, m17507l);
        }
    }

    public C1749w(RecyclerView recyclerView) {
        this.f5378d = recyclerView;
        C7676a m34593n = m34593n();
        if (m34593n != null && (m34593n instanceof C1750a)) {
            this.f5379e = (C1750a) m34593n;
        } else {
            this.f5379e = new C1750a(this);
        }
    }

    @Override // p201g.p227h.p238l.C7676a
    /* renamed from: f */
    public void mo17397f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo17397f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || m34592o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo34995R0(accessibilityEvent);
        }
    }

    @Override // p201g.p227h.p238l.C7676a
    /* renamed from: g */
    public void mo17396g(View view, C7716c c7716c) {
        super.mo17396g(view, c7716c);
        if (m34592o() || this.f5378d.getLayoutManager() == null) {
            return;
        }
        this.f5378d.getLayoutManager().m35141T0(c7716c);
    }

    @Override // p201g.p227h.p238l.C7676a
    /* renamed from: j */
    public boolean mo17858j(View view, int i, Bundle bundle) {
        if (super.mo17858j(view, i, bundle)) {
            return true;
        }
        if (m34592o() || this.f5378d.getLayoutManager() == null) {
            return false;
        }
        return this.f5378d.getLayoutManager().m35109n1(i, bundle);
    }

    /* renamed from: n */
    public C7676a m34593n() {
        return this.f5379e;
    }

    /* renamed from: o */
    boolean m34592o() {
        return this.f5378d.m35269p0();
    }
}
