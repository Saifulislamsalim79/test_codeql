package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.issues.p008ui.DisputeIssueFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class IssueActivityModule_InjectDisputeIssueFragment {

    /* loaded from: classes.dex */
    public interface DisputeIssueFragmentSubcomponent extends b<DisputeIssueFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<DisputeIssueFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private IssueActivityModule_InjectDisputeIssueFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(DisputeIssueFragmentSubcomponent.Factory factory);
}
