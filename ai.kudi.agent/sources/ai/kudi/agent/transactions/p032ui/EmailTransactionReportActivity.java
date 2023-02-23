package ai.kudi.agent.transactions.p032ui;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.mvp.MvpActivity;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.databinding.ActivityTransactionEmailReportBinding;
import ai.kudi.agent.dialogs.DatePickerFragment;
import ai.kudi.agent.transactions.adapters.TransactionStatusAndTypeAdapter;
import ai.kudi.agent.transactions.p032ui.SelectStatusOrTypeFragment;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.transactions.presenters.EmailTransactionReportPresenter;
import ai.kudi.agent.transactions.views.EmailTransactionReportView;
import ai.kudi.dip.library.edittext.KudiInputField;
import ai.kudi.dip.library.p043h.C0806g;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC1523w;
import androidx.lifecycle.PreferenceActivity;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: EmailTransactionReportActivity.kt */
@Metadata(m10422d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u001a\u001a\u00020\u0003H\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\n\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\b\u0010!\u001a\u00020\u0010H\u0002J\b\u0010\"\u001a\u00020\u0010H\u0002J\b\u0010#\u001a\u00020\u001cH\u0016J\u0012\u0010$\u001a\u00020\u001c2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\u0010\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020\u001eH\u0016J\u0018\u0010+\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020)2\u0006\u0010,\u001a\u00020\u001eH\u0002J\b\u0010-\u001a\u00020\u001cH\u0002J\u0010\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u0010H\u0016J\u0012\u00100\u001a\u00020\u001c2\b\u00101\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u00102\u001a\u00020\u001c2\u0006\u00103\u001a\u00020\u0010H\u0016J\b\u00104\u001a\u00020\u001cH\u0016J&\u00105\u001a\u00020\u001c2\u001c\u00106\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001008j\u0002`907H\u0016J\u0010\u0010:\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020\u001eH\u0016R\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006<"}, m10421d2 = {"Lai/kudi/agent/transactions/ui/EmailTransactionReportActivity;", "Lai/kudi/agent/core/mvp/MvpActivity;", "Lai/kudi/agent/transactions/views/EmailTransactionReportView;", "Lai/kudi/agent/transactions/presenters/EmailTransactionReportPresenter;", "Lai/kudi/agent/databinding/ActivityTransactionEmailReportBinding;", "()V", "activityBinding", "getActivityBinding", "()Lai/kudi/agent/databinding/ActivityTransactionEmailReportBinding;", "position", "", "getPosition", "()I", "setPosition", "(I)V", "statusOrType", "", "getStatusOrType", "()Ljava/lang/String;", "setStatusOrType", "(Ljava/lang/String;)V", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/transactions/presenters/EmailTransactionReportPresenter;", "setThisPresenter", "(Lai/kudi/agent/transactions/presenters/EmailTransactionReportPresenter;)V", "createPresenter", "downloadStatus", "", "isDownloading", "", "enterEmailAddressBottomSheet", "Lai/kudi/dip/library/bottomSheets/EnterEmailAddressBottomSheet;", "getStatusType", "getTransactionType", "hideLoading", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSelectEditText", "kudiInputField", "Lai/kudi/dip/library/edittext/KudiInputField;", "onSupportNavigateUp", "performClick", "isType", "setUpdateViews", "showBottomSheet", "emailAddress", "showError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "showFeedbackMsg", "msg", "showLoading", "showTransactions", "transactions", "", "Ljava/util/HashMap;", "Lai/kudi/agent/transactions/domain/dto/Transaction;", "toggleBottomSheet", "isSuccessful", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactions.ui.EmailTransactionReportActivity */
/* loaded from: classes.dex */
public final class EmailTransactionReportActivity extends MvpActivity<EmailTransactionReportView, EmailTransactionReportPresenter, ActivityTransactionEmailReportBinding> implements EmailTransactionReportView {
    private int position;
    private String statusOrType = "";
    public EmailTransactionReportPresenter thisPresenter;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final C0806g enterEmailAddressBottomSheet() {
        FragmentActivity r6 = (FragmentActivity) this;
        FragmentManager $r1 = r6.getSupportFragmentManager();
        String $r3 = C0806g.class.getCanonicalName();
        Fragment $r4 = $r1.m35938g0($r3);
        boolean $z0 = $r4 instanceof C0806g;
        if ($z0) {
            C0806g $r5 = (C0806g) $r4;
            return $r5;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getStatusType() {
        TransactionStatusAndTypeAdapter.Companion $r1 = TransactionStatusAndTypeAdapter.Companion;
        List $r2 = $r1.getTransactionStatus();
        int $i0 = this.position;
        Object $r3 = $r2.get($i0);
        String $r4 = (String) $r3;
        return $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getTransactionType() {
        TransactionStatusAndTypeAdapter.Companion $r1 = TransactionStatusAndTypeAdapter.Companion;
        List $r2 = $r1.getTransactionTypes();
        int $i0 = this.position;
        Object $r3 = $r2.get($i0);
        String $r4 = (String) $r3;
        return $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-1$lambda-0  reason: not valid java name */
    public static final void m41218onCreate$lambda1$lambda0(EmailTransactionReportActivity emailTransactionReportActivity, KudiInputField kudiInputField, View view) {
        Log_OC.getArray(emailTransactionReportActivity, "this$0");
        Log_OC.getArray(kudiInputField, "$selectTypeView");
        emailTransactionReportActivity.performClick(kudiInputField, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-2  reason: not valid java name */
    public static final void m41219onCreate$lambda2(EmailTransactionReportActivity emailTransactionReportActivity, KudiInputField kudiInputField, View view) {
        Log_OC.getArray(emailTransactionReportActivity, "this$0");
        Log_OC.getArray(kudiInputField, "$selectTypeView");
        emailTransactionReportActivity.performClick(kudiInputField, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-4$lambda-3  reason: not valid java name */
    public static final void m41220onCreate$lambda4$lambda3(EmailTransactionReportActivity emailTransactionReportActivity, KudiInputField kudiInputField, View view) {
        Log_OC.getArray(emailTransactionReportActivity, "this$0");
        Log_OC.getArray(kudiInputField, "$selectStatusView");
        emailTransactionReportActivity.performClick(kudiInputField, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-5  reason: not valid java name */
    public static final void m41221onCreate$lambda5(EmailTransactionReportActivity emailTransactionReportActivity, KudiInputField kudiInputField, View view) {
        Log_OC.getArray(emailTransactionReportActivity, "this$0");
        Log_OC.getArray(kudiInputField, "$selectStatusView");
        emailTransactionReportActivity.performClick(kudiInputField, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onCreate$lambda-6  reason: not valid java name */
    public static final void m41222onCreate$lambda6(EmailTransactionReportActivity emailTransactionReportActivity, KudiInputField kudiInputField, KudiInputField kudiInputField2, View view) {
        Log_OC.getArray(emailTransactionReportActivity, "this$0");
        Log_OC.getArray(kudiInputField, "$selectStatusView");
        Log_OC.getArray(kudiInputField2, "$selectTypeView");
        EmailTransactionReportPresenter $r4 = emailTransactionReportActivity.getThisPresenter();
        String $r5 = kudiInputField.getText();
        String $r6 = kudiInputField2.getText();
        InterfaceC8209a $r7 = emailTransactionReportActivity.getBinding();
        ActivityTransactionEmailReportBinding $r8 = (ActivityTransactionEmailReportBinding) $r7;
        KudiInputField $r1 = $r8.toDateview;
        String $r9 = $r1.getText();
        InterfaceC8209a $r72 = emailTransactionReportActivity.getBinding();
        ActivityTransactionEmailReportBinding $r82 = (ActivityTransactionEmailReportBinding) $r72;
        KudiInputField $r12 = $r82.fromDateView;
        String $r10 = $r12.getText();
        boolean $z0 = $r4.isNotValidInputParams($r5, $r6, $r9, $r10);
        if ($z0) {
            return;
        }
        InterfaceC9413d $r11 = emailTransactionReportActivity.presenter;
        EmailTransactionReportPresenter $r42 = (EmailTransactionReportPresenter) $r11;
        $r42.getEmailAndShowBottomSheet();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onSelectEditText(final KudiInputField kudiInputField) {
        Activity r7 = (Activity) this;
        ContextExtKt.hideKeyboard(r7);
        DatePickerFragment.Companion $r2 = DatePickerFragment.Companion;
        DatePickerFragment $r3 = DatePickerFragment.Companion.newInstance$default($r2, false, null, false, 7, null);
        FragmentManager $r4 = ((FragmentActivity) this).getSupportFragmentManager();
        PreferenceActivity r9 = (PreferenceActivity) this;
        $r4.p1(DatePickerFragment.DATE_SET_KEY, r9, new InterfaceC1523w() { // from class: ai.kudi.agent.transactions.ui.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: b */
            public final void m38252b(String str, Bundle bundle) {
                KudiInputField $r32 = KudiInputField.this;
                EmailTransactionReportActivity.m41223onSelectEditText$lambda13($r32, str, bundle);
            }
        });
        FragmentActivity r8 = (FragmentActivity) this;
        FragmentManager $r42 = r8.getSupportFragmentManager();
        $r3.show($r42, DatePickerFragment.year);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onSelectEditText$lambda-13  reason: not valid java name */
    public static final void m41223onSelectEditText$lambda13(KudiInputField kudiInputField, String str, Bundle bundle) {
        Log_OC.getArray(kudiInputField, "$kudiInputField");
        Log_OC.getArray(str, "requestKey");
        Log_OC.getArray(bundle, "result");
        boolean $z0 = Log_OC.append(str, DatePickerFragment.DATE_SET_KEY);
        if ($z0) {
            Serializable $r3 = bundle.getSerializable(DatePickerFragment.DATE_KEY);
            if ($r3 == null) {
                NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type java.util.Date");
                throw $r5;
            }
            Date $r4 = (Date) $r3;
            String $r1 = DateExtKt.convertDateToGivenFormat($r4, "yyyy/MM/dd");
            kudiInputField.setText($r1);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void performClick(KudiInputField kudiInputField, boolean z) {
        SelectStatusOrTypeFragment.Companion $r2 = SelectStatusOrTypeFragment.Companion;
        SelectStatusOrTypeFragment $r3 = $r2.newInstance(z);
        EmailTransactionReportActivity$performClick$1 r6 = new EmailTransactionReportActivity$performClick$1(this, kudiInputField, $r3);
        $r3.setCallback(r6);
        FragmentActivity r7 = (FragmentActivity) this;
        FragmentManager $r5 = r7.getSupportFragmentManager();
        $r3.show($r5, "Select Status");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setUpdateViews() {
        InterfaceC8209a $r1 = getBinding();
        ActivityTransactionEmailReportBinding $r2 = (ActivityTransactionEmailReportBinding) $r1;
        KudiInputField $r3 = $r2.fromDateView;
        EditText $r4 = $r3.getEditText();
        $r4.setFocusable(false);
        $r4.setClickable(true);
        $r4.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactions.ui.j
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmailTransactionReportActivity $r22 = EmailTransactionReportActivity.this;
                EmailTransactionReportActivity.m41226setUpdateViews$lambda8$lambda7($r22, view);
            }
        });
        InterfaceC8209a $r12 = getBinding();
        ActivityTransactionEmailReportBinding $r22 = (ActivityTransactionEmailReportBinding) $r12;
        ViewGroup $r32 = $r22.fromDateView;
        ViewGroup r13 = $r32;
        r13.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactions.ui.Main
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmailTransactionReportActivity $r23 = EmailTransactionReportActivity.this;
                EmailTransactionReportActivity.m41227setUpdateViews$lambda9($r23, view);
            }
        });
        InterfaceC8209a $r13 = getBinding();
        ActivityTransactionEmailReportBinding $r23 = (ActivityTransactionEmailReportBinding) $r13;
        KudiInputField $r33 = $r23.toDateview;
        EditText $r42 = $r33.getEditText();
        $r42.setFocusable(false);
        $r42.setClickable(true);
        $r42.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactions.ui.c
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmailTransactionReportActivity $r24 = EmailTransactionReportActivity.this;
                EmailTransactionReportActivity.m41224setUpdateViews$lambda11$lambda10($r24, view);
            }
        });
        InterfaceC8209a $r14 = getBinding();
        ActivityTransactionEmailReportBinding $r24 = (ActivityTransactionEmailReportBinding) $r14;
        ViewGroup $r34 = $r24.toDateview;
        ViewGroup r132 = $r34;
        r132.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactions.ui.k
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmailTransactionReportActivity $r25 = EmailTransactionReportActivity.this;
                EmailTransactionReportActivity.m41225setUpdateViews$lambda12($r25, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpdateViews$lambda-11$lambda-10  reason: not valid java name */
    public static final void m41224setUpdateViews$lambda11$lambda10(EmailTransactionReportActivity emailTransactionReportActivity, View view) {
        Log_OC.getArray(emailTransactionReportActivity, "this$0");
        InterfaceC8209a $r1 = emailTransactionReportActivity.getBinding();
        ActivityTransactionEmailReportBinding $r3 = (ActivityTransactionEmailReportBinding) $r1;
        KudiInputField $r4 = $r3.toDateview;
        Log_OC.loadImage($r4, "binding.toDateview");
        emailTransactionReportActivity.onSelectEditText($r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpdateViews$lambda-12  reason: not valid java name */
    public static final void m41225setUpdateViews$lambda12(EmailTransactionReportActivity emailTransactionReportActivity, View view) {
        Log_OC.getArray(emailTransactionReportActivity, "this$0");
        InterfaceC8209a $r1 = emailTransactionReportActivity.getBinding();
        ActivityTransactionEmailReportBinding $r3 = (ActivityTransactionEmailReportBinding) $r1;
        KudiInputField $r4 = $r3.toDateview;
        Log_OC.loadImage($r4, "binding.toDateview");
        emailTransactionReportActivity.onSelectEditText($r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpdateViews$lambda-8$lambda-7  reason: not valid java name */
    public static final void m41226setUpdateViews$lambda8$lambda7(EmailTransactionReportActivity emailTransactionReportActivity, View view) {
        Log_OC.getArray(emailTransactionReportActivity, "this$0");
        InterfaceC8209a $r1 = emailTransactionReportActivity.getBinding();
        ActivityTransactionEmailReportBinding $r3 = (ActivityTransactionEmailReportBinding) $r1;
        KudiInputField $r4 = $r3.fromDateView;
        Log_OC.loadImage($r4, "binding.fromDateView");
        emailTransactionReportActivity.onSelectEditText($r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpdateViews$lambda-9  reason: not valid java name */
    public static final void m41227setUpdateViews$lambda9(EmailTransactionReportActivity emailTransactionReportActivity, View view) {
        Log_OC.getArray(emailTransactionReportActivity, "this$0");
        InterfaceC8209a $r1 = emailTransactionReportActivity.getBinding();
        ActivityTransactionEmailReportBinding $r3 = (ActivityTransactionEmailReportBinding) $r1;
        KudiInputField $r4 = $r3.fromDateView;
        Log_OC.loadImage($r4, "binding.fromDateView");
        emailTransactionReportActivity.onSelectEditText($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public EmailTransactionReportPresenter createPresenter() {
        EmailTransactionReportPresenter $r1 = getThisPresenter();
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
    @Override // ai.kudi.agent.transactions.views.EmailTransactionReportView
    public void downloadStatus(boolean z) {
        if (z) {
            C0806g $r1 = enterEmailAddressBottomSheet();
            if ($r1 == null) {
                return;
            }
            $r1.showProgress();
            return;
        }
        C0806g $r12 = enterEmailAddressBottomSheet();
        if ($r12 == null) {
            return;
        }
        $r12.hideProgress();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public ActivityTransactionEmailReportBinding getActivityBinding() {
        Activity r3 = (Activity) this;
        LayoutInflater $r1 = r3.getLayoutInflater();
        ActivityTransactionEmailReportBinding $r2 = ActivityTransactionEmailReportBinding.inflate($r1);
        Log_OC.loadImage($r2, "inflate(layoutInflater)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public /* bridge */ /* synthetic */ InterfaceC8209a getActivityBinding() {
        ActivityTransactionEmailReportBinding $r1 = getActivityBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getPosition() {
        int i0 = this.position;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getStatusOrType() {
        String r1 = this.statusOrType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final EmailTransactionReportPresenter getThisPresenter() {
        EmailTransactionReportPresenter $r1 = this.thisPresenter;
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
    @Override // ai.kudi.agent.transactions.views.EmailTransactionReportView
    public void hideLoading() {
        C0806g $r1 = enterEmailAddressBottomSheet();
        if ($r1 == null) {
            return;
        }
        $r1.hideProgress();
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
        Activity r252 = (Activity) this;
        String $r6 = r252.getString(C0001R.string.transaction_report);
        Log_OC.loadImage($r6, "getString(R.string.transaction_report)");
        setTitle($r6);
        setUpdateViews();
        InterfaceC8209a $r7 = getBinding();
        ActivityTransactionEmailReportBinding $r8 = (ActivityTransactionEmailReportBinding) $r7;
        final KudiInputField $r9 = $r8.selectTypeView;
        Log_OC.loadImage($r9, "binding.selectTypeView");
        EditText $r10 = $r9.getEditText();
        $r10.setFocusable(false);
        $r10.setClickable(true);
        $r10.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactions.ui.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmailTransactionReportActivity $r22 = EmailTransactionReportActivity.this;
                KudiInputField $r32 = $r9;
                EmailTransactionReportActivity.m41218onCreate$lambda1$lambda0($r22, $r32, view);
            }
        });
        KudiInputField r27 = $r9;
        r27.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactions.ui.s
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmailTransactionReportActivity $r22 = EmailTransactionReportActivity.this;
                KudiInputField $r32 = $r9;
                EmailTransactionReportActivity.m41219onCreate$lambda2($r22, $r32, view);
            }
        });
        InterfaceC8209a $r72 = getBinding();
        ActivityTransactionEmailReportBinding $r82 = (ActivityTransactionEmailReportBinding) $r72;
        final KudiInputField $r13 = $r82.selectStatusView;
        Log_OC.loadImage($r13, "binding.selectStatusView");
        EditText $r102 = $r13.getEditText();
        $r102.setFocusable(false);
        $r102.setClickable(true);
        $r102.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactions.ui.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmailTransactionReportActivity $r22 = EmailTransactionReportActivity.this;
                KudiInputField $r32 = $r13;
                EmailTransactionReportActivity.m41220onCreate$lambda4$lambda3($r22, $r32, view);
            }
        });
        KudiInputField r272 = $r13;
        r272.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactions.ui.h
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmailTransactionReportActivity $r22 = EmailTransactionReportActivity.this;
                KudiInputField $r32 = $r13;
                EmailTransactionReportActivity.m41221onCreate$lambda5($r22, $r32, view);
            }
        });
        InterfaceC8209a $r73 = getBinding();
        ActivityTransactionEmailReportBinding $r83 = (ActivityTransactionEmailReportBinding) $r73;
        ViewGroup $r16 = $r83.fireEmailButton;
        ViewGroup r273 = $r16;
        r273.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactions.ui.e
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmailTransactionReportActivity $r22 = EmailTransactionReportActivity.this;
                KudiInputField $r32 = $r13;
                KudiInputField $r42 = $r9;
                EmailTransactionReportActivity.m41222onCreate$lambda6($r22, $r32, $r42, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean onSupportNavigateUp() {
        Activity r1 = (Activity) this;
        r1.finish();
        return false;
    }

    public final void setPosition(int i) {
        this.position = i;
    }

    public final void setStatusOrType(String str) {
        this.statusOrType = str;
    }

    public final void setThisPresenter(EmailTransactionReportPresenter emailTransactionReportPresenter) {
        Log_OC.getArray(emailTransactionReportPresenter, "<set-?>");
        this.thisPresenter = emailTransactionReportPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactions.views.EmailTransactionReportView
    public void showBottomSheet(String str) {
        Log_OC.getArray(str, "emailAddress");
        C0621x943bf8dd r6 = new C0621x943bf8dd(this);
        C0806g r7 = new C0806g(str, r6);
        FragmentActivity r8 = (FragmentActivity) this;
        FragmentManager $r4 = r8.getSupportFragmentManager();
        String $r1 = C0806g.class.getCanonicalName();
        Chapter r9 = (Chapter) r7;
        r9.show($r4, $r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactions.views.EmailTransactionReportView
    public void showError(String $r1) {
        if ($r1 != null) {
            int $i0 = $r1.hashCode();
            if ($i0 == -892481550) {
                boolean $z0 = $r1.equals(TransactionField.STATUS);
                if ($z0) {
                    InterfaceC8209a $r2 = getBinding();
                    ActivityTransactionEmailReportBinding $r3 = (ActivityTransactionEmailReportBinding) $r2;
                    KudiInputField $r4 = $r3.selectStatusView;
                    $r4.setError("Status cannot be empty");
                    return;
                }
            } else if ($i0 == 3707) {
                boolean $z02 = $r1.equals("to");
                if ($z02) {
                    InterfaceC8209a $r22 = getBinding();
                    ActivityTransactionEmailReportBinding $r32 = (ActivityTransactionEmailReportBinding) $r22;
                    KudiInputField $r42 = $r32.toDateview;
                    $r42.setError("Please select end date");
                    return;
                }
            } else if ($i0 == 3151786) {
                boolean $z03 = $r1.equals("from");
                if ($z03) {
                    InterfaceC8209a $r23 = getBinding();
                    ActivityTransactionEmailReportBinding $r33 = (ActivityTransactionEmailReportBinding) $r23;
                    KudiInputField $r43 = $r33.fromDateView;
                    $r43.setError("Please select a valid start date");
                    return;
                }
            } else if ($i0 == 3575610) {
                boolean $z04 = $r1.equals("type");
                if ($z04) {
                    InterfaceC8209a $r24 = getBinding();
                    ActivityTransactionEmailReportBinding $r34 = (ActivityTransactionEmailReportBinding) $r24;
                    KudiInputField $r44 = $r34.selectTypeView;
                    $r44.setError("Type cannot be empty");
                    return;
                }
            }
        }
        C0806g $r5 = enterEmailAddressBottomSheet();
        if ($r5 == null) {
            return;
        }
        if ($r1 == null) {
            $r1 = "";
        }
        $r5.showError($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactions.views.EmailTransactionReportView
    public void showFeedbackMsg(String str) {
        Log_OC.getArray(str, "msg");
        Context r3 = (Context) this;
        ContextExtKt.toast(r3, str, 0);
        C0806g $r1 = enterEmailAddressBottomSheet();
        if ($r1 == null) {
            return;
        }
        $r1.dismiss();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactions.views.EmailTransactionReportView
    public void showLoading() {
        C0806g $r1 = enterEmailAddressBottomSheet();
        if ($r1 == null) {
            return;
        }
        $r1.showProgress();
    }

    @Override // ai.kudi.agent.transactions.views.EmailTransactionReportView
    public void showTransactions(List list) {
        Log_OC.getArray(list, "transactions");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactions.views.EmailTransactionReportView
    public void toggleBottomSheet(boolean z) {
        C0806g $r1;
        if (!z || ($r1 = enterEmailAddressBottomSheet()) == null) {
            return;
        }
        $r1.dismiss();
    }
}
