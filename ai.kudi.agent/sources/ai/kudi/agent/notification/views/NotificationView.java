package ai.kudi.agent.notification.views;

import java.util.List;
import kotlin.Metadata;
import p272h.p364d.p365a.p366c.LoginListener;
/* compiled from: NotificationView.kt */
@Metadata(m10422d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/notification/views/NotificationView;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "hideLoading", "", "hideNextLoading", "showEmptyActivities", "showErrorMessage", "showLoading", "showNextLoading", "showNotificationActivities", "notificationActivities", "", "Lai/kudi/agent/notification/data/model/NotificationModel;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface NotificationView extends LoginListener {
    void hideLoading();

    void hideNextLoading();

    void showEmptyActivities();

    void showErrorMessage();

    void showLoading();

    void showNextLoading();

    void showNotificationActivities(List list);
}
