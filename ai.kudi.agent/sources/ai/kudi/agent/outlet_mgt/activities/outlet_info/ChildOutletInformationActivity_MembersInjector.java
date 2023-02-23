package ai.kudi.agent.outlet_mgt.activities.outlet_info;

import ai.kudi.agent.outlet_mgt.viewmodels.outlet_info.ChildOutletInformationViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class ChildOutletInformationActivity_MembersInjector implements InterfaceC9463a<ChildOutletInformationActivity> {
    private final InterfaceC11700a<ChildOutletInformationViewModel> screenViewModelProvider;

    public ChildOutletInformationActivity_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.screenViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        ChildOutletInformationActivity_MembersInjector $r1 = new ChildOutletInformationActivity_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectScreenViewModel(ChildOutletInformationActivity childOutletInformationActivity, ChildOutletInformationViewModel childOutletInformationViewModel) {
        childOutletInformationActivity.screenViewModel = childOutletInformationViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(ChildOutletInformationActivity childOutletInformationActivity) {
        InterfaceC11700a $r3 = this.screenViewModelProvider;
        Object $r2 = $r3.get();
        ChildOutletInformationViewModel $r4 = (ChildOutletInformationViewModel) $r2;
        injectScreenViewModel(childOutletInformationActivity, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        ChildOutletInformationActivity $r2 = (ChildOutletInformationActivity) obj;
        injectMembers($r2);
    }
}
