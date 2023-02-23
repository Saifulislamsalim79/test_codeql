package ai.kudi.agent.users.p035ui;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.users.domain.usecases.Authorize;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import android.content.SharedPreferences;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.users.ui.AuthDialog_Factory */
/* loaded from: classes.dex */
public final class AuthDialog_Factory implements InterfaceC9468d<AuthDialog> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<Authorize> authorizeProvider;
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;

    public AuthDialog_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        this.currentUserProvider = interfaceC11700a;
        this.authorizeProvider = interfaceC11700a2;
        this.analyticsProvider = interfaceC11700a3;
        this.sharedPreferencesProvider = interfaceC11700a4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AuthDialog_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        AuthDialog_Factory $r4 = new AuthDialog_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AuthDialog newInstance(FetchCurrentUser fetchCurrentUser, Authorize authorize, Analytics analytics) {
        AuthDialog $r3 = new AuthDialog(fetchCurrentUser, authorize, analytics);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AuthDialog multiply() {
        InterfaceC11700a $r1 = this.currentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.authorizeProvider;
        Object $r22 = $r12.get();
        Authorize $r4 = (Authorize) $r22;
        InterfaceC11700a $r13 = this.analyticsProvider;
        Object $r23 = $r13.get();
        Analytics $r5 = (Analytics) $r23;
        AuthDialog $r6 = newInstance($r3, $r4, $r5);
        InterfaceC11700a $r14 = this.sharedPreferencesProvider;
        Object $r24 = $r14.get();
        SharedPreferences $r7 = (SharedPreferences) $r24;
        AuthDialog_MembersInjector.injectSharedPreferences($r6, $r7);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41471multiply() {
        AuthDialog $r1 = multiply();
        return $r1;
    }
}
