package ai.kudi.agent.transactions.presenters;

import ai.kudi.agent.core.util.Pref;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.transactions.domain.usecases.VerifyPendingData;
import ai.kudi.agent.transactions.domain.usecases.VerifyPendingResponse;
import ai.kudi.agent.transactions.domain.usecases.VerifyPendingTransactionRequest;
import ai.kudi.agent.transactions.p032ui.VerificationNavigator;
import ai.kudi.agent.transactions.views.PendingVerificationImageCaptureView;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
import p590o.p591a.Timber;
/* compiled from: PendingVerificationImageCapturePresenter.kt */
@Metadata(m10422d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m10421d2 = {"Lai/kudi/agent/transactions/presenters/PendingVerificationImageCapturePresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/transactions/views/PendingVerificationImageCaptureView;", "verificationNavigator", "Lai/kudi/agent/transactions/ui/VerificationNavigator;", "verifyTransaction", "Lai/kudi/agent/transactions/domain/usecases/VerifyPendingTransactionRequest;", "pref", "Lai/kudi/agent/core/util/Pref;", "(Lai/kudi/agent/transactions/ui/VerificationNavigator;Lai/kudi/agent/transactions/domain/usecases/VerifyPendingTransactionRequest;Lai/kudi/agent/core/util/Pref;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "getDisposable", "()Lio/reactivex/disposables/Disposable;", "setDisposable", "(Lio/reactivex/disposables/Disposable;)V", "destroy", "", "verifyPendingData", "Lai/kudi/agent/transactions/domain/usecases/VerifyPendingData;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PendingVerificationImageCapturePresenter extends C9410b<PendingVerificationImageCaptureView> {
    private FavoritesArrayAdapter disposable;
    private final Pref pref;
    private final VerificationNavigator verificationNavigator;
    private final VerifyPendingTransactionRequest verifyTransaction;

    public PendingVerificationImageCapturePresenter(VerificationNavigator verificationNavigator, VerifyPendingTransactionRequest verifyPendingTransactionRequest, Pref pref) {
        Log_OC.getArray(verificationNavigator, "verificationNavigator");
        Log_OC.getArray(verifyPendingTransactionRequest, "verifyTransaction");
        Log_OC.getArray(pref, "pref");
        this.verificationNavigator = verificationNavigator;
        this.verifyTransaction = verifyPendingTransactionRequest;
        this.pref = pref;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: verifyTransaction$lambda-2  reason: not valid java name */
    public static final void m41159verifyTransaction$lambda2(final VerifyPendingData verifyPendingData, final PendingVerificationImageCapturePresenter pendingVerificationImageCapturePresenter, final PendingVerificationImageCaptureView pendingVerificationImageCaptureView) {
        Log_OC.getArray(verifyPendingData, "$verifyPendingData");
        Log_OC.getArray(pendingVerificationImageCapturePresenter, "this$0");
        Log_OC.getArray(pendingVerificationImageCaptureView, "it");
        String $r3 = verifyPendingData.getCustomerPictureId();
        int $i0 = $r3.length();
        boolean $z0 = $i0 == 0;
        if ($z0) {
            pendingVerificationImageCaptureView.showLoading(false);
            pendingVerificationImageCaptureView.showErrorMsg("Snap the customer first");
            return;
        }
        VerifyPendingTransactionRequest $r4 = pendingVerificationImageCapturePresenter.verifyTransaction;
        AbstractC11688p $r5 = $r4.execute(verifyPendingData);
        FavoritesArrayAdapter $r8 = $r5.e0(new Object() { // from class: ai.kudi.agent.transactions.presenters.DynamicTableModel$a
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PendingVerificationImageCapturePresenter $r1 = PendingVerificationImageCapturePresenter.this;
                VerifyPendingData $r2 = verifyPendingData;
                PendingVerificationImageCaptureView $r32 = pendingVerificationImageCaptureView;
                VerifyPendingResponse $r52 = (VerifyPendingResponse) obj;
                PendingVerificationImageCapturePresenter.m41160verifyTransaction$lambda2$lambda0($r1, $r2, $r32, $r52);
            }
        }, new Object() { // from class: ai.kudi.agent.transactions.presenters.PacketIDFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PendingVerificationImageCaptureView $r1 = PendingVerificationImageCaptureView.this;
                Throwable $r32 = (Throwable) obj;
                PendingVerificationImageCapturePresenter.m41161verifyTransaction$lambda2$lambda1($r1, $r32);
            }
        });
        pendingVerificationImageCapturePresenter.setDisposable($r8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: verifyTransaction$lambda-2$lambda-0  reason: not valid java name */
    public static final void m41160verifyTransaction$lambda2$lambda0(PendingVerificationImageCapturePresenter pendingVerificationImageCapturePresenter, VerifyPendingData verifyPendingData, PendingVerificationImageCaptureView pendingVerificationImageCaptureView, VerifyPendingResponse verifyPendingResponse) {
        Log_OC.getArray(pendingVerificationImageCapturePresenter, "this$0");
        Log_OC.getArray(verifyPendingData, "$verifyPendingData");
        Log_OC.getArray(pendingVerificationImageCaptureView, "$it");
        Pref $r5 = pendingVerificationImageCapturePresenter.pref;
        String $r1 = verifyPendingData.getReference();
        $r5.setFlagForKycCheckFor($r1);
        VerificationNavigator $r6 = pendingVerificationImageCapturePresenter.verificationNavigator;
        $r6.navigateToSuccessVerification();
        pendingVerificationImageCaptureView.showLoading(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: verifyTransaction$lambda-2$lambda-1  reason: not valid java name */
    public static final void m41161verifyTransaction$lambda2$lambda1(PendingVerificationImageCaptureView pendingVerificationImageCaptureView, Throwable th) {
        Log_OC.getArray(pendingVerificationImageCaptureView, "$it");
        th.printStackTrace();
        pendingVerificationImageCaptureView.showLoading(false);
        InterfaceC11767l $r2 = KudiErrorParserKt.parseHttpError2$default("Something went wrong. Please try again", null, 2, null);
        Log_OC.loadImage(th, "ex");
        Object $r3 = $r2.invoke(th);
        String $r4 = (String) $r3;
        pendingVerificationImageCaptureView.showErrorMsg($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.C9410b, p272h.p364d.p365a.p366c.InterfaceC9413d
    public void destroy() {
        super.destroy();
        FavoritesArrayAdapter $r1 = this.disposable;
        if ($r1 == null) {
            return;
        }
        $r1.backup();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FavoritesArrayAdapter getDisposable() {
        FavoritesArrayAdapter r1 = this.disposable;
        return r1;
    }

    public final void setDisposable(FavoritesArrayAdapter favoritesArrayAdapter) {
        this.disposable = favoritesArrayAdapter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void verifyTransaction(final VerifyPendingData verifyPendingData) {
        Log_OC.getArray(verifyPendingData, "verifyPendingData");
        String $r2 = Log_OC.m10359a("pending data ", verifyPendingData);
        Object[] $r3 = new Object[0];
        Timber.wtf($r2, $r3);
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.transactions.presenters.LayoutManager
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void draw(Object obj) {
                VerifyPendingData $r1 = VerifyPendingData.this;
                PendingVerificationImageCapturePresenter $r22 = this;
                PendingVerificationImageCaptureView $r4 = (PendingVerificationImageCaptureView) obj;
                PendingVerificationImageCapturePresenter.m41159verifyTransaction$lambda2($r1, $r22, $r4);
            }
        });
    }
}
