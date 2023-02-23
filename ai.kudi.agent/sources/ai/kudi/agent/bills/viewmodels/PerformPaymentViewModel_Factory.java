package ai.kudi.agent.bills.viewmodels;

import ai.kudi.agent.bills.domain.usecases.PerformServiceFeeLookup;
import ai.kudi.agent.bills.domain.usecases.SubmitBillRequest;
import ai.kudi.agent.bills.domain.usecases.SubmitTransferRequest;
import ai.kudi.agent.bills.domain.usecases.SubmitWithdrawalRequest;
import ai.kudi.agent.bills.domain.usecases.SubmitWithdrawalUpdate;
import ai.kudi.agent.transactions.domain.usecases.FetchTransaction;
import ai.kudi.agent.transactions.domain.usecases.SubmitTransactionRequest;
import ai.kudi.agent.users.domain.usecases.TransferToBank;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class PerformPaymentViewModel_Factory implements InterfaceC9468d<PerformPaymentViewModel> {
    private final InterfaceC11700a<PerformServiceFeeLookup> feeLookupProvider;
    private final InterfaceC11700a<FetchTransaction> fetchTransactionProvider;
    private final InterfaceC11700a<SubmitBillRequest> submitRequestProvider;
    private final InterfaceC11700a<SubmitTransactionRequest> submitTransactionRequestProvider;
    private final InterfaceC11700a<SubmitTransferRequest> submitTransferRequestProvider;
    private final InterfaceC11700a<SubmitWithdrawalRequest> submitWithdrawalRequestProvider;
    private final InterfaceC11700a<SubmitWithdrawalUpdate> submitWithdrawalUpdateProvider;
    private final InterfaceC11700a<TransferToBank> transferToBankProvider;

    public PerformPaymentViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7, InterfaceC11700a interfaceC11700a8) {
        this.submitRequestProvider = interfaceC11700a;
        this.submitTransactionRequestProvider = interfaceC11700a2;
        this.submitTransferRequestProvider = interfaceC11700a3;
        this.submitWithdrawalRequestProvider = interfaceC11700a4;
        this.submitWithdrawalUpdateProvider = interfaceC11700a5;
        this.transferToBankProvider = interfaceC11700a6;
        this.feeLookupProvider = interfaceC11700a7;
        this.fetchTransactionProvider = interfaceC11700a8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PerformPaymentViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7, InterfaceC11700a interfaceC11700a8) {
        PerformPaymentViewModel_Factory $r8 = new PerformPaymentViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6, interfaceC11700a7, interfaceC11700a8);
        return $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PerformPaymentViewModel newInstance(SubmitBillRequest submitBillRequest, SubmitTransactionRequest submitTransactionRequest, SubmitTransferRequest submitTransferRequest, SubmitWithdrawalRequest submitWithdrawalRequest, SubmitWithdrawalUpdate submitWithdrawalUpdate, TransferToBank transferToBank, PerformServiceFeeLookup performServiceFeeLookup, FetchTransaction fetchTransaction) {
        PerformPaymentViewModel $r8 = new PerformPaymentViewModel(submitBillRequest, submitTransactionRequest, submitTransferRequest, submitWithdrawalRequest, submitWithdrawalUpdate, transferToBank, performServiceFeeLookup, fetchTransaction);
        return $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PerformPaymentViewModel multiply() {
        InterfaceC11700a $r1 = this.submitRequestProvider;
        Object $r2 = $r1.get();
        SubmitBillRequest $r3 = (SubmitBillRequest) $r2;
        InterfaceC11700a $r12 = this.submitTransactionRequestProvider;
        Object $r22 = $r12.get();
        SubmitTransactionRequest $r4 = (SubmitTransactionRequest) $r22;
        InterfaceC11700a $r13 = this.submitTransferRequestProvider;
        Object $r23 = $r13.get();
        SubmitTransferRequest $r5 = (SubmitTransferRequest) $r23;
        InterfaceC11700a $r14 = this.submitWithdrawalRequestProvider;
        Object $r24 = $r14.get();
        SubmitWithdrawalRequest submitWithdrawalRequest = (SubmitWithdrawalRequest) $r24;
        InterfaceC11700a $r15 = this.submitWithdrawalUpdateProvider;
        Object $r25 = $r15.get();
        SubmitWithdrawalUpdate submitWithdrawalUpdate = (SubmitWithdrawalUpdate) $r25;
        InterfaceC11700a $r16 = this.transferToBankProvider;
        Object $r26 = $r16.get();
        TransferToBank transferToBank = (TransferToBank) $r26;
        InterfaceC11700a $r17 = this.feeLookupProvider;
        Object $r27 = $r17.get();
        PerformServiceFeeLookup $r9 = (PerformServiceFeeLookup) $r27;
        InterfaceC11700a $r18 = this.fetchTransactionProvider;
        Object $r28 = $r18.get();
        FetchTransaction $r10 = (FetchTransaction) $r28;
        PerformPaymentViewModel $r11 = newInstance($r3, $r4, $r5, submitWithdrawalRequest, submitWithdrawalUpdate, transferToBank, $r9, $r10);
        return $r11;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39129multiply() {
        PerformPaymentViewModel $r1 = multiply();
        return $r1;
    }
}
