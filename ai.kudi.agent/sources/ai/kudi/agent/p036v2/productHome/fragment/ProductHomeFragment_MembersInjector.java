package ai.kudi.agent.p036v2.productHome.fragment;

import ai.kudi.agent.analytics.SmartLookAnalytics;
import ai.kudi.agent.p036v2.productHome.viewModel.ProductHomeViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.productHome.fragment.ProductHomeFragment_MembersInjector */
/* loaded from: classes.dex */
public final class ProductHomeFragment_MembersInjector implements InterfaceC9463a<ProductHomeFragment> {
    private final InterfaceC11700a<ProductHomeViewModel> productHomeViewModelProvider;
    private final InterfaceC11700a<SmartLookAnalytics> smartLookAnalyticsProvider;

    public ProductHomeFragment_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.productHomeViewModelProvider = interfaceC11700a;
        this.smartLookAnalyticsProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        ProductHomeFragment_MembersInjector $r2 = new ProductHomeFragment_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectProductHomeViewModel(ProductHomeFragment productHomeFragment, ProductHomeViewModel productHomeViewModel) {
        productHomeFragment.productHomeViewModel = productHomeViewModel;
    }

    public static void injectSmartLookAnalytics(ProductHomeFragment productHomeFragment, SmartLookAnalytics smartLookAnalytics) {
        productHomeFragment.smartLookAnalytics = smartLookAnalytics;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(ProductHomeFragment productHomeFragment) {
        InterfaceC11700a $r2 = this.productHomeViewModelProvider;
        Object $r3 = $r2.get();
        ProductHomeViewModel $r4 = (ProductHomeViewModel) $r3;
        injectProductHomeViewModel(productHomeFragment, $r4);
        InterfaceC11700a $r22 = this.smartLookAnalyticsProvider;
        Object $r32 = $r22.get();
        SmartLookAnalytics $r5 = (SmartLookAnalytics) $r32;
        injectSmartLookAnalytics(productHomeFragment, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        ProductHomeFragment $r2 = (ProductHomeFragment) obj;
        injectMembers($r2);
    }
}
