package ai.kudi.agent.dashboard.mods;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.dashboard.presenter.DashboardPresenter;
import ai.kudi.agent.dashboard.view.DashboardView;
import ai.kudi.agent.databinding.FragmentDashboardBinding;
import ai.kudi.agent.filter.domain.FilteredDate;
import ai.kudi.agent.filter.p005ui.DateFilterFragment;
import ai.kudi.agent.help.p006ui.HelpActivity;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.wallettopup.WalletTopUpActivity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC1523w;
import androidx.lifecycle.PreferenceActivity;
import dagger.android.p197e.C7429a;
import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.p483e0.p485d.C11780a0;
import kotlin.p483e0.p485d.C11811v;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.AbstractC9412c;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: DashboardFragment.kt */
@Metadata(m10422d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010#\u001a\u00020\u0003H\u0016J\u0012\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0010\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020\bH\u0002J\b\u0010/\u001a\u00020%H\u0016J\u0019\u00100\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u00052\u0006\u00101\u001a\u000202H\u0096\u0001J\b\u00103\u001a\u00020%H\u0016J\b\u00104\u001a\u00020%H\u0016J\u0010\u00105\u001a\u00020%2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0012\u00106\u001a\u00020%2\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u0010\u00109\u001a\u00020%2\u0006\u0010:\u001a\u00020;H\u0016J\u0018\u0010<\u001a\u00020%2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@H\u0016J$\u0010A\u001a\u00020\u00152\u0006\u0010?\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010D2\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u0010\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020HH\u0016J\t\u0010I\u001a\u00020\u0005H\u0096\u0001J\u0006\u0010J\u001a\u00020%J\u0012\u0010K\u001a\u00020%2\b\u0010L\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010M\u001a\u00020%H\u0016J\b\u0010N\u001a\u00020%H\u0016J\u0010\u0010O\u001a\u00020%2\u0006\u0010P\u001a\u00020FH\u0016J\u0010\u0010Q\u001a\u00020%2\u0006\u0010R\u001a\u00020FH\u0016J\b\u0010S\u001a\u00020%H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\u001e\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006T"}, m10421d2 = {"Lai/kudi/agent/dashboard/ui/DashboardFragment;", "Lcom/hannesdorfmann/mosby3/mvp/MvpFragment;", "Lai/kudi/agent/dashboard/view/DashboardView;", "Lai/kudi/agent/dashboard/presenter/DashboardPresenter;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/FragmentDashboardBinding;", "()V", "appVersionCode", "", "binding", "getBinding", "()Lai/kudi/agent/databinding/FragmentDashboardBinding;", "filteredDate", "Lai/kudi/agent/filter/domain/FilteredDate;", "getFilteredDate", "()Lai/kudi/agent/filter/domain/FilteredDate;", "setFilteredDate", "(Lai/kudi/agent/filter/domain/FilteredDate;)V", "handler", "Landroid/os/Handler;", "mView", "Landroid/view/View;", "getMView", "()Landroid/view/View;", "setMView", "(Landroid/view/View;)V", "progressBarThread", "Ljava/lang/Thread;", "runnable", "Ljava/lang/Runnable;", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/dashboard/presenter/DashboardPresenter;", "setThisPresenter", "(Lai/kudi/agent/dashboard/presenter/DashboardPresenter;)V", "createPresenter", "displayFundWalletInfo", "", "user", "Lai/kudi/agent/users/domain/dto/User;", "displayTotalAmountProcessed", TransactionField.AMOUNT, "", "displayTotalCountProcessed", "totalCount", "", "getCurrentDate", "hideProgress", "initBinding", "fragment", "Landroidx/fragment/app/Fragment;", "navigateToFundWalletPage", "navigateToHelpPage", "navigateToTransactionBreakDownPage", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "Landroid/content/Context;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "requireBinding", "setUpView", "showError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "showFilterDialog", "showProgress", "toggleFundWalletView", "isWalletLow", "toggleUpdateAppView", "shouldUpdate", "updateApp", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class DashboardFragment extends AbstractC9412c<DashboardView, DashboardPresenter> implements DashboardView, BaseViewBinder<FragmentDashboardBinding> {
    private final /* synthetic */ BaseViewBinderImpl<FragmentDashboardBinding> $$delegate_0;
    private final String appVersionCode;
    public FilteredDate filteredDate;
    private Handler handler;
    public View mView;
    private Thread progressBarThread;
    private Runnable runnable;
    public DashboardPresenter thisPresenter;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public DashboardFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
        this.appVersionCode = "6733";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final String getCurrentDate() {
        Date $r2 = new Date();
        String $r1 = DateExtKt.convertDateToGivenFormat$default($r2, null, 2, null);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpView$lambda-5$lambda-0  reason: not valid java name */
    public static final void m39197setUpView$lambda5$lambda0(DashboardFragment dashboardFragment, View view) {
        Log_OC.getArray(dashboardFragment, "this$0");
        DashboardPresenter $r0 = dashboardFragment.getThisPresenter();
        $r0.showDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpView$lambda-5$lambda-1  reason: not valid java name */
    public static final void m39198setUpView$lambda5$lambda1(DashboardFragment dashboardFragment, View view) {
        Log_OC.getArray(dashboardFragment, "this$0");
        DashboardPresenter $r0 = dashboardFragment.getThisPresenter();
        $r0.navigateToFundWallet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpView$lambda-5$lambda-2  reason: not valid java name */
    public static final void m39199setUpView$lambda5$lambda2(DashboardFragment dashboardFragment, View view) {
        Log_OC.getArray(dashboardFragment, "this$0");
        DashboardPresenter $r0 = dashboardFragment.getThisPresenter();
        $r0.navigateToPlayStore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpView$lambda-5$lambda-3  reason: not valid java name */
    public static final void m39200setUpView$lambda5$lambda3(DashboardFragment dashboardFragment, View view) {
        Log_OC.getArray(dashboardFragment, "this$0");
        DashboardPresenter $r0 = dashboardFragment.getThisPresenter();
        $r0.navigateToHelpPage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpView$lambda-5$lambda-4  reason: not valid java name */
    public static final void m39201setUpView$lambda5$lambda4(DashboardFragment dashboardFragment, View view) {
        Log_OC.getArray(dashboardFragment, "this$0");
        FilteredDate $r2 = dashboardFragment.filteredDate;
        if ($r2 != null) {
            DashboardPresenter $r3 = dashboardFragment.getThisPresenter();
            FilteredDate $r22 = dashboardFragment.getFilteredDate();
            $r3.navigateToTransactionBreakDownPage($r22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: showFilterDialog$lambda-7  reason: not valid java name */
    public static final void m39202showFilterDialog$lambda7(DashboardFragment dashboardFragment, String str, Bundle bundle) {
        Log_OC.getArray(dashboardFragment, "this$0");
        Log_OC.getArray(str, "requestKey");
        Log_OC.getArray(bundle, "result");
        boolean $z0 = Log_OC.append(str, DateFilterFragment.RESULT_KEY_FILTERED_DATE);
        if ($z0) {
            Serializable $r3 = bundle.getSerializable(DateFilterFragment.RESULT_KEY_FILTERED_DATE);
            boolean $z02 = $r3 instanceof FilteredDate;
            FilteredDate $r4 = $z02 ? (FilteredDate) $r3 : null;
            if ($r4 == null) {
                return;
            }
            dashboardFragment.setFilteredDate($r4);
            Date $r5 = $r4.getFrom();
            Date $r6 = $r4.getTo();
            String $r1 = DateExtKt.getDateDiff$default($r5, $r6, 0, null, 8, null);
            FragmentDashboardBinding $r7 = dashboardFragment.requireBinding();
            TextView $r8 = $r7.dateTextView;
            $r8.setText($r1);
            DashboardPresenter $r9 = dashboardFragment.getThisPresenter();
            FilteredDate $r42 = dashboardFragment.getFilteredDate();
            String $r12 = dashboardFragment.appVersionCode;
            $r9.fetchDashboardSummary($r42, $r12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: showProgress$lambda-16$lambda-13  reason: not valid java name */
    public static final void m39203showProgress$lambda16$lambda13(FragmentDashboardBinding fragmentDashboardBinding, C11811v c11811v) {
        Log_OC.getArray(fragmentDashboardBinding, "$this_apply");
        Log_OC.getArray(c11811v, "$status");
        ProgressBar $r2 = fragmentDashboardBinding.progressBar;
        if ($r2 != null) {
            int $i0 = c11811v.f26498c;
            $r2.setProgress($i0);
        }
        ProgressBar $r22 = fragmentDashboardBinding.progressBar;
        if ($r22 == null) {
            return;
        }
        int $i02 = c11811v.f26498c;
        $r22.setSecondaryProgress($i02 + 5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: showProgress$lambda-16$lambda-15  reason: not valid java name */
    public static final void m39204showProgress$lambda16$lambda15(C11811v c11811v, DashboardFragment dashboardFragment) {
        Log_OC.getArray(c11811v, "$status");
        Log_OC.getArray(dashboardFragment, "this$0");
        while (true) {
            int $i0 = c11811v.f26498c;
            if ($i0 >= 100) {
                return;
            }
            int $i02 = $i0 + 1;
            c11811v.f26498c = $i02;
            if ($i02 == 99) {
                c11811v.f26498c = 0;
            }
            Handler $r3 = dashboardFragment.handler;
            if ($r3 == null) {
                Log_OC.LogError("handler");
                NullPointerException r5 = new NullPointerException("Null throw statement replaced by Soot");
                throw r5;
            }
            Runnable $r1 = dashboardFragment.runnable;
            if ($r1 == null) {
                Log_OC.LogError("runnable");
                NullPointerException r52 = new NullPointerException("Null throw statement replaced by Soot");
                throw r52;
            }
            $r3.post($r1);
            try {
                Thread.sleep(6L);
            } catch (InterruptedException $r4) {
                $r4.printStackTrace();
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public DashboardPresenter createPresenter() {
        DashboardPresenter $r1 = getThisPresenter();
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
    @Override // ai.kudi.agent.dashboard.view.DashboardView
    public void displayFundWalletInfo(User user) {
        String $r5;
        if (user == null) {
            FragmentDashboardBinding $r2 = requireBinding();
            TextView $r3 = $r2.walletInfo;
            DashboardFragment r10 = this;
            String $r52 = r10.getString(C0001R.string.new_wallet_action_msg);
            Log_OC.loadImage($r52, "getString(R.string.new_wallet_action_msg)");
            $r5 = C13276s.m5451A($r52, "%s", "", false, 4, null);
            $r3.setText($r5);
            return;
        }
        FragmentDashboardBinding $r22 = requireBinding();
        TextView $r32 = $r22.walletInfo;
        C11780a0 c11780a0 = C11780a0.f26475a;
        DashboardFragment r102 = this;
        String $r53 = r102.getString(C0001R.string.new_wallet_action_msg);
        Log_OC.loadImage($r53, "getString(R.string.new_wallet_action_msg)");
        StringBuilder r9 = new StringBuilder();
        String $r8 = user.getFirstName();
        r9.append((Object) $r8);
        r9.append(' ');
        String $r82 = user.getLastName();
        r9.append((Object) $r82);
        String $r83 = r9.toString();
        Object[] $r6 = {$r83};
        String $r54 = String.format($r53, Arrays.copyOf($r6, 1));
        Log_OC.loadImage($r54, "java.lang.String.format(format, *args)");
        $r32.setText($r54);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.dashboard.view.DashboardView
    public void displayTotalAmountProcessed(double d) {
        FragmentDashboardBinding $r3 = requireBinding();
        TextView $r1 = $r3.totalAmountProcessedTextView;
        C11780a0 c11780a0 = C11780a0.f26475a;
        DashboardFragment r10 = this;
        String $r5 = r10.getString(C0001R.string.total_amount_processed);
        Log_OC.loadImage($r5, "getString(R.string.total_amount_processed)");
        Locale $r6 = Locale.US;
        NumberFormat $r7 = NumberFormat.getNumberInstance($r6);
        String $r8 = $r7.format(d);
        Object[] $r2 = {$r8};
        String $r52 = String.format($r5, Arrays.copyOf($r2, 1));
        Log_OC.loadImage($r52, "java.lang.String.format(format, *args)");
        $r1.setText($r52);
        TextView $r12 = $r3.totalAmountProcessedTextView;
        Typeface $r9 = $r12.getTypeface();
        $r12.setTypeface($r9, 1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.dashboard.view.DashboardView
    public void displayTotalCountProcessed(int i) {
        FragmentDashboardBinding $r1 = requireBinding();
        TextView $r2 = $r1.totalCountProcessedTextView;
        Locale $r3 = Locale.US;
        NumberFormat $r4 = NumberFormat.getNumberInstance($r3);
        Integer $r5 = Integer.valueOf(i);
        String $r6 = $r4.format($r5);
        $r2.setText($r6);
        TextView $r22 = $r1.totalCountProcessedTextView;
        Typeface $r7 = $r22.getTypeface();
        $r22.setTypeface($r7, 1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentDashboardBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentDashboardBinding $r3 = (FragmentDashboardBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentDashboardBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FilteredDate getFilteredDate() {
        FilteredDate $r1 = this.filteredDate;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("filteredDate");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final View getMView() {
        View $r1 = this.mView;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("mView");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final DashboardPresenter getThisPresenter() {
        DashboardPresenter $r1 = this.thisPresenter;
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
    @Override // ai.kudi.agent.dashboard.view.DashboardView
    public void hideProgress() {
        Handler $r4;
        FragmentDashboardBinding $r1 = requireBinding();
        ProgressBar $r2 = $r1 == null ? null : $r1.progressBar;
        Log_OC.loadImage($r2, "requireBinding()?.progressBar");
        ViewExtKt.hide$default($r2, false, 1, null);
        if (this.progressBarThread == null || ($r4 = this.handler) == null) {
            return;
        }
        if ($r4 == null) {
            Log_OC.LogError("handler");
            NullPointerException r6 = new NullPointerException("Null throw statement replaced by Soot");
            throw r6;
        }
        Runnable $r5 = this.runnable;
        if ($r5 == null) {
            Log_OC.LogError("runnable");
            NullPointerException r62 = new NullPointerException("Null throw statement replaced by Soot");
            throw r62;
        }
        $r4.removeCallbacks($r5);
        Thread $r3 = this.progressBarThread;
        if ($r3 != null) {
            $r3.join();
            return;
        }
        Log_OC.LogError("progressBarThread");
        NullPointerException r63 = new NullPointerException("Null throw statement replaced by Soot");
        throw r63;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentDashboardBinding fragmentDashboardBinding, Fragment fragment) {
        Log_OC.getArray(fragmentDashboardBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentDashboardBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentDashboardBinding $r4 = (FragmentDashboardBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.dashboard.view.DashboardView
    public void navigateToFundWalletPage() {
        DashboardFragment r4 = this;
        Intent r3 = new Intent(r4.requireActivity(), WalletTopUpActivity.class);
        r3.putExtra(WalletTopUpActivity.EXTRA_MODE, WalletTopUpActivity.MODE_WALLET_TOPUP);
        DashboardFragment r42 = this;
        r42.startActivity(r3);
        DashboardFragment r43 = this;
        FragmentActivity $r2 = r43.getActivity();
        if ($r2 == null) {
            return;
        }
        $r2.finish();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.dashboard.view.DashboardView
    public void navigateToHelpPage() {
        DashboardFragment r4 = this;
        FragmentActivity $r2 = r4.requireActivity();
        Intent r3 = new Intent($r2, HelpActivity.class);
        DashboardFragment r42 = this;
        r42.startActivity(r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.dashboard.view.DashboardView
    public void navigateToTransactionBreakDownPage(FilteredDate filteredDate) {
        Log_OC.getArray(filteredDate, "filteredDate");
        DashboardFragment r5 = this;
        FragmentActivity $r2 = r5.requireActivity();
        Intent r4 = new Intent($r2, ai.kudi.agent.dashboard.ui.TransactionBreakDownActivity.class);
        r4.putExtra(TransactionBreakDownActivity.FILTERED_DATE_INTENT, filteredDate);
        DashboardFragment r52 = this;
        r52.startActivity(r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        DashboardFragment r2 = this;
        r2.setHasOptionsMenu(true);
        setUpView();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        DashboardFragment r2 = this;
        C7429a.m18752b(r2);
        DashboardFragment r22 = this;
        super.onAttach(context);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        Log_OC.getArray(menu, "menu");
        Log_OC.getArray(menuInflater, "inflater");
        DashboardFragment r3 = this;
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(C0001R.C0005menu.dashboard, menu);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentDashboardBinding $r4 = FragmentDashboardBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        DashboardFragment r6 = this;
        View $r5 = initBinding($r4, (Fragment) r6);
        setMView($r5);
        View $r52 = getMView();
        return $r52;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Log_OC.getArray(menuItem, "item");
        int $i0 = menuItem.getItemId();
        if ($i0 == C0001R.C0003id.dashboard) {
            DashboardPresenter $r3 = getThisPresenter();
            Date $r1 = new Date();
            Date r7 = new Date();
            FilteredDate r8 = new FilteredDate($r1, r7);
            String $r6 = this.appVersionCode;
            $r3.fetchDashboardSummary(r8, $r6);
        }
        DashboardFragment r9 = this;
        boolean $z0 = super.onOptionsItemSelected(menuItem);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentDashboardBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentDashboardBinding $r3 = (FragmentDashboardBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentDashboardBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setFilteredDate(FilteredDate filteredDate) {
        Log_OC.getArray(filteredDate, "<set-?>");
        this.filteredDate = filteredDate;
    }

    public final void setMView(View view) {
        Log_OC.getArray(view, "<set-?>");
        this.mView = view;
    }

    public final void setThisPresenter(DashboardPresenter dashboardPresenter) {
        Log_OC.getArray(dashboardPresenter, "<set-?>");
        this.thisPresenter = dashboardPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setUpView() {
        FragmentDashboardBinding $r2 = requireBinding();
        DashboardPresenter $r3 = getThisPresenter();
        $r3.displayTotalAmountProcessed(0.0d);
        DashboardPresenter $r32 = getThisPresenter();
        $r32.displayTotalCount(0);
        TextView $r4 = $r2.dateTextView;
        String $r5 = getCurrentDate();
        $r4.setText($r5);
        Date $r1 = new Date();
        Date $r7 = new Date();
        FilteredDate $r6 = new FilteredDate($r1, $r7);
        setFilteredDate($r6);
        TextView $r42 = $r2.dateTextView;
        $r42.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.dashboard.mods.NoteEditor$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DashboardFragment $r22 = DashboardFragment.this;
                DashboardFragment.m39197setUpView$lambda5$lambda0($r22, view);
            }
        });
        DashboardPresenter $r33 = getThisPresenter();
        Date $r72 = new Date();
        Date $r12 = new Date();
        FilteredDate $r62 = new FilteredDate($r72, $r12);
        String $r52 = this.appVersionCode;
        $r33.fetchDashboardSummary($r62, $r52);
        TextView $r43 = $r2.appVersion;
        $r43.setText("3.2.163");
        Button $r9 = $r2.fundWalletButton;
        $r9.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.dashboard.mods.SearchResultsActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DashboardFragment $r22 = DashboardFragment.this;
                DashboardFragment.m39198setUpView$lambda5$lambda1($r22, view);
            }
        });
        Button $r92 = $r2.updateButton;
        $r92.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.dashboard.mods.Stats$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DashboardFragment $r22 = DashboardFragment.this;
                DashboardFragment.m39199setUpView$lambda5$lambda2($r22, view);
            }
        });
        Button $r93 = $r2.talkToUsButton;
        $r93.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.dashboard.mods.c
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DashboardFragment $r22 = DashboardFragment.this;
                DashboardFragment.m39200setUpView$lambda5$lambda3($r22, view);
            }
        });
        TextView $r44 = $r2.viewBreakdown;
        $r44.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.dashboard.mods.Window$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DashboardFragment $r22 = DashboardFragment.this;
                DashboardFragment.m39201setUpView$lambda5$lambda4($r22, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.dashboard.view.DashboardView
    public void showError(String str) {
        DashboardFragment r3 = this;
        FragmentActivity $r2 = r3.getActivity();
        if ($r2 == null) {
            return;
        }
        ContextExtKt.toast$default($r2, str, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.dashboard.view.DashboardView
    public void showFilterDialog() {
        InterfaceC1523w interfaceC1523w = new InterfaceC1523w() { // from class: ai.kudi.agent.dashboard.mods.DayFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void run(String str, Bundle bundle) {
                DashboardFragment $r3 = DashboardFragment.this;
                DashboardFragment.m39202showFilterDialog$lambda7($r3, str, bundle);
            }
        };
        DashboardFragment r7 = this;
        FragmentManager $r2 = r7.getChildFragmentManager();
        DashboardFragment r72 = this;
        PreferenceActivity $r3 = r72.getViewLifecycleOwner();
        $r2.p1(DateFilterFragment.RESULT_KEY_FILTERED_DATE, $r3, interfaceC1523w);
        DateFilterFragment.Companion $r4 = DateFilterFragment.Companion;
        DateFilterFragment $r5 = $r4.newInstance();
        DashboardFragment r73 = this;
        FragmentManager $r22 = r73.getChildFragmentManager();
        Chapter r8 = (Chapter) $r5;
        r8.show($r22, DateFilterFragment.PAGE_KEY);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.dashboard.view.DashboardView
    public void showProgress() {
        final FragmentDashboardBinding $r2 = requireBinding();
        ProgressBar $r3 = $r2.progressBar;
        if ($r3 != null) {
            ViewExtKt.show($r3);
        }
        final C11811v $r4 = new C11811v();
        this.handler = new Handler();
        this.runnable = new Runnable() { // from class: ai.kudi.agent.dashboard.mods.SweeperPool$Sweeper
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public final void run() {
                FragmentDashboardBinding $r1 = FragmentDashboardBinding.this;
                C11811v $r22 = $r4;
                DashboardFragment.m39203showProgress$lambda16$lambda13($r1, $r22);
            }
        };
        Thread $r7 = new Thread(new Runnable() { // from class: ai.kudi.agent.dashboard.mods.LoginActivity$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public final void run() {
                C11811v $r1 = C11811v.this;
                DashboardFragment $r22 = this;
                DashboardFragment.m39204showProgress$lambda16$lambda15($r1, $r22);
            }
        });
        this.progressBarThread = $r7;
        if ($r7 == null) {
            Log_OC.LogError("progressBarThread");
            NullPointerException r9 = new NullPointerException("Null throw statement replaced by Soot");
            throw r9;
        }
        boolean $z0 = $r7.isAlive();
        if ($z0) {
            Thread $r72 = this.progressBarThread;
            if ($r72 == null) {
                Log_OC.LogError("progressBarThread");
                NullPointerException r92 = new NullPointerException("Null throw statement replaced by Soot");
                throw r92;
            }
            $r72.join();
            Handler $r5 = this.handler;
            if ($r5 == null) {
                Log_OC.LogError("handler");
                NullPointerException r93 = new NullPointerException("Null throw statement replaced by Soot");
                throw r93;
            }
            Runnable $r1 = this.runnable;
            if ($r1 == null) {
                Log_OC.LogError("runnable");
                NullPointerException r94 = new NullPointerException("Null throw statement replaced by Soot");
                throw r94;
            }
            $r5.removeCallbacks($r1);
        }
        Thread $r73 = this.progressBarThread;
        if ($r73 != null) {
            $r73.start();
            return;
        }
        Log_OC.LogError("progressBarThread");
        NullPointerException r95 = new NullPointerException("Null throw statement replaced by Soot");
        throw r95;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.dashboard.view.DashboardView
    public void toggleFundWalletView(boolean z) {
        FragmentDashboardBinding $r1 = requireBinding();
        if (z) {
            LinearLayout $r2 = $r1.fundWalletLayout;
            Log_OC.loadImage($r2, "fundWalletLayout");
            ViewExtKt.show($r2);
            return;
        }
        LinearLayout $r22 = $r1.fundWalletLayout;
        Log_OC.loadImage($r22, "fundWalletLayout");
        ViewExtKt.hide$default($r22, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.dashboard.view.DashboardView
    public void toggleUpdateAppView(boolean z) {
        FragmentDashboardBinding $r1 = requireBinding();
        if (z) {
            LinearLayout $r2 = $r1.updateAppLayout;
            Log_OC.loadImage($r2, "updateAppLayout");
            ViewExtKt.show($r2);
            return;
        }
        LinearLayout $r22 = $r1.updateAppLayout;
        Log_OC.loadImage($r22, "updateAppLayout");
        ViewExtKt.hide$default($r22, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.dashboard.view.DashboardView
    public void updateApp() {
        DashboardFragment r4 = this;
        FragmentActivity $r1 = r4.getActivity();
        if ($r1 == null) {
            return;
        }
        DashboardFragment r42 = this;
        FragmentActivity $r2 = r42.requireActivity();
        String $r3 = $r2.getPackageName();
        Log_OC.loadImage($r3, "requireActivity().packageName");
        AppCompatActivityExtKt.openAppStore($r1, $r3);
    }
}
