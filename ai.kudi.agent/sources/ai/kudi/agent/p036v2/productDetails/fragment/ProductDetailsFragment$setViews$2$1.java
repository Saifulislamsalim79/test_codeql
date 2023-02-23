package ai.kudi.agent.p036v2.productDetails.fragment;

import ai.kudi.agent.core.domain.data.MarketplaceProductModel;
import ai.kudi.agent.core.domain.data.Merchant;
import ai.kudi.agent.p036v2.common.archives.PlanAmountProperty;
import ai.kudi.agent.p036v2.common.view.activities.MarketplaceLookupActivity;
import android.os.Bundle;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProductDetailsFragment.kt */
@Metadata(m10422d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m10421d2 = {"<anonymous>", "", "Landroid/os/Bundle;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productDetails.fragment.ProductDetailsFragment$setViews$2$1 */
/* loaded from: classes.dex */
public final class ProductDetailsFragment$setViews$2$1 extends AbstractC11802m implements InterfaceC11767l<Bundle, C13666w> {
    final /* synthetic */ ProductDetailsFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsFragment$setViews$2$1(ProductDetailsFragment productDetailsFragment) {
        super(1);
        this.this$0 = productDetailsFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(Bundle bundle) {
        Bundle $r2 = bundle;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Bundle bundle) {
        Integer $r5;
        Merchant $r7;
        Log_OC.getArray(bundle, "$this$launchActivity");
        ProductDetailsFragment $r2 = this.this$0;
        MarketplaceProductModel $r3 = $r2.marketplaceProductModel;
        String $r4 = null;
        if ($r3 == null) {
            $r5 = null;
        } else {
            int $i0 = $r3.getId();
            $r5 = Integer.valueOf($i0);
        }
        String $r6 = String.valueOf($r5);
        bundle.putString(MarketplaceLookupActivity.ARGS_MARKETPLACE_ID, $r6);
        ProductDetailsFragment $r22 = this.this$0;
        String $r62 = $r22.collectionAmount;
        bundle.putString(MarketplaceLookupActivity.ARGS_COLLECTION_AMOUNT, $r62);
        ProductDetailsFragment $r23 = this.this$0;
        MarketplaceProductModel $r32 = $r23.marketplaceProductModel;
        String $r63 = $r32 == null ? null : $r32.getCode();
        bundle.putString(MarketplaceLookupActivity.ARGS_MARKETPLACE_PRODUCT_CODE, $r63);
        ProductDetailsFragment $r24 = this.this$0;
        String $r64 = $r24.amountType;
        bundle.putString(MarketplaceLookupActivity.ARGS_AMOUNT_TYPE, $r64);
        ProductDetailsFragment $r25 = this.this$0;
        MarketplaceProductModel $r33 = $r25.marketplaceProductModel;
        if ($r33 != null && ($r7 = $r33.getMerchant()) != null) {
            $r4 = $r7.getWalletId();
        }
        bundle.putString(MarketplaceLookupActivity.ARGS_AGENT_WALLET_ID, $r4);
        ProductDetailsFragment $r26 = this.this$0;
        PlanAmountProperty $r8 = $r26.planAmountProperty;
        bundle.putParcelable(MarketplaceLookupActivity.ARGS_PLAN_AMOUNT_FIELD, $r8);
    }
}
