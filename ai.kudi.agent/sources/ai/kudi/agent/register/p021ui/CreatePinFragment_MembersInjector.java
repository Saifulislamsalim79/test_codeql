package ai.kudi.agent.register.p021ui;

import ai.kudi.agent.register.p021ui.viewmodels.CreatePinViewModel;
import android.content.SharedPreferences;
import com.google.firebase.remoteconfig.Frame;
import com.google.firebase.remoteconfig.k;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.register.ui.CreatePinFragment_MembersInjector */
/* loaded from: classes.dex */
public final class CreatePinFragment_MembersInjector implements InterfaceC9463a<CreatePinFragment> {
    private final InterfaceC11700a<k> remoteConfigProvider;
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;
    private final InterfaceC11700a<CreatePinViewModel> vmProvider;

    public CreatePinFragment_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.vmProvider = interfaceC11700a;
        this.remoteConfigProvider = interfaceC11700a2;
        this.sharedPreferencesProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        CreatePinFragment_MembersInjector $r3 = new CreatePinFragment_MembersInjector(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    public static void injectRemoteConfig(CreatePinFragment createPinFragment, Frame frame) {
        createPinFragment.remoteConfig = frame;
    }

    public static void injectSharedPreferences(CreatePinFragment createPinFragment, SharedPreferences sharedPreferences) {
        createPinFragment.sharedPreferences = sharedPreferences;
    }

    public static void injectVm(CreatePinFragment createPinFragment, CreatePinViewModel createPinViewModel) {
        createPinFragment.srv = createPinViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(CreatePinFragment createPinFragment) {
        InterfaceC11700a $r2 = this.vmProvider;
        Object $r3 = $r2.get();
        CreatePinViewModel $r4 = (CreatePinViewModel) $r3;
        injectVm(createPinFragment, $r4);
        InterfaceC11700a $r22 = this.remoteConfigProvider;
        Object $r32 = $r22.get();
        Frame $r5 = (Frame) $r32;
        injectRemoteConfig(createPinFragment, $r5);
        InterfaceC11700a $r23 = this.sharedPreferencesProvider;
        Object $r33 = $r23.get();
        SharedPreferences $r6 = (SharedPreferences) $r33;
        injectSharedPreferences(createPinFragment, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        CreatePinFragment $r2 = (CreatePinFragment) obj;
        injectMembers($r2);
    }
}
