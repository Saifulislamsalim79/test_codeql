package ai.kudi.agent.start;

import kotlin.Metadata;
import p272h.p364d.p365a.p366c.LoginListener;
/* compiled from: StartView.kt */
@Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/start/StartView;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "hideCheckingUpdate", "", "navigateToIntro", "navigateToLogin", "showCheckingUpdate", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface StartView extends LoginListener {
    void hideCheckingUpdate();

    void navigateToIntro();

    void navigateToLogin();

    void showCheckingUpdate();
}
