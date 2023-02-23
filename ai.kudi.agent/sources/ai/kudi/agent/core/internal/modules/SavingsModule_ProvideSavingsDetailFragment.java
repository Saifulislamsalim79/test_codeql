package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.savings.p024ui.SavingsDetailFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class SavingsModule_ProvideSavingsDetailFragment {

    /* loaded from: classes.dex */
    public interface SavingsDetailFragmentSubcomponent extends b<SavingsDetailFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<SavingsDetailFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private SavingsModule_ProvideSavingsDetailFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(SavingsDetailFragmentSubcomponent.Factory factory);
}
