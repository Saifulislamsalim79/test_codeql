package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.kshock.p009ui.views.ApplyForLoanReviewFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class KshockActivityModule_ProvidesApplyForLoanReviewFragment {

    /* loaded from: classes.dex */
    public interface ApplyForLoanReviewFragmentSubcomponent extends b<ApplyForLoanReviewFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<ApplyForLoanReviewFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private KshockActivityModule_ProvidesApplyForLoanReviewFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(ApplyForLoanReviewFragmentSubcomponent.Factory factory);
}
