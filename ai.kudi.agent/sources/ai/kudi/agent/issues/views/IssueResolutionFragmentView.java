package ai.kudi.agent.issues.views;

import kotlin.Metadata;
import p272h.p364d.p365a.p366c.LoginListener;
/* compiled from: IssueResolutionFragmentView.kt */
@Metadata(m10422d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/issues/views/IssueResolutionFragmentView;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "addImagesIfExists", "", "openFromFile", "requestForStoragePermission", "showErrorMessage", "msg", "", "showIsChargeBackDialog", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface IssueResolutionFragmentView extends LoginListener {
    void addImagesIfExists();

    void openFromFile();

    void requestForStoragePermission();

    void showErrorMessage(String str);

    void showIsChargeBackDialog();
}
