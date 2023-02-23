package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.transactionhistory.p031ui.view.TransactionsContainerFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class HomeActivityModule_InjectTransactionsContainerFragment {

    /* loaded from: classes.dex */
    public interface TransactionsContainerFragmentSubcomponent extends b<TransactionsContainerFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<TransactionsContainerFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private HomeActivityModule_InjectTransactionsContainerFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(TransactionsContainerFragmentSubcomponent.Factory factory);
}
