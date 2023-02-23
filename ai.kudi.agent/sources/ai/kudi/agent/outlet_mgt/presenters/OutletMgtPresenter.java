package ai.kudi.agent.outlet_mgt.presenters;

import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.outlet_mgt.data.CreateOutletRequest;
import ai.kudi.agent.outlet_mgt.navigator.OutletMgtNavigator;
import ai.kudi.agent.outlet_mgt.views.OutletMgtView;
import ai.kudi.agent.register.domain.usecases.BaseOtpUtil;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
/* compiled from: OutletMgtPresenter.kt */
@Metadata(m10422d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/presenters/OutletMgtPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/outlet_mgt/views/OutletMgtView;", "baseOtpUtil", "Lai/kudi/agent/register/domain/usecases/BaseOtpUtil;", "outletMgtNavigator", "Lai/kudi/agent/outlet_mgt/navigator/OutletMgtNavigator;", "(Lai/kudi/agent/register/domain/usecases/BaseOtpUtil;Lai/kudi/agent/outlet_mgt/navigator/OutletMgtNavigator;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "destroy", "", "sendOtpForCreateOutlet", "phoneNumber", "", "createOutletRequest", "Lai/kudi/agent/outlet_mgt/data/CreateOutletRequest;", "verifyOtpCreateOutlet", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OutletMgtPresenter extends C9410b<OutletMgtView> {
    private final BaseOtpUtil baseOtpUtil;
    private final C11280b compositeDisposable;
    private final OutletMgtNavigator outletMgtNavigator;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public OutletMgtPresenter(BaseOtpUtil baseOtpUtil, OutletMgtNavigator outletMgtNavigator) {
        Log_OC.getArray(baseOtpUtil, "baseOtpUtil");
        Log_OC.getArray(outletMgtNavigator, "outletMgtNavigator");
        this.baseOtpUtil = baseOtpUtil;
        this.outletMgtNavigator = outletMgtNavigator;
        C11280b $r3 = new C11280b();
        this.compositeDisposable = $r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendOtpForCreateOutlet$lambda-0  reason: not valid java name */
    public static final void m39889sendOtpForCreateOutlet$lambda0(OutletMgtView outletMgtView) {
        Log_OC.getArray(outletMgtView, "it");
        outletMgtView.toggleOtpLoading(true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.C9410b, p272h.p364d.p365a.p366c.InterfaceC9413d
    public void destroy() {
        super.destroy();
        C11280b $r1 = this.compositeDisposable;
        $r1.m11212i();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void sendOtpForCreateOutlet(String str, CreateOutletRequest createOutletRequest) {
        Log_OC.getArray(str, "phoneNumber");
        Log_OC.getArray(createOutletRequest, "createOutletRequest");
        Compression $r5 = Compression.METADATA;
        ifViewAttached($r5);
        BaseOtpUtil $r6 = this.baseOtpUtil;
        OutletMgtPresenter$sendOtpForCreateOutlet$2 $r7 = new OutletMgtPresenter$sendOtpForCreateOutlet$2(this);
        OutletMgtPresenter$sendOtpForCreateOutlet$3 $r1 = new OutletMgtPresenter$sendOtpForCreateOutlet$3(this);
        FavoritesArrayAdapter $r2 = $r6.sendOtpForSecondaryDetailsVerification(str, $r7, $r1);
        C11280b $r8 = this.compositeDisposable;
        RxExtKt.addTo($r2, $r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void verifyOtpCreateOutlet(CreateOutletRequest createOutletRequest) {
        Log_OC.getArray(createOutletRequest, "createOutletRequest");
        OutletMgtNavigator $r2 = this.outletMgtNavigator;
        $r2.toCreatePinView(createOutletRequest);
    }
}
