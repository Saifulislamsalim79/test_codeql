package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.product.p019ui.ProductSummaryFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class ProductActivityModule_InjectProductSummaryFragment {

    /* loaded from: classes.dex */
    public interface ProductSummaryFragmentSubcomponent extends b<ProductSummaryFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<ProductSummaryFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private ProductActivityModule_InjectProductSummaryFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(ProductSummaryFragmentSubcomponent.Factory factory);
}
