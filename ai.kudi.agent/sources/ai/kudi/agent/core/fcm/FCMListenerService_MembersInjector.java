package ai.kudi.agent.core.fcm;

import ai.kudi.agent.core.util.Pref;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.users.domain.usecases.RegisterFcm;
import android.content.SharedPreferences;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class FCMListenerService_MembersInjector implements InterfaceC9463a<FCMListenerService> {
    private final InterfaceC11700a<FetchCurrentUser> fetchUserProvider;
    private final InterfaceC11700a<Pref> prefProvider;
    private final InterfaceC11700a<RegisterFcm> registerFcmProvider;
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;

    public FCMListenerService_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        this.registerFcmProvider = interfaceC11700a;
        this.fetchUserProvider = interfaceC11700a2;
        this.sharedPreferencesProvider = interfaceC11700a3;
        this.prefProvider = interfaceC11700a4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        FCMListenerService_MembersInjector $r4 = new FCMListenerService_MembersInjector(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4);
        return $r4;
    }

    public static void injectFetchUser(FCMListenerService fCMListenerService, FetchCurrentUser fetchCurrentUser) {
        fCMListenerService.fetchUser = fetchCurrentUser;
    }

    public static void injectPref(FCMListenerService fCMListenerService, Pref pref) {
        fCMListenerService.pref = pref;
    }

    public static void injectRegisterFcm(FCMListenerService fCMListenerService, RegisterFcm registerFcm) {
        fCMListenerService.registerFcm = registerFcm;
    }

    public static void injectSharedPreferences(FCMListenerService fCMListenerService, SharedPreferences sharedPreferences) {
        fCMListenerService.sharedPreferences = sharedPreferences;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(FCMListenerService fCMListenerService) {
        InterfaceC11700a $r2 = this.registerFcmProvider;
        Object $r3 = $r2.get();
        RegisterFcm $r4 = (RegisterFcm) $r3;
        injectRegisterFcm(fCMListenerService, $r4);
        InterfaceC11700a $r22 = this.fetchUserProvider;
        Object $r32 = $r22.get();
        FetchCurrentUser $r5 = (FetchCurrentUser) $r32;
        injectFetchUser(fCMListenerService, $r5);
        InterfaceC11700a $r23 = this.sharedPreferencesProvider;
        Object $r33 = $r23.get();
        SharedPreferences $r6 = (SharedPreferences) $r33;
        injectSharedPreferences(fCMListenerService, $r6);
        InterfaceC11700a $r24 = this.prefProvider;
        Object $r34 = $r24.get();
        Pref $r7 = (Pref) $r34;
        injectPref(fCMListenerService, $r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        FCMListenerService $r2 = (FCMListenerService) obj;
        injectMembers($r2);
    }
}
