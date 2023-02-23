package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.transactionhistory.p031ui.view.FilterTransactionsFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class HomeActivityModule_InjectFilterTransactionsFragment {

    /* loaded from: classes.dex */
    public interface FilterTransactionsFragmentSubcomponent extends b<FilterTransactionsFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<FilterTransactionsFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private HomeActivityModule_InjectFilterTransactionsFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(FilterTransactionsFragmentSubcomponent.Factory factory);
}
