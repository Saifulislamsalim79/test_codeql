package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.withdraw_cash.p040ui.fragments.home.WithdrawCashFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class HomeActivityModule_InjectWithdrawCashFragment {

    /* loaded from: classes.dex */
    public interface WithdrawCashFragmentSubcomponent extends b<WithdrawCashFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<WithdrawCashFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private HomeActivityModule_InjectWithdrawCashFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(WithdrawCashFragmentSubcomponent.Factory factory);
}
