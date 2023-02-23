package ai.kudi.agent.pos.p016ui.viewModels;

import ai.kudi.agent.pos.navigators.TerminalRequestNavigator;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.pos.ui.viewModels.SelectPosViewModel_Factory */
/* loaded from: classes.dex */
public final class SelectPosViewModel_Factory implements InterfaceC9468d<SelectPosViewModel> {
    private final InterfaceC11700a<TerminalRequestNavigator> terminalRequestNavigatorProvider;

    public SelectPosViewModel_Factory(InterfaceC11700a interfaceC11700a) {
        this.terminalRequestNavigatorProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SelectPosViewModel_Factory create(InterfaceC11700a interfaceC11700a) {
        SelectPosViewModel_Factory $r1 = new SelectPosViewModel_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SelectPosViewModel newInstance(TerminalRequestNavigator terminalRequestNavigator) {
        SelectPosViewModel $r1 = new SelectPosViewModel(terminalRequestNavigator);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public SelectPosViewModel multiply() {
        InterfaceC11700a $r1 = this.terminalRequestNavigatorProvider;
        Object $r2 = $r1.get();
        TerminalRequestNavigator $r3 = (TerminalRequestNavigator) $r2;
        SelectPosViewModel $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40111multiply() {
        SelectPosViewModel $r1 = multiply();
        return $r1;
    }
}
