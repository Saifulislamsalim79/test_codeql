package ai.kudi.agent.outlet_mgt.activities;

import ai.kudi.agent.outlet_mgt.viewmodels.OutletMgtAcceptDeclineVm;
import android.content.SharedPreferences;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class OutletMgtAcceptDeclineActivity_MembersInjector implements InterfaceC9463a<OutletMgtAcceptDeclineActivity> {
    private final InterfaceC11700a<OutletMgtAcceptDeclineVm> outletMgtAcceptDeclineVmProvider;
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;

    public OutletMgtAcceptDeclineActivity_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.outletMgtAcceptDeclineVmProvider = interfaceC11700a;
        this.sharedPreferencesProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        OutletMgtAcceptDeclineActivity_MembersInjector $r2 = new OutletMgtAcceptDeclineActivity_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectOutletMgtAcceptDeclineVm(OutletMgtAcceptDeclineActivity outletMgtAcceptDeclineActivity, OutletMgtAcceptDeclineVm outletMgtAcceptDeclineVm) {
        outletMgtAcceptDeclineActivity.outletMgtAcceptDeclineVm = outletMgtAcceptDeclineVm;
    }

    public static void injectSharedPreferences(OutletMgtAcceptDeclineActivity outletMgtAcceptDeclineActivity, SharedPreferences sharedPreferences) {
        outletMgtAcceptDeclineActivity.sharedPreferences = sharedPreferences;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(OutletMgtAcceptDeclineActivity outletMgtAcceptDeclineActivity) {
        InterfaceC11700a $r2 = this.outletMgtAcceptDeclineVmProvider;
        Object $r3 = $r2.get();
        OutletMgtAcceptDeclineVm $r4 = (OutletMgtAcceptDeclineVm) $r3;
        injectOutletMgtAcceptDeclineVm(outletMgtAcceptDeclineActivity, $r4);
        InterfaceC11700a $r22 = this.sharedPreferencesProvider;
        Object $r32 = $r22.get();
        SharedPreferences $r5 = (SharedPreferences) $r32;
        injectSharedPreferences(outletMgtAcceptDeclineActivity, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        OutletMgtAcceptDeclineActivity $r2 = (OutletMgtAcceptDeclineActivity) obj;
        injectMembers($r2);
    }
}
