package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.issues.p008ui.IssueTypeFragmentNew;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class IssueActivityModule_InjectIssueTypeFragmentNew {

    /* loaded from: classes.dex */
    public interface IssueTypeFragmentNewSubcomponent extends b<IssueTypeFragmentNew> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<IssueTypeFragmentNew> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private IssueActivityModule_InjectIssueTypeFragmentNew() {
    }

    abstract b$a bindAndroidInjectorFactory(IssueTypeFragmentNewSubcomponent.Factory factory);
}
