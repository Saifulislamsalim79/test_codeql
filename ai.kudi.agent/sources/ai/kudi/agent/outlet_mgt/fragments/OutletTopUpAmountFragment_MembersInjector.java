package ai.kudi.agent.outlet_mgt.fragments;

import ai.kudi.agent.common_screens.amount_input.p003ui.fragments.BaseAmountInputFragment_MembersInjector;
import ai.kudi.agent.outlet_mgt.viewmodels.OutletTopUpAmtViewModel;
import android.content.SharedPreferences;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class OutletTopUpAmountFragment_MembersInjector implements InterfaceC9463a<OutletTopUpAmountFragment> {
    private final InterfaceC11700a<OutletTopUpAmtViewModel> outletTopUpAmtViewModelProvider;
    private final InterfaceC11700a<OutletTopUpAmtViewModel> screenViewModelProvider;
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;

    public OutletTopUpAmountFragment_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.screenViewModelProvider = interfaceC11700a;
        this.outletTopUpAmtViewModelProvider = interfaceC11700a2;
        this.sharedPreferencesProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        OutletTopUpAmountFragment_MembersInjector $r3 = new OutletTopUpAmountFragment_MembersInjector(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    public static void injectOutletTopUpAmtViewModel(OutletTopUpAmountFragment outletTopUpAmountFragment, OutletTopUpAmtViewModel outletTopUpAmtViewModel) {
        outletTopUpAmountFragment.outletTopUpAmtViewModel = outletTopUpAmtViewModel;
    }

    public static void injectSharedPreferences(OutletTopUpAmountFragment outletTopUpAmountFragment, SharedPreferences sharedPreferences) {
        outletTopUpAmountFragment.sharedPreferences = sharedPreferences;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(OutletTopUpAmountFragment outletTopUpAmountFragment) {
        InterfaceC11700a $r2 = this.screenViewModelProvider;
        Object $r3 = $r2.get();
        OutletTopUpAmtViewModel $r4 = (OutletTopUpAmtViewModel) $r3;
        BaseAmountInputFragment_MembersInjector.injectScreenViewModel(outletTopUpAmountFragment, $r4);
        InterfaceC11700a $r22 = this.outletTopUpAmtViewModelProvider;
        Object $r32 = $r22.get();
        OutletTopUpAmtViewModel $r42 = (OutletTopUpAmtViewModel) $r32;
        injectOutletTopUpAmtViewModel(outletTopUpAmountFragment, $r42);
        InterfaceC11700a $r23 = this.sharedPreferencesProvider;
        Object $r33 = $r23.get();
        SharedPreferences $r5 = (SharedPreferences) $r33;
        injectSharedPreferences(outletTopUpAmountFragment, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        OutletTopUpAmountFragment $r2 = (OutletTopUpAmountFragment) obj;
        injectMembers($r2);
    }
}
