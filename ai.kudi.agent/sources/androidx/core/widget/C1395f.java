package androidx.core.widget;

import android.widget.ListView;
/* compiled from: ListViewAutoScrollHelper.java */
/* renamed from: androidx.core.widget.f */
/* loaded from: classes2.dex */
public class C1395f extends AbstractView$OnTouchListenerC1388a {

    /* renamed from: K */
    private final ListView f4287K;

    public C1395f(ListView listView) {
        super(listView);
        this.f4287K = listView;
    }

    @Override // androidx.core.widget.AbstractView$OnTouchListenerC1388a
    /* renamed from: a */
    public boolean mo36113a(int i) {
        return false;
    }

    @Override // androidx.core.widget.AbstractView$OnTouchListenerC1388a
    /* renamed from: b */
    public boolean mo36112b(int i) {
        ListView listView = this.f4287K;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else if (i >= 0) {
            return false;
        } else {
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.widget.AbstractView$OnTouchListenerC1388a
    /* renamed from: j */
    public void mo36111j(int i, int i2) {
        C1396g.m36109b(this.f4287K, i2);
    }
}
