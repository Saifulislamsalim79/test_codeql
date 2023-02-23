package ai.kudi.agent.kshock.presentation;

import ai.kudi.agent.core.domain.room_entities.MiniKshockDetails;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.kshock.navigator.KShockNavigator;
import ai.kudi.agent.kshock.presentation.viewdata.KshockExistingLoanerViewData;
import ai.kudi.agent.kshock.usecases.FetchExistingLoaner;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import java.math.BigDecimal;
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
/* compiled from: KshockExistingLoanerViewModel.kt */
@Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u0006\u0010\u000f\u001a\u00020\u000bR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m10421d2 = {"Lai/kudi/agent/kshock/presentation/KshockExistingLoanerViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/kshock/presentation/viewdata/KshockExistingLoanerViewData;", "fetchExistingLoaner", "Lai/kudi/agent/kshock/usecases/FetchExistingLoaner;", "kShockNavigator", "Lai/kudi/agent/kshock/navigator/KShockNavigator;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "(Lai/kudi/agent/kshock/usecases/FetchExistingLoaner;Lai/kudi/agent/kshock/navigator/KShockNavigator;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;)V", "applyForLoan", "", "maxLoanAmount", "", "initialData", OpsMetricTracker.START, "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class KshockExistingLoanerViewModel extends BaseViewModel<KshockExistingLoanerViewData> {
    private final FetchCurrentUser fetchCurrentUser;
    private final FetchExistingLoaner fetchExistingLoaner;
    private final KShockNavigator kShockNavigator;

    public KshockExistingLoanerViewModel(FetchExistingLoaner fetchExistingLoaner, KShockNavigator kShockNavigator, FetchCurrentUser fetchCurrentUser) {
        Log_OC.getArray(fetchExistingLoaner, "fetchExistingLoaner");
        Log_OC.getArray(kShockNavigator, "kShockNavigator");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        this.fetchExistingLoaner = fetchExistingLoaner;
        this.kShockNavigator = kShockNavigator;
        this.fetchCurrentUser = fetchCurrentUser;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: start$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m39591start$lambda0(KshockExistingLoanerViewModel kshockExistingLoanerViewModel, User user) {
        Log_OC.getArray(kshockExistingLoanerViewModel, "this$0");
        Log_OC.getArray(user, "it");
        FetchExistingLoaner $r2 = kshockExistingLoanerViewModel.fetchExistingLoaner;
        String $r3 = user.getSessionId();
        Log_OC.loadImage($r3, "it.sessionId");
        AbstractC11688p $r4 = $r2.execute($r3);
        return $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: start$lambda-1  reason: not valid java name */
    public static final void m39592start$lambda1(KshockExistingLoanerViewModel kshockExistingLoanerViewModel, MiniKshockDetails miniKshockDetails) {
        Log_OC.getArray(kshockExistingLoanerViewModel, "this$0");
        KshockExistingLoanerViewData.HideLoading $r2 = KshockExistingLoanerViewData.HideLoading.INSTANCE;
        kshockExistingLoanerViewModel.publish($r2);
        Log_OC.loadImage(miniKshockDetails, "it");
        KshockExistingLoanerViewData.KshockExistingLoaner $r3 = new KshockExistingLoanerViewData.KshockExistingLoaner(miniKshockDetails);
        kshockExistingLoanerViewModel.publish($r3);
        BigDecimal $r4 = miniKshockDetails.getAvailableLoanAmount();
        BigDecimal $r5 = miniKshockDetails.getMaxLoanAmount();
        boolean $z0 = Log_OC.append($r4, $r5);
        if ($z0) {
            KshockExistingLoanerViewData.HideAvailableLoan $r6 = KshockExistingLoanerViewData.HideAvailableLoan.INSTANCE;
            kshockExistingLoanerViewModel.publish($r6);
            return;
        }
        KshockExistingLoanerViewData.ShowAvailableLoan $r7 = KshockExistingLoanerViewData.ShowAvailableLoan.INSTANCE;
        kshockExistingLoanerViewModel.publish($r7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: start$lambda-2  reason: not valid java name */
    public static final void m39593start$lambda2(KshockExistingLoanerViewModel kshockExistingLoanerViewModel, Throwable th) {
        Log_OC.getArray(kshockExistingLoanerViewModel, "this$0");
        InterfaceC11767l $r3 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r4 = $r3.invoke(th);
        String $r5 = (String) $r4;
        KshockExistingLoanerViewData.Error $r2 = new KshockExistingLoanerViewData.Error($r5);
        kshockExistingLoanerViewModel.publish($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void applyForLoan(double d) {
        KShockNavigator $r1 = this.kShockNavigator;
        $r1.toLoanApplicationFragment(d);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        KshockExistingLoanerViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public KshockExistingLoanerViewData initialData() {
        KshockExistingLoanerViewData.Initial r1 = KshockExistingLoanerViewData.Initial.INSTANCE;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void start() {
        KshockExistingLoanerViewData.Loading $r1 = KshockExistingLoanerViewData.Loading.INSTANCE;
        publish($r1);
        FetchCurrentUser $r2 = this.fetchCurrentUser;
        AbstractC11696w $r3 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        AbstractC11688p $r5 = $r3.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.kshock.presentation.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                KshockExistingLoanerViewModel $r12 = KshockExistingLoanerViewModel.this;
                User $r4 = (User) obj;
                InterfaceC11692s $r22 = KshockExistingLoanerViewModel.m39591start$lambda0($r12, $r4);
                return $r22;
            }
        });
        FavoritesArrayAdapter $r8 = $r5.e0(new Object() { // from class: ai.kudi.agent.kshock.presentation.Socks5BytestreamRequest
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                KshockExistingLoanerViewModel $r12 = KshockExistingLoanerViewModel.this;
                MiniKshockDetails $r32 = (MiniKshockDetails) obj;
                KshockExistingLoanerViewModel.m39592start$lambda1($r12, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.kshock.presentation.ToContainsFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                KshockExistingLoanerViewModel $r12 = KshockExistingLoanerViewModel.this;
                Throwable $r32 = (Throwable) obj;
                KshockExistingLoanerViewModel.m39593start$lambda2($r12, $r32);
            }
        });
        C11280b $r9 = getCompositeDisposable();
        $r9.b($r8);
    }
}
