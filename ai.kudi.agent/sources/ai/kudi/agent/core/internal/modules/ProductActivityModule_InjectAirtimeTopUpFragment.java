package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.product.airtime_data.p017ui.AirtimeTopUpFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class ProductActivityModule_InjectAirtimeTopUpFragment {

    /* loaded from: classes.dex */
    public interface AirtimeTopUpFragmentSubcomponent extends b<AirtimeTopUpFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<AirtimeTopUpFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private ProductActivityModule_InjectAirtimeTopUpFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(AirtimeTopUpFragmentSubcomponent.Factory factory);
}
