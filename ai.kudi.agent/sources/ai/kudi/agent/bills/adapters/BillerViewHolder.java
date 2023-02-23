package ai.kudi.agent.bills.adapters;

import ai.kudi.agent.bills.adapters.base.MerchantsAndBillersBaseViewHolder;
import ai.kudi.agent.bills.base.MerchantsOrBillers;
import ai.kudi.agent.bills.data.Biller;
import ai.kudi.agent.core.C0038R;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.util.image.RoundedCornersTransformation;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.C7360t;
import com.squareup.picasso.C7376x;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
/* compiled from: BillerViewHolder.kt */
@Metadata(m10422d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\u000f0\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m10421d2 = {"Lai/kudi/agent/bills/adapters/BillerViewHolder;", "Lai/kudi/agent/bills/adapters/base/MerchantsAndBillersBaseViewHolder;", "Lai/kudi/agent/bills/data/Biller;", "billerContext", "Landroid/content/Context;", "billerView", "Landroid/view/View;", "onClickListener", "Lkotlin/Function1;", "", "(Landroid/content/Context;Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "availabilityIndicator", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "imageView", "Landroid/widget/ImageView;", "getOnClickListener", "()Lkotlin/jvm/functions/Function1;", "setMerchantOrBiller", "mb", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class BillerViewHolder extends MerchantsAndBillersBaseViewHolder<Biller> {
    private TextView availabilityIndicator;
    private ImageView imageView;
    private final InterfaceC11767l<Biller, C13666w> onClickListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BillerViewHolder(Context context, View view, InterfaceC11767l interfaceC11767l) {
        super(context, view);
        Log_OC.getArray(context, "billerContext");
        Log_OC.getArray(view, "billerView");
        Log_OC.getArray(interfaceC11767l, "onClickListener");
        this.onClickListener = interfaceC11767l;
        View $r3 = getView();
        int $i0 = C0038R.C0040id.billers_image_view;
        ImageView $r4 = (ImageView) $r3.findViewById($i0);
        this.imageView = $r4;
        View $r32 = getView();
        int $i02 = C0038R.C0040id.availability_indicator;
        TextView $r5 = (TextView) $r32.findViewById($i02);
        this.availabilityIndicator = $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setMerchantOrBiller$lambda-0  reason: not valid java name */
    public static final void m39018setMerchantOrBiller$lambda0(Biller biller, BillerViewHolder billerViewHolder, View view) {
        Log_OC.getArray(biller, "$mb");
        Log_OC.getArray(billerViewHolder, "this$0");
        boolean $z0 = biller.getAvailability();
        if ($z0) {
            InterfaceC11767l $r3 = billerViewHolder.getOnClickListener();
            $r3.invoke(biller);
            return;
        }
        Context $r4 = billerViewHolder.getContext();
        ContextExtKt.toast$default($r4, "This service is currently unavailable", 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11767l getOnClickListener() {
        InterfaceC11767l r1 = this.onClickListener;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.bills.adapters.base.MerchantsAndBillersBaseViewHolder
    public /* bridge */ /* synthetic */ void setMerchantOrBiller(MerchantsOrBillers merchantsOrBillers) {
        Biller $r2 = (Biller) merchantsOrBillers;
        setMerchantOrBiller($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void setMerchantOrBiller(final Biller biller) {
        boolean $z0;
        Log_OC.getArray(biller, "mb");
        String $r2 = biller.getImage();
        $z0 = C13276s.m5440u($r2);
        if (!$z0) {
            Context $r3 = getContext();
            Resources $r4 = $r3.getResources();
            int $i0 = C0038R.dimen.billers_item_corner_radius;
            float $f0 = $r4.getDimension($i0);
            int $i02 = (int) $f0;
            RoundedCornersTransformation $r5 = new RoundedCornersTransformation($i02, 0);
            C7360t $r6 = C7360t.m18881g();
            String $r22 = biller.getImage();
            C7376x $r7 = $r6.m18878j($r22);
            $r7.m18843i($r5);
            ImageView $r8 = this.imageView;
            $r7.m18847e($r8);
        }
        TextView $r9 = this.availabilityIndicator;
        Log_OC.loadImage($r9, "availabilityIndicator");
        boolean $z02 = biller.getAvailability();
        ViewExtKt.toggleVisibility($r9, !$z02);
        View $r10 = getView();
        $r10.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.bills.adapters.a
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Biller $r23 = Biller.this;
                BillerViewHolder $r32 = this;
                BillerViewHolder.m39018setMerchantOrBiller$lambda0($r23, $r32, view);
            }
        });
    }
}
