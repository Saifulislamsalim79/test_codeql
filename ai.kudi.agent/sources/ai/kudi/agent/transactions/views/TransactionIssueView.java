package ai.kudi.agent.transactions.views;

import ai.kudi.agent.issues.viewmodels.model.IssueTypeModelWithDuplicateChecker;
import java.util.HashMap;
import kotlin.Metadata;
import p272h.p364d.p365a.p366c.LoginListener;
/* compiled from: TransactionIssueView.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J(\u0010\u0004\u001a\u00020\u00032\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b2\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0003H&¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/transactions/views/TransactionIssueView;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "hideLoader", "", "showIssues", "transaction", "Ljava/util/HashMap;", "", "Lai/kudi/agent/transactions/domain/dto/Transaction;", "issueTypeModelWithDuplicateChecker", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModelWithDuplicateChecker;", "showLoader", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface TransactionIssueView extends LoginListener {
    void hideLoader();

    void showIssues(HashMap hashMap, IssueTypeModelWithDuplicateChecker issueTypeModelWithDuplicateChecker);

    void showLoader();
}
