package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.savings.p024ui.DetailAndTransactionFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class SavingsModule_ProvidesDetailAndTransactionAdapter {

    /* loaded from: classes.dex */
    public interface DetailAndTransactionFragmentSubcomponent extends b<DetailAndTransactionFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<DetailAndTransactionFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private SavingsModule_ProvidesDetailAndTransactionAdapter() {
    }

    abstract b$a bindAndroidInjectorFactory(DetailAndTransactionFragmentSubcomponent.Factory factory);
}
