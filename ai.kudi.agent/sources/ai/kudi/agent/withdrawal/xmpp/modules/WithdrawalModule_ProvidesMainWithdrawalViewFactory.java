package ai.kudi.agent.withdrawal.xmpp.modules;

import ai.kudi.agent.withdrawal.view.MainWithdrawalView;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
/* loaded from: classes.dex */
public final class WithdrawalModule_ProvidesMainWithdrawalViewFactory implements InterfaceC9468d<MainWithdrawalView> {
    private final WithdrawalModule module;

    public WithdrawalModule_ProvidesMainWithdrawalViewFactory(WithdrawalModule withdrawalModule) {
        this.module = withdrawalModule;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static WithdrawalModule_ProvidesMainWithdrawalViewFactory create(WithdrawalModule withdrawalModule) {
        WithdrawalModule_ProvidesMainWithdrawalViewFactory $r1 = new WithdrawalModule_ProvidesMainWithdrawalViewFactory(withdrawalModule);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MainWithdrawalView providesMainWithdrawalView(WithdrawalModule withdrawalModule) {
        MainWithdrawalView $r0 = withdrawalModule.providesMainWithdrawalView();
        C9473g.m14647e($r0);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public MainWithdrawalView cbrt() {
        WithdrawalModule $r2 = this.module;
        MainWithdrawalView $r1 = providesMainWithdrawalView($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: cbrt  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41876cbrt() {
        MainWithdrawalView $r1 = cbrt();
        return $r1;
    }
}
