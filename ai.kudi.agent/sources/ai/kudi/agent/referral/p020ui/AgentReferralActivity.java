package ai.kudi.agent.referral.p020ui;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.analytics.SmartLookAnalytics;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.mvp.MvpActivity;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.CustomDialog;
import ai.kudi.agent.databinding.ActivityAgentReferralBinding;
import ai.kudi.agent.home.HomeActivity;
import ai.kudi.agent.referral.navigators.ReferralNavigator;
import ai.kudi.agent.referral.p020ui.AgentReferralSummaryFragment;
import ai.kudi.agent.referral.p020ui.AgentReferredInvitationFragment;
import ai.kudi.agent.referral.p020ui.AgentReferredListFragment;
import ai.kudi.agent.referral.presenters.AgentReferralPresenter;
import ai.kudi.agent.referral.views.AgentReferralView;
import ai.kudi.agent.referral.xmpp.components.ReferralSubComponent;
import ai.kudi.agent.users.domain.package_1.User;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
/* compiled from: AgentReferralActivity.kt */
@Metadata(m10422d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010!\u001a\u00020\u0003H\u0016J\b\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cH\u0016J\u0012\u0010'\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0010\u0010*\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cH\u0016J\u0018\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u001cH\u0016J\b\u0010.\u001a\u00020%H\u0016J\u0012\u0010/\u001a\u00020%2\b\u00100\u001a\u0004\u0018\u000101H\u0014J\b\u00102\u001a\u000203H\u0016J(\u00104\u001a\u00020%2\u0006\u00105\u001a\u00020\u001c2\u0006\u00106\u001a\u00020\u001c2\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020%\u0018\u000108H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u00069"}, m10421d2 = {"Lai/kudi/agent/referral/ui/AgentReferralActivity;", "Lai/kudi/agent/core/mvp/MvpActivity;", "Lai/kudi/agent/referral/views/AgentReferralView;", "Lai/kudi/agent/referral/presenters/AgentReferralPresenter;", "Lai/kudi/agent/databinding/ActivityAgentReferralBinding;", "Lai/kudi/agent/referral/navigators/ReferralNavigator;", "()V", "activityBinding", "getActivityBinding", "()Lai/kudi/agent/databinding/ActivityAgentReferralBinding;", "agentReferralPresenter", "getAgentReferralPresenter", "()Lai/kudi/agent/referral/presenters/AgentReferralPresenter;", "setAgentReferralPresenter", "(Lai/kudi/agent/referral/presenters/AgentReferralPresenter;)V", "referralSubComponent", "Lai/kudi/agent/referral/di/components/ReferralSubComponent;", "getReferralSubComponent", "()Lai/kudi/agent/referral/di/components/ReferralSubComponent;", "setReferralSubComponent", "(Lai/kudi/agent/referral/di/components/ReferralSubComponent;)V", "smartLookAnalytics", "Lai/kudi/agent/analytics/SmartLookAnalytics;", "getSmartLookAnalytics", "()Lai/kudi/agent/analytics/SmartLookAnalytics;", "setSmartLookAnalytics", "(Lai/kudi/agent/analytics/SmartLookAnalytics;)V", "type", "", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "createPresenter", "getInfoFragment", "Landroidx/fragment/app/Fragment;", "navigateToInviteAgent", "", "customerType", "navigateToReferralInfo", "user", "Lai/kudi/agent/users/domain/dto/User;", "navigateToReferredAgentList", "navigateToViewAgentSummary", "phoneNumber", "referralId", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNavigateUp", "", "showAlertDialog", MetricTracker.Object.MESSAGE, "buttonText", "buttonAction", "Lkotlin/Function0;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.referral.ui.AgentReferralActivity */
/* loaded from: classes.dex */
public final class AgentReferralActivity extends MvpActivity<AgentReferralView, AgentReferralPresenter, ActivityAgentReferralBinding> implements ReferralNavigator {
    public AgentReferralPresenter agentReferralPresenter;
    public ReferralSubComponent referralSubComponent;
    public SmartLookAnalytics smartLookAnalytics;
    public String type;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Fragment getInfoFragment() {
        FragmentActivity r10 = (FragmentActivity) this;
        FragmentManager $r1 = r10.getSupportFragmentManager();
        String $r3 = AgentReferralInfoFragment.class.getCanonicalName();
        Object $r4 = $r1.m35938g0($r3);
        Object $r5 = $r4;
        if ($r4 == null) {
            $r5 = r8;
            Object r8 = new AgentReferralInfoFragment();
        }
        Bundle r9 = new Bundle();
        String $r32 = getType();
        r9.putString(HomeActivity.CUSTOMER_TYPE, $r32);
        C13666w c13666w = C13666w.f30112a;
        ((Fragment) $r5).setArguments(r9);
        return (Fragment) $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public AgentReferralPresenter createPresenter() {
        AgentReferralPresenter $r1 = getAgentReferralPresenter();
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
    public ActivityAgentReferralBinding getActivityBinding() {
        Activity r3 = (Activity) this;
        LayoutInflater $r1 = r3.getLayoutInflater();
        ActivityAgentReferralBinding $r2 = ActivityAgentReferralBinding.inflate($r1);
        Log_OC.loadImage($r2, "inflate(layoutInflater)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public /* bridge */ /* synthetic */ InterfaceC8209a getActivityBinding() {
        ActivityAgentReferralBinding $r1 = getActivityBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AgentReferralPresenter getAgentReferralPresenter() {
        AgentReferralPresenter $r1 = this.agentReferralPresenter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("agentReferralPresenter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ReferralSubComponent getReferralSubComponent() {
        ReferralSubComponent $r1 = this.referralSubComponent;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("referralSubComponent");
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
    public final String getType() {
        String $r1 = this.type;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("type");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.referral.navigators.ReferralNavigator
    public void navigateToInviteAgent(String str) {
        Log_OC.getArray(str, "customerType");
        AgentReferredInvitationFragment.Companion $r3 = AgentReferredInvitationFragment.Companion;
        Fragment $r2 = $r3.newInstance(str);
        AppCompatActivity r4 = (AppCompatActivity) this;
        Fragment r5 = $r2;
        AppCompatActivityExtKt.startFragment$default(r4, r5, C0001R.C0003id.referralContainerFrameLayout, true, false, false, 24, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.referral.navigators.ReferralNavigator
    public void navigateToReferralInfo(User user) {
        Fragment r3 = new AgentReferralInfoFragment();
        AppCompatActivity r4 = (AppCompatActivity) this;
        Fragment r5 = r3;
        AppCompatActivityExtKt.startFragment$default(r4, r5, C0001R.C0003id.referralContainerFrameLayout, true, false, false, 24, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.referral.navigators.ReferralNavigator
    public void navigateToReferredAgentList(String str) {
        Log_OC.getArray(str, "customerType");
        AgentReferredListFragment.Companion $r3 = AgentReferredListFragment.Companion;
        Fragment $r2 = $r3.newInstance(str);
        AppCompatActivity r4 = (AppCompatActivity) this;
        Fragment r5 = $r2;
        AppCompatActivityExtKt.startFragment$default(r4, r5, C0001R.C0003id.referralContainerFrameLayout, true, false, false, 24, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.referral.navigators.ReferralNavigator
    public void navigateToViewAgentSummary(String str, String str2) {
        Log_OC.getArray(str, "phoneNumber");
        Log_OC.getArray(str2, "referralId");
        AgentReferralSummaryFragment.Companion $r4 = AgentReferralSummaryFragment.Companion;
        Fragment $r3 = $r4.newInstance(str, str2);
        AppCompatActivity r5 = (AppCompatActivity) this;
        Fragment r6 = $r3;
        AppCompatActivityExtKt.startFragment$default(r5, r6, C0001R.C0003id.referralContainerFrameLayout, true, false, false, 24, null);
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
        String $r9;
        Activity r15 = (Activity) this;
        Application $r2 = r15.getApplication();
        if ($r2 == null) {
            NullPointerException r14 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw r14;
        }
        BaseApplication $r3 = (BaseApplication) $r2;
        ApplicationComponent $r4 = $r3.getApplicationComponent();
        ReferralSubComponent.Factory $r5 = $r4.referralSubComponent();
        ReferralSubComponent $r6 = $r5.create(this);
        setReferralSubComponent($r6);
        ReferralSubComponent $r62 = getReferralSubComponent();
        $r62.inject(this);
        super.onCreate(bundle);
        AbstractC0925a $r7 = ((AppCompatActivity) this).getSupportActionBar();
        if ($r7 != null) {
            $r7.mo37602u(true);
        }
        AbstractC0925a $r72 = ((AppCompatActivity) this).getSupportActionBar();
        if ($r72 != null) {
            $r72.mo37597z(C0001R.C0002drawable.ic_arrow_backward);
        }
        Activity r152 = (Activity) this;
        Intent $r8 = r152.getIntent();
        String $r92 = $r8.getStringExtra(HomeActivity.CUSTOMER_TYPE);
        String $r10 = $r92;
        if ($r92 == null) {
            $r10 = "AGENT";
        }
        setType($r10);
        boolean $z0 = Log_OC.append(getType(), "AGENT");
        if ($z0) {
            Activity r153 = (Activity) this;
            $r9 = r153.getString(C0001R.string.agent_referral_title);
        } else {
            Activity r154 = (Activity) this;
            $r9 = r154.getString(C0001R.string.customer_referral_title);
        }
        Log_OC.loadImage($r9, "if (type == AGENT) getString(R.string.agent_referral_title)\n            else getString(R.string.customer_referral_title)");
        setTitle($r9);
        if (bundle == null) {
            Fragment $r11 = getInfoFragment();
            AppCompatActivity r16 = (AppCompatActivity) this;
            AppCompatActivityExtKt.startFragment$default(r16, $r11, C0001R.C0003id.referralContainerFrameLayout, true, false, false, 8, null);
        }
        SmartLookAnalytics $r12 = getSmartLookAnalytics();
        $r12.logReferAgent();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean onNavigateUp() {
        onBackPressed();
        Activity r1 = (Activity) this;
        boolean $z0 = super/*android.app.Activity*/.onNavigateUp();
        return $z0;
    }

    public final void setAgentReferralPresenter(AgentReferralPresenter agentReferralPresenter) {
        Log_OC.getArray(agentReferralPresenter, "<set-?>");
        this.agentReferralPresenter = agentReferralPresenter;
    }

    public final void setReferralSubComponent(ReferralSubComponent referralSubComponent) {
        Log_OC.getArray(referralSubComponent, "<set-?>");
        this.referralSubComponent = referralSubComponent;
    }

    public final void setSmartLookAnalytics(SmartLookAnalytics smartLookAnalytics) {
        Log_OC.getArray(smartLookAnalytics, "<set-?>");
        this.smartLookAnalytics = smartLookAnalytics;
    }

    public final void setType(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.type = str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.referral.navigators.ReferralNavigator
    public void showAlertDialog(String str, String str2, InterfaceC11756a interfaceC11756a) {
        Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
        Log_OC.getArray(str2, "buttonText");
        CustomDialog.Companion $r4 = CustomDialog.Companion;
        Context r5 = (Context) this;
        CustomDialog.Companion.show$default($r4, r5, str, str2, true, false, false, interfaceC11756a, 32, (Object) null);
    }
}
