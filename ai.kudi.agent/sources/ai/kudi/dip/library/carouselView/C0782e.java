package ai.kudi.dip.library.carouselView;

import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.e0.d.l;
/* compiled from: ItemDecoration.kt */
/* renamed from: ai.kudi.dip.library.carouselView.e */
/* loaded from: classes2.dex */
public final class C0782e extends RecyclerView.AbstractC1634o {

    /* renamed from: a */
    private final int f2223a;

    /* renamed from: b */
    private final int f2224b;

    public C0782e(int i, int i2) {
        this.f2223a = i;
        this.f2224b = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1634o
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1614b0 c1614b0) {
        l.f(rect, "outRect");
        l.f(view, "view");
        l.f(recyclerView, "parent");
        l.f(c1614b0, SendReceiptToTerminalConfirmationBottomSheet.STATE);
        super.getItemOffsets(rect, view, recyclerView, c1614b0);
        rect.right = this.f2223a > 0 ? this.f2224b / 2 : this.f2224b;
        rect.left = this.f2223a > 0 ? this.f2224b / 2 : 0;
        if (c1614b0.m35217b() - 1 == recyclerView.m35299f0(view)) {
            rect.right = this.f2223a > 0 ? (recyclerView.getMeasuredWidth() / 2) - (this.f2223a / 2) : 0;
        }
        if (recyclerView.m35299f0(view) == 0) {
            rect.left = this.f2223a > 0 ? (recyclerView.getMeasuredWidth() / 2) - (this.f2223a / 2) : 0;
        }
    }
}
