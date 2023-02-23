package ai.kudi.agent.transactionstatus.summary.presenter;

import ai.kudi.agent.bills.domain.usecases.SubmitTransferRequest;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.usecases.LogUserEventUseCase;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.users.domain.usecases.TransferToBank;
import ai.kudi.agent.voucher.cashin.domain.usecase.CreateVoucher;
import ai.kudi.agent.voucher.cashin.view.MainTransferView;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class TransferSummaryPresenter_Factory implements InterfaceC9468d<TransferSummaryPresenter> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<CreateVoucher> createVoucherProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<LogUserEventUseCase> logUserEventUseCaseProvider;
    private final InterfaceC11700a<MainTransferView> mainTransferViewProvider;
    private final InterfaceC11700a<SubmitTransferRequest> submitTransferRequestProvider;
    private final InterfaceC11700a<TransferToBank> transferToBankProvider;

    public TransferSummaryPresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7) {
        this.fetchCurrentUserProvider = interfaceC11700a;
        this.transferToBankProvider = interfaceC11700a2;
        this.mainTransferViewProvider = interfaceC11700a3;
        this.createVoucherProvider = interfaceC11700a4;
        this.analyticsProvider = interfaceC11700a5;
        this.submitTransferRequestProvider = interfaceC11700a6;
        this.logUserEventUseCaseProvider = interfaceC11700a7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransferSummaryPresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7) {
        TransferSummaryPresenter_Factory $r7 = new TransferSummaryPresenter_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6, interfaceC11700a7);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransferSummaryPresenter newInstance(FetchCurrentUser fetchCurrentUser, TransferToBank transferToBank, MainTransferView mainTransferView, CreateVoucher createVoucher, Analytics analytics, SubmitTransferRequest submitTransferRequest, LogUserEventUseCase logUserEventUseCase) {
        TransferSummaryPresenter $r7 = new TransferSummaryPresenter(fetchCurrentUser, transferToBank, mainTransferView, createVoucher, analytics, submitTransferRequest, logUserEventUseCase);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransferSummaryPresenter multiply() {
        InterfaceC11700a $r1 = this.fetchCurrentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.transferToBankProvider;
        Object $r22 = $r12.get();
        TransferToBank $r4 = (TransferToBank) $r22;
        InterfaceC11700a $r13 = this.mainTransferViewProvider;
        Object $r23 = $r13.get();
        MainTransferView $r5 = (MainTransferView) $r23;
        InterfaceC11700a $r14 = this.createVoucherProvider;
        Object $r24 = $r14.get();
        CreateVoucher createVoucher = (CreateVoucher) $r24;
        InterfaceC11700a $r15 = this.analyticsProvider;
        Object $r25 = $r15.get();
        Analytics analytics = (Analytics) $r25;
        InterfaceC11700a $r16 = this.submitTransferRequestProvider;
        Object $r26 = $r16.get();
        SubmitTransferRequest submitTransferRequest = (SubmitTransferRequest) $r26;
        InterfaceC11700a $r17 = this.logUserEventUseCaseProvider;
        Object $r27 = $r17.get();
        LogUserEventUseCase $r9 = (LogUserEventUseCase) $r27;
        TransferSummaryPresenter $r10 = newInstance($r3, $r4, $r5, createVoucher, analytics, submitTransferRequest, $r9);
        return $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41294multiply() {
        TransferSummaryPresenter $r1 = multiply();
        return $r1;
    }
}
