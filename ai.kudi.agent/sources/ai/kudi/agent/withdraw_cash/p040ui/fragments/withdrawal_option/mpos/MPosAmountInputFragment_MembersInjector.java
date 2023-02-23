package ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.mpos;

import ai.kudi.agent.common_screens.amount_input.p003ui.fragments.BaseAmountInputFragment_MembersInjector;
import ai.kudi.agent.core.util.Pref;
import ai.kudi.agent.withdraw_cash.p040ui.viewmodels.withdrawal_option.mpos.MPosAmountInputViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.withdraw_cash.ui.fragments.withdrawal_option.mpos.MPosAmountInputFragment_MembersInjector */
/* loaded from: classes.dex */
public final class MPosAmountInputFragment_MembersInjector implements InterfaceC9463a<MPosAmountInputFragment> {
    private final InterfaceC11700a<Pref> prefProvider;
    private final InterfaceC11700a<MPosAmountInputViewModel> screenViewModelProvider;

    public MPosAmountInputFragment_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.screenViewModelProvider = interfaceC11700a;
        this.prefProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        MPosAmountInputFragment_MembersInjector $r2 = new MPosAmountInputFragment_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectPref(MPosAmountInputFragment mPosAmountInputFragment, Pref pref) {
        mPosAmountInputFragment.pref = pref;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(MPosAmountInputFragment mPosAmountInputFragment) {
        InterfaceC11700a $r2 = this.screenViewModelProvider;
        Object $r3 = $r2.get();
        MPosAmountInputViewModel $r4 = (MPosAmountInputViewModel) $r3;
        BaseAmountInputFragment_MembersInjector.injectScreenViewModel(mPosAmountInputFragment, $r4);
        InterfaceC11700a $r22 = this.prefProvider;
        Object $r32 = $r22.get();
        Pref $r5 = (Pref) $r32;
        injectPref(mPosAmountInputFragment, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        MPosAmountInputFragment $r2 = (MPosAmountInputFragment) obj;
        injectMembers($r2);
    }
}
