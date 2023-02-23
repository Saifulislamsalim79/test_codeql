package ai.kudi.agent.p036v2.common.view.activities;

import ai.kudi.agent.DaggerMarketplaceComponent;
import ai.kudi.agent.MarketplaceComponent;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseMarketplaceActivity.kt */
@Metadata(m10422d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0005H\n"}, m10421d2 = {"<anonymous>", "Lai/kudi/agent/MarketplaceComponent;", "VM", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "State", "Lai/kudi/agent/core/mvvm/ViewData;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.view.activities.BaseMarketplaceActivity$marketplaceComponent$2 */
/* loaded from: classes.dex */
public final class BaseMarketplaceActivity$marketplaceComponent$2 extends AbstractC11802m implements InterfaceC11756a<MarketplaceComponent> {
    final /* synthetic */ BaseMarketplaceActivity<VM, State> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMarketplaceActivity$marketplaceComponent$2(BaseMarketplaceActivity baseMarketplaceActivity) {
        super(0);
        this.this$0 = baseMarketplaceActivity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public final MarketplaceComponent invoke() {
        MarketplaceComponent.Factory $r2 = DaggerMarketplaceComponent.factory();
        BaseMarketplaceActivity $r1 = this.this$0;
        MarketplaceComponent $r3 = $r2.create($r1);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ MarketplaceComponent invoke() {
        MarketplaceComponent $r1 = invoke();
        return $r1;
    }
}
