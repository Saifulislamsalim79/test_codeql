package ai.kudi.agent.transfer.generation.modules;

import ai.kudi.agent.voucher.cashin.view.MainTransferView;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
/* loaded from: classes.dex */
public final class MainTransferModule_ProvidesMainTransferViewFactory implements InterfaceC9468d<MainTransferView> {
    private final MainTransferModule module;

    public MainTransferModule_ProvidesMainTransferViewFactory(MainTransferModule mainTransferModule) {
        this.module = mainTransferModule;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MainTransferModule_ProvidesMainTransferViewFactory create(MainTransferModule mainTransferModule) {
        MainTransferModule_ProvidesMainTransferViewFactory $r1 = new MainTransferModule_ProvidesMainTransferViewFactory(mainTransferModule);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MainTransferView providesMainTransferView(MainTransferModule mainTransferModule) {
        MainTransferView $r0 = mainTransferModule.providesMainTransferView();
        C9473g.m14647e($r0);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public MainTransferView cbrt() {
        MainTransferModule $r2 = this.module;
        MainTransferView $r1 = providesMainTransferView($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: cbrt  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41317cbrt() {
        MainTransferView $r1 = cbrt();
        return $r1;
    }
}
