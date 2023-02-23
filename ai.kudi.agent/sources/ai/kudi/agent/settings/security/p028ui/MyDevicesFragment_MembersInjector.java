package ai.kudi.agent.settings.security.p028ui;

import ai.kudi.agent.settings.security.p028ui.viewModels.MyDevicesViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.security.ui.MyDevicesFragment_MembersInjector */
/* loaded from: classes.dex */
public final class MyDevicesFragment_MembersInjector implements InterfaceC9463a<MyDevicesFragment> {
    private final InterfaceC11700a<MyDevicesViewModel> myDevicesViewModelProvider;

    public MyDevicesFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.myDevicesViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        MyDevicesFragment_MembersInjector $r1 = new MyDevicesFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectMyDevicesViewModel(MyDevicesFragment myDevicesFragment, MyDevicesViewModel myDevicesViewModel) {
        myDevicesFragment.myDevicesViewModel = myDevicesViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(MyDevicesFragment myDevicesFragment) {
        InterfaceC11700a $r3 = this.myDevicesViewModelProvider;
        Object $r2 = $r3.get();
        MyDevicesViewModel $r4 = (MyDevicesViewModel) $r2;
        injectMyDevicesViewModel(myDevicesFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        MyDevicesFragment $r2 = (MyDevicesFragment) obj;
        injectMembers($r2);
    }
}
