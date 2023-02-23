package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.issues.p008ui.TransactionListFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class IssueActivityModule_InjectTransactionListFragment {

    /* loaded from: classes.dex */
    public interface TransactionListFragmentSubcomponent extends b<TransactionListFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<TransactionListFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private IssueActivityModule_InjectTransactionListFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(TransactionListFragmentSubcomponent.Factory factory);
}
