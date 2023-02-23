package ai.kudi.agent.users.viewmodels;

import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.usecases.FetchKCash;
import ai.kudi.agent.users.viewmodels.data.KCashTopupViewData;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: KCashTopupViewModel.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/users/viewmodels/KCashTopupViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/users/viewmodels/data/KCashTopupViewData;", "fetchKCash", "Lai/kudi/agent/users/domain/usecases/FetchKCash;", "(Lai/kudi/agent/users/domain/usecases/FetchKCash;)V", "initialData", OpsMetricTracker.START, "", TransactionField.AMOUNT, "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class KCashTopupViewModel extends BaseViewModel<KCashTopupViewData> {
    private final FetchKCash fetchKCash;

    public KCashTopupViewModel(FetchKCash fetchKCash) {
        Log_OC.getArray(fetchKCash, "fetchKCash");
        this.fetchKCash = fetchKCash;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: start$lambda-0  reason: not valid java name */
    public static final void m41480start$lambda0(KCashTopupViewModel kCashTopupViewModel, List list) {
        Log_OC.getArray(kCashTopupViewModel, "this$0");
        ViewData $r2 = kCashTopupViewModel.getState();
        KCashTopupViewData $r3 = (KCashTopupViewData) $r2;
        kCashTopupViewModel.publish(KCashTopupViewData.copy$default($r3, false, list, false, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: start$lambda-1  reason: not valid java name */
    public static final void m41481start$lambda1(KCashTopupViewModel kCashTopupViewModel, Throwable th) {
        Log_OC.getArray(kCashTopupViewModel, "this$0");
        th.printStackTrace();
        ViewData $r2 = kCashTopupViewModel.getState();
        KCashTopupViewData $r3 = (KCashTopupViewData) $r2;
        kCashTopupViewModel.publish(KCashTopupViewData.copy$default($r3, false, null, true, 3, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        KCashTopupViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public KCashTopupViewData initialData() {
        KCashTopupViewData $r1 = new KCashTopupViewData(true, null, false, 4, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void start(int i) {
        ViewData $r1 = getState();
        KCashTopupViewData $r2 = (KCashTopupViewData) $r1;
        publish(KCashTopupViewData.copy$default($r2, true, null, false, 6, null));
        FetchKCash $r3 = this.fetchKCash;
        AbstractC11688p $r4 = $r3.execute(i);
        FavoritesArrayAdapter $r7 = $r4.e0(new Object() { // from class: ai.kudi.agent.users.viewmodels.IOUtils$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                KCashTopupViewModel $r12 = KCashTopupViewModel.this;
                List $r32 = (List) obj;
                KCashTopupViewModel.m41480start$lambda0($r12, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.users.viewmodels.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                KCashTopupViewModel $r12 = KCashTopupViewModel.this;
                Throwable $r32 = (Throwable) obj;
                KCashTopupViewModel.m41481start$lambda1($r12, $r32);
            }
        });
        Log_OC.loadImage($r7, "fetchKCash.execute(amount)\n            .subscribe(\n                {\n                    publish(state.copy(loading = false, instructions = it))\n                },\n                {\n                    it.printStackTrace()\n                    publish(state.copy(error = true))\n                }\n            )");
        C11280b $r8 = getCompositeDisposable();
        RxExtKt.addTo($r7, $r8);
    }
}
