package ai.kudi.agent;

import ai.kudi.agent.p036v2.common.bitmaps.components.lookup.MarketplaceProductLookupSubComponent;
import ai.kudi.agent.p036v2.common.bitmaps.components.products.MarketplaceProductSubComponent;
import android.content.Context;
import kotlin.Metadata;
/* compiled from: MarketplaceComponent.kt */
@Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/MarketplaceComponent;", "", "marketplaceLookupSubcomponents", "Lai/kudi/agent/v2/common/di/components/lookup/MarketplaceProductLookupSubComponent$Factory;", "marketplaceProductSubcomponent", "Lai/kudi/agent/v2/common/di/components/products/MarketplaceProductSubComponent$Factory;", "Factory", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface MarketplaceComponent {

    /* compiled from: MarketplaceComponent.kt */
    @Metadata(m10422d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/MarketplaceComponent$Factory;", "", "create", "Lai/kudi/agent/MarketplaceComponent;", "context", "Landroid/content/Context;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        MarketplaceComponent create(Context context);
    }

    MarketplaceProductLookupSubComponent.Factory marketplaceLookupSubcomponents();

    MarketplaceProductSubComponent.Factory marketplaceProductSubcomponent();
}
