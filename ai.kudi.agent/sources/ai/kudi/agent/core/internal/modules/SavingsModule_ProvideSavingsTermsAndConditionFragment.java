package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.savings.p024ui.SavingsTermsAndConditionFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class SavingsModule_ProvideSavingsTermsAndConditionFragment {

    /* loaded from: classes.dex */
    public interface SavingsTermsAndConditionFragmentSubcomponent extends b<SavingsTermsAndConditionFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<SavingsTermsAndConditionFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private SavingsModule_ProvideSavingsTermsAndConditionFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(SavingsTermsAndConditionFragmentSubcomponent.Factory factory);
}
