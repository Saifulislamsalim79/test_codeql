package ai.kudi.agent.product.p019ui;

import ai.kudi.agent.product.presenter.ProductsActivityPresenter;
import dagger.android.DispatchingAndroidInjector;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.product.ui.ProductActivity_MembersInjector */
/* loaded from: classes.dex */
public final class ProductActivity_MembersInjector implements InterfaceC9463a<ProductActivity> {
    private final InterfaceC11700a<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final InterfaceC11700a<ProductsActivityPresenter> thisPresenterProvider;

    public ProductActivity_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.thisPresenterProvider = interfaceC11700a;
        this.androidInjectorProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        ProductActivity_MembersInjector $r2 = new ProductActivity_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectAndroidInjector(ProductActivity productActivity, DispatchingAndroidInjector dispatchingAndroidInjector) {
        productActivity.androidInjector = dispatchingAndroidInjector;
    }

    public static void injectThisPresenter(ProductActivity productActivity, ProductsActivityPresenter productsActivityPresenter) {
        productActivity.thisPresenter = productsActivityPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(ProductActivity productActivity) {
        InterfaceC11700a $r2 = this.thisPresenterProvider;
        Object $r3 = $r2.get();
        ProductsActivityPresenter $r4 = (ProductsActivityPresenter) $r3;
        injectThisPresenter(productActivity, $r4);
        InterfaceC11700a $r22 = this.androidInjectorProvider;
        Object $r32 = $r22.get();
        DispatchingAndroidInjector $r5 = (DispatchingAndroidInjector) $r32;
        injectAndroidInjector(productActivity, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        ProductActivity $r2 = (ProductActivity) obj;
        injectMembers($r2);
    }
}
