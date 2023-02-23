package ai.kudi.agent.pos.p016ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.databinding.LayoutFundWalletBottomSheetBinding;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C4552b;
import com.google.android.material.bottomsheet.DialogC4547a;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: FundWalletBottomSheet.kt */
@Metadata(m10422d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u001d\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0096\u0001J\u0012\u0010\u0011\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\t\u0010\u001b\u001a\u00020\u0003H\u0096\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m10421d2 = {"Lai/kudi/agent/pos/ui/FundWalletBottomSheet;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/LayoutFundWalletBottomSheetBinding;", TransactionField.AMOUNT, "", "onFundWalletClicked", "Lkotlin/Function0;", "", "(DLkotlin/jvm/functions/Function0;)V", "binding", "getBinding", "()Lai/kudi/agent/databinding/LayoutFundWalletBottomSheetBinding;", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "requireBinding", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.pos.ui.FundWalletBottomSheet */
/* loaded from: classes.dex */
public final class FundWalletBottomSheet extends C4552b implements BaseViewBinder<LayoutFundWalletBottomSheetBinding> {
    private final /* synthetic */ BaseViewBinderImpl<LayoutFundWalletBottomSheetBinding> $$delegate_0;
    private final double amount;
    private final InterfaceC11756a<C13666w> onFundWalletClicked;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FundWalletBottomSheet(double d, InterfaceC11756a interfaceC11756a) {
        Log_OC.getArray(interfaceC11756a, "onFundWalletClicked");
        this.amount = d;
        this.onFundWalletClicked = interfaceC11756a;
        BaseViewBinderImpl $r2 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ FundWalletBottomSheet(double r1, kotlin.p483e0.p484c.InterfaceC11756a r3, int r4, kotlin.p483e0.p485d.DBUtils$1 r5) {
        /*
            r0 = this;
            r4 = r4 & 1
            if (r4 == 0) goto L6
            r1 = 0
        L6:
            r0.<init>(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.pos.p016ui.FundWalletBottomSheet.<init>(double, kotlin.e0.c.a, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m40037onViewCreated$lambda1(FundWalletBottomSheet fundWalletBottomSheet, View view) {
        Log_OC.getArray(fundWalletBottomSheet, "this$0");
        InterfaceC11756a $r2 = fundWalletBottomSheet.onFundWalletClicked;
        $r2.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-2  reason: not valid java name */
    public static final void m40038onViewCreated$lambda2(FundWalletBottomSheet fundWalletBottomSheet, View view) {
        Log_OC.getArray(fundWalletBottomSheet, "this$0");
        fundWalletBottomSheet.dismiss();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public LayoutFundWalletBottomSheetBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        LayoutFundWalletBottomSheetBinding $r3 = (LayoutFundWalletBottomSheetBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        LayoutFundWalletBottomSheetBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(LayoutFundWalletBottomSheetBinding layoutFundWalletBottomSheetBinding, Fragment fragment) {
        Log_OC.getArray(layoutFundWalletBottomSheetBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(layoutFundWalletBottomSheetBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        LayoutFundWalletBottomSheetBinding $r4 = (LayoutFundWalletBottomSheetBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onCreate(Bundle bundle) {
        Chapter r2 = (Chapter) this;
        super/*androidx.fragment.app.Chapter*/.onCreate(bundle);
        Chapter r22 = (Chapter) this;
        r22.setStyle(0, C0001R.style.CustomBottomSheetDialogTheme);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        Fragment r6 = (Fragment) this;
        LayoutInflater $r1 = r6.getLayoutInflater();
        LayoutFundWalletBottomSheetBinding $r4 = LayoutFundWalletBottomSheetBinding.inflate($r1, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(layoutInflater, container, false)");
        Fragment r62 = (Fragment) this;
        View $r5 = initBinding($r4, r62);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onViewCreated(View view, Bundle bundle) {
        BottomSheetBehavior $r5;
        Log_OC.getArray(view, "view");
        Fragment r16 = (Fragment) this;
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        Chapter r17 = (Chapter) this;
        Dialog $r3 = r17.getDialog();
        boolean $z0 = $r3 instanceof DialogC4547a;
        DialogC4547a $r4 = $z0 ? (DialogC4547a) $r3 : null;
        if ($r4 != null && ($r5 = $r4.getBehavior()) != null) {
            $r5.m27437q0(3);
            $r5.m27448i0(true);
        }
        LayoutFundWalletBottomSheetBinding $r6 = requireBinding();
        TextView $r7 = $r6.fundWalletText;
        double $d0 = this.amount;
        Double $r9 = Double.valueOf($d0);
        Object[] $r8 = {$r9};
        Fragment r162 = (Fragment) this;
        String $r10 = r162.getString(C0001R.string.fund_wallet_pos_screen, $r8);
        $r7.setText($r10);
        LayoutFundWalletBottomSheetBinding $r62 = requireBinding();
        ViewGroup $r11 = $r62.fundWalletButton;
        ViewGroup r18 = $r11;
        r18.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.pos.ui.h
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FundWalletBottomSheet $r2 = FundWalletBottomSheet.this;
                FundWalletBottomSheet.m40037onViewCreated$lambda1($r2, view2);
            }
        });
        LayoutFundWalletBottomSheetBinding $r63 = requireBinding();
        TextView $r72 = $r63.closeButton;
        $r72.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.pos.ui.TimePicker$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FundWalletBottomSheet $r2 = FundWalletBottomSheet.this;
                FundWalletBottomSheet.m40038onViewCreated$lambda2($r2, view2);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public LayoutFundWalletBottomSheetBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        LayoutFundWalletBottomSheetBinding $r3 = (LayoutFundWalletBottomSheetBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        LayoutFundWalletBottomSheetBinding $r1 = requireBinding();
        return $r1;
    }
}
