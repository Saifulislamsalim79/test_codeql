package ai.kudi.agent.register.p022v2.p023ui.viewModels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.analytics.contracts.OnboardingAnalytics;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.login.domain.usecases.CreateTempAgent;
import ai.kudi.agent.login.domain.wiki.CreateTempAgentRequest;
import ai.kudi.agent.login.domain.wiki.CreateTempAgentResponse;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.register.data.models.OtpData;
import ai.kudi.agent.register.data.models.OtpFragmentData;
import ai.kudi.agent.register.domain.usecases.BaseOtpUtil;
import ai.kudi.agent.register.domain.usecases.BvnLookup;
import ai.kudi.agent.register.domain.usecases.CheckIfBvnExists;
import ai.kudi.agent.register.domain.wiki.BvnLookUpResponse;
import ai.kudi.agent.register.domain.wiki.LookUpBvnAndVerifyPhoneRequest;
import ai.kudi.agent.register.domain.wiki.LookUpBvnAndVerifyPhoneResponse;
import ai.kudi.agent.register.domain.wiki.PersonalInfo;
import ai.kudi.agent.register.domain.wiki.RegistrationInfo;
import ai.kudi.agent.register.navigators.RegisterNavigator;
import ai.kudi.agent.register.p022v2.p023ui.PhoneFragment;
import ai.kudi.agent.register.p022v2.p023ui.viewModels.PhoneAndBvnViewModel;
import ai.kudi.agent.register.p022v2.p023ui.viewModels.data.PhoneAndBvnViewData;
import ai.kudi.agent.register.util.USERTYPES;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import io.intercom.android.sdk.views.holder.AttributeType;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import kotlin.p549l0.C13277t;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
import retrofit2.HttpException;
/* compiled from: PhoneAndBvnViewModel.kt */
@Metadata(m10422d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00014B?\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J(\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010\u0017\u001a\u00020\u0018J\u0018\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020%2\u0006\u0010 \u001a\u00020\u0018H\u0002J\b\u0010&\u001a\u00020\u0002H\u0016J\u0018\u0010'\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u0018H\u0002J\u000e\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u0013J\u000e\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\u0018J\u0016\u0010-\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u0018J \u0010.\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u00182\b\b\u0002\u0010\u0017\u001a\u00020\u0018J\u000e\u0010/\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0018J\u000e\u00100\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0018J\u000e\u00101\u001a\u00020\u001e2\u0006\u00102\u001a\u000203R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u00065"}, m10421d2 = {"Lai/kudi/agent/register/v2/ui/viewModels/PhoneAndBvnViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/register/v2/ui/viewModels/data/PhoneAndBvnViewData;", "createTempAgent", "Lai/kudi/agent/login/domain/usecases/CreateTempAgent;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "bvnLookup", "Lai/kudi/agent/register/domain/usecases/BvnLookup;", "baseOtpUtil", "Lai/kudi/agent/register/domain/usecases/BaseOtpUtil;", "navigator", "Lai/kudi/agent/register/navigators/RegisterNavigator;", "checkIfBvnExists", "Lai/kudi/agent/register/domain/usecases/CheckIfBvnExists;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "(Lai/kudi/agent/login/domain/usecases/CreateTempAgent;Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/register/domain/usecases/BvnLookup;Lai/kudi/agent/register/domain/usecases/BaseOtpUtil;Lai/kudi/agent/register/navigators/RegisterNavigator;Lai/kudi/agent/register/domain/usecases/CheckIfBvnExists;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;)V", "isBVNValid", "", "()Z", "setBVNValid", "(Z)V", "regId", "", "getRegId", "()Ljava/lang/String;", "setRegId", "(Ljava/lang/String;)V", "checkBvnExistence", "", "identityNumber", "phoneNumber", "lookUpType", "Lai/kudi/agent/register/v2/ui/viewModels/PhoneAndBvnViewModel$LookUpType;", "handlPhoneNumberLookUpError", "it", "", "initialData", "inputParamsValid", PhoneFragment.ARG_BVN, "logLearnMoreClicked", "isNewUser", "logOnPhoneNoEntered", AttributeType.PHONE, "performBVNLookup", "performBvnLookUpAndVerifyPhoneNumber", "performPhoneNumberLookUp", "toLoginView", "verifyPhoneNumber", "user", "Lai/kudi/agent/users/domain/dto/User;", "LookUpType", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.v2.ui.viewModels.PhoneAndBvnViewModel */
/* loaded from: classes.dex */
public final class PhoneAndBvnViewModel extends BaseViewModel<PhoneAndBvnViewData> {
    private final Analytics analytics;
    private final BaseOtpUtil baseOtpUtil;
    private final BvnLookup bvnLookup;
    private final CheckIfBvnExists checkIfBvnExists;
    private final CreateTempAgent createTempAgent;
    private final FetchCurrentUser fetchCurrentUser;
    private boolean isBVNValid;
    private final RegisterNavigator navigator;
    private String regId;

    /* compiled from: PhoneAndBvnViewModel.kt */
    @Metadata(m10422d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/register/v2/ui/viewModels/PhoneAndBvnViewModel$LookUpType;", "", "()V", "ExistingAgent", "NewAgent", "Lai/kudi/agent/register/v2/ui/viewModels/PhoneAndBvnViewModel$LookUpType$NewAgent;", "Lai/kudi/agent/register/v2/ui/viewModels/PhoneAndBvnViewModel$LookUpType$ExistingAgent;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.register.v2.ui.viewModels.PhoneAndBvnViewModel$LookUpType */
    /* loaded from: classes.dex */
    public static abstract class LookUpType {

        /* compiled from: PhoneAndBvnViewModel.kt */
        @Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m10421d2 = {"Lai/kudi/agent/register/v2/ui/viewModels/PhoneAndBvnViewModel$LookUpType$ExistingAgent;", "Lai/kudi/agent/register/v2/ui/viewModels/PhoneAndBvnViewModel$LookUpType;", "()V", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
        /* renamed from: ai.kudi.agent.register.v2.ui.viewModels.PhoneAndBvnViewModel$LookUpType$ExistingAgent */
        /* loaded from: classes.dex */
        public static final class ExistingAgent extends LookUpType {
            public static final ExistingAgent INSTANCE;

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            static {
                ExistingAgent $r0 = new ExistingAgent();
                INSTANCE = $r0;
            }

            private ExistingAgent() {
                super(null);
            }
        }

        /* compiled from: PhoneAndBvnViewModel.kt */
        @Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m10421d2 = {"Lai/kudi/agent/register/v2/ui/viewModels/PhoneAndBvnViewModel$LookUpType$NewAgent;", "Lai/kudi/agent/register/v2/ui/viewModels/PhoneAndBvnViewModel$LookUpType;", "()V", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
        /* renamed from: ai.kudi.agent.register.v2.ui.viewModels.PhoneAndBvnViewModel$LookUpType$NewAgent */
        /* loaded from: classes.dex */
        public static final class NewAgent extends LookUpType {
            public static final NewAgent INSTANCE;

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            static {
                NewAgent $r0 = new NewAgent();
                INSTANCE = $r0;
            }

            private NewAgent() {
                super(null);
            }
        }

        private LookUpType() {
        }

        public /* synthetic */ LookUpType(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    public PhoneAndBvnViewModel(CreateTempAgent createTempAgent, Analytics analytics, BvnLookup bvnLookup, BaseOtpUtil baseOtpUtil, RegisterNavigator registerNavigator, CheckIfBvnExists checkIfBvnExists, FetchCurrentUser fetchCurrentUser) {
        Log_OC.getArray(createTempAgent, "createTempAgent");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(bvnLookup, "bvnLookup");
        Log_OC.getArray(baseOtpUtil, "baseOtpUtil");
        Log_OC.getArray(registerNavigator, "navigator");
        Log_OC.getArray(checkIfBvnExists, "checkIfBvnExists");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        this.createTempAgent = createTempAgent;
        this.analytics = analytics;
        this.bvnLookup = bvnLookup;
        this.baseOtpUtil = baseOtpUtil;
        this.navigator = registerNavigator;
        this.checkIfBvnExists = checkIfBvnExists;
        this.fetchCurrentUser = fetchCurrentUser;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final /* synthetic */ PhoneAndBvnViewData access$getState(PhoneAndBvnViewModel phoneAndBvnViewModel) {
        ViewData $r0 = phoneAndBvnViewModel.getState();
        PhoneAndBvnViewData $r2 = (PhoneAndBvnViewData) $r0;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void checkBvnExistence$default(PhoneAndBvnViewModel phoneAndBvnViewModel, String str, String str2, LookUpType lookUpType, String $r5, int i, Object obj) {
        int $i0 = i & 8;
        if ($i0 != 0) {
            $r5 = "";
        }
        phoneAndBvnViewModel.checkBvnExistence(str, str2, lookUpType, $r5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: checkBvnExistence$lambda-0  reason: not valid java name */
    public static final void m40485checkBvnExistence$lambda0(PhoneAndBvnViewModel phoneAndBvnViewModel, LookUpType lookUpType, String str, String str2, String str3, Boolean bool) {
        Log_OC.getArray(phoneAndBvnViewModel, "this$0");
        Log_OC.getArray(lookUpType, "$lookUpType");
        Log_OC.getArray(str, "$phoneNumber");
        Log_OC.getArray(str2, "$identityNumber");
        Log_OC.getArray(str3, "$regId");
        ViewData $r6 = phoneAndBvnViewModel.getState();
        PhoneAndBvnViewData $r7 = (PhoneAndBvnViewData) $r6;
        phoneAndBvnViewModel.publish(PhoneAndBvnViewData.copy$default($r7, false, false, false, false, null, null, 30, null));
        Log_OC.loadImage(bool, "it");
        boolean $z0 = bool.booleanValue();
        if ($z0) {
            RegisterNavigator $r8 = phoneAndBvnViewModel.navigator;
            $r8.toDuplicateIdentityNumberFragment();
            return;
        }
        boolean $z02 = lookUpType instanceof LookUpType.NewAgent;
        if ($z02) {
            phoneAndBvnViewModel.performBvnLookUpAndVerifyPhoneNumber(str, str2, str3);
            return;
        }
        boolean $z03 = lookUpType instanceof LookUpType.ExistingAgent;
        if ($z03) {
            phoneAndBvnViewModel.performBVNLookup(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: checkBvnExistence$lambda-1  reason: not valid java name */
    public static final void m40486checkBvnExistence$lambda1(PhoneAndBvnViewModel phoneAndBvnViewModel, Throwable th) {
        Log_OC.getArray(phoneAndBvnViewModel, "this$0");
        ViewData $r2 = phoneAndBvnViewModel.getState();
        PhoneAndBvnViewData $r3 = (PhoneAndBvnViewData) $r2;
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default("could not fetch identity number", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        PhoneAndBvnViewData.Error $r4 = new PhoneAndBvnViewData.Error(null, null, (String) $r6, 3, null);
        phoneAndBvnViewModel.publish(PhoneAndBvnViewData.copy$default($r3, false, false, false, false, null, $r4, 27, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void handlPhoneNumberLookUpError(Throwable th, String str) {
        boolean $z0 = th instanceof HttpException;
        if ($z0) {
            HttpException $r3 = (HttpException) th;
            int $i0 = $r3.m352a();
            if ($i0 == 503) {
                toLoginView(str);
                return;
            }
            ViewData $r4 = getState();
            InterfaceC11767l $r7 = KudiErrorParserKt.parseHttpError2$default("We couldn't complete your phone number check. Please try again.", null, 2, null);
            Object $r8 = $r7.invoke(th);
            String $r2 = (String) $r8;
            PhoneAndBvnViewData.Error $r6 = new PhoneAndBvnViewData.Error(null, $r2, null, 5, null);
            PhoneAndBvnViewData $r5 = PhoneAndBvnViewData.copy$default((PhoneAndBvnViewData) $r4, false, false, false, false, null, $r6, 27, null);
            publish($r5);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean inputParamsValid(String str, String str2) {
        boolean $z0;
        boolean $z02;
        $z0 = C13276s.m5440u(str);
        if (!$z0) {
            boolean $z03 = StringExtKt.isNigerianPhoneNumber(str);
            if ($z03) {
                $z02 = C13276s.m5440u(str2);
                if (!$z02) {
                    boolean $z04 = StringExtKt.isValidBvn(str2);
                    if ($z04) {
                        return true;
                    }
                }
                ViewData $r3 = getState();
                PhoneAndBvnViewData $r4 = (PhoneAndBvnViewData) $r3;
                PhoneAndBvnViewData.Error $r5 = new PhoneAndBvnViewData.Error(null, null, "Bvn/Nin Number has to be 11 numbers", 3, null);
                publish(PhoneAndBvnViewData.copy$default($r4, false, false, false, false, null, $r5, 28, null));
                return false;
            }
        }
        ViewData $r32 = getState();
        PhoneAndBvnViewData $r42 = (PhoneAndBvnViewData) $r32;
        PhoneAndBvnViewData.Error $r52 = new PhoneAndBvnViewData.Error("Enter valid phone number", null, null, 6, null);
        publish(PhoneAndBvnViewData.copy$default($r42, false, false, false, false, null, $r52, 28, null));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performBVNLookup$lambda-6  reason: not valid java name */
    public static final InterfaceC11692s m40487performBVNLookup$lambda6(PhoneAndBvnViewModel phoneAndBvnViewModel, String str, User user) {
        Log_OC.getArray(phoneAndBvnViewModel, "this$0");
        Log_OC.getArray(str, "$bvn");
        Log_OC.getArray(user, "it");
        BvnLookup $r3 = phoneAndBvnViewModel.bvnLookup;
        String $r4 = user.getSessionId();
        Log_OC.loadImage($r4, "it.sessionId");
        AbstractC11688p $r5 = $r3.execute(str, $r4);
        return $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performBVNLookup$lambda-7  reason: not valid java name */
    public static final void m40488performBVNLookup$lambda7(PhoneAndBvnViewModel phoneAndBvnViewModel, String str, String str2, BvnLookUpResponse bvnLookUpResponse) {
        Log_OC.getArray(phoneAndBvnViewModel, "this$0");
        Log_OC.getArray(str, "$phoneNumber");
        Log_OC.getArray(str2, "$bvn");
        phoneAndBvnViewModel.setBVNValid(true);
        Analytics $r5 = phoneAndBvnViewModel.analytics;
        USERTYPES $r6 = USERTYPES.EXISTING;
        String $r7 = $r6.name();
        OnboardingAnalytics.DefaultImpls.phoneNumberAndBvnSubmitted$default($r5, str, str2, true, $r7, null, 16, null);
        ViewData $r8 = phoneAndBvnViewModel.getState();
        PhoneAndBvnViewData $r9 = PhoneAndBvnViewData.copy$default((PhoneAndBvnViewData) $r8, false, false, false, false, null, null, 29, null);
        phoneAndBvnViewModel.publish($r9);
        RegisterNavigator $r10 = phoneAndBvnViewModel.navigator;
        PersonalInfo $r3 = new PersonalInfo(null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str2, null, null, null, null, null, null, null, null, false, null, -268435461, 127, null);
        RegistrationInfo $r11 = new RegistrationInfo("", $r3, null, false, null, 28, null);
        $r10.toProfilePictureUploadView($r11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performBVNLookup$lambda-8  reason: not valid java name */
    public static final void m40489performBVNLookup$lambda8(PhoneAndBvnViewModel phoneAndBvnViewModel, String str, String str2, Throwable th) {
        Log_OC.getArray(phoneAndBvnViewModel, "this$0");
        Log_OC.getArray(str, "$phoneNumber");
        Log_OC.getArray(str2, "$bvn");
        th.printStackTrace();
        Analytics $r4 = phoneAndBvnViewModel.analytics;
        USERTYPES $r5 = USERTYPES.EXISTING;
        String $r6 = $r5.name();
        String $r7 = th.getMessage();
        $r4.phoneNumberAndBvnSubmitted(str, str2, false, $r6, $r7);
        phoneAndBvnViewModel.setBVNValid(false);
        boolean $z0 = th instanceof HttpException;
        if ($z0) {
            int $i0 = ((HttpException) th).m352a();
            if ($i0 == 404) {
                ViewData $r9 = phoneAndBvnViewModel.getState();
                PhoneAndBvnViewData $r10 = (PhoneAndBvnViewData) $r9;
                PhoneAndBvnViewData.Error $r11 = new PhoneAndBvnViewData.Error(null, null, "Provide a correct BVN/NIN", 3, null);
                phoneAndBvnViewModel.publish(PhoneAndBvnViewData.copy$default($r10, false, false, false, false, null, $r11, 29, null));
                return;
            }
            ViewData $r92 = phoneAndBvnViewModel.getState();
            PhoneAndBvnViewData $r102 = (PhoneAndBvnViewData) $r92;
            InterfaceC11767l $r12 = KudiErrorParserKt.parseHttpError2$default("Unable to fetch bvn details", null, 2, null);
            Object $r13 = $r12.invoke(th);
            String $r2 = (String) $r13;
            PhoneAndBvnViewData.Error $r112 = new PhoneAndBvnViewData.Error(null, null, $r2, 3, null);
            phoneAndBvnViewModel.publish(PhoneAndBvnViewData.copy$default($r102, false, false, false, false, null, $r112, 29, null));
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void performBvnLookUpAndVerifyPhoneNumber$default(PhoneAndBvnViewModel phoneAndBvnViewModel, String str, String str2, String $r4, int i, Object obj) {
        int $i0 = i & 4;
        if ($i0 != 0) {
            $r4 = "";
        }
        phoneAndBvnViewModel.performBvnLookUpAndVerifyPhoneNumber(str, str2, $r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performBvnLookUpAndVerifyPhoneNumber$lambda-4  reason: not valid java name */
    public static final void m40490performBvnLookUpAndVerifyPhoneNumber$lambda4(PhoneAndBvnViewModel phoneAndBvnViewModel, String str, String str2, String str3, LookUpBvnAndVerifyPhoneResponse lookUpBvnAndVerifyPhoneResponse) {
        long $l1;
        Log_OC.getArray(phoneAndBvnViewModel, "this$0");
        Log_OC.getArray(str, "$phoneNumber");
        Log_OC.getArray(str2, "$bvn");
        Log_OC.getArray(str3, "$regId");
        Analytics $r5 = phoneAndBvnViewModel.analytics;
        USERTYPES $r6 = USERTYPES.isMethod;
        String $r7 = $r6.name();
        OnboardingAnalytics.DefaultImpls.phoneNumberAndBvnSubmitted$default($r5, str, str2, true, $r7, null, 16, null);
        ViewData $r8 = phoneAndBvnViewModel.getState();
        PhoneAndBvnViewData $r9 = PhoneAndBvnViewData.copy$default((PhoneAndBvnViewData) $r8, false, false, false, false, null, null, 30, null);
        phoneAndBvnViewModel.publish($r9);
        RegisterNavigator $r10 = phoneAndBvnViewModel.navigator;
        int $i0 = lookUpBvnAndVerifyPhoneResponse.getExpiresInSeconds();
        if ($i0 == 0) {
            $l1 = 600;
        } else {
            int $i02 = lookUpBvnAndVerifyPhoneResponse.getExpiresInSeconds();
            long $l12 = $i02;
            $l1 = $l12;
        }
        OtpData $r12 = new OtpData(str, $l1, str3, null, 8, null);
        OtpFragmentData $r11 = new OtpFragmentData(null, false, $r12, null, null, false, false, null, false, 505, null);
        $r10.toEnterOtpView($r11, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performBvnLookUpAndVerifyPhoneNumber$lambda-5  reason: not valid java name */
    public static final void m40491performBvnLookUpAndVerifyPhoneNumber$lambda5(PhoneAndBvnViewModel phoneAndBvnViewModel, String str, String str2, Throwable th) {
        Log_OC.getArray(phoneAndBvnViewModel, "this$0");
        Log_OC.getArray(str, "$phoneNumber");
        Log_OC.getArray(str2, "$bvn");
        Analytics $r4 = phoneAndBvnViewModel.analytics;
        USERTYPES $r5 = USERTYPES.isMethod;
        String $r6 = $r5.name();
        String $r7 = th.getMessage();
        $r4.phoneNumberAndBvnSubmitted(str, str2, false, $r6, $r7);
        boolean $z0 = th instanceof HttpException;
        if (!$z0) {
            ViewData $r9 = phoneAndBvnViewModel.getState();
            PhoneAndBvnViewData $r10 = (PhoneAndBvnViewData) $r9;
            InterfaceC11767l $r12 = KudiErrorParserKt.parseHttpError2$default("An error occured, please check details and try again", null, 2, null);
            Log_OC.loadImage(th, "it");
            Object $r13 = $r12.invoke(th);
            String $r1 = (String) $r13;
            PhoneAndBvnViewData.Error $r11 = new PhoneAndBvnViewData.Error(null, $r1, null, 5, null);
            phoneAndBvnViewModel.publish(PhoneAndBvnViewData.copy$default($r10, false, false, false, false, null, $r11, 28, null));
            return;
        }
        int $i0 = ((HttpException) th).m352a();
        if ($i0 == 503) {
            ViewData $r92 = phoneAndBvnViewModel.getState();
            PhoneAndBvnViewData $r102 = (PhoneAndBvnViewData) $r92;
            PhoneAndBvnViewData.Error $r112 = new PhoneAndBvnViewData.Error(null, "This phone number already exists on Kudi.", null, 5, null);
            phoneAndBvnViewModel.publish(PhoneAndBvnViewData.copy$default($r102, false, false, false, false, null, $r112, 28, null));
            return;
        }
        ViewData $r93 = phoneAndBvnViewModel.getState();
        PhoneAndBvnViewData $r103 = (PhoneAndBvnViewData) $r93;
        InterfaceC11767l $r122 = KudiErrorParserKt.parseHttpError2$default("An error occured, please check details and try again", null, 2, null);
        Object $r132 = $r122.invoke(th);
        String $r14 = (String) $r132;
        PhoneAndBvnViewData.Error $r113 = new PhoneAndBvnViewData.Error(null, $r14, null, 5, null);
        phoneAndBvnViewModel.publish(PhoneAndBvnViewData.copy$default($r103, false, false, false, false, null, $r113, 28, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performPhoneNumberLookUp$lambda-2  reason: not valid java name */
    public static final void m40492performPhoneNumberLookUp$lambda2(PhoneAndBvnViewModel phoneAndBvnViewModel, CreateTempAgentResponse createTempAgentResponse) {
        Log_OC.getArray(phoneAndBvnViewModel, "this$0");
        String $r2 = createTempAgentResponse.getRegisterationId();
        phoneAndBvnViewModel.setRegId($r2);
        ViewData $r3 = phoneAndBvnViewModel.getState();
        PhoneAndBvnViewData $r4 = (PhoneAndBvnViewData) $r3;
        phoneAndBvnViewModel.publish(PhoneAndBvnViewData.copy$default($r4, false, false, false, false, createTempAgentResponse, null, 43, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performPhoneNumberLookUp$lambda-3  reason: not valid java name */
    public static final void m40493performPhoneNumberLookUp$lambda3(PhoneAndBvnViewModel phoneAndBvnViewModel, String str, Throwable th) {
        Log_OC.getArray(phoneAndBvnViewModel, "this$0");
        Log_OC.getArray(str, "$phoneNumber");
        Log_OC.loadImage(th, "it");
        phoneAndBvnViewModel.handlPhoneNumberLookUpError(th, str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void checkBvnExistence(final String str, final String str2, final LookUpType lookUpType, final String str3) {
        CharSequence $r8;
        Log_OC.getArray(str, "identityNumber");
        Log_OC.getArray(str2, "phoneNumber");
        Log_OC.getArray(lookUpType, "lookUpType");
        Log_OC.getArray(str3, "regId");
        ViewData $r5 = getState();
        PhoneAndBvnViewData $r6 = (PhoneAndBvnViewData) $r5;
        publish(PhoneAndBvnViewData.copy$default($r6, true, false, false, false, null, null, 30, null));
        CheckIfBvnExists $r7 = this.checkIfBvnExists;
        $r8 = C13277t.m5414M0(str);
        String $r9 = $r8.toString();
        AbstractC11688p $r10 = $r7.execute($r9);
        FavoritesArrayAdapter $r13 = $r10.e0(new Object() { // from class: ai.kudi.agent.register.v2.ui.viewModels.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PhoneAndBvnViewModel $r2 = PhoneAndBvnViewModel.this;
                PhoneAndBvnViewModel.LookUpType $r3 = lookUpType;
                String $r4 = str2;
                String $r52 = str;
                String $r62 = str3;
                Boolean $r72 = (Boolean) obj;
                PhoneAndBvnViewModel.m40485checkBvnExistence$lambda0($r2, $r3, $r4, $r52, $r62, $r72);
            }
        }, new Object() { // from class: ai.kudi.agent.register.v2.ui.viewModels.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PhoneAndBvnViewModel $r1 = PhoneAndBvnViewModel.this;
                Throwable $r3 = (Throwable) obj;
                PhoneAndBvnViewModel.m40486checkBvnExistence$lambda1($r1, $r3);
            }
        });
        C11280b $r14 = getCompositeDisposable();
        $r14.b($r13);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getRegId() {
        String r1 = this.regId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        PhoneAndBvnViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public PhoneAndBvnViewData initialData() {
        PhoneAndBvnViewData $r1 = new PhoneAndBvnViewData(false, false, false, false, null, null, 30, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isBVNValid() {
        boolean z0 = this.isBVNValid;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void logLearnMoreClicked(boolean z) {
        Analytics $r1 = this.analytics;
        USERTYPES $r3 = z ? USERTYPES.isMethod : USERTYPES.EXISTING;
        String $r2 = $r3.name();
        $r1.learnMoreAboutBVN($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void logOnPhoneNoEntered(String str) {
        Log_OC.getArray(str, AttributeType.PHONE);
        Analytics $r2 = this.analytics;
        $r2.onPhoneNumberEntered(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void performBVNLookup(final String str, final String str2) {
        Log_OC.getArray(str, "phoneNumber");
        Log_OC.getArray(str2, PhoneFragment.ARG_BVN);
        boolean $z0 = inputParamsValid(str, str2);
        if ($z0) {
            ViewData $r3 = getState();
            PhoneAndBvnViewData $r4 = (PhoneAndBvnViewData) $r3;
            publish(PhoneAndBvnViewData.copy$default($r4, false, true, false, false, null, null, 29, null));
            FetchCurrentUser $r5 = this.fetchCurrentUser;
            AbstractC11696w $r6 = FetchCurrentUser.execute$default($r5, null, null, 3, null);
            AbstractC11688p $r8 = $r6.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.register.v2.ui.viewModels.Type
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.InterfaceC11291f
                /* renamed from: a */
                public final Object mo10663a(Object obj) {
                    PhoneAndBvnViewModel $r1 = PhoneAndBvnViewModel.this;
                    String $r2 = str2;
                    User $r52 = (User) obj;
                    InterfaceC11692s $r32 = PhoneAndBvnViewModel.m40487performBVNLookup$lambda6($r1, $r2, $r52);
                    return $r32;
                }
            });
            FavoritesArrayAdapter $r11 = $r8.e0(new Object() { // from class: ai.kudi.agent.register.v2.ui.viewModels.Call
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    PhoneAndBvnViewModel $r1 = PhoneAndBvnViewModel.this;
                    String $r2 = str;
                    String $r32 = str2;
                    BvnLookUpResponse $r52 = (BvnLookUpResponse) obj;
                    PhoneAndBvnViewModel.m40488performBVNLookup$lambda7($r1, $r2, $r32, $r52);
                }
            }, new Object() { // from class: ai.kudi.agent.register.v2.ui.viewModels.MethodWriter
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    PhoneAndBvnViewModel $r1 = PhoneAndBvnViewModel.this;
                    String $r2 = str;
                    String $r32 = str2;
                    Throwable $r52 = (Throwable) obj;
                    PhoneAndBvnViewModel.m40489performBVNLookup$lambda8($r1, $r2, $r32, $r52);
                }
            });
            C11280b $r12 = getCompositeDisposable();
            $r12.b($r11);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void performBvnLookUpAndVerifyPhoneNumber(final String str, final String str2, final String str3) {
        Log_OC.getArray(str, "phoneNumber");
        Log_OC.getArray(str2, PhoneFragment.ARG_BVN);
        Log_OC.getArray(str3, "regId");
        ViewData $r4 = getState();
        PhoneAndBvnViewData $r5 = (PhoneAndBvnViewData) $r4;
        publish(PhoneAndBvnViewData.copy$default($r5, true, false, false, false, null, null, 30, null));
        boolean $z0 = inputParamsValid(str, str2);
        if ($z0) {
            BvnLookup $r6 = this.bvnLookup;
            LookUpBvnAndVerifyPhoneRequest $r7 = new LookUpBvnAndVerifyPhoneRequest(str2, str, str3);
            AbstractC11688p $r8 = $r6.bvnLookUpAndVerifyPhone($r7);
            FavoritesArrayAdapter $r11 = $r8.e0(new Object() { // from class: ai.kudi.agent.register.v2.ui.viewModels.ClassWriter
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    PhoneAndBvnViewModel $r1 = PhoneAndBvnViewModel.this;
                    String $r2 = str;
                    String $r3 = str2;
                    String $r42 = str3;
                    LookUpBvnAndVerifyPhoneResponse $r62 = (LookUpBvnAndVerifyPhoneResponse) obj;
                    PhoneAndBvnViewModel.m40490performBvnLookUpAndVerifyPhoneNumber$lambda4($r1, $r2, $r3, $r42, $r62);
                }
            }, new Object() { // from class: ai.kudi.agent.register.v2.ui.viewModels.ExtensionData
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    PhoneAndBvnViewModel $r1 = PhoneAndBvnViewModel.this;
                    String $r2 = str;
                    String $r3 = str2;
                    Throwable $r52 = (Throwable) obj;
                    PhoneAndBvnViewModel.m40491performBvnLookUpAndVerifyPhoneNumber$lambda5($r1, $r2, $r3, $r52);
                }
            });
            C11280b $r12 = getCompositeDisposable();
            $r12.b($r11);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void performPhoneNumberLookUp(final String str) {
        boolean $z0;
        Log_OC.getArray(str, "phoneNumber");
        ViewData $r2 = getState();
        PhoneAndBvnViewData $r3 = (PhoneAndBvnViewData) $r2;
        publish(PhoneAndBvnViewData.copy$default($r3, false, false, true, false, null, null, 27, null));
        $z0 = C13276s.m5440u(str);
        if (!$z0) {
            boolean $z02 = StringExtKt.isNigerianPhoneNumber(str);
            if ($z02) {
                CreateTempAgent $r4 = this.createTempAgent;
                CreateTempAgentRequest $r5 = new CreateTempAgentRequest(str);
                AbstractC11688p $r6 = $r4.executeV2($r5);
                FavoritesArrayAdapter $r9 = $r6.e0(new Object() { // from class: ai.kudi.agent.register.v2.ui.viewModels.RxRingBuffer
                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // p425j.p444e.p450e0.Object
                    public final void accept(Object obj) {
                        PhoneAndBvnViewModel $r1 = PhoneAndBvnViewModel.this;
                        CreateTempAgentResponse $r32 = (CreateTempAgentResponse) obj;
                        PhoneAndBvnViewModel.m40492performPhoneNumberLookUp$lambda2($r1, $r32);
                    }
                }, new Object() { // from class: ai.kudi.agent.register.v2.ui.viewModels.IOUtils$2
                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // p425j.p444e.p450e0.Object
                    public final void accept(Object obj) {
                        PhoneAndBvnViewModel $r1 = PhoneAndBvnViewModel.this;
                        String $r22 = str;
                        Throwable $r42 = (Throwable) obj;
                        PhoneAndBvnViewModel.m40493performPhoneNumberLookUp$lambda3($r1, $r22, $r42);
                    }
                });
                C11280b $r10 = getCompositeDisposable();
                $r10.b($r9);
                return;
            }
        }
        ViewData $r22 = getState();
        PhoneAndBvnViewData $r32 = (PhoneAndBvnViewData) $r22;
        PhoneAndBvnViewData.Error $r11 = new PhoneAndBvnViewData.Error("please enter a valid phone number", null, null, 6, null);
        publish(PhoneAndBvnViewData.copy$default($r32, false, false, false, false, null, $r11, 27, null));
    }

    public final void setBVNValid(boolean z) {
        this.isBVNValid = z;
    }

    public final void setRegId(String str) {
        this.regId = str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void toLoginView(String str) {
        Log_OC.getArray(str, "phoneNumber");
        RegisterNavigator $r2 = this.navigator;
        $r2.toLoginView(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void verifyPhoneNumber(User user) {
        Log_OC.getArray(user, "user");
        ViewData $r2 = getState();
        PhoneAndBvnViewData $r3 = (PhoneAndBvnViewData) $r2;
        publish(PhoneAndBvnViewData.copy$default($r3, false, false, false, true, null, null, 23, null));
        BaseOtpUtil $r4 = this.baseOtpUtil;
        String $r5 = user.getPhoneNumber();
        Log_OC.loadImage($r5, "user.phoneNumber");
        PhoneAndBvnViewModel$verifyPhoneNumber$1 $r6 = new PhoneAndBvnViewModel$verifyPhoneNumber$1(this, user);
        PhoneAndBvnViewModel$verifyPhoneNumber$2 $r7 = new PhoneAndBvnViewModel$verifyPhoneNumber$2(this);
        FavoritesArrayAdapter $r8 = $r4.requestOtpForgotPin($r5, $r6, $r7);
        C11280b $r9 = getCompositeDisposable();
        RxExtKt.addTo($r8, $r9);
    }
}
