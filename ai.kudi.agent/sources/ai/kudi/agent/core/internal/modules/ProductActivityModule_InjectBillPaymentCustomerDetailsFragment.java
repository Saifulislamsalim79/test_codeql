package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.product.other_bills.p018ui.BillPaymentCustomerDetailsFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class ProductActivityModule_InjectBillPaymentCustomerDetailsFragment {

    /* loaded from: classes.dex */
    public interface BillPaymentCustomerDetailsFragmentSubcomponent extends b<BillPaymentCustomerDetailsFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<BillPaymentCustomerDetailsFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private ProductActivityModule_InjectBillPaymentCustomerDetailsFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(BillPaymentCustomerDetailsFragmentSubcomponent.Factory factory);
}
