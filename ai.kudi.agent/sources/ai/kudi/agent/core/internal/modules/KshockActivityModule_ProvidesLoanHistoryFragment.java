package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.kshock.p009ui.views.LoanHistoryFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class KshockActivityModule_ProvidesLoanHistoryFragment {

    /* loaded from: classes.dex */
    public interface LoanHistoryFragmentSubcomponent extends b<LoanHistoryFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<LoanHistoryFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private KshockActivityModule_ProvidesLoanHistoryFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(LoanHistoryFragmentSubcomponent.Factory factory);
}
