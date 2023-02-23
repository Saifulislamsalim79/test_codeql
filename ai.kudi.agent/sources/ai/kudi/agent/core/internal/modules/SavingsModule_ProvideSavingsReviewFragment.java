package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.savings.p024ui.SavingsReviewFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class SavingsModule_ProvideSavingsReviewFragment {

    /* loaded from: classes.dex */
    public interface SavingsReviewFragmentSubcomponent extends b<SavingsReviewFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<SavingsReviewFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private SavingsModule_ProvideSavingsReviewFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(SavingsReviewFragmentSubcomponent.Factory factory);
}
