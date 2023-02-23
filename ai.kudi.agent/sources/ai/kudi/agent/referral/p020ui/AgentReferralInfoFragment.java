package ai.kudi.agent.referral.p020ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.databinding.FragmentAgentReferralInfoBinding;
import ai.kudi.agent.home.HomeActivity;
import ai.kudi.agent.referral.presenters.AgentReferralInfoPresenter;
import ai.kudi.agent.referral.views.AgentReferralInfoView;
import ai.kudi.agent.referral.xmpp.components.ReferralSubComponent;
import ai.kudi.agent.users.domain.package_1.User;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.AbstractC9412c;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
/* compiled from: AgentReferralInfoFragment.kt */
@Metadata(m10422d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001,B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001dH\u0096\u0001J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0016J$\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u001a\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u001b2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\t\u0010*\u001a\u00020\u0005H\u0096\u0001J\b\u0010+\u001a\u00020\u0017H\u0002R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006-"}, m10421d2 = {"Lai/kudi/agent/referral/ui/AgentReferralInfoFragment;", "Lcom/hannesdorfmann/mosby3/mvp/MvpFragment;", "Lai/kudi/agent/referral/views/AgentReferralInfoView;", "Lai/kudi/agent/referral/presenters/AgentReferralInfoPresenter;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/FragmentAgentReferralInfoBinding;", "()V", "agentReferralInfoPresenter", "getAgentReferralInfoPresenter", "()Lai/kudi/agent/referral/presenters/AgentReferralInfoPresenter;", "setAgentReferralInfoPresenter", "(Lai/kudi/agent/referral/presenters/AgentReferralInfoPresenter;)V", "binding", "getBinding", "()Lai/kudi/agent/databinding/FragmentAgentReferralInfoBinding;", "type", "", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "createPresenter", "displayInfoToAgent", "", "user", "Lai/kudi/agent/users/domain/dto/User;", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "requireBinding", "showView", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.referral.ui.AgentReferralInfoFragment */
/* loaded from: classes.dex */
public final class AgentReferralInfoFragment extends AbstractC9412c<AgentReferralInfoView, AgentReferralInfoPresenter> implements AgentReferralInfoView, BaseViewBinder<FragmentAgentReferralInfoBinding> {
    public static final Companion Companion;
    public static final String NEW_FEATURE = "IS_NEW_FEATURE";
    public static final String REFERRAL_MODULE_PREFS = "REFERRAL_MODULE_PREFS";
    private final /* synthetic */ BaseViewBinderImpl<FragmentAgentReferralInfoBinding> $$delegate_0;
    public AgentReferralInfoPresenter agentReferralInfoPresenter;
    public String type;

    /* compiled from: AgentReferralInfoFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/referral/ui/AgentReferralInfoFragment$Companion;", "", "()V", "NEW_FEATURE", "", AgentReferralInfoFragment.REFERRAL_MODULE_PREFS, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.referral.ui.AgentReferralInfoFragment$Companion */
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
    public AgentReferralInfoFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m40298onViewCreated$lambda0(AgentReferralInfoFragment agentReferralInfoFragment, View view) {
        Log_OC.getArray(agentReferralInfoFragment, "this$0");
        AgentReferralInfoPresenter $r2 = agentReferralInfoFragment.getAgentReferralInfoPresenter();
        String $r3 = agentReferralInfoFragment.getType();
        $r2.navigateToAgentReferredList($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showView() {
        String $r3;
        FragmentAgentReferralInfoBinding $r1 = requireBinding();
        TextView $r2 = $r1.referrralInfoTextView;
        String $r32 = getType();
        boolean $z0 = Log_OC.append($r32, "AGENT");
        if ($z0) {
            AgentReferralInfoFragment r4 = this;
            $r3 = r4.getString(C0001R.string.agent_referral_info);
        } else {
            AgentReferralInfoFragment r42 = this;
            $r3 = r42.getString(C0001R.string.customer_referral_info);
        }
        $r2.setText($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public AgentReferralInfoPresenter createPresenter() {
        AgentReferralInfoPresenter $r1 = getAgentReferralInfoPresenter();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public /* bridge */ /* synthetic */ InterfaceC9413d createPresenter() {
        InterfaceC9413d $r1 = createPresenter();
        InterfaceC9413d r2 = $r1;
        return r2;
    }

    @Override // ai.kudi.agent.referral.views.AgentReferralInfoView
    public void displayInfoToAgent(User user) {
        Log_OC.getArray(user, "user");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AgentReferralInfoPresenter getAgentReferralInfoPresenter() {
        AgentReferralInfoPresenter $r1 = this.agentReferralInfoPresenter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("agentReferralInfoPresenter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentAgentReferralInfoBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentAgentReferralInfoBinding $r3 = (FragmentAgentReferralInfoBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentAgentReferralInfoBinding $r1 = getBinding();
        return $r1;
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
    public View initBinding(FragmentAgentReferralInfoBinding fragmentAgentReferralInfoBinding, Fragment fragment) {
        Log_OC.getArray(fragmentAgentReferralInfoBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentAgentReferralInfoBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentAgentReferralInfoBinding $r4 = (FragmentAgentReferralInfoBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        AgentReferralInfoFragment r7 = this;
        super.onAttach(context);
        AgentReferralInfoFragment r72 = this;
        FragmentActivity $r2 = r72.getActivity();
        if ($r2 == null) {
            NullPointerException r6 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.referral.ui.AgentReferralActivity");
            throw r6;
        }
        AgentReferralActivity $r3 = (AgentReferralActivity) $r2;
        ReferralSubComponent $r4 = $r3.getReferralSubComponent();
        $r4.inject(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentAgentReferralInfoBinding $r4 = FragmentAgentReferralInfoBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        AgentReferralInfoFragment r6 = this;
        View $r5 = initBinding($r4, (Fragment) r6);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        AgentReferralInfoFragment r13 = this;
        Context $r3 = r13.requireContext();
        SharedPreferences $r4 = $r3.getSharedPreferences(REFERRAL_MODULE_PREFS, 0);
        SharedPreferences.Editor $r5 = $r4.edit();
        $r5.putBoolean("IS_NEW_FEATURE", false).apply();
        AgentReferralInfoFragment r132 = this;
        Bundle $r2 = r132.requireArguments();
        String $r6 = $r2.getString(HomeActivity.CUSTOMER_TYPE);
        String $r7 = $r6;
        if ($r6 == null) {
            $r7 = "AGENT";
        }
        setType($r7);
        FragmentAgentReferralInfoBinding $r8 = requireBinding();
        ViewGroup $r9 = $r8.startHereButton;
        ViewGroup r14 = $r9;
        r14.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.referral.ui.AboutFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AgentReferralInfoFragment $r22 = AgentReferralInfoFragment.this;
                AgentReferralInfoFragment.m40298onViewCreated$lambda0($r22, view2);
            }
        });
        AgentReferralInfoPresenter $r11 = getAgentReferralInfoPresenter();
        $r11.displayUserInfo();
        showView();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentAgentReferralInfoBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentAgentReferralInfoBinding $r3 = (FragmentAgentReferralInfoBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentAgentReferralInfoBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setAgentReferralInfoPresenter(AgentReferralInfoPresenter agentReferralInfoPresenter) {
        Log_OC.getArray(agentReferralInfoPresenter, "<set-?>");
        this.agentReferralInfoPresenter = agentReferralInfoPresenter;
    }

    public final void setType(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.type = str;
    }
}
