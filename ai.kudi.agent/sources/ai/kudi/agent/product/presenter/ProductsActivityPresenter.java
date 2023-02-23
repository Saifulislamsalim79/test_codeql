package ai.kudi.agent.product.presenter;

import ai.kudi.agent.bills.data.Biller;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.product.other_bills.p018ui.BillPaymentStepOneFragment;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import h.d.a.c.e;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import p272h.p364d.p365a.p366c.LoginListener;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: ProductsActivityPresenter.kt */
@Metadata(m10422d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m10421d2 = {"Lai/kudi/agent/product/presenter/ProductsActivityPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/analytics/Analytics;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "attachView", "", "view", "destroy", "detachView", "retainInstance", "", "onViewCreated", BillPaymentStepOneFragment.BILLER_PARAM, "Lai/kudi/agent/bills/data/Biller;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ProductsActivityPresenter implements InterfaceC9413d<e> {
    private final Analytics analytics;
    private final C11280b disposables;
    private final FetchCurrentUser fetchCurrentUser;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ProductsActivityPresenter(FetchCurrentUser fetchCurrentUser, Analytics analytics) {
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(analytics, "analytics");
        this.fetchCurrentUser = fetchCurrentUser;
        this.analytics = analytics;
        C11280b $r3 = new C11280b();
        this.disposables = $r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m40224onViewCreated$lambda0(ProductsActivityPresenter productsActivityPresenter, Biller biller, User user) {
        Log_OC.getArray(productsActivityPresenter, "this$0");
        Log_OC.getArray(biller, "$biller");
        Analytics $r3 = productsActivityPresenter.analytics;
        String $r4 = user.getPhoneNumber();
        Log_OC.loadImage($r4, "it.phoneNumber");
        String $r5 = biller.getName();
        String $r6 = biller.getLookupId();
        $r3.onBillerMenuClick($r4, $r5, $r6);
    }

    public void attachView(LoginListener loginListener) {
        Log_OC.getArray(loginListener, "view");
    }

    @Override // p272h.p364d.p365a.p366c.InterfaceC9413d
    public void destroy() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.InterfaceC9413d
    public void detachView() {
        C11280b $r1 = this.disposables;
        $r1.m11214d();
    }

    public void detachView(boolean z) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onViewCreated(final Biller biller) {
        Log_OC.getArray(biller, BillPaymentStepOneFragment.BILLER_PARAM);
        FetchCurrentUser $r2 = this.fetchCurrentUser;
        AbstractC11696w $r3 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        p425j.p444e.Item $r4 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11696w $r32 = $r3.u($r4);
        p425j.p444e.Item $r42 = ContextUtils.LogError();
        AbstractC11696w $r33 = $r32.n($r42);
        Object object = new Object() { // from class: ai.kudi.agent.product.presenter.InBandBytestreamSession$IBBDataPacketFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ProductsActivityPresenter $r1 = ProductsActivityPresenter.this;
                Biller $r22 = biller;
                User $r43 = (User) obj;
                ProductsActivityPresenter.m40224onViewCreated$lambda0($r1, $r22, $r43);
            }
        };
        Logger $r6 = Logger.log;
        FavoritesArrayAdapter $r7 = $r33.s(object, $r6);
        Log_OC.loadImage($r7, "fetchCurrentUser.execute().subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread())\n            .subscribe(\n                {\n                    analytics.onBillerMenuClick(it.phoneNumber, biller.name, biller.lookupId)\n                },\n                {\n                    it.printStackTrace()\n                }\n            )");
        C11280b $r8 = this.disposables;
        $r8.b($r7);
    }
}
