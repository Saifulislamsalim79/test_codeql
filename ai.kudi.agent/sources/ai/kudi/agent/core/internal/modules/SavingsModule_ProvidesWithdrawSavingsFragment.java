package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.savings.p024ui.WithdrawSavingsFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class SavingsModule_ProvidesWithdrawSavingsFragment {

    /* loaded from: classes.dex */
    public interface WithdrawSavingsFragmentSubcomponent extends b<WithdrawSavingsFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<WithdrawSavingsFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private SavingsModule_ProvidesWithdrawSavingsFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(WithdrawSavingsFragmentSubcomponent.Factory factory);
}
