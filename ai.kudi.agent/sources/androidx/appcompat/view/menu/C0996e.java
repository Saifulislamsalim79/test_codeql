package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.InterfaceC1014m;
import androidx.appcompat.view.menu.InterfaceC1016n;
import java.util.ArrayList;
import p201g.p202a.C7458g;
/* compiled from: ListMenuPresenter.java */
/* renamed from: androidx.appcompat.view.menu.e */
/* loaded from: classes2.dex */
public class C0996e implements InterfaceC1014m, AdapterView.OnItemClickListener {

    /* renamed from: A */
    C0997a f2844A;

    /* renamed from: B */
    private int f2845B;

    /* renamed from: c */
    Context f2846c;

    /* renamed from: d */
    LayoutInflater f2847d;

    /* renamed from: e */
    C0999g f2848e;

    /* renamed from: f */
    ExpandedMenuView f2849f;

    /* renamed from: w */
    int f2850w;

    /* renamed from: x */
    int f2851x;

    /* renamed from: y */
    int f2852y;

    /* renamed from: z */
    private InterfaceC1014m.InterfaceC1015a f2853z;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListMenuPresenter.java */
    /* renamed from: androidx.appcompat.view.menu.e$a */
    /* loaded from: classes2.dex */
    public class C0997a extends BaseAdapter {

        /* renamed from: c */
        private int f2854c = -1;

        public C0997a() {
            m37561a();
        }

        /* renamed from: a */
        void m37561a() {
            C1003i m37509x = C0996e.this.f2848e.m37509x();
            if (m37509x != null) {
                ArrayList<C1003i> m37554B = C0996e.this.f2848e.m37554B();
                int size = m37554B.size();
                for (int i = 0; i < size; i++) {
                    if (m37554B.get(i) == m37509x) {
                        this.f2854c = i;
                        return;
                    }
                }
            }
            this.f2854c = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b */
        public C1003i getItem(int i) {
            ArrayList<C1003i> m37554B = C0996e.this.f2848e.m37554B();
            int i2 = i + C0996e.this.f2850w;
            int i3 = this.f2854c;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return m37554B.get(i2);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = C0996e.this.f2848e.m37554B().size() - C0996e.this.f2850w;
            return this.f2854c < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0996e c0996e = C0996e.this;
                view = c0996e.f2847d.inflate(c0996e.f2852y, viewGroup, false);
            }
            ((InterfaceC1016n.InterfaceC1017a) view).mo26853e(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            m37561a();
            super.notifyDataSetChanged();
        }
    }

    public C0996e(Context context, int i) {
        this(i, 0);
        this.f2846c = context;
        this.f2847d = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: a */
    public void mo26766a(C0999g c0999g, boolean z) {
        InterfaceC1014m.InterfaceC1015a interfaceC1015a = this.f2853z;
        if (interfaceC1015a != null) {
            interfaceC1015a.mo37237a(c0999g, z);
        }
    }

    /* renamed from: b */
    public ListAdapter m37565b() {
        if (this.f2844A == null) {
            this.f2844A = new C0997a();
        }
        return this.f2844A;
    }

    /* renamed from: c */
    public InterfaceC1016n m37564c(ViewGroup viewGroup) {
        if (this.f2849f == null) {
            this.f2849f = (ExpandedMenuView) this.f2847d.inflate(C7458g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f2844A == null) {
                this.f2844A = new C0997a();
            }
            this.f2849f.setAdapter((ListAdapter) this.f2844A);
            this.f2849f.setOnItemClickListener(this);
        }
        return this.f2849f;
    }

    /* renamed from: d */
    public void m37563d(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f2849f.restoreHierarchyState(sparseParcelableArray);
        }
    }

    /* renamed from: e */
    public void m37562e(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f2849f;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: h */
    public int mo26759h() {
        return this.f2845B;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: i */
    public void mo26758i(boolean z) {
        C0997a c0997a = this.f2844A;
        if (c0997a != null) {
            c0997a.notifyDataSetChanged();
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
        this.f2853z = interfaceC1015a;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: n */
    public void mo26753n(Context context, C0999g c0999g) {
        if (this.f2851x != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f2851x);
            this.f2846c = contextThemeWrapper;
            this.f2847d = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f2846c != null) {
            this.f2846c = context;
            if (this.f2847d == null) {
                this.f2847d = LayoutInflater.from(context);
            }
        }
        this.f2848e = c0999g;
        C0997a c0997a = this.f2844A;
        if (c0997a != null) {
            c0997a.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: o */
    public void mo26752o(Parcelable parcelable) {
        m37563d((Bundle) parcelable);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f2848e.m37546O(this.f2844A.getItem(i), this, 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: q */
    public boolean mo26750q(SubMenuC1023r subMenuC1023r) {
        if (subMenuC1023r.hasVisibleItems()) {
            new DialogInterface$OnKeyListenerC1002h(subMenuC1023r).m37505d(null);
            InterfaceC1014m.InterfaceC1015a interfaceC1015a = this.f2853z;
            if (interfaceC1015a != null) {
                interfaceC1015a.mo37236b(subMenuC1023r);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: r */
    public Parcelable mo26749r() {
        if (this.f2849f == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        m37562e(bundle);
        return bundle;
    }

    public C0996e(int i, int i2) {
        this.f2852y = i;
        this.f2851x = i2;
    }
}
