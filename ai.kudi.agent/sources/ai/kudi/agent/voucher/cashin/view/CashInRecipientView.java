package ai.kudi.agent.voucher.cashin.view;

import kotlin.Metadata;
import p272h.p364d.p365a.p366c.LoginListener;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: CashInRecipientView.kt */
@Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/voucher/cashin/view/CashInRecipientView;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "showError", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "", "showRecipientNameError", "showRecipientPhoneError", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface CashInRecipientView extends LoginListener {
    void showError(String str);

    void showRecipientNameError(String str);

    void showRecipientPhoneError(String str);
}
