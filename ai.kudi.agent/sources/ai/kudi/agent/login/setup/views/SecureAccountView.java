package ai.kudi.agent.login.setup.views;

import kotlin.Metadata;
import p272h.p364d.p365a.p366c.LoginListener;
/* compiled from: SecureAccountView.kt */
@Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/login/setup/views/SecureAccountView;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "hideError", "", "hideProgress", "navigateToDashBoard", "showError", "showProgress", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface SecureAccountView extends LoginListener {
    void hideError();

    void hideProgress();

    void navigateToDashBoard();

    void showError();

    void showProgress();
}
