package ai.kudi.agent.register.p022v2.p023ui.viewModels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.analytics.contracts.OnboardingAnalytics;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.register.domain.wiki.PersonalInfo;
import ai.kudi.agent.register.domain.wiki.RegistrationInfo;
import ai.kudi.agent.register.navigators.RegisterNavigator;
import ai.kudi.agent.register.p022v2.p023ui.PhoneFragment;
import ai.kudi.agent.register.p022v2.p023ui.viewModels.data.PersonalDetailsViewData;
import ai.kudi.agent.register.util.USERTYPES;
import ai.kudi.agent.users.data.repositories.UserRepository;
import ai.kudi.agent.users.domain.package_1.User;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: PersonalDetailsViewModel.kt */
@Metadata(m10422d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001a\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\rJ\b\u0010\u000f\u001a\u00020\u0002H\u0016J0\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H\u0002JX\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0011H\u0002JV\u0010 \u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0011R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m10421d2 = {"Lai/kudi/agent/register/v2/ui/viewModels/PersonalDetailsViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/register/v2/ui/viewModels/data/PersonalDetailsViewData;", "userRepository", "Lai/kudi/agent/users/data/repositories/UserRepository;", "navigator", "Lai/kudi/agent/register/navigators/RegisterNavigator;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/users/data/repositories/UserRepository;Lai/kudi/agent/register/navigators/RegisterNavigator;Lai/kudi/agent/core/analytics/Analytics;)V", "fetchUser", "", "callback", "Lkotlin/Function1;", "Lai/kudi/agent/users/domain/dto/User;", "initialData", "inputParamsValid", "", "firstName", "", "lastName", "gender", "dob", PhoneFragment.ARG_BVN, "navigateToVerifyBvn", "phoneNumber", "latitude", "", "longitude", "dateOfBirth", "registrationId", "isNewUser", "submitInfo", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.v2.ui.viewModels.PersonalDetailsViewModel */
/* loaded from: classes.dex */
public final class PersonalDetailsViewModel extends BaseViewModel<PersonalDetailsViewData> {
    private final Analytics analytics;
    private final RegisterNavigator navigator;
    private final UserRepository userRepository;

    public PersonalDetailsViewModel(UserRepository userRepository, RegisterNavigator registerNavigator, Analytics analytics) {
        Log_OC.getArray(userRepository, "userRepository");
        Log_OC.getArray(registerNavigator, "navigator");
        Log_OC.getArray(analytics, "analytics");
        this.userRepository = userRepository;
        this.navigator = registerNavigator;
        this.analytics = analytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchUser$lambda-0  reason: not valid java name */
    public static final void m40482fetchUser$lambda0(InterfaceC11767l interfaceC11767l, User user) {
        Log_OC.getArray(interfaceC11767l, "$callback");
        Log_OC.loadImage(user, "it");
        interfaceC11767l.invoke(user);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00be, code lost:
        if (r10 == false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean inputParamsValid(java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.register.p022v2.p023ui.viewModels.PersonalDetailsViewModel.inputParamsValid(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void navigateToVerifyBvn(String str, String str2, String str3, String str4, double d, double d2, String str5, String str6, String str7, boolean z) {
        USERTYPES $r9 = z ? USERTYPES.isMethod : USERTYPES.EXISTING;
        String $r10 = $r9.name();
        Analytics $r11 = this.analytics;
        OnboardingAnalytics.DefaultImpls.personalDetailsSubmitted$default($r11, str, true, $r10, null, 8, null);
        Double $r13 = Double.valueOf(d);
        Double $r14 = Double.valueOf(d2);
        PersonalInfo $r4 = new PersonalInfo(null, null, str, str2, str3, null, null, str4, $r13, $r14, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str5, str7, null, null, null, null, null, null, null, null, false, null, -402654109, 127, null);
        RegistrationInfo $r12 = new RegistrationInfo(str6, $r4, null, false, null, 28, null);
        RegisterNavigator $r15 = this.navigator;
        $r15.toProfilePictureUploadView($r12);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchUser(final InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(interfaceC11767l, "callback");
        UserRepository $r3 = this.userRepository;
        AbstractC11696w $r4 = $r3.getCurrentUser();
        Object object = new Object() { // from class: ai.kudi.agent.register.v2.ui.viewModels.ReplaySubject$BoundedState
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InterfaceC11767l $r1 = InterfaceC11767l.this;
                User $r32 = (User) obj;
                PersonalDetailsViewModel.m40482fetchUser$lambda0($r1, $r32);
            }
        };
        Function $r5 = Function.NOW;
        FavoritesArrayAdapter $r6 = $r4.s(object, $r5);
        Log_OC.loadImage($r6, "userRepository.currentUser.subscribe(\n            {\n                callback(it)\n            },\n            {\n                it.printStackTrace()\n            }\n        )");
        C11280b $r7 = getCompositeDisposable();
        RxExtKt.addTo($r6, $r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        PersonalDetailsViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public PersonalDetailsViewData initialData() {
        PersonalDetailsViewData $r1 = new PersonalDetailsViewData(null, 1, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void submitInfo(String str, String str2, String str3, String str4, double d, double d2, String str5, String str6, String str7, boolean z) {
        Log_OC.getArray(str, "phoneNumber");
        Log_OC.getArray(str2, "firstName");
        Log_OC.getArray(str3, "lastName");
        Log_OC.getArray(str4, "gender");
        Log_OC.getArray(str5, "dateOfBirth");
        Log_OC.getArray(str6, "registrationId");
        Log_OC.getArray(str7, PhoneFragment.ARG_BVN);
        boolean $z1 = inputParamsValid(str2, str3, str4, str5, str7);
        if ($z1) {
            navigateToVerifyBvn(str, str2, str3, str4, d, d2, str5, str6, str7, z);
        }
    }
}
