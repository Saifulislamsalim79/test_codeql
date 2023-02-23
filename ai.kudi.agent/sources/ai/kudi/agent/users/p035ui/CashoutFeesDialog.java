package ai.kudi.agent.users.p035ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.bills.domain.usecases.FeesLookupRequest;
import ai.kudi.agent.bills.domain.usecases.FeesLookupResponse;
import ai.kudi.agent.bills.domain.usecases.PerformServiceFeeLookup;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.databinding.ViewUsersCashoutFeeDialogBinding;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.p035ui.CashoutFeesDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.h;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p450e0.Object;
/* compiled from: CashoutFeesDialog.kt */
@Metadata(m10422d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0002\u0017\u0018B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\tJ\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\u0019"}, m10421d2 = {"Lai/kudi/agent/users/ui/CashoutFeesDialog;", "", "feesLookup", "Lai/kudi/agent/bills/domain/usecases/PerformServiceFeeLookup;", "(Lai/kudi/agent/bills/domain/usecases/PerformServiceFeeLookup;)V", "dialog", "Lai/kudi/agent/users/ui/CashoutFeesDialog$Dialog;", "onErrorListener", "Lkotlin/Function0;", "", "getOnErrorListener", "()Lkotlin/jvm/functions/Function0;", "setOnErrorListener", "(Lkotlin/jvm/functions/Function0;)V", "onProceedClicked", "getOnProceedClicked", "setOnProceedClicked", "dismiss", "show", "fm", "Landroidx/fragment/app/FragmentManager;", TransactionField.AMOUNT, "", "Companion", "Dialog", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.users.ui.CashoutFeesDialog */
/* loaded from: classes.dex */
public final class CashoutFeesDialog {
    public static final Companion Companion;
    public static final String INNER_DIALOG_TAG = ".CashoutFeesDialog";
    private final Dialog dialog;
    private final PerformServiceFeeLookup feesLookup;
    private InterfaceC11756a<C13666w> onErrorListener;
    private InterfaceC11756a<C13666w> onProceedClicked;

    /* compiled from: CashoutFeesDialog.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/users/ui/CashoutFeesDialog$Companion;", "", "()V", "INNER_DIALOG_TAG", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.users.ui.CashoutFeesDialog$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* compiled from: CashoutFeesDialog.kt */
    @Metadata(m10422d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\nJ\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u0096\u0001J$\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\nH\u0002J\u001a\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\t\u0010\u001e\u001a\u00020\u0003H\u0096\u0001J\u000e\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020\nR\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006#"}, m10421d2 = {"Lai/kudi/agent/users/ui/CashoutFeesDialog$Dialog;", "Landroidx/fragment/app/DialogFragment;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/ViewUsersCashoutFeeDialogBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/databinding/ViewUsersCashoutFeeDialogBinding;", "onProceed", "Lkotlin/Function0;", "", "getOnProceed", "()Lkotlin/jvm/functions/Function0;", "setOnProceed", "(Lkotlin/jvm/functions/Function0;)V", "hideLoading", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onProceedClicked", "onViewCreated", "view", "requireBinding", "setFee", "fees", "", "showLoading", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.users.ui.CashoutFeesDialog$Dialog */
    /* loaded from: classes.dex */
    public static final class Dialog extends h implements BaseViewBinder<ViewUsersCashoutFeeDialogBinding> {
        private final /* synthetic */ BaseViewBinderImpl<ViewUsersCashoutFeeDialogBinding> $$delegate_0;
        private InterfaceC11756a<C13666w> onProceed;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public Dialog() {
            BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
            this.$$delegate_0 = $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private final void onProceedClicked() {
            InterfaceC11756a $r1 = this.onProceed;
            if ($r1 == null) {
                return;
            }
            $r1.invoke();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
        public static final void m41477onViewCreated$lambda0(Dialog dialog, View view) {
            Log_OC.getArray(dialog, "this$0");
            dialog.onProceedClicked();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
        public ViewUsersCashoutFeeDialogBinding getBinding() {
            BaseViewBinderImpl $r2 = this.$$delegate_0;
            InterfaceC8209a $r1 = $r2.getBinding();
            ViewUsersCashoutFeeDialogBinding $r3 = (ViewUsersCashoutFeeDialogBinding) $r1;
            return $r3;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
        public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
            ViewUsersCashoutFeeDialogBinding $r1 = getBinding();
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final InterfaceC11756a getOnProceed() {
            InterfaceC11756a r1 = this.onProceed;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void hideLoading() {
            ViewUsersCashoutFeeDialogBinding $r1 = requireBinding();
            Button $r2 = $r1.proceedButton;
            Log_OC.loadImage($r2, "requireBinding().proceedButton");
            ViewExtKt.enable($r2);
            ViewUsersCashoutFeeDialogBinding $r12 = requireBinding();
            ProgressBar $r3 = $r12.loadingProgressBar;
            Log_OC.loadImage($r3, "requireBinding().loadingProgressBar");
            ViewExtKt.hide$default($r3, false, 1, null);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public View initBinding(ViewUsersCashoutFeeDialogBinding viewUsersCashoutFeeDialogBinding, Fragment fragment) {
            Log_OC.getArray(viewUsersCashoutFeeDialogBinding, "binding");
            Log_OC.getArray(fragment, "fragment");
            BaseViewBinderImpl $r4 = this.$$delegate_0;
            View $r2 = $r4.initBinding(viewUsersCashoutFeeDialogBinding, fragment);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
        public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
            ViewUsersCashoutFeeDialogBinding $r4 = (ViewUsersCashoutFeeDialogBinding) interfaceC8209a;
            View $r2 = initBinding($r4, fragment);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            Log_OC.getArray(layoutInflater, "inflater");
            ViewUsersCashoutFeeDialogBinding $r4 = ViewUsersCashoutFeeDialogBinding.inflate(layoutInflater, viewGroup, false);
            Log_OC.loadImage($r4, "inflate(\n                    inflater, container,\n                    false\n                )");
            View $r5 = initBinding($r4, (Fragment) this);
            return $r5;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public void onViewCreated(View view, Bundle bundle) {
            Log_OC.getArray(view, "view");
            super.onViewCreated(view, bundle);
            ViewUsersCashoutFeeDialogBinding $r1 = requireBinding();
            Button $r4 = $r1.proceedButton;
            $r4.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.users.ui.e
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    CashoutFeesDialog.Dialog $r2 = CashoutFeesDialog.Dialog.this;
                    CashoutFeesDialog.Dialog.m41477onViewCreated$lambda0($r2, view2);
                }
            });
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
        public ViewUsersCashoutFeeDialogBinding requireBinding() {
            BaseViewBinderImpl $r2 = this.$$delegate_0;
            InterfaceC8209a $r1 = $r2.requireBinding();
            ViewUsersCashoutFeeDialogBinding $r3 = (ViewUsersCashoutFeeDialogBinding) $r1;
            return $r3;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
        public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
            ViewUsersCashoutFeeDialogBinding $r1 = requireBinding();
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void setFee(String str) {
            Log_OC.getArray(str, "fees");
            ViewUsersCashoutFeeDialogBinding $r3 = requireBinding();
            TextView $r4 = $r3.feesTextView;
            StringBuilder $r1 = new StringBuilder();
            Context $r5 = getContext();
            String $r6 = $r5 == null ? null : $r5.getString(C0001R.string.naira_short_code);
            $r1.append((Object) $r6);
            $r1.append(' ');
            $r1.append(str);
            String $r2 = $r1.toString();
            $r4.setText($r2);
        }

        public final void setOnProceed(InterfaceC11756a interfaceC11756a) {
            this.onProceed = interfaceC11756a;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void showLoading() {
            ViewUsersCashoutFeeDialogBinding $r1 = requireBinding();
            Button $r2 = $r1.proceedButton;
            Log_OC.loadImage($r2, "requireBinding().proceedButton");
            ViewExtKt.disable($r2);
            ViewUsersCashoutFeeDialogBinding $r12 = requireBinding();
            ProgressBar $r3 = $r12.loadingProgressBar;
            Log_OC.loadImage($r3, "requireBinding().loadingProgressBar");
            ViewExtKt.show($r3);
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
    public CashoutFeesDialog(PerformServiceFeeLookup performServiceFeeLookup) {
        Log_OC.getArray(performServiceFeeLookup, "feesLookup");
        this.feesLookup = performServiceFeeLookup;
        Dialog $r2 = new Dialog();
        this.dialog = $r2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: show$lambda-0  reason: not valid java name */
    public static final void m41475show$lambda0(CashoutFeesDialog cashoutFeesDialog, FeesLookupResponse feesLookupResponse) {
        Log_OC.getArray(cashoutFeesDialog, "this$0");
        Dialog $r2 = cashoutFeesDialog.dialog;
        boolean $z0 = $r2.isVisible();
        if ($z0) {
            Dialog $r22 = cashoutFeesDialog.dialog;
            String $r3 = feesLookupResponse.getServiceFee();
            $r22.setFee($r3);
            Dialog $r23 = cashoutFeesDialog.dialog;
            $r23.hideLoading();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: show$lambda-1  reason: not valid java name */
    public static final void m41476show$lambda1(CashoutFeesDialog cashoutFeesDialog, Throwable th) {
        Log_OC.getArray(cashoutFeesDialog, "this$0");
        Dialog $r2 = cashoutFeesDialog.dialog;
        boolean $z0 = $r2.isVisible();
        if ($z0) {
            InterfaceC11756a $r3 = cashoutFeesDialog.getOnErrorListener();
            if ($r3 != null) {
                $r3.invoke();
            }
            Dialog $r22 = cashoutFeesDialog.dialog;
            $r22.dismiss();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void dismiss() {
        Dialog $r1 = this.dialog;
        $r1.dismiss();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11756a getOnErrorListener() {
        InterfaceC11756a r1 = this.onErrorListener;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11756a getOnProceedClicked() {
        InterfaceC11756a r1 = this.onProceedClicked;
        return r1;
    }

    public final void setOnErrorListener(InterfaceC11756a interfaceC11756a) {
        this.onErrorListener = interfaceC11756a;
    }

    public final void setOnProceedClicked(InterfaceC11756a interfaceC11756a) {
        this.onProceedClicked = interfaceC11756a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void show(FragmentManager fragmentManager, String str) {
        Log_OC.getArray(fragmentManager, "fm");
        Log_OC.getArray(str, TransactionField.AMOUNT);
        Dialog $r4 = this.dialog;
        $r4.show(fragmentManager, INNER_DIALOG_TAG);
        PerformServiceFeeLookup $r5 = this.feesLookup;
        FeesLookupRequest $r6 = new FeesLookupRequest("cashout", str, "cashout");
        AbstractC11688p $r1 = $r5.execute($r6);
        $r1.e0(new Object() { // from class: ai.kudi.agent.users.ui.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CashoutFeesDialog $r12 = CashoutFeesDialog.this;
                FeesLookupResponse $r3 = (FeesLookupResponse) obj;
                CashoutFeesDialog.m41475show$lambda0($r12, $r3);
            }
        }, new Object() { // from class: ai.kudi.agent.users.ui.Logger
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CashoutFeesDialog $r12 = CashoutFeesDialog.this;
                Throwable $r3 = (Throwable) obj;
                CashoutFeesDialog.m41476show$lambda1($r12, $r3);
            }
        });
        Dialog $r42 = this.dialog;
        CashoutFeesDialog$show$3 $r9 = new CashoutFeesDialog$show$3(this);
        $r42.setOnProceed($r9);
    }
}
