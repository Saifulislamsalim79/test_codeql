package ai.kudi.agent.p036v2.productSearch.fragment;

import androidx.lifecycle.C1582t;
import androidx.lifecycle.InterfaceC1555g;
import androidx.lifecycle.PreferenceActivity;
import androidx.lifecycle.Scope;
/* renamed from: ai.kudi.agent.v2.productSearch.fragment.ProductSearchFragment_LifecycleAdapter */
/* loaded from: classes.dex */
public class ProductSearchFragment_LifecycleAdapter implements InterfaceC1555g {
    final ProductSearchFragment mReceiver;

    ProductSearchFragment_LifecycleAdapter(ProductSearchFragment productSearchFragment) {
        this.mReceiver = productSearchFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void callMethods(PreferenceActivity preferenceActivity, Scope scope, boolean z, C1582t c1582t) {
        boolean $z1 = c1582t != null;
        if (z) {
            return;
        }
        Scope $r4 = Scope.ON_DESTROY;
        if (scope == $r4) {
            if ($z1) {
                boolean $z0 = c1582t.m35482a("onDestroyView", 1);
                if (!$z0) {
                    return;
                }
            }
            ProductSearchFragment $r5 = this.mReceiver;
            $r5.onDestroyView();
        }
    }
}
