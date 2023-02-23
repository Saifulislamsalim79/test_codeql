package ai.kudi.agent.outlet_mgt.fragments;

import ai.kudi.agent.outlet_mgt.viewmodels.OutletsListingViewModel;
import android.content.SharedPreferences;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class OutletsListingFragment_MembersInjector implements InterfaceC9463a<OutletsListingFragment> {
    private final InterfaceC11700a<OutletsListingViewModel> screenViewModelProvider;
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;

    public OutletsListingFragment_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.screenViewModelProvider = interfaceC11700a;
        this.sharedPreferencesProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        OutletsListingFragment_MembersInjector $r2 = new OutletsListingFragment_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectScreenViewModel(OutletsListingFragment outletsListingFragment, OutletsListingViewModel outletsListingViewModel) {
        outletsListingFragment.screenViewModel = outletsListingViewModel;
    }

    public static void injectSharedPreferences(OutletsListingFragment outletsListingFragment, SharedPreferences sharedPreferences) {
        outletsListingFragment.sharedPreferences = sharedPreferences;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(OutletsListingFragment outletsListingFragment) {
        InterfaceC11700a $r2 = this.screenViewModelProvider;
        Object $r3 = $r2.get();
        OutletsListingViewModel $r4 = (OutletsListingViewModel) $r3;
        injectScreenViewModel(outletsListingFragment, $r4);
        InterfaceC11700a $r22 = this.sharedPreferencesProvider;
        Object $r32 = $r22.get();
        SharedPreferences $r5 = (SharedPreferences) $r32;
        injectSharedPreferences(outletsListingFragment, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        OutletsListingFragment $r2 = (OutletsListingFragment) obj;
        injectMembers($r2);
    }
}
