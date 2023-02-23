package ai.kudi.agent.bills.views;

import ai.kudi.agent.kshock.data.model.KshockEligibility;
import ai.kudi.agent.users.domain.package_1.User;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import kotlin.Metadata;
import p272h.p364d.p365a.p366c.LoginListener;
/* compiled from: HomeView.kt */
@Metadata(m10422d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH&J\u0016\u0010\f\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH&J\u0016\u0010\u0010\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eH&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\nH&J\u0016\u0010\u0015\u001a\u00020\u00032\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000eH&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH&¨\u0006\u001b"}, m10421d2 = {"Lai/kudi/agent/bills/views/HomeView;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "enableAdverts", "", "kshockEligibility", "Lai/kudi/agent/kshock/data/model/KshockEligibility;", "showSavings", "", "greetUser", "greeting", "", "name", "showAnnouncements", "announcements", "", "Lai/kudi/agent/core/domain/room_entities/Announcement;", "showBillers", "billers", "Lai/kudi/agent/bills/data/Biller;", "showError", MetricTracker.Object.MESSAGE, "showTodoList", "todoList", "Lai/kudi/agent/postRegistrationSetUp/adapter/TodoItem;", "showUserPicture", "user", "Lai/kudi/agent/users/domain/dto/User;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface HomeView extends LoginListener {
    void enableAdverts(KshockEligibility kshockEligibility, boolean z);

    void greetUser(String str, String str2);

    void showAnnouncements(List list);

    void showBillers(List list);

    void showError(String str);

    void showTodoList(List list);

    void showUserPicture(User user);
}
