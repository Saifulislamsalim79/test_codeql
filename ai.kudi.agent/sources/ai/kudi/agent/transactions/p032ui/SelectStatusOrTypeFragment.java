package ai.kudi.agent.transactions.p032ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.databinding.FragmentSelectStatusOrTypeBinding;
import ai.kudi.agent.transactions.adapters.TransactionStatusAndTypeAdapter;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: SelectStatusOrTypeFragment.kt */
@Metadata(m10422d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 &2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001&B\u0005¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH\u0096\u0001J\u0012\u0010\u001b\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0012\u0010\u001e\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J$\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010$\u001a\u00020\fH\u0002J\t\u0010%\u001a\u00020\u0003H\u0096\u0001R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R.\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006'"}, m10421d2 = {"Lai/kudi/agent/transactions/ui/SelectStatusOrTypeFragment;", "Landroidx/fragment/app/DialogFragment;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/FragmentSelectStatusOrTypeBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/databinding/FragmentSelectStatusOrTypeBinding;", "callback", "Lkotlin/Function2;", "", "", "", "getCallback", "()Lkotlin/jvm/functions/Function2;", "setCallback", "(Lkotlin/jvm/functions/Function2;)V", "transactionStatusAndTypeAdapter", "Lai/kudi/agent/transactions/adapters/TransactionStatusAndTypeAdapter;", "getTransactionStatusAndTypeAdapter", "()Lai/kudi/agent/transactions/adapters/TransactionStatusAndTypeAdapter;", "setTransactionStatusAndTypeAdapter", "(Lai/kudi/agent/transactions/adapters/TransactionStatusAndTypeAdapter;)V", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "performSearch", "requireBinding", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactions.ui.SelectStatusOrTypeFragment */
/* loaded from: classes.dex */
public final class SelectStatusOrTypeFragment extends h implements BaseViewBinder<FragmentSelectStatusOrTypeBinding> {
    public static final Companion Companion;
    public static final String IS_STATUS = "Is_Status";
    private final /* synthetic */ BaseViewBinderImpl<FragmentSelectStatusOrTypeBinding> $$delegate_0;
    private InterfaceC11771p<? super String, ? super Integer, C13666w> callback;
    public TransactionStatusAndTypeAdapter transactionStatusAndTypeAdapter;

    /* compiled from: SelectStatusOrTypeFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/transactions/ui/SelectStatusOrTypeFragment$Companion;", "", "()V", "IS_STATUS", "", "newInstance", "Lai/kudi/agent/transactions/ui/SelectStatusOrTypeFragment;", "isType", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transactions.ui.SelectStatusOrTypeFragment$Companion */
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
        public static /* synthetic */ SelectStatusOrTypeFragment newInstance$default(Companion companion, boolean $z0, int i, Object obj) {
            int $i0 = i & 1;
            if ($i0 != 0) {
                $z0 = true;
            }
            SelectStatusOrTypeFragment $r0 = companion.newInstance($z0);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final SelectStatusOrTypeFragment newInstance(boolean z) {
            SelectStatusOrTypeFragment $r1 = new SelectStatusOrTypeFragment();
            Bundle $r2 = new Bundle();
            $r2.putBoolean(SelectStatusOrTypeFragment.IS_STATUS, z);
            C13666w c13666w = C13666w.f30112a;
            $r1.setArguments($r2);
            return $r1;
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
    public SelectStatusOrTypeFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onActivityCreated$lambda-3$lambda-2  reason: not valid java name */
    public static final void m41241onActivityCreated$lambda3$lambda2(SelectStatusOrTypeFragment selectStatusOrTypeFragment, View view) {
        Log_OC.getArray(selectStatusOrTypeFragment, "this$0");
        selectStatusOrTypeFragment.dismiss();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void performSearch() {
        FragmentSelectStatusOrTypeBinding $r2 = requireBinding();
        EditText $r3 = $r2.searchView;
        $r3.addTextChangedListener(new TextWatcher() { // from class: ai.kudi.agent.transactions.ui.SelectStatusOrTypeFragment$performSearch$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                SelectStatusOrTypeFragment $r22 = SelectStatusOrTypeFragment.this;
                TransactionStatusAndTypeAdapter $r32 = $r22.getTransactionStatusAndTypeAdapter();
                String $r4 = String.valueOf(charSequence);
                SelectStatusOrTypeFragment $r23 = SelectStatusOrTypeFragment.this;
                SelectStatusOrTypeFragment$performSearch$1$onTextChanged$1 $r5 = new SelectStatusOrTypeFragment$performSearch$1$onTextChanged$1($r23);
                $r32.search($r4, $r5);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentSelectStatusOrTypeBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentSelectStatusOrTypeBinding $r3 = (FragmentSelectStatusOrTypeBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentSelectStatusOrTypeBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11771p getCallback() {
        InterfaceC11771p r1 = this.callback;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TransactionStatusAndTypeAdapter getTransactionStatusAndTypeAdapter() {
        TransactionStatusAndTypeAdapter $r1 = this.transactionStatusAndTypeAdapter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("transactionStatusAndTypeAdapter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentSelectStatusOrTypeBinding fragmentSelectStatusOrTypeBinding, Fragment fragment) {
        Log_OC.getArray(fragmentSelectStatusOrTypeBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentSelectStatusOrTypeBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentSelectStatusOrTypeBinding $r4 = (FragmentSelectStatusOrTypeBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:10:0x0063 */
    /* JADX WARN: Incorrect condition in loop: B:15:0x0094 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityCreated(android.os.Bundle r26) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactions.p032ui.SelectStatusOrTypeFragment.onActivityCreated(android.os.Bundle):void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, C0001R.style.FullScreenDialogStyle);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentSelectStatusOrTypeBinding $r4 = FragmentSelectStatusOrTypeBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, (Fragment) this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentSelectStatusOrTypeBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentSelectStatusOrTypeBinding $r3 = (FragmentSelectStatusOrTypeBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentSelectStatusOrTypeBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setCallback(InterfaceC11771p interfaceC11771p) {
        this.callback = interfaceC11771p;
    }

    public final void setTransactionStatusAndTypeAdapter(TransactionStatusAndTypeAdapter transactionStatusAndTypeAdapter) {
        Log_OC.getArray(transactionStatusAndTypeAdapter, "<set-?>");
        this.transactionStatusAndTypeAdapter = transactionStatusAndTypeAdapter;
    }
}
