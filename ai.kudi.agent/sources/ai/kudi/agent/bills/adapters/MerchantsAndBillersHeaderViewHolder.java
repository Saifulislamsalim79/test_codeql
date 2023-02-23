package ai.kudi.agent.bills.adapters;

import ai.kudi.agent.core.C0038R;
import ai.kudi.agent.pin.KudiPin;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: MerchantsAndBillersHeaderViewHolder.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/bills/adapters/MerchantsAndBillersHeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "imgArrow", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getImgArrow", "()Landroid/widget/ImageView;", "rootView", "getRootView", "()Landroid/view/View;", KudiPin.KUDI_PIN_TITLE, "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class MerchantsAndBillersHeaderViewHolder extends RecyclerView.AbstractC1620e0 {
    private final ImageView imgArrow;
    private final View rootView;
    private final TextView title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public MerchantsAndBillersHeaderViewHolder(View view) {
        super(view);
        Log_OC.getArray(view, "view");
        int $i0 = C0038R.C0040id.billers_category_name;
        View $r2 = view.findViewById($i0);
        Log_OC.loadImage($r2, "view.findViewById(R.id.billers_category_name)");
        TextView $r3 = (TextView) $r2;
        this.title = $r3;
        int $i02 = C0038R.C0040id.arrow;
        ImageView $r4 = (ImageView) view.findViewById($i02);
        this.imgArrow = $r4;
        View $r1 = view.getRootView();
        this.rootView = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ImageView getImgArrow() {
        ImageView r1 = this.imgArrow;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final View getRootView() {
        View r1 = this.rootView;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TextView getTitle() {
        TextView r1 = this.title;
        return r1;
    }
}
