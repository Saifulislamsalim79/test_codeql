package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.issues.p008ui.IssueResolutionHostFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class HomeActivityModule_InjectIssueResolutionHostFragment {

    /* loaded from: classes.dex */
    public interface IssueResolutionHostFragmentSubcomponent extends b<IssueResolutionHostFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<IssueResolutionHostFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private HomeActivityModule_InjectIssueResolutionHostFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(IssueResolutionHostFragmentSubcomponent.Factory factory);
}
