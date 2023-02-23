package ai.kudi.agent.pos.presentation;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ResourceDelegate;
import ai.kudi.agent.pos.data.PosOrder;
import ai.kudi.agent.pos.presentation.viewstate.PosOrderDetailViewState;
import ai.kudi.agent.pos.usecases.GetPosRequestsDetailUseCase;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p471k0.C11680b;
import p590o.p591a.Timber;
/* compiled from: PosOrderDetailViewModel.kt */
@Metadata(m10422d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m10421d2 = {"Lai/kudi/agent/pos/presentation/PosOrderDetailViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/pos/presentation/viewstate/PosOrderDetailViewState;", "getPosRequestsDetailUseCase", "Lai/kudi/agent/pos/usecases/GetPosRequestsDetailUseCase;", "resource", "Lai/kudi/agent/core/util/ResourceDelegate;", "(Lai/kudi/agent/pos/usecases/GetPosRequestsDetailUseCase;Lai/kudi/agent/core/util/ResourceDelegate;)V", "toastMessage", "Lio/reactivex/subjects/PublishSubject;", "", "getToastMessage", "()Lio/reactivex/subjects/PublishSubject;", "initialData", "Lai/kudi/agent/pos/presentation/viewstate/PosOrderDetailViewState$Loading;", "onViewCreated", "", "orderId", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PosOrderDetailViewModel extends BaseViewModel<PosOrderDetailViewState> {
    private final GetPosRequestsDetailUseCase getPosRequestsDetailUseCase;
    private final ResourceDelegate resource;
    private final C11680b<String> toastMessage;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PosOrderDetailViewModel(GetPosRequestsDetailUseCase getPosRequestsDetailUseCase, ResourceDelegate resourceDelegate) {
        Log_OC.getArray(getPosRequestsDetailUseCase, "getPosRequestsDetailUseCase");
        Log_OC.getArray(resourceDelegate, "resource");
        this.getPosRequestsDetailUseCase = getPosRequestsDetailUseCase;
        this.resource = resourceDelegate;
        C11680b $r1 = C11680b.m10564v0();
        Log_OC.loadImage($r1, "create()");
        this.toastMessage = $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m40030onViewCreated$lambda0(PosOrderDetailViewModel posOrderDetailViewModel, PosOrder posOrder) {
        Log_OC.getArray(posOrderDetailViewModel, "this$0");
        Log_OC.loadImage(posOrder, "it");
        PosOrderDetailViewState.Data $r2 = new PosOrderDetailViewState.Data(posOrder);
        posOrderDetailViewModel.publish($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m40031onViewCreated$lambda1(PosOrderDetailViewModel posOrderDetailViewModel, Throwable th) {
        Log_OC.getArray(posOrderDetailViewModel, "this$0");
        PosOrderDetailViewState.Error $r2 = PosOrderDetailViewState.Error.INSTANCE;
        posOrderDetailViewModel.publish($r2);
        C11680b $r3 = posOrderDetailViewModel.getToastMessage();
        ResourceDelegate $r4 = posOrderDetailViewModel.resource;
        String $r5 = $r4.getString(C0001R.string.error_occurred);
        $r3.mo331f($r5);
        Timber.reorder(th);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C11680b getToastMessage() {
        C11680b r1 = this.toastMessage;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        PosOrderDetailViewState.Loading $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public PosOrderDetailViewState.Loading initialData() {
        PosOrderDetailViewState.Loading r1 = PosOrderDetailViewState.Loading.INSTANCE;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onViewCreated(String str) {
        Log_OC.getArray(str, "orderId");
        PosOrderDetailViewState.Loading $r3 = PosOrderDetailViewState.Loading.INSTANCE;
        publish($r3);
        GetPosRequestsDetailUseCase $r4 = this.getPosRequestsDetailUseCase;
        AbstractC11688p $r5 = $r4.execute(str);
        FavoritesArrayAdapter $r7 = $r5.e0(new Object() { // from class: ai.kudi.agent.pos.presentation.Point
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PosOrderDetailViewModel $r1 = PosOrderDetailViewModel.this;
                PosOrder $r32 = (PosOrder) obj;
                PosOrderDetailViewModel.m40030onViewCreated$lambda0($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.pos.presentation.FlingerListView$ItemFlingerResponder
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PosOrderDetailViewModel $r1 = PosOrderDetailViewModel.this;
                Throwable $r32 = (Throwable) obj;
                PosOrderDetailViewModel.m40031onViewCreated$lambda1($r1, $r32);
            }
        });
        Log_OC.loadImage($r7, "getPosRequestsDetailUseCase.execute(orderId)\n            .subscribe(\n                {\n                    publish(Data(it))\n                },\n                {\n                    publish(Error)\n                    toastMessage.onNext(resource.getString(R.string.error_occurred))\n                    Timber.e(it)\n                }\n            )");
        C11280b $r8 = getCompositeDisposable();
        RxExtKt.addTo($r7, $r8);
    }
}
