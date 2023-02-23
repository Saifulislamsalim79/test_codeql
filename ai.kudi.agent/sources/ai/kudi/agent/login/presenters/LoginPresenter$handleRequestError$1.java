package ai.kudi.agent.login.presenters;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.util.ResourceDelegate;
import ai.kudi.agent.login.domain.model.AccountErrorType;
import ai.kudi.agent.login.domain.wiki.LoginData;
import ai.kudi.agent.login.domain.wiki.LoginError;
import ai.kudi.agent.login.domain.wiki.LoginErrorKt;
import ai.kudi.agent.login.views.LoginView;
import ai.kudi.agent.network.util.ConnectivityUtil;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.register.domain.wiki.OtpVerificationModel;
import ai.kudi.agent.register.domain.wiki.PersonalInfo;
import ai.kudi.agent.register.domain.wiki.RegistrationInfo;
import ai.kudi.agent.register.domain.wiki.RegistrationStatus;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.usecases.DeviceNotPermittedException;
import ai.kudi.agent.users.domain.usecases.NotAnAgentException;
import android.util.Log;
import kotlin.C13287o;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11812w;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
import retrofit2.HttpException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoginPresenter.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class LoginPresenter$handleRequestError$1 extends AbstractC11802m implements InterfaceC11767l<Throwable, C13666w> {
    final /* synthetic */ String $deviceId;
    final /* synthetic */ String $deviceName;
    final /* synthetic */ String $genericResponse;
    final /* synthetic */ String $imeI;
    final /* synthetic */ String $phoneNumber;
    final /* synthetic */ String $pin;
    final /* synthetic */ boolean $playServicesAvailable;
    final /* synthetic */ LoginPresenter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginPresenter$handleRequestError$1(LoginPresenter loginPresenter, boolean z, String str, String str2, String str3, String str4, String str5, String str6) {
        super(1);
        this.this$0 = loginPresenter;
        this.$playServicesAvailable = z;
        this.$phoneNumber = str;
        this.$pin = str2;
        this.$imeI = str3;
        this.$deviceName = str4;
        this.$deviceId = str5;
        this.$genericResponse = str6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r115v3, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r116v5, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r119v1, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r52v1, types: [T, java.lang.String] */
    /* renamed from: invoke$lambda-0  reason: not valid java name */
    public static final void m39734invoke$lambda0(Throwable th, C11812w c11812w, LoginPresenter loginPresenter, String str, String $r4, String $r5, String str2, String str3, String $r8, LoginView loginView) {
        String $r10;
        String $r102;
        Log_OC.getArray(th, "$it");
        Log_OC.getArray(c11812w, "$possibleErrorCategory");
        Log_OC.getArray(loginPresenter, "this$0");
        Log_OC.getArray(str, "$phoneNumber");
        Log_OC.getArray($r4, "$pin");
        Log_OC.getArray($r5, "$imeI");
        Log_OC.getArray(str2, "$deviceName");
        Log_OC.getArray(str3, "$deviceId");
        Log_OC.getArray($r8, "$genericResponse");
        Log_OC.getArray(loginView, "view");
        loginView.showProgress(false);
        boolean $z0 = ConnectivityUtil.isNoConnectivity(th);
        if ($z0) {
            c11812w.f26499c = TransactionField.NETWORK;
            loginView.showLoginError("Cannot connect to Nomba. Check internet connection.");
        } else {
            boolean $z02 = th instanceof NotAnAgentException;
            if ($z02) {
                c11812w.f26499c = "Not an agent";
                loginView.showLoginError("Not an agent");
            } else {
                boolean $z03 = th instanceof HttpException;
                if ($z03) {
                    int $i0 = ((HttpException) th).m352a();
                    if ($i0 == 401) {
                        LoginError $r15 = LoginErrorKt.parseLoginError(th);
                        String $r18 = $r15 == null ? null : $r15.getStatus();
                        RegistrationStatus $r16 = RegistrationStatus.BVN_VERIFICATION_REQUIRED;
                        String $r19 = $r16.name();
                        boolean $z04 = Log_OC.append($r18, $r19);
                        if (!$z04) {
                            String $r182 = $r15 == null ? null : $r15.getStatus();
                            RegistrationStatus $r162 = RegistrationStatus.LOGIN_SUSPENDED;
                            String $r192 = $r162.name();
                            boolean $z05 = Log_OC.append($r182, $r192);
                            if (!$z05) {
                                String $r183 = $r15 == null ? null : $r15.getStatus();
                                RegistrationStatus $r163 = RegistrationStatus.FACE_VERIFICATION_NEEDED;
                                String $r193 = $r163.name();
                                boolean $z06 = Log_OC.append($r183, $r193);
                                if (!$z06) {
                                    String $r184 = $r15 == null ? null : $r15.getStatus();
                                    RegistrationStatus $r164 = RegistrationStatus.OTP_VERIFICATION_NEEDED;
                                    String $r194 = $r164.name();
                                    boolean $z07 = Log_OC.append($r184, $r194);
                                    if (!$z07) {
                                        String $r52 = $r15 == null ? null : $r15.getMessage();
                                        RegistrationStatus $r165 = RegistrationStatus.PENDING_KYC_VERIFICATION;
                                        String $r185 = $r165.name();
                                        boolean $z08 = Log_OC.append($r52, $r185);
                                        if ($z08) {
                                            RegistrationStatus $r166 = RegistrationStatus.PENDING_KYC_VERIFICATION;
                                            c11812w.f26499c = $r166.name();
                                            PersonalInfo $r20 = new PersonalInfo(null, null, str, null, null, null, null, null, null, null, $r4, null, str3, str2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, -13317, 127, null);
                                            RegistrationInfo $r21 = new RegistrationInfo("", $r20, null, false, null, 28, null);
                                            loginView.showPendingKycScreen($r21);
                                        } else {
                                            String $r42 = $r15 == null ? null : $r15.getStatus();
                                            RegistrationStatus $r167 = RegistrationStatus.SUSPENDED;
                                            boolean $z09 = Log_OC.append($r42, $r167.name());
                                            if ($z09) {
                                                AccountErrorType.Suspended $r22 = AccountErrorType.Suspended.INSTANCE;
                                                loginView.navigateToAccountError($r22);
                                            } else {
                                                String $r43 = $r15 == null ? null : $r15.getStatus();
                                                RegistrationStatus $r168 = RegistrationStatus.BLACKLISTED;
                                                boolean $z010 = Log_OC.append($r43, $r168.name());
                                                if ($z010) {
                                                    AccountErrorType.BlackListed $r23 = AccountErrorType.BlackListed.INSTANCE;
                                                    loginView.navigateToAccountError($r23);
                                                } else {
                                                    $r102 = $r15 != null ? $r15.getMessage() : null;
                                                    c11812w.f26499c = $r102;
                                                    loginView.showLoginError($r8);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        c11812w.f26499c = $r15.getStatus();
                        String $r82 = $r15.getStatus();
                        LoginData $r25 = $r15.getData();
                        if ($r25 == null || ($r10 = $r25.getLoginAttemptId()) == null) {
                            $r10 = "";
                        }
                        OtpVerificationModel $r24 = new OtpVerificationModel(str, null, $r4, 0L, 0L, false, $r5, str2, str3, $r10, null, false, null, 7226, null);
                        loginView.navigateToAccountHolderVerification($r82, $r24);
                    } else if ($i0 == 429) {
                        LoginError $r152 = LoginErrorKt.parseLoginError(th);
                        $r102 = $r152 != null ? $r152.getStatus() : null;
                        RegistrationStatus $r169 = RegistrationStatus.LOCKED_OUT;
                        boolean $z011 = Log_OC.append($r102, $r169.name());
                        if ($z011) {
                            AccountErrorType.Blocked $r17 = AccountErrorType.Blocked.INSTANCE;
                            loginView.navigateToAccountError($r17);
                        }
                    } else if ($i0 == 403 || $i0 == 404) {
                        c11812w.f26499c = "Invalid phone or pin";
                        ResourceDelegate $r14 = loginPresenter.resourceDelegate;
                        loginView.showLoginError($r14.getString(C0001R.string.invalid_phone_or_pin));
                    } else {
                        InterfaceC11767l $r12 = KudiErrorParserKt.parseErrorBody();
                        Object $r13 = $r12.invoke(th);
                        c11812w.f26499c = (String) $r13;
                        loginView.showLoginError($r8);
                    }
                } else {
                    boolean $z012 = th instanceof DeviceNotPermittedException;
                    if ($z012) {
                        DeviceNotPermittedException $r26 = (DeviceNotPermittedException) th;
                        c11812w.f26499c = Log_OC.m10359a("Device Not Permitted with type ", (Object) $r26.getType());
                        boolean $z013 = Log_OC.append($r26.getType(), "PENDING_DEVICE_UPDATE");
                        if ($z013) {
                            loginView.navigateToDeviceUpdate();
                        } else {
                            String $r44 = $r26.getType();
                            OtpVerificationModel $r242 = $r26.getOtpVerificationModel();
                            loginView.navigateToAccountHolderVerification($r44, $r242);
                        }
                    } else {
                        InterfaceC11767l $r122 = KudiErrorParserKt.parseHttpError2$default($r8, null, 2, null);
                        Object $r132 = $r122.invoke(th);
                        loginView.showLoginError((String) $r132);
                    }
                }
            }
        }
        Object $r133 = c11812w.f26499c;
        String $r53 = th.getMessage();
        String $r83 = Log.getStackTraceString(th);
        Log_OC.loadImage($r83, "getStackTraceString(it)");
        loginPresenter.logIssuesToFirebase((String) $r133, str, $r53, $r83);
        StringBuilder $r27 = new StringBuilder();
        $r27.append((Object) th.getMessage());
        $r27.append(" - ");
        Object $r134 = c11812w.f26499c;
        $r27.append($r134);
        loginPresenter.loginEvent(str2, str3, str, false, $r27.toString(), null);
        loginPresenter.showContactSupportDialog(th, loginView);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(Throwable th) {
        Throwable $r2 = th;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(final Throwable th) {
        Log_OC.getArray(th, "it");
        LoginPresenter $r9 = this.this$0;
        int $i0 = $r9.errorCount;
        $r9.errorCount = $i0 + 1;
        boolean $z0 = this.$playServicesAvailable;
        Boolean $r11 = Boolean.valueOf($z0);
        C13287o $r10 = new C13287o("PLAY_SERVICES_AVAILABLE", $r11);
        String $r3 = this.$phoneNumber;
        CrashlyticsReport.logException(th, $r10, $r3);
        final C11812w $r2 = new C11812w();
        $r2.f26499c = "unknown";
        final LoginPresenter $r92 = this.this$0;
        final String $r32 = this.$phoneNumber;
        final String $r4 = this.$pin;
        final String $r5 = this.$imeI;
        final String $r6 = this.$deviceName;
        final String $r7 = this.$deviceId;
        final String $r8 = this.$genericResponse;
        $r92.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.login.presenters.Switch
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
            /* renamed from: a */
            public final void mo14809a(Object obj) {
                Throwable $r22 = th;
                C11812w $r33 = $r2;
                LoginPresenter $r42 = $r92;
                String $r52 = $r32;
                String $r62 = $r4;
                String $r72 = $r5;
                String $r82 = $r6;
                String $r93 = $r7;
                String $r102 = $r8;
                LoginView $r112 = (LoginView) obj;
                LoginPresenter$handleRequestError$1.m39734invoke$lambda0($r22, $r33, $r42, $r52, $r62, $r72, $r82, $r93, $r102, $r112);
            }
        });
    }
}
