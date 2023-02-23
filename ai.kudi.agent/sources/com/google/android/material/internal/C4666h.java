package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0999g;
import androidx.appcompat.view.menu.C1003i;
import androidx.appcompat.view.menu.InterfaceC1014m;
import androidx.appcompat.view.menu.InterfaceC1016n;
import androidx.appcompat.view.menu.SubMenuC1023r;
import androidx.recyclerview.widget.C1749w;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p201g.p227h.p238l.C7698g0;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.p239h0.C7716c;
import p272h.p286c.p287a.p323c.C9267d;
import p272h.p286c.p287a.p323c.C9273h;
/* compiled from: NavigationMenuPresenter.java */
/* renamed from: com.google.android.material.internal.h */
/* loaded from: classes2.dex */
public class C4666h implements InterfaceC1014m {

    /* renamed from: A */
    boolean f11710A;

    /* renamed from: B */
    ColorStateList f11711B;

    /* renamed from: C */
    ColorStateList f11712C;

    /* renamed from: D */
    Drawable f11713D;

    /* renamed from: E */
    int f11714E;

    /* renamed from: F */
    int f11715F;

    /* renamed from: G */
    int f11716G;

    /* renamed from: H */
    boolean f11717H;

    /* renamed from: J */
    private int f11719J;

    /* renamed from: K */
    private int f11720K;

    /* renamed from: L */
    int f11721L;

    /* renamed from: c */
    private NavigationMenuView f11724c;

    /* renamed from: d */
    LinearLayout f11725d;

    /* renamed from: e */
    private InterfaceC1014m.InterfaceC1015a f11726e;

    /* renamed from: f */
    C0999g f11727f;

    /* renamed from: w */
    private int f11728w;

    /* renamed from: x */
    C4669c f11729x;

    /* renamed from: y */
    LayoutInflater f11730y;

    /* renamed from: z */
    int f11731z;

    /* renamed from: I */
    boolean f11718I = true;

    /* renamed from: M */
    private int f11722M = -1;

    /* renamed from: N */
    final View.OnClickListener f11723N = new View$OnClickListenerC4667a();

    /* compiled from: NavigationMenuPresenter.java */
    /* renamed from: com.google.android.material.internal.h$a */
    /* loaded from: classes2.dex */
    class View$OnClickListenerC4667a implements View.OnClickListener {
        View$OnClickListenerC4667a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z = true;
            C4666h.this.m26768K(true);
            C1003i itemData = ((NavigationMenuItemView) view).getItemData();
            C4666h c4666h = C4666h.this;
            boolean m37546O = c4666h.f11727f.m37546O(itemData, c4666h, 0);
            if (itemData != null && itemData.isCheckable() && m37546O) {
                C4666h.this.f11729x.m26731j(itemData);
            } else {
                z = false;
            }
            C4666h.this.m26768K(false);
            if (z) {
                C4666h.this.mo26758i(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NavigationMenuPresenter.java */
    /* renamed from: com.google.android.material.internal.h$b */
    /* loaded from: classes2.dex */
    public static class C4668b extends AbstractC4678l {
        public C4668b(View view) {
            super(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NavigationMenuPresenter.java */
    /* renamed from: com.google.android.material.internal.h$c */
    /* loaded from: classes2.dex */
    public class C4669c extends RecyclerView.AbstractC1623h<AbstractC4678l> {

        /* renamed from: a */
        private final ArrayList<InterfaceC4671e> f11733a = new ArrayList<>();

        /* renamed from: b */
        private C1003i f11734b;

        /* renamed from: c */
        private boolean f11735c;

        C4669c() {
            m26733h();
        }

        /* renamed from: a */
        private void m26740a(int i, int i2) {
            while (i < i2) {
                ((C4673g) this.f11733a.get(i)).f11740b = true;
                i++;
            }
        }

        /* renamed from: h */
        private void m26733h() {
            if (this.f11735c) {
                return;
            }
            this.f11735c = true;
            this.f11733a.clear();
            this.f11733a.add(new C4670d());
            int i = -1;
            int size = C4666h.this.f11727f.m37550G().size();
            boolean z = false;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C1003i c1003i = C4666h.this.f11727f.m37550G().get(i3);
                if (c1003i.isChecked()) {
                    m26731j(c1003i);
                }
                if (c1003i.isCheckable()) {
                    c1003i.m37485t(false);
                }
                if (c1003i.hasSubMenu()) {
                    SubMenu subMenu = c1003i.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i3 != 0) {
                            this.f11733a.add(new C4672f(C4666h.this.f11721L, 0));
                        }
                        this.f11733a.add(new C4673g(c1003i));
                        int size2 = this.f11733a.size();
                        int size3 = subMenu.size();
                        boolean z2 = false;
                        for (int i4 = 0; i4 < size3; i4++) {
                            C1003i c1003i2 = (C1003i) subMenu.getItem(i4);
                            if (c1003i2.isVisible()) {
                                if (!z2 && c1003i2.getIcon() != null) {
                                    z2 = true;
                                }
                                if (c1003i2.isCheckable()) {
                                    c1003i2.m37485t(false);
                                }
                                if (c1003i.isChecked()) {
                                    m26731j(c1003i);
                                }
                                this.f11733a.add(new C4673g(c1003i2));
                            }
                        }
                        if (z2) {
                            m26740a(size2, this.f11733a.size());
                        }
                    }
                } else {
                    int groupId = c1003i.getGroupId();
                    if (groupId != i) {
                        i2 = this.f11733a.size();
                        z = c1003i.getIcon() != null;
                        if (i3 != 0) {
                            i2++;
                            ArrayList<InterfaceC4671e> arrayList = this.f11733a;
                            int i5 = C4666h.this.f11721L;
                            arrayList.add(new C4672f(i5, i5));
                        }
                    } else if (!z && c1003i.getIcon() != null) {
                        m26740a(i2, this.f11733a.size());
                        z = true;
                    }
                    C4673g c4673g = new C4673g(c1003i);
                    c4673g.f11740b = z;
                    this.f11733a.add(c4673g);
                    i = groupId;
                }
            }
            this.f11735c = false;
        }

        /* renamed from: b */
        public Bundle m26739b() {
            Bundle bundle = new Bundle();
            C1003i c1003i = this.f11734b;
            if (c1003i != null) {
                bundle.putInt("android:menu:checked", c1003i.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.f11733a.size();
            for (int i = 0; i < size; i++) {
                InterfaceC4671e interfaceC4671e = this.f11733a.get(i);
                if (interfaceC4671e instanceof C4673g) {
                    C1003i m26726a = ((C4673g) interfaceC4671e).m26726a();
                    View actionView = m26726a != null ? m26726a.getActionView() : null;
                    if (actionView != null) {
                        C4680j c4680j = new C4680j();
                        actionView.saveHierarchyState(c4680j);
                        sparseArray.put(m26726a.getItemId(), c4680j);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        /* renamed from: c */
        public C1003i m26738c() {
            return this.f11734b;
        }

        /* renamed from: d */
        int m26737d() {
            int i = C4666h.this.f11725d.getChildCount() == 0 ? 0 : 1;
            for (int i2 = 0; i2 < C4666h.this.f11729x.getItemCount(); i2++) {
                if (C4666h.this.f11729x.getItemViewType(i2) == 0) {
                    i++;
                }
            }
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
        /* renamed from: e */
        public void onBindViewHolder(AbstractC4678l abstractC4678l, int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    ((TextView) abstractC4678l.itemView).setText(((C4673g) this.f11733a.get(i)).m26726a().getTitle());
                    return;
                } else if (itemViewType != 2) {
                    return;
                } else {
                    C4672f c4672f = (C4672f) this.f11733a.get(i);
                    abstractC4678l.itemView.setPadding(0, c4672f.m26727b(), 0, c4672f.m26728a());
                    return;
                }
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) abstractC4678l.itemView;
            navigationMenuItemView.setIconTintList(C4666h.this.f11712C);
            C4666h c4666h = C4666h.this;
            if (c4666h.f11710A) {
                navigationMenuItemView.setTextAppearance(c4666h.f11731z);
            }
            ColorStateList colorStateList = C4666h.this.f11711B;
            if (colorStateList != null) {
                navigationMenuItemView.setTextColor(colorStateList);
            }
            Drawable drawable = C4666h.this.f11713D;
            C7759x.m17492s0(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
            C4673g c4673g = (C4673g) this.f11733a.get(i);
            navigationMenuItemView.setNeedsEmptyIcon(c4673g.f11740b);
            navigationMenuItemView.setHorizontalPadding(C4666h.this.f11714E);
            navigationMenuItemView.setIconPadding(C4666h.this.f11715F);
            C4666h c4666h2 = C4666h.this;
            if (c4666h2.f11717H) {
                navigationMenuItemView.setIconSize(c4666h2.f11716G);
            }
            navigationMenuItemView.setMaxLines(C4666h.this.f11719J);
            navigationMenuItemView.mo26853e(c4673g.m26726a(), 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
        /* renamed from: f */
        public AbstractC4678l onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 0) {
                C4666h c4666h = C4666h.this;
                return new C4675i(c4666h.f11730y, viewGroup, c4666h.f11723N);
            } else if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return new C4668b(C4666h.this.f11725d);
                }
                return new C4676j(C4666h.this.f11730y, viewGroup);
            } else {
                return new C4677k(C4666h.this.f11730y, viewGroup);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
        /* renamed from: g */
        public void onViewRecycled(AbstractC4678l abstractC4678l) {
            if (abstractC4678l instanceof C4675i) {
                ((NavigationMenuItemView) abstractC4678l.itemView).m26856D();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
        public int getItemCount() {
            return this.f11733a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
        public long getItemId(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
        public int getItemViewType(int i) {
            InterfaceC4671e interfaceC4671e = this.f11733a.get(i);
            if (interfaceC4671e instanceof C4672f) {
                return 2;
            }
            if (interfaceC4671e instanceof C4670d) {
                return 3;
            }
            if (interfaceC4671e instanceof C4673g) {
                return ((C4673g) interfaceC4671e).m26726a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        /* renamed from: i */
        public void m26732i(Bundle bundle) {
            C1003i m26726a;
            View actionView;
            C4680j c4680j;
            C1003i m26726a2;
            int i = bundle.getInt("android:menu:checked", 0);
            if (i != 0) {
                this.f11735c = true;
                int size = this.f11733a.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    InterfaceC4671e interfaceC4671e = this.f11733a.get(i2);
                    if ((interfaceC4671e instanceof C4673g) && (m26726a2 = ((C4673g) interfaceC4671e).m26726a()) != null && m26726a2.getItemId() == i) {
                        m26731j(m26726a2);
                        break;
                    }
                    i2++;
                }
                this.f11735c = false;
                m26733h();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.f11733a.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    InterfaceC4671e interfaceC4671e2 = this.f11733a.get(i3);
                    if ((interfaceC4671e2 instanceof C4673g) && (m26726a = ((C4673g) interfaceC4671e2).m26726a()) != null && (actionView = m26726a.getActionView()) != null && (c4680j = (C4680j) sparseParcelableArray.get(m26726a.getItemId())) != null) {
                        actionView.restoreHierarchyState(c4680j);
                    }
                }
            }
        }

        /* renamed from: j */
        public void m26731j(C1003i c1003i) {
            if (this.f11734b == c1003i || !c1003i.isCheckable()) {
                return;
            }
            C1003i c1003i2 = this.f11734b;
            if (c1003i2 != null) {
                c1003i2.setChecked(false);
            }
            this.f11734b = c1003i;
            c1003i.setChecked(true);
        }

        /* renamed from: k */
        public void m26730k(boolean z) {
            this.f11735c = z;
        }

        /* renamed from: l */
        public void m26729l() {
            m26733h();
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NavigationMenuPresenter.java */
    /* renamed from: com.google.android.material.internal.h$d */
    /* loaded from: classes2.dex */
    public static class C4670d implements InterfaceC4671e {
        C4670d() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NavigationMenuPresenter.java */
    /* renamed from: com.google.android.material.internal.h$e */
    /* loaded from: classes2.dex */
    public interface InterfaceC4671e {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NavigationMenuPresenter.java */
    /* renamed from: com.google.android.material.internal.h$f */
    /* loaded from: classes2.dex */
    public static class C4672f implements InterfaceC4671e {

        /* renamed from: a */
        private final int f11737a;

        /* renamed from: b */
        private final int f11738b;

        public C4672f(int i, int i2) {
            this.f11737a = i;
            this.f11738b = i2;
        }

        /* renamed from: a */
        public int m26728a() {
            return this.f11738b;
        }

        /* renamed from: b */
        public int m26727b() {
            return this.f11737a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NavigationMenuPresenter.java */
    /* renamed from: com.google.android.material.internal.h$g */
    /* loaded from: classes2.dex */
    public static class C4673g implements InterfaceC4671e {

        /* renamed from: a */
        private final C1003i f11739a;

        /* renamed from: b */
        boolean f11740b;

        C4673g(C1003i c1003i) {
            this.f11739a = c1003i;
        }

        /* renamed from: a */
        public C1003i m26726a() {
            return this.f11739a;
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* renamed from: com.google.android.material.internal.h$h */
    /* loaded from: classes2.dex */
    private class C4674h extends C1749w {
        C4674h(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.C1749w, p201g.p227h.p238l.C7676a
        /* renamed from: g */
        public void mo17396g(View view, C7716c c7716c) {
            super.mo17396g(view, c7716c);
            c7716c.m17689c0(C7716c.C7718b.m17638a(C4666h.this.f11729x.m26737d(), 0, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NavigationMenuPresenter.java */
    /* renamed from: com.google.android.material.internal.h$i */
    /* loaded from: classes2.dex */
    public static class C4675i extends AbstractC4678l {
        public C4675i(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(C9273h.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NavigationMenuPresenter.java */
    /* renamed from: com.google.android.material.internal.h$j */
    /* loaded from: classes2.dex */
    public static class C4676j extends AbstractC4678l {
        public C4676j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C9273h.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NavigationMenuPresenter.java */
    /* renamed from: com.google.android.material.internal.h$k */
    /* loaded from: classes2.dex */
    public static class C4677k extends AbstractC4678l {
        public C4677k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C9273h.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* renamed from: com.google.android.material.internal.h$l */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC4678l extends RecyclerView.AbstractC1620e0 {
        public AbstractC4678l(View view) {
            super(view);
        }
    }

    /* renamed from: L */
    private void m26767L() {
        int i = (this.f11725d.getChildCount() == 0 && this.f11718I) ? this.f11720K : 0;
        NavigationMenuView navigationMenuView = this.f11724c;
        navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
    }

    /* renamed from: A */
    public void m26778A(int i) {
        this.f11728w = i;
    }

    /* renamed from: B */
    public void m26777B(Drawable drawable) {
        this.f11713D = drawable;
        mo26758i(false);
    }

    /* renamed from: C */
    public void m26776C(int i) {
        this.f11714E = i;
        mo26758i(false);
    }

    /* renamed from: D */
    public void m26775D(int i) {
        this.f11715F = i;
        mo26758i(false);
    }

    /* renamed from: E */
    public void m26774E(int i) {
        if (this.f11716G != i) {
            this.f11716G = i;
            this.f11717H = true;
            mo26758i(false);
        }
    }

    /* renamed from: F */
    public void m26773F(ColorStateList colorStateList) {
        this.f11712C = colorStateList;
        mo26758i(false);
    }

    /* renamed from: G */
    public void m26772G(int i) {
        this.f11719J = i;
        mo26758i(false);
    }

    /* renamed from: H */
    public void m26771H(int i) {
        this.f11731z = i;
        this.f11710A = true;
        mo26758i(false);
    }

    /* renamed from: I */
    public void m26770I(ColorStateList colorStateList) {
        this.f11711B = colorStateList;
        mo26758i(false);
    }

    /* renamed from: J */
    public void m26769J(int i) {
        this.f11722M = i;
        NavigationMenuView navigationMenuView = this.f11724c;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i);
        }
    }

    /* renamed from: K */
    public void m26768K(boolean z) {
        C4669c c4669c = this.f11729x;
        if (c4669c != null) {
            c4669c.m26730k(z);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: a */
    public void mo26766a(C0999g c0999g, boolean z) {
        InterfaceC1014m.InterfaceC1015a interfaceC1015a = this.f11726e;
        if (interfaceC1015a != null) {
            interfaceC1015a.mo37237a(c0999g, z);
        }
    }

    /* renamed from: c */
    public void m26764c(View view) {
        this.f11725d.addView(view);
        NavigationMenuView navigationMenuView = this.f11724c;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    /* renamed from: d */
    public void m26763d(C7698g0 c7698g0) {
        int m17782l = c7698g0.m17782l();
        if (this.f11720K != m17782l) {
            this.f11720K = m17782l;
            m26767L();
        }
        NavigationMenuView navigationMenuView = this.f11724c;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, c7698g0.m17785i());
        C7759x.m17515h(this.f11725d, c7698g0);
    }

    /* renamed from: e */
    public C1003i m26762e() {
        return this.f11729x.m26738c();
    }

    /* renamed from: f */
    public int m26761f() {
        return this.f11725d.getChildCount();
    }

    /* renamed from: g */
    public Drawable m26760g() {
        return this.f11713D;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: h */
    public int mo26759h() {
        return this.f11728w;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: i */
    public void mo26758i(boolean z) {
        C4669c c4669c = this.f11729x;
        if (c4669c != null) {
            c4669c.m26729l();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: j */
    public boolean mo26757j() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: k */
    public boolean mo26756k(C0999g c0999g, C1003i c1003i) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: l */
    public boolean mo26755l(C0999g c0999g, C1003i c1003i) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: m */
    public void mo26754m(InterfaceC1014m.InterfaceC1015a interfaceC1015a) {
        this.f11726e = interfaceC1015a;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: n */
    public void mo26753n(Context context, C0999g c0999g) {
        this.f11730y = LayoutInflater.from(context);
        this.f11727f = c0999g;
        this.f11721L = context.getResources().getDimensionPixelOffset(C9267d.design_navigation_separator_vertical_padding);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: o */
    public void mo26752o(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f11724c.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f11729x.m26732i(bundle2);
            }
            SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.f11725d.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    /* renamed from: p */
    public int m26751p() {
        return this.f11714E;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: q */
    public boolean mo26750q(SubMenuC1023r subMenuC1023r) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: r */
    public Parcelable mo26749r() {
        Bundle bundle = new Bundle();
        if (this.f11724c != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f11724c.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        C4669c c4669c = this.f11729x;
        if (c4669c != null) {
            bundle.putBundle("android:menu:adapter", c4669c.m26739b());
        }
        if (this.f11725d != null) {
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            this.f11725d.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    /* renamed from: s */
    public int m26748s() {
        return this.f11715F;
    }

    /* renamed from: t */
    public int m26747t() {
        return this.f11719J;
    }

    /* renamed from: u */
    public ColorStateList m26746u() {
        return this.f11711B;
    }

    /* renamed from: v */
    public ColorStateList m26745v() {
        return this.f11712C;
    }

    /* renamed from: w */
    public InterfaceC1016n m26744w(ViewGroup viewGroup) {
        if (this.f11724c == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.f11730y.inflate(C9273h.design_navigation_menu, viewGroup, false);
            this.f11724c = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new C4674h(this.f11724c));
            if (this.f11729x == null) {
                this.f11729x = new C4669c();
            }
            int i = this.f11722M;
            if (i != -1) {
                this.f11724c.setOverScrollMode(i);
            }
            this.f11725d = (LinearLayout) this.f11730y.inflate(C9273h.design_navigation_item_header, (ViewGroup) this.f11724c, false);
            this.f11724c.setAdapter(this.f11729x);
        }
        return this.f11724c;
    }

    /* renamed from: x */
    public View m26743x(int i) {
        View inflate = this.f11730y.inflate(i, (ViewGroup) this.f11725d, false);
        m26764c(inflate);
        return inflate;
    }

    /* renamed from: y */
    public void m26742y(boolean z) {
        if (this.f11718I != z) {
            this.f11718I = z;
            m26767L();
        }
    }

    /* renamed from: z */
    public void m26741z(C1003i c1003i) {
        this.f11729x.m26731j(c1003i);
    }
}
