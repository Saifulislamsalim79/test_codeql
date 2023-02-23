package ai.kudi.agent.home;

import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class BvnHomeUpdateFragment_MembersInjector implements InterfaceC9463a<BvnHomeUpdateFragment> {
    private final InterfaceC11700a<HomePresenter> thisPresenterProvider;

    public BvnHomeUpdateFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.thisPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        BvnHomeUpdateFragment_MembersInjector $r1 = new BvnHomeUpdateFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectThisPresenter(BvnHomeUpdateFragment bvnHomeUpdateFragment, HomePresenter homePresenter) {
        bvnHomeUpdateFragment.thisPresenter = homePresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(BvnHomeUpdateFragment bvnHomeUpdateFragment) {
        InterfaceC11700a $r3 = this.thisPresenterProvider;
        Object $r2 = $r3.get();
        HomePresenter $r4 = (HomePresenter) $r2;
        injectThisPresenter(bvnHomeUpdateFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        BvnHomeUpdateFragment $r2 = (BvnHomeUpdateFragment) obj;
        injectMembers($r2);
    }
}
