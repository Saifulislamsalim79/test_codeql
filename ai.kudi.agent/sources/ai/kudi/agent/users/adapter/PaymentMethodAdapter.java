package ai.kudi.agent.users.adapter;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.payments.domain.dto.PaymentMethod;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C1335a;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
/* compiled from: PaymentMethodAdapter.kt */
@Metadata(m10422d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\"\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0019"}, m10421d2 = {"Lai/kudi/agent/users/adapter/PaymentMethodAdapter;", "Landroid/widget/BaseAdapter;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "paymentMethods", "", "Lai/kudi/agent/payments/domain/dto/PaymentMethod;", "getPaymentMethods", "()Ljava/util/List;", "setPaymentMethods", "(Ljava/util/List;)V", "getCount", "", "getItem", "position", "getItemId", "", "getView", "Landroid/view/View;", "view", "root", "Landroid/view/ViewGroup;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PaymentMethodAdapter extends BaseAdapter {
    private final Context context;
    private List<PaymentMethod> paymentMethods;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PaymentMethodAdapter(Context context) {
        List $r1;
        Log_OC.getArray(context, "context");
        this.context = context;
        $r1 = C13726r.m3891e();
        this.paymentMethods = $r1;
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
    @Override // android.widget.Adapter
    public int getCount() {
        List $r1 = this.paymentMethods;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.widget.Adapter
    public ai.kudi.agent.payments.domain.wiki.PaymentMethod getItem(int i) {
        List $r1 = this.paymentMethods;
        Object $r2 = $r1.get(i);
        ai.kudi.agent.payments.domain.wiki.PaymentMethod $r3 = (ai.kudi.agent.payments.domain.wiki.PaymentMethod) $r2;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.widget.Adapter
    public /* bridge */ /* synthetic */ Object getItem(int i) {
        ai.kudi.agent.payments.domain.wiki.PaymentMethod $r1 = getItem(i);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.widget.Adapter
    public long getItemId(int i) {
        ai.kudi.agent.payments.domain.wiki.PaymentMethod $r1 = getItem(i);
        long $l1 = $r1.getId();
        return $l1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getPaymentMethods() {
        List r1 = this.paymentMethods;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.widget.Adapter
    public View getView(int i, View $r1, ViewGroup viewGroup) {
        Log_OC.getArray(viewGroup, "root");
        ai.kudi.agent.payments.domain.wiki.PaymentMethod $r3 = getItem(i);
        Drawable $r4 = null;
        if ($r1 == null) {
            $r1 = null;
        }
        if ($r1 == null) {
            Context $r5 = this.context;
            LayoutInflater $r6 = LayoutInflater.from($r5);
            $r1 = $r6.inflate(C0001R.C0004layout.include_card_listing, viewGroup, false);
        }
        View $r7 = $r1.findViewById(C0001R.C0003id.card_type_image_view);
        ImageView $r8 = (ImageView) $r7;
        long $l1 = $r3.getType();
        if ($l1 == 0) {
            Context $r52 = this.context;
            $r4 = C1335a.m36322f($r52, C0001R.C0002drawable.ic_mastercard);
        } else if ($l1 == 1) {
            Context $r53 = this.context;
            $r4 = C1335a.m36322f($r53, C0001R.mipmap.ic_visa);
        } else if ($l1 == 2) {
            Context $r54 = this.context;
            $r4 = C1335a.m36322f($r54, C0001R.mipmap.ic_verve);
        }
        $r8.setImageDrawable($r4);
        View $r72 = $r1.findViewById(C0001R.C0003id.card_no_text_view);
        TextView $r9 = (TextView) $r72;
        String $r10 = $r3.getCardNo();
        $r9.setText($r10);
        Log_OC.loadImage($r1, "cardView");
        return $r1;
    }

    public final void setPaymentMethods(List list) {
        Log_OC.getArray(list, "<set-?>");
        this.paymentMethods = list;
    }
}
