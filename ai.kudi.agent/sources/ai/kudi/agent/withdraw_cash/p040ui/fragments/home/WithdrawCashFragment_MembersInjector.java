package ai.kudi.agent.withdraw_cash.p040ui.fragments.home;

import android.content.SharedPreferences;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.withdraw_cash.ui.fragments.home.WithdrawCashFragment_MembersInjector */
/* loaded from: classes.dex */
public final class WithdrawCashFragment_MembersInjector implements InterfaceC9463a<WithdrawCashFragment> {
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;

    public WithdrawCashFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.sharedPreferencesProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        WithdrawCashFragment_MembersInjector $r1 = new WithdrawCashFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectSharedPreferences(WithdrawCashFragment withdrawCashFragment, SharedPreferences sharedPreferences) {
        withdrawCashFragment.sharedPreferences = sharedPreferences;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(WithdrawCashFragment withdrawCashFragment) {
        InterfaceC11700a $r3 = this.sharedPreferencesProvider;
        Object $r2 = $r3.get();
        SharedPreferences $r4 = (SharedPreferences) $r2;
        injectSharedPreferences(withdrawCashFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        WithdrawCashFragment $r2 = (WithdrawCashFragment) obj;
        injectMembers($r2);
    }
}
