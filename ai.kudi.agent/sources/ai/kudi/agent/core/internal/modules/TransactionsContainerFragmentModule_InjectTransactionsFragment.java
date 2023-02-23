package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.transactionhistory.p031ui.view.TransactionsFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class TransactionsContainerFragmentModule_InjectTransactionsFragment {

    /* loaded from: classes.dex */
    public interface TransactionsFragmentSubcomponent extends b<TransactionsFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<TransactionsFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private TransactionsContainerFragmentModule_InjectTransactionsFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(TransactionsFragmentSubcomponent.Factory factory);
}
