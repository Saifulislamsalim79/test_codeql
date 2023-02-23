package ai.kudi.agent.referral.p020ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.databinding.ReferredAgentsListBinding;
import ai.kudi.agent.home.HomeActivity;
import ai.kudi.agent.referral.adapter.AgentReferralAdapter;
import ai.kudi.agent.referral.presenters.AgentReferralListPresenter;
import ai.kudi.agent.referral.views.AgentReferralListView;
import ai.kudi.agent.referral.xmpp.components.ReferralSubComponent;
import ai.kudi.dip.library.p043h.DialogC0809i;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.C1335a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.C1723k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.AbstractC9412c;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
/* compiled from: AgentReferredListFragment.kt */
@Metadata(m10422d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 72\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00050\u0004:\u00017B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001dH\u0096\u0001J\b\u0010\u001e\u001a\u00020\u0018H\u0002J\u0010\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!H\u0016J\u0012\u0010\"\u001a\u00020\u00182\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J$\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u001a\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u001b2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\t\u0010,\u001a\u00020\u0005H\u0096\u0001J\u0016\u0010-\u001a\u00020\u00182\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/H\u0016J\b\u00101\u001a\u00020\u0018H\u0016J\u0012\u00102\u001a\u00020\u00182\b\u00103\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u00104\u001a\u00020\u00182\u0006\u00103\u001a\u00020\u0012H\u0016J\b\u00105\u001a\u00020\u0018H\u0016J\b\u00106\u001a\u00020\u0018H\u0016R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000¨\u00068"}, m10421d2 = {"Lai/kudi/agent/referral/ui/AgentReferredListFragment;", "Lcom/hannesdorfmann/mosby3/mvp/MvpFragment;", "Lai/kudi/agent/referral/views/AgentReferralListView;", "Lai/kudi/agent/referral/presenters/AgentReferralListPresenter;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/ReferredAgentsListBinding;", "()V", "agentListPresenter", "getAgentListPresenter", "()Lai/kudi/agent/referral/presenters/AgentReferralListPresenter;", "setAgentListPresenter", "(Lai/kudi/agent/referral/presenters/AgentReferralListPresenter;)V", "agentReferralAdapter", "Lai/kudi/agent/referral/adapter/AgentReferralAdapter;", "binding", "getBinding", "()Lai/kudi/agent/databinding/ReferredAgentsListBinding;", "lastSelectedStatus", "", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "type", "createPresenter", "hideLoading", "", "hideNextLoading", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "initBottomSheet", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "requireBinding", "showAgentReferral", AttributeType.LIST, "", "Lai/kudi/agent/referral/AgentReferralModel;", "showEmptyReferralMessage", "showError", MetricTracker.Object.MESSAGE, "showInfoSuccessMessage", "showLoading", "showNextLoading", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.referral.ui.AgentReferredListFragment */
/* loaded from: classes.dex */
public final class AgentReferredListFragment extends AbstractC9412c<AgentReferralListView, AgentReferralListPresenter> implements AgentReferralListView, BaseViewBinder<ReferredAgentsListBinding> {
    public static final Companion Companion;
    private final /* synthetic */ BaseViewBinderImpl<ReferredAgentsListBinding> $$delegate_0;
    public AgentReferralListPresenter agentListPresenter;
    private AgentReferralAdapter agentReferralAdapter;
    private String lastSelectedStatus;
    private LinearLayoutManager layoutManager;
    private String type;

    /* compiled from: AgentReferredListFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/referral/ui/AgentReferredListFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/referral/ui/AgentReferredListFragment;", "customerType", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.referral.ui.AgentReferredListFragment$Companion */
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
        public final AgentReferredListFragment newInstance(String str) {
            Log_OC.getArray(str, "customerType");
            AgentReferredListFragment r5 = new AgentReferredListFragment();
            Bundle r6 = new Bundle();
            r6.putString(HomeActivity.CUSTOMER_TYPE, str);
            C13666w c13666w = C13666w.f30112a;
            AgentReferredListFragment r7 = r5;
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
    public AgentReferredListFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
        this.lastSelectedStatus = "";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void initBottomSheet() {
        AgentReferredListFragment r6 = this;
        FragmentActivity $r2 = r6.requireActivity();
        Log_OC.loadImage($r2, "requireActivity()");
        AgentReferredListFragment$initBottomSheet$1 r4 = new AgentReferredListFragment$initBottomSheet$1(this);
        Dialog r5 = new DialogC0809i($r2, r4);
        Dialog r7 = r5;
        r7.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-2$lambda-1$lambda-0  reason: not valid java name */
    public static final void m40302onViewCreated$lambda2$lambda1$lambda0(AgentReferredListFragment agentReferredListFragment, View view) {
        Log_OC.getArray(agentReferredListFragment, "this$0");
        agentReferredListFragment.initBottomSheet();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public AgentReferralListPresenter createPresenter() {
        AgentReferralListPresenter $r1 = getAgentListPresenter();
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
    public final AgentReferralListPresenter getAgentListPresenter() {
        AgentReferralListPresenter $r1 = this.agentListPresenter;
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
    public ReferredAgentsListBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        ReferredAgentsListBinding $r3 = (ReferredAgentsListBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        ReferredAgentsListBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.referral.views.AgentReferralListView
    public void hideLoading() {
        ReferredAgentsListBinding $r1 = requireBinding();
        ProgressBar $r2 = $r1.referralProgressBar;
        Log_OC.loadImage($r2, "requireBinding().referralProgressBar");
        ViewExtKt.hide$default($r2, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.referral.views.AgentReferralListView
    public void hideNextLoading() {
        ReferredAgentsListBinding $r1 = requireBinding();
        ProgressBar $r2 = $r1.bottomReferralProgressBar;
        Log_OC.loadImage($r2, "requireBinding().bottomReferralProgressBar");
        ViewExtKt.hide$default($r2, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(ReferredAgentsListBinding referredAgentsListBinding, Fragment fragment) {
        Log_OC.getArray(referredAgentsListBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(referredAgentsListBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        ReferredAgentsListBinding $r4 = (ReferredAgentsListBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        AgentReferredListFragment r7 = this;
        super.onAttach(context);
        AgentReferredListFragment r72 = this;
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
        AgentReferredListFragment r2 = this;
        r2.setHasOptionsMenu(true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        AgentReferredListFragment r8 = this;
        Bundle $r3 = r8.requireArguments();
        String $r4 = $r3.getString(HomeActivity.CUSTOMER_TYPE);
        String $r5 = $r4;
        if ($r4 == null) {
            $r5 = "AGENT";
        }
        this.type = $r5;
        ReferredAgentsListBinding $r6 = ReferredAgentsListBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r6, "inflate(inflater, container, false)");
        AgentReferredListFragment r82 = this;
        View $r7 = initBinding($r6, (Fragment) r82);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String $r4;
        String $r5;
        String $r42;
        String $r52;
        String $r43;
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        String $r44 = this.type;
        if ($r44 == null) {
            Log_OC.LogError("type");
            NullPointerException r21 = new NullPointerException("Null throw statement replaced by Soot");
            throw r21;
        }
        boolean $z0 = Log_OC.append($r44, "AGENT");
        if ($z0) {
            AgentReferredListFragment r28 = this;
            $r4 = r28.getString(C0001R.string.all_agents);
            $r5 = "getString(R.string.all_agents)";
        } else {
            AgentReferredListFragment r282 = this;
            $r4 = r282.getString(C0001R.string.all_customers);
            $r5 = "getString(R.string.all_customers)";
        }
        Log_OC.loadImage($r4, $r5);
        this.lastSelectedStatus = $r4;
        ReferredAgentsListBinding $r6 = requireBinding();
        String $r45 = this.type;
        if ($r45 == null) {
            Log_OC.LogError("type");
            NullPointerException r212 = new NullPointerException("Null throw statement replaced by Soot");
            throw r212;
        }
        boolean $z02 = Log_OC.append($r45, "AGENT");
        if ($z02) {
            AgentReferredListFragment r283 = this;
            $r42 = r283.getString(C0001R.string.agent_referred_title);
        } else {
            AgentReferredListFragment r284 = this;
            $r42 = r284.getString(C0001R.string.customer_referred_title);
        }
        Log_OC.loadImage($r42, "if (type == AGENT) getString(R.string.agent_referred_title)\n            else getString(R.string.customer_referred_title)");
        AgentReferredListFragment r285 = this;
        FragmentActivity $r7 = r285.requireActivity();
        $r7.setTitle($r42);
        AgentReferredListFragment r286 = this;
        LinearLayoutManager r22 = new LinearLayoutManager(r286.getContext());
        this.layoutManager = r22;
        AgentReferredListFragment r287 = this;
        Context $r9 = r287.requireContext();
        Log_OC.loadImage($r9, "requireContext()");
        AgentReferralAdapter r23 = new AgentReferralAdapter($r9);
        this.agentReferralAdapter = r23;
        if (r23 != null) {
            AgentReferredListFragment$onViewCreated$1$1 r24 = new AgentReferredListFragment$onViewCreated$1$1(this);
            r23.setListener(r24);
        }
        RecyclerView $r12 = $r6.referralRecyclerView;
        $r12.setLayoutManager(this.layoutManager);
        RecyclerView $r122 = $r6.referralRecyclerView;
        AgentReferralAdapter $r10 = this.agentReferralAdapter;
        $r122.setAdapter($r10);
        AgentReferredListFragment r288 = this;
        Context $r92 = r288.getContext();
        LinearLayoutManager $r8 = this.layoutManager;
        Log_OC.append($r8);
        int $i0 = $r8.m35389v2();
        C1723k r25 = new C1723k($r92, $i0);
        AgentReferredListFragment r289 = this;
        FragmentActivity $r72 = r289.requireActivity();
        Drawable $r14 = C1335a.m36322f($r72.getApplicationContext(), C0001R.C0002drawable.transactions_divider);
        Log_OC.append($r14);
        r25.m34703f($r14);
        $r6.referralRecyclerView.m35294h(r25);
        RecyclerView $r123 = $r6.referralRecyclerView;
        Log_OC.loadImage($r123, "referralRecyclerView");
        LinearLayoutManager $r82 = this.layoutManager;
        Log_OC.append($r82);
        AgentReferredListFragment$onViewCreated$1$2 r26 = new AgentReferredListFragment$onViewCreated$1$2(this);
        ViewExtKt.createInfiniteScrollListener($r123, 15, $r82, r26);
        TextView $r15 = $r6.emptyReferral;
        String $r53 = this.type;
        if ($r53 == null) {
            Log_OC.LogError("type");
            NullPointerException r213 = new NullPointerException("Null throw statement replaced by Soot");
            throw r213;
        }
        boolean $z03 = Log_OC.append($r53, "AGENT");
        if ($z03) {
            AgentReferredListFragment r2810 = this;
            $r52 = r2810.getString(C0001R.string.empty_referral_agent);
        } else {
            AgentReferredListFragment r2811 = this;
            $r52 = r2811.getString(C0001R.string.empty_referral_customer);
        }
        TextView $r16 = $r15;
        $r16.setText($r52);
        TextView $r162 = $r6.headerTitle;
        $r162.setText($r42);
        View $r17 = $r6.filterAction;
        String $r46 = this.type;
        if ($r46 == null) {
            Log_OC.LogError("type");
            NullPointerException r214 = new NullPointerException("Null throw statement replaced by Soot");
            throw r214;
        }
        boolean $z04 = Log_OC.append($r46, "USER");
        if ($z04) {
            Log_OC.loadImage($r17, "");
            View $r2 = $r17;
            ViewExtKt.hide$default($r2, false, 1, null);
        }
        String $r47 = this.type;
        if ($r47 == null) {
            Log_OC.LogError("type");
            NullPointerException r215 = new NullPointerException("Null throw statement replaced by Soot");
            throw r215;
        }
        boolean $z05 = Log_OC.append($r47, "AGENT");
        if ($z05) {
            AgentReferredListFragment r2812 = this;
            $r43 = r2812.getString(C0001R.string.all_agents);
        } else {
            AgentReferredListFragment r2813 = this;
            $r43 = r2813.getString(C0001R.string.all_customers);
        }
        TextView $r163 = (TextView) $r17;
        $r163.setText($r43);
        TextView $r164 = (TextView) $r17;
        $r164.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.referral.ui.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AgentReferredListFragment $r22 = AgentReferredListFragment.this;
                AgentReferredListFragment.m40302onViewCreated$lambda2$lambda1$lambda0($r22, view2);
            }
        });
        InterfaceC9413d $r19 = this.presenter;
        Log_OC.loadImage($r19, "presenter");
        AgentReferralListPresenter $r20 = (AgentReferralListPresenter) $r19;
        AgentReferralListPresenter.start$default($r20, null, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public ReferredAgentsListBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        ReferredAgentsListBinding $r3 = (ReferredAgentsListBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        ReferredAgentsListBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setAgentListPresenter(AgentReferralListPresenter agentReferralListPresenter) {
        Log_OC.getArray(agentReferralListPresenter, "<set-?>");
        this.agentListPresenter = agentReferralListPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.referral.views.AgentReferralListView
    public void showAgentReferral(List list) {
        Log_OC.getArray(list, AttributeType.LIST);
        ReferredAgentsListBinding $r1 = requireBinding();
        View $r3 = $r1.emptyReferral;
        Log_OC.loadImage($r3, "emptyReferral");
        View r6 = $r3;
        ViewExtKt.hide$default(r6, false, 1, null);
        View $r4 = $r1.referralRecyclerView;
        Log_OC.loadImage($r4, "referralRecyclerView");
        View r62 = $r4;
        ViewExtKt.show(r62);
        AgentReferralAdapter $r5 = this.agentReferralAdapter;
        if ($r5 != null) {
            $r5.setAgentReferral(list);
        }
        AgentReferralAdapter $r52 = this.agentReferralAdapter;
        if ($r52 == null) {
            return;
        }
        $r52.notifyDataSetChanged();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.referral.views.AgentReferralListView
    public void showEmptyReferralMessage() {
        ReferredAgentsListBinding $r1 = requireBinding();
        View $r2 = $r1.referralRecyclerView;
        Log_OC.loadImage($r2, "referralRecyclerView");
        View r4 = $r2;
        ViewExtKt.hide$default(r4, false, 1, null);
        View $r3 = $r1.emptyReferral;
        Log_OC.loadImage($r3, "emptyReferral");
        View r42 = $r3;
        ViewExtKt.show(r42);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.referral.views.AgentReferralListView
    public void showError(String str) {
        AgentReferredListFragment r3 = this;
        FragmentActivity $r2 = r3.getActivity();
        if ($r2 == null) {
            return;
        }
        ContextExtKt.toast$default($r2, str, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.referral.views.AgentReferralListView
    public void showInfoSuccessMessage(String str) {
        Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
        AgentReferredListFragment r3 = this;
        FragmentActivity $r2 = r3.getActivity();
        if ($r2 == null) {
            return;
        }
        ContextExtKt.toast$default($r2, str, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.referral.views.AgentReferralListView
    public void showLoading() {
        ReferredAgentsListBinding $r1 = requireBinding();
        ProgressBar $r2 = $r1.referralProgressBar;
        Log_OC.loadImage($r2, "requireBinding().referralProgressBar");
        ViewExtKt.show($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.referral.views.AgentReferralListView
    public void showNextLoading() {
        ReferredAgentsListBinding $r1 = requireBinding();
        ProgressBar $r2 = $r1.bottomReferralProgressBar;
        Log_OC.loadImage($r2, "requireBinding().bottomReferralProgressBar");
        ViewExtKt.show($r2);
    }
}
