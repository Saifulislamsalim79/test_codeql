package ai.kudi.agent.login.p011ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.analytics.SmartLookAnalytics;
import ai.kudi.agent.biometric.BiometricCallback;
import ai.kudi.agent.biometric.BiometricManagerCompat;
import ai.kudi.agent.biometric.BiometricUtils;
import ai.kudi.agent.biometric.security.IPFSecurityUtils;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvp.MvpActivity;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ImageViewExtKt;
import ai.kudi.agent.core.util.LocationUtil;
import ai.kudi.agent.core.util.ManageDevice;
import ai.kudi.agent.core.util.Pref;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.util.image.ImageUtil;
import ai.kudi.agent.databinding.ActivityLoginBinding;
import ai.kudi.agent.login.domain.LoginParams;
import ai.kudi.agent.login.domain.model.AccountErrorType;
import ai.kudi.agent.login.game.components.LoginSubComponent;
import ai.kudi.agent.login.p011ui.AccountErrorActivity;
import ai.kudi.agent.login.p011ui.p012v2.ForgotPasswordActivity;
import ai.kudi.agent.login.presenters.LoginPresenter;
import ai.kudi.agent.login.setup.p010ui.SetupAgentAccountActivity;
import ai.kudi.agent.login.views.LoginView;
import ai.kudi.agent.p036v2.common.utils.ViewUtils_extKt;
import ai.kudi.agent.register.domain.wiki.OtpVerificationModel;
import ai.kudi.agent.register.domain.wiki.RegistrationInfo;
import ai.kudi.agent.register.p022v2.p023ui.PendingKycActivity;
import ai.kudi.agent.register.p022v2.p023ui.RegisterActivity;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.DialogInterfaceC0936d;
import androidx.core.app.C1291a;
import androidx.core.content.C1335a;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.location.C4107a;
import com.google.android.gms.location.C4109b;
import com.google.android.gms.tasks.InterfaceC4454e;
import com.google.android.gms.tasks.Item;
import com.google.firebase.remoteconfig.Frame;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.concurrent.Executor;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import kotlin.p549l0.C13277t;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import p590o.p591a.Timber;
/* compiled from: LoginActivity.kt */
@Metadata(m10422d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u009d\u00012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0002:\u0002\u009d\u0001B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010S\u001a\u00020TH\u0002J\b\u0010U\u001a\u00020VH\u0002J\b\u0010W\u001a\u00020TH\u0003J\b\u0010X\u001a\u00020\u0003H\u0016J\b\u0010Y\u001a\u00020TH\u0002J\b\u0010Z\u001a\u00020TH\u0002J\b\u0010[\u001a\u00020\u0010H\u0002J\u0010\u0010\\\u001a\u00020\u00102\u0006\u00106\u001a\u00020\u001dH\u0016J\u0010\u0010]\u001a\u00020\u00102\u0006\u0010^\u001a\u00020\u001dH\u0016J\b\u0010_\u001a\u00020TH\u0002J\u0010\u0010`\u001a\u00020T2\u0006\u0010a\u001a\u00020bH\u0016J\u001a\u0010c\u001a\u00020T2\u0006\u0010d\u001a\u00020\u001d2\b\u0010e\u001a\u0004\u0018\u00010fH\u0016J@\u0010g\u001a\u00020T2\u0006\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020\u00102\u0006\u0010k\u001a\u00020\u00102\u0006\u0010l\u001a\u00020\u00102\u0006\u0010m\u001a\u00020\u00102\u0006\u0010n\u001a\u00020\u00102\u0006\u0010o\u001a\u00020\u001dH\u0016J\b\u0010p\u001a\u00020TH\u0016J\b\u0010q\u001a\u00020TH\u0002J\b\u0010r\u001a\u00020TH\u0016J\u0010\u0010s\u001a\u00020T2\u0006\u0010t\u001a\u00020uH\u0016J\u0012\u0010v\u001a\u00020T2\b\u0010w\u001a\u0004\u0018\u00010xH\u0014J\b\u0010y\u001a\u00020TH\u0002J\b\u0010z\u001a\u00020TH\u0002J0\u0010{\u001a\u00020T2\u0006\u0010|\u001a\u00020}2\u000e\u0010~\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u007f2\b\u0010\u0080\u0001\u001a\u00030\u0081\u0001H\u0016¢\u0006\u0003\u0010\u0082\u0001J\t\u0010\u0083\u0001\u001a\u00020TH\u0016J\t\u0010\u0084\u0001\u001a\u00020TH\u0016J\t\u0010\u0085\u0001\u001a\u00020TH\u0002J\u0007\u0010\u0086\u0001\u001a\u00020TJ\t\u0010\u0087\u0001\u001a\u00020TH\u0002J\t\u0010\u0088\u0001\u001a\u00020TH\u0002J\t\u0010\u0089\u0001\u001a\u00020TH\u0002J\t\u0010\u008a\u0001\u001a\u00020TH\u0002J\t\u0010\u008b\u0001\u001a\u00020TH\u0016J\t\u0010\u008c\u0001\u001a\u00020TH\u0017J\u001c\u0010\u008d\u0001\u001a\u00020T2\u0007\u0010\u008e\u0001\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0012\u0010\u008f\u0001\u001a\u00020T2\u0007\u0010\u0090\u0001\u001a\u00020\u001dH\u0016J\u0013\u0010\u0091\u0001\u001a\u00020T2\b\u0010\u0092\u0001\u001a\u00030\u0093\u0001H\u0016J\u0012\u0010\u0094\u0001\u001a\u00020T2\u0007\u0010\u0095\u0001\u001a\u00020}H\u0016J\u0012\u0010\u0096\u0001\u001a\u00020T2\u0007\u0010\u0095\u0001\u001a\u00020}H\u0016J\u0012\u0010\u0097\u0001\u001a\u00020T2\u0007\u0010\u0098\u0001\u001a\u00020\u0010H\u0016J.\u0010\u0099\u0001\u001a\u00020T2\u0007\u0010\u009a\u0001\u001a\u00020\u001d2\u0007\u0010\u009b\u0001\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u001d2\t\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u001dH\u0017R\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0017\u0010\u0005\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\"\u001a\u00020#8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0010\u0010.\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00100\u001a\u000201X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u00106\u001a\u00020\u001dX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001f\"\u0004\b8\u0010!R\u001e\u00109\u001a\u00020:8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001e\u0010?\u001a\u00020@8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001e\u0010E\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0019\"\u0004\bG\u0010\u001bR\u001e\u0010H\u001a\u00020I8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001e\u0010N\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010R¨\u0006\u009e\u0001"}, m10421d2 = {"Lai/kudi/agent/login/ui/LoginActivity;", "Lai/kudi/agent/core/mvp/MvpActivity;", "Lai/kudi/agent/login/views/LoginView;", "Lai/kudi/agent/login/presenters/LoginPresenter;", "Lai/kudi/agent/databinding/ActivityLoginBinding;", "()V", "activityBinding", "getActivityBinding", "()Lai/kudi/agent/databinding/ActivityLoginBinding;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "getAnalytics", "()Lai/kudi/agent/core/analytics/Analytics;", "setAnalytics", "(Lai/kudi/agent/core/analytics/Analytics;)V", "cancel", "", "getCancel", "()Z", "setCancel", "(Z)V", "devicePrefs", "Landroid/content/SharedPreferences;", "getDevicePrefs$annotations", "getDevicePrefs", "()Landroid/content/SharedPreferences;", "setDevicePrefs", "(Landroid/content/SharedPreferences;)V", "encodedPin", "", "getEncodedPin", "()Ljava/lang/String;", "setEncodedPin", "(Ljava/lang/String;)V", "fac", "Lai/kudi/agent/biometric/security/IPFSecurityUtils;", "getFac", "()Lai/kudi/agent/biometric/security/IPFSecurityUtils;", "setFac", "(Lai/kudi/agent/biometric/security/IPFSecurityUtils;)V", "focusView", "Landroid/view/View;", "getFocusView", "()Landroid/view/View;", "setFocusView", "(Landroid/view/View;)V", "imeiId", "lastPhoneNumber", "loginSubComponent", "Lai/kudi/agent/login/di/components/LoginSubComponent;", "getLoginSubComponent", "()Lai/kudi/agent/login/di/components/LoginSubComponent;", "setLoginSubComponent", "(Lai/kudi/agent/login/di/components/LoginSubComponent;)V", "phoneNumber", "getPhoneNumber", "setPhoneNumber", "pref", "Lai/kudi/agent/core/util/Pref;", "getPref", "()Lai/kudi/agent/core/util/Pref;", "setPref", "(Lai/kudi/agent/core/util/Pref;)V", "remoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "getRemoteConfig", "()Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "setRemoteConfig", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;)V", "sharedPrefs", "getSharedPrefs", "setSharedPrefs", "smartLookAnalytics", "Lai/kudi/agent/analytics/SmartLookAnalytics;", "getSmartLookAnalytics", "()Lai/kudi/agent/analytics/SmartLookAnalytics;", "setSmartLookAnalytics", "(Lai/kudi/agent/analytics/SmartLookAnalytics;)V", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/login/presenters/LoginPresenter;", "setThisPresenter", "(Lai/kudi/agent/login/presenters/LoginPresenter;)V", "attemptLogin", "", "biometricCallback", "Lai/kudi/agent/biometric/BiometricCallback;", "cacheImei", "createPresenter", "displayBiometricPromptCompat", "handleTandC", "hasReadPhoneStatePermission", "isInvalidsPhone", "isPinValid", "pin", "loginBiometric", "navigateToAccountError", "accountErrorType", "Lai/kudi/agent/login/domain/model/AccountErrorType;", "navigateToAccountHolderVerification", TransactionField.STATUS, "otpVerificationModel", "Lai/kudi/agent/register/domain/dto/OtpVerificationModel;", "navigateToDashboard", "walletBalance", "", "isNewUser", "isKCashEnabled", "isC2C", "isHq", "isOutlet", "customerType", "navigateToDeviceUpdate", "navigateToForgottenPassword", "navigateToLogin", "navigateToPhoneAndPinFragment", "user", "Lai/kudi/agent/users/domain/dto/User;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onLoginClicked", "onRegisterTextClicked", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "requestFocus", "requestPhonePermission", "resetError", "restoreLastPhoneNumber", "saveLastPhoneNumber", "setProvidedPhoneNumber", "setUpPinInput", "showAppForAgentOnly", "showContactSupportDialog", "showFingerPrintIcon", "toShow", "showLoginError", MetricTracker.Object.MESSAGE, "showPendingKycScreen", "registrationInfo", "Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "showPhoneNumberError", "errorMessageResource", "showPinError", "showProgress", "visible", "showUserProfile", "firstName", "lastName", "profilePictureUrl", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.login.ui.LoginActivity */
/* loaded from: classes.dex */
public final class LoginActivity extends MvpActivity<LoginView, LoginPresenter, ActivityLoginBinding> implements LoginView {
    public static final Companion Companion;
    public static final String IS_NOMBA_TERMS_CHECKED = "IS_NOMBA_TERMS_CHECKED";
    public Analytics analytics;
    private boolean cancel;
    public SharedPreferences devicePrefs;
    private String encodedPin;
    private View focusView;
    private String imeiId;
    private String lastPhoneNumber = "";
    public LoginSubComponent loginSubComponent;
    public IPFSecurityUtils mProgressView;
    public String phoneNumber;
    public Pref pref;
    public Frame remoteConfig;
    public SharedPreferences sharedPrefs;
    public SmartLookAnalytics smartLookAnalytics;
    public LoginPresenter thisPresenter;

    /* compiled from: LoginActivity.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/login/ui/LoginActivity$Companion;", "", "()V", LoginActivity.IS_NOMBA_TERMS_CHECKED, "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.login.ui.LoginActivity$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void attemptLogin() {
        this.cancel = false;
        this.focusView = null;
        InterfaceC8209a $r2 = getBinding();
        ActivityLoginBinding $r3 = (ActivityLoginBinding) $r2;
        KudiInputField $r4 = $r3.phoneNumberEditText;
        String $r5 = $r4.getText();
        setPhoneNumber($r5);
        SmartLookAnalytics $r6 = getSmartLookAnalytics();
        String $r52 = getPhoneNumber();
        $r6.setUserId($r52);
        InterfaceC8209a $r22 = getBinding();
        ActivityLoginBinding $r32 = (ActivityLoginBinding) $r22;
        KudiInputField $r42 = $r32.pinEditText;
        String $r53 = $r42.getText();
        InterfaceC9413d $r7 = this.presenter;
        String $r9 = getPhoneNumber();
        ((LoginPresenter) $r7).performValidationOfInputs($r9, $r53);
        boolean $z0 = this.cancel;
        if ($z0) {
            View $r10 = this.focusView;
            if ($r10 == null) {
                return;
            }
            $r10.requestFocus();
            return;
        }
        Activity r18 = (Activity) this;
        SharedPreferences $r11 = r18.getSharedPreferences(ManageDevice.SECURE_DEVICE_PREFERENCE, 0);
        String $r12 = $r11.getString(ManageDevice.GENERATED_ID, "");
        String $r13 = $r12;
        if ($r12 == null) {
            $r13 = "";
        }
        String $r122 = $r11.getString(ManageDevice.GENERATED_NAME, "");
        String $r92 = $r122 != null ? $r122 : "";
        resetError();
        Activity r182 = (Activity) this;
        LocationUtil r16 = new LocationUtil(r182);
        Activity r183 = (Activity) this;
        C4107a $r15 = C4109b.m28503a(r183);
        Log_OC.loadImage($r15, "getFusedLocationProviderClient(this)");
        LoginActivity$attemptLogin$1 r17 = new LoginActivity$attemptLogin$1(this, $r53, $r92, $r13);
        LocationUtil.getLastLocation$default(r16, $r15, 0, r17, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final BiometricCallback biometricCallback() {
        return new BiometricCallback() { // from class: ai.kudi.agent.login.ui.LoginActivity$biometricCallback$1
            @Override // ai.kudi.agent.biometric.BiometricCallback
            public void onAuthenticationError(int i, CharSequence charSequence) {
                Log_OC.getArray(charSequence, "errString");
            }

            @Override // ai.kudi.agent.biometric.BiometricCallback
            public void onAuthenticationFailed() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.biometric.BiometricCallback
            public void onAuthenticationSuccessful() {
                LoginActivity $r1 = LoginActivity.this;
                $r1.loginBiometric();
            }
        };
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void cacheImei() {
        String $r3;
        Activity r9 = (Activity) this;
        Object $r1 = r9.getSystemService(AttributeType.PHONE);
        if ($r1 == null) {
            NullPointerException r8 = new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
            throw r8;
        }
        TelephonyManager $r2 = (TelephonyManager) $r1;
        int $i0 = Build.VERSION.SDK_INT;
        $r3 = "Not available";
        if ($i0 >= 29) {
            this.imeiId = "Not available";
        } else if ($i0 >= 26) {
            String $r4 = $r2.getImei();
            if ($r4 == null) {
                String $r42 = $r2.getMeid();
                if ($r42 != null) {
                    $r3 = $r42;
                }
            } else {
                $r3 = $r4;
            }
            this.imeiId = $r3;
        } else {
            String $r43 = $r2.getDeviceId();
            $r3 = $r43 != null ? $r43 : "Not available";
            this.imeiId = $r3;
        }
        SharedPreferences $r5 = getDevicePrefs();
        SharedPreferences.Editor $r6 = $r5.edit();
        $r6.putString(ManageDevice.IMEID_PARAM, this.imeiId).apply();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void displayBiometricPromptCompat() {
        Context r5 = (Context) this;
        Executor $r2 = C1335a.m36319i(r5);
        if ($r2 != null) {
            BiometricCallback $r3 = biometricCallback();
            FragmentActivity r6 = (FragmentActivity) this;
            BiometricManagerCompat r4 = new BiometricManagerCompat($r3, r6, $r2);
            r4.authenticate();
        }
    }

    public static /* synthetic */ void getDevicePrefs$annotations() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void handleTandC() {
        SharedPreferences $r1 = getSharedPrefs();
        boolean $z0 = $r1.getBoolean(IS_NOMBA_TERMS_CHECKED, false);
        if ($z0) {
            InterfaceC8209a $r2 = getBinding();
            ActivityLoginBinding $r3 = (ActivityLoginBinding) $r2;
            KudiButton $r4 = $r3.loginButton;
            $r4.m38034d();
            InterfaceC8209a $r22 = getBinding();
            ActivityLoginBinding $r32 = (ActivityLoginBinding) $r22;
            LinearLayout $r5 = $r32.termsLinearLayout;
            Log_OC.loadImage($r5, "binding.termsLinearLayout");
            ViewExtKt.hide$default($r5, false, 1, null);
        } else {
            InterfaceC8209a $r23 = getBinding();
            ActivityLoginBinding $r33 = (ActivityLoginBinding) $r23;
            KudiButton $r42 = $r33.loginButton;
            $r42.m38035c();
            InterfaceC8209a $r24 = getBinding();
            ActivityLoginBinding $r34 = (ActivityLoginBinding) $r24;
            LinearLayout $r52 = $r34.termsLinearLayout;
            Log_OC.loadImage($r52, "binding.termsLinearLayout");
            ViewExtKt.show($r52);
        }
        InterfaceC8209a $r25 = getBinding();
        ActivityLoginBinding $r35 = (ActivityLoginBinding) $r25;
        CheckBox $r6 = $r35.termsAndConditionCheckbox;
        $r6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ai.kudi.agent.login.ui.SettingsActivity$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                LoginActivity $r26 = LoginActivity.this;
                LoginActivity.m39789handleTandC$lambda3($r26, compoundButton, z);
            }
        });
        InterfaceC8209a $r26 = getBinding();
        ActivityLoginBinding $r36 = (ActivityLoginBinding) $r26;
        TextView $r8 = $r36.kudiTermsOfUseTextView;
        $r8.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.login.ui.Window$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity $r27 = LoginActivity.this;
                LoginActivity.m39790handleTandC$lambda5($r27, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: handleTandC$lambda-3  reason: not valid java name */
    public static final void m39789handleTandC$lambda3(LoginActivity loginActivity, CompoundButton compoundButton, boolean z) {
        Log_OC.getArray(loginActivity, "this$0");
        SharedPreferences $r2 = loginActivity.getSharedPrefs();
        SharedPreferences.Editor $r3 = $r2.edit();
        $r3.putBoolean(IS_NOMBA_TERMS_CHECKED, z).apply();
        InterfaceC8209a $r4 = loginActivity.getBinding();
        ActivityLoginBinding $r5 = (ActivityLoginBinding) $r4;
        KudiButton $r6 = $r5.loginButton;
        if (z) {
            $r6.m38034d();
        } else {
            $r6.m38035c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: handleTandC$lambda-5  reason: not valid java name */
    public static final void m39790handleTandC$lambda5(final LoginActivity loginActivity, View view) {
        Log_OC.getArray(loginActivity, "this$0");
        Frame $r3 = loginActivity.getRemoteConfig();
        Item $r4 = $r3.m20914c();
        $r4.m27799a(new InterfaceC4454e() { // from class: ai.kudi.agent.login.ui.c
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: b */
            public final void m38734b(Item item) {
                LoginActivity $r2 = LoginActivity.this;
                LoginActivity.m39791handleTandC$lambda5$lambda4($r2, item);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: handleTandC$lambda-5$lambda-4  reason: not valid java name */
    public static final void m39791handleTandC$lambda5$lambda4(LoginActivity loginActivity, Item item) {
        Log_OC.getArray(loginActivity, "this$0");
        Log_OC.getArray(item, "it");
        boolean $z0 = item.m27801a();
        if ($z0) {
            Frame $r2 = loginActivity.getRemoteConfig();
            String $r3 = $r2.getSetting("terms_and_conditions_url");
            Log_OC.loadImage($r3, "remoteConfig.getString(\"terms_and_conditions_url\")");
            AppCompatActivity r4 = (AppCompatActivity) loginActivity;
            AppCompatActivityExtKt.openTermsAndConditions(r4, $r3);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean hasReadPhoneStatePermission() {
        Context r1 = (Context) this;
        int $i0 = C1335a.m36327a(r1, "android.permission.READ_PHONE_STATE");
        return $i0 == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void loginBiometric() {
        IPFSecurityUtils $r1 = getFac();
        String $r2 = this.encodedPin;
        Log_OC.append($r2);
        String $r22 = $r1.decode("fp_pin_lock_screen_key_store", $r2);
        InterfaceC8209a $r3 = getBinding();
        ActivityLoginBinding $r4 = (ActivityLoginBinding) $r3;
        KudiInputField $r5 = $r4.pinEditText;
        $r5.setText($r22);
        boolean $z0 = hasReadPhoneStatePermission();
        if (!$z0 && this.imeiId == null) {
            requestPhonePermission();
            return;
        }
        if (this.imeiId == null) {
            cacheImei();
        }
        attemptLogin();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void navigateToForgottenPassword() {
        Activity r1 = (Activity) this;
        ContextExtKt.hideKeyboard(r1);
        Context r2 = (Context) this;
        ContextExtKt.launchActivity$default(r2, false, ForgotPasswordActivity.class, (InterfaceC11767l) null, 5, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-0  reason: not valid java name */
    public static final void m39792onCreate$lambda0(LoginActivity loginActivity, View view) {
        Log_OC.getArray(loginActivity, "this$0");
        loginActivity.onRegisterTextClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-1  reason: not valid java name */
    public static final void m39793onCreate$lambda1(LoginActivity loginActivity, View view) {
        Log_OC.getArray(loginActivity, "this$0");
        loginActivity.navigateToForgottenPassword();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onCreate$lambda-2  reason: not valid java name */
    public static final void m39794onCreate$lambda2(LoginActivity loginActivity, View view) {
        Log_OC.getArray(loginActivity, "this$0");
        Activity r2 = (Activity) loginActivity;
        ContextExtKt.hideKeyboard(r2);
        loginActivity.onLoginClicked();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onLoginClicked() {
        boolean $z0 = hasReadPhoneStatePermission();
        if (!$z0) {
            String $r1 = this.imeiId;
            if ($r1 == null) {
                requestPhonePermission();
                return;
            }
        }
        String $r12 = this.imeiId;
        if ($r12 == null) {
            cacheImei();
        }
        attemptLogin();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onRegisterTextClicked() {
        Activity r3 = (Activity) this;
        ContextExtKt.hideKeyboard(r3);
        Analytics $r2 = getAnalytics();
        $r2.createAccountClicked();
        LoginActivity$onRegisterTextClicked$1 $r1 = LoginActivity$onRegisterTextClicked$1.INSTANCE;
        Context r4 = (Context) this;
        ContextExtKt.launchActivity$default(r4, false, RegisterActivity.class, (InterfaceC11767l) $r1, 1, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void requestPhonePermission() {
        String[] $r1 = {"android.permission.READ_PHONE_STATE"};
        Activity r2 = (Activity) this;
        C1291a.m36466q(r2, $r1, 30);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void restoreLastPhoneNumber() {
        boolean $z0;
        SharedPreferences $r1 = getSharedPrefs();
        String $r3 = $r1.getString(LoginParams.PREF_LAST_PHONE_NUMBER, "");
        String $r2 = $r3 != null ? $r3 : "";
        this.lastPhoneNumber = $r2;
        InterfaceC8209a $r4 = getBinding();
        ActivityLoginBinding $r5 = (ActivityLoginBinding) $r4;
        KudiInputField $r6 = $r5.phoneNumberEditText;
        EditText $r7 = $r6.getInputEditText();
        String $r22 = this.lastPhoneNumber;
        $r7.setText($r22);
        String $r23 = this.lastPhoneNumber;
        $z0 = C13276s.m5440u($r23);
        if (!$z0) {
            InterfaceC8209a $r42 = getBinding();
            ActivityLoginBinding $r52 = (ActivityLoginBinding) $r42;
            KudiInputField $r62 = $r52.pinEditText;
            EditText $r72 = $r62.getInputEditText();
            $r72.requestFocus();
            LoginPresenter $r8 = getThisPresenter();
            String $r24 = this.lastPhoneNumber;
            $r8.shouldEnableFingerPint($r24);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void saveLastPhoneNumber() {
        SharedPreferences $r1 = getSharedPrefs();
        SharedPreferences.Editor $r2 = $r1.edit();
        InterfaceC8209a $r3 = getBinding();
        ActivityLoginBinding $r4 = (ActivityLoginBinding) $r3;
        KudiInputField $r5 = $r4.phoneNumberEditText;
        String $r6 = $r5.getText();
        $r2.putString(LoginParams.PREF_LAST_PHONE_NUMBER, $r6).putBoolean(LoginParams.PREF_NEW_ONBOARDING_SUPPORT, true).apply();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setProvidedPhoneNumber() {
        Activity r7 = (Activity) this;
        Intent $r1 = r7.getIntent();
        String $r2 = $r1 == null ? null : $r1.getStringExtra(LoginParams.EXTRA_PHONE_NUMBER);
        InterfaceC8209a $r3 = getBinding();
        ActivityLoginBinding $r4 = (ActivityLoginBinding) $r3;
        KudiInputField $r5 = $r4.phoneNumberEditText;
        EditText $r6 = $r5.getInputEditText();
        $r6.setText($r2);
        if ($r2 == null) {
            return;
        }
        InterfaceC8209a $r32 = getBinding();
        ActivityLoginBinding $r42 = (ActivityLoginBinding) $r32;
        KudiInputField $r52 = $r42.pinEditText;
        EditText $r62 = $r52.getInputEditText();
        $r62.requestFocus();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setUpPinInput() {
        InterfaceC8209a $r1 = getBinding();
        ActivityLoginBinding $r2 = (ActivityLoginBinding) $r1;
        KudiInputField $r3 = $r2.pinEditText;
        EditText $r4 = $r3.getInputEditText();
        $r4.setImeActionLabel("Login", 6);
        $r4.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: ai.kudi.agent.login.ui.MainActivity$5
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                LoginActivity $r22 = LoginActivity.this;
                boolean $z0 = LoginActivity.m39795setUpPinInput$lambda13$lambda12($r22, textView, i, keyEvent);
                return $z0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpPinInput$lambda-13$lambda-12  reason: not valid java name */
    public static final boolean m39795setUpPinInput$lambda13$lambda12(LoginActivity loginActivity, TextView textView, int i, KeyEvent keyEvent) {
        Log_OC.getArray(loginActivity, "this$0");
        if (i == 6) {
            Activity r3 = (Activity) loginActivity;
            ContextExtKt.hideKeyboard(r3);
            loginActivity.onLoginClicked();
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: showAppForAgentOnly$lambda-6  reason: not valid java name */
    public static final void m39796showAppForAgentOnly$lambda6(LoginActivity loginActivity, DialogInterface dialogInterface, int i) {
        Log_OC.getArray(loginActivity, "this$0");
        Activity r2 = (Activity) loginActivity;
        AppCompatActivityExtKt.openAppStore(r2, "ai.kudi.kudiapp");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: showContactSupportDialog$lambda-10$lambda-9$lambda-8  reason: not valid java name */
    public static final void m39797showContactSupportDialog$lambda10$lambda9$lambda8(LoginActivity loginActivity, View view) {
        Log_OC.getArray(loginActivity, "this$0");
        AppCompatActivity r7 = (AppCompatActivity) loginActivity;
        Context r8 = (Context) loginActivity;
        AppCompatActivityExtKt.dialTelephone(r7, r8, LoginParams.ONBOARDING_SUPPORT, LoginParams.PERMISSION_REQUEST_CODE);
        LoginPresenter $r2 = loginActivity.getThisPresenter();
        InterfaceC8209a $r3 = loginActivity.getBinding();
        ActivityLoginBinding $r4 = (ActivityLoginBinding) $r3;
        KudiInputField $r5 = $r4.phoneNumberEditText;
        String $r6 = $r5.getText();
        $r2.onCallSupportClicked($r6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showFingerPrintIcon$lambda-15  reason: not valid java name */
    public static final void m39798showFingerPrintIcon$lambda15(LoginActivity loginActivity, View view) {
        Log_OC.getArray(loginActivity, "this$0");
        loginActivity.displayBiometricPromptCompat();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public LoginPresenter createPresenter() {
        LoginPresenter $r1 = getThisPresenter();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public /* bridge */ /* synthetic */ InterfaceC9413d createPresenter() {
        InterfaceC9413d $r1 = createPresenter();
        InterfaceC9413d r2 = $r1;
        return r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public ActivityLoginBinding getActivityBinding() {
        Activity r3 = (Activity) this;
        LayoutInflater $r1 = r3.getLayoutInflater();
        ActivityLoginBinding $r2 = ActivityLoginBinding.inflate($r1);
        Log_OC.loadImage($r2, "inflate(layoutInflater)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public /* bridge */ /* synthetic */ InterfaceC8209a getActivityBinding() {
        ActivityLoginBinding $r1 = getActivityBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Analytics getAnalytics() {
        Analytics $r1 = this.analytics;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("analytics");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getCancel() {
        boolean z0 = this.cancel;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SharedPreferences getDevicePrefs() {
        SharedPreferences $r1 = this.devicePrefs;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("devicePrefs");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getEncodedPin() {
        String r1 = this.encodedPin;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final IPFSecurityUtils getFac() {
        IPFSecurityUtils $r1 = this.mProgressView;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("fac");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final View getFocusView() {
        View r1 = this.focusView;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final LoginSubComponent getLoginSubComponent() {
        LoginSubComponent $r1 = this.loginSubComponent;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("loginSubComponent");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getPhoneNumber() {
        String $r1 = this.phoneNumber;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("phoneNumber");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Pref getPref() {
        Pref $r1 = this.pref;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("pref");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Frame getRemoteConfig() {
        Frame $r1 = this.remoteConfig;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("remoteConfig");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SharedPreferences getSharedPrefs() {
        SharedPreferences $r1 = this.sharedPrefs;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("sharedPrefs");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SmartLookAnalytics getSmartLookAnalytics() {
        SmartLookAnalytics $r1 = this.smartLookAnalytics;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("smartLookAnalytics");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final LoginPresenter getThisPresenter() {
        LoginPresenter $r1 = this.thisPresenter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("thisPresenter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.login.views.LoginView
    public boolean isInvalidsPhone(String str) {
        Log_OC.getArray(str, "phoneNumber");
        boolean $z0 = PhoneNumberUtils.isGlobalPhoneNumber(str);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.login.views.LoginView
    public boolean isPinValid(String str) {
        Log_OC.getArray(str, "pin");
        int $i0 = str.length();
        if ($i0 >= 4) {
            int $i02 = str.length();
            boolean $z0 = $i02 > 0;
            return $z0;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.login.views.LoginView
    public void navigateToAccountError(AccountErrorType accountErrorType) {
        Log_OC.getArray(accountErrorType, "accountErrorType");
        AccountErrorActivity.Companion $r3 = AccountErrorActivity.Companion;
        Context r4 = (Context) this;
        Intent $r1 = $r3.getIntent(r4, accountErrorType);
        Activity r5 = (Activity) this;
        r5.startActivity($r1);
        Activity r52 = (Activity) this;
        r52.finish();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.login.views.LoginView
    public void navigateToAccountHolderVerification(String str, OtpVerificationModel otpVerificationModel) {
        Log_OC.getArray(str, TransactionField.STATUS);
        saveLastPhoneNumber();
        LoginParams $r3 = LoginParams.INSTANCE;
        Context r4 = (Context) this;
        $r3.buildAccountVerificationIntent(r4, str, otpVerificationModel);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.login.views.LoginView
    public void navigateToDashboard(double d, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str) {
        boolean $z5;
        String $r2;
        CharSequence $r5;
        boolean $z52;
        Log_OC.getArray(str, "customerType");
        saveLastPhoneNumber();
        String $r22 = this.lastPhoneNumber;
        $z5 = C13276s.m5447E($r22, "0", false, 2, null);
        if ($z5) {
            String $r23 = this.lastPhoneNumber;
            if ($r23 == null) {
                NullPointerException r15 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                throw r15;
            }
            String $r3 = $r23.substring(1);
            $r2 = $r3;
            Log_OC.loadImage($r3, "(this as java.lang.String).substring(startIndex)");
        } else {
            $r2 = this.lastPhoneNumber;
        }
        String $r32 = getPhoneNumber();
        if ($r32 == null) {
            NullPointerException r152 = new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            throw r152;
        }
        $r5 = C13277t.m5414M0($r32);
        $z52 = C13277t.m5421J($r5.toString(), $r2, false, 2, null);
        if (!$z52) {
            Pref $r6 = getPref();
            $r6.clearSessionSpecificData();
        }
        SharedPreferences $r7 = getSharedPrefs();
        SharedPreferences.Editor $r8 = $r7.edit();
        $r8.putBoolean(LoginParams.HAS_SEEN_INTRO, true).apply();
        SharedPreferences $r72 = getSharedPrefs();
        boolean $z53 = $r72.getBoolean(LoginParams.EXTRA_ENABLE_FINGERPRINT, false);
        if ($z53) {
            InterfaceC8209a $r9 = getBinding();
            ActivityLoginBinding $r10 = (ActivityLoginBinding) $r9;
            KudiInputField $r11 = $r10.pinEditText;
            String $r33 = $r11.getText();
            InterfaceC8209a $r92 = getBinding();
            ActivityLoginBinding $r102 = (ActivityLoginBinding) $r92;
            KudiInputField $r112 = $r102.phoneNumberEditText;
            String $r24 = $r112.getText();
            IPFSecurityUtils $r12 = getFac();
            Context r16 = (Context) this;
            String $r34 = $r12.encode(r16, "fp_pin_lock_screen_key_store", $r33, false);
            LoginPresenter $r13 = getThisPresenter();
            $r13.savePin($r24, $r34);
        }
        LoginParams $r14 = LoginParams.INSTANCE;
        Context r162 = (Context) this;
        LoginParams.buildLoginIntent$default($r14, r162, z, z2, z3, z4, z5, str, false, 128, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.login.views.LoginView
    public void navigateToDeviceUpdate() {
        Context r1 = (Context) this;
        ContextExtKt.launchActivity$default(r1, true, SetupAgentAccountActivity.class, (InterfaceC11767l) null, 4, (Object) null);
    }

    @Override // ai.kudi.agent.login.views.LoginView
    public void navigateToLogin() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.login.views.LoginView
    public void navigateToPhoneAndPinFragment(User user) {
        Log_OC.getArray(user, "user");
        LoginActivity$navigateToPhoneAndPinFragment$1 r3 = new LoginActivity$navigateToPhoneAndPinFragment$1(user);
        Context r4 = (Context) this;
        ContextExtKt.launchActivity$default(r4, false, RegisterActivity.class, (InterfaceC11767l) r3, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    @Override // ai.kudi.agent.core.mvp.MvpActivity, p272h.p364d.p365a.p366c.AbstractC9409a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r38) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.login.p011ui.LoginActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Log_OC.getArray(strArr, "permissions");
        Log_OC.getArray(iArr, "grantResults");
        if (i == 20) {
            int $i0 = iArr.length;
            boolean $z0 = $i0 == 0;
            if (!$z0) {
                int $i02 = iArr[0];
                if ($i02 == 0) {
                    Object[] $r5 = new Object[0];
                    Timber.m1627e("Permission granted", $r5);
                    return;
                }
            }
            Context r6 = (Context) this;
            ContextExtKt.toast$default(r6, "Call Permission is required for Kudi to dial the code.", 0, 2, (Object) null);
        } else if (i == 30) {
            int $i03 = iArr.length;
            boolean $z02 = $i03 == 0;
            if (!$z02) {
                int $i04 = iArr[0];
                if ($i04 == 0) {
                    onLoginClicked();
                    return;
                }
            }
            Activity r7 = (Activity) this;
            String $r2 = r7.getString(C0001R.string.phone_state_permission_is_required);
            Context r62 = (Context) this;
            ContextExtKt.toast$default(r62, $r2, 0, 2, (Object) null);
        } else if (i != 1000) {
            if (i != 1003) {
                return;
            }
            int $i05 = iArr.length;
            boolean $z03 = $i05 == 0;
            if (!$z03) {
                int $i06 = iArr[0];
                if ($i06 == 0) {
                    return;
                }
            }
            Context r63 = (Context) this;
            ContextExtKt.toast$default(r63, "Call Permission is required for Kudi to dial the code.", 0, 2, (Object) null);
        } else {
            int $i07 = iArr.length;
            boolean $z04 = $i07 == 0;
            if (!$z04) {
                int $i08 = iArr[0];
                if ($i08 == 0) {
                    attemptLogin();
                    return;
                }
            }
            LocationUtil.Companion $r4 = LocationUtil.Companion;
            Context r64 = (Context) this;
            $r4.handleDeniedPermission(r64);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity, p272h.p364d.p365a.p366c.AbstractC9409a
    public void onResume() {
        super.onResume();
        Activity r1 = (Activity) this;
        ViewUtils_extKt.isGooglePlayServicesAvailable(r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.login.views.LoginView
    public void requestFocus() {
        View $r1 = this.focusView;
        if ($r1 == null) {
            return;
        }
        $r1.requestFocus();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void resetError() {
        InterfaceC8209a $r1 = getBinding();
        ActivityLoginBinding $r2 = (ActivityLoginBinding) $r1;
        TextView $r3 = $r2.welcomeText;
        $r3.setText("");
        InterfaceC8209a $r12 = getBinding();
        ActivityLoginBinding $r22 = (ActivityLoginBinding) $r12;
        KudiInputField $r4 = $r22.phoneNumberEditText;
        $r4.setError(null);
        InterfaceC8209a $r13 = getBinding();
        ActivityLoginBinding $r23 = (ActivityLoginBinding) $r13;
        KudiInputField $r42 = $r23.pinEditText;
        $r42.setError(null);
    }

    public final void setAnalytics(Analytics analytics) {
        Log_OC.getArray(analytics, "<set-?>");
        this.analytics = analytics;
    }

    public final void setCancel(boolean z) {
        this.cancel = z;
    }

    public final void setDevicePrefs(SharedPreferences sharedPreferences) {
        Log_OC.getArray(sharedPreferences, "<set-?>");
        this.devicePrefs = sharedPreferences;
    }

    public final void setEncodedPin(String str) {
        this.encodedPin = str;
    }

    public final void setFac(IPFSecurityUtils iPFSecurityUtils) {
        Log_OC.getArray(iPFSecurityUtils, "<set-?>");
        this.mProgressView = iPFSecurityUtils;
    }

    public final void setFocusView(View view) {
        this.focusView = view;
    }

    public final void setLoginSubComponent(LoginSubComponent loginSubComponent) {
        Log_OC.getArray(loginSubComponent, "<set-?>");
        this.loginSubComponent = loginSubComponent;
    }

    public final void setPhoneNumber(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.phoneNumber = str;
    }

    public final void setPref(Pref pref) {
        Log_OC.getArray(pref, "<set-?>");
        this.pref = pref;
    }

    public final void setRemoteConfig(Frame frame) {
        Log_OC.getArray(frame, "<set-?>");
        this.remoteConfig = frame;
    }

    public final void setSharedPrefs(SharedPreferences sharedPreferences) {
        Log_OC.getArray(sharedPreferences, "<set-?>");
        this.sharedPrefs = sharedPreferences;
    }

    public final void setSmartLookAnalytics(SmartLookAnalytics smartLookAnalytics) {
        Log_OC.getArray(smartLookAnalytics, "<set-?>");
        this.smartLookAnalytics = smartLookAnalytics;
    }

    public final void setThisPresenter(LoginPresenter loginPresenter) {
        Log_OC.getArray(loginPresenter, "<set-?>");
        this.thisPresenter = loginPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.login.views.LoginView
    public void showAppForAgentOnly() {
        Context r5 = (Context) this;
        DialogInterfaceC0936d.C0937a r3 = new DialogInterfaceC0936d.C0937a(r5);
        DialogInterfaceC0936d.C0937a $r1 = r3.setTitle("☹ This app is only for Nomba Businesses.");
        $r1.setMessage("You need to be a registered Nomba Business to use this app. You can download the normal kudi.ai app by clicking the link below.").setPositiveButton("Download Nomba App", new DialogInterface.OnClickListener() { // from class: ai.kudi.agent.login.ui.NoteEditor$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                LoginActivity $r2 = LoginActivity.this;
                LoginActivity.m39796showAppForAgentOnly$lambda6($r2, dialogInterface, i);
            }
        }).show();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.login.views.LoginView
    public void showContactSupportDialog() {
        Context r14 = (Context) this;
        DialogInterfaceC0936d.C0937a r12 = new DialogInterfaceC0936d.C0937a(r14);
        Activity r15 = (Activity) this;
        LayoutInflater $r2 = r15.getLayoutInflater();
        View $r3 = $r2.inflate(C0001R.C0004layout.call_support_dialog, (ViewGroup) null);
        View $r4 = $r3.findViewById(C0001R.C0003id.otpSubHeaderText);
        TextView $r5 = (TextView) $r4;
        $r5.setText("Have issues logging in?\n\nCall support on 018885008");
        View $r42 = $r3.findViewById(C0001R.C0003id.proceedButton);
        ViewGroup $r6 = (KudiButton) $r42;
        ViewGroup r16 = $r6;
        r16.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.login.ui.Stats$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity $r22 = LoginActivity.this;
                LoginActivity.m39797showContactSupportDialog$lambda10$lambda9$lambda8($r22, view);
            }
        });
        C13666w c13666w = C13666w.f30112a;
        r12.setView($r3);
        Dialog $r9 = r12.create();
        Dialog r17 = $r9;
        Window $r10 = r17.getWindow();
        Log_OC.append($r10);
        WindowManager.LayoutParams $r11 = $r10.getAttributes();
        $r11.windowAnimations = C0001R.style.DialogAnimation;
        Dialog r172 = $r9;
        r172.show();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.login.views.LoginView
    public void showFingerPrintIcon(boolean z, String str) {
        SharedPreferences $r2 = getSharedPrefs();
        boolean $z1 = $r2.getBoolean(LoginParams.EXTRA_ENABLE_FINGERPRINT, false);
        if (!$z1) {
            InterfaceC8209a $r4 = getBinding();
            ActivityLoginBinding $r5 = (ActivityLoginBinding) $r4;
            ImageView $r6 = $r5.fingerPrintView;
            Log_OC.loadImage($r6, "binding.fingerPrintView");
            ViewExtKt.hide$default($r6, false, 1, null);
            return;
        }
        if (z) {
            BiometricUtils $r3 = BiometricUtils.INSTANCE;
            Context r9 = (Context) this;
            boolean $z0 = $r3.shouldUseBiometric(r9);
            if ($z0) {
                InterfaceC8209a $r42 = getBinding();
                ActivityLoginBinding $r52 = (ActivityLoginBinding) $r42;
                ImageView $r62 = $r52.fingerPrintView;
                Log_OC.loadImage($r62, "binding.fingerPrintView");
                ViewExtKt.show($r62);
                this.encodedPin = str;
                displayBiometricPromptCompat();
                InterfaceC8209a $r43 = getBinding();
                ActivityLoginBinding $r53 = (ActivityLoginBinding) $r43;
                $r53.fingerPrintView.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.login.ui.SearchResultsActivity$1
                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LoginActivity $r22 = LoginActivity.this;
                        LoginActivity.m39798showFingerPrintIcon$lambda15($r22, view);
                    }
                });
                return;
            }
        }
        InterfaceC8209a $r44 = getBinding();
        ActivityLoginBinding $r54 = (ActivityLoginBinding) $r44;
        ImageView $r63 = $r54.fingerPrintView;
        Log_OC.loadImage($r63, "binding.fingerPrintView");
        ViewExtKt.hide$default($r63, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.login.views.LoginView
    public void showLoginError(String str) {
        Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
        InterfaceC8209a $r2 = getBinding();
        ActivityLoginBinding $r3 = (ActivityLoginBinding) $r2;
        TextView $r4 = $r3.welcomeText;
        $r4.setText(str);
        InterfaceC8209a $r22 = getBinding();
        ActivityLoginBinding $r32 = (ActivityLoginBinding) $r22;
        TextView $r42 = $r32.welcomeText;
        Context r7 = (Context) this;
        int $i0 = C1335a.m36324d(r7, C0001R.color.KudiRed);
        $r42.setTextColor($i0);
        InterfaceC8209a $r23 = getBinding();
        ActivityLoginBinding $r33 = (ActivityLoginBinding) $r23;
        KudiInputField $r5 = $r33.pinEditText;
        $r5.setText("");
        InterfaceC8209a $r24 = getBinding();
        ActivityLoginBinding $r34 = (ActivityLoginBinding) $r24;
        KudiInputField $r52 = $r34.pinEditText;
        EditText $r6 = $r52.getInputEditText();
        $r6.requestFocus();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.login.views.LoginView
    public void showPendingKycScreen(RegistrationInfo registrationInfo) {
        Log_OC.getArray(registrationInfo, "registrationInfo");
        LoginActivity$showPendingKycScreen$1 r3 = new LoginActivity$showPendingKycScreen$1(registrationInfo);
        Context r4 = (Context) this;
        ContextExtKt.launchActivity$default(r4, false, PendingKycActivity.class, (InterfaceC11767l) r3, 1, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.login.views.LoginView
    public void showPhoneNumberError(int i) {
        InterfaceC8209a $r1 = getBinding();
        ActivityLoginBinding $r2 = (ActivityLoginBinding) $r1;
        KudiInputField $r3 = $r2.phoneNumberEditText;
        Activity r6 = (Activity) this;
        String $r4 = r6.getString(i);
        $r3.setError($r4);
        InterfaceC8209a $r12 = getBinding();
        ActivityLoginBinding $r22 = (ActivityLoginBinding) $r12;
        KudiInputField $r32 = $r22.phoneNumberEditText;
        EditText $r5 = $r32.getInputEditText();
        this.focusView = $r5;
        this.cancel = true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.login.views.LoginView
    public void showPinError(int i) {
        InterfaceC8209a $r1 = getBinding();
        ActivityLoginBinding $r2 = (ActivityLoginBinding) $r1;
        KudiInputField $r3 = $r2.pinEditText;
        Activity r6 = (Activity) this;
        String $r4 = r6.getString(i);
        $r3.setError($r4);
        InterfaceC8209a $r12 = getBinding();
        ActivityLoginBinding $r22 = (ActivityLoginBinding) $r12;
        KudiInputField $r32 = $r22.pinEditText;
        EditText $r5 = $r32.getInputEditText();
        this.focusView = $r5;
        this.cancel = true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.login.views.LoginView
    public void showProgress(boolean z) {
        if (z) {
            InterfaceC8209a $r1 = getBinding();
            ActivityLoginBinding $r2 = (ActivityLoginBinding) $r1;
            KudiButton $r3 = $r2.loginButton;
            $r3.m38032f();
            return;
        }
        InterfaceC8209a $r12 = getBinding();
        ActivityLoginBinding $r22 = (ActivityLoginBinding) $r12;
        KudiButton $r32 = $r22.loginButton;
        $r32.m38033e();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.login.views.LoginView
    public void showUserProfile(String str, String str2, String str3, String $r4) {
        Log_OC.getArray(str, "firstName");
        Log_OC.getArray(str2, "lastName");
        Log_OC.getArray(str3, "phoneNumber");
        InterfaceC8209a $r5 = getBinding();
        ActivityLoginBinding $r6 = (ActivityLoginBinding) $r5;
        TextView $r7 = $r6.welcomeText;
        StringBuilder r14 = new StringBuilder();
        Activity r15 = (Activity) this;
        String $r2 = r15.getString(C0001R.string.welcome_back);
        r14.append($r2);
        r14.append(' ');
        r14.append(str);
        String $r1 = r14.toString();
        $r7.setText($r1);
        InterfaceC8209a $r52 = getBinding();
        ActivityLoginBinding $r62 = (ActivityLoginBinding) $r52;
        $r62.phoneNumberEditText.setText(str3);
        InterfaceC8209a $r53 = getBinding();
        ActivityLoginBinding $r63 = (ActivityLoginBinding) $r53;
        ImageView $r10 = $r63.profilePic;
        Log_OC.loadImage($r10, "binding.profilePic");
        ImageUtil.Companion $r11 = ImageUtil.Companion;
        if ($r4 == null) {
            $r4 = "";
        }
        String $r12 = $r11.getRemotePathImageId($r4);
        Context r16 = (Context) this;
        Drawable $r122 = C1335a.m36322f(r16, C0001R.C0002drawable.on_boarding_default);
        Log_OC.append($r122);
        Log_OC.loadImage($r122, "getDrawable(\n                    this@LoginActivity,\n                    R.drawable.on_boarding_default\n                )!!");
        Context r162 = (Context) this;
        Drawable $r13 = C1335a.m36322f(r162, C0001R.C0002drawable.on_boarding_default);
        Log_OC.append($r13);
        Log_OC.loadImage($r13, "getDrawable(\n                    this@LoginActivity,\n                    R.drawable.on_boarding_default\n                )!!");
        ImageView r17 = $r10;
        Context r163 = (Context) this;
        ImageViewExtKt.load(r17, r163, $r12, $r122, $r13);
    }
}
