package ai.kudi.agent.common_screens.amount_input.p003ui.fragments;

import ai.kudi.agent.common_screens.amount_input.p003ui.viewdata.BaseAmountInputViewData;
import ai.kudi.agent.common_screens.amount_input.p003ui.viewmodels.BaseAmountInputViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.common_screens.amount_input.ui.fragments.BaseAmountInputFragment_MembersInjector */
/* loaded from: classes.dex */
public final class BaseAmountInputFragment_MembersInjector<VM extends BaseAmountInputViewModel<VD>, VD extends BaseAmountInputViewData> implements InterfaceC9463a<BaseAmountInputFragment<VM, VD>> {
    private final InterfaceC11700a<VM> screenViewModelProvider;

    public BaseAmountInputFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.screenViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        BaseAmountInputFragment_MembersInjector $r1 = new BaseAmountInputFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void injectScreenViewModel(BaseAmountInputFragment baseAmountInputFragment, BaseAmountInputViewModel baseAmountInputViewModel) {
        baseAmountInputFragment.screenViewModel = baseAmountInputViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(BaseAmountInputFragment baseAmountInputFragment) {
        InterfaceC11700a $r3 = this.screenViewModelProvider;
        Object $r2 = $r3.get();
        BaseAmountInputViewModel $r4 = (BaseAmountInputViewModel) $r2;
        injectScreenViewModel(baseAmountInputFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        BaseAmountInputFragment $r2 = (BaseAmountInputFragment) obj;
        injectMembers($r2);
    }
}
