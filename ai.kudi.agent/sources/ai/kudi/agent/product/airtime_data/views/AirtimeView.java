package ai.kudi.agent.product.airtime_data.views;

import ai.kudi.agent.product.airtime_data.p017ui.AirtimeTopUpFragment;
import java.util.List;
import kotlin.Metadata;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: AirtimeAndDataView.kt */
@Metadata(m10422d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005H&J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH&J\u0016\u0010\u0011\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fH&¨\u0006\u0014"}, m10421d2 = {"Lai/kudi/agent/product/airtime_data/views/AirtimeView;", "Lai/kudi/agent/product/airtime_data/views/AirtimeAndDataView;", "setPhoneNumber", "", "phoneNumber", "", "setWalletBalance", "balance", "", "showInvalidDataPlan", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "showInvalidNetworkSelection", "showInvalidPhoneNumber", "showNetworks", AirtimeTopUpFragment.TYPE_OF_DATA_NETWORK, "", "Lai/kudi/agent/product/airtime_data/data/Networks;", "showPlans", "plans", "Lai/kudi/agent/product/airtime_data/data/Plan;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface AirtimeView extends AirtimeAndDataView {
    void setPhoneNumber(String str);

    void setWalletBalance(double d);

    void showInvalidDataPlan(String str);

    void showInvalidNetworkSelection(String str);

    void showInvalidPhoneNumber(String str);

    void showNetworks(List list);

    void showPlans(List list);
}
