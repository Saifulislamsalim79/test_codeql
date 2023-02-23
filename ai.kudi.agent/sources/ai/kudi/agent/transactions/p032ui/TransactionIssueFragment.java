package ai.kudi.agent.transactions.p032ui;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.databinding.FragmentTransactionIssueBinding;
import ai.kudi.agent.issues.p008ui.IssueTypeFragment;
import ai.kudi.agent.issues.viewmodels.model.IssueTypeModelWithDuplicateChecker;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.transactions.presenters.TransactionIssuePresenter;
import ai.kudi.agent.transactions.views.TransactionIssueView;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.AbstractC9412c;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
/* compiled from: TransactionIssueFragment.kt */
@Metadata(m10422d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001+B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0096\u0001J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J$\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\t\u0010\"\u001a\u00020\u0005H\u0096\u0001J(\u0010#\u001a\u00020\u00112\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&0%j\u0002`'2\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0011H\u0016R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006,"}, m10421d2 = {"Lai/kudi/agent/transactions/ui/TransactionIssueFragment;", "Lcom/hannesdorfmann/mosby3/mvp/MvpFragment;", "Lai/kudi/agent/transactions/views/TransactionIssueView;", "Lai/kudi/agent/transactions/presenters/TransactionIssuePresenter;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/FragmentTransactionIssueBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/databinding/FragmentTransactionIssueBinding;", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/transactions/presenters/TransactionIssuePresenter;", "setThisPresenter", "(Lai/kudi/agent/transactions/presenters/TransactionIssuePresenter;)V", "createPresenter", "hideLoader", "", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "requireBinding", "showIssues", "transaction", "Ljava/util/HashMap;", "", "Lai/kudi/agent/transactions/domain/dto/Transaction;", "issueTypeModelWithDuplicateChecker", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModelWithDuplicateChecker;", "showLoader", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactions.ui.TransactionIssueFragment */
/* loaded from: classes.dex */
public final class TransactionIssueFragment extends AbstractC9412c<TransactionIssueView, TransactionIssuePresenter> implements TransactionIssueView, BaseViewBinder<FragmentTransactionIssueBinding> {
    private static final String ARGS_TRANSACTION = "args_transaction";
    public static final Companion Companion;
    private final /* synthetic */ BaseViewBinderImpl<FragmentTransactionIssueBinding> $$delegate_0;
    public TransactionIssuePresenter thisPresenter;

    /* compiled from: TransactionIssueFragment.kt */
    @Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00062\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bj\u0004\u0018\u0001`\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/transactions/ui/TransactionIssueFragment$Companion;", "", "()V", "ARGS_TRANSACTION", "", "newInstance", "Lai/kudi/agent/transactions/ui/TransactionIssueFragment;", "transaction", "Ljava/util/HashMap;", "Lai/kudi/agent/transactions/domain/dto/Transaction;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transactions.ui.TransactionIssueFragment$Companion */
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
        public final TransactionIssueFragment newInstance(HashMap hashMap) {
            TransactionIssueFragment r5 = new TransactionIssueFragment();
            Bundle r6 = new Bundle();
            r6.putSerializable(TransactionIssueFragment.ARGS_TRANSACTION, hashMap);
            C13666w c13666w = C13666w.f30112a;
            TransactionIssueFragment r7 = r5;
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
    public TransactionIssueFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public TransactionIssuePresenter createPresenter() {
        TransactionIssuePresenter $r1 = getThisPresenter();
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
    public FragmentTransactionIssueBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentTransactionIssueBinding $r3 = (FragmentTransactionIssueBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentTransactionIssueBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TransactionIssuePresenter getThisPresenter() {
        TransactionIssuePresenter $r1 = this.thisPresenter;
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
    @Override // ai.kudi.agent.transactions.views.TransactionIssueView
    public void hideLoader() {
        FragmentTransactionIssueBinding $r1 = requireBinding();
        ProgressBar $r2 = $r1.progressBar;
        Log_OC.loadImage($r2, "requireBinding().progressBar");
        ViewExtKt.hide$default($r2, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentTransactionIssueBinding fragmentTransactionIssueBinding, Fragment fragment) {
        Log_OC.getArray(fragmentTransactionIssueBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentTransactionIssueBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentTransactionIssueBinding $r4 = (FragmentTransactionIssueBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        TransactionIssueFragment r5 = this;
        super.onAttach(context);
        BaseApplication.Companion $r2 = BaseApplication.Companion;
        BaseApplication $r3 = $r2.getApplication();
        ApplicationComponent $r4 = $r3.initializeComponent();
        $r4.inject(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentTransactionIssueBinding $r4 = FragmentTransactionIssueBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        TransactionIssueFragment r6 = this;
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
        TransactionIssuePresenter $r3 = getThisPresenter();
        TransactionIssueFragment r8 = this;
        Bundle $r2 = r8.requireArguments();
        Serializable $r4 = $r2.getSerializable(ARGS_TRANSACTION);
        if ($r4 == null) {
            NullPointerException r7 = new NullPointerException("null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>{ ai.kudi.agent.transactions.domain.dto.TransactionKt.Transaction }");
            throw r7;
        }
        HashMap $r5 = (HashMap) $r4;
        $r3.fetchIssues($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentTransactionIssueBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentTransactionIssueBinding $r3 = (FragmentTransactionIssueBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentTransactionIssueBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setThisPresenter(TransactionIssuePresenter transactionIssuePresenter) {
        Log_OC.getArray(transactionIssuePresenter, "<set-?>");
        this.thisPresenter = transactionIssuePresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactions.views.TransactionIssueView
    public void showIssues(HashMap hashMap, IssueTypeModelWithDuplicateChecker issueTypeModelWithDuplicateChecker) {
        Log_OC.getArray(hashMap, "transaction");
        Log_OC.getArray(issueTypeModelWithDuplicateChecker, "issueTypeModelWithDuplicateChecker");
        IssueTypeFragment.Companion $r3 = IssueTypeFragment.Companion;
        Object $r4 = hashMap.get("reference");
        String $r5 = (String) $r4;
        Object $r42 = hashMap.get(TransactionField.AMOUNT);
        String $r6 = (String) $r42;
        Object $r43 = hashMap.get("type");
        IssueTypeFragment $r8 = $r3.newInstance($r5, $r6, (String) $r43, issueTypeModelWithDuplicateChecker);
        AppCompatActivityExtKt.startFragmentInFragment$default(this, $r8, C0001R.C0003id.transactionIssueContainer, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactions.views.TransactionIssueView
    public void showLoader() {
        FragmentTransactionIssueBinding $r1 = requireBinding();
        ProgressBar $r2 = $r1.progressBar;
        Log_OC.loadImage($r2, "requireBinding().progressBar");
        ViewExtKt.show($r2);
    }
}
