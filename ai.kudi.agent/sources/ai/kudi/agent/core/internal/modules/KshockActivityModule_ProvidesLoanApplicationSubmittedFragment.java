package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.kshock.p009ui.views.LoanApplicationSubmittedFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class KshockActivityModule_ProvidesLoanApplicationSubmittedFragment {

    /* loaded from: classes.dex */
    public interface LoanApplicationSubmittedFragmentSubcomponent extends b<LoanApplicationSubmittedFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<LoanApplicationSubmittedFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private KshockActivityModule_ProvidesLoanApplicationSubmittedFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(LoanApplicationSubmittedFragmentSubcomponent.Factory factory);
}
