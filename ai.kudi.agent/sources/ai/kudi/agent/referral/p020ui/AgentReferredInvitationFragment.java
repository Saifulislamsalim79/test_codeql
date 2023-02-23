package ai.kudi.agent.referral.p020ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.databinding.FragmentAgentReferredListBinding;
import ai.kudi.agent.databinding.WalletLoaderViewBinding;
import ai.kudi.agent.home.HomeActivity;
import ai.kudi.agent.referral.navigators.ReferralNavigator;
import ai.kudi.agent.referral.presenters.AgentReferralInvitePresenter;
import ai.kudi.agent.referral.views.AgentReferralInviteView;
import ai.kudi.agent.referral.xmpp.components.ReferralSubComponent;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.AbstractC9412c;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
/* compiled from: AgentReferredInvitationFragment.kt */
@Metadata(m10422d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 02\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00050\u0004:\u00010B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001cH\u0096\u0001J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0012\u0010 \u001a\u00020\u00172\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J$\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u001a\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u001a2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\t\u0010*\u001a\u00020\u0005H\u0096\u0001J\b\u0010+\u001a\u00020\u0017H\u0002J\u0012\u0010,\u001a\u00020\u00172\b\u0010-\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010.\u001a\u00020\u00172\b\u0010-\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010/\u001a\u00020\u00172\b\u0010-\u001a\u0004\u0018\u00010\u0010H\u0016R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u00061"}, m10421d2 = {"Lai/kudi/agent/referral/ui/AgentReferredInvitationFragment;", "Lcom/hannesdorfmann/mosby3/mvp/MvpFragment;", "Lai/kudi/agent/referral/views/AgentReferralInviteView;", "Lai/kudi/agent/referral/presenters/AgentReferralInvitePresenter;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/FragmentAgentReferredListBinding;", "()V", "agentListPresenter", "getAgentListPresenter", "()Lai/kudi/agent/referral/presenters/AgentReferralInvitePresenter;", "setAgentListPresenter", "(Lai/kudi/agent/referral/presenters/AgentReferralInvitePresenter;)V", "binding", "getBinding", "()Lai/kudi/agent/databinding/FragmentAgentReferredListBinding;", "type", "", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "createPresenter", "createReferralLoading", "", "hideReferralLoading", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "requireBinding", "resetFields", "showError", MetricTracker.Object.MESSAGE, "showMildErrorMessage", "showSuccessMessage", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.referral.ui.AgentReferredInvitationFragment */
/* loaded from: classes.dex */
public final class AgentReferredInvitationFragment extends AbstractC9412c<AgentReferralInviteView, AgentReferralInvitePresenter> implements AgentReferralInviteView, BaseViewBinder<FragmentAgentReferredListBinding> {
    public static final Companion Companion;
    private final /* synthetic */ BaseViewBinderImpl<FragmentAgentReferredListBinding> $$delegate_0;
    public AgentReferralInvitePresenter agentListPresenter;
    public String type;

    /* compiled from: AgentReferredInvitationFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/referral/ui/AgentReferredInvitationFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/referral/ui/AgentReferredInvitationFragment;", "customerType", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.referral.ui.AgentReferredInvitationFragment$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final AgentReferredInvitationFragment newInstance(String str) {
            Log_OC.getArray(str, "customerType");
            AgentReferredInvitationFragment r5 = new AgentReferredInvitationFragment();
            Bundle r6 = new Bundle();
            r6.putString(HomeActivity.CUSTOMER_TYPE, str);
            C13666w c13666w = C13666w.f30112a;
            AgentReferredInvitationFragment r7 = r5;
            r7.setArguments(r6);
            return r5;
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
    public AgentReferredInvitationFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-2$lambda-0  reason: not valid java name */
    public static final void m40299onViewCreated$lambda2$lambda0(AgentReferredInvitationFragment agentReferredInvitationFragment, FragmentAgentReferredListBinding fragmentAgentReferredListBinding, View view) {
        Log_OC.getArray(agentReferredInvitationFragment, "this$0");
        Log_OC.getArray(fragmentAgentReferredListBinding, "$this_apply");
        AgentReferralInvitePresenter $r3 = agentReferredInvitationFragment.getAgentListPresenter();
        KudiInputField $r4 = fragmentAgentReferredListBinding.phoneEditText;
        String $r5 = $r4.getText();
        KudiInputField $r42 = fragmentAgentReferredListBinding.firstNameEditText;
        String $r6 = $r42.getText();
        KudiInputField $r43 = fragmentAgentReferredListBinding.lastNameEditText;
        String $r7 = $r43.getText();
        $r3.createAgentReferral($r5, $r6, $r7);
        AgentReferredInvitationFragment r8 = agentReferredInvitationFragment;
        ContextExtKt.hideKeyboard(r8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-2$lambda-1  reason: not valid java name */
    public static final void m40300onViewCreated$lambda2$lambda1(AgentReferredInvitationFragment agentReferredInvitationFragment, View view) {
        Log_OC.getArray(agentReferredInvitationFragment, "this$0");
        InterfaceC9413d $r3 = agentReferredInvitationFragment.presenter;
        AgentReferralInvitePresenter $r4 = (AgentReferralInvitePresenter) $r3;
        String $r0 = agentReferredInvitationFragment.getType();
        $r4.openReferredAgentsList($r0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void resetFields() {
        FragmentAgentReferredListBinding $r1 = requireBinding();
        KudiInputField $r2 = $r1.phoneEditText;
        $r2.setText("");
        KudiInputField $r22 = $r1.firstNameEditText;
        $r22.setText("");
        KudiInputField $r23 = $r1.lastNameEditText;
        $r23.setText("");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public AgentReferralInvitePresenter createPresenter() {
        AgentReferralInvitePresenter $r1 = getAgentListPresenter();
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

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.referral.views.AgentReferralInviteView
    public void createReferralLoading() {
        FragmentAgentReferredListBinding $r1 = requireBinding();
        WalletLoaderViewBinding $r2 = $r1.createReferralProgressBar;
        View $r3 = $r2.getRoot();
        Log_OC.loadImage($r3, "createReferralProgressBar.root");
        View r5 = $r3;
        ViewExtKt.show(r5);
        View $r4 = $r1.referralButton;
        Log_OC.loadImage($r4, "referralButton");
        View r52 = $r4;
        ViewExtKt.hide(r52, true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AgentReferralInvitePresenter getAgentListPresenter() {
        AgentReferralInvitePresenter $r1 = this.agentListPresenter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("agentListPresenter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentAgentReferredListBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentAgentReferredListBinding $r3 = (FragmentAgentReferredListBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentAgentReferredListBinding $r1 = getBinding();
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
    @Override // ai.kudi.agent.referral.views.AgentReferralInviteView
    public void hideReferralLoading() {
        FragmentAgentReferredListBinding $r1 = requireBinding();
        WalletLoaderViewBinding $r2 = $r1.createReferralProgressBar;
        View $r3 = $r2.getRoot();
        Log_OC.loadImage($r3, "createReferralProgressBar.root");
        View r5 = $r3;
        ViewExtKt.hide$default(r5, false, 1, null);
        View $r4 = $r1.referralButton;
        Log_OC.loadImage($r4, "referralButton");
        View r52 = $r4;
        ViewExtKt.show(r52);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentAgentReferredListBinding fragmentAgentReferredListBinding, Fragment fragment) {
        Log_OC.getArray(fragmentAgentReferredListBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentAgentReferredListBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentAgentReferredListBinding $r4 = (FragmentAgentReferredListBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        AgentReferredInvitationFragment r7 = this;
        super.onAttach(context);
        AgentReferredInvitationFragment r72 = this;
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
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AgentReferredInvitationFragment r2 = this;
        r2.setHasOptionsMenu(true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentAgentReferredListBinding $r4 = FragmentAgentReferredListBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        AgentReferredInvitationFragment r6 = this;
        View $r5 = initBinding($r4, (Fragment) r6);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String $r3;
        String $r32;
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        AgentReferredInvitationFragment r13 = this;
        Bundle $r2 = r13.requireArguments();
        String $r33 = $r2.getString(HomeActivity.CUSTOMER_TYPE);
        String $r4 = $r33;
        if ($r33 == null) {
            $r4 = "AGENT";
        }
        setType($r4);
        boolean $z0 = Log_OC.append(getType(), "AGENT");
        if ($z0) {
            AgentReferredInvitationFragment r132 = this;
            $r3 = r132.getString(C0001R.string.agent_referral_title);
        } else {
            AgentReferredInvitationFragment r133 = this;
            $r3 = r133.getString(C0001R.string.customer_referral_title);
        }
        Log_OC.loadImage($r3, "if (type == AGENT) getString(R.string.agent_referral_title)\n        else getString(R.string.customer_referral_title)");
        AgentReferredInvitationFragment r134 = this;
        FragmentActivity $r5 = r134.requireActivity();
        $r5.setTitle($r3);
        final FragmentAgentReferredListBinding $r6 = requireBinding();
        KudiButton $r7 = $r6.referralButton;
        $r7.setText($r3);
        ViewGroup $r72 = $r6.referralButton;
        ViewGroup r14 = $r72;
        r14.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.referral.ui.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AgentReferredInvitationFragment $r22 = AgentReferredInvitationFragment.this;
                FragmentAgentReferredListBinding $r34 = $r6;
                AgentReferredInvitationFragment.m40299onViewCreated$lambda2$lambda0($r22, $r34, view2);
            }
        });
        TextView $r9 = $r6.openList;
        boolean $z02 = Log_OC.append(getType(), "AGENT");
        if ($z02) {
            AgentReferredInvitationFragment r135 = this;
            $r32 = r135.getString(C0001R.string.list_referred_agent);
        } else {
            AgentReferredInvitationFragment r136 = this;
            $r32 = r136.getString(C0001R.string.list_referred_customer);
        }
        $r9.setText($r32);
        TextView $r92 = $r6.openList;
        $r92.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.referral.ui.c
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AgentReferredInvitationFragment $r22 = AgentReferredInvitationFragment.this;
                AgentReferredInvitationFragment.m40300onViewCreated$lambda2$lambda1($r22, view2);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentAgentReferredListBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentAgentReferredListBinding $r3 = (FragmentAgentReferredListBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentAgentReferredListBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setAgentListPresenter(AgentReferralInvitePresenter agentReferralInvitePresenter) {
        Log_OC.getArray(agentReferralInvitePresenter, "<set-?>");
        this.agentListPresenter = agentReferralInvitePresenter;
    }

    public final void setType(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.type = str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.referral.views.AgentReferralInviteView
    public void showError(String str) {
        AgentReferredInvitationFragment r3 = this;
        FragmentActivity $r2 = r3.getActivity();
        if ($r2 == null) {
            return;
        }
        ContextExtKt.toast$default($r2, str, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.referral.views.AgentReferralInviteView
    public void showMildErrorMessage(String str) {
        AgentReferredInvitationFragment r6 = this;
        FragmentActivity $r1 = r6.getActivity();
        if ($r1 == null) {
            NullPointerException r5 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.referral.navigators.ReferralNavigator");
            throw r5;
        }
        ReferralNavigator $r3 = (ReferralNavigator) $r1;
        Log_OC.append(str);
        ReferralNavigator.DefaultImpls.showAlertDialog$default($r3, str, "Continue", null, 4, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.referral.views.AgentReferralInviteView
    public void showSuccessMessage(String str) {
        resetFields();
        InterfaceC9413d $r2 = this.presenter;
        AgentReferralInvitePresenter $r3 = (AgentReferralInvitePresenter) $r2;
        Log_OC.append(str);
        $r3.showAlertDialog(str, "Close");
    }
}
