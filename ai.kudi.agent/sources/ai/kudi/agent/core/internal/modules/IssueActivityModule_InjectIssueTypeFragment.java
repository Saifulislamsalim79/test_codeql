package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.issues.p008ui.IssueTypeFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class IssueActivityModule_InjectIssueTypeFragment {

    /* loaded from: classes.dex */
    public interface IssueTypeFragmentSubcomponent extends b<IssueTypeFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<IssueTypeFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private IssueActivityModule_InjectIssueTypeFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(IssueTypeFragmentSubcomponent.Factory factory);
}
