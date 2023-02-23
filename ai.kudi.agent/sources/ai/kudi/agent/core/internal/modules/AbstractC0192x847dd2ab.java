package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.transactionhistory.p031ui.view.IncompleteTransactionsFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* renamed from: ai.kudi.agent.core.internal.modules.TransactionsContainerFragmentModule_InjectIncompleteTransactionsFragment */
/* loaded from: classes.dex */
public abstract class AbstractC0192x847dd2ab {

    /* renamed from: ai.kudi.agent.core.internal.modules.TransactionsContainerFragmentModule_InjectIncompleteTransactionsFragment$IncompleteTransactionsFragmentSubcomponent */
    /* loaded from: classes.dex */
    public interface IncompleteTransactionsFragmentSubcomponent extends b<IncompleteTransactionsFragment> {

        /* renamed from: ai.kudi.agent.core.internal.modules.TransactionsContainerFragmentModule_InjectIncompleteTransactionsFragment$IncompleteTransactionsFragmentSubcomponent$Factory */
        /* loaded from: classes.dex */
        public interface Factory extends b$a<IncompleteTransactionsFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private AbstractC0192x847dd2ab() {
    }

    abstract b$a bindAndroidInjectorFactory(IncompleteTransactionsFragmentSubcomponent.Factory factory);
}
