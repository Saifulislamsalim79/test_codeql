package ai.kudi.agent.transactionhistory.presentation;

import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.filter.domain.FilteredDate;
import ai.kudi.agent.transactionhistory.mapper.ServerTimeToTransactionDayMapper;
import ai.kudi.agent.transactionhistory.mapper.TransactionDataToUiMapper;
import ai.kudi.agent.transactionhistory.presentation.viewstate.TransactionsViewState;
import ai.kudi.agent.transactions.data.repositories.dto.FetchRequest;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.users.domain.package_1.User;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.p471k0.C11680b;
/* compiled from: BaseTransactionsViewModel.kt */
@Metadata(m10422d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010.\u001a\u00020\u0002H\u0016J\u001c\u0010/\u001a\b\u0012\u0004\u0012\u000201002\f\u00102\u001a\b\u0012\u0004\u0012\u00020300H\u0004R\u001a\u0010\b\u001a\u00020\tX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100%¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00064"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/presentation/BaseTransactionsViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/transactionhistory/presentation/viewstate/TransactionsViewState;", "serverTimeToTransactionDayMapper", "Lai/kudi/agent/transactionhistory/mapper/ServerTimeToTransactionDayMapper;", "transactionDataToUiMapper", "Lai/kudi/agent/transactionhistory/mapper/TransactionDataToUiMapper;", "(Lai/kudi/agent/transactionhistory/mapper/ServerTimeToTransactionDayMapper;Lai/kudi/agent/transactionhistory/mapper/TransactionDataToUiMapper;)V", "currentPage", "", "getCurrentPage", "()I", "setCurrentPage", "(I)V", "existingDays", "", "", "getExistingDays", "()Ljava/util/Set;", "filteredDate", "Lai/kudi/agent/filter/domain/FilteredDate;", "getFilteredDate", "()Lai/kudi/agent/filter/domain/FilteredDate;", "setFilteredDate", "(Lai/kudi/agent/filter/domain/FilteredDate;)V", "isAllPagesExhausted", "", "()Z", "setAllPagesExhausted", "(Z)V", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/transactions/data/repositories/dto/FetchRequest;", "getRequest", "()Lai/kudi/agent/transactions/data/repositories/dto/FetchRequest;", "setRequest", "(Lai/kudi/agent/transactions/data/repositories/dto/FetchRequest;)V", "toastMessage", "Lio/reactivex/subjects/PublishSubject;", "getToastMessage", "()Lio/reactivex/subjects/PublishSubject;", "user", "Lai/kudi/agent/users/domain/dto/User;", "getUser", "()Lai/kudi/agent/users/domain/dto/User;", "setUser", "(Lai/kudi/agent/users/domain/dto/User;)V", "initialData", "mapTransactionsData", "", "Lai/kudi/agent/transactionhistory/data/model/TransactionItemUiModel;", "transactionsData", "Lai/kudi/agent/transactionhistory/data/model/TransactionDataModel;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class BaseTransactionsViewModel extends BaseViewModel<TransactionsViewState> {
    private int currentPage;
    private final Set<String> existingDays;
    protected FilteredDate filteredDate;
    private boolean isAllPagesExhausted;
    private FetchRequest request;
    private final ServerTimeToTransactionDayMapper serverTimeToTransactionDayMapper;
    private final C11680b<String> toastMessage;
    private final TransactionDataToUiMapper transactionDataToUiMapper;
    private User user;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BaseTransactionsViewModel(ServerTimeToTransactionDayMapper serverTimeToTransactionDayMapper, TransactionDataToUiMapper transactionDataToUiMapper) {
        Log_OC.getArray(serverTimeToTransactionDayMapper, "serverTimeToTransactionDayMapper");
        Log_OC.getArray(transactionDataToUiMapper, "transactionDataToUiMapper");
        this.serverTimeToTransactionDayMapper = serverTimeToTransactionDayMapper;
        this.transactionDataToUiMapper = transactionDataToUiMapper;
        LinkedHashSet $r4 = new LinkedHashSet();
        this.existingDays = $r4;
        FetchRequest $r5 = new FetchRequest(null, 1, null);
        this.request = $r5;
        C11680b $r1 = C11680b.m10564v0();
        Log_OC.loadImage($r1, "create()");
        this.toastMessage = $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getCurrentPage() {
        int i0 = this.currentPage;
        return i0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Set getExistingDays() {
        Set r1 = this.existingDays;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected final FilteredDate getFilteredDate() {
        FilteredDate $r1 = this.filteredDate;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("filteredDate");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FetchRequest getRequest() {
        FetchRequest r1 = this.request;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C11680b getToastMessage() {
        C11680b r1 = this.toastMessage;
        return r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final User getUser() {
        User r1 = this.user;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        TransactionsViewState $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public TransactionsViewState initialData() {
        TransactionsViewState $r1 = new TransactionsViewState(false, false, false, false, false, null, null, 0, null, null, 1023, null);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isAllPagesExhausted() {
        boolean z0 = this.isAllPagesExhausted;
        return z0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:8:0x0042 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List mapTransactionsData(java.util.List r50) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactionhistory.presentation.BaseTransactionsViewModel.mapTransactionsData(java.util.List):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setAllPagesExhausted(boolean z) {
        this.isAllPagesExhausted = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setCurrentPage(int i) {
        this.currentPage = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setFilteredDate(FilteredDate filteredDate) {
        Log_OC.getArray(filteredDate, "<set-?>");
        this.filteredDate = filteredDate;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setRequest(FetchRequest fetchRequest) {
        Log_OC.getArray(fetchRequest, "<set-?>");
        this.request = fetchRequest;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setUser(User user) {
        this.user = user;
    }
}
