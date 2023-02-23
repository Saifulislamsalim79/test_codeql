package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.product.airtime_data.p017ui.AirtimeAmountFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class ProductActivityModule_InjectAirtimeAmountFragment {

    /* loaded from: classes.dex */
    public interface AirtimeAmountFragmentSubcomponent extends b<AirtimeAmountFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<AirtimeAmountFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private ProductActivityModule_InjectAirtimeAmountFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(AirtimeAmountFragmentSubcomponent.Factory factory);
}
