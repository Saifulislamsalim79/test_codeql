package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.product.other_bills.p018ui.AmountFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class ProductActivityModule_InjectAmountFragment {

    /* loaded from: classes.dex */
    public interface AmountFragmentSubcomponent extends b<AmountFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<AmountFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private ProductActivityModule_InjectAmountFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(AmountFragmentSubcomponent.Factory factory);
}
