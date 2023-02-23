package ai.kudi.agent.p036v2.common.view.viewModels;

import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.p036v2.common.view.viewData.MarketplaceProductViewData;
import ai.kudi.agent.p036v2.productHome.viewData.ProductHomeViewData;
import kotlin.Metadata;
/* compiled from: MarketplaceProductViewModel.kt */
@Metadata(m10422d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/v2/common/view/viewModels/MarketplaceProductViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/v2/common/view/viewData/MarketplaceProductViewData;", "()V", "initialData", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.view.viewModels.MarketplaceProductViewModel */
/* loaded from: classes.dex */
public final class MarketplaceProductViewModel extends BaseViewModel<MarketplaceProductViewData> {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        MarketplaceProductViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public MarketplaceProductViewData initialData() {
        ProductHomeViewData $r1 = new ProductHomeViewData(false, false, false, null, null, null, false, null, null, null, 1023, null);
        return $r1;
    }
}
