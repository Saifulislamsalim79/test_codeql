package ai.kudi.agent.help.p006ui;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.mvp.MvpActivity;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.ActivityHelpBinding;
import ai.kudi.agent.help.adapter.HelpAdapter;
import ai.kudi.agent.help.presenter.HelpPresenter;
import ai.kudi.agent.help.views.HelpView;
import ai.kudi.agent.issues.p008ui.IssueActivity;
import ai.kudi.agent.issues.viewmodels.model.IssueTypeModel;
import android.app.Activity;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.C1335a;
import androidx.recyclerview.widget.C1723k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p215c.p216b.C7513a;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: HelpActivity.kt */
@Metadata(m10422d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0012\u0010\u001e\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020\"H\u0016J\u0010\u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u001aH\u0016J\b\u0010+\u001a\u00020\u0016H\u0016J\u0010\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u001aH\u0016J\u0016\u0010.\u001a\u00020\u00162\f\u0010/\u001a\b\u0012\u0004\u0012\u00020100H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u00062"}, m10421d2 = {"Lai/kudi/agent/help/ui/HelpActivity;", "Lai/kudi/agent/core/mvp/MvpActivity;", "Lai/kudi/agent/help/views/HelpView;", "Lai/kudi/agent/help/presenter/HelpPresenter;", "Lai/kudi/agent/databinding/ActivityHelpBinding;", "()V", "activityBinding", "getActivityBinding", "()Lai/kudi/agent/databinding/ActivityHelpBinding;", "adapter", "Lai/kudi/agent/help/adapter/HelpAdapter;", "getAdapter", "()Lai/kudi/agent/help/adapter/HelpAdapter;", "setAdapter", "(Lai/kudi/agent/help/adapter/HelpAdapter;)V", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/help/presenter/HelpPresenter;", "setThisPresenter", "(Lai/kudi/agent/help/presenter/HelpPresenter;)V", "createPresenter", "hideLoading", "", "initView", "makeACall", "phoneNumber", "", "navigateToSubmitIssue", "issueTypeModel", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onSupportNavigateUp", "openFaqWebPage", IjkMediaPlayer.OnNativeInvokeListener.ARG_URL, "showLoading", "showMessage", MetricTracker.Object.MESSAGE, "showPhoneNumbers", "phoneList", "", "Lai/kudi/agent/help/data/SupportInfoModel;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.help.ui.HelpActivity */
/* loaded from: classes.dex */
public final class HelpActivity extends MvpActivity<HelpView, HelpPresenter, ActivityHelpBinding> implements HelpView {
    public HelpAdapter adapter;
    public HelpPresenter thisPresenter;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void initView() {
        HelpPresenter $r1 = getThisPresenter();
        $r1.getPhoneNumbers();
        HelpAdapter r15 = new HelpAdapter((Context) this);
        setAdapter(r15);
        LinearLayoutManager r16 = new LinearLayoutManager((Context) this);
        InterfaceC8209a $r4 = getBinding();
        RecyclerView $r6 = ((ActivityHelpBinding) $r4).helpRecyclerview;
        HelpAdapter $r2 = getAdapter();
        $r6.setAdapter($r2);
        InterfaceC8209a $r42 = getBinding();
        RecyclerView $r62 = ((ActivityHelpBinding) $r42).helpRecyclerview;
        $r62.setLayoutManager(r16);
        int $i0 = r16.m35389v2();
        Context r23 = (Context) this;
        C1723k r17 = new C1723k(r23, $i0);
        Context r232 = (Context) this;
        Drawable $r8 = C1335a.m36322f(r232, C0001R.C0002drawable.transactions_divider);
        Log_OC.append($r8);
        r17.m34703f($r8);
        InterfaceC8209a $r43 = getBinding();
        ActivityHelpBinding $r5 = (ActivityHelpBinding) $r43;
        RecyclerView $r63 = $r5.helpRecyclerview;
        $r63.m35294h(r17);
        HelpAdapter $r22 = getAdapter();
        HelpActivity$initView$1 r18 = new HelpActivity$initView$1(this);
        $r22.setOnClickListener(r18);
        InterfaceC8209a $r44 = getBinding();
        ActivityHelpBinding $r52 = (ActivityHelpBinding) $r44;
        LinearLayout $r10 = $r52.chatLiveLayout;
        $r10.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.help.ui.TextCandidatesViewManager$6
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HelpActivity $r23 = HelpActivity.this;
                HelpActivity.m39268initView$lambda0($r23, view);
            }
        });
        InterfaceC8209a $r45 = getBinding();
        ActivityHelpBinding $r53 = (ActivityHelpBinding) $r45;
        LinearLayout $r102 = $r53.faqLayout;
        $r102.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.help.ui.TextCandidatesViewManager$7
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HelpActivity $r23 = HelpActivity.this;
                HelpActivity.m39269initView$lambda1($r23, view);
            }
        });
        final IssueTypeModel r21 = new IssueTypeModel("Kindly provide detailed information about the issue you are having.", "", "", "", "", null, null, null, null, null, null, null, null, null, null, null, null, "", true, null, null, null, null, null, null, null, "", "", "", "", null, null, null, null, null, null, false, -1007026208, 31, null);
        InterfaceC8209a $r46 = getBinding();
        ActivityHelpBinding $r54 = (ActivityHelpBinding) $r46;
        LinearLayout $r103 = $r54.submitIssueLayout;
        $r103.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.help.ui.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HelpActivity $r23 = HelpActivity.this;
                IssueTypeModel $r3 = r21;
                HelpActivity.m39270initView$lambda2($r23, $r3, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: initView$lambda-0  reason: not valid java name */
    public static final void m39268initView$lambda0(HelpActivity helpActivity, View view) {
        Log_OC.getArray(helpActivity, "this$0");
        HelpPresenter $r2 = helpActivity.getThisPresenter();
        $r2.logChatWithUsEvent();
        HelpPresenter $r22 = helpActivity.getThisPresenter();
        $r22.navigateToChatLive();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: initView$lambda-1  reason: not valid java name */
    public static final void m39269initView$lambda1(HelpActivity helpActivity, View view) {
        Log_OC.getArray(helpActivity, "this$0");
        HelpPresenter $r2 = helpActivity.getThisPresenter();
        $r2.logFAQEvent();
        HelpPresenter $r22 = helpActivity.getThisPresenter();
        $r22.navigateToWebPage("https://kudi.co/faq/?header=disable");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: initView$lambda-2  reason: not valid java name */
    public static final void m39270initView$lambda2(HelpActivity helpActivity, IssueTypeModel issueTypeModel, View view) {
        Log_OC.getArray(helpActivity, "this$0");
        Log_OC.getArray(issueTypeModel, "$issueTypeModel");
        HelpPresenter $r1 = helpActivity.getThisPresenter();
        $r1.navigateToIssuePage(issueTypeModel);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public HelpPresenter createPresenter() {
        HelpPresenter $r1 = getThisPresenter();
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
    public ActivityHelpBinding getActivityBinding() {
        Activity r3 = (Activity) this;
        LayoutInflater $r1 = r3.getLayoutInflater();
        ActivityHelpBinding $r2 = ActivityHelpBinding.inflate($r1);
        Log_OC.loadImage($r2, "inflate(layoutInflater)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public /* bridge */ /* synthetic */ InterfaceC8209a getActivityBinding() {
        ActivityHelpBinding $r1 = getActivityBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final HelpAdapter getAdapter() {
        HelpAdapter $r1 = this.adapter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("adapter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final HelpPresenter getThisPresenter() {
        HelpPresenter $r1 = this.thisPresenter;
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
    @Override // ai.kudi.agent.help.views.HelpView
    public void hideLoading() {
        InterfaceC8209a $r1 = getBinding();
        ActivityHelpBinding $r2 = (ActivityHelpBinding) $r1;
        TextView $r3 = $r2.infoText;
        Log_OC.loadImage($r3, "binding.infoText");
        ViewExtKt.hide$default($r3, false, 1, null);
        InterfaceC8209a $r12 = getBinding();
        ActivityHelpBinding $r22 = (ActivityHelpBinding) $r12;
        ProgressBar $r4 = $r22.progressBar;
        Log_OC.loadImage($r4, "binding.progressBar");
        ViewExtKt.hide$default($r4, false, 1, null);
        InterfaceC8209a $r13 = getBinding();
        ActivityHelpBinding $r23 = (ActivityHelpBinding) $r13;
        View $r5 = $r23.helpRecyclerview;
        Log_OC.loadImage($r5, "binding.helpRecyclerview");
        View r6 = $r5;
        ViewExtKt.show(r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.help.views.HelpView
    public void makeACall(String str) {
        Log_OC.getArray(str, "phoneNumber");
        Intent r4 = new Intent("android.intent.action.DIAL");
        String $r1 = Log_OC.m10359a("tel:", (Object) str);
        Uri $r3 = Uri.parse($r1);
        r4.setData($r3);
        Activity r5 = (Activity) this;
        r5.startActivity(r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.help.views.HelpView
    public void navigateToSubmitIssue(IssueTypeModel issueTypeModel) {
        Log_OC.getArray(issueTypeModel, "issueTypeModel");
        Context r4 = (Context) this;
        Intent r3 = new Intent(r4, IssueActivity.class);
        r3.putExtra(IssueActivity.ISSUE_MODEL, issueTypeModel);
        Activity r5 = (Activity) this;
        r5.startActivity(r3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity, p272h.p364d.p365a.p366c.AbstractC9409a
    public void onCreate(Bundle bundle) {
        Activity r9 = (Activity) this;
        Application $r2 = r9.getApplication();
        if ($r2 == null) {
            NullPointerException r8 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw r8;
        }
        BaseApplication $r3 = (BaseApplication) $r2;
        ApplicationComponent $r4 = $r3.initializeComponent();
        $r4.inject(this);
        super.onCreate(bundle);
        AppCompatActivity r10 = (AppCompatActivity) this;
        AbstractC0925a $r5 = r10.getSupportActionBar();
        if ($r5 != null) {
            $r5.mo37602u(true);
        }
        Activity r92 = (Activity) this;
        String $r6 = r92.getString(C0001R.string.help);
        Log_OC.loadImage($r6, "getString(R.string.help)");
        setTitle($r6);
        initView();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean onCreateOptionsMenu(Menu menu) {
        AppCompatActivity r3 = (AppCompatActivity) this;
        MenuInflater $r2 = r3.getMenuInflater();
        $r2.inflate(C0001R.C0005menu.refresh_menu, menu);
        Activity r4 = (Activity) this;
        boolean $z0 = super/*android.app.Activity*/.onCreateOptionsMenu(menu);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Log_OC.getArray(menuItem, "item");
        int $i0 = menuItem.getItemId();
        if ($i0 == C0001R.C0003id.refresh) {
            HelpPresenter $r2 = getThisPresenter();
            $r2.getPhoneNumbers();
        }
        boolean $z0 = super.onOptionsItemSelected(menuItem);
        return $z0;
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

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.help.views.HelpView
    public void openFaqWebPage(String str) {
        Log_OC.getArray(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_URL);
        Uri $r3 = Uri.parse(str);
        C7513a.C7514a r6 = new C7513a.C7514a();
        Context r7 = (Context) this;
        int $i0 = C1335a.m36324d(r7, C0001R.color.colorPrimary);
        r6.m18523c($i0);
        Context r72 = (Context) this;
        int $i02 = C1335a.m36324d(r72, C0001R.color.colorPrimaryDark);
        r6.m18524b($i02);
        try {
            C7513a $r5 = r6.m18525a();
            Context r73 = (Context) this;
            $r5.m18526a(r73, $r3);
        } catch (ActivityNotFoundException e) {
            Context r74 = (Context) this;
            ContextExtKt.toast$default(r74, "You do not have any browser installed.", 0, 2, (Object) null);
        }
    }

    public final void setAdapter(HelpAdapter helpAdapter) {
        Log_OC.getArray(helpAdapter, "<set-?>");
        this.adapter = helpAdapter;
    }

    public final void setThisPresenter(HelpPresenter helpPresenter) {
        Log_OC.getArray(helpPresenter, "<set-?>");
        this.thisPresenter = helpPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.help.views.HelpView
    public void showLoading() {
        InterfaceC8209a $r1 = getBinding();
        ActivityHelpBinding $r2 = (ActivityHelpBinding) $r1;
        TextView $r3 = $r2.infoText;
        Log_OC.loadImage($r3, "binding.infoText");
        ViewExtKt.hide$default($r3, false, 1, null);
        InterfaceC8209a $r12 = getBinding();
        ActivityHelpBinding $r22 = (ActivityHelpBinding) $r12;
        View $r4 = $r22.helpRecyclerview;
        Log_OC.loadImage($r4, "binding.helpRecyclerview");
        View r6 = $r4;
        ViewExtKt.hide$default(r6, false, 1, null);
        InterfaceC8209a $r13 = getBinding();
        ActivityHelpBinding $r23 = (ActivityHelpBinding) $r13;
        ProgressBar $r5 = $r23.progressBar;
        Log_OC.loadImage($r5, "binding.progressBar");
        ViewExtKt.show($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.help.views.HelpView
    public void showMessage(String str) {
        Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
        InterfaceC8209a $r2 = getBinding();
        ActivityHelpBinding $r3 = (ActivityHelpBinding) $r2;
        TextView $r4 = $r3.infoText;
        Log_OC.loadImage($r4, "binding.infoText");
        ViewExtKt.show($r4);
        InterfaceC8209a $r22 = getBinding();
        ActivityHelpBinding $r32 = (ActivityHelpBinding) $r22;
        $r32.infoText.setText(str);
        InterfaceC8209a $r23 = getBinding();
        ActivityHelpBinding $r33 = (ActivityHelpBinding) $r23;
        ProgressBar $r5 = $r33.progressBar;
        Log_OC.loadImage($r5, "binding.progressBar");
        ViewExtKt.hide$default($r5, false, 1, null);
        InterfaceC8209a $r24 = getBinding();
        ActivityHelpBinding $r34 = (ActivityHelpBinding) $r24;
        View $r6 = $r34.helpRecyclerview;
        Log_OC.loadImage($r6, "binding.helpRecyclerview");
        View r7 = $r6;
        ViewExtKt.hide$default(r7, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.help.views.HelpView
    public void showPhoneNumbers(List list) {
        Log_OC.getArray(list, "phoneList");
        HelpAdapter $r2 = getAdapter();
        $r2.setList(list);
        InterfaceC8209a $r3 = getBinding();
        ActivityHelpBinding $r4 = (ActivityHelpBinding) $r3;
        ViewGroup $r5 = $r4.helpRecyclerview;
        ViewGroup r6 = $r5;
        r6.invalidate();
    }
}
