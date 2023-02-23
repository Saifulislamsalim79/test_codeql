package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.issues.p008ui.SubmitWithdrawalIssueFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class IssueActivityModule_InjectSubmitWithdrawalIssueFragment {

    /* loaded from: classes.dex */
    public interface SubmitWithdrawalIssueFragmentSubcomponent extends b<SubmitWithdrawalIssueFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<SubmitWithdrawalIssueFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private IssueActivityModule_InjectSubmitWithdrawalIssueFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(SubmitWithdrawalIssueFragmentSubcomponent.Factory factory);
}
