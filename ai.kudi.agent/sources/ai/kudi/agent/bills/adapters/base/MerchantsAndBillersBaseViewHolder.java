package ai.kudi.agent.bills.adapters.base;

import ai.kudi.agent.bills.base.MerchantsOrBillers;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: MerchantsAndBillersSectionAdapter.kt */
@Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/bills/adapters/base/MerchantsAndBillersBaseViewHolder;", "MB", "Lai/kudi/agent/bills/base/MerchantsOrBillers;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "view", "Landroid/view/View;", "(Landroid/content/Context;Landroid/view/View;)V", "getContext", "()Landroid/content/Context;", "getView", "()Landroid/view/View;", "setMerchantOrBiller", "", "mb", "(Lai/kudi/agent/bills/base/MerchantsOrBillers;)V", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class MerchantsAndBillersBaseViewHolder<MB extends MerchantsOrBillers> extends RecyclerView.AbstractC1620e0 {
    private final Context context;
    private final View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MerchantsAndBillersBaseViewHolder(Context context, View view) {
        super(view);
        Log_OC.getArray(context, "context");
        Log_OC.getArray(view, "view");
        this.context = context;
        this.view = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Context getContext() {
        Context r1 = this.context;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final View getView() {
        View r1 = this.view;
        return r1;
    }

    public abstract void setMerchantOrBiller(MerchantsOrBillers merchantsOrBillers);
}
