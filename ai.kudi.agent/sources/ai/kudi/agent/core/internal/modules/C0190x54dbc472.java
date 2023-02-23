package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.core.internal.modules.HomeActivityModule;
import ai.kudi.agent.home.HomeActivity;
import ai.kudi.agent.transactionhistory.navigator.TransactionsNavigator;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.core.internal.modules.HomeActivityModule_Companion_ProvidesTransactionsNavigatorFactory */
/* loaded from: classes.dex */
public final class C0190x54dbc472 implements InterfaceC9468d<TransactionsNavigator> {
    private final InterfaceC11700a<HomeActivity> homeActivityProvider;

    public C0190x54dbc472(InterfaceC11700a interfaceC11700a) {
        this.homeActivityProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static C0190x54dbc472 create(InterfaceC11700a interfaceC11700a) {
        C0190x54dbc472 $r1 = new C0190x54dbc472(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionsNavigator providesTransactionsNavigator(HomeActivity homeActivity) {
        HomeActivityModule.Companion $r0 = HomeActivityModule.Companion;
        TransactionsNavigator $r1 = $r0.providesTransactionsNavigator(homeActivity);
        C9473g.m14647e($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionsNavigator getItemForId() {
        InterfaceC11700a $r1 = this.homeActivityProvider;
        Object $r2 = $r1.get();
        HomeActivity $r3 = (HomeActivity) $r2;
        TransactionsNavigator $r4 = providesTransactionsNavigator($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getItemForId  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39146getItemForId() {
        TransactionsNavigator $r1 = getItemForId();
        return $r1;
    }
}
