package ai.kudi.agent.core.mvvm;

import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.mvvm.AndroidLifecycle;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1565i;
import androidx.lifecycle.C1556g0;
import androidx.lifecycle.C1564h0;
import androidx.lifecycle.Extension;
import com.trello.rxlifecycle2.FileStorage;
import com.trello.rxlifecycle2.p194g.C7392a;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p471k0.C11678a;
import p590o.p591a.Timber;
/* compiled from: BaseMVVMViewBindingFragment.kt */
@Metadata(m10422d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\b\b\u0001\u0010\u0003*\u00020\u0004*\b\b\u0002\u0010\u0005*\u00020\u00062\u00020\u00072\b\u0012\u0004\u0012\u0002H\u00050\bB\u0005¢\u0006\u0002\u0010\tJ\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00028\u0001H$¢\u0006\u0002\u0010\u0017J\r\u0010\u0018\u001a\u00028\u0000H$¢\u0006\u0002\u0010\u0019J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH$J\r\u0010\u001c\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010\u0019J\u001e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00028\u00022\u0006\u0010\u001f\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0002\u0010 J\u0012\u0010!\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010#H\u0017J\u000e\u0010$\u001a\u00028\u0002H\u0096\u0001¢\u0006\u0002\u0010\fR\u0014\u0010\n\u001a\u0004\u0018\u00018\u0002X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\u0013¨\u0006%"}, m10421d2 = {"Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "VM", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "State", "Lai/kudi/agent/core/mvvm/ViewData;", "VB", "Landroidx/viewbinding/ViewBinding;", "Landroidx/fragment/app/Fragment;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "()V", "binding", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "lifecycleProvider", "Lcom/trello/rxlifecycle2/LifecycleProvider;", "Landroidx/lifecycle/Lifecycle$Event;", "getLifecycleProvider", "()Lcom/trello/rxlifecycle2/LifecycleProvider;", "theViewModel", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "applyViewData", "", "viewData", "(Lai/kudi/agent/core/mvvm/ViewData;)V", "createViewModel", "()Lai/kudi/agent/core/mvvm/BaseViewModel;", "getVMType", "Ljava/lang/Class;", "getViewModel", "initBinding", "Landroid/view/View;", "fragment", "(Landroidx/viewbinding/ViewBinding;Landroidx/fragment/app/Fragment;)Landroid/view/View;", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "requireBinding", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class BaseMVVMViewBindingFragment<VM extends BaseViewModel<State>, State extends ViewData, VB extends InterfaceC8209a> extends Fragment implements BaseViewBinder<VB> {
    private final /* synthetic */ BaseViewBinderImpl<VB> $$delegate_0;
    private final com.trello.rxlifecycle2.b<AbstractC1565i.b> lifecycleProvider;
    private VM theViewModel;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BaseMVVMViewBindingFragment() {
        BaseViewBinderImpl $r2 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r2;
        AndroidLifecycle.Companion $r3 = AndroidLifecycle.Companion;
        FileStorage $r1 = $r3.createLifecycleProvider(this);
        this.lifecycleProvider = $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onActivityCreated$lambda-0  reason: not valid java name */
    public static final void m39162onActivityCreated$lambda0(BaseMVVMViewBindingFragment baseMVVMViewBindingFragment, ViewData viewData) {
        Log_OC.getArray(baseMVVMViewBindingFragment, "this$0");
        Log_OC.loadImage(viewData, "it");
        baseMVVMViewBindingFragment.applyViewData(viewData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onActivityCreated$lambda-1  reason: not valid java name */
    public static final void m39163onActivityCreated$lambda1(Throwable th) {
        Timber.reorder(th);
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
    }

    protected abstract void applyViewData(ViewData viewData);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract BaseViewModel createViewModel();

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public InterfaceC8209a getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected final FileStorage getLifecycleProvider() {
        return this.lifecycleProvider;
    }

    protected abstract Class getVMType();

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final BaseViewModel getViewModel() {
        BaseViewModel $r1 = this.theViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("theViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        Log_OC.getArray(interfaceC8209a, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(interfaceC8209a, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C1556g0 $r4 = C1564h0.m35520a(this, new C1556g0.InterfaceC1559b() { // from class: ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment$onActivityCreated$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public Extension create(Class cls) {
                Log_OC.getArray(cls, "modelClass");
                BaseMVVMViewBindingFragment $r3 = BaseMVVMViewBindingFragment.this;
                BaseViewModel $r1 = $r3.createViewModel();
                return $r1;
            }
        });
        Class $r5 = getVMType();
        Extension $r6 = $r4.m35533a((Class<Extension>) $r5);
        Log_OC.loadImage($r6, "@SuppressLint(\"CheckResult\")\n    override fun onActivityCreated(savedInstanceState: Bundle?) {\n        super.onActivityCreated(savedInstanceState)\n        theViewModel = ViewModelProviders.of(\n            this,\n            object : ViewModelProvider.Factory {\n                @Suppress(\"UNCHECKED_CAST\")\n                override fun <T : ViewModel?> create(modelClass: Class<T>): T {\n                    return createViewModel() as T\n                }\n            }\n        ).get(getVMType())\n        theViewModel.viewData.bindToLifecycle(lifecycleProvider)\n            .subscribe(\n                { applyViewData(it) },\n                {\n                    Timber.e(it)\n                    CrashlyticsReport.logException(it)\n                }\n            )\n    }");
        VM vm = (VM) $r6;
        this.theViewModel = vm;
        if (vm == null) {
            Log_OC.LogError("theViewModel");
            NullPointerException r12 = new NullPointerException("Null throw statement replaced by Soot");
            throw r12;
        }
        C11678a $r8 = vm.getViewData();
        AbstractC11688p $r10 = C7392a.a((AbstractC11688p) $r8, (FileStorage) this.lifecycleProvider);
        Object object = new Object() { // from class: ai.kudi.agent.core.mvvm.FlingerListView$ItemFlingerResponder
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                BaseMVVMViewBindingFragment $r1 = BaseMVVMViewBindingFragment.this;
                ViewData $r3 = (ViewData) obj;
                BaseMVVMViewBindingFragment.m39162onActivityCreated$lambda0($r1, $r3);
            }
        };
        Label $r1 = Label.f203b;
        $r10.e0(object, $r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public InterfaceC8209a requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        return $r1;
    }
}
