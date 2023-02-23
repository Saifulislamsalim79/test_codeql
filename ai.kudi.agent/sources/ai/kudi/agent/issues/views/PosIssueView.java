package ai.kudi.agent.issues.views;

import java.util.List;
import kotlin.Metadata;
import p272h.p364d.p365a.p366c.LoginListener;
/* compiled from: PosIssueView.kt */
@Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/issues/views/PosIssueView;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "hideLoading", "", "showIssueType", "issueTypeList", "", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "showLoading", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface PosIssueView extends LoginListener {
    void hideLoading();

    void showIssueType(List list);

    void showLoading();
}
