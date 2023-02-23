package ai.kudi.agent.dashboard.mods;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.mvp.MvpActivity;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.dashboard.adapter.TransactionBreakDownAdapter;
import ai.kudi.agent.dashboard.presenter.TransactionBreakDownPresenter;
import ai.kudi.agent.dashboard.view.TransactionBreakdownView;
import ai.kudi.agent.databinding.ActivityTransactionBreakDownBinding;
import ai.kudi.agent.filter.domain.FilteredDate;
import ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItemType;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: TransactionBreakDownActivity.kt */
@Metadata(m10422d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 %2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0002:\u0001%B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\u0016\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0012H\u0016J\b\u0010\u001c\u001a\u00020\u0012H\u0016J\u0012\u0010\u001d\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010 \u001a\u00020\u0018H\u0016J\u0010\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0012H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006&"}, m10421d2 = {"Lai/kudi/agent/dashboard/ui/TransactionBreakDownActivity;", "Lai/kudi/agent/core/mvp/MvpActivity;", "Lai/kudi/agent/dashboard/view/TransactionBreakdownView;", "Lai/kudi/agent/dashboard/presenter/TransactionBreakDownPresenter;", "Lai/kudi/agent/databinding/ActivityTransactionBreakDownBinding;", "()V", "activityBinding", "getActivityBinding", "()Lai/kudi/agent/databinding/ActivityTransactionBreakDownBinding;", "summaryType", "Lai/kudi/agent/transactionhistory/presentation/model/TransactionSummaryItemType;", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/dashboard/presenter/TransactionBreakDownPresenter;", "setThisPresenter", "(Lai/kudi/agent/dashboard/presenter/TransactionBreakDownPresenter;)V", "createPresenter", "displayBreakdown", "", "breakdown", "", "Lai/kudi/agent/dashboard/domain/model/TransactionBreakDownDomain;", "fetchBreakDown", "isParentOutlet", "", "filteredDate", "Lai/kudi/agent/filter/domain/FilteredDate;", "hideErrorLayout", "hideProgress", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSupportNavigateUp", "showErrorLayout", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "", "showProgress", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionBreakDownActivity extends MvpActivity<TransactionBreakdownView, TransactionBreakDownPresenter, ActivityTransactionBreakDownBinding> implements TransactionBreakdownView {
    public static final String BREAKDOWN_LIST = "BREAK_DOWN_LIST";
    public static final String BUNDLE_KEY_SUMMARY_TYPE = "SUMMARY_TYPE";
    public static final Companion Companion;
    public static final String FILTERED_DATE_INTENT = "FILTERED_DATE_INTENT";
    public static final String IS_PARENT_OUTLET = "IS_PARENT_OUTLET";
    private TransactionSummaryItemType summaryType;
    public TransactionBreakDownPresenter thisPresenter;

    /* compiled from: TransactionBreakDownActivity.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/dashboard/ui/TransactionBreakDownActivity$Companion;", "", "()V", "BREAKDOWN_LIST", "", "BUNDLE_KEY_SUMMARY_TYPE", TransactionBreakDownActivity.FILTERED_DATE_INTENT, TransactionBreakDownActivity.IS_PARENT_OUTLET, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public final class Companion {
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
    private final void fetchBreakDown(boolean z, FilteredDate filteredDate) {
        if (!z) {
            TransactionBreakDownPresenter $r2 = getThisPresenter();
            $r2.displayBreakdowns(filteredDate);
            return;
        }
        Activity r10 = (Activity) this;
        Intent $r3 = r10.getIntent();
        Object $r4 = $r3.getParcelableArrayListExtra(BREAKDOWN_LIST);
        Object $r5 = $r4;
        if ($r4 == null) {
            $r5 = C13726r.m3891e();
        }
        List $r6 = (List) $r5;
        displayBreakdown($r6);
        InterfaceC8209a $r7 = getBinding();
        ActivityTransactionBreakDownBinding $r8 = (ActivityTransactionBreakDownBinding) $r7;
        Button $r9 = $r8.retryButton;
        Log_OC.loadImage($r9, "binding.retryButton");
        ViewExtKt.hide$default($r9, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-0  reason: not valid java name */
    public static final void m39205onCreate$lambda0(TransactionBreakDownActivity transactionBreakDownActivity, boolean z, FilteredDate filteredDate, View view) {
        Log_OC.getArray(transactionBreakDownActivity, "this$0");
        Log_OC.getArray(filteredDate, "$filteredDate");
        transactionBreakDownActivity.fetchBreakDown(z, filteredDate);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public TransactionBreakDownPresenter createPresenter() {
        TransactionBreakDownPresenter $r1 = getThisPresenter();
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
    @Override // ai.kudi.agent.dashboard.view.TransactionBreakdownView
    public void displayBreakdown(List list) {
        Log_OC.getArray(list, "breakdown");
        TransactionSummaryItemType $r4 = this.summaryType;
        if ($r4 == null) {
            Log_OC.LogError("summaryType");
            NullPointerException r7 = new NullPointerException("Null throw statement replaced by Soot");
            throw r7;
        }
        TransactionBreakDownAdapter $r3 = new TransactionBreakDownAdapter($r4);
        InterfaceC8209a $r1 = getBinding();
        ActivityTransactionBreakDownBinding $r5 = (ActivityTransactionBreakDownBinding) $r1;
        RecyclerView $r6 = $r5.breakDownRecyclerview;
        $r6.setAdapter($r3);
        $r3.setBreakdowns(list);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public ActivityTransactionBreakDownBinding getActivityBinding() {
        Activity r3 = (Activity) this;
        LayoutInflater $r1 = r3.getLayoutInflater();
        ActivityTransactionBreakDownBinding $r2 = ActivityTransactionBreakDownBinding.inflate($r1);
        Log_OC.loadImage($r2, "inflate(layoutInflater)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public /* bridge */ /* synthetic */ InterfaceC8209a getActivityBinding() {
        ActivityTransactionBreakDownBinding $r1 = getActivityBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TransactionBreakDownPresenter getThisPresenter() {
        TransactionBreakDownPresenter $r1 = this.thisPresenter;
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
    @Override // ai.kudi.agent.dashboard.view.TransactionBreakdownView
    public void hideErrorLayout() {
        InterfaceC8209a $r1 = getBinding();
        ActivityTransactionBreakDownBinding $r2 = (ActivityTransactionBreakDownBinding) $r1;
        Button $r3 = $r2.retryButton;
        Log_OC.loadImage($r3, "binding.retryButton");
        ViewExtKt.hide$default($r3, false, 1, null);
        InterfaceC8209a $r12 = getBinding();
        ActivityTransactionBreakDownBinding $r22 = (ActivityTransactionBreakDownBinding) $r12;
        TextView $r4 = $r22.errorTextView;
        Log_OC.loadImage($r4, "binding.errorTextView");
        ViewExtKt.hide$default($r4, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.dashboard.view.TransactionBreakdownView
    public void hideProgress() {
        InterfaceC8209a $r1 = getBinding();
        ActivityTransactionBreakDownBinding $r2 = (ActivityTransactionBreakDownBinding) $r1;
        ProgressBar $r3 = $r2.progressBar;
        Log_OC.loadImage($r3, "binding.progressBar");
        ViewExtKt.hide$default($r3, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity, p272h.p364d.p365a.p366c.AbstractC9409a
    public void onCreate(Bundle bundle) {
        Activity r19 = (Activity) this;
        Application $r2 = r19.getApplication();
        if ($r2 == null) {
            NullPointerException r18 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw r18;
        }
        BaseApplication $r3 = (BaseApplication) $r2;
        ApplicationComponent $r4 = $r3.initializeComponent();
        $r4.inject(this);
        super.onCreate(bundle);
        InterfaceC8209a $r5 = getBinding();
        ActivityTransactionBreakDownBinding $r6 = (ActivityTransactionBreakDownBinding) $r5;
        Toolbar $r7 = $r6.toolbar;
        AppCompatActivity r20 = (AppCompatActivity) this;
        r20.setSupportActionBar($r7);
        AppCompatActivity r202 = (AppCompatActivity) this;
        AbstractC0925a $r8 = r202.getSupportActionBar();
        if ($r8 != null) {
            $r8.mo37602u(true);
        }
        Activity r192 = (Activity) this;
        String $r9 = r192.getString(C0001R.string.transaction_breakdown);
        Log_OC.loadImage($r9, "getString(R.string.transaction_breakdown)");
        setTitle($r9);
        Activity r193 = (Activity) this;
        Intent $r10 = r193.getIntent();
        Serializable $r11 = $r10.getSerializableExtra(FILTERED_DATE_INTENT);
        if ($r11 == null) {
            NullPointerException r182 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.filter.domain.FilteredDate");
            throw r182;
        }
        final FilteredDate $r12 = (FilteredDate) $r11;
        Activity r194 = (Activity) this;
        Intent $r102 = r194.getIntent();
        final boolean $z0 = $r102.getBooleanExtra(IS_PARENT_OUTLET, false);
        Activity r195 = (Activity) this;
        Intent $r103 = r195.getIntent();
        Serializable $r112 = $r103.getSerializableExtra(BUNDLE_KEY_SUMMARY_TYPE);
        boolean $z1 = $r112 instanceof TransactionSummaryItemType;
        TransactionSummaryItemType $r13 = $z1 ? (TransactionSummaryItemType) $r112 : null;
        if ($r13 == null) {
            $r13 = TransactionSummaryItemType.TOTAL_VALUE;
        }
        this.summaryType = $r13;
        fetchBreakDown($z0, $r12);
        InterfaceC8209a $r52 = getBinding();
        ActivityTransactionBreakDownBinding $r62 = (ActivityTransactionBreakDownBinding) $r52;
        Button $r14 = $r62.retryButton;
        $r14.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.dashboard.mods.e
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransactionBreakDownActivity $r22 = TransactionBreakDownActivity.this;
                boolean $z02 = $z0;
                FilteredDate $r32 = $r12;
                TransactionBreakDownActivity.m39205onCreate$lambda0($r22, $z02, $r32, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean onSupportNavigateUp() {
        Activity r1 = (Activity) this;
        r1.finish();
        AppCompatActivity r2 = (AppCompatActivity) this;
        boolean $z0 = super/*androidx.appcompat.app.AppCompatActivity*/.onSupportNavigateUp();
        return $z0;
    }

    public final void setThisPresenter(TransactionBreakDownPresenter transactionBreakDownPresenter) {
        Log_OC.getArray(transactionBreakDownPresenter, "<set-?>");
        this.thisPresenter = transactionBreakDownPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.dashboard.view.TransactionBreakdownView
    public void showErrorLayout(String str) {
        Log_OC.getArray(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        InterfaceC8209a $r2 = getBinding();
        ActivityTransactionBreakDownBinding $r3 = (ActivityTransactionBreakDownBinding) $r2;
        Button $r4 = $r3.retryButton;
        Log_OC.loadImage($r4, "binding.retryButton");
        ViewExtKt.show($r4);
        InterfaceC8209a $r22 = getBinding();
        ActivityTransactionBreakDownBinding $r32 = (ActivityTransactionBreakDownBinding) $r22;
        TextView $r5 = $r32.errorTextView;
        Log_OC.loadImage($r5, "binding.errorTextView");
        ViewExtKt.show($r5);
        InterfaceC8209a $r23 = getBinding();
        ActivityTransactionBreakDownBinding $r33 = (ActivityTransactionBreakDownBinding) $r23;
        $r33.errorTextView.setText(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.dashboard.view.TransactionBreakdownView
    public void showProgress() {
        InterfaceC8209a $r1 = getBinding();
        ActivityTransactionBreakDownBinding $r2 = (ActivityTransactionBreakDownBinding) $r1;
        ProgressBar $r3 = $r2.progressBar;
        Log_OC.loadImage($r3, "binding.progressBar");
        ViewExtKt.show($r3);
    }
}
