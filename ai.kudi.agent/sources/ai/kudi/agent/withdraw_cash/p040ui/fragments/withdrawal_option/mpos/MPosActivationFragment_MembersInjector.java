package ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.mpos;

import ai.kudi.agent.withdraw_cash.p040ui.viewmodels.withdrawal_option.mpos.MPosActivationViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.withdraw_cash.ui.fragments.withdrawal_option.mpos.MPosActivationFragment_MembersInjector */
/* loaded from: classes.dex */
public final class MPosActivationFragment_MembersInjector implements InterfaceC9463a<MPosActivationFragment> {
    private final InterfaceC11700a<MPosActivationViewModel> screenViewModelProvider;

    public MPosActivationFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.screenViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        MPosActivationFragment_MembersInjector $r1 = new MPosActivationFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectScreenViewModel(MPosActivationFragment mPosActivationFragment, MPosActivationViewModel mPosActivationViewModel) {
        mPosActivationFragment.screenViewModel = mPosActivationViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(MPosActivationFragment mPosActivationFragment) {
        InterfaceC11700a $r3 = this.screenViewModelProvider;
        Object $r2 = $r3.get();
        MPosActivationViewModel $r4 = (MPosActivationViewModel) $r2;
        injectScreenViewModel(mPosActivationFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        MPosActivationFragment $r2 = (MPosActivationFragment) obj;
        injectMembers($r2);
    }
}
