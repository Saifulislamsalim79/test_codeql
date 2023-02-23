package ai.kudi.agent.kshock.presentation;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.kshock.data.model.CancelLoanResponse;
import ai.kudi.agent.kshock.data.model.Loan;
import ai.kudi.agent.kshock.presentation.viewdata.LoanStatusViewData;
import ai.kudi.agent.kshock.usecases.CancelLoanRequest;
import ai.kudi.agent.kshock.usecases.PaybackLoan;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import io.intercom.android.sdk.views.holder.AttributeType;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
/* compiled from: LoanStatusViewModel.kt */
@Metadata(m10422d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\rJ\u0006\u0010\u0003\u001a\u00020\u0012J\b\u0010\u0014\u001a\u00020\u0002H\u0016J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\rJ\u0010\u0010\u0007\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\rR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, m10421d2 = {"Lai/kudi/agent/kshock/presentation/LoanStatusViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/kshock/presentation/viewdata/LoanStatusViewData;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "cancelLoanRequest", "Lai/kudi/agent/kshock/usecases/CancelLoanRequest;", "paybackLoan", "Lai/kudi/agent/kshock/usecases/PaybackLoan;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/kshock/usecases/CancelLoanRequest;Lai/kudi/agent/kshock/usecases/PaybackLoan;Lai/kudi/agent/core/analytics/Analytics;)V", AttributeType.PHONE, "", "getPhone", "()Ljava/lang/String;", "setPhone", "(Ljava/lang/String;)V", "", "loanRequestId", "initialData", "loanStatusAnanlytics", TransactionField.STATUS, "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class LoanStatusViewModel extends BaseViewModel<LoanStatusViewData> {
    private final Analytics analytics;
    private final CancelLoanRequest cancelLoanRequest;
    private final FetchCurrentUser fetchCurrentUser;
    private final PaybackLoan paybackLoan;
    private String phone;

    public LoanStatusViewModel(FetchCurrentUser fetchCurrentUser, CancelLoanRequest cancelLoanRequest, PaybackLoan paybackLoan, Analytics analytics) {
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(cancelLoanRequest, "cancelLoanRequest");
        Log_OC.getArray(paybackLoan, "paybackLoan");
        Log_OC.getArray(analytics, "analytics");
        this.fetchCurrentUser = fetchCurrentUser;
        this.cancelLoanRequest = cancelLoanRequest;
        this.paybackLoan = paybackLoan;
        this.analytics = analytics;
        this.phone = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: cancelLoanRequest$lambda-2  reason: not valid java name */
    public static final InterfaceC11692s m39617cancelLoanRequest$lambda2(LoanStatusViewModel loanStatusViewModel, String $r1, User user) {
        Log_OC.getArray(loanStatusViewModel, "this$0");
        Log_OC.getArray(user, "it");
        CancelLoanRequest $r3 = loanStatusViewModel.cancelLoanRequest;
        String $r4 = user.getSessionId();
        Log_OC.loadImage($r4, "it.sessionId");
        if ($r1 == null) {
            $r1 = "";
        }
        AbstractC11688p $r5 = $r3.execute($r4, $r1);
        return $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: cancelLoanRequest$lambda-3  reason: not valid java name */
    public static final void m39618cancelLoanRequest$lambda3(LoanStatusViewModel loanStatusViewModel, CancelLoanResponse cancelLoanResponse) {
        Log_OC.getArray(loanStatusViewModel, "this$0");
        Log_OC.loadImage(cancelLoanResponse, "it");
        LoanStatusViewData.CancelLoan $r2 = new LoanStatusViewData.CancelLoan(cancelLoanResponse);
        loanStatusViewModel.publish($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: cancelLoanRequest$lambda-4  reason: not valid java name */
    public static final void m39619cancelLoanRequest$lambda4(LoanStatusViewModel loanStatusViewModel, Throwable th) {
        Log_OC.getArray(loanStatusViewModel, "this$0");
        InterfaceC11767l $r3 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r4 = $r3.invoke(th);
        String $r5 = (String) $r4;
        LoanStatusViewData.Error $r2 = new LoanStatusViewData.Error($r5);
        loanStatusViewModel.publish($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchCurrentUser$lambda-0  reason: not valid java name */
    public static final void m39620fetchCurrentUser$lambda0(LoanStatusViewModel loanStatusViewModel, User user) {
        Log_OC.getArray(loanStatusViewModel, "this$0");
        String $r2 = user.getPhoneNumber();
        Log_OC.loadImage($r2, "it.phoneNumber");
        loanStatusViewModel.setPhone($r2);
        LoanStatusViewData.CurrentUser $r3 = new LoanStatusViewData.CurrentUser(user);
        loanStatusViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: paybackLoan$lambda-5  reason: not valid java name */
    public static final InterfaceC11692s m39622paybackLoan$lambda5(LoanStatusViewModel loanStatusViewModel, String $r1, User user) {
        Log_OC.getArray(loanStatusViewModel, "this$0");
        Log_OC.getArray(user, "it");
        PaybackLoan $r3 = loanStatusViewModel.paybackLoan;
        if ($r1 == null) {
            $r1 = "";
        }
        String $r4 = user.getSessionId();
        Log_OC.loadImage($r4, "it.sessionId");
        AbstractC11688p $r5 = $r3.execute($r1, $r4);
        return $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: paybackLoan$lambda-6  reason: not valid java name */
    public static final void m39623paybackLoan$lambda6(LoanStatusViewModel loanStatusViewModel, Loan loan) {
        Log_OC.getArray(loanStatusViewModel, "this$0");
        Log_OC.loadImage(loan, "it");
        LoanStatusViewData.Payback $r2 = new LoanStatusViewData.Payback(loan);
        loanStatusViewModel.publish($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: paybackLoan$lambda-7  reason: not valid java name */
    public static final void m39624paybackLoan$lambda7(LoanStatusViewModel loanStatusViewModel, Throwable th) {
        Log_OC.getArray(loanStatusViewModel, "this$0");
        InterfaceC11767l $r3 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r4 = $r3.invoke(th);
        String $r5 = (String) $r4;
        LoanStatusViewData.Error $r2 = new LoanStatusViewData.Error($r5);
        loanStatusViewModel.publish($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void cancelLoanRequest(final String str) {
        LoanStatusViewData.Loading $r2 = LoanStatusViewData.Loading.INSTANCE;
        publish($r2);
        FetchCurrentUser $r3 = this.fetchCurrentUser;
        AbstractC11696w $r4 = FetchCurrentUser.execute$default($r3, null, null, 3, null);
        AbstractC11688p $r6 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.kshock.presentation.a
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                LoanStatusViewModel $r1 = LoanStatusViewModel.this;
                String $r22 = str;
                User $r5 = (User) obj;
                InterfaceC11692s $r32 = LoanStatusViewModel.m39617cancelLoanRequest$lambda2($r1, $r22, $r5);
                return $r32;
            }
        });
        FavoritesArrayAdapter $r9 = $r6.e0(new Object() { // from class: ai.kudi.agent.kshock.presentation.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                LoanStatusViewModel $r1 = LoanStatusViewModel.this;
                CancelLoanResponse $r32 = (CancelLoanResponse) obj;
                LoanStatusViewModel.m39618cancelLoanRequest$lambda3($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.kshock.presentation.RoomListenerMultiplexor$RoomMultiplexFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                LoanStatusViewModel $r1 = LoanStatusViewModel.this;
                Throwable $r32 = (Throwable) obj;
                LoanStatusViewModel.m39619cancelLoanRequest$lambda4($r1, $r32);
            }
        });
        C11280b $r10 = getCompositeDisposable();
        $r10.b($r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchCurrentUser() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.kshock.presentation.SocketConnector
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                LoanStatusViewModel $r12 = LoanStatusViewModel.this;
                User $r3 = (User) obj;
                LoanStatusViewModel.m39620fetchCurrentUser$lambda0($r12, $r3);
            }
        };
        Chunk $r4 = Chunk.NEWLINE;
        FavoritesArrayAdapter $r5 = $r2.s(object, $r4);
        Log_OC.loadImage($r5, "fetchCurrentUser.execute().subscribe(\n            {\n                phone = it.phoneNumber\n                publish(LoanStatusViewData.CurrentUser(it))\n            },\n            {\n                it.printStackTrace()\n            }\n        )");
        C11280b $r6 = getCompositeDisposable();
        $r6.b($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getPhone() {
        String r1 = this.phone;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        LoanStatusViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public LoanStatusViewData initialData() {
        LoanStatusViewData.Initial r1 = LoanStatusViewData.Initial.INSTANCE;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void loanStatusAnanlytics(String str) {
        Log_OC.getArray(str, TransactionField.STATUS);
        Analytics $r3 = this.analytics;
        String $r2 = this.phone;
        $r3.onLoanStatus($r2, str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void paybackLoan(final String str) {
        LoanStatusViewData.Loading $r2 = LoanStatusViewData.Loading.INSTANCE;
        publish($r2);
        FetchCurrentUser $r3 = this.fetchCurrentUser;
        AbstractC11696w $r4 = FetchCurrentUser.execute$default($r3, null, null, 3, null);
        AbstractC11688p $r6 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.kshock.presentation.Attribute
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                LoanStatusViewModel $r1 = LoanStatusViewModel.this;
                String $r22 = str;
                User $r5 = (User) obj;
                InterfaceC11692s $r32 = LoanStatusViewModel.m39622paybackLoan$lambda5($r1, $r22, $r5);
                return $r32;
            }
        });
        FavoritesArrayAdapter $r9 = $r6.e0(new Object() { // from class: ai.kudi.agent.kshock.presentation.NotFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                LoanStatusViewModel $r1 = LoanStatusViewModel.this;
                Loan $r32 = (Loan) obj;
                LoanStatusViewModel.m39623paybackLoan$lambda6($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.kshock.presentation.Call
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                LoanStatusViewModel $r1 = LoanStatusViewModel.this;
                Throwable $r32 = (Throwable) obj;
                LoanStatusViewModel.m39624paybackLoan$lambda7($r1, $r32);
            }
        });
        C11280b $r10 = getCompositeDisposable();
        $r10.b($r9);
    }

    public final void setPhone(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.phone = str;
    }
}
