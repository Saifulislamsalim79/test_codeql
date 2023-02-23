package ai.kudi.agent.product.other_bills.presenter;

import ai.kudi.agent.bills.data.Biller;
import ai.kudi.agent.bills.data.Product;
import ai.kudi.agent.bills.domain.usecases.LookupRequest;
import ai.kudi.agent.bills.domain.usecases.LookupResponse;
import ai.kudi.agent.bills.domain.usecases.PerformBillerLookup;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.product.other_bills.p018ui.BillPaymentStepOneFragment;
import ai.kudi.agent.product.other_bills.views.BillPaymentStepOneView;
import ai.kudi.agent.product.repository.BillerRepository;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.p474a0.C11703b;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13742z;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: BillPaymentStepOnePresenter.kt */
@Metadata(m10422d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018R\u001a\u0010\b\u001a\u00020\tX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m10421d2 = {"Lai/kudi/agent/product/other_bills/presenter/BillPaymentStepOnePresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/product/other_bills/views/BillPaymentStepOneView;", "billerLookup", "Lai/kudi/agent/bills/domain/usecases/PerformBillerLookup;", "billerRepository", "Lai/kudi/agent/product/repository/BillerRepository;", "(Lai/kudi/agent/bills/domain/usecases/PerformBillerLookup;Lai/kudi/agent/product/repository/BillerRepository;)V", BillPaymentStepOneFragment.BILLER_PARAM, "Lai/kudi/agent/bills/data/Biller;", "getBiller", "()Lai/kudi/agent/bills/data/Biller;", "setBiller", "(Lai/kudi/agent/bills/data/Biller;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "nameLookupRequest", "Lio/reactivex/disposables/Disposable;", "destroy", "", "disposeNameLookUp", "fetchProductsForBiller", "performLookup", "customerId", "", "productId", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class BillPaymentStepOnePresenter extends C9410b<BillPaymentStepOneView> {
    public Biller biller;
    private final PerformBillerLookup billerLookup;
    private final BillerRepository billerRepository;
    private final C11280b compositeDisposable;
    private FavoritesArrayAdapter nameLookupRequest;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BillPaymentStepOnePresenter(PerformBillerLookup performBillerLookup, BillerRepository billerRepository) {
        Log_OC.getArray(performBillerLookup, "billerLookup");
        Log_OC.getArray(billerRepository, "billerRepository");
        this.billerLookup = performBillerLookup;
        this.billerRepository = billerRepository;
        C11280b $r3 = new C11280b();
        this.compositeDisposable = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void disposeNameLookUp() {
        FavoritesArrayAdapter $r1 = this.nameLookupRequest;
        if ($r1 == null) {
            return;
        }
        $r1.backup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchProductsForBiller$lambda-10  reason: not valid java name */
    public static final void m40177fetchProductsForBiller$lambda10(BillPaymentStepOnePresenter billPaymentStepOnePresenter, Throwable th) {
        Log_OC.getArray(billPaymentStepOnePresenter, "this$0");
        ContentType $r2 = ContentType.WILDCARD;
        billPaymentStepOnePresenter.ifViewAttached($r2);
        th.printStackTrace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchProductsForBiller$lambda-10$lambda-9  reason: not valid java name */
    public static final void m40178fetchProductsForBiller$lambda10$lambda9(BillPaymentStepOneView billPaymentStepOneView) {
        Log_OC.getArray(billPaymentStepOneView, "view");
        BillPaymentStepOneView.DefaultImpls.hideLoading$default(billPaymentStepOneView, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchProductsForBiller$lambda-5  reason: not valid java name */
    public static final void m40179fetchProductsForBiller$lambda5(BillPaymentStepOneView billPaymentStepOneView) {
        Log_OC.getArray(billPaymentStepOneView, "it");
        BillPaymentStepOneView.DefaultImpls.showLoading$default(billPaymentStepOneView, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchProductsForBiller$lambda-8  reason: not valid java name */
    public static final void m40180fetchProductsForBiller$lambda8(BillPaymentStepOnePresenter billPaymentStepOnePresenter, final Biller biller, final List list) {
        Log_OC.getArray(billPaymentStepOnePresenter, "this$0");
        Log_OC.getArray(biller, "$biller");
        billPaymentStepOnePresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.product.other_bills.presenter.ByteVector
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
            /* renamed from: a */
            public final void mo14809a(Object obj) {
                Biller $r1 = Biller.this;
                List $r2 = list;
                BillPaymentStepOneView $r4 = (BillPaymentStepOneView) obj;
                BillPaymentStepOnePresenter.m40181fetchProductsForBiller$lambda8$lambda7($r1, $r2, $r4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchProductsForBiller$lambda-8$lambda-7  reason: not valid java name */
    public static final void m40181fetchProductsForBiller$lambda8$lambda7(Biller biller, List list, BillPaymentStepOneView billPaymentStepOneView) {
        List $r2;
        Log_OC.getArray(biller, "$biller");
        Log_OC.getArray(billPaymentStepOneView, "it");
        BillPaymentStepOneView.DefaultImpls.hideLoading$default(billPaymentStepOneView, false, 1, null);
        Log_OC.loadImage(list, "products");
        $r2 = C13742z.m3777u0(list, new Comparator() { // from class: ai.kudi.agent.product.other_bills.presenter.BillPaymentStepOnePresenter$fetchProductsForBiller$lambda-8$lambda-7$$inlined$sortedBy$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int $i0;
                Product $r3 = (Product) obj;
                Integer $r4 = $r3.getAmount();
                Product $r32 = (Product) obj2;
                Integer $r5 = $r32.getAmount();
                $i0 = C11703b.m10416a($r4, $r5);
                return $i0;
            }
        });
        billPaymentStepOneView.setBiller(biller, $r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performLookup$lambda-0  reason: not valid java name */
    public static final void m40182performLookup$lambda0(BillPaymentStepOneView billPaymentStepOneView) {
        Log_OC.getArray(billPaymentStepOneView, "it");
        billPaymentStepOneView.showLoading(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performLookup$lambda-2  reason: not valid java name */
    public static final void m40183performLookup$lambda2(BillPaymentStepOnePresenter billPaymentStepOnePresenter, final LookupResponse lookupResponse) {
        Log_OC.getArray(billPaymentStepOnePresenter, "this$0");
        billPaymentStepOnePresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.product.other_bills.presenter.Attribute
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void setValue(Object obj) {
                LookupResponse $r1 = LookupResponse.this;
                BillPaymentStepOneView $r3 = (BillPaymentStepOneView) obj;
                BillPaymentStepOnePresenter.m40184performLookup$lambda2$lambda1($r1, $r3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performLookup$lambda-2$lambda-1  reason: not valid java name */
    public static final void m40184performLookup$lambda2$lambda1(LookupResponse lookupResponse, BillPaymentStepOneView billPaymentStepOneView) {
        Log_OC.getArray(billPaymentStepOneView, "view");
        billPaymentStepOneView.hideLoading(false);
        String $r2 = lookupResponse.getName();
        String $r3 = lookupResponse.getAddress();
        billPaymentStepOneView.showLookUpResult($r2, $r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performLookup$lambda-4  reason: not valid java name */
    public static final void m40185performLookup$lambda4(BillPaymentStepOnePresenter billPaymentStepOnePresenter, Throwable th) {
        Log_OC.getArray(billPaymentStepOnePresenter, "this$0");
        th.printStackTrace();
        C0399b $r2 = C0399b.f926e;
        billPaymentStepOnePresenter.ifViewAttached($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performLookup$lambda-4$lambda-3  reason: not valid java name */
    public static final void m40186performLookup$lambda4$lambda3(BillPaymentStepOneView billPaymentStepOneView) {
        Log_OC.getArray(billPaymentStepOneView, "view");
        billPaymentStepOneView.hideLoading(false);
        billPaymentStepOneView.showLookUpFailed("Customer name lookup failed. Try again");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.C9410b, p272h.p364d.p365a.p366c.InterfaceC9413d
    public void destroy() {
        super.destroy();
        C11280b $r1 = this.compositeDisposable;
        $r1.m11212i();
        FavoritesArrayAdapter $r2 = this.nameLookupRequest;
        if ($r2 == null) {
            return;
        }
        $r2.backup();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchProductsForBiller(final Biller biller) {
        Log_OC.getArray(biller, BillPaymentStepOneFragment.BILLER_PARAM);
        setBiller(biller);
        MXParser $r2 = MXParser.f920pc;
        ifViewAttached($r2);
        BillerRepository $r3 = this.billerRepository;
        String $r4 = biller.getLookupId();
        AbstractC11696w $r5 = $r3.fetchProductsByBillerId($r4);
        FavoritesArrayAdapter $r8 = $r5.s(new Object() { // from class: ai.kudi.agent.product.other_bills.presenter.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                BillPaymentStepOnePresenter $r1 = BillPaymentStepOnePresenter.this;
                Biller $r22 = biller;
                List $r42 = (List) obj;
                BillPaymentStepOnePresenter.m40180fetchProductsForBiller$lambda8($r1, $r22, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.product.other_bills.presenter.IOUtils$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                BillPaymentStepOnePresenter $r1 = BillPaymentStepOnePresenter.this;
                Throwable $r32 = (Throwable) obj;
                BillPaymentStepOnePresenter.m40177fetchProductsForBiller$lambda10($r1, $r32);
            }
        });
        Log_OC.loadImage($r8, "billerRepository.fetchProductsByBillerId(biller.lookupId)\n            .subscribe(\n                { products ->\n                    ifViewAttached {\n                        it.hideLoading()\n                        it.setBiller(biller, products.sortedBy { it.amount })\n                    }\n                },\n                {\n                    ifViewAttached { view -> view.hideLoading() }\n                    it.printStackTrace()\n                }\n            )");
        C11280b $r9 = this.compositeDisposable;
        RxExtKt.addTo($r8, $r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Biller getBiller() {
        Biller $r1 = this.biller;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError(BillPaymentStepOneFragment.BILLER_PARAM);
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void performLookup(String str, String $r3) {
        Log_OC.getArray(str, "customerId");
        Log_OC.getArray($r3, "productId");
        Operator $r4 = Operator.f924or;
        ifViewAttached($r4);
        disposeNameLookUp();
        PerformBillerLookup $r5 = this.billerLookup;
        Biller $r6 = getBiller();
        boolean $z0 = $r6.getShouldUseProductForLookUp();
        if (!$z0) {
            Biller $r62 = getBiller();
            $r3 = $r62.getLookupId();
        }
        LookupRequest $r1 = new LookupRequest($r3, str);
        AbstractC11688p $r7 = $r5.execute($r1);
        FavoritesArrayAdapter $r10 = $r7.e0(new Object() { // from class: ai.kudi.agent.product.other_bills.presenter.PacketIDFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                BillPaymentStepOnePresenter $r12 = BillPaymentStepOnePresenter.this;
                LookupResponse $r32 = (LookupResponse) obj;
                BillPaymentStepOnePresenter.m40183performLookup$lambda2($r12, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.product.other_bills.presenter.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                BillPaymentStepOnePresenter $r12 = BillPaymentStepOnePresenter.this;
                Throwable $r32 = (Throwable) obj;
                BillPaymentStepOnePresenter.m40185performLookup$lambda4($r12, $r32);
            }
        });
        this.nameLookupRequest = $r10;
    }

    public final void setBiller(Biller biller) {
        Log_OC.getArray(biller, "<set-?>");
        this.biller = biller;
    }
}
