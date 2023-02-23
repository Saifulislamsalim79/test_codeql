package ai.kudi.agent.core.mvvm;

import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.mvvm.AndroidLifecycle;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import android.os.Bundle;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1565i;
import androidx.lifecycle.C1556g0;
import androidx.lifecycle.C1564h0;
import androidx.lifecycle.Extension;
import androidx.lifecycle.PreferenceActivity;
import com.google.android.material.bottomsheet.C4552b;
import com.trello.rxlifecycle2.FileStorage;
import com.trello.rxlifecycle2.p194g.C7392a;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p471k0.C11678a;
import p590o.p591a.Timber;
/* compiled from: BaseMvvmBottomSheetFragment.kt */
@Metadata(m10422d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u0001H$¢\u0006\u0002\u0010\u0011J\r\u0010\u0012\u001a\u00028\u0000H$¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H$J\r\u0010\u0016\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010\u0013J\u0012\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0017R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u001a"}, m10421d2 = {"Lai/kudi/agent/core/mvvm/BaseMvvmBottomSheetFragment;", "VM", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "State", "Lai/kudi/agent/core/mvvm/ViewData;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "lifecycleProvider", "Lcom/trello/rxlifecycle2/LifecycleProvider;", "Landroidx/lifecycle/Lifecycle$Event;", "getLifecycleProvider", "()Lcom/trello/rxlifecycle2/LifecycleProvider;", "theViewModel", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "applyViewData", "", "viewData", "(Lai/kudi/agent/core/mvvm/ViewData;)V", "createViewModel", "()Lai/kudi/agent/core/mvvm/BaseViewModel;", "getVMType", "Ljava/lang/Class;", "getViewModel", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class BaseMvvmBottomSheetFragment<VM extends BaseViewModel<State>, State extends ViewData> extends C4552b {
    private final com.trello.rxlifecycle2.b<AbstractC1565i.b> lifecycleProvider;
    private VM theViewModel;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BaseMvvmBottomSheetFragment() {
        AndroidLifecycle.Companion $r2 = AndroidLifecycle.Companion;
        PreferenceActivity r3 = (PreferenceActivity) this;
        FileStorage $r1 = $r2.createLifecycleProvider(r3);
        this.lifecycleProvider = $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onActivityCreated$lambda-0  reason: not valid java name */
    public static final void m39164onActivityCreated$lambda0(BaseMvvmBottomSheetFragment baseMvvmBottomSheetFragment, ViewData viewData) {
        Log_OC.getArray(baseMvvmBottomSheetFragment, "this$0");
        Log_OC.loadImage(viewData, "it");
        baseMvvmBottomSheetFragment.applyViewData(viewData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onActivityCreated$lambda-1  reason: not valid java name */
    public static final void m39165onActivityCreated$lambda1(Throwable th) {
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
    protected final FileStorage getLifecycleProvider() {
        return this.lifecycleProvider;
    }

    protected abstract Class getVMType();

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected final BaseViewModel getViewModel() {
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
    public void onActivityCreated(Bundle bundle) {
        Chapter r15 = (Chapter) this;
        super/*androidx.fragment.app.Chapter*/.onActivityCreated(bundle);
        Fragment r16 = (Fragment) this;
        C1556g0 $r4 = C1564h0.m35520a(r16, new C1556g0.InterfaceC1559b() { // from class: ai.kudi.agent.core.mvvm.BaseMvvmBottomSheetFragment$onActivityCreated$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public Extension create(Class cls) {
                Log_OC.getArray(cls, "modelClass");
                BaseMvvmBottomSheetFragment $r3 = BaseMvvmBottomSheetFragment.this;
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
        Object object = new Object() { // from class: ai.kudi.agent.core.mvvm.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                BaseMvvmBottomSheetFragment $r1 = BaseMvvmBottomSheetFragment.this;
                ViewData $r3 = (ViewData) obj;
                BaseMvvmBottomSheetFragment.m39164onActivityCreated$lambda0($r1, $r3);
            }
        };
        Chunk $r1 = Chunk.NEWLINE;
        $r10.e0(object, $r1);
    }
}
