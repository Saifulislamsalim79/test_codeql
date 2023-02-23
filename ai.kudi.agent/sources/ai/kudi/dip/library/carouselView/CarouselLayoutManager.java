package ai.kudi.dip.library.carouselView;

import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.e0.d.l;
import kotlin.p491i0.C11841h;
/* compiled from: CarouselLayoutManager.kt */
@Metadata(m10422d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0007J\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\r\u001a\u00060\u000eR\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J$\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\n\u0010\r\u001a\u00060\u000eR\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m10421d2 = {"Lai/kudi/dip/library/carouselView/CarouselLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "orientation", "", "reverseLayout", "", "(Landroid/content/Context;IZ)V", "isOffsetStart", "scaleOnScroll", "", "onLayoutChildren", "recycler", "Landroidx/recyclerview/widget/RecyclerView$Recycler;", "Landroidx/recyclerview/widget/RecyclerView;", SendReceiptToTerminalConfirmationBottomSheet.STATE, "Landroidx/recyclerview/widget/RecyclerView$State;", "scrollHorizontallyBy", "dx", "setScaleOnScroll", "kudi-dip-library_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CarouselLayoutManager extends LinearLayoutManager {

    /* renamed from: a0 */
    private boolean f2184a0;

    /* renamed from: b0 */
    private boolean f2185b0;

    public CarouselLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: E1 */
    public int mo32368E1(int i, RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0) {
        float m10269c;
        l.f(c1647w, "recycler");
        l.f(c1614b0, SendReceiptToTerminalConfirmationBottomSheet.STATE);
        int mo32368E1 = super.mo32368E1(i, c1647w, c1614b0);
        if (this.f2185b0) {
            int i2 = 0;
            int m35142T = m35142T();
            if (m35142T > 0) {
                while (true) {
                    int i3 = i2 + 1;
                    View m35145S = m35145S(i2);
                    if (m35145S != null) {
                        float right = m35145S.getRight() - m35145S.getLeft();
                        float left = m35145S.getLeft() + (right / 2.0f);
                        if (!this.f2184a0) {
                            right = m35092u0();
                        }
                        float f = right / 2.0f;
                        float f2 = 0.75f * f;
                        m10269c = C11841h.m10269c(f2, Math.abs(f - left));
                        float f3 = (((-0.14999998f) * (m10269c - 0.0f)) / (f2 - 0.0f)) + 1.0f;
                        m35145S.setScaleX(f3);
                        m35145S.setScaleY(f3);
                    }
                    if (i3 >= m35142T) {
                        break;
                    }
                    i2 = i3;
                }
            }
        }
        return mo32368E1;
    }

    /* renamed from: T2 */
    public final void m38009T2(boolean z) {
        this.f2184a0 = z;
    }

    /* renamed from: U2 */
    public final void m38008U2(boolean z) {
        this.f2185b0 = z;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1635p
    /* renamed from: e1 */
    public void mo32325e1(RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0) {
        l.f(c1647w, "recycler");
        l.f(c1614b0, SendReceiptToTerminalConfirmationBottomSheet.STATE);
        super.mo32325e1(c1647w, c1614b0);
        mo32368E1(0, c1647w, c1614b0);
    }
}
