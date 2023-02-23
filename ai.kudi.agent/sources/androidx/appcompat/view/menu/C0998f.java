package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.InterfaceC1016n;
import java.util.ArrayList;
/* compiled from: MenuAdapter.java */
/* renamed from: androidx.appcompat.view.menu.f */
/* loaded from: classes2.dex */
public class C0998f extends BaseAdapter {

    /* renamed from: c */
    C0999g f2856c;

    /* renamed from: d */
    private int f2857d = -1;

    /* renamed from: e */
    private boolean f2858e;

    /* renamed from: f */
    private final boolean f2859f;

    /* renamed from: w */
    private final LayoutInflater f2860w;

    /* renamed from: x */
    private final int f2861x;

    public C0998f(C0999g c0999g, LayoutInflater layoutInflater, boolean z, int i) {
        this.f2859f = z;
        this.f2860w = layoutInflater;
        this.f2856c = c0999g;
        this.f2861x = i;
        m37559a();
    }

    /* renamed from: a */
    void m37559a() {
        C1003i m37509x = this.f2856c.m37509x();
        if (m37509x != null) {
            ArrayList<C1003i> m37554B = this.f2856c.m37554B();
            int size = m37554B.size();
            for (int i = 0; i < size; i++) {
                if (m37554B.get(i) == m37509x) {
                    this.f2857d = i;
                    return;
                }
            }
        }
        this.f2857d = -1;
    }

    /* renamed from: b */
    public C0999g m37558b() {
        return this.f2856c;
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public C1003i getItem(int i) {
        ArrayList<C1003i> m37554B = this.f2859f ? this.f2856c.m37554B() : this.f2856c.m37550G();
        int i2 = this.f2857d;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return m37554B.get(i);
    }

    /* renamed from: d */
    public void m37556d(boolean z) {
        this.f2858e = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<C1003i> m37554B = this.f2859f ? this.f2856c.m37554B() : this.f2856c.m37550G();
        if (this.f2857d < 0) {
            return m37554B.size();
        }
        return m37554B.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f2860w.inflate(this.f2861x, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f2856c.mo37447H() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        InterfaceC1016n.InterfaceC1017a interfaceC1017a = (InterfaceC1016n.InterfaceC1017a) view;
        if (this.f2858e) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC1017a.mo26853e(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        m37559a();
        super.notifyDataSetChanged();
    }
}
