package ai.kudi.agent.wallettopup.fragments;

import ai.kudi.agent.core.analytics.Analytics;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class UssdTopUpBottomSheetFragment_MembersInjector implements InterfaceC9463a<UssdTopUpBottomSheetFragment> {
    private final InterfaceC11700a<Analytics> analyticsProvider;

    public UssdTopUpBottomSheetFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.analyticsProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        UssdTopUpBottomSheetFragment_MembersInjector $r1 = new UssdTopUpBottomSheetFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectAnalytics(UssdTopUpBottomSheetFragment ussdTopUpBottomSheetFragment, Analytics analytics) {
        ussdTopUpBottomSheetFragment.analytics = analytics;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(UssdTopUpBottomSheetFragment ussdTopUpBottomSheetFragment) {
        InterfaceC11700a $r3 = this.analyticsProvider;
        Object $r2 = $r3.get();
        Analytics $r4 = (Analytics) $r2;
        injectAnalytics(ussdTopUpBottomSheetFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        UssdTopUpBottomSheetFragment $r2 = (UssdTopUpBottomSheetFragment) obj;
        injectMembers($r2);
    }
}
