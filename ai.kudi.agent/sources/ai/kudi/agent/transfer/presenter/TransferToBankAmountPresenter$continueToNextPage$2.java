package ai.kudi.agent.transfer.presenter;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.analytics.contracts.TransferToBankAnalytics;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.transfer.domain.usecases.TransferToBankPayload;
import ai.kudi.agent.transfer.views.TransferToBankAmountView;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.voucher.cashin.view.MainTransferView;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TransferToBankAmountPresenter.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m10421d2 = {"<anonymous>", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransferToBankAmountPresenter$continueToNextPage$2 extends AbstractC11802m implements InterfaceC11767l<String, C13666w> {
    final /* synthetic */ boolean $isCashOutFlow;
    final /* synthetic */ boolean $isFromSummaryPage;
    final /* synthetic */ p425j.p444e.Item $main;
    final /* synthetic */ TransferToBankPayload $request;
    final /* synthetic */ TransferToBankAmountPresenter this$0;
    final /* synthetic */ p425j.p444e.Item val$args;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferToBankAmountPresenter$continueToNextPage$2(TransferToBankAmountPresenter transferToBankAmountPresenter, p425j.p444e.Item item, p425j.p444e.Item item2, boolean z, TransferToBankPayload transferToBankPayload, boolean z2) {
        super(1);
        this.this$0 = transferToBankAmountPresenter;
        this.val$args = item;
        this.$main = item2;
        this.$isCashOutFlow = z;
        this.$request = transferToBankPayload;
        this.$isFromSummaryPage = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke$lambda-0  reason: not valid java name */
    public static final void m41331invoke$lambda0(TransferToBankAmountPresenter transferToBankAmountPresenter, User user) {
        Log_OC.getArray(transferToBankAmountPresenter, "this$0");
        Analytics $r2 = transferToBankAmountPresenter.analytics;
        String $r3 = user.getPhoneNumber();
        Log_OC.loadImage($r3, "it.phoneNumber");
        TransferToBankAnalytics.DefaultImpls.onAmountEntered$default($r2, $r3, true, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-2  reason: not valid java name */
    public static final void m41333invoke$lambda2(TransferToBankAmountView transferToBankAmountView) {
        Log_OC.getArray(transferToBankAmountView, "view");
        transferToBankAmountView.toggleActionBtn(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke$lambda-3  reason: not valid java name */
    public static final void m41334invoke$lambda3(boolean z, String $r2, TransferToBankAmountPresenter transferToBankAmountPresenter, TransferToBankAmountView transferToBankAmountView) {
        Log_OC.getArray(transferToBankAmountPresenter, "this$0");
        Log_OC.getArray(transferToBankAmountView, "view");
        transferToBankAmountView.toggleActionBtn(true);
        if (z) {
            $r2 = C13276s.m5451A($r2, "transfer", "cash out", false, 4, null);
        }
        transferToBankAmountPresenter.showInvalidAmount($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(String str) {
        String $r2 = str;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(final String str) {
        if (str != null) {
            final TransferToBankAmountPresenter $r2 = this.this$0;
            final boolean $z0 = this.$isCashOutFlow;
            $r2.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.transfer.presenter.Switch
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
                /* renamed from: a */
                public final void mo14809a(Object obj) {
                    boolean $z02 = $z0;
                    String $r1 = str;
                    TransferToBankAmountPresenter $r22 = $r2;
                    TransferToBankAmountView $r4 = (TransferToBankAmountView) obj;
                    TransferToBankAmountPresenter$continueToNextPage$2.m41334invoke$lambda3($z02, $r1, $r22, $r4);
                }
            });
            return;
        }
        FetchCurrentUser $r3 = this.this$0.currentUser;
        p425j.p444e.Item $r4 = this.val$args;
        p425j.p444e.Item $r5 = this.$main;
        AbstractC11696w $r6 = $r3.execute($r4, $r5);
        final TransferToBankAmountPresenter $r22 = this.this$0;
        Object object = new Object() { // from class: ai.kudi.agent.transfer.presenter.NameFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransferToBankAmountPresenter $r1 = TransferToBankAmountPresenter.this;
                User $r32 = (User) obj;
                TransferToBankAmountPresenter$continueToNextPage$2.m41331invoke$lambda0($r1, $r32);
            }
        };
        Block $r8 = Block.next;
        FavoritesArrayAdapter $r9 = $r6.s(object, $r8);
        Log_OC.loadImage($r9, "currentUser.execute(io, main).subscribe(\n                    {\n                        analytics.onAmountEntered(it.phoneNumber, true)\n                    },\n                    {\n                        it.printStackTrace()\n                    }\n                )");
        C11280b $r10 = this.this$0.compositeDisposable;
        RxExtKt.addTo($r9, $r10);
        boolean $z02 = this.$isCashOutFlow;
        if ($z02) {
            TransferToBankAmountPresenter $r23 = this.this$0;
            TransferToBankPayload $r11 = this.$request;
            $r23.fetchServiceFee($r11);
        } else {
            boolean $z03 = this.$isFromSummaryPage;
            if ($z03) {
                MainTransferView $r12 = this.this$0.mainTransferView;
                TransferToBankPayload $r112 = this.$request;
                MainTransferView.DefaultImpls.navigateToBankTransferSummaryPage$default($r12, $r112, false, 2, null);
            } else {
                MainTransferView $r122 = this.this$0.mainTransferView;
                TransferToBankPayload $r113 = this.$request;
                MainTransferView.DefaultImpls.navigateToCustomersInformationPage$default($r122, $r113, false, 2, null);
            }
        }
        TransferToBankAmountPresenter $r24 = this.this$0;
        C0657f $r13 = C0657f.f1822f;
        $r24.ifViewAttached($r13);
    }
}
