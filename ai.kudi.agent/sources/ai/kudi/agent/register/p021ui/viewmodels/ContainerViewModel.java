package ai.kudi.agent.register.p021ui.viewmodels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.register.data.CompleteRegistrationData;
import ai.kudi.agent.register.domain.usecases.BaseOtpUtil;
import ai.kudi.agent.register.domain.wiki.RegistrationInfo;
import ai.kudi.agent.register.navigators.RegisterNavigator;
import ai.kudi.agent.register.p021ui.viewmodels.data.ContainerViewData;
import ai.kudi.agent.register.p022v2.p023ui.PhoneFragment;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import io.intercom.android.sdk.views.holder.AttributeType;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p470j0.ClassWriter;
/* compiled from: ContainerViewModel.kt */
@Metadata(m10422d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0017\u001a\u00020\u0002H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u001dH\u0014J\u0016\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001bJ\u000e\u0010\"\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001bJ&\u0010#\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001bJ\u001e\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001bJ(\u0010'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010*\u001a\u0004\u0018\u00010+R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, m10421d2 = {"Lai/kudi/agent/register/ui/viewmodels/ContainerViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/register/ui/viewmodels/data/ContainerViewData;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "baseOtpUtil", "Lai/kudi/agent/register/domain/usecases/BaseOtpUtil;", "navigator", "Lai/kudi/agent/register/navigators/RegisterNavigator;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/register/domain/usecases/BaseOtpUtil;Lai/kudi/agent/register/navigators/RegisterNavigator;)V", "registrationInfo", "Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "getRegistrationInfo", "()Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "setRegistrationInfo", "(Lai/kudi/agent/register/domain/dto/RegistrationInfo;)V", "sendOtpDisposable", "Lio/reactivex/disposables/Disposable;", "sendOtpEmailVerificationDisposable", "verifyOtpDisposable", "verifyOtpEmailVerificationDisposable", "initialData", "isValidInputParams", "", "otp", "", "onCallSupportClicked", "", "onCleared", "resendOtp", "registrationId", "phoneNumber", "sendOtpEmailVerification", "verifyOtp", PhoneFragment.ARG_BVN, "verifyOtpForNewUser", "resetId", "verifyOtpSecondaryVerification", "email", AttributeType.PHONE, "completeRegistrationData", "Lai/kudi/agent/register/data/CompleteRegistrationData;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.ui.viewmodels.ContainerViewModel */
/* loaded from: classes.dex */
public final class ContainerViewModel extends BaseViewModel<ContainerViewData> {
    private final Analytics analytics;
    private final BaseOtpUtil baseOtpUtil;
    private final FetchCurrentUser fetchCurrentUser;
    private final RegisterNavigator navigator;
    private RegistrationInfo registrationInfo;
    private FavoritesArrayAdapter sendOtpDisposable;
    private FavoritesArrayAdapter sendOtpEmailVerificationDisposable;
    private FavoritesArrayAdapter verifyOtpDisposable;
    private FavoritesArrayAdapter verifyOtpEmailVerificationDisposable;

    public ContainerViewModel(FetchCurrentUser fetchCurrentUser, Analytics analytics, BaseOtpUtil baseOtpUtil, RegisterNavigator registerNavigator) {
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(baseOtpUtil, "baseOtpUtil");
        Log_OC.getArray(registerNavigator, "navigator");
        this.fetchCurrentUser = fetchCurrentUser;
        this.analytics = analytics;
        this.baseOtpUtil = baseOtpUtil;
        this.navigator = registerNavigator;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final /* synthetic */ ContainerViewData access$getState(ContainerViewModel containerViewModel) {
        ViewData $r0 = containerViewModel.getState();
        ContainerViewData $r2 = (ContainerViewData) $r0;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean isValidInputParams(String str) {
        boolean $z0;
        $z0 = C13276s.m5440u(str);
        if ($z0) {
            ViewData $r2 = getState();
            ContainerViewData $r3 = (ContainerViewData) $r2;
            publish(ContainerViewData.copy$default($r3, false, null, false, null, null, "Enter the OTP you received", false, false, 223, null));
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onCallSupportClicked$lambda-0  reason: not valid java name */
    public static final void m40403onCallSupportClicked$lambda0(ContainerViewModel containerViewModel, User user) {
        Log_OC.getArray(containerViewModel, "this$0");
        Analytics $r3 = containerViewModel.analytics;
        String $r0 = user.getPhoneNumber();
        $r3.onCallSupportClicked("bvn_verification", $r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCallSupportClicked$lambda-1  reason: not valid java name */
    public static final void m40404onCallSupportClicked$lambda1(Throwable th) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final RegistrationInfo getRegistrationInfo() {
        RegistrationInfo r1 = this.registrationInfo;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        ContainerViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public ContainerViewData initialData() {
        ContainerViewData $r1 = new ContainerViewData(false, null, false, null, null, null, false, false, 255, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onCallSupportClicked() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Item $r3 = ClassWriter.LogError();
        AbstractC11696w $r22 = $r2.u($r3);
        Item $r32 = ContextUtils.LogError();
        AbstractC11696w $r23 = $r22.n($r32);
        Object object = new Object() { // from class: ai.kudi.agent.register.ui.viewmodels.Tools$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ContainerViewModel $r12 = ContainerViewModel.this;
                User $r33 = (User) obj;
                ContainerViewModel.m40403onCallSupportClicked$lambda0($r12, $r33);
            }
        };
        Chunk $r5 = Chunk.NEWLINE;
        FavoritesArrayAdapter $r6 = $r23.s(object, $r5);
        Log_OC.loadImage($r6, "fetchCurrentUser.execute().subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread()).subscribe (\n                {\n                    analytics.onCallSupportClicked(Analytics.SCREEN_BVN_VERIFICATION, it.phoneNumber)\n                },\n                {\n            }\n            )");
        C11280b $r7 = getCompositeDisposable();
        RxExtKt.addTo($r6, $r7);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public void onCleared() {
        super.onCleared();
        FavoritesArrayAdapter $r1 = this.verifyOtpEmailVerificationDisposable;
        if ($r1 != null) {
            $r1.backup();
        }
        FavoritesArrayAdapter $r12 = this.sendOtpDisposable;
        if ($r12 != null) {
            $r12.backup();
        }
        FavoritesArrayAdapter $r13 = this.sendOtpEmailVerificationDisposable;
        if ($r13 != null) {
            $r13.backup();
        }
        FavoritesArrayAdapter $r14 = this.verifyOtpEmailVerificationDisposable;
        if ($r14 == null) {
            return;
        }
        $r14.backup();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void resendOtp(String str, String str2) {
        Log_OC.getArray(str, "registrationId");
        Log_OC.getArray(str2, "phoneNumber");
        FavoritesArrayAdapter $r4 = this.sendOtpDisposable;
        if ($r4 != null) {
            $r4.backup();
        }
        BaseOtpUtil $r6 = this.baseOtpUtil;
        ContainerViewModel$resendOtp$1 $r2 = new ContainerViewModel$resendOtp$1(this);
        ContainerViewModel$resendOtp$2 $r3 = new ContainerViewModel$resendOtp$2(this);
        this.sendOtpDisposable = $r6.requestOtpNewAccount(str, str2, $r2, $r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void sendOtpEmailVerification(String str) {
        Log_OC.getArray(str, "phoneNumber");
        FavoritesArrayAdapter $r2 = this.sendOtpEmailVerificationDisposable;
        if ($r2 != null) {
            $r2.backup();
        }
        ViewData $r3 = getState();
        ContainerViewData $r4 = (ContainerViewData) $r3;
        publish(ContainerViewData.copy$default($r4, false, null, true, null, null, null, false, false, 251, null));
        BaseOtpUtil $r5 = this.baseOtpUtil;
        ContainerViewModel$sendOtpEmailVerification$1 $r6 = new ContainerViewModel$sendOtpEmailVerification$1(this, str);
        ContainerViewModel$sendOtpEmailVerification$2 $r7 = new ContainerViewModel$sendOtpEmailVerification$2(this);
        this.sendOtpEmailVerificationDisposable = $r5.sendOtpForSecondaryDetailsVerification(str, $r6, $r7);
    }

    public final void setRegistrationInfo(RegistrationInfo registrationInfo) {
        this.registrationInfo = registrationInfo;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void verifyOtp(String str, String str2, String str3, String str4) {
        Log_OC.getArray(str, "registrationId");
        Log_OC.getArray(str2, "otp");
        Log_OC.getArray(str3, "phoneNumber");
        Log_OC.getArray(str4, PhoneFragment.ARG_BVN);
        FavoritesArrayAdapter $r5 = this.verifyOtpDisposable;
        if ($r5 != null) {
            $r5.backup();
        }
        boolean $z0 = isValidInputParams(str2);
        if ($z0) {
            ViewData $r6 = getState();
            ContainerViewData $r7 = ContainerViewData.copy$default((ContainerViewData) $r6, true, null, false, null, null, null, false, false, 220, null);
            publish($r7);
            BaseOtpUtil $r8 = this.baseOtpUtil;
            ContainerViewModel$verifyOtp$1 $r9 = new ContainerViewModel$verifyOtp$1(this, str3, str, str4);
            ContainerViewModel$verifyOtp$2 $r10 = new ContainerViewModel$verifyOtp$2(this, str3);
            this.verifyOtpDisposable = $r8.verifyNewPhoneNumber(str, str2, $r9, $r10);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void verifyOtpForNewUser(String str, String str2, String str3) {
        Log_OC.getArray(str, "resetId");
        Log_OC.getArray(str2, "otp");
        Log_OC.getArray(str3, "phoneNumber");
        FavoritesArrayAdapter $r4 = this.verifyOtpDisposable;
        if ($r4 != null) {
            $r4.backup();
        }
        boolean $z0 = isValidInputParams(str2);
        if ($z0) {
            ViewData $r5 = getState();
            ContainerViewData $r6 = ContainerViewData.copy$default((ContainerViewData) $r5, true, null, false, null, null, null, false, false, 220, null);
            publish($r6);
            BaseOtpUtil $r7 = this.baseOtpUtil;
            ContainerViewModel$verifyOtpForNewUser$1 $r8 = new ContainerViewModel$verifyOtpForNewUser$1(this, str3);
            ContainerViewModel$verifyOtpForNewUser$2 $r9 = new ContainerViewModel$verifyOtpForNewUser$2(this, str3);
            this.verifyOtpDisposable = $r7.verifyOtpForgotPassword(str, str2, $r8, $r9);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void verifyOtpSecondaryVerification(String str, String str2, String str3, CompleteRegistrationData completeRegistrationData) {
        Log_OC.getArray(str, "email");
        Log_OC.getArray(str2, AttributeType.PHONE);
        Log_OC.getArray(str3, "otp");
        FavoritesArrayAdapter $r5 = this.verifyOtpEmailVerificationDisposable;
        if ($r5 != null) {
            $r5.backup();
        }
        boolean $z0 = isValidInputParams(str3);
        if ($z0) {
            ViewData $r6 = getState();
            ContainerViewData $r7 = ContainerViewData.copy$default((ContainerViewData) $r6, true, null, false, null, null, null, false, false, 156, null);
            publish($r7);
            BaseOtpUtil $r8 = this.baseOtpUtil;
            ContainerViewModel$verifyOtpSecondaryVerification$1 $r9 = new ContainerViewModel$verifyOtpSecondaryVerification$1(this, completeRegistrationData);
            ContainerViewModel$verifyOtpSecondaryVerification$2 $r10 = new ContainerViewModel$verifyOtpSecondaryVerification$2(this);
            this.verifyOtpEmailVerificationDisposable = $r8.verifySecondaryDetails(str, str2, str3, $r9, $r10);
        }
    }
}
