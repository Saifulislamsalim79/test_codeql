package ai.kudi.agent.register.p021ui;

import ai.kudi.agent.register.p021ui.viewmodels.BusinessInfoViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.register.ui.BusinessInfoFragment_MembersInjector */
/* loaded from: classes.dex */
public final class BusinessInfoFragment_MembersInjector implements InterfaceC9463a<BusinessInfoFragment> {
    private final InterfaceC11700a<BusinessInfoViewModel> vmProvider;

    public BusinessInfoFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.vmProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        BusinessInfoFragment_MembersInjector $r1 = new BusinessInfoFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectVm(BusinessInfoFragment businessInfoFragment, BusinessInfoViewModel businessInfoViewModel) {
        businessInfoFragment.srv = businessInfoViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(BusinessInfoFragment businessInfoFragment) {
        InterfaceC11700a $r3 = this.vmProvider;
        Object $r2 = $r3.get();
        BusinessInfoViewModel $r4 = (BusinessInfoViewModel) $r2;
        injectVm(businessInfoFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        BusinessInfoFragment $r2 = (BusinessInfoFragment) obj;
        injectMembers($r2);
    }
}
