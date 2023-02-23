package ai.kudi.agent.p036v2.common.view.activities;

import ai.kudi.agent.p036v2.productHome.fragment.ProductHomeFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: MarketplaceProductActivity.kt */
@Metadata(m10422d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m10421d2 = {"<anonymous>", "Landroidx/fragment/app/Fragment;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.view.activities.MarketplaceProductActivity$productsHomeFragment$2 */
/* loaded from: classes.dex */
final class MarketplaceProductActivity$productsHomeFragment$2 extends AbstractC11802m implements InterfaceC11756a<Fragment> {
    final /* synthetic */ MarketplaceProductActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketplaceProductActivity$productsHomeFragment$2(MarketplaceProductActivity marketplaceProductActivity) {
        super(0);
        this.this$0 = marketplaceProductActivity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public final Fragment invoke() {
        MarketplaceProductActivity $r1 = this.this$0;
        FragmentManager $r2 = $r1.getSupportFragmentManager();
        String $r4 = ProductHomeFragment.class.getCanonicalName();
        Fragment $r5 = $r2.m35938g0($r4);
        Fragment $r6 = $r5;
        if ($r5 == null) {
            ProductHomeFragment.Companion $r7 = ProductHomeFragment.Companion;
            $r6 = $r7.newInstance();
        }
        Log_OC.loadImage($r6, "supportFragmentManager.findFragmentByTag(ProductHomeFragment::class.java.canonicalName)\n            ?: ProductHomeFragment.newInstance()");
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ Fragment invoke() {
        Fragment $r1 = invoke();
        return $r1;
    }
}
