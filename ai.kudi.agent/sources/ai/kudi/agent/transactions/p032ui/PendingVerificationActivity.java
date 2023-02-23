package ai.kudi.agent.transactions.p032ui;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.common_screens.success_screen.fragment.SuccessScreenDialogFragment;
import ai.kudi.agent.common_screens.success_screen.labs.SuccessScreenCustomOption;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.mvp.MvpActivity;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.ActivityPendingVerificationBinding;
import ai.kudi.agent.transactions.data.worker.VerificationSubComponent;
import ai.kudi.agent.transactions.domain.usecases.IdInformation;
import ai.kudi.agent.transactions.domain.usecases.VerifyPendingData;
import ai.kudi.agent.transactions.p032ui.PendingVerificationCustomerDetailInputFragment;
import ai.kudi.agent.transactions.p032ui.PendingVerificationImageCaptureFragment;
import ai.kudi.agent.transactions.presenters.PendingVerificationPresenter;
import ai.kudi.agent.transactions.views.PendingVerificationView;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C1335a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
/* compiled from: PendingVerificationActivity.kt */
@Metadata(m10422d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 '2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0002:\u0001'B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0017\u001a\u00020\u0003H\u0016J@\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001bH\u0016J\b\u0010\"\u001a\u00020\u0019H\u0016J\b\u0010#\u001a\u00020\u0019H\u0016J\u0012\u0010$\u001a\u00020\u00192\b\u0010%\u001a\u0004\u0018\u00010&H\u0014R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, m10421d2 = {"Lai/kudi/agent/transactions/ui/PendingVerificationActivity;", "Lai/kudi/agent/core/mvp/MvpActivity;", "Lai/kudi/agent/transactions/views/PendingVerificationView;", "Lai/kudi/agent/transactions/presenters/PendingVerificationPresenter;", "Lai/kudi/agent/databinding/ActivityPendingVerificationBinding;", "Lai/kudi/agent/transactions/ui/VerificationNavigator;", "()V", "activityBinding", "getActivityBinding", "()Lai/kudi/agent/databinding/ActivityPendingVerificationBinding;", "pendingSubComponent", "Lai/kudi/agent/transactions/data/di/VerificationSubComponent;", "getPendingSubComponent", "()Lai/kudi/agent/transactions/data/di/VerificationSubComponent;", "setPendingSubComponent", "(Lai/kudi/agent/transactions/data/di/VerificationSubComponent;)V", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/transactions/presenters/PendingVerificationPresenter;", "setThisPresenter", "(Lai/kudi/agent/transactions/presenters/PendingVerificationPresenter;)V", "verificationData", "Lai/kudi/agent/transactions/domain/usecases/VerifyPendingData;", "createPresenter", "navigateToPictureUpload", "", "fullName", "", "phoneNumber", "reason", "occupation", "idType", "idNo", "dob", "navigateToSuccessVerification", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactions.ui.PendingVerificationActivity */
/* loaded from: classes.dex */
public final class PendingVerificationActivity extends MvpActivity<PendingVerificationView, PendingVerificationPresenter, ActivityPendingVerificationBinding> implements VerificationNavigator, PendingVerificationView {
    public static final Companion Companion;
    public static final String EXTRA_CUSTOMER_NAME = "extra_customer_name";
    public static final String EXTRA_CUSTOMER_PHONE_NUMBER = "extra_customer_phone";
    public static final String EXTRA_CUSTOMER_PICTURE_ID = "extra_customer_picture_id";
    public static final String EXTRA_TRANSACTION_AMOUNT = "transaction";
    public static final String EXTRA_TRANSACTION_TYPE = "type";
    public static final String EXTRA_TRANS_REF = "extra_trans_ref";
    public VerificationSubComponent pendingSubComponent;
    public PendingVerificationPresenter thisPresenter;
    private VerifyPendingData verificationData;

    /* compiled from: PendingVerificationActivity.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/transactions/ui/PendingVerificationActivity$Companion;", "", "()V", "EXTRA_CUSTOMER_NAME", "", "EXTRA_CUSTOMER_PHONE_NUMBER", "EXTRA_CUSTOMER_PICTURE_ID", "EXTRA_TRANSACTION_AMOUNT", "EXTRA_TRANSACTION_TYPE", "EXTRA_TRANS_REF", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transactions.ui.PendingVerificationActivity$Companion */
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
    public PendingVerificationActivity() {
        VerifyPendingData $r1 = new VerifyPendingData(null, null, null, null, null, null, null, 127, null);
        this.verificationData = $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-0  reason: not valid java name */
    public static final void m41228onCreate$lambda0(PendingVerificationActivity pendingVerificationActivity, View view) {
        Log_OC.getArray(pendingVerificationActivity, "this$0");
        pendingVerificationActivity.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onCreate$lambda-1  reason: not valid java name */
    public static final void m41229onCreate$lambda1(PendingVerificationActivity pendingVerificationActivity) {
        Log_OC.getArray(pendingVerificationActivity, "this$0");
        InterfaceC8209a $r0 = pendingVerificationActivity.getBinding();
        ActivityPendingVerificationBinding $r2 = (ActivityPendingVerificationBinding) $r0;
        Toolbar $r3 = $r2.toolbar;
        $r3.setTitle("Customer's KYC");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public PendingVerificationPresenter createPresenter() {
        PendingVerificationPresenter $r1 = getThisPresenter();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public /* bridge */ /* synthetic */ InterfaceC9413d createPresenter() {
        PendingVerificationPresenter $r1 = createPresenter();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public ActivityPendingVerificationBinding getActivityBinding() {
        Activity r3 = (Activity) this;
        LayoutInflater $r1 = r3.getLayoutInflater();
        ActivityPendingVerificationBinding $r2 = ActivityPendingVerificationBinding.inflate($r1);
        Log_OC.loadImage($r2, "inflate(layoutInflater)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public /* bridge */ /* synthetic */ InterfaceC8209a getActivityBinding() {
        ActivityPendingVerificationBinding $r1 = getActivityBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final VerificationSubComponent getPendingSubComponent() {
        VerificationSubComponent $r1 = this.pendingSubComponent;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("pendingSubComponent");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PendingVerificationPresenter getThisPresenter() {
        PendingVerificationPresenter $r1 = this.thisPresenter;
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
    @Override // ai.kudi.agent.transactions.p032ui.VerificationNavigator
    public void navigateToPictureUpload(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Log_OC.getArray(str, "fullName");
        Log_OC.getArray(str2, "phoneNumber");
        Log_OC.getArray(str3, "reason");
        Log_OC.getArray(str4, "occupation");
        Log_OC.getArray(str5, "idType");
        Log_OC.getArray(str6, "idNo");
        Log_OC.getArray(str7, "dob");
        VerifyPendingData $r8 = this.verificationData;
        IdInformation r15 = new IdInformation(str7, str6, str5);
        this.verificationData = VerifyPendingData.copy$default($r8, str2, str, null, str3, str4, null, r15, 36, null);
        InterfaceC8209a $r10 = getBinding();
        ActivityPendingVerificationBinding $r11 = (ActivityPendingVerificationBinding) $r10;
        Toolbar $r12 = $r11.toolbar;
        $r12.setTitle("Customer's Picture");
        PendingVerificationImageCaptureFragment.Companion $r13 = PendingVerificationImageCaptureFragment.Companion;
        VerifyPendingData $r82 = this.verificationData;
        Fragment $r14 = $r13.newInstance($r82);
        AppCompatActivity r16 = (AppCompatActivity) this;
        Fragment r17 = $r14;
        AppCompatActivityExtKt.startFragment$default(r16, r17, C0001R.C0003id.contentFrameLayout, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactions.p032ui.VerificationNavigator
    public void navigateToSuccessVerification() {
        InterfaceC8209a $r1 = getBinding();
        Toolbar $r3 = ((ActivityPendingVerificationBinding) $r1).toolbar;
        Log_OC.loadImage($r3, "binding.toolbar");
        ViewExtKt.hide$default($r3, false, 1, null);
        SuccessScreenDialogFragment.Companion $r4 = SuccessScreenDialogFragment.Companion;
        String $r5 = ((Activity) this).getString(C0001R.string.text_pfc_success_title);
        String $r6 = ((Activity) this).getString(C0001R.string.text_pfc_success_desc);
        Activity r15 = (Activity) this;
        String $r7 = r15.getString(C0001R.string.text_pfc_success_action_btn_desc);
        Log_OC.loadImage($r5, "getString(R.string.text_pfc_success_title)");
        Log_OC.loadImage($r6, "getString(R.string.text_pfc_success_desc)");
        Log_OC.loadImage($r7, "getString(R.string.text_pfc_success_action_btn_desc)");
        SuccessScreenCustomOption r12 = new SuccessScreenCustomOption($r5, $r6, $r7, false, false, false, 0, 0, 0, C0001R.color.page_background, C0001R.C0002drawable.ic_pfc_upload_success, 0, false, 6648, null);
        PendingVerificationActivity$navigateToSuccessVerification$1 r13 = new PendingVerificationActivity$navigateToSuccessVerification$1(this);
        SuccessScreenDialogFragment $r10 = $r4.newInstance(r12, r13);
        FragmentActivity r16 = (FragmentActivity) this;
        FragmentManager $r11 = r16.getSupportFragmentManager();
        $r10.show($r11, SuccessScreenDialogFragment.PAGE_KEY);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onBackPressed() {
        FragmentActivity r2 = (FragmentActivity) this;
        FragmentManager $r1 = r2.getSupportFragmentManager();
        int $i0 = $r1.m35920m0();
        if ($i0 <= 1) {
            Activity r3 = (Activity) this;
            r3.finish();
            return;
        }
        ComponentActivity r4 = (ComponentActivity) this;
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity, p272h.p364d.p365a.p366c.AbstractC9409a
    public void onCreate(Bundle bundle) {
        Activity r27 = (Activity) this;
        Application $r2 = r27.getApplication();
        if ($r2 == null) {
            NullPointerException r26 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw r26;
        }
        BaseApplication $r3 = (BaseApplication) $r2;
        ApplicationComponent $r4 = $r3.getApplicationComponent();
        VerificationSubComponent.Factory $r5 = $r4.verificationSubComponent();
        VerificationSubComponent $r6 = $r5.create(this);
        setPendingSubComponent($r6);
        VerificationSubComponent $r62 = getPendingSubComponent();
        $r62.inject(this);
        super.onCreate(bundle);
        InterfaceC8209a $r7 = getBinding();
        Toolbar $r9 = ((ActivityPendingVerificationBinding) $r7).toolbar;
        ((AppCompatActivity) this).setSupportActionBar($r9);
        InterfaceC8209a $r72 = getBinding();
        ActivityPendingVerificationBinding $r8 = (ActivityPendingVerificationBinding) $r72;
        Toolbar $r92 = $r8.toolbar;
        Context r29 = (Context) this;
        int $i0 = C1335a.m36324d(r29, C0001R.color.colorPrimary);
        $r92.setTitleTextColor($i0);
        InterfaceC8209a $r73 = getBinding();
        ActivityPendingVerificationBinding $r82 = (ActivityPendingVerificationBinding) $r73;
        Toolbar $r93 = $r82.toolbar;
        $r93.setNavigationIcon(C0001R.C0002drawable.ic_arrow_backward_color_primary);
        InterfaceC8209a $r74 = getBinding();
        ActivityPendingVerificationBinding $r83 = (ActivityPendingVerificationBinding) $r74;
        Toolbar $r94 = $r83.toolbar;
        $r94.setNavigationOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactions.ui.EulaActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PendingVerificationActivity $r22 = PendingVerificationActivity.this;
                PendingVerificationActivity.m41228onCreate$lambda0($r22, view);
            }
        });
        Activity r272 = (Activity) this;
        Intent $r11 = r272.getIntent();
        String $r12 = $r11.getStringExtra(EXTRA_TRANS_REF);
        String $r13 = $r12;
        if ($r12 == null) {
            $r13 = "";
        }
        Activity r273 = (Activity) this;
        Intent $r112 = r273.getIntent();
        String $r122 = $r112.getStringExtra("extra_customer_name");
        Activity r274 = (Activity) this;
        Intent $r113 = r274.getIntent();
        String $r14 = $r113.getStringExtra(EXTRA_CUSTOMER_PHONE_NUMBER);
        Activity r275 = (Activity) this;
        Intent $r114 = r275.getIntent();
        String $r15 = $r114.getStringExtra("transaction");
        Activity r276 = (Activity) this;
        Intent $r115 = r276.getIntent();
        String $r16 = $r115.getStringExtra("type");
        VerifyPendingData $r17 = this.verificationData;
        this.verificationData = VerifyPendingData.copy$default($r17, null, null, null, null, null, $r13, null, 95, null);
        PendingVerificationCustomerDetailInputFragment.Companion $r18 = PendingVerificationCustomerDetailInputFragment.Companion;
        Fragment $r19 = $r18.newInstance($r122, $r14, $r15, $r16);
        AppCompatActivity r28 = (AppCompatActivity) this;
        Fragment r30 = $r19;
        AppCompatActivityExtKt.startFragment$default(r28, r30, C0001R.C0003id.contentFrameLayout, false, false, false, 28, null);
        Handler r24 = new Handler();
        r24.postDelayed(new Runnable() { // from class: ai.kudi.agent.transactions.ui.TestActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public final void run() {
                PendingVerificationActivity $r1 = PendingVerificationActivity.this;
                PendingVerificationActivity.m41229onCreate$lambda1($r1);
            }
        }, 150L);
    }

    public final void setPendingSubComponent(VerificationSubComponent verificationSubComponent) {
        Log_OC.getArray(verificationSubComponent, "<set-?>");
        this.pendingSubComponent = verificationSubComponent;
    }

    public final void setThisPresenter(PendingVerificationPresenter pendingVerificationPresenter) {
        Log_OC.getArray(pendingVerificationPresenter, "<set-?>");
        this.thisPresenter = pendingVerificationPresenter;
    }
}
