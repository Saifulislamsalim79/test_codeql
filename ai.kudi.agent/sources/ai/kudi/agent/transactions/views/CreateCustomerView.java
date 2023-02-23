package ai.kudi.agent.transactions.views;

import kotlin.Metadata;
import p272h.p364d.p365a.p366c.LoginListener;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: CreateCustomerView.kt */
@Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u001c\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\nH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nH&J\b\u0010\u000f\u001a\u00020\u0003H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\nH&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\nH&¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/transactions/views/CreateCustomerView;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "hideAddCustomerLoader", "", "hideLookupLoader", "showAddCustomerLoader", "showAddCustomerSuccessful", "isANewCustomer", "", "name", "", "showCustomerName", "id", "showError", "errorMessage", "showLookupLoader", "showNameError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "showPhoneNumberError", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface CreateCustomerView extends LoginListener {
    void hideAddCustomerLoader();

    void hideLookupLoader();

    void showAddCustomerLoader();

    void showAddCustomerSuccessful(boolean z, String str);

    void showCustomerName(String str, String str2);

    void showError(String str);

    void showLookupLoader();

    void showNameError(String str);

    void showPhoneNumberError(String str);
}
