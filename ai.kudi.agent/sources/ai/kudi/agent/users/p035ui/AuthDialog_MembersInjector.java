package ai.kudi.agent.users.p035ui;

import android.content.SharedPreferences;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.users.ui.AuthDialog_MembersInjector */
/* loaded from: classes.dex */
public final class AuthDialog_MembersInjector implements InterfaceC9463a<AuthDialog> {
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;

    public AuthDialog_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.sharedPreferencesProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        AuthDialog_MembersInjector $r1 = new AuthDialog_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectSharedPreferences(AuthDialog authDialog, SharedPreferences sharedPreferences) {
        authDialog.sharedPreferences = sharedPreferences;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(AuthDialog authDialog) {
        InterfaceC11700a $r3 = this.sharedPreferencesProvider;
        Object $r2 = $r3.get();
        SharedPreferences $r4 = (SharedPreferences) $r2;
        injectSharedPreferences(authDialog, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        AuthDialog $r2 = (AuthDialog) obj;
        injectMembers($r2);
    }
}
