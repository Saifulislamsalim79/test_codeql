package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.issues.p008ui.IssueDetailFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class IssueActivityModule_InjectIssueDetailFragment {

    /* loaded from: classes.dex */
    public interface IssueDetailFragmentSubcomponent extends b<IssueDetailFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<IssueDetailFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private IssueActivityModule_InjectIssueDetailFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(IssueDetailFragmentSubcomponent.Factory factory);
}
