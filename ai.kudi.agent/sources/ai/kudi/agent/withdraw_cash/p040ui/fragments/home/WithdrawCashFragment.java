package ai.kudi.agent.withdraw_cash.p040ui.fragments.home;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.databinding.KudiTypeListLayoutBinding;
import ai.kudi.agent.home.HomeActivity;
import ai.kudi.agent.withdraw_cash.p040ui.activities.CashWithdrawalOptionActivity;
import ai.kudi.agent.withdraw_cash.p040ui.adapters.KudiOptionListAdapter;
import ai.kudi.agent.withdraw_cash.utils.Option;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.InterfaceC4454e;
import com.google.android.gms.tasks.Item;
import com.google.firebase.remoteconfig.Frame;
import dagger.android.p197e.C7429a;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p590o.p591a.Timber;
/* compiled from: WithdrawCashFragment.kt */
@Metadata(m10422d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0005¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0001H\u0096\u0001J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u0016H\u0016J&\u0010 \u001a\u0004\u0018\u00010\u00182\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u001a\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u00182\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020+H\u0002J\t\u0010,\u001a\u00020\u0004H\u0096\u0001R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R$\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006-"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/ui/fragments/home/WithdrawCashFragment;", "Landroidx/fragment/app/Fragment;", "Lai/kudi/agent/withdraw_cash/ui/adapters/KudiOptionListAdapter$OnOptionClick;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/KudiTypeListLayoutBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/databinding/KudiTypeListLayoutBinding;", "homeActivity", "Lai/kudi/agent/home/HomeActivity;", "optionsAdapter", "Lai/kudi/agent/withdraw_cash/ui/adapters/KudiOptionListAdapter;", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences$annotations", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "getAllowedWithdrawalOptions", "", "Lai/kudi/agent/withdraw_cash/utils/Option;", "initBinding", "Landroid/view/View;", "fragment", "onAttach", "", "context", "Landroid/content/Context;", "onClick", "option", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "refreshScreen", "string", "", "requireBinding", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.withdraw_cash.ui.fragments.home.WithdrawCashFragment */
/* loaded from: classes.dex */
public final class WithdrawCashFragment extends Fragment implements KudiOptionListAdapter.OnOptionClick, BaseViewBinder<KudiTypeListLayoutBinding> {
    private final /* synthetic */ BaseViewBinderImpl<KudiTypeListLayoutBinding> $$delegate_0;
    private HomeActivity homeActivity;
    private KudiOptionListAdapter optionsAdapter;
    public SharedPreferences sharedPreferences;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public WithdrawCashFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:7:0x0035 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List getAllowedWithdrawalOptions() {
        /*
            r11 = this;
            r1 = 3
            ai.kudi.agent.withdraw_cash.utils.Option[] r0 = new ai.kudi.agent.withdraw_cash.utils.Option[r1]
            ai.kudi.agent.withdraw_cash.utils.Option r2 = ai.kudi.agent.withdraw_cash.utils.Option.CARD_WITHDRAWAL
            r1 = 0
            r0[r1] = r2
            ai.kudi.agent.withdraw_cash.utils.Option r2 = ai.kudi.agent.withdraw_cash.utils.Option.USSD_WITHDRAWAL
            r1 = 1
            r0[r1] = r2
            ai.kudi.agent.withdraw_cash.utils.Option r2 = ai.kudi.agent.withdraw_cash.utils.Option.MPOS
            r1 = 2
            r0[r1] = r2
            java.util.ArrayList r3 = kotlin.p557z.C13722p.m3944c(r0)
            android.content.SharedPreferences r4 = r11.getSharedPreferences()
            java.lang.String r6 = "is_c2c_enabled"
            r1 = 0
            boolean r5 = r4.getBoolean(r6, r1)
            if (r5 == 0) goto L28
            ai.kudi.agent.withdraw_cash.utils.Option r2 = ai.kudi.agent.withdraw_cash.utils.Option.KUDI_VOUCHER
            r3.add(r2)
        L28:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r3.iterator()
        L31:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L49
            java.lang.Object r9 = r8.next()
            r10 = r9
            ai.kudi.agent.withdraw_cash.utils.Option r10 = (ai.kudi.agent.withdraw_cash.utils.Option) r10
            r2 = r10
            boolean r5 = r2.isEnabled()
            if (r5 == 0) goto L31
            r7.add(r9)
            goto L31
        L49:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.withdraw_cash.p040ui.fragments.home.WithdrawCashFragment.getAllowedWithdrawalOptions():java.util.List");
    }

    public static /* synthetic */ void getSharedPreferences$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-4$lambda-1$lambda-0  reason: not valid java name */
    public static final void m41808onViewCreated$lambda4$lambda1$lambda0(WithdrawCashFragment withdrawCashFragment, View view) {
        Log_OC.getArray(withdrawCashFragment, "this$0");
        FragmentActivity $r0 = withdrawCashFragment.requireActivity();
        $r0.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-4$lambda-3  reason: not valid java name */
    public static final void m41809onViewCreated$lambda4$lambda3(WithdrawCashFragment withdrawCashFragment, Frame frame, Item item) {
        Log_OC.getArray(withdrawCashFragment, "this$0");
        Log_OC.getArray(frame, "$remoteConfig");
        Log_OC.getArray(item, "it");
        boolean $z0 = item.m27801a();
        Boolean $r4 = Boolean.valueOf($z0);
        Object[] $r1 = new Object[0];
        Timber.wtf(Log_OC.m10359a("task ", $r4), $r1);
        boolean $z02 = item.m27801a();
        if ($z02) {
            Object[] $r12 = new Object[0];
            Timber.wtf("success remote config", $r12);
            String $r5 = frame.getSetting("withdrawal_options");
            Log_OC.loadImage($r5, "remoteConfig.getString(\"withdrawal_options\")");
            withdrawCashFragment.refreshScreen($r5);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:10:0x005a */
    /* JADX WARN: Incorrect condition in loop: B:13:0x0072 */
    /* JADX WARN: Incorrect condition in loop: B:19:0x00be */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void refreshScreen(java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.withdraw_cash.p040ui.fragments.home.WithdrawCashFragment.refreshScreen(java.lang.String):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public KudiTypeListLayoutBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        KudiTypeListLayoutBinding $r3 = (KudiTypeListLayoutBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        KudiTypeListLayoutBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SharedPreferences getSharedPreferences() {
        SharedPreferences $r1 = this.sharedPreferences;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("sharedPreferences");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(KudiTypeListLayoutBinding kudiTypeListLayoutBinding, Fragment fragment) {
        Log_OC.getArray(kudiTypeListLayoutBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(kudiTypeListLayoutBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        KudiTypeListLayoutBinding $r4 = (KudiTypeListLayoutBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        C7429a.m18752b(this);
        super.onAttach(context);
        boolean $z0 = context instanceof HomeActivity;
        if ($z0) {
            HomeActivity $r2 = (HomeActivity) context;
            this.homeActivity = $r2;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.withdraw_cash.p040ui.adapters.KudiOptionListAdapter.OnOptionClick
    public void onClick(Option option) {
        Log_OC.getArray(option, "option");
        FragmentActivity $r3 = getActivity();
        Intent $r2 = new Intent($r3, CashWithdrawalOptionActivity.class);
        int $i0 = option.ordinal();
        $r2.putExtra(CashWithdrawalOptionActivity.KEY_WITHDRAWAL_OPTION_ID, $i0);
        C13666w c13666w = C13666w.f30112a;
        startActivity($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        KudiTypeListLayoutBinding $r4 = KudiTypeListLayoutBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, (Fragment) this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        List $r4 = getAllowedWithdrawalOptions();
        this.optionsAdapter = new KudiOptionListAdapter(this, $r4);
        KudiTypeListLayoutBinding $r5 = requireBinding();
        Toolbar $r6 = $r5.toolbar;
        $r6.setNavigationIcon(C0001R.C0002drawable.intercom_back);
        String $r7 = getString(C0001R.string.withdraw_money);
        $r6.setTitle($r7);
        $r6.setNavigationOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.withdraw_cash.ui.fragments.home.AboutFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WithdrawCashFragment $r2 = WithdrawCashFragment.this;
                WithdrawCashFragment.m41808onViewCreated$lambda4$lambda1$lambda0($r2, view2);
            }
        });
        RecyclerView $r9 = $r5.rvOptions;
        $r9.setHasFixedSize(true);
        Context $r11 = requireContext();
        LinearLayoutManager $r10 = new LinearLayoutManager($r11, 1, false);
        $r9.setLayoutManager($r10);
        KudiOptionListAdapter $r3 = this.optionsAdapter;
        if ($r3 == null) {
            Log_OC.LogError("optionsAdapter");
            NullPointerException r15 = new NullPointerException("Null throw statement replaced by Soot");
            throw r15;
        }
        $r9.setAdapter($r3);
        final Frame $r12 = Frame.onCreateViewHolder();
        Log_OC.loadImage($r12, "getInstance()");
        Item $r13 = $r12.m20914c();
        $r13.m27799a(new InterfaceC4454e() { // from class: ai.kudi.agent.withdraw_cash.ui.fragments.home.e
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: b */
            public final void m38075b(Item item) {
                WithdrawCashFragment $r2 = WithdrawCashFragment.this;
                Frame $r32 = $r12;
                WithdrawCashFragment.m41809onViewCreated$lambda4$lambda3($r2, $r32, item);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public KudiTypeListLayoutBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        KudiTypeListLayoutBinding $r3 = (KudiTypeListLayoutBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        KudiTypeListLayoutBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences) {
        Log_OC.getArray(sharedPreferences, "<set-?>");
        this.sharedPreferences = sharedPreferences;
    }
}
