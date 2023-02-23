package ai.kudi.agent.voucher.cashout.p039ui;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.mvp.MvpActivity;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.Counter;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.custom.views.pinentryview.PinEntryView;
import ai.kudi.agent.databinding.ActivityVoucherCashoutPhoneVerificationBinding;
import ai.kudi.agent.voucher.cashout.domain.model.VoucherResponse;
import ai.kudi.agent.voucher.cashout.domain.model.VoucherVerification;
import ai.kudi.agent.voucher.cashout.presenter.VoucherPhoneVerificationPresenter;
import ai.kudi.agent.voucher.cashout.view.VoucherPhoneVerificationView;
import ai.kudi.agent.withdrawal.p041ui.WithdrawActivity;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.p483e0.p485d.C11780a0;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: VoucherCashOutPhoneVerificationActivity.kt */
@Metadata(m10422d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 32\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0002:\u00013B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u001a\u001a\u00020\u0003H\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cJ\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\u0010\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020#H\u0016J\u0012\u0010$\u001a\u00020\u001f2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J\u0018\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020(H\u0016J\u0012\u0010/\u001a\u00020\u001f2\b\u00100\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u00101\u001a\u00020\u001fH\u0016J\b\u00102\u001a\u00020\u001fH\u0016R\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u00064"}, m10421d2 = {"Lai/kudi/agent/voucher/cashout/ui/VoucherCashOutPhoneVerificationActivity;", "Lai/kudi/agent/core/mvp/MvpActivity;", "Lai/kudi/agent/voucher/cashout/view/VoucherPhoneVerificationView;", "Lai/kudi/agent/voucher/cashout/presenter/VoucherPhoneVerificationPresenter;", "Lai/kudi/agent/databinding/ActivityVoucherCashoutPhoneVerificationBinding;", "()V", "activityBinding", "getActivityBinding", "()Lai/kudi/agent/databinding/ActivityVoucherCashoutPhoneVerificationBinding;", "countDownTimer", "Landroid/os/CountDownTimer;", "getCountDownTimer", "()Landroid/os/CountDownTimer;", "setCountDownTimer", "(Landroid/os/CountDownTimer;)V", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/voucher/cashout/presenter/VoucherPhoneVerificationPresenter;", "setThisPresenter", "(Lai/kudi/agent/voucher/cashout/presenter/VoucherPhoneVerificationPresenter;)V", "verificationResponse", "Lai/kudi/agent/voucher/cashout/domain/model/VoucherVerification;", "getVerificationResponse", "()Lai/kudi/agent/voucher/cashout/domain/model/VoucherVerification;", "setVerificationResponse", "(Lai/kudi/agent/voucher/cashout/domain/model/VoucherVerification;)V", "createPresenter", "formatPhoneNumber", "", "phoneNumber", "hideLoading", "", "hideRetry", "navigateToConfirmationPage", "voucherResponse", "Lai/kudi/agent/voucher/cashout/domain/model/VoucherResponse;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "otpTimer", "expiresTime", "", "shouldReset", "showError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "showLoading", "showRetry", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.voucher.cashout.ui.VoucherCashOutPhoneVerificationActivity */
/* loaded from: classes.dex */
public final class VoucherCashOutPhoneVerificationActivity extends MvpActivity<VoucherPhoneVerificationView, VoucherPhoneVerificationPresenter, ActivityVoucherCashoutPhoneVerificationBinding> implements VoucherPhoneVerificationView {
    public static final Companion Companion;
    public static final String VOUCHER_VERIFICATION_INTENT = "VOUCHER_VERIFICATION_INTENT";
    public CountDownTimer countDownTimer;
    public VoucherPhoneVerificationPresenter thisPresenter;
    public VoucherVerification verificationResponse;

    /* compiled from: VoucherCashOutPhoneVerificationActivity.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/voucher/cashout/ui/VoucherCashOutPhoneVerificationActivity$Companion;", "", "()V", VoucherCashOutPhoneVerificationActivity.VOUCHER_VERIFICATION_INTENT, "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.voucher.cashout.ui.VoucherCashOutPhoneVerificationActivity$Companion */
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onCreate$lambda-0  reason: not valid java name */
    public static final void m41742onCreate$lambda0(VoucherCashOutPhoneVerificationActivity voucherCashOutPhoneVerificationActivity, View view) {
        Log_OC.getArray(voucherCashOutPhoneVerificationActivity, "this$0");
        VoucherPhoneVerificationPresenter $r2 = voucherCashOutPhoneVerificationActivity.getThisPresenter();
        VoucherVerification $r3 = voucherCashOutPhoneVerificationActivity.getVerificationResponse();
        String $r4 = $r3.getReference();
        String $r5 = $r4;
        if ($r4 == null) {
            $r5 = "";
        }
        $r2.resendOtp($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public VoucherPhoneVerificationPresenter createPresenter() {
        VoucherPhoneVerificationPresenter $r1 = getThisPresenter();
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
    /* JADX WARN: Removed duplicated region for block: B:11:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String formatPhoneNumber(java.lang.String r9) {
        /*
            r8 = this;
            if (r9 == 0) goto Lb
            int r0 = r9.length()
            if (r0 != 0) goto L9
            goto Lb
        L9:
            r1 = 0
            goto Lc
        Lb:
            r1 = 1
        Lc:
            if (r1 == 0) goto L11
            java.lang.String r2 = ""
            return r2
        L11:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            kotlin.p483e0.p485d.Log_OC.append(r9)
            if (r9 == 0) goto L45
            r5 = 0
            r6 = 4
            java.lang.String r4 = r9.substring(r5, r6)
            java.lang.String r2 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.p483e0.p485d.Log_OC.loadImage(r4, r2)
            r3.append(r4)
            java.lang.String r2 = "XXXX"
            r3.append(r2)
            int r0 = r9.length()
            r5 = 9
            java.lang.String r9 = r9.substring(r5, r0)
            java.lang.String r2 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.p483e0.p485d.Log_OC.loadImage(r9, r2)
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            return r9
        L45:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            r7.<init>(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.voucher.cashout.p039ui.VoucherCashOutPhoneVerificationActivity.formatPhoneNumber(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public ActivityVoucherCashoutPhoneVerificationBinding getActivityBinding() {
        Activity r3 = (Activity) this;
        LayoutInflater $r1 = r3.getLayoutInflater();
        ActivityVoucherCashoutPhoneVerificationBinding $r2 = ActivityVoucherCashoutPhoneVerificationBinding.inflate($r1);
        Log_OC.loadImage($r2, "inflate(layoutInflater)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public /* bridge */ /* synthetic */ InterfaceC8209a getActivityBinding() {
        ActivityVoucherCashoutPhoneVerificationBinding $r1 = getActivityBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final CountDownTimer getCountDownTimer() {
        CountDownTimer $r1 = this.countDownTimer;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("countDownTimer");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final VoucherPhoneVerificationPresenter getThisPresenter() {
        VoucherPhoneVerificationPresenter $r1 = this.thisPresenter;
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
    public final VoucherVerification getVerificationResponse() {
        VoucherVerification $r1 = this.verificationResponse;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("verificationResponse");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.voucher.cashout.view.VoucherPhoneVerificationView
    public void hideLoading() {
        InterfaceC8209a $r1 = getBinding();
        ActivityVoucherCashoutPhoneVerificationBinding $r2 = (ActivityVoucherCashoutPhoneVerificationBinding) $r1;
        ProgressBar $r3 = $r2.progressBar;
        Log_OC.loadImage($r3, "binding.progressBar");
        ViewExtKt.hide$default($r3, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.voucher.cashout.view.VoucherPhoneVerificationView
    public void hideRetry() {
        InterfaceC8209a $r1 = getBinding();
        ActivityVoucherCashoutPhoneVerificationBinding $r2 = (ActivityVoucherCashoutPhoneVerificationBinding) $r1;
        TextView $r3 = $r2.resendOtpTextView;
        Log_OC.loadImage($r3, "binding.resendOtpTextView");
        ViewExtKt.hide$default($r3, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.voucher.cashout.view.VoucherPhoneVerificationView
    public void navigateToConfirmationPage(VoucherResponse voucherResponse) {
        Log_OC.getArray(voucherResponse, "voucherResponse");
        Context r4 = (Context) this;
        Intent r3 = new Intent(r4, WithdrawActivity.class);
        r3.putExtra(WithdrawActivity.VOUCHER_SUCCESSFUL_VERIFICATION, voucherResponse);
        Activity r5 = (Activity) this;
        r5.startActivity(r3);
        Activity r52 = (Activity) this;
        r52.finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity, p272h.p364d.p365a.p366c.AbstractC9409a
    public void onCreate(Bundle bundle) {
        Activity r25 = (Activity) this;
        Application $r2 = r25.getApplication();
        if ($r2 == null) {
            NullPointerException r24 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw r24;
        }
        BaseApplication $r3 = (BaseApplication) $r2;
        ApplicationComponent $r4 = $r3.initializeComponent();
        $r4.inject(this);
        super.onCreate(bundle);
        AppCompatActivity r26 = (AppCompatActivity) this;
        AbstractC0925a $r5 = r26.getSupportActionBar();
        if ($r5 != null) {
            $r5.mo37602u(true);
        }
        InterfaceC8209a $r6 = getBinding();
        Toolbar $r8 = ((ActivityVoucherCashoutPhoneVerificationBinding) $r6).toolbar;
        AppCompatActivity r262 = (AppCompatActivity) this;
        r262.setSupportActionBar($r8);
        Activity r252 = (Activity) this;
        String $r9 = r252.getString(C0001R.string.phone_verification);
        Log_OC.loadImage($r9, "getString(R.string.phone_verification)");
        setTitle($r9);
        Activity r253 = (Activity) this;
        Intent $r10 = r253.getIntent();
        Parcelable $r11 = $r10.getParcelableExtra(VOUCHER_VERIFICATION_INTENT);
        if ($r11 == null) {
            NullPointerException r242 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.voucher.cashout.domain.model.VoucherVerification");
            throw r242;
        }
        VoucherVerification $r12 = (VoucherVerification) $r11;
        setVerificationResponse($r12);
        InterfaceC8209a $r62 = getBinding();
        ActivityVoucherCashoutPhoneVerificationBinding $r7 = (ActivityVoucherCashoutPhoneVerificationBinding) $r62;
        TextView $r13 = $r7.phoneVerificationDescTextView;
        C11780a0 c11780a0 = C11780a0.f26475a;
        Activity r254 = (Activity) this;
        String $r92 = r254.getString(C0001R.string.cash_out_phone_verification);
        Log_OC.loadImage($r92, "getString(R.string.cash_out_phone_verification)");
        VoucherVerification $r122 = getVerificationResponse();
        String $r16 = $r122.getRecipientPhone();
        Object[] $r15 = {formatPhoneNumber($r16)};
        String $r93 = String.format($r92, Arrays.copyOf($r15, 1));
        Log_OC.loadImage($r93, "java.lang.String.format(format, *args)");
        $r13.setText($r93);
        VoucherPhoneVerificationPresenter $r17 = getThisPresenter();
        VoucherVerification $r123 = getVerificationResponse();
        long $l0 = $r123.getExpiresInSeconds();
        $r17.showTimer($l0, false);
        InterfaceC8209a $r63 = getBinding();
        ActivityVoucherCashoutPhoneVerificationBinding $r72 = (ActivityVoucherCashoutPhoneVerificationBinding) $r63;
        PinEntryView $r18 = $r72.inputForm;
        $r18.setOnPinEnteredListener(new PinEntryView.OnPinEnteredListener() { // from class: ai.kudi.agent.voucher.cashout.ui.VoucherCashOutPhoneVerificationActivity$onCreate$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.custom.views.pinentryview.PinEntryView.OnPinEnteredListener
            public void onPinEntered(String str) {
                Log_OC.getArray(str, "pin");
                VoucherCashOutPhoneVerificationActivity $r22 = VoucherCashOutPhoneVerificationActivity.this;
                Activity r7 = (Activity) $r22;
                ContextExtKt.hideKeyboard(r7);
                VoucherCashOutPhoneVerificationActivity $r23 = VoucherCashOutPhoneVerificationActivity.this;
                VoucherPhoneVerificationPresenter $r32 = $r23.getThisPresenter();
                VoucherCashOutPhoneVerificationActivity $r24 = VoucherCashOutPhoneVerificationActivity.this;
                VoucherVerification $r42 = $r24.getVerificationResponse();
                String $r52 = $r42.getReference();
                String $r64 = $r52;
                if ($r52 == null) {
                    $r64 = "";
                }
                $r32.validatePhone(str, $r64);
            }
        });
        InterfaceC8209a $r64 = getBinding();
        ActivityVoucherCashoutPhoneVerificationBinding $r73 = (ActivityVoucherCashoutPhoneVerificationBinding) $r64;
        TextView $r132 = $r73.resendOtpTextView;
        $r132.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.voucher.cashout.ui.TestActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoucherCashOutPhoneVerificationActivity $r22 = VoucherCashOutPhoneVerificationActivity.this;
                VoucherCashOutPhoneVerificationActivity.m41742onCreate$lambda0($r22, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Log_OC.getArray(menuItem, "item");
        int $i0 = menuItem.getItemId();
        if ($i0 == 16908332) {
            ComponentActivity r2 = (ComponentActivity) this;
            r2.onBackPressed();
        }
        boolean $z0 = super.onOptionsItemSelected(menuItem);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.voucher.cashout.view.VoucherPhoneVerificationView
    public void otpTimer(long j, boolean z) {
        CountDownTimer $r1 = this.countDownTimer;
        if ($r1 != null && z) {
            CountDownTimer $r12 = getCountDownTimer();
            $r12.cancel();
        }
        Counter.Companion $r2 = Counter.Companion;
        InterfaceC8209a $r3 = getBinding();
        ActivityVoucherCashoutPhoneVerificationBinding $r4 = (ActivityVoucherCashoutPhoneVerificationBinding) $r3;
        TextView $r5 = $r4.timeLeftTextView;
        Log_OC.loadImage($r5, "binding.timeLeftTextView");
        Activity r7 = (Activity) this;
        String $r6 = r7.getString(C0001R.string.time_left);
        CountDownTimer $r13 = $r2.timer(j, $r5, $r6);
        setCountDownTimer($r13);
        CountDownTimer $r14 = getCountDownTimer();
        $r14.start();
    }

    public final void setCountDownTimer(CountDownTimer countDownTimer) {
        Log_OC.getArray(countDownTimer, "<set-?>");
        this.countDownTimer = countDownTimer;
    }

    public final void setThisPresenter(VoucherPhoneVerificationPresenter voucherPhoneVerificationPresenter) {
        Log_OC.getArray(voucherPhoneVerificationPresenter, "<set-?>");
        this.thisPresenter = voucherPhoneVerificationPresenter;
    }

    public final void setVerificationResponse(VoucherVerification voucherVerification) {
        Log_OC.getArray(voucherVerification, "<set-?>");
        this.verificationResponse = voucherVerification;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.voucher.cashout.view.VoucherPhoneVerificationView
    public void showError(String str) {
        InterfaceC8209a $r2 = getBinding();
        ActivityVoucherCashoutPhoneVerificationBinding $r3 = (ActivityVoucherCashoutPhoneVerificationBinding) $r2;
        TextView $r4 = $r3.errorTextView;
        if ($r4 == null) {
            return;
        }
        $r4.setText(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.voucher.cashout.view.VoucherPhoneVerificationView
    public void showLoading() {
        InterfaceC8209a $r1 = getBinding();
        ActivityVoucherCashoutPhoneVerificationBinding $r2 = (ActivityVoucherCashoutPhoneVerificationBinding) $r1;
        ProgressBar $r3 = $r2.progressBar;
        Log_OC.loadImage($r3, "binding.progressBar");
        ViewExtKt.show($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.voucher.cashout.view.VoucherPhoneVerificationView
    public void showRetry() {
        InterfaceC8209a $r1 = getBinding();
        ActivityVoucherCashoutPhoneVerificationBinding $r2 = (ActivityVoucherCashoutPhoneVerificationBinding) $r1;
        TextView $r3 = $r2.resendOtpTextView;
        Log_OC.loadImage($r3, "binding.resendOtpTextView");
        ViewExtKt.show($r3);
    }
}
