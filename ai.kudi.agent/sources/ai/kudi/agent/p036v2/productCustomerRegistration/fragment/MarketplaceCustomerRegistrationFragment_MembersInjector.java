package ai.kudi.agent.p036v2.productCustomerRegistration.fragment;

import ai.kudi.agent.p036v2.productCustomerRegistration.viewModel.MarketplaceCustomerRegistrationViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.productCustomerRegistration.fragment.MarketplaceCustomerRegistrationFragment_MembersInjector */
/* loaded from: classes.dex */
public final class MarketplaceCustomerRegistrationFragment_MembersInjector implements InterfaceC9463a<MarketplaceCustomerRegistrationFragment> {
    private final InterfaceC11700a<MarketplaceCustomerRegistrationViewModel> marketplaceCustomerRegistrationViewModelProvider;

    public MarketplaceCustomerRegistrationFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.marketplaceCustomerRegistrationViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        MarketplaceCustomerRegistrationFragment_MembersInjector $r1 = new MarketplaceCustomerRegistrationFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectMarketplaceCustomerRegistrationViewModel(MarketplaceCustomerRegistrationFragment marketplaceCustomerRegistrationFragment, MarketplaceCustomerRegistrationViewModel marketplaceCustomerRegistrationViewModel) {
        marketplaceCustomerRegistrationFragment.marketplaceCustomerRegistrationViewModel = marketplaceCustomerRegistrationViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(MarketplaceCustomerRegistrationFragment marketplaceCustomerRegistrationFragment) {
        InterfaceC11700a $r3 = this.marketplaceCustomerRegistrationViewModelProvider;
        Object $r2 = $r3.get();
        MarketplaceCustomerRegistrationViewModel $r4 = (MarketplaceCustomerRegistrationViewModel) $r2;
        injectMarketplaceCustomerRegistrationViewModel(marketplaceCustomerRegistrationFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        MarketplaceCustomerRegistrationFragment $r2 = (MarketplaceCustomerRegistrationFragment) obj;
        injectMembers($r2);
    }
}
