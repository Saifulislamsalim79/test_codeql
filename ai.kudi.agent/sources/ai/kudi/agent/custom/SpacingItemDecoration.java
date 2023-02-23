package ai.kudi.agent.custom;

import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: SpacingItemDecoration.kt */
@Metadata(m10422d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\r\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/custom/SpacingItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "context", "Landroid/content/Context;", "itemOffsetId", "", "(Landroid/content/Context;I)V", "mItemOffset", "(I)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", SendReceiptToTerminalConfirmationBottomSheet.STATE, "Landroidx/recyclerview/widget/RecyclerView$State;", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SpacingItemDecoration extends RecyclerView.AbstractC1634o {
    private final int mItemOffset;

    public SpacingItemDecoration(int i) {
        this.mItemOffset = i;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SpacingItemDecoration(android.content.Context r3, int r4) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            kotlin.p483e0.p485d.Log_OC.getArray(r3, r0)
            android.content.res.Resources r1 = r3.getResources()
            int r4 = r1.getDimensionPixelSize(r4)
            r2.<init>(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.custom.SpacingItemDecoration.<init>(android.content.Context, int):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1634o
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1614b0 c1614b0) {
        Log_OC.getArray(rect, "outRect");
        Log_OC.getArray(view, "view");
        Log_OC.getArray(recyclerView, "parent");
        Log_OC.getArray(c1614b0, SendReceiptToTerminalConfirmationBottomSheet.STATE);
        super.getItemOffsets(rect, view, recyclerView, c1614b0);
        int $i0 = this.mItemOffset;
        rect.set($i0, $i0, $i0, $i0);
    }
}
