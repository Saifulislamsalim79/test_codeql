package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.C0999g;
import androidx.appcompat.widget.C1138r0;
/* loaded from: classes2.dex */
public final class ExpandedMenuView extends ListView implements C0999g.InterfaceC1001b, InterfaceC1016n, AdapterView.OnItemClickListener {

    /* renamed from: e */
    private static final int[] f2756e = {16842964, 16843049};

    /* renamed from: c */
    private C0999g f2757c;

    /* renamed from: d */
    private int f2758d;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    @Override // androidx.appcompat.view.menu.C0999g.InterfaceC1001b
    /* renamed from: a */
    public boolean mo37396a(C1003i c1003i) {
        return this.f2757c.m37547N(c1003i, 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1016n
    /* renamed from: b */
    public void mo26852b(C0999g c0999g) {
        this.f2757c = c0999g;
    }

    public int getWindowAnimations() {
        return this.f2758d;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo37396a((C1003i) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C1138r0 m37026v = C1138r0.m37026v(context, attributeSet, f2756e, i, 0);
        if (m37026v.m37029s(0)) {
            setBackgroundDrawable(m37026v.m37041g(0));
        }
        if (m37026v.m37029s(1)) {
            setDivider(m37026v.m37041g(1));
        }
        m37026v.m37025w();
    }
}
