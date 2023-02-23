package ai.kudi.agent.login.presenters;

import ai.kudi.agent.analytics.SmartLookAnalytics;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.util.Pref;
import ai.kudi.agent.core.util.ResourceDelegate;
import ai.kudi.agent.register.PinRepositoryImpl;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.users.domain.usecases.LoginUser;
import com.google.firebase.database.C5615f;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class LoginPresenter_Factory implements InterfaceC9468d<LoginPresenter> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;
    private final InterfaceC11700a<C5615f> firebaseDBProvider;
    private final InterfaceC11700a<LoginUser> loginUserProvider;
    private final InterfaceC11700a<PinRepositoryImpl> pinRepositoryImplProvider;
    private final InterfaceC11700a<ResourceDelegate> resourceDelegateProvider;
    private final InterfaceC11700a<Pref> sharedPreferencesProvider;
    private final InterfaceC11700a<SmartLookAnalytics> smartLookAnalyticsProvider;

    public LoginPresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7, InterfaceC11700a interfaceC11700a8) {
        this.loginUserProvider = interfaceC11700a;
        this.currentUserProvider = interfaceC11700a2;
        this.analyticsProvider = interfaceC11700a3;
        this.firebaseDBProvider = interfaceC11700a4;
        this.pinRepositoryImplProvider = interfaceC11700a5;
        this.sharedPreferencesProvider = interfaceC11700a6;
        this.smartLookAnalyticsProvider = interfaceC11700a7;
        this.resourceDelegateProvider = interfaceC11700a8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LoginPresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7, InterfaceC11700a interfaceC11700a8) {
        LoginPresenter_Factory $r8 = new LoginPresenter_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6, interfaceC11700a7, interfaceC11700a8);
        return $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LoginPresenter newInstance(LoginUser loginUser, FetchCurrentUser fetchCurrentUser, Analytics analytics, C5615f c5615f, PinRepositoryImpl pinRepositoryImpl, Pref pref, SmartLookAnalytics smartLookAnalytics, ResourceDelegate resourceDelegate) {
        LoginPresenter $r8 = new LoginPresenter(loginUser, fetchCurrentUser, analytics, c5615f, pinRepositoryImpl, pref, smartLookAnalytics, resourceDelegate);
        return $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public LoginPresenter multiply() {
        InterfaceC11700a $r1 = this.loginUserProvider;
        Object $r2 = $r1.get();
        LoginUser $r3 = (LoginUser) $r2;
        InterfaceC11700a $r12 = this.currentUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        InterfaceC11700a $r13 = this.analyticsProvider;
        Object $r23 = $r13.get();
        Analytics $r5 = (Analytics) $r23;
        InterfaceC11700a $r14 = this.firebaseDBProvider;
        Object $r24 = $r14.get();
        C5615f c5615f = (C5615f) $r24;
        InterfaceC11700a $r15 = this.pinRepositoryImplProvider;
        Object $r25 = $r15.get();
        PinRepositoryImpl pinRepositoryImpl = (PinRepositoryImpl) $r25;
        InterfaceC11700a $r16 = this.sharedPreferencesProvider;
        Object $r26 = $r16.get();
        Pref pref = (Pref) $r26;
        InterfaceC11700a $r17 = this.smartLookAnalyticsProvider;
        Object $r27 = $r17.get();
        SmartLookAnalytics $r9 = (SmartLookAnalytics) $r27;
        InterfaceC11700a $r18 = this.resourceDelegateProvider;
        Object $r28 = $r18.get();
        ResourceDelegate $r10 = (ResourceDelegate) $r28;
        LoginPresenter $r11 = newInstance($r3, $r4, $r5, c5615f, pinRepositoryImpl, pref, $r9, $r10);
        return $r11;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39735multiply() {
        LoginPresenter $r1 = multiply();
        return $r1;
    }
}
