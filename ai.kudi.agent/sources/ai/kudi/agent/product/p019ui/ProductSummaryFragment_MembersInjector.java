package ai.kudi.agent.product.p019ui;

import ai.kudi.agent.product.presenter.ProductSummaryPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.product.ui.ProductSummaryFragment_MembersInjector */
/* loaded from: classes.dex */
public final class ProductSummaryFragment_MembersInjector implements InterfaceC9463a<ProductSummaryFragment> {
    private final InterfaceC11700a<ProductSummaryPresenter> thisPresenterProvider;

    public ProductSummaryFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.thisPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        ProductSummaryFragment_MembersInjector $r1 = new ProductSummaryFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectThisPresenter(ProductSummaryFragment productSummaryFragment, ProductSummaryPresenter productSummaryPresenter) {
        productSummaryFragment.thisPresenter = productSummaryPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(ProductSummaryFragment productSummaryFragment) {
        InterfaceC11700a $r3 = this.thisPresenterProvider;
        Object $r2 = $r3.get();
        ProductSummaryPresenter $r4 = (ProductSummaryPresenter) $r2;
        injectThisPresenter(productSummaryFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        ProductSummaryFragment $r2 = (ProductSummaryFragment) obj;
        injectMembers($r2);
    }
}
