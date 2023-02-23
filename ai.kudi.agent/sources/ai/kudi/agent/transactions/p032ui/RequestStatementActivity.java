package ai.kudi.agent.transactions.p032ui;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.analytics.SmartLookAnalytics;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.mvp.MvpActivity;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.databinding.ActivityRequestStatementBinding;
import ai.kudi.agent.dialogs.DatePickerFragment;
import ai.kudi.agent.transactions.presenters.RequestStatementPresenter;
import ai.kudi.agent.transactions.views.RequestStatementView;
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
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC1523w;
import androidx.lifecycle.AbstractC1565i;
import androidx.lifecycle.PreferenceActivity;
import androidx.lifecycle.Priority;
import java.io.Serializable;
import java.util.Date;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: RequestStatementActivity.kt */
@Metadata(m10422d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0018H\u0002J\u0010\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$H\u0016J\u0012\u0010%\u001a\u00020\u00182\b\u0010&\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020$H\u0016J\b\u0010)\u001a\u00020\u0018H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006*"}, m10421d2 = {"Lai/kudi/agent/transactions/ui/RequestStatementActivity;", "Lai/kudi/agent/core/mvp/MvpActivity;", "Lai/kudi/agent/transactions/views/RequestStatementView;", "Lai/kudi/agent/transactions/presenters/RequestStatementPresenter;", "Lai/kudi/agent/databinding/ActivityRequestStatementBinding;", "()V", "activityBinding", "getActivityBinding", "()Lai/kudi/agent/databinding/ActivityRequestStatementBinding;", "smartLookAnalytics", "Lai/kudi/agent/analytics/SmartLookAnalytics;", "getSmartLookAnalytics", "()Lai/kudi/agent/analytics/SmartLookAnalytics;", "setSmartLookAnalytics", "(Lai/kudi/agent/analytics/SmartLookAnalytics;)V", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/transactions/presenters/RequestStatementPresenter;", "setThisPresenter", "(Lai/kudi/agent/transactions/presenters/RequestStatementPresenter;)V", "createPresenter", "enterEmailAddressBottomSheet", "Lai/kudi/dip/library/bottomSheets/EnterEmailAddressBottomSheet;", "hideLoading", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSelectEditText", "kudiInputField", "Lai/kudi/dip/library/edittext/KudiInputField;", "onSupportNavigateUp", "", "setUpdateViews", "showBottomSheet", "emailAddress", "", "showError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "showFeedbackMsg", "msg", "showLoading", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactions.ui.RequestStatementActivity */
/* loaded from: classes.dex */
public final class RequestStatementActivity extends MvpActivity<RequestStatementView, RequestStatementPresenter, ActivityRequestStatementBinding> implements RequestStatementView {
    public SmartLookAnalytics smartLookAnalytics;
    public RequestStatementPresenter thisPresenter;

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
    /* renamed from: onCreate$lambda-0  reason: not valid java name */
    public static final void m41235onCreate$lambda0(RequestStatementActivity requestStatementActivity, View view) {
        Log_OC.getArray(requestStatementActivity, "this$0");
        RequestStatementPresenter $r2 = requestStatementActivity.getThisPresenter();
        InterfaceC8209a $r3 = requestStatementActivity.getBinding();
        ActivityRequestStatementBinding $r4 = (ActivityRequestStatementBinding) $r3;
        KudiInputField $r5 = $r4.toDateview;
        String $r6 = $r5.getText();
        InterfaceC8209a $r32 = requestStatementActivity.getBinding();
        ActivityRequestStatementBinding $r42 = (ActivityRequestStatementBinding) $r32;
        KudiInputField $r52 = $r42.fromDateView;
        String $r7 = $r52.getText();
        boolean $z0 = $r2.isRequestStatementInputParamsValid($r6, $r7);
        if ($z0) {
            RequestStatementPresenter $r22 = requestStatementActivity.getThisPresenter();
            $r22.showEmailBottomSheet();
        }
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
        $r4.p1(DatePickerFragment.DATE_SET_KEY, r9, new InterfaceC1523w() { // from class: ai.kudi.agent.transactions.ui.ByteVector
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.fragment.app.InterfaceC1523w
            /* renamed from: a */
            public final void mo35611a(String str, Bundle bundle) {
                KudiInputField $r32 = KudiInputField.this;
                RequestStatementActivity.m41236onSelectEditText$lambda7($r32, str, bundle);
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
    /* renamed from: onSelectEditText$lambda-7  reason: not valid java name */
    public static final void m41236onSelectEditText$lambda7(KudiInputField kudiInputField, String str, Bundle bundle) {
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
    private final void setUpdateViews() {
        InterfaceC8209a $r1 = getBinding();
        ActivityRequestStatementBinding $r2 = (ActivityRequestStatementBinding) $r1;
        KudiInputField $r3 = $r2.fromDateView;
        EditText $r4 = $r3.getEditText();
        $r4.setFocusable(false);
        $r4.setClickable(true);
        $r4.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactions.ui.NoteEditor$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RequestStatementActivity $r22 = RequestStatementActivity.this;
                RequestStatementActivity.m41237setUpdateViews$lambda2$lambda1($r22, view);
            }
        });
        InterfaceC8209a $r12 = getBinding();
        ActivityRequestStatementBinding $r22 = (ActivityRequestStatementBinding) $r12;
        ViewGroup $r32 = $r22.fromDateView;
        ViewGroup r13 = $r32;
        r13.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactions.ui.a
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RequestStatementActivity $r23 = RequestStatementActivity.this;
                RequestStatementActivity.m41238setUpdateViews$lambda3($r23, view);
            }
        });
        InterfaceC8209a $r13 = getBinding();
        ActivityRequestStatementBinding $r23 = (ActivityRequestStatementBinding) $r13;
        KudiInputField $r33 = $r23.toDateview;
        EditText $r42 = $r33.getEditText();
        $r42.setFocusable(false);
        $r42.setClickable(true);
        $r42.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactions.ui.SearchResultsActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RequestStatementActivity $r24 = RequestStatementActivity.this;
                RequestStatementActivity.m41239setUpdateViews$lambda5$lambda4($r24, view);
            }
        });
        InterfaceC8209a $r14 = getBinding();
        ActivityRequestStatementBinding $r24 = (ActivityRequestStatementBinding) $r14;
        ViewGroup $r34 = $r24.toDateview;
        ViewGroup r132 = $r34;
        r132.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactions.ui.AbstractFilePickerFragment$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RequestStatementActivity $r25 = RequestStatementActivity.this;
                RequestStatementActivity.m41240setUpdateViews$lambda6($r25, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpdateViews$lambda-2$lambda-1  reason: not valid java name */
    public static final void m41237setUpdateViews$lambda2$lambda1(RequestStatementActivity requestStatementActivity, View view) {
        Log_OC.getArray(requestStatementActivity, "this$0");
        InterfaceC8209a $r1 = requestStatementActivity.getBinding();
        ActivityRequestStatementBinding $r3 = (ActivityRequestStatementBinding) $r1;
        KudiInputField $r4 = $r3.fromDateView;
        Log_OC.loadImage($r4, "binding.fromDateView");
        requestStatementActivity.onSelectEditText($r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpdateViews$lambda-3  reason: not valid java name */
    public static final void m41238setUpdateViews$lambda3(RequestStatementActivity requestStatementActivity, View view) {
        Log_OC.getArray(requestStatementActivity, "this$0");
        InterfaceC8209a $r1 = requestStatementActivity.getBinding();
        ActivityRequestStatementBinding $r3 = (ActivityRequestStatementBinding) $r1;
        KudiInputField $r4 = $r3.fromDateView;
        Log_OC.loadImage($r4, "binding.fromDateView");
        requestStatementActivity.onSelectEditText($r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpdateViews$lambda-5$lambda-4  reason: not valid java name */
    public static final void m41239setUpdateViews$lambda5$lambda4(RequestStatementActivity requestStatementActivity, View view) {
        Log_OC.getArray(requestStatementActivity, "this$0");
        InterfaceC8209a $r1 = requestStatementActivity.getBinding();
        ActivityRequestStatementBinding $r3 = (ActivityRequestStatementBinding) $r1;
        KudiInputField $r4 = $r3.toDateview;
        Log_OC.loadImage($r4, "binding.toDateview");
        requestStatementActivity.onSelectEditText($r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpdateViews$lambda-6  reason: not valid java name */
    public static final void m41240setUpdateViews$lambda6(RequestStatementActivity requestStatementActivity, View view) {
        Log_OC.getArray(requestStatementActivity, "this$0");
        InterfaceC8209a $r1 = requestStatementActivity.getBinding();
        ActivityRequestStatementBinding $r3 = (ActivityRequestStatementBinding) $r1;
        KudiInputField $r4 = $r3.toDateview;
        Log_OC.loadImage($r4, "binding.toDateview");
        requestStatementActivity.onSelectEditText($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public RequestStatementPresenter createPresenter() {
        RequestStatementPresenter $r1 = getThisPresenter();
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
    public ActivityRequestStatementBinding getActivityBinding() {
        Activity r3 = (Activity) this;
        LayoutInflater $r1 = r3.getLayoutInflater();
        ActivityRequestStatementBinding $r2 = ActivityRequestStatementBinding.inflate($r1);
        Log_OC.loadImage($r2, "inflate(layoutInflater)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public /* bridge */ /* synthetic */ InterfaceC8209a getActivityBinding() {
        ActivityRequestStatementBinding $r1 = getActivityBinding();
        return $r1;
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
    public final RequestStatementPresenter getThisPresenter() {
        RequestStatementPresenter $r1 = this.thisPresenter;
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
    @Override // ai.kudi.agent.transactions.views.RequestStatementView
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
        Activity r15 = (Activity) this;
        Application $r2 = r15.getApplication();
        if ($r2 == null) {
            NullPointerException r14 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw r14;
        }
        BaseApplication $r3 = (BaseApplication) $r2;
        ApplicationComponent $r4 = $r3.initializeComponent();
        $r4.inject(this);
        super.onCreate(bundle);
        AppCompatActivity r16 = (AppCompatActivity) this;
        AbstractC0925a $r5 = r16.getSupportActionBar();
        if ($r5 != null) {
            $r5.mo37602u(true);
        }
        Activity r152 = (Activity) this;
        String $r6 = r152.getString(C0001R.string.request_statement);
        Log_OC.loadImage($r6, "getString(R.string.request_statement)");
        setTitle($r6);
        InterfaceC8209a $r7 = getBinding();
        ActivityRequestStatementBinding $r8 = (ActivityRequestStatementBinding) $r7;
        ViewGroup $r9 = $r8.fireEmailButton;
        ViewGroup r17 = $r9;
        r17.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactions.ui.EditActivity$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RequestStatementActivity $r22 = RequestStatementActivity.this;
                RequestStatementActivity.m41235onCreate$lambda0($r22, view);
            }
        });
        setUpdateViews();
        SmartLookAnalytics $r11 = getSmartLookAnalytics();
        $r11.logAccountStatement();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean onSupportNavigateUp() {
        Activity r1 = (Activity) this;
        r1.finish();
        return false;
    }

    public final void setSmartLookAnalytics(SmartLookAnalytics smartLookAnalytics) {
        Log_OC.getArray(smartLookAnalytics, "<set-?>");
        this.smartLookAnalytics = smartLookAnalytics;
    }

    public final void setThisPresenter(RequestStatementPresenter requestStatementPresenter) {
        Log_OC.getArray(requestStatementPresenter, "<set-?>");
        this.thisPresenter = requestStatementPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactions.views.RequestStatementView
    public void showBottomSheet(String str) {
        Log_OC.getArray(str, "emailAddress");
        ComponentActivity r11 = (ComponentActivity) this;
        AbstractC1565i $r2 = r11.getLifecycle();
        Priority $r3 = $r2.mo35505b();
        Priority $r4 = Priority.f4719G;
        boolean $z0 = $r3.m35575c($r4);
        if ($z0) {
            C0622x6e79a487 r9 = new C0622x6e79a487(this);
            C0806g r10 = new C0806g(str, r9);
            FragmentActivity r12 = (FragmentActivity) this;
            FragmentManager $r7 = r12.getSupportFragmentManager();
            String $r1 = C0806g.class.getCanonicalName();
            Chapter r13 = (Chapter) r10;
            r13.show($r7, $r1);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactions.views.RequestStatementView
    public void showError(String $r1) {
        boolean $z0 = Log_OC.append($r1, "to");
        if ($z0) {
            Context r6 = (Context) this;
            ContextExtKt.toast$default(r6, "Please select end date", 0, 2, (Object) null);
            InterfaceC8209a $r2 = getBinding();
            ActivityRequestStatementBinding $r3 = (ActivityRequestStatementBinding) $r2;
            KudiInputField $r4 = $r3.toDateview;
            $r4.setError("Please select end date");
            return;
        }
        boolean $z02 = Log_OC.append($r1, "from");
        if ($z02) {
            InterfaceC8209a $r22 = getBinding();
            ActivityRequestStatementBinding $r32 = (ActivityRequestStatementBinding) $r22;
            KudiInputField $r42 = $r32.fromDateView;
            $r42.setError("Please select a valid start date");
            Context r62 = (Context) this;
            ContextExtKt.toast$default(r62, "Please select end date", 0, 2, (Object) null);
            return;
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
    @Override // ai.kudi.agent.transactions.views.RequestStatementView
    public void showFeedbackMsg(String str) {
        C0806g $r2;
        Log_OC.getArray(str, "msg");
        Context r3 = (Context) this;
        ContextExtKt.toast(r3, str, 0);
        Activity r4 = (Activity) this;
        boolean $z0 = r4.isFinishing();
        if ($z0 || ($r2 = enterEmailAddressBottomSheet()) == null) {
            return;
        }
        $r2.dismiss();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactions.views.RequestStatementView
    public void showLoading() {
        C0806g $r1 = enterEmailAddressBottomSheet();
        if ($r1 == null) {
            return;
        }
        $r1.showProgress();
    }
}
