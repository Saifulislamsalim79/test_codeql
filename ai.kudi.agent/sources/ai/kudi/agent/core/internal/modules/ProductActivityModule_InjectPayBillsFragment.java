package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.product.other_bills.p018ui.PayBillsFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class ProductActivityModule_InjectPayBillsFragment {

    /* loaded from: classes.dex */
    public interface PayBillsFragmentSubcomponent extends b<PayBillsFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<PayBillsFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private ProductActivityModule_InjectPayBillsFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(PayBillsFragmentSubcomponent.Factory factory);
}
