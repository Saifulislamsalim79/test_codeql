package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.product.other_bills.p018ui.BillPaymentStepOneFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class ProductActivityModule_InjectBillPaymentStepOneFragment {

    /* loaded from: classes.dex */
    public interface BillPaymentStepOneFragmentSubcomponent extends b<BillPaymentStepOneFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<BillPaymentStepOneFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private ProductActivityModule_InjectBillPaymentStepOneFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(BillPaymentStepOneFragmentSubcomponent.Factory factory);
}
