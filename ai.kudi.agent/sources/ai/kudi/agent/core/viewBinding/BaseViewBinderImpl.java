package ai.kudi.agent.core.viewBinding;

import ai.kudi.agent.bills.data.BillerKt;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1565i;
import androidx.lifecycle.PreferenceActivity;
import androidx.lifecycle.n;
import kotlin.Metadata;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p493j0.InterfaceC11863b;
import p201g.p270x.InterfaceC8209a;
/* compiled from: BaseViewBinder.kt */
@Metadata(m10422d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u001d\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0013H\u0016¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0007J\r\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\bR\u001e\u0010\u0006\u001a\u0004\u0018\u00018\u0000X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m10421d2 = {"Lai/kudi/agent/core/viewBinding/BaseViewBinderImpl;", "VB", "Landroidx/viewbinding/ViewBinding;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Landroidx/lifecycle/LifecycleObserver;", "()V", "binding", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "setBinding", "(Landroidx/viewbinding/ViewBinding;)V", "Landroidx/viewbinding/ViewBinding;", "fragmentName", "", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/viewbinding/ViewBinding;Landroidx/fragment/app/Fragment;)Landroid/view/View;", "onDestroyView", "", "requireBinding", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class BaseViewBinderImpl<VB extends InterfaceC8209a> implements BaseViewBinder<VB>, n {
    private VB binding;
    private String fragmentName;
    private AbstractC1565i lifecycle;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public InterfaceC8209a getBinding() {
        InterfaceC8209a r1 = this.binding;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        Log_OC.getArray(interfaceC8209a, "binding");
        Log_OC.getArray(fragment, "fragment");
        setBinding(interfaceC8209a);
        PreferenceActivity $r3 = fragment.getViewLifecycleOwner();
        AbstractC1565i $r4 = $r3.getLifecycle();
        this.lifecycle = $r4;
        if ($r4 != null) {
            $r4.a(this);
        }
        Class $r5 = fragment.getClass();
        InterfaceC11863b $r6 = C11813x.m10316b($r5);
        String $r7 = $r6.mo10139g();
        String $r8 = $r7;
        if ($r7 == null) {
            $r8 = BillerKt.NAMEPROMPT_NA;
        }
        this.fragmentName = $r8;
        View $r9 = interfaceC8209a.getRoot();
        Log_OC.loadImage($r9, "binding.root");
        return $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onDestroyView() {
        AbstractC1565i $r1 = this.lifecycle;
        if ($r1 != null) {
            $r1.c(this);
        }
        this.lifecycle = null;
        setBinding(null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public InterfaceC8209a requireBinding() {
        InterfaceC8209a $r1 = getBinding();
        if ($r1 == null) {
            StringBuilder $r3 = new StringBuilder();
            $r3.append("Cannot access binding outside ");
            String $r4 = this.fragmentName;
            if ($r4 == null) {
                Log_OC.LogError("fragmentName");
                NullPointerException r5 = new NullPointerException("Null throw statement replaced by Soot");
                throw r5;
            }
            $r3.append($r4);
            $r3.append(" lifecycle");
            IllegalStateException $r2 = new IllegalStateException($r3.toString());
            throw $r2;
        }
        return $r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBinding(InterfaceC8209a interfaceC8209a) {
        this.binding = interfaceC8209a;
    }
}
