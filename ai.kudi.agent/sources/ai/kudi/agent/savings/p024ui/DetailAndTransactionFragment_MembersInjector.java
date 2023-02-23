package ai.kudi.agent.savings.p024ui;

import dagger.android.DispatchingAndroidInjector;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.savings.ui.DetailAndTransactionFragment_MembersInjector */
/* loaded from: classes.dex */
public final class DetailAndTransactionFragment_MembersInjector implements InterfaceC9463a<DetailAndTransactionFragment> {
    private final InterfaceC11700a<DispatchingAndroidInjector<Object>> androidInjectorProvider;

    public DetailAndTransactionFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.androidInjectorProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        DetailAndTransactionFragment_MembersInjector $r1 = new DetailAndTransactionFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectAndroidInjector(DetailAndTransactionFragment detailAndTransactionFragment, DispatchingAndroidInjector dispatchingAndroidInjector) {
        detailAndTransactionFragment.androidInjector = dispatchingAndroidInjector;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(DetailAndTransactionFragment detailAndTransactionFragment) {
        InterfaceC11700a $r3 = this.androidInjectorProvider;
        Object $r2 = $r3.get();
        DispatchingAndroidInjector $r4 = (DispatchingAndroidInjector) $r2;
        injectAndroidInjector(detailAndTransactionFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        DetailAndTransactionFragment $r2 = (DetailAndTransactionFragment) obj;
        injectMembers($r2);
    }
}
