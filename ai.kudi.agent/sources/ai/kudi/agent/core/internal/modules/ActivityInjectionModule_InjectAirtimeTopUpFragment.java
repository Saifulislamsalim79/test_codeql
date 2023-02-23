package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.product.p019ui.ProductActivity;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class ActivityInjectionModule_InjectAirtimeTopUpFragment {

    /* loaded from: classes.dex */
    public interface ProductActivitySubcomponent extends b<ProductActivity> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<ProductActivity> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private ActivityInjectionModule_InjectAirtimeTopUpFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(ProductActivitySubcomponent.Factory factory);
}
