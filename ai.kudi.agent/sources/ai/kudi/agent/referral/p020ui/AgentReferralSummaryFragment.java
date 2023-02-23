package ai.kudi.agent.referral.p020ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.databinding.FragmentAgentReferralSummaryBinding;
import ai.kudi.agent.databinding.WalletLoaderViewBinding;
import ai.kudi.agent.referral.AgentReferralStatus;
import ai.kudi.agent.referral.AgentReferralSummary;
import ai.kudi.agent.referral.presenters.AgentReferralSummaryPresenter;
import ai.kudi.agent.referral.views.ReferralSummaryView;
import ai.kudi.agent.referral.xmpp.components.ReferralSubComponent;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Locale;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13252b;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.AbstractC9412c;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
/* compiled from: AgentReferralSummaryFragment.kt */
@Metadata(m10422d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 92\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00050\u0004:\u00019B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\b\u0010\u0017\u001a\u00020\fH\u0016J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001bH\u0096\u0001J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0018\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J&\u0010'\u001a\u0004\u0018\u00010\u00192\u0006\u0010%\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0016J\u001a\u0010/\u001a\u00020\f2\u0006\u00100\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\t\u00101\u001a\u00020\u0005H\u0096\u0001J\u0010\u00102\u001a\u00020\f2\u0006\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u00020\fH\u0016J\u0010\u00106\u001a\u00020\f2\u0006\u00107\u001a\u000208H\u0017R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006:"}, m10421d2 = {"Lai/kudi/agent/referral/ui/AgentReferralSummaryFragment;", "Lcom/hannesdorfmann/mosby3/mvp/MvpFragment;", "Lai/kudi/agent/referral/views/ReferralSummaryView;", "Lai/kudi/agent/referral/presenters/AgentReferralSummaryPresenter;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/FragmentAgentReferralSummaryBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/databinding/FragmentAgentReferralSummaryBinding;", "fetchSummary", "Lkotlin/Function0;", "", "getFetchSummary", "()Lkotlin/jvm/functions/Function0;", "setFetchSummary", "(Lkotlin/jvm/functions/Function0;)V", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/referral/presenters/AgentReferralSummaryPresenter;", "setThisPresenter", "(Lai/kudi/agent/referral/presenters/AgentReferralSummaryPresenter;)V", "createPresenter", "hideLoading", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onViewCreated", "view", "requireBinding", "showErrorMessage", MetricTracker.Object.MESSAGE, "", "showLoading", "showSummary", "summary", "Lai/kudi/agent/referral/AgentReferralSummary;", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.referral.ui.AgentReferralSummaryFragment */
/* loaded from: classes.dex */
public final class AgentReferralSummaryFragment extends AbstractC9412c<ReferralSummaryView, AgentReferralSummaryPresenter> implements ReferralSummaryView, BaseViewBinder<FragmentAgentReferralSummaryBinding> {
    public static final String ARGS_PHONE_NUMBER = "args_phone_number";
    public static final String ARGS_REFERRAL_ID = "args_referral_id";
    public static final Companion Companion;
    private final /* synthetic */ BaseViewBinderImpl<FragmentAgentReferralSummaryBinding> $$delegate_0;
    private InterfaceC11756a<C13666w> fetchSummary;
    public AgentReferralSummaryPresenter thisPresenter;

    /* compiled from: AgentReferralSummaryFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/referral/ui/AgentReferralSummaryFragment$Companion;", "", "()V", "ARGS_PHONE_NUMBER", "", "ARGS_REFERRAL_ID", "newInstance", "Lai/kudi/agent/referral/ui/AgentReferralSummaryFragment;", "phoneNumber", "referralId", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.referral.ui.AgentReferralSummaryFragment$Companion */
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
        public final AgentReferralSummaryFragment newInstance(String str, String str2) {
            Log_OC.getArray(str, "phoneNumber");
            Log_OC.getArray(str2, "referralId");
            AgentReferralSummaryFragment r6 = new AgentReferralSummaryFragment();
            Bundle r7 = new Bundle();
            r7.putString("args_phone_number", str);
            r7.putString(AgentReferralSummaryFragment.ARGS_REFERRAL_ID, str2);
            C13666w c13666w = C13666w.f30112a;
            AgentReferralSummaryFragment r8 = r6;
            r8.setArguments(r7);
            return r6;
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
    public AgentReferralSummaryFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public AgentReferralSummaryPresenter createPresenter() {
        AgentReferralSummaryPresenter $r1 = getThisPresenter();
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
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentAgentReferralSummaryBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentAgentReferralSummaryBinding $r3 = (FragmentAgentReferralSummaryBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentAgentReferralSummaryBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11756a getFetchSummary() {
        InterfaceC11756a r1 = this.fetchSummary;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AgentReferralSummaryPresenter getThisPresenter() {
        AgentReferralSummaryPresenter $r1 = this.thisPresenter;
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
    @Override // ai.kudi.agent.referral.views.ReferralSummaryView
    public void hideLoading() {
        FragmentAgentReferralSummaryBinding $r1 = requireBinding();
        View $r2 = $r1.container;
        Log_OC.loadImage($r2, "container");
        View r4 = $r2;
        ViewExtKt.show(r4);
        WalletLoaderViewBinding $r3 = $r1.loaderView;
        View $r22 = $r3.getRoot();
        Log_OC.loadImage($r22, "loaderView.root");
        View r42 = $r22;
        ViewExtKt.hide$default(r42, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentAgentReferralSummaryBinding fragmentAgentReferralSummaryBinding, Fragment fragment) {
        Log_OC.getArray(fragmentAgentReferralSummaryBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentAgentReferralSummaryBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentAgentReferralSummaryBinding $r4 = (FragmentAgentReferralSummaryBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        AgentReferralSummaryFragment r7 = this;
        super.onAttach(context);
        AgentReferralSummaryFragment r72 = this;
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
        AgentReferralSummaryFragment r2 = this;
        r2.setHasOptionsMenu(true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        Log_OC.getArray(menu, "menu");
        Log_OC.getArray(menuInflater, "inflater");
        menuInflater.inflate(C0001R.C0005menu.refresh_menu, menu);
        AgentReferralSummaryFragment r3 = this;
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentAgentReferralSummaryBinding $r4 = FragmentAgentReferralSummaryBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        AgentReferralSummaryFragment r6 = this;
        View $r5 = initBinding($r4, (Fragment) r6);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        InterfaceC11756a $r2;
        Log_OC.getArray(menuItem, "item");
        int $i0 = menuItem.getItemId();
        if ($i0 == C0001R.C0003id.refresh && ($r2 = this.fetchSummary) != null) {
            $r2.invoke();
        }
        AgentReferralSummaryFragment r3 = this;
        boolean $z0 = super.onOptionsItemSelected(menuItem);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        AgentReferralSummaryFragment r8 = this;
        Bundle $r2 = r8.getArguments();
        String $r4 = $r2 == null ? null : $r2.getString("args_phone_number");
        AgentReferralSummaryFragment r82 = this;
        Bundle $r22 = r82.getArguments();
        String $r3 = $r22 != null ? $r22.getString(ARGS_REFERRAL_ID) : null;
        AgentReferralSummaryFragment r83 = this;
        FragmentActivity $r5 = r83.requireActivity();
        $r5.setTitle($r4);
        AgentReferralSummaryFragment$onViewCreated$1 r7 = new AgentReferralSummaryFragment$onViewCreated$1(this, $r4, $r3);
        this.fetchSummary = r7;
        if (r7 == null) {
            return;
        }
        r7.invoke();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentAgentReferralSummaryBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentAgentReferralSummaryBinding $r3 = (FragmentAgentReferralSummaryBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentAgentReferralSummaryBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setFetchSummary(InterfaceC11756a interfaceC11756a) {
        this.fetchSummary = interfaceC11756a;
    }

    public final void setThisPresenter(AgentReferralSummaryPresenter agentReferralSummaryPresenter) {
        Log_OC.getArray(agentReferralSummaryPresenter, "<set-?>");
        this.thisPresenter = agentReferralSummaryPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.referral.views.ReferralSummaryView
    public void showErrorMessage(String str) {
        Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
        AgentReferralSummaryFragment r3 = this;
        FragmentActivity $r2 = r3.requireActivity();
        Log_OC.loadImage($r2, "requireActivity()");
        ContextExtKt.toast$default($r2, str, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.referral.views.ReferralSummaryView
    public void showLoading() {
        FragmentAgentReferralSummaryBinding $r1 = requireBinding();
        WalletLoaderViewBinding $r2 = $r1.loaderView;
        View $r3 = $r2.getRoot();
        Log_OC.loadImage($r3, "loaderView.root");
        View r4 = $r3;
        ViewExtKt.show(r4);
        View $r32 = $r1.container;
        Log_OC.loadImage($r32, "container");
        View r42 = $r32;
        ViewExtKt.hide$default(r42, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.referral.views.ReferralSummaryView
    public void showSummary(AgentReferralSummary agentReferralSummary) {
        String $r8;
        Log_OC.getArray(agentReferralSummary, "summary");
        FragmentAgentReferralSummaryBinding $r2 = requireBinding();
        TextView $r3 = $r2.firstNameValue;
        String $r4 = agentReferralSummary.getFirstName();
        $r3.setText($r4);
        TextView $r32 = $r2.lastNameValue;
        String $r42 = agentReferralSummary.getLastName();
        $r32.setText($r42);
        TextView $r33 = $r2.totalCommissionValue;
        StringBuilder r12 = new StringBuilder();
        AgentReferralSummaryFragment r14 = this;
        String $r43 = r14.getString(C0001R.string.naira_symbol);
        r12.append($r43);
        r12.append(' ');
        Long $r6 = agentReferralSummary.getTotalCommission();
        String $r44 = String.valueOf($r6);
        r12.append(StringExtKt.getFormatToCurrency($r44));
        String $r45 = r12.toString();
        $r33.setText($r45);
        TextView $r34 = $r2.accountStatusValue;
        String $r7 = agentReferralSummary.getStatus();
        String $r82 = $r7;
        if ($r7 == null) {
            $r82 = "";
        }
        Locale $r9 = Locale.getDefault();
        Log_OC.loadImage($r9, "getDefault()");
        if ($r82 == null) {
            NullPointerException r13 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
            throw r13;
        }
        String $r72 = $r82.toLowerCase($r9);
        String $r83 = $r72;
        Log_OC.loadImage($r72, "(this as java.lang.String).toLowerCase(locale)");
        int $i0 = $r72.length();
        if ($i0 > 0) {
            StringBuilder r122 = new StringBuilder();
            char $c1 = $r72.charAt(0);
            boolean $z0 = Character.isLowerCase($c1);
            if ($z0) {
                Locale $r92 = Locale.getDefault();
                Log_OC.loadImage($r92, "getDefault()");
                $r8 = C13252b.m5546d($c1, $r92);
            } else {
                $r8 = String.valueOf($c1);
            }
            r122.append($r8.toString());
            if ($r72 == null) {
                NullPointerException r132 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                throw r132;
            }
            String $r73 = $r72.substring(1);
            Log_OC.loadImage($r73, "(this as java.lang.String).substring(startIndex)");
            r122.append($r73);
            $r83 = r122.toString();
        }
        $r34.setText($r83);
        String $r74 = agentReferralSummary.getStatus();
        AgentReferralStatus $r11 = AgentReferralStatus.REGISTERED;
        String $r84 = $r11.name();
        boolean $z02 = Log_OC.append($r74, $r84);
        if ($z02) {
            TextView $r35 = $r2.accountStatusValue;
            $r35.setCompoundDrawablesWithIntrinsicBounds(C0001R.C0002drawable.ic_referral_registered, 0, 0, 0);
        } else {
            AgentReferralStatus $r112 = AgentReferralStatus.ACTIVE;
            String $r85 = $r112.name();
            boolean $z03 = Log_OC.append($r74, $r85);
            if ($z03) {
                TextView $r36 = $r2.accountStatusValue;
                $r36.setCompoundDrawablesWithIntrinsicBounds(C0001R.C0002drawable.ic_referral_active, 0, 0, 0);
            } else {
                AgentReferralStatus $r113 = AgentReferralStatus.INACTIVE;
                String $r86 = $r113.name();
                boolean $z04 = Log_OC.append($r74, $r86);
                if ($z04) {
                    TextView $r37 = $r2.accountStatusValue;
                    $r37.setCompoundDrawablesWithIntrinsicBounds(C0001R.C0002drawable.ic_referral_inactive, 0, 0, 0);
                }
            }
        }
        TextView $r38 = $r2.dateJoinedValue;
        String $r75 = agentReferralSummary.getRegisteredDate();
        String $r46 = $r75 != null ? $r75 : "";
        $r38.setText(StringExtKt.formatIsoDate($r46));
    }
}
