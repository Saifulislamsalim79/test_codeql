package ai.kudi.agent.transactionstatus.view;

import ai.kudi.agent.transactions.TransactionStatus;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import p272h.p364d.p365a.p366c.LoginListener;
/* compiled from: TransactionStatusView.kt */
@Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH&¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/transactionstatus/view/TransactionStatusView;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "displayStatus", "", TransactionField.STATUS, "Lai/kudi/agent/transactions/TransactionStatus;", "errorMessage", "", "seeMore", "callback", "Lkotlin/Function0;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface TransactionStatusView extends LoginListener {
    void displayStatus(TransactionStatus transactionStatus, String str);

    void seeMore(InterfaceC11756a interfaceC11756a);
}
