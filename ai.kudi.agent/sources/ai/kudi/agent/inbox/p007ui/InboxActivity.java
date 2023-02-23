package ai.kudi.agent.inbox.p007ui;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.mvp.MvpActivity;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.databinding.ActivityInboxBinding;
import ai.kudi.agent.inbox.game.components.InboxSubComponent;
import ai.kudi.agent.inbox.navigators.InboxNavigator;
import ai.kudi.agent.inbox.p007ui.InboxIssueListFragment;
import ai.kudi.agent.inbox.presenters.InboxContainerPresenter;
import ai.kudi.agent.inbox.views.InboxContainerView;
import ai.kudi.agent.issues.data.model.Issue;
import ai.kudi.agent.issues.p008ui.DisputeIssueFragment;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
/* compiled from: InboxActivity.kt */
@Metadata(m10422d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 $2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0002:\u0001$B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0017H\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010#\u001a\u00020\u001cH\u0016R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006%"}, m10421d2 = {"Lai/kudi/agent/inbox/ui/InboxActivity;", "Lai/kudi/agent/core/mvp/MvpActivity;", "Lai/kudi/agent/inbox/views/InboxContainerView;", "Lai/kudi/agent/inbox/presenters/InboxContainerPresenter;", "Lai/kudi/agent/databinding/ActivityInboxBinding;", "Lai/kudi/agent/inbox/navigators/InboxNavigator;", "()V", "activityBinding", "getActivityBinding", "()Lai/kudi/agent/databinding/ActivityInboxBinding;", "inboxSubComponent", "Lai/kudi/agent/inbox/di/components/InboxSubComponent;", "getInboxSubComponent", "()Lai/kudi/agent/inbox/di/components/InboxSubComponent;", "setInboxSubComponent", "(Lai/kudi/agent/inbox/di/components/InboxSubComponent;)V", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/inbox/presenters/InboxContainerPresenter;", "setThisPresenter", "(Lai/kudi/agent/inbox/presenters/InboxContainerPresenter;)V", "createPresenter", "getDisputeFragment", "Landroidx/fragment/app/Fragment;", "ticket", "Lai/kudi/agent/issues/data/model/Issue$Ticket;", "getInboxListFragment", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSupportNavigateUp", "", "toDisputeIssueView", "toInboxView", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.inbox.ui.InboxActivity */
/* loaded from: classes.dex */
public final class InboxActivity extends MvpActivity<InboxContainerView, InboxContainerPresenter, ActivityInboxBinding> implements InboxNavigator, InboxContainerView {
    public static final Companion Companion;
    public static final String LOGGED_TICKET = "LOGGED_TICKET";
    public InboxSubComponent inboxSubComponent;
    public InboxContainerPresenter thisPresenter;

    /* compiled from: InboxActivity.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/inbox/ui/InboxActivity$Companion;", "", "()V", InboxActivity.LOGGED_TICKET, "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.inbox.ui.InboxActivity$Companion */
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
    private final Fragment getDisputeFragment(Issue.Ticket ticket) {
        FragmentActivity r8 = (FragmentActivity) this;
        FragmentManager $r2 = r8.getSupportFragmentManager();
        String $r4 = DisputeIssueFragment.class.getCanonicalName();
        Fragment $r5 = $r2.m35938g0($r4);
        if ($r5 == null) {
            DisputeIssueFragment.Companion $r6 = DisputeIssueFragment.Companion;
            Fragment $r7 = $r6.newInstance(ticket, true, true);
            return $r7;
        }
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Fragment getInboxListFragment() {
        FragmentActivity r7 = (FragmentActivity) this;
        FragmentManager $r1 = r7.getSupportFragmentManager();
        String $r3 = InboxIssueListFragment.class.getCanonicalName();
        Fragment $r4 = $r1.m35938g0($r3);
        if ($r4 == null) {
            InboxIssueListFragment.Companion $r5 = InboxIssueListFragment.Companion;
            Fragment $r6 = $r5.newInstance();
            return $r6;
        }
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public InboxContainerPresenter createPresenter() {
        InboxContainerPresenter $r1 = getThisPresenter();
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
    public ActivityInboxBinding getActivityBinding() {
        Activity r3 = (Activity) this;
        LayoutInflater $r1 = r3.getLayoutInflater();
        ActivityInboxBinding $r2 = ActivityInboxBinding.inflate($r1);
        Log_OC.loadImage($r2, "inflate(layoutInflater)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public /* bridge */ /* synthetic */ InterfaceC8209a getActivityBinding() {
        ActivityInboxBinding $r1 = getActivityBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InboxSubComponent getInboxSubComponent() {
        InboxSubComponent $r1 = this.inboxSubComponent;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("inboxSubComponent");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InboxContainerPresenter getThisPresenter() {
        InboxContainerPresenter $r1 = this.thisPresenter;
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
        Activity r18 = (Activity) this;
        Application $r3 = r18.getApplication();
        if ($r3 == null) {
            NullPointerException r17 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw r17;
        }
        ApplicationComponent $r5 = ((BaseApplication) $r3).getApplicationComponent();
        InboxSubComponent.Factory $r6 = $r5.inboxSubComponent();
        InboxSubComponent $r7 = $r6.create(this);
        setInboxSubComponent($r7);
        InboxSubComponent $r72 = getInboxSubComponent();
        $r72.inject(this);
        super.onCreate(bundle);
        disableLogoutTimer();
        AbstractC0925a $r8 = ((AppCompatActivity) this).getSupportActionBar();
        if ($r8 != null) {
            $r8.mo37602u(true);
        }
        Activity r182 = (Activity) this;
        String $r9 = r182.getString(C0001R.string.inbox_title);
        Log_OC.loadImage($r9, "getString(R.string.inbox_title)");
        setTitle($r9);
        Activity r183 = (Activity) this;
        Intent $r10 = r183.getIntent();
        boolean $z0 = $r10.hasExtra(LOGGED_TICKET);
        if (!$z0) {
            if (bundle != null) {
                Activity r184 = (Activity) this;
                r184.finish();
                return;
            }
            Fragment $r13 = getInboxListFragment();
            AppCompatActivity r19 = (AppCompatActivity) this;
            AppCompatActivityExtKt.startFragment$default(r19, $r13, C0001R.C0003id.inboxContainerFrameLayout, false, false, false, 12, null);
            return;
        }
        Activity r185 = (Activity) this;
        Intent $r102 = r185.getIntent();
        String $r92 = $r102.getStringExtra(LOGGED_TICKET);
        String $r11 = $r92;
        if ($r92 == null) {
            $r11 = "";
        }
        HashMap r15 = new HashMap();
        Issue.Ticket r16 = new Issue.Ticket($r11, null, null, null, null, null, null, r15, null, 382, null);
        Fragment $r132 = getDisputeFragment(r16);
        AppCompatActivity r192 = (AppCompatActivity) this;
        AppCompatActivityExtKt.startFragment$default(r192, $r132, C0001R.C0003id.inboxContainerFrameLayout, false, false, false, 12, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean onSupportNavigateUp() {
        InboxActivity$onSupportNavigateUp$1 $r1 = InboxActivity$onSupportNavigateUp$1.INSTANCE;
        AppCompatActivity r2 = (AppCompatActivity) this;
        AppCompatActivityExtKt.add(r2, $r1);
        AppCompatActivity r22 = (AppCompatActivity) this;
        boolean $z0 = super/*androidx.appcompat.app.AppCompatActivity*/.onSupportNavigateUp();
        return $z0;
    }

    public final void setInboxSubComponent(InboxSubComponent inboxSubComponent) {
        Log_OC.getArray(inboxSubComponent, "<set-?>");
        this.inboxSubComponent = inboxSubComponent;
    }

    public final void setThisPresenter(InboxContainerPresenter inboxContainerPresenter) {
        Log_OC.getArray(inboxContainerPresenter, "<set-?>");
        this.thisPresenter = inboxContainerPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.inbox.navigators.InboxNavigator
    public void toDisputeIssueView(Issue.Ticket ticket) {
        Log_OC.getArray(ticket, "ticket");
        DisputeIssueFragment.Companion $r2 = DisputeIssueFragment.Companion;
        DisputeIssueFragment $r3 = DisputeIssueFragment.Companion.newInstance$default($r2, ticket, true, false, 4, null);
        AppCompatActivityExtKt.startFragment$default((AppCompatActivity) this, $r3, C0001R.C0003id.inboxContainerFrameLayout, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.inbox.navigators.InboxNavigator
    public void toInboxView() {
        InboxIssueListFragment.Companion $r1 = InboxIssueListFragment.Companion;
        Fragment $r2 = $r1.newInstance();
        AppCompatActivity r3 = (AppCompatActivity) this;
        Fragment r4 = $r2;
        AppCompatActivityExtKt.startFragment$default(r3, r4, C0001R.C0003id.inboxContainerFrameLayout, true, false, false, 24, null);
    }
}
