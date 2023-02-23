package ai.kudi.agent.settings.account.p025ui.fragment;

import ai.kudi.agent.settings.navigators.SettingsNavigator;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.account.ui.fragment.PosActivationNotificationReceiverFragment_MembersInjector */
/* loaded from: classes.dex */
public final class PosActivationNotificationReceiverFragment_MembersInjector implements InterfaceC9463a<PosActivationNotificationReceiverFragment> {
    private final InterfaceC11700a<SettingsNavigator> settingsNavigatorProvider;

    public PosActivationNotificationReceiverFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.settingsNavigatorProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        PosActivationNotificationReceiverFragment_MembersInjector $r1 = new PosActivationNotificationReceiverFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectSettingsNavigator(PosActivationNotificationReceiverFragment posActivationNotificationReceiverFragment, SettingsNavigator settingsNavigator) {
        posActivationNotificationReceiverFragment.settingsNavigator = settingsNavigator;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(PosActivationNotificationReceiverFragment posActivationNotificationReceiverFragment) {
        InterfaceC11700a $r3 = this.settingsNavigatorProvider;
        Object $r2 = $r3.get();
        SettingsNavigator $r4 = (SettingsNavigator) $r2;
        injectSettingsNavigator(posActivationNotificationReceiverFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        PosActivationNotificationReceiverFragment $r2 = (PosActivationNotificationReceiverFragment) obj;
        injectMembers($r2);
    }
}
