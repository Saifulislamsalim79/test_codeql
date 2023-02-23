package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MenuPopup.java */
/* renamed from: androidx.appcompat.view.menu.k */
/* loaded from: classes2.dex */
public abstract class AbstractC1011k implements InterfaceC1019p, InterfaceC1014m, AdapterView.OnItemClickListener {

    /* renamed from: c */
    private Rect f2935c;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A */
    public static boolean m37476A(C0999g c0999g) {
        int size = c0999g.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c0999g.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B */
    public static C0998f m37475B(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (C0998f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (C0998f) listAdapter;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public static int m37472g(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: d */
    public abstract void mo37456d(C0999g c0999g);

    /* renamed from: e */
    protected boolean mo37474e() {
        return true;
    }

    /* renamed from: f */
    public Rect m37473f() {
        return this.f2935c;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1014m
    /* renamed from: h */
    public int mo26759h() {
        return 0;
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
    /* renamed from: n */
    public void mo26753n(Context context, C0999g c0999g) {
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m37475B(listAdapter).f2856c.m37546O((MenuItem) listAdapter.getItem(i), this, mo37474e() ? 0 : 4);
    }

    /* renamed from: s */
    public abstract void mo37455s(View view);

    /* renamed from: t */
    public void m37471t(Rect rect) {
        this.f2935c = rect;
    }

    /* renamed from: u */
    public abstract void mo37454u(boolean z);

    /* renamed from: v */
    public abstract void mo37453v(int i);

    /* renamed from: w */
    public abstract void mo37452w(int i);

    /* renamed from: x */
    public abstract void mo37451x(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: y */
    public abstract void mo37450y(boolean z);

    /* renamed from: z */
    public abstract void mo37449z(int i);
}
