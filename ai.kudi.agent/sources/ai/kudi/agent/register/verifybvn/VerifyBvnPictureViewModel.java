package ai.kudi.agent.register.verifybvn;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.analytics.contracts.OnboardingAnalytics;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.kshock.presentation.viewdata.KShockViewData;
import ai.kudi.agent.register.domain.dto.RegistrationInfo;
import ai.kudi.agent.register.domain.usecases.VerifyBvn;
import ai.kudi.agent.register.domain.wiki.AccountType;
import ai.kudi.agent.register.domain.wiki.BvnVerificationRequest;
import ai.kudi.agent.register.domain.wiki.BvnVerificationResponse;
import ai.kudi.agent.register.domain.wiki.PersonalInfo;
import ai.kudi.agent.register.navigators.RegisterNavigator;
import ai.kudi.agent.register.util.USERTYPES;
import ai.kudi.agent.settings.domain.package_4.UserProfileResponse;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p471k0.C11680b;
import p590o.p591a.Timber;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: VerifyBvnPictureViewModel.kt */
@Metadata(m10422d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000eH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u000eH\u0002J\u0010\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u000eH\u0002J \u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020'H\u0002J\u000e\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u0013J\u0010\u0010*\u001a\u00020\u00182\b\u0010)\u001a\u0004\u0018\u00010\u0013J\u0018\u0010\u0005\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u000eH\u0002J\u0018\u0010+\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u000eH\u0002J\u001e\u0010,\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020'2\u0006\u0010)\u001a\u00020\u0013R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\f\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00130\u00130\r¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, m10421d2 = {"Lai/kudi/agent/register/verifybvn/VerifyBvnPictureViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/core/mvvm/ViewData;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "verifyBvn", "Lai/kudi/agent/register/domain/usecases/VerifyBvn;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "navigator", "Lai/kudi/agent/register/navigators/RegisterNavigator;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/register/domain/usecases/VerifyBvn;Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/register/navigators/RegisterNavigator;)V", "onFaceVerificationFailed", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "getOnFaceVerificationFailed", "()Lio/reactivex/subjects/PublishSubject;", "onFaceVerified", "Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "getOnFaceVerified", "retryCount", "", "handleOnFailure", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "", "pictureId", "initialData", "Lai/kudi/agent/kshock/presentation/viewdata/KShockViewData;", "logExistingUserPicUploaded", "phoneNumber", "logNewUserPicUploaded", "phoneNo", "logVerificationAnalytics", "personalInfo", "Lai/kudi/agent/register/domain/dto/PersonalInfo;", "userType", "successStatus", "", "onAccountTypeSelected", "registrationInfo", "onContinueButtonAction", "verifyBvnExistingAgent", "verifyImage", "isRegistering", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class VerifyBvnPictureViewModel extends BaseViewModel<ViewData> {
    private final Analytics analytics;
    private final FetchCurrentUser currentUser;
    private final RegisterNavigator navigator;
    private final C11680b<String> onFaceVerificationFailed;
    private final C11680b<RegistrationInfo> onFaceVerified;
    private int retryCount;
    private final VerifyBvn verifyBvn;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public VerifyBvnPictureViewModel(FetchCurrentUser fetchCurrentUser, VerifyBvn verifyBvn, Analytics analytics, RegisterNavigator registerNavigator) {
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        Log_OC.getArray(verifyBvn, "verifyBvn");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(registerNavigator, "navigator");
        this.currentUser = fetchCurrentUser;
        this.verifyBvn = verifyBvn;
        this.analytics = analytics;
        this.navigator = registerNavigator;
        C11680b $r5 = C11680b.m10564v0();
        Log_OC.loadImage($r5, "create<RegistrationInfo>()");
        this.onFaceVerified = $r5;
        C11680b $r52 = C11680b.m10564v0();
        Log_OC.loadImage($r52, "create<String>()");
        this.onFaceVerificationFailed = $r52;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void handleOnFailure(Throwable th, String str) {
        int $i0 = this.retryCount + 1;
        this.retryCount = $i0;
        if ($i0 <= 3) {
            C11680b $r5 = this.onFaceVerificationFailed;
            $r5.mo331f(str);
            Timber.reorder(th);
            return;
        }
        RegisterNavigator $r3 = this.navigator;
        $r3.toCallSupportView();
        Analytics $r4 = this.analytics;
        Analytics.DefaultImpls.onCallSupportClicked$default($r4, "onboarding", null, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void logExistingUserPicUploaded(String str) {
        Analytics $r2 = this.analytics;
        USERTYPES $r4 = USERTYPES.EXISTING;
        String $r3 = $r4.name();
        OnboardingAnalytics.DefaultImpls.profilePictureUploaded$default($r2, str, true, null, $r3, 4, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void logNewUserPicUploaded(String str) {
        Analytics $r2 = this.analytics;
        USERTYPES $r4 = USERTYPES.EXISTING;
        String $r3 = $r4.name();
        OnboardingAnalytics.DefaultImpls.profilePictureUploaded$default($r2, str, true, null, $r3, 4, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void logVerificationAnalytics(PersonalInfo personalInfo, String str, boolean z) {
        Analytics $r3 = this.analytics;
        String $r4 = personalInfo.getPhoneNumber();
        Log_OC.append($r4);
        String $r5 = personalInfo.getBvn();
        Log_OC.append($r5);
        OnboardingAnalytics.DefaultImpls.bvnVerification$default($r3, $r4, $r5, z, str, null, 16, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void verifyBvn(final ai.kudi.agent.register.domain.wiki.RegistrationInfo registrationInfo, final String str) {
        final PersonalInfo $r4 = registrationInfo.getPersonalInfo();
        String $r5 = $r4.getBvn();
        Log_OC.append($r5);
        String $r6 = registrationInfo.getRegistrationId();
        BvnVerificationRequest $r1 = new BvnVerificationRequest($r5, str, $r6);
        PersonalInfo $r7 = registrationInfo.getPersonalInfo();
        String $r52 = $r7.getPhoneNumber();
        String $r62 = $r52;
        if ($r52 == null) {
            $r62 = "";
        }
        logNewUserPicUploaded($r62);
        VerifyBvn $r8 = this.verifyBvn;
        AbstractC11688p $r9 = $r8.execute($r1);
        FavoritesArrayAdapter $r12 = $r9.e0(new Object() { // from class: ai.kudi.agent.register.verifybvn.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PersonalInfo $r13 = PersonalInfo.this;
                String $r2 = str;
                VerifyBvnPictureViewModel $r3 = this;
                ai.kudi.agent.register.domain.wiki.RegistrationInfo $r42 = registrationInfo;
                BvnVerificationResponse $r63 = (BvnVerificationResponse) obj;
                VerifyBvnPictureViewModel.m40498verifyBvn$lambda0($r13, $r2, $r3, $r42, $r63);
            }
        }, new Object() { // from class: ai.kudi.agent.register.verifybvn.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                VerifyBvnPictureViewModel $r13 = VerifyBvnPictureViewModel.this;
                PersonalInfo $r2 = $r4;
                String $r3 = str;
                Throwable $r53 = (Throwable) obj;
                VerifyBvnPictureViewModel.m40499verifyBvn$lambda1($r13, $r2, $r3, $r53);
            }
        });
        C11280b $r13 = getCompositeDisposable();
        $r13.b($r12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: verifyBvn$lambda-0  reason: not valid java name */
    public static final void m40498verifyBvn$lambda0(PersonalInfo personalInfo, String str, VerifyBvnPictureViewModel verifyBvnPictureViewModel, ai.kudi.agent.register.domain.wiki.RegistrationInfo registrationInfo, BvnVerificationResponse bvnVerificationResponse) {
        String $r7;
        Log_OC.getArray(personalInfo, "$personalInfo");
        Log_OC.getArray(str, "$imageId");
        Log_OC.getArray(verifyBvnPictureViewModel, "this$0");
        Log_OC.getArray(registrationInfo, "$registrationInfo");
        UserProfileResponse $r5 = bvnVerificationResponse.getData();
        String $r6 = "";
        if ($r5 != null && ($r7 = $r5.getFirstName()) != null) {
            $r6 = $r7;
        }
        personalInfo.setFirstName($r6);
        UserProfileResponse $r52 = bvnVerificationResponse.getData();
        String $r72 = $r52 == null ? null : $r52.getLastName();
        personalInfo.setLastName($r72);
        UserProfileResponse $r53 = bvnVerificationResponse.getData();
        String $r73 = $r53 == null ? null : $r53.getDob();
        personalInfo.setDob($r73);
        UserProfileResponse $r54 = bvnVerificationResponse.getData();
        String $r74 = $r54 == null ? null : $r54.getGender();
        personalInfo.setGender($r74);
        UserProfileResponse $r55 = bvnVerificationResponse.getData();
        String $r75 = $r55 == null ? null : $r55.getEmail();
        personalInfo.setEmail($r75);
        UserProfileResponse $r56 = bvnVerificationResponse.getData();
        personalInfo.setNextOfKin($r56 != null ? $r56.getNextOfKin() : null);
        personalInfo.setProfilePictureId(str);
        USERTYPES $r8 = USERTYPES.isMethod;
        String $r3 = $r8.name();
        verifyBvnPictureViewModel.logVerificationAnalytics(personalInfo, $r3, true);
        C11680b $r9 = verifyBvnPictureViewModel.getOnFaceVerified();
        $r9.mo331f(registrationInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: verifyBvn$lambda-1  reason: not valid java name */
    public static final void m40499verifyBvn$lambda1(VerifyBvnPictureViewModel verifyBvnPictureViewModel, PersonalInfo personalInfo, String str, Throwable th) {
        Log_OC.getArray(verifyBvnPictureViewModel, "this$0");
        Log_OC.getArray(personalInfo, "$personalInfo");
        Log_OC.getArray(str, "$pictureId");
        USERTYPES $r5 = USERTYPES.isMethod;
        String $r3 = $r5.name();
        verifyBvnPictureViewModel.logVerificationAnalytics(personalInfo, $r3, false);
        Log_OC.loadImage(th, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        verifyBvnPictureViewModel.handleOnFailure(th, str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void verifyBvnExistingAgent(final ai.kudi.agent.register.domain.wiki.RegistrationInfo registrationInfo, final String str) {
        PersonalInfo $r3 = registrationInfo.getPersonalInfo();
        String $r4 = $r3.getBvn();
        if ($r4 == null) {
            String $r2 = "Required value was null.".toString();
            IllegalArgumentException $r15 = new IllegalArgumentException($r2);
            throw $r15;
        }
        final BvnVerificationRequest $r5 = new BvnVerificationRequest($r4, str, "");
        PersonalInfo $r32 = registrationInfo.getPersonalInfo();
        String $r42 = $r32.getPhoneNumber();
        String $r6 = $r42 != null ? $r42 : "";
        logExistingUserPicUploaded($r6);
        FetchCurrentUser $r7 = this.currentUser;
        AbstractC11696w $r8 = FetchCurrentUser.execute$default($r7, null, null, 3, null);
        AbstractC11688p $r10 = $r8.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.register.verifybvn.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                VerifyBvnPictureViewModel $r1 = VerifyBvnPictureViewModel.this;
                BvnVerificationRequest $r22 = $r5;
                User $r52 = (User) obj;
                InterfaceC11692s $r33 = VerifyBvnPictureViewModel.m40500verifyBvnExistingAgent$lambda2($r1, $r22, $r52);
                return $r33;
            }
        });
        FavoritesArrayAdapter $r13 = $r10.e0(new Object() { // from class: ai.kudi.agent.register.verifybvn.Tools$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ai.kudi.agent.register.domain.wiki.RegistrationInfo $r1 = ai.kudi.agent.register.domain.wiki.RegistrationInfo.this;
                VerifyBvnPictureViewModel $r22 = this;
                BvnVerificationResponse $r43 = (BvnVerificationResponse) obj;
                VerifyBvnPictureViewModel.m40501verifyBvnExistingAgent$lambda3($r1, $r22, $r43);
            }
        }, new Object() { // from class: ai.kudi.agent.register.verifybvn.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                VerifyBvnPictureViewModel $r1 = VerifyBvnPictureViewModel.this;
                ai.kudi.agent.register.domain.wiki.RegistrationInfo $r22 = registrationInfo;
                String $r33 = str;
                Throwable $r52 = (Throwable) obj;
                VerifyBvnPictureViewModel.m40502verifyBvnExistingAgent$lambda4($r1, $r22, $r33, $r52);
            }
        });
        C11280b $r14 = getCompositeDisposable();
        $r14.b($r13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: verifyBvnExistingAgent$lambda-2  reason: not valid java name */
    public static final InterfaceC11692s m40500verifyBvnExistingAgent$lambda2(VerifyBvnPictureViewModel verifyBvnPictureViewModel, BvnVerificationRequest bvnVerificationRequest, User user) {
        Log_OC.getArray(verifyBvnPictureViewModel, "this$0");
        Log_OC.getArray(bvnVerificationRequest, "$request");
        Log_OC.getArray(user, "it");
        VerifyBvn $r3 = verifyBvnPictureViewModel.verifyBvn;
        String $r4 = user.getSessionId();
        Log_OC.loadImage($r4, "it.sessionId");
        AbstractC11688p $r5 = $r3.verifyExistingAgent(bvnVerificationRequest, $r4);
        return $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: verifyBvnExistingAgent$lambda-3  reason: not valid java name */
    public static final void m40501verifyBvnExistingAgent$lambda3(ai.kudi.agent.register.domain.wiki.RegistrationInfo registrationInfo, VerifyBvnPictureViewModel verifyBvnPictureViewModel, BvnVerificationResponse bvnVerificationResponse) {
        String $r6;
        Log_OC.getArray(registrationInfo, "$registrationInfo");
        Log_OC.getArray(verifyBvnPictureViewModel, "this$0");
        PersonalInfo $r3 = registrationInfo.getPersonalInfo();
        UserProfileResponse $r4 = bvnVerificationResponse.getData();
        String $r5 = "";
        if ($r4 != null && ($r6 = $r4.getFirstName()) != null) {
            $r5 = $r6;
        }
        $r3.setFirstName($r5);
        PersonalInfo $r32 = registrationInfo.getPersonalInfo();
        USERTYPES $r7 = USERTYPES.EXISTING;
        verifyBvnPictureViewModel.logVerificationAnalytics($r32, $r7.name(), true);
        C11680b $r8 = verifyBvnPictureViewModel.getOnFaceVerified();
        $r8.mo331f(registrationInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: verifyBvnExistingAgent$lambda-4  reason: not valid java name */
    public static final void m40502verifyBvnExistingAgent$lambda4(VerifyBvnPictureViewModel verifyBvnPictureViewModel, ai.kudi.agent.register.domain.wiki.RegistrationInfo registrationInfo, String str, Throwable th) {
        Log_OC.getArray(verifyBvnPictureViewModel, "this$0");
        Log_OC.getArray(registrationInfo, "$registrationInfo");
        Log_OC.getArray(str, "$pictureId");
        PersonalInfo $r4 = registrationInfo.getPersonalInfo();
        USERTYPES $r5 = USERTYPES.EXISTING;
        String $r6 = $r5.name();
        verifyBvnPictureViewModel.logVerificationAnalytics($r4, $r6, false);
        Log_OC.loadImage(th, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        verifyBvnPictureViewModel.handleOnFailure(th, str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C11680b getOnFaceVerificationFailed() {
        C11680b r1 = this.onFaceVerificationFailed;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C11680b getOnFaceVerified() {
        C11680b r1 = this.onFaceVerified;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        KShockViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public KShockViewData initialData() {
        KShockViewData $r1 = new KShockViewData(false, null, null, null, null, null, 63, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onAccountTypeSelected(ai.kudi.agent.register.domain.wiki.RegistrationInfo registrationInfo) {
        Log_OC.getArray(registrationInfo, "registrationInfo");
        AccountType $r2 = registrationInfo.getAccountType();
        AccountType $r3 = AccountType.PERSONAL;
        if ($r2 == $r3) {
            RegisterNavigator $r4 = this.navigator;
            $r4.toPersonalInformationView(registrationInfo);
            return;
        }
        AccountType $r22 = registrationInfo.getAccountType();
        AccountType $r32 = AccountType.AGENT;
        if ($r22 == $r32) {
            RegisterNavigator $r42 = this.navigator;
            $r42.toBusinessInformationView(registrationInfo);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onContinueButtonAction(ai.kudi.agent.register.domain.wiki.RegistrationInfo registrationInfo) {
        RegisterNavigator $r2 = this.navigator;
        $r2.toSelectBusinessTypeView(registrationInfo);
    }

    public final void verifyImage(String str, boolean z, ai.kudi.agent.register.domain.wiki.RegistrationInfo registrationInfo) {
        Log_OC.getArray(str, "pictureId");
        Log_OC.getArray(registrationInfo, "registrationInfo");
        if (z) {
            verifyBvn(registrationInfo, str);
        } else {
            verifyBvnExistingAgent(registrationInfo, str);
        }
    }
}
