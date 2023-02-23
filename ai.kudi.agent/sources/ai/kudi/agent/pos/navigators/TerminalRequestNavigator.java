package ai.kudi.agent.pos.navigators;

import ai.kudi.agent.pos.data.PosPurchaseInfo;
import ai.kudi.agent.pos.p016ui.model.PosFilterType;
import java.util.List;
import kotlin.Metadata;
/* compiled from: TerminalRequestNavigator.kt */
@Metadata(m10422d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\nH&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0016\u0010\u0014\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H&J\u0016\u0010\u0018\u001a\u00020\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H&¨\u0006\u001a"}, m10421d2 = {"Lai/kudi/agent/pos/navigators/TerminalRequestNavigator;", "", "goToPosDeliveryAddressFragment", "", "posPurchaseInfo", "Lai/kudi/agent/pos/data/PosPurchaseInfo;", "navigateToActivatePos", "navigateToChangeAddress", "navigateToCongrats", "type", "", "navigateToFundWalletView", "navigateToMakePayment", "pop", "", "navigateToOrderDetailsFragment", "orderId", "navigateToPosOrderHistoryFragment", "posFilterType", "Lai/kudi/agent/pos/ui/model/PosFilterType;", "navigateToPosSelection", "posTypeDataList", "", "Lai/kudi/agent/pos/data/PosTypeData;", "toTermsAndConditions", "leasePosData", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface TerminalRequestNavigator {
    void goToPosDeliveryAddressFragment(PosPurchaseInfo posPurchaseInfo);

    void navigateToActivatePos();

    void navigateToChangeAddress();

    void navigateToCongrats(String str);

    void navigateToFundWalletView();

    void navigateToMakePayment(boolean z, PosPurchaseInfo posPurchaseInfo);

    void navigateToOrderDetailsFragment(String str);

    void navigateToPosOrderHistoryFragment(PosFilterType posFilterType);

    void navigateToPosSelection(List list);

    void toTermsAndConditions(List list);
}
