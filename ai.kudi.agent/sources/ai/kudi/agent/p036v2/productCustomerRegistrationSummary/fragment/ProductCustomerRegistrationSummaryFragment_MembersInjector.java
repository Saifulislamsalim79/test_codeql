package ai.kudi.agent.p036v2.productCustomerRegistrationSummary.fragment;

import ai.kudi.agent.p036v2.productCustomerRegistrationSummary.viewModel.ProductCustomerRegistrationSummaryViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.productCustomerRegistrationSummary.fragment.ProductCustomerRegistrationSummaryFragment_MembersInjector */
/* loaded from: classes.dex */
public final class ProductCustomerRegistrationSummaryFragment_MembersInjector implements InterfaceC9463a<ProductCustomerRegistrationSummaryFragment> {
    private final InterfaceC11700a<ProductCustomerRegistrationSummaryViewModel> productCustomerRegistrationSummaryViewModelProvider;

    public ProductCustomerRegistrationSummaryFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.productCustomerRegistrationSummaryViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        ProductCustomerRegistrationSummaryFragment_MembersInjector $r1 = new ProductCustomerRegistrationSummaryFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectProductCustomerRegistrationSummaryViewModel(ProductCustomerRegistrationSummaryFragment productCustomerRegistrationSummaryFragment, ProductCustomerRegistrationSummaryViewModel productCustomerRegistrationSummaryViewModel) {
        productCustomerRegistrationSummaryFragment.productCustomerRegistrationSummaryViewModel = productCustomerRegistrationSummaryViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(ProductCustomerRegistrationSummaryFragment productCustomerRegistrationSummaryFragment) {
        InterfaceC11700a $r3 = this.productCustomerRegistrationSummaryViewModelProvider;
        Object $r2 = $r3.get();
        ProductCustomerRegistrationSummaryViewModel $r4 = (ProductCustomerRegistrationSummaryViewModel) $r2;
        injectProductCustomerRegistrationSummaryViewModel(productCustomerRegistrationSummaryFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        ProductCustomerRegistrationSummaryFragment $r2 = (ProductCustomerRegistrationSummaryFragment) obj;
        injectMembers($r2);
    }
}
