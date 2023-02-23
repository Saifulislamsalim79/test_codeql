package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.issues.p008ui.IssueResolutionFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class IssueActivityModule_InjectIssueResolutionFragment {

    /* loaded from: classes.dex */
    public interface IssueResolutionFragmentSubcomponent extends b<IssueResolutionFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<IssueResolutionFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private IssueActivityModule_InjectIssueResolutionFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(IssueResolutionFragmentSubcomponent.Factory factory);
}
