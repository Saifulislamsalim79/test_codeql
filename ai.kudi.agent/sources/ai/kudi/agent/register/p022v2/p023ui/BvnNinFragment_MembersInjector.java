package ai.kudi.agent.register.p022v2.p023ui;

import ai.kudi.agent.register.p022v2.p023ui.viewModels.PhoneAndBvnViewModel;
import android.content.SharedPreferences;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.register.v2.ui.BvnNinFragment_MembersInjector */
/* loaded from: classes.dex */
public final class BvnNinFragment_MembersInjector implements InterfaceC9463a<BvnNinFragment> {
    private final InterfaceC11700a<SharedPreferences> sharedPrefsProvider;
    private final InterfaceC11700a<PhoneAndBvnViewModel> vmProvider;

    public BvnNinFragment_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.sharedPrefsProvider = interfaceC11700a;
        this.vmProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        BvnNinFragment_MembersInjector $r2 = new BvnNinFragment_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectSharedPrefs(BvnNinFragment bvnNinFragment, SharedPreferences sharedPreferences) {
        bvnNinFragment.sharedPrefs = sharedPreferences;
    }

    public static void injectVm(BvnNinFragment bvnNinFragment, PhoneAndBvnViewModel phoneAndBvnViewModel) {
        bvnNinFragment.srv = phoneAndBvnViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(BvnNinFragment bvnNinFragment) {
        InterfaceC11700a $r2 = this.sharedPrefsProvider;
        Object $r3 = $r2.get();
        SharedPreferences $r4 = (SharedPreferences) $r3;
        injectSharedPrefs(bvnNinFragment, $r4);
        InterfaceC11700a $r22 = this.vmProvider;
        Object $r32 = $r22.get();
        PhoneAndBvnViewModel $r5 = (PhoneAndBvnViewModel) $r32;
        injectVm(bvnNinFragment, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        BvnNinFragment $r2 = (BvnNinFragment) obj;
        injectMembers($r2);
    }
}
