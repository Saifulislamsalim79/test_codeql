package ai.kudi.agent.settings.p029ui;

import ai.kudi.agent.register.p021ui.viewmodels.ContainerViewModel;
import android.content.SharedPreferences;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.ui.BvnExistingAgentActivity_MembersInjector */
/* loaded from: classes.dex */
public final class BvnExistingAgentActivity_MembersInjector implements InterfaceC9463a<BvnExistingAgentActivity> {
    private final InterfaceC11700a<ContainerViewModel> containerViewModelProvider;
    private final InterfaceC11700a<SharedPreferences> sharedPrefProvider;

    public BvnExistingAgentActivity_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.containerViewModelProvider = interfaceC11700a;
        this.sharedPrefProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        BvnExistingAgentActivity_MembersInjector $r2 = new BvnExistingAgentActivity_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectContainerViewModel(BvnExistingAgentActivity bvnExistingAgentActivity, ContainerViewModel containerViewModel) {
        bvnExistingAgentActivity.containerViewModel = containerViewModel;
    }

    public static void injectSharedPref(BvnExistingAgentActivity bvnExistingAgentActivity, SharedPreferences sharedPreferences) {
        bvnExistingAgentActivity.sharedPref = sharedPreferences;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(BvnExistingAgentActivity bvnExistingAgentActivity) {
        InterfaceC11700a $r2 = this.containerViewModelProvider;
        Object $r3 = $r2.get();
        ContainerViewModel $r4 = (ContainerViewModel) $r3;
        injectContainerViewModel(bvnExistingAgentActivity, $r4);
        InterfaceC11700a $r22 = this.sharedPrefProvider;
        Object $r32 = $r22.get();
        SharedPreferences $r5 = (SharedPreferences) $r32;
        injectSharedPref(bvnExistingAgentActivity, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        BvnExistingAgentActivity $r2 = (BvnExistingAgentActivity) obj;
        injectMembers($r2);
    }
}
