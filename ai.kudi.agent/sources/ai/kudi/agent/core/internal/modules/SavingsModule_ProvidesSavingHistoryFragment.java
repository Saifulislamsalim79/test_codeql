package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.savings.p024ui.SavingHistoryFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class SavingsModule_ProvidesSavingHistoryFragment {

    /* loaded from: classes.dex */
    public interface SavingHistoryFragmentSubcomponent extends b<SavingHistoryFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<SavingHistoryFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private SavingsModule_ProvidesSavingHistoryFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(SavingHistoryFragmentSubcomponent.Factory factory);
}
